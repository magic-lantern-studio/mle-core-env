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

public class IsmrulesTemplate
{
  protected static String nl;
  public static synchronized IsmrulesTemplate create(String lineSeparator)
  {
    nl = lineSeparator;
    IsmrulesTemplate result = new IsmrulesTemplate();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String COPYRIGHT = "##########################################################################" + NL + "# -*- Makefile -*-" + NL + "#" + NL + "# The MIT License (MIT)" + NL + "#" + NL + "# Copyright (c) 2000-2020 Wizzer Works" + NL + "#" + NL + "# Permission is hereby granted, free of charge, to any person obtaining a copy" + NL + "# of this software and associated documentation files (the \"Software\"), to deal" + NL + "# in the Software without restriction, including without limitation the rights" + NL + "# to use, copy, modify, merge, publish, distribute, sublicense, and/or sell" + NL + "# copies of the Software, and to permit persons to whom the Software is" + NL + "# furnished to do so, subject to the following conditions:" +  NL + "#" + NL + "# The above copyright notice and this permission notice shall be included in all" + NL + "# copies or substantial portions of the Software." + NL + "#" + NL + "# THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR" + NL + "# IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY," + NL + "# FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE" + NL + "# AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER" + NL + "# LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM," + NL + "# OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE" + NL + "# SOFTWARE." + NL + "#" + NL + "#  For information concerning this header file, contact Mark S. Millard," + NL + "#  of Wizzer Works at msm@wizzerworks.com." + NL + "#" + NL + "#  More information concerning Wizzer Works may be found at" + NL + "#" + NL + "#      http://www.wizzerworks.com" + NL + "#" + NL + "##########################################################################" + NL;
  protected final String TEXT_1 = "#" + NL + "# ismrules - ISM build rules" + NL + "#" + NL + "# This file must be included by all Makefiles using the $(ISMRULES)" + NL + "# macro AFTER the definition of the first target. See the ismdefs and" + NL + "# commondefs files for detailed information." + NL + "#" + NL + "##########################################################################" + NL + "" + NL + "#" + NL + "# To have leaf version TARGETS copied to the corresponding ISM top" + NL + "# level version directory, define ISM_COPY_VERSION." + NL + "#" + NL + "ifdef ISM_COPY_VERSION" + NL + "ifdef CUR_VERSION" + NL + "ISM_VERSIONDIR = $(ISM_DEPTH)/$(CUR_VERSION)" + NL + "ISM_VERSIONFILES = $(foreach f,$(TARGETS),$(ISM_VERSIONDIR)/$(f))" + NL + "ITDIRT += $(ISM_VERSIONFILES)" + NL + "" + NL + "all: $(ISM_VERSIONFILES)" + NL + "" + NL + "$(ISM_VERSIONFILES): $(TARGETS)" + NL + "\t$(CP) $(TARGETS) $(ISM_VERSIONDIR)" + NL + "endif" + NL + "endif" + NL + "" + NL + "#" + NL + "# Bring in ismcommonrules" + NL + "#" + NL + "include $(ISMCOMMONRULES)";
  protected final String TEXT_2 = NL;

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
    stringBuffer.append(COPYRIGHT);
    stringBuffer.append(TEXT_1);
    stringBuffer.append(TEXT_2);
    return stringBuffer.toString();
  }
}
