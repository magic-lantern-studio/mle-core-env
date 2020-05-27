/*
 * IDwpConfiguration.java
 * Created on May 22, 2006
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
