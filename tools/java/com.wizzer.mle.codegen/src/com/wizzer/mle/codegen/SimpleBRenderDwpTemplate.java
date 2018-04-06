package com.wizzer.mle.codegen;

import com.wizzer.mle.codegen.*;

public class SimpleBRenderDwpTemplate
{
  protected static String nl;
  public static synchronized SimpleBRenderDwpTemplate create(String lineSeparator)
  {
    nl = lineSeparator;
    SimpleBRenderDwpTemplate result = new SimpleBRenderDwpTemplate();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "#DWP 1.0 ascii" + NL + "( Include  $MLE_WORKPRINTS/parts/sets/brender/workprints/MleBr3dSet.wpf )";
  protected final String TEXT_2 = NL + "( Stage +rehearsal +inventor inventor MleIvStage" + NL + "   ( Set 3dSet Mle3dSet )" + NL + ")";
  protected final String TEXT_3 = NL + "( Stage +brender brender MlePCBrStage" + NL + "  ( Set  3dSet Mle3dSet" + NL + "    ( Property  position MlVector2 0.0 0.0 )" + NL + "    ( Property  size MlVector2 320.0 240.0 )" + NL + "  )" + NL + ")" + NL + "( Scene  scene1 MleScene" + NL + "  ( HeaderFile  mle/MleScene.h )" + NL + "  ( Group  group1 MleGroup" + NL + "    ( HeaderFile  mle/MleGroup.h )" + NL + "  )" + NL + ")";
  protected final String TEXT_4 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    IDwpConfiguration config = (IDwpConfiguration)argument;
    String projectName = (String)config.getPropertyValue(IDwpConfiguration.PROJECT_NAME);
    Boolean includeRehearsal = (Boolean)config.getPropertyValue(IDwpConfiguration.INCLUDE_REHEARSAL_PLAYER);
    stringBuffer.append(TEXT_1);
    if ((includeRehearsal != null) && (includeRehearsal.booleanValue() == true)) {
    stringBuffer.append(TEXT_2);
    }
    stringBuffer.append(TEXT_3);
    stringBuffer.append(TEXT_4);
    return stringBuffer.toString();
  }
}
