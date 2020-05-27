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

package com.wizzer.mle.codegen;

import com.wizzer.mle.codegen.*;

public class LeafdefsTemplate
{
  protected static String nl;
  public static synchronized LeafdefsTemplate create(String lineSeparator)
  {
    nl = lineSeparator;
    LeafdefsTemplate result = new LeafdefsTemplate();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String COPYRIGHT = "##########################################################################" + NL + "# -*- Makefile -*-" + NL + "#" + NL + "# The MIT License (MIT)" + NL + "#" + NL + "# Copyright (c) 2000-2020 Wizzer Works" + NL + "#" + NL + "# Permission is hereby granted, free of charge, to any person obtaining a copy" + NL + "# of this software and associated documentation files (the \"Software\"), to deal" + NL + "# in the Software without restriction, including without limitation the rights" + NL + "# to use, copy, modify, merge, publish, distribute, sublicense, and/or sell" + NL + "# copies of the Software, and to permit persons to whom the Software is" + NL + "# furnished to do so, subject to the following conditions:" +  NL + "#" + NL + "# The above copyright notice and this permission notice shall be included in all" + NL + "# copies or substantial portions of the Software." + NL + "#" + NL + "# THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR" + NL + "# IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY," + NL + "# FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE" + NL + "# AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER" + NL + "# LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM," + NL + "# OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE" + NL + "# SOFTWARE." + NL + "#" + NL + "#  For information concerning this header file, contact Mark S. Millard," + NL + "#  of Wizzer Works at msm@wizzerworks.com." + NL + "#" + NL + "#  More information concerning Wizzer Works may be found at" + NL + "#" + NL + "#      http://www.wizzerworks.com" + NL + "#" + NL + "##########################################################################" + NL;
  protected final String TEXT_1 = "" + NL + "ISM_DEPTH = $(LEAF_DEPTH)/.." + NL + "include $(ISM_DEPTH)/ismdefs" + NL + "" + NL + "#" + NL + "# VPATH points to where the code actually is." + NL + "#";
  protected final String TEXT_2 = NL + "VPATH = $(LEAF_DEPTH):$(LEAF_DEPTH)/";
  protected final String TEXT_3 = NL + "VPATH = $(LEAF_DEPTH)";
  protected final String TEXT_4 = NL + NL + "TARGETS = ";
  protected final String TEXT_5 = ".exe" + NL + "" + NL + "LCXXINCS = \\" + NL + "\t-I$(LEAF_DEPTH) \\";
  protected final String TEXT_6 = NL + "\t-I$(LEAF_DEPTH)/";
  protected final String TEXT_7 = " \\";
  protected final String TEXT_8 = NL + "\t-I$(MLE_ROOT)/include \\" + NL + "\t-I$(BRENDER_ROOT)/INC \\" + NL + "\t$(NULL)" + NL + "" + NL + "CXXFILES = \\" + NL + "\tmain.cxx \\" + NL + "\tcallback.cxx \\" + NL + "\ttitle.cxx \\" + NL + "\ttexture.cxx \\";
  protected final String TEXT_9 = NL + "\t";
  protected final String TEXT_10 = ".cxx \\" + NL + "\tmltables.cxx \\";
  protected final String TEXT_11 = NL + "\t$(NULL)" + NL + "" + NL + "RCFILES = \\" + NL + "\tapp.rc \\" + NL + "\t$(NULL)" + NL + "" + NL + "#" + NL + "# To use manual precompilation uncomment these two macros" + NL + "# and specify the name for the precompiled header (PCH_MANUAL_TARGET)" + NL + "# and the basename of the .h and .cxx files where precompilation is" + NL + "# to take place." + NL + "#" + NL + "#PCH_MANUAL_TARGET = ";
  protected final String TEXT_12 = ".pch" + NL + "#PCH_MANUAL_BASENAME = ";
  protected final String TEXT_13 = NL + NL + "all: $(TARGETS)" + NL + "" + NL + "#" + NL + "# Add $(RCOBJECTS) after each $(OBJECTS) if resource files (*.res) are" + NL + "# to be linked into the target." + NL + "#" + NL + "$(TARGETS): $(OBJECTS) $(RCOBJECTS)" + NL + "\t$(CC) -o $@ $(OBJECTS) $(RCOBJECTS) $(LDFLAGS)" + NL + "\t$(BSCF) $(SBRFILES)" + NL + "" + NL + "#" + NL + "# 'collect' is the rule that tells where the installation package" + NL + "# should put stuff.  CUR_COLLECTLOG is the collection file in the" + NL + "# directory of the current version (e.g. debug or release)." + NL + "#" + NL + "# *NOTE: the \"-srcDir .\" flag is not necessary!  It is just here in" + NL + "#        the example for completeness" + NL + "#" + NL + "collect: all" + NL + "\t$(IBCOLLECT) -log $(CUR_COLLECTLOG) -tags \"CMD\" \\" + NL + "\t\t-srcDir . \\" + NL + "\t\t-destDir bin \\" + NL + "\t\t$(TARGETS)" + NL + "" + NL + "include $(ISMRULES)";
  protected final String TEXT_14 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    IMasteringConfiguration config = (IMasteringConfiguration)argument;
    String projectName = (String)config.getPropertyValue(IMasteringConfiguration.PROJECT_NAME);
    String projectDestination = (String)config.getPropertyValue(IMasteringConfiguration.PROJECT_DESTINATION_DIRECTORY);
    String projectSource = (String)config.getPropertyValue(IMasteringConfiguration.PROJECT_SOURCE_DIRECTORY);
    Boolean isVerbose = (Boolean)config.getPropertyValue(IMasteringConfiguration.VERBOSE);
    Boolean isBigEndian = (Boolean)config.getPropertyValue(IMasteringConfiguration.ENDIAN_MODE);
    String tags = (String)config.getPropertyValue(IMasteringConfiguration.TAGS);
    String workprint = (String)config.getPropertyValue(IMasteringConfiguration.DWP);
    String playprint = (String)config.getPropertyValue(IMasteringConfiguration.DPP);
    String actorid = (String)config.getPropertyValue(IMasteringConfiguration.GENGROUP_ACTORID);
    String groupid = (String)config.getPropertyValue(IMasteringConfiguration.GENGROUP_GROUPID);
    Boolean isGroupFixedPoint = (Boolean)config.getPropertyValue(IMasteringConfiguration.GENGROUP_FIXED_POINT);
    String sceneid = (String)config.getPropertyValue(IMasteringConfiguration.GENSCENE_SCENEID);
    Boolean isSceneFixedPoint = (Boolean)config.getPropertyValue(IMasteringConfiguration.GENSCENE_FIXED_POINT);
    String bom = (String)config.getPropertyValue(IMasteringConfiguration.GENMEDIA_INVENTORY);
    String script = (String)config.getPropertyValue(IMasteringConfiguration.GENPPSCRIPT_SCRIPT);
    String toc = (String)config.getPropertyValue(IMasteringConfiguration.GENPPSCRIPT_TOC);
    Boolean useMasteringConfig = (Boolean)config.getPropertyValue(IMasteringConfiguration.USE_MASTERING_CONFIGURATION);
    stringBuffer.append(COPYRIGHT);
    stringBuffer.append(TEXT_1);
    if (useMasteringConfig.booleanValue()) {
    stringBuffer.append(TEXT_2);
    stringBuffer.append(projectDestination);
    } else {
    stringBuffer.append(TEXT_3);
    }
    stringBuffer.append(TEXT_4);
    stringBuffer.append(projectName);
    stringBuffer.append(TEXT_5);
    if (useMasteringConfig.booleanValue()) {
    stringBuffer.append(TEXT_6);
    stringBuffer.append(projectDestination);
    stringBuffer.append(TEXT_7);
    }
    stringBuffer.append(TEXT_8);
    if (useMasteringConfig.booleanValue()) {
    stringBuffer.append(TEXT_9);
    stringBuffer.append(toc);
    stringBuffer.append(TEXT_10);
    }
    stringBuffer.append(TEXT_11);
    stringBuffer.append(projectName);
    stringBuffer.append(TEXT_12);
    stringBuffer.append(projectName);
    stringBuffer.append(TEXT_13);
    stringBuffer.append(TEXT_14);
    return stringBuffer.toString();
  }
}
