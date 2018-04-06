/*
 * AntBuildTemplateTest.java
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
 * This class is a test for the class <code>com.wizzer.mle.codegen.AntBuildTemplate</code>.
 * 
 * @author Mark S. Millard
 */
public class AntBuildTemplateTest extends TestCase
{
    // The template to test.
    private AntBuildTemplate m_template = null;
    
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
            setPropertyValue(IMasteringConfiguration.PROJECT_SOURCE_DIRECTORY,new String("src"));
            setPropertyValue(IMasteringConfiguration.PROJECT_DESTINATION_DIRECTORY,new String("bin"));
            setPropertyValue(IMasteringConfiguration.PROJECT_BUILD_DIRECTORY,new String("build"));
        }
    }
    
    public static void main(String[] args)
    {
        junit.textui.TestRunner.run(AntBuildTemplateTest.class);
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
            m_template = new AntBuildTemplate();
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
