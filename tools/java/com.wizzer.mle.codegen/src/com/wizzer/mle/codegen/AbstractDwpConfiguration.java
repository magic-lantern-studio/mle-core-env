/*
 * AbstractDwpConfiguration.java
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

// Import standard Java classes.
import java.util.HashMap;

/**
 * This class is a partial implementation of the DWP Configuration interface.
 * 
 * @author Mark S. Millard
 */
public class AbstractDwpConfiguration implements IDwpConfiguration
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
