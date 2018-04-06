/*
 * GenMediaTask.java
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
 * <i>genmedia</i> program.
 * 
 * @author Mark S. Millard
 */
public class GenMediaTask extends Task
{
    // Big Endian generation mode.
    private static final int BIG_ENDIAN = 0x00;
    // Little Endian generation mode.
    private static final int LITTLE_ENDIAN = 0x01;
    
    // The endianess of the generated Actor Group chunks.
    private int m_endianMode = BIG_ENDIAN;
    // The destination directory.
    private File m_destinationDir = null;
    // Flag indicating whether to be verbose.
    private boolean m_verbose = false;
    // Tag discriminators.
    private Vector m_tags = new Vector();
    // The Digital Workprint.
    private MleToolWorkprint m_workprint = null;
    // The Media BOM filename.
    private MleToolMediaBOM m_mediaBomFilename = null;
    
    /**
     * The default constructor.
     * <p>
     * The Magic Lantern <b>genmedia</b> task will be initalized to to use the
     * following options:
     * <ul>
     * <li>Use Big Endian byte ordering (<b>-b</b> option)</li>
     * </ul>
     * </p>
     */
    public GenMediaTask()
    {
        super();
    }
    
    /**
     * Execute the task.
     */
    public void execute()
    {
        Commandline cmdline = new Commandline();
        cmdline.setExecutable("genmedia");
        StringBuffer commandline = new StringBuffer("genmedia");
        
        if (m_endianMode == BIG_ENDIAN)
        {
            cmdline.createArgument().setValue("-b");
            commandline.append(" -b");
        } else
        {
            cmdline.createArgument().setValue("-l");
            commandline.append(" -l");
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
        
        if (m_mediaBomFilename == null)
            throw new BuildException("Media BOM Filename not specified.");
        else
        {
            cmdline.createArgument().setValue(m_mediaBomFilename.m_value);
            commandline.append(" " + m_mediaBomFilename.m_value);
        }
        
        LogStreamHandler streamHandler =
            new LogStreamHandler(this, Project.MSG_INFO, Project.MSG_WARN);
        
        this.log("Executing the genmedia Ant Task: " + commandline.toString());
        
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
     * Set the <i>destdir</i> attribute.
     * 
     * @param value The attribute value.
     */
    public void setDestdir(File value)
    {
        m_destinationDir = value;
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
     * Set the <i>mediabom</i> attribute.
     * 
     * @param bom The attribute value.
     */
    public void addMediaBOM(MleToolMediaBOM bom)
    {
        m_mediaBomFilename = bom;
    }

}
