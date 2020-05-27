/*
 * LeafdefsTemplateTest.java
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

// Import JUnit classes.
import junit.framework.TestCase;

/**
 * This class is a test for the class <code>com.wizzer.mle.codegen.LeafdefsTemplate</code>.
 * 
 * @author Mark S. Millard
 */
public class LeafdefsTemplateTest extends TestCase
{
    // The template to test.
    private LeafdefsTemplate m_template = null;
    
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
            setPropertyValue(IMasteringConfiguration.USE_MASTERING_CONFIGURATION,new Boolean(true));
        }
    }
    
    public static void main(String[] args)
    {
        junit.textui.TestRunner.run(LeafdefsTemplateTest.class);
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
            m_template = new LeafdefsTemplate();
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
