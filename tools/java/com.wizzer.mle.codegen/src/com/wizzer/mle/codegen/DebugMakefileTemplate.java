package com.wizzer.mle.codegen;

import com.wizzer.mle.codegen.*;

public class DebugMakefileTemplate
{
  protected static String nl;
  public static synchronized DebugMakefileTemplate create(String lineSeparator)
  {
    nl = lineSeparator;
    DebugMakefileTemplate result = new DebugMakefileTemplate();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "##########################################################################" + NL + "# -*- Makefile -*-" + NL + "#" + NL + "#  Copyright (C) 2000-2017  Wizzer Works" + NL + "#" + NL + "#  Wizzer Works makes available all content in this file (\"Content\")." + NL + "#  Unless otherwise indicated below, the Content is provided to you" + NL + "#  under the terms and conditions of the Common Public License Version 1.0" + NL + "#  (\"CPL\"). A copy of the CPL is available at" + NL + "#" + NL + "#      http://opensource.org/licenses/cpl1.0.php" + NL + "#" + NL + "#  For purposes of the CPL, \"Program\" will mean the Content." + NL + "#" + NL + "#  For information concerning this Makefile, contact Mark S. Millard," + NL + "#  of Wizzer Works at msm@wizzerworks.com." + NL + "#" + NL + "##########################################################################" + NL + "" + NL + "#" + NL + "# Type of platform to build for." + NL + "#" + NL + "ifndef PLATFORM" + NL + "PLATFORM = win32" + NL + "endif" + NL + "" + NL + "#" + NL + "# Set which configuration this is..." + NL + "#" + NL + "CONFIGURATION = Win32Debug" + NL + "" + NL + "ISM_DEPTH = ../.." + NL + "LEAF_DEPTH = .." + NL + "" + NL + "#" + NL + "# Turn off dependency generation. Note that sbr2dep.exe is currently" + NL + "# broken." + NL + "#" + NL + "NODEPENDS = 1" + NL + "" + NL + "LCXXDEFS = \\" + NL + "\t-DMLE_DEBUG \\" + NL + "\t-DML_MATH_DEBUG=1 \\" + NL + "\t-DML_FIXED_POINT=0 \\" + NL + "\t-DMLE_NOT_DLL \\" + NL + "\t$(NULL)" + NL + "" + NL + "LCXXOPTS = \\" + NL + "\t-Gz -Zp4 -FD \\" + NL + "\t$(NULL)" + NL + "" + NL + "LRCOPTS = \\" + NL + "\t-l 0x409 \\" + NL + "\t$(NULL)" + NL + "" + NL + "LLDOPTS = \\" + NL + "\t-libpath:$(MLE_ROOT)/";
  protected final String TEXT_2 = " \\" + NL + "\t-libpath:$(MLE_ROOT)/lib/brender \\" + NL + "\t-libpath:$(BRENDER_ROOT)/lib \\" + NL + "\t$(NULL)" + NL + "" + NL + "LLDLIBS = \\" + NL + "\tactorsd.lib \\" + NL + "\tbrrolesd.lib \\" + NL + "\tbrsetsd.lib \\" + NL + "\tbrmrefsd.lib \\" + NL + "\tbrstaged.lib \\" + NL + "\tpcstaged.lib \\" + NL + "\tplayprintd.lib \\" + NL + "\tmlmathd.lib \\" + NL + "\tmlertd.lib \\" + NL + "\t$(NULL)" + NL + "" + NL + "#" + NL + "# Set the style of debug information. Turn on incremental" + NL + "# linking." + NL + "#" + NL + "DEBUG_INFO = PDB" + NL + "INCREMENTAL_LINK = 1" + NL + "" + NL + "#" + NL + "# The actual work of building is in the directory above, in a file" + NL + "# called \"leafdefs\"." + NL + "#" + NL + "include $(LEAF_DEPTH)/leafdefs" + NL + "" + NL + "#" + NL + "# Set the warning level." + NL + "#" + NL + "WARN_LEVEL = -W3" + NL + "" + NL + "#" + NL + "# Set the style of C runtime library." + NL + "#" + NL + "LIBC_STYLE = -MLd" + NL + "LIBC_STYLE_DEFS =" + NL + "" + NL + "CF_GEN_DEBUG_INFO = -ZI";
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
    String partsLib = (String)config.getPropertyValue(IMasteringConfiguration.MAKEFILE_PARTS_LIB);
    stringBuffer.append(TEXT_1);
    stringBuffer.append(partsLib);
    stringBuffer.append(TEXT_2);
    stringBuffer.append(TEXT_3);
    return stringBuffer.toString();
  }
}
