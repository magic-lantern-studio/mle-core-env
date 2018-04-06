/*
 * AbstractMasteringConfiguration.java
 * Created on May 25, 2005
 */

// COPYRIGHT_BEGIN
//
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
//
// COPYRIGHT_END

// Declare package.
package com.wizzer.mle.codegen;

// Import standard Java classes.
import java.util.HashMap;

/**
 * This class is a partial implementation of the Mastering Configuration interface.
 * 
 * @author Mark S. Millard
 */
public abstract class AbstractMasteringConfiguration implements IMasteringConfiguration
{
    /** The hash map of mastering configuration parameters. */
    protected HashMap m_configuration = new HashMap();
    
    /* (non-Javadoc)
     * @see com.wizzer.mle.studio.codegen.IMasteringConfiguration#getPropertyValue(java.lang.String)
     */
    public Object getPropertyValue(String key)
    {
        return m_configuration.get(key);
    }

    /* (non-Javadoc)
     * @see com.wizzer.mle.studio.codegen.IMasteringConfiguration#setPropertyValue(java.lang.String, java.lang.Object)
     */
    public Object setPropertyValue(String key, Object value)
    {
        return m_configuration.put(key,value);
    }

}
