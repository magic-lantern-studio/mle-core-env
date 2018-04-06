/*
 * GenDppTask.java
 * Created on May 25, 2005
 */

// COPYRIGHT_BEGIN
//  Copyright (C) 2000-2007  Wizzer Works
//
//  Wizzer Works makes available all content in this file ("Content").
//  Unless otherwise indicated below, the Content is provided to you
//  under the terms and conditions of the Common Public License Version 1.0
//  ("CPL"). A copy of the CPL is available at
//
//      http://opensource.org/licenses/cpl1.0.php
//
//  For purposes of the CPL, "Program" will mean the Content.
//
//  For information concerning this Makefile, contact Mark S. Millard,
//  of Wizzer Works at msm@wizzerworks.com.
//
//  More information concerning Wizzer Works may be found at
//
//      http://www.wizzerworks.com
// COPYRIGHT_END

// Declare package.
package com.wizzer.mle.codegen.tasks;

// Import standard Java classes.
import java.io.File;
import java.io.IOException;
import java.util.Vector;

// Import Ant classes.
import org.apache.tools.ant.Task;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.types.Commandline;
import org.apache.tools.ant.taskdefs.Execute;
import org.apache.tools.ant.taskdefs.LogStreamHandler;


/**
 * This class implements an Ant Task for invoking the Magic Lantern
 * <i>gendpp</i> program.
 * 
 * @author Mark S. Millard
 */
public class GenDppTask extends Task
{
    // Big Endian generation mode.
    private static final int BIG_ENDIAN = 0x00;
    // Little Endian generation mode.
    private static final int LITTLE_ENDIAN = 0x01;
    // Generate C++ code.
    private static final int GENERATE_CPP = 0x00;
    // Generate Java code.
    private static final int GENERATE_JAVA = 0x01;
    // The default package name for java code generation.
    private static final String DEFAULT_PACKAGE = "gen";
    
    // The endianess of the generated playprint.
    private int m_endianMode = BIG_ENDIAN;
    // The type of code to generate for accessing the Actor Group chunks.
    private int m_codeType = GENERATE_CPP;
    // The package name.
    private String m_javaPackage = DEFAULT_PACKAGE;
    // The destination directory.
    private File m_destinationDir = null;
    // The input directory for resources.
    private File m_resourceDir = null;
    // Flag indicating whether to be verbose.
    private boolean m_verbose = false;
    // Tag discriminators.
    private Vector m_tags = new Vector();
    // The Digital Workprint.
    private MleToolWorkprint m_workprint = null;
    // The Digital Playprint TCL layout script.
    private MleToolDppScript m_script = null;
   
    /**
     * The default constructor.
     * <p>
     * The Magic Lantern <b>gendpp</b> task will be initalized to to use the
     * following options:
     * <ul>
     * <li>Use Big Endian byte ordering (<b>-b</b> option)</li>
     * <li>Generated C++ compatible code (<b>-c</b> option</li>
     * </ul>
     * </p>
     */
    public GenDppTask()
    {
        super();
    }
    
    /**
     * Execute the task.
     */
    public void execute()
    {
        Commandline cmdline = new Commandline();
        cmdline.setExecutable("gendpp");
        StringBuffer commandline = new StringBuffer("gendpp");
        
        if (m_endianMode == BIG_ENDIAN)
        {
            cmdline.createArgument().setValue("-b");
            commandline.append(" -b");
        } else
        {
            cmdline.createArgument().setValue("-l");
            commandline.append(" -l");
        }

        if (m_codeType == GENERATE_CPP)
        {
            cmdline.createArgument().setValue("-c");
            commandline.append(" -c");
        } else
        {
            cmdline.createArgument().setValue("-j");
            commandline.append(" -j");
        }
        
        if (m_codeType == GENERATE_JAVA)
        {
            cmdline.createArgument().setValue(m_javaPackage);
            commandline.append(" " + m_javaPackage);
        }
        
        if (m_verbose)
        {
            cmdline.createArgument().setValue("-v");
            commandline.append(" -v");
        }
        
        if (m_destinationDir != null)
        {
            if (m_destinationDir.isDirectory())
                try
                {
                    cmdline.createArgument().setValue("-d");
                    cmdline.createArgument().setValue(m_destinationDir.getCanonicalPath());
                    commandline.append(" -d " + m_destinationDir.getCanonicalPath());
                } catch (IOException ex)
                {
                    throw new BuildException(m_destinationDir + " is not a valid directory.");
                }
            else
                throw new BuildException(m_destinationDir + " is not a valid directory.");
        }

        if (m_resourceDir != null)
        {
            if (m_resourceDir.isDirectory())
                try
                {
                    cmdline.createArgument().setValue("-s");
                    cmdline.createArgument().setValue(m_resourceDir.getCanonicalPath());
                    commandline.append(" -s " + m_resourceDir.getCanonicalPath());
                } catch (IOException ex)
                {
                    throw new BuildException(m_resourceDir + " is not a valid directory.");
                }
            else
                throw new BuildException(m_resourceDir + " is not a valid directory.");
        }

        for (int i = 0; i < m_tags.size(); i++)
        {
            cmdline.createArgument().setValue(((MleToolTag)m_tags.elementAt(i)).m_value);
            commandline.append(" " + ((MleToolTag)m_tags.elementAt(i)).m_value);
        }
        
        if (m_workprint == null)
            throw new BuildException("Digital Workprint not specified.");
        else if (new File(m_workprint.m_value).exists())
        {
            cmdline.createArgument().setValue(m_workprint.m_value);
            commandline.append(" " + m_workprint.m_value);
        } else
            throw new BuildException("Digital Workprint " + m_workprint.m_value +
                " does not exist.");
        
        if (m_script == null)
            throw new BuildException("Digital Playprint TCL layout script not specified.");
        else if (new File(m_script.m_value).exists())
        {
            cmdline.createArgument().setValue(m_script.m_value);
            commandline.append(" " + m_script.m_value);
        } else
            throw new BuildException("Digital Workprint TCL layout script " + m_script.m_value +
                " does not exist.");
        
        LogStreamHandler streamHandler =
            new LogStreamHandler(this, Project.MSG_INFO, Project.MSG_WARN);
        
        this.log("Executing the gengroup Ant Task: " + commandline.toString());
        
        Execute runner = new Execute(streamHandler, null);
        runner.setAntRun(getProject());
        runner.setCommandline(cmdline.getCommandline());
        
        try
        {
            runner.execute();
        } catch (IOException ex)
        {
            this.log(ex.getMessage(), Project.MSG_DEBUG);
        }
    }
    
    /**
     * Set the <i>byteorder</i> attribute.
     * 
     * @param value The attribute value. Valid values are <b>big</b>
     * and <b>little</b>.
     */
    public void setByteorder(String value)
    {
        if (value.equals("big"))
            m_endianMode = BIG_ENDIAN;
        else if (value.equals("little"))
            m_endianMode = LITTLE_ENDIAN;
    }
    
    /**
     * Set the <i>code</i> attribute.
     * 
     * @param value The attribute value. Valid values are <b>c++</b>
     * and <b>java</b>.
     */
    public void setCode(String value)
    {
        if (value.equals("java"))
            m_codeType = GENERATE_JAVA;
        else if (value.equals("c++"))
            m_codeType = GENERATE_CPP;
    }
    
    /**
     * Set the <i>package</i> attribute.
     * 
     * @param value The attribute value.
     */
    public void setPackage(String value)
    {
        m_javaPackage = value;
    }

    /**
     * Set the <i>destdir</i> attribute.
     * 
     * @param value The attribute value.
     */
    public void setDestdir(File value)
    {
        m_destinationDir = value;
    }

    /**
     * Set the <i>srcdir</i> attribute.
     * 
     * @param value The attribute value.
     */
    public void setSrcdir(File value)
    {
        m_resourceDir = value;
    }
    
    /**
     * Set the <i>verbose</i> attribute.
     * 
     * @param value The attribute value.
     */
    public void setVerbose(boolean value)
    {
        m_verbose = value;
    }
    
    /**
     * Add the <i>tag</i> nested element.
     * 
     * @param tag The collection of tag discriminators.
     */
    public void addTag(MleToolTag tag)
    {
        m_tags.add(tag);
    }

    /**
     * Set the <i>workprint</i> attribute.
     * 
     * @param dwp The attribute value.
     */
    public void addWorkprint(MleToolWorkprint dwp)
    {
        m_workprint = dwp;
    }

    /**
     * Set the <i>script</i> attribute.
     * 
     * @param script The attribute value.
     */
    public void addScript(MleToolDppScript script)
    {
        m_script = script;
    }

}
