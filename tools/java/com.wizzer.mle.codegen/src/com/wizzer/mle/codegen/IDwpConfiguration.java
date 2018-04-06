/*
 * IDwpConfiguration.java
 * Created on May 22, 2006
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

/**
 * This interface provides a standard protocol for dealing with specific
 * Magic Lantern Digital Workprint configurations.
 * 
 * @author Mark S. Millard
 */
public interface IDwpConfiguration
{
    /** A qualifier for Magic Lantern mastering configuration properties. */
    public static final String PROPERTY_QUALIFIER = "com.wizzer.mle.studio.dwp";
    /** The key for the name of the Magic Lantern project. */
    public static final String PROJECT_NAME = PROPERTY_QUALIFIER + ".PROJECT_NAME";
    /** The key for including the Rehearsal Player. */
    public static final String INCLUDE_REHEARSAL_PLAYER = PROPERTY_QUALIFIER + ".INCLUDE_REHEARSAL_PLAYER";

    /**
     * Get the property value associated with the specified <i>key</i>.
     * 
     * @param key The property key.
     * 
     * @return The property value is returned as an <code>Object</code>.
     * <b>null</b> will be returned if the specified key does not match a
     * configuration parameter.
     */
    public Object getPropertyValue(String key);
    
    /**
     * Set the property value for the specified <i>key</i>.
     * 
     * @param key The property key.
     * @param value The property value;
     * 
     * @return The previous value is returned. If there is no previous value,
     * then <b>null</b> will be returned.
     */
    public Object setPropertyValue(String key, Object value);
}
