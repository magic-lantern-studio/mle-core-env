package com.wizzer.mle.codegen;

import com.wizzer.mle.codegen.*;

public class TopMakefileTemplate
{
  protected static String nl;
  public static synchronized TopMakefileTemplate create(String lineSeparator)
  {
    nl = lineSeparator;
    TopMakefileTemplate result = new TopMakefileTemplate();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "##########################################################################" + NL + "# -*- Makefile -*-" + NL + "#" + NL + "#  Copyright (C) 2000-2007  Wizzer Works" + NL + "#" + NL + "#  Wizzer Works makes available all content in this file (\"Content\")." + NL + "#  Unless otherwise indicated below, the Content is provided to you" + NL + "#  under the terms and conditions of the Common Public License Version 1.0" + NL + "#  (\"CPL\"). A copy of the CPL is available at" + NL + "#" + NL + "#      http://opensource.org/licenses/cpl1.0.php" + NL + "#" + NL + "#  For purposes of the CPL, \"Program\" will mean the Content." + NL + "#" + NL + "#  For information concerning this Makefile, contact Mark S. Millard," + NL + "#  of Wizzer Works at msm@wizzerworks.com." + NL + "#" + NL + "##########################################################################" + NL + "" + NL + "ISM_DEPTH = ." + NL + "include $(ISM_DEPTH)/ismdefs" + NL + "" + NL + "#" + NL + "# Pick up some more defs specific to top level Makefile" + NL + "#" + NL + "include $(TOPLEVELDEFS)" + NL + "" + NL + "#" + NL + "# Descend into subdirectories for COMMONTARGS.  Note that it descends" + NL + "# into BUILDDIR as well." + NL + "#" + NL + "SUBDIRS = \\" + NL + "\tsrc \\" + NL + "\tmedia \\" + NL + "\t$(NULL)" + NL + "" + NL + "all $(COMMONTARGS):" + NL + "\t$(SUBDIRS_MAKERULE)" + NL + "" + NL + "#" + NL + "# Rules that belong only in the top level makefile" + NL + "#" + NL + "include $(TOPLEVELRULES)" + NL + "" + NL + "include $(ISMRULES)";
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
    stringBuffer.append(TEXT_1);
    stringBuffer.append(TEXT_2);
    return stringBuffer.toString();
  }
}