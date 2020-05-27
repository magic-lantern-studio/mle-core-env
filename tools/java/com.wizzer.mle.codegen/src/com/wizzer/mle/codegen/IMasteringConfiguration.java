/*
 * IMasteringConfiguration.java
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
package com.wizzer.mle.codegen;

/**
 * This interface provides a standard protocol for dealing with specific
 * Magic Lantern mastering configurations.
 * 
 * @author Mark S. Millard
 */
public interface IMasteringConfiguration
{
    /** A qualifier for Magic Lantern mastering configuration properties. */
    public static final String PROPERTY_QUALIFIER = "com.wizzer.mle.studio.mastering";
    /** The key for the name of the Magic Lantern project. */
    public static final String PROJECT_NAME = PROPERTY_QUALIFIER + ".PROJECT_NAME";
    /** The key for the name of the directory for the project source. */
    public static final String PROJECT_SOURCE_DIRECTORY = PROPERTY_QUALIFIER + ".PROJECT_SOURCE_DIRECTORY";
    /** The key for the name of the directory for building the source. */
    public static final String PROJECT_DESTINATION_DIRECTORY = PROPERTY_QUALIFIER + ".PROJECT_DESTINATION_DIRECTORY";
    /** The key for the name of the directory for building the project distribution elements. */
    public static final String PROJECT_BUILD_DIRECTORY = PROPERTY_QUALIFIER + ".PROJECT_BUILD_DIRECTORY";
    /** The key for the verbose flag. */
    public static final String VERBOSE = PROPERTY_QUALIFIER +".VERBOSE";
    /** The key for endianess. */
    public static final String ENDIAN_MODE = PROPERTY_QUALIFIER + ".ENDIAN_MODE";
    /** The key for tag delimeters. */
    public static final String TAGS = PROPERTY_QUALIFIER + ".TAGS";
    /** The key for the name of the Digital Workprint. */
    public static final String DWP = PROPERTY_QUALIFIER + ".DWP";
    /** The key for the name of the Digital Playprint. */
    public static final String DPP = PROPERTY_QUALIFIER + ".DPP";
    
    /** The key for determining whether to use mastering configuration settings. */
    public static final String USE_MASTERING_CONFIGURATION = PROPERTY_QUALIFIER +".USE_MASTERING_CONFIGURATION";

    /** The key for the name of the gengroup actor id file. */
    public static final String GENGROUP_ACTORID = PROPERTY_QUALIFIER + ".GENGROUP.ACTORID";
    /** The key for the name of the gengroup group id file. */
    public static final String GENGROUP_GROUPID = PROPERTY_QUALIFIER + ".GENGROUP.GROUPID";
    /** The key for the gengroup fixed-point arithmetic. */
    public static final String GENGROUP_FIXED_POINT = PROPERTY_QUALIFIER + ".GENGROUP.FIXED_POINT";
    
    /** The key for the name of the genscene scene id file. */
    public static final String GENSCENE_SCENEID = PROPERTY_QUALIFIER + ".GENSCENE.SCENEID";
    /** The key for the genscene fixed-point arithmetic. */
    public static final String GENSCENE_FIXED_POINT = PROPERTY_QUALIFIER + ".GENSCENE.FIXED_POINT";
    
    /** The key for the name of the genmedia media inventory. */
    public static final String GENMEDIA_INVENTORY = PROPERTY_QUALIFIER + ".GENMEDIA.BOM";
    
    /** The key for the name of the genppscript TCL script. */
    public static final String GENPPSCRIPT_SCRIPT = PROPERTY_QUALIFIER + ".GENPPSCRIPT.SCRIPT";
    /** The key for the name of the genppscript Table-of-contents. */
    public static final String GENPPSCRIPT_TOC = PROPERTY_QUALIFIER + ".GENPPSCRIPT.TOC";
    
    /** The key for the name of the gendpp TCL script. */
    public static final String GENDPP_SCRIPT = PROPERTY_QUALIFIER + ".GENDPP.SCRIPT";
    /** The key for the name of the gendpp source directory. */
    public static final String GENDPP_SRC_DIR = PROPERTY_QUALIFIER + ".GENDPP.SRC_DIR";
    
    /** The key for the name of the gentables tables file. */
    public static final String GENTABLES_TABLES = PROPERTY_QUALIFIER + ".GENTABLES.TABLES";
    
    /** The key for the name of the parts lib directory. */
    public static final String MAKEFILE_PARTS_LIB = PROPERTY_QUALIFIER + ".MAKEFILE.PARTS.LIB";
    
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
