/**
 * @file MleMasteringConfiguration.java
 * Created on Feb. 2, 2004
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

// Import standard Java packages.
import java.text.MessageFormat;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 * This class is used to manage Magic Lantern Mastering Configurations
 * as a resource bundle.
 * 
 * @author Mark S. Millard
 */
public class MleMasteringConfiguration
{
    // The name of the resource bundle.
	private static final String RESOURCE_BUNDLE = MleMasteringConfiguration.class.getName();
	// The resource bundle.
	private static ResourceBundle g_resourceBundle = ResourceBundle.getBundle(RESOURCE_BUNDLE);

	// Hide the default constructor.
	private MleMasteringConfiguration()
	{
		// Do nothing for now.
	}

	/**
	 * Get the value of the specified key from the message resource bundle.
	 * 
	 * @param key The key identifying which resource to retrieve.
	 * 
	 * @return The value of the resource is returned as a <code>String</code>.
	 * If the resource is missing, a bogus string is returned identifying
	 * which key is the offender.
	 */
	public static String getString(String key)
	{
		try {
			return g_resourceBundle.getString(key);
		} catch (MissingResourceException e) {
			System.out.println("Missing Resource: " + key);
			return '!' + key + '!';
		}
	}
	
	/**
	 * Gets a string from the resource bundle and formats it with the argument.
	 * 
	 * @param key The string used to get the bundle value, must not be <b>null</b>.
	 */
	public static String getFormattedString(String key, Object arg)
	{
		return MessageFormat.format(getString(key), new Object[] { arg });
	}


	/**
	 * Gets a string from the resource bundle and formats it with arguments.
	 */	
	public static String getFormattedString(String key, Object[] args)
	{
		return MessageFormat.format(getString(key), args);
	}

}
