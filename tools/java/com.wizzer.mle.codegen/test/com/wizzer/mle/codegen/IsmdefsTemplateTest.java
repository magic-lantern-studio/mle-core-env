/*
 * IsmdefsTemplateTest.java
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
package com.wizzer.mle.codegen;

// Import JUnit classes.
import junit.framework.TestCase;

/**
 * This class is a test for the class <code>com.wizzer.mle.codegen.IsmdefsTemplate</code>.
 * 
 * @author Mark S. Millard
 */
public class IsmdefsTemplateTest extends TestCase
{
    // The template to test.
    private IsmdefsTemplate m_template = null;
    
    /**
     * This class is a helper class for testing the JET generated template
     * for generating an Ant build.xml file.
     */
    class MyMasteringConfiguration extends AbstractMasteringConfiguration
    {
        /**
         * The default constructor.
         */
        public MyMasteringConfiguration()
        {
            super();
            init();
        }
        
        /**
         * Initialize the configuration.
         */
        public void init()
        {
            setPropertyValue(IMasteringConfiguration.PROJECT_NAME,new String("TestProject"));
            setPropertyValue(IMasteringConfiguration.PROJECT_SOURCE_DIRECTORY,new String("gen"));
            setPropertyValue(IMasteringConfiguration.PROJECT_DESTINATION_DIRECTORY,new String("gen"));
            setPropertyValue(IMasteringConfiguration.PROJECT_BUILD_DIRECTORY,new String("build"));
            setPropertyValue(IMasteringConfiguration.VERBOSE,new Boolean(true));
            setPropertyValue(IMasteringConfiguration.ENDIAN_MODE,new Boolean(false));
            setPropertyValue(IMasteringConfiguration.TAGS,new String("rehearsal"));
            setPropertyValue(IMasteringConfiguration.DWP,new String("TestProject.dwp"));
            setPropertyValue(IMasteringConfiguration.DPP,new String("TestProject.dpp"));
            setPropertyValue(IMasteringConfiguration.GENGROUP_ACTORID,new String("actorid.h"));
            setPropertyValue(IMasteringConfiguration.GENGROUP_GROUPID,new String("groupid.h"));
            setPropertyValue(IMasteringConfiguration.GENGROUP_FIXED_POINT,new Boolean(false));
            setPropertyValue(IMasteringConfiguration.GENSCENE_SCENEID,new String("sceneid.h"));
            setPropertyValue(IMasteringConfiguration.GENSCENE_FIXED_POINT,new Boolean(false));
            setPropertyValue(IMasteringConfiguration.GENMEDIA_INVENTORY,new String("bom.txt"));
            setPropertyValue(IMasteringConfiguration.GENPPSCRIPT_SCRIPT,new String("TestProject.tcl"));
            setPropertyValue(IMasteringConfiguration.GENPPSCRIPT_TOC,new String("DppTOC"));
        }
    }
    
    public static void main(String[] args)
    {
        junit.textui.TestRunner.run(IsmdefsTemplateTest.class);
    }

    /*
     * Set up the test case.
     * 
     * @see TestCase#setUp()
     */
    protected void setUp() throws Exception
    {
        super.setUp();
        if (m_template == null)
        {
            m_template = new IsmdefsTemplate();
        }
    }

    /*
     * Tear down the test case.
     * 
     * @see TestCase#tearDown()
     */
    protected void tearDown() throws Exception
    {
        super.tearDown();
    }

    /**
     * Test the generate() method.
     */
    public void testGenerate()
    {
        MyMasteringConfiguration config = new MyMasteringConfiguration();
        String result = m_template.generate(config);
        System.out.println(result);
        
        TestCase.assertNotNull(result);
        TestCase.assertTrue(result.length() > 0);
    }

}
