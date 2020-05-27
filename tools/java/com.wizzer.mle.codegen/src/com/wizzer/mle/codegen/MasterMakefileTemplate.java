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

public class MasterMakefileTemplate
{
  protected static String nl;
  public static synchronized MasterMakefileTemplate create(String lineSeparator)
  {
    nl = lineSeparator;
    MasterMakefileTemplate result = new MasterMakefileTemplate();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "##########################################################################" + NL + "# -*- Makefile -*-" + NL + "#" + NL + "#  Copyright (C) 2000-2007  Wizzer Works" + NL + "#" + NL + "#  Wizzer Works makes available all content in this file (\"Content\")." + NL + "#  Unless otherwise indicated below, the Content is provided to you" + NL + "#  under the terms and conditions of the Common Public License Version 1.0" + NL + "#  (\"CPL\"). A copy of the CPL is available at" + NL + "#" + NL + "#      http://opensource.org/licenses/cpl1.0.php" + NL + "#" + NL + "#  For purposes of the CPL, \"Program\" will mean the Content." + NL + "#" + NL + "#  For information concerning this Makefile, contact Mark S. Millard," + NL + "#  of Wizzer Works at msm@wizzerworks.com." + NL + "#" + NL + "##########################################################################" + NL + "" + NL + "ISM_DEPTH = ../.." + NL + "include $(ISM_DEPTH)/ismdefs" + NL + "" + NL + "all $(COMMONTARGS):" + NL + "" + NL + "gengroup: $(ISM_DEPTH)/workprints/";
  protected final String TEXT_2 = NL + "\tcd `pwd`/$(ISM_DEPTH); gengroup -c";
  protected final String TEXT_3 = " ";
  protected final String TEXT_4 = " ";
  protected final String TEXT_5 = " workprints/";
  protected final String TEXT_6 = " ";
  protected final String TEXT_7 = " ";
  protected final String TEXT_8 = NL + NL + "genscene: $(ISM_DEPTH)/workprints/";
  protected final String TEXT_9 = NL + "\tcd `pwd`/$(ISM_DEPTH); genscene -c";
  protected final String TEXT_10 = " ";
  protected final String TEXT_11 = " ";
  protected final String TEXT_12 = " workprints/";
  protected final String TEXT_13 = " ";
  protected final String TEXT_14 = NL + NL + "genmedia: $(ISM_DEPTH)/workprints/";
  protected final String TEXT_15 = NL + "\tcd `pwd`/$(ISM_DEPTH); genmedia";
  protected final String TEXT_16 = " ";
  protected final String TEXT_17 = " ";
  protected final String TEXT_18 = " workprints/";
  protected final String TEXT_19 = " ";
  protected final String TEXT_20 = NL + NL + "gentables: $(ISM_DEPTH)/workprints/";
  protected final String TEXT_21 = NL + "\tcd `pwd`/$(ISM_DEPTH); gentables -c";
  protected final String TEXT_22 = " ";
  protected final String TEXT_23 = " ";
  protected final String TEXT_24 = " workprints/";
  protected final String TEXT_25 = NL + NL + "genppscript: $(ISM_DEPTH)/workprints/";
  protected final String TEXT_26 = NL + "\tcd `pwd`/$(ISM_DEPTH); genppscript";
  protected final String TEXT_27 = " ";
  protected final String TEXT_28 = " ";
  protected final String TEXT_29 = " workprints/";
  protected final String TEXT_30 = " ";
  protected final String TEXT_31 = " ";
  protected final String TEXT_32 = " ";
  protected final String TEXT_33 = NL;
  protected final String TEXT_34 = NL;
  protected final String TEXT_35 = ": genppscript" + NL;
  protected final String TEXT_36 = NL;
  protected final String TEXT_37 = ": gengroup genscene genmedia gentables" + NL + "" + NL + "gendpp: ";
  protected final String TEXT_38 = " ";
  protected final String TEXT_39 = NL + "\tcd `pwd`/$(ISM_DEPTH); gendpp -c";
  protected final String TEXT_40 = " ";
  protected final String TEXT_41 = " ";
  protected final String TEXT_42 = " ";
  protected final String TEXT_43 = " ";
  protected final String TEXT_44 = " workprints/";
  protected final String TEXT_45 = " ";
  protected final String TEXT_46 = "/";
  protected final String TEXT_47 = NL + NL + "include $(ISMRULES)";
  protected final String TEXT_48 = NL;

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
    stringBuffer.append(TEXT_1);
    stringBuffer.append(workprint);
    stringBuffer.append(TEXT_2);
    if (isVerbose.booleanValue())
		stringBuffer.append(" -v");
    if (isBigEndian.booleanValue())
		stringBuffer.append(" -b");
	else
		stringBuffer.append(" -l");
    if (isGroupFixedPoint.booleanValue())
		stringBuffer.append(" -f");
    stringBuffer.append(" -d");
    stringBuffer.append(TEXT_3);
    stringBuffer.append(projectDestination);
    stringBuffer.append(TEXT_4);
    stringBuffer.append(tags);
    stringBuffer.append(TEXT_5);
    stringBuffer.append(workprint);
    stringBuffer.append(TEXT_6);
    stringBuffer.append(actorid);
    stringBuffer.append(TEXT_7);
    stringBuffer.append(groupid);
    stringBuffer.append(TEXT_8);
    stringBuffer.append(workprint);
    stringBuffer.append(TEXT_9);
    if (isVerbose.booleanValue())
		stringBuffer.append(" -v");
    if (isBigEndian.booleanValue())
		stringBuffer.append(" -b");
	else
		stringBuffer.append(" -l");
    if (isSceneFixedPoint.booleanValue())
		stringBuffer.append(" -f");
    stringBuffer.append(" -d");
    stringBuffer.append(TEXT_10);
    stringBuffer.append(projectDestination);
    stringBuffer.append(TEXT_11);
    stringBuffer.append(tags);
    stringBuffer.append(TEXT_12);
    stringBuffer.append(workprint);
    stringBuffer.append(TEXT_13);
    stringBuffer.append(sceneid);
    stringBuffer.append(TEXT_14);
    stringBuffer.append(workprint);
    stringBuffer.append(TEXT_15);
    if (isBigEndian.booleanValue())
		stringBuffer.append(" -b");
	else
		stringBuffer.append(" -l");
    stringBuffer.append(" -d");
    stringBuffer.append(TEXT_16);
    stringBuffer.append(projectDestination);
    stringBuffer.append(TEXT_17);
    stringBuffer.append(tags);
    stringBuffer.append(TEXT_18);
    stringBuffer.append(workprint);
    stringBuffer.append(TEXT_19);
    stringBuffer.append(bom);
    stringBuffer.append(TEXT_20);
    stringBuffer.append(workprint);
    stringBuffer.append(TEXT_21);
    stringBuffer.append(" -d");
    stringBuffer.append(TEXT_22);
    stringBuffer.append(projectDestination);
    stringBuffer.append(TEXT_23);
    stringBuffer.append(tags);
    stringBuffer.append(TEXT_24);
    stringBuffer.append(workprint);
    stringBuffer.append(TEXT_25);
    stringBuffer.append(workprint);
    stringBuffer.append(TEXT_26);
    stringBuffer.append(" -d");
    stringBuffer.append(TEXT_27);
    stringBuffer.append(projectDestination);
    stringBuffer.append(TEXT_28);
    stringBuffer.append(tags);
    stringBuffer.append(TEXT_29);
    stringBuffer.append(workprint);
    stringBuffer.append(TEXT_30);
    stringBuffer.append(playprint);
    stringBuffer.append(TEXT_31);
    stringBuffer.append(script);
    stringBuffer.append(TEXT_32);
    stringBuffer.append(toc);
    stringBuffer.append(TEXT_33);
    stringBuffer.append(TEXT_34);
    stringBuffer.append(script);
    stringBuffer.append(TEXT_35);
    stringBuffer.append(TEXT_36);
    stringBuffer.append(playprint);
    stringBuffer.append(TEXT_37);
    stringBuffer.append(playprint);
    stringBuffer.append(TEXT_38);
    stringBuffer.append(script);
    stringBuffer.append(TEXT_39);
    if (isBigEndian.booleanValue())
		stringBuffer.append(" -b");
	else
		stringBuffer.append(" -l");
    stringBuffer.append(" -d");
    stringBuffer.append(TEXT_40);
    stringBuffer.append(projectDestination);
    stringBuffer.append(TEXT_41);
    stringBuffer.append("-s");
    stringBuffer.append(TEXT_42);
    stringBuffer.append(projectDestination);
    stringBuffer.append(TEXT_43);
    stringBuffer.append(tags);
    stringBuffer.append(TEXT_44);
    stringBuffer.append(workprint);
    stringBuffer.append(TEXT_45);
    stringBuffer.append(projectDestination);
    stringBuffer.append(TEXT_46);
    stringBuffer.append(script);
    stringBuffer.append(TEXT_47);
    stringBuffer.append(TEXT_48);
    return stringBuffer.toString();
  }
}
