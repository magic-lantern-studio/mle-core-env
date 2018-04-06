/*
 * IMasteringConfiguration.java
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
