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

public class IsmdefsTemplate
{
  protected static String nl;
  public static synchronized IsmdefsTemplate create(String lineSeparator)
  {
    nl = lineSeparator;
    IsmdefsTemplate result = new IsmdefsTemplate();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "##########################################################################" + NL + "# -*- Makefile -*-" + NL + "#" + NL + "#  Copyright (C) 2000-2017  Wizzer Works" + NL + "#" + NL + "#  Wizzer Works makes available all content in this file (\"Content\")." + NL + "#  Unless otherwise indicated below, the Content is provided to you" + NL + "#  under the terms and conditions of the Common Public License Version 1.0" + NL + "#  (\"CPL\"). A copy of the CPL is available at" + NL + "#" + NL + "#      http://opensource.org/licenses/cpl1.0.php" + NL + "#" + NL + "#  For purposes of the CPL, \"Program\" will mean the Content." + NL + "#" + NL + "#  For information concerning this Makefile, contact Mark S. Millard," + NL + "#  of Wizzer Works at msm@wizzerworks.com." + NL + "#" + NL + "##########################################################################" + NL + "#" + NL + "# ismdefs - ISM definitions and macros" + NL + "#" + NL + "# All Makefiles in an ISM should include ismdefs. Following the first" + NL + "# target in the Makefile $(ISMRULES) should be included. These files" + NL + "# will in turn include commondefs and commonrules so there is no need" + NL + "# to explicitly include these files. Each Makefile must define the" + NL + "# ISM_DEPTH as the relative path to the top of the ISM. In addition" + NL + "# Makefiles that build software should define CONFIGURATION as one" + NL + "# of the standard configurations found in" + NL + "# $MLE_ROOT/include/make/configurations. Thus, a typical Makefile will" + NL + "# look like:" + NL + "#" + NL + "# CONFIGURATION = ConsoleRelease" + NL + "# ISM_DEPTH = ../.." + NL + "# include $(ISM_DEPTH)/ismdefs" + NL + "# ." + NL + "# ." + NL + "# ." + NL + "# default: $(TARGETS)" + NL + "#" + NL + "# include $(ISMRULES)" + NL + "#" + NL + "# Please refer to the commondefs file for detail information." + NL + "#" + NL + "##########################################################################" + NL + "" + NL + "#" + NL + "# If you want to force the build of only one version of the ISM" + NL + "# you can either define an environment variable PREF_VERSION set" + NL + "# to the desired version or uncomment PREF_VERSION below and set" + NL + "# it to the version to be built. By default all versions are built." + NL + "#" + NL + "ifndef PREF_VERSION" + NL + "#PREF_VERSION = <specific version name here>" + NL + "endif " + NL + "" + NL + "#" + NL + "# Location of MLE_ROOT environment.  Override by defining MLE_ROOT." + NL + "#" + NL + "ifndef MLE_ROOT" + NL + "MLE_ROOT = \"C:/Program Files/Wizzer Works/Magic Lantern\"" + NL + "endif" + NL + "" + NL + "#" + NL + "# ISM name.  It can be whatever you want" + NL + "#" + NL + "ISM_NAME = ";
  protected final String TEXT_2 = NL + NL + "#" + NL + "# ISM version number. This number is passed as a string defined in" + NL + "# C/C++ files as ISM_VERSION." + NL + "#" + NL + "ISM_VERSION = 0.1" + NL + "" + NL + "#" + NL + "# Time Bomb date. Comment out ISM_TIMEBOMB_DATE to remove time bombing." + NL + "# The ISM_TIMEBOMB_DATE variable MUST be in the form mm/dd/yyyy." + NL + "#" + NL + "ISM_TIMEBOMB_DATE = 12/15/2006" + NL + "" + NL + "#" + NL + "# Bring in ismcommondefs (which, in turn, will bring in commondefs)" + NL + "# (must do this after the above definitions!)" + NL + "#" + NL + "include $(MLE_ROOT)/include/make/ismcommondefs" + NL + "" + NL + "#" + NL + "# The install builder needs to know the top of the tree.  For this" + NL + "# example, it happens to be at ISM_DEPTH.  However, it may be one" + NL + "# above this directory, especially if you follow the cross-platform" + NL + "# development guidelines." + NL + "#" + NL + "IBBASEDIR = $(ISM_DEPTH)" + NL + "" + NL + "#" + NL + "# Common ISM directories" + NL + "#" + NL + "# The debug and release directories are typically where all" + NL + "# executables and their DLLs are copied during the build so" + NL + "# that the executables can be run." + NL + "#" + NL + "ISM_INCDIR = $(ISM_DEPTH)/build/include" + NL + "ISM_LIBDIR = $(ISM_DEPTH)/build/lib" + NL + "ISM_DEBUGDIR = $(ISM_DEPTH)/build/Debug" + NL + "ISM_RELEASEDIR = $(ISM_DEPTH)/build/Release" + NL + "" + NL + "#" + NL + "# Define the rules macro. After the first target in the Makefile is" + NL + "# defined include $(ISMRULES)." + NL + "#" + NL + "ISMRULES = $(ISM_DEPTH)/ismrules";
  protected final String TEXT_3 = NL;

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
    stringBuffer.append(projectName);
    stringBuffer.append(TEXT_2);
    stringBuffer.append(TEXT_3);
    return stringBuffer.toString();
  }
}
