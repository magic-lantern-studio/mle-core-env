/*
 * MleToolSceneID.java
 * Created on May 26, 2005
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

/**
 * This class implements the <i>sceneID</i> element that is used by the
 * Magic Lantern Ant Tasks.
 * 
 * @author Mark S. Millard
 */
public class MleToolSceneID
{
    // The Scene ID filename value.
    public String m_value = null;
    
    /**
     * The default constructor.
     */
    public MleToolSceneID()
    {
        super();
    }

    /**
     * Set the <i>value</i> attribute.
     * 
     * @param value The attribute value which is the name of the
     * Scene ID file.
     */
    public void setValue(String value)
    {
        m_value = value;
    }
}
