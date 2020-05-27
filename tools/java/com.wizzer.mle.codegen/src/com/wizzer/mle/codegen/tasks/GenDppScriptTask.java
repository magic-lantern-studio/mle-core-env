/*
 * GenDppScriptTask.java
 * Created on May 25, 2005
 */

// COPYRIGHT_BEGIN
//
// The MIT License (MIT)
//
// Copyright (c) 2000-2020 Wizzer Works
//
// Permission is hereby granted, free of charge, to any person obtaining a copy
// of this software and associated documentation files (the "Software"), to deal
// in the Software without restriction, including without limitation the rights
// to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
// copies of the Software, and to permit persons to whom the Software is
// furnished to do so, subject to the following conditions:
//
// The above copyright notice and this permission notice shall be included in all
// copies or substantial portions of the Software.
//
// THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
// IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
// FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
// AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
// LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
// OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
// SOFTWARE.
//
//  For information concerning this header file, contact Mark S. Millard,
//  of Wizzer Works at msm@wizzerworks.com.
//
//  More information concerning Wizzer Works may be found at
//
//      http://www.wizzerworks.com
//
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
 * <i>genppscript</i> program.
 * 
 * @author Mark S. Millard
 */
public class GenDppScriptTask extends Task
{    
    // The destination directory.
    private File m_destinationDir = null;
    // Flag indicating whether to be verbose.
    private boolean m_verbose = false;
    // Tag discriminators.
    private Vector m_tags = new Vector();
    // The Digital Workprint.
    private MleToolWorkprint m_workprint = null;
    // The Digital Playprint.
    private MleToolPlayprint m_playprint = null;
    // The DPP TCL script.
    private MleToolDppScript m_script = null;
    // The Chunk Index filename.
    private MleToolChunkIndex m_chunkindex = null;
    
    /**
     * The default constructor.
     */
    public GenDppScriptTask()
    {
        super();
    }
    
    /**
     * Execute the task.
     */
    public void execute()
    {
        Commandline cmdline = new Commandline();
        cmdline.setExecutable("genppscript");
        StringBuffer commandline = new StringBuffer("genppscript");
        
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
        
        if (m_playprint == null)
            throw new BuildException("Digital Playprint not specified.");
        else
        {
            cmdline.createArgument().setValue(m_playprint.m_value);
            commandline.append(" " + m_playprint.m_value);
        }

        if (m_script == null)
            throw new BuildException("Digital Playprint TCL script not specified.");
        else
        {
            cmdline.createArgument().setValue(m_script.m_value);
            commandline.append(" " + m_script.m_value);
        }

        if (m_chunkindex == null)
            throw new BuildException("Chunk Index file not specified.");
        else
        {
            cmdline.createArgument().setValue(m_chunkindex.m_value);
            commandline.append(" " + m_chunkindex.m_value);
        }

        LogStreamHandler streamHandler =
            new LogStreamHandler(this, Project.MSG_INFO, Project.MSG_WARN);
        
        this.log("Executing the gentables Ant Task: " + commandline.toString());
        
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
     * Set the <i>playprint</i> attribute.
     * 
     * @param dpp The attribute value.
     */
    public void addPlayprint(MleToolPlayprint dpp)
    {
        m_playprint = dpp;
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

    /**
     * Set the <i>chunkindex</i> attribute.
     * 
     * @param indx The attribute value.
     */
    public void addChunkindex(MleToolChunkIndex index)
    {
        m_chunkindex = index;
    }

}
