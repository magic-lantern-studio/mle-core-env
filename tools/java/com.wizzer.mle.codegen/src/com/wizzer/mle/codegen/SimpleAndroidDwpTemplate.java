package com.wizzer.mle.codegen;

import com.wizzer.mle.codegen.*;

public class SimpleAndroidDwpTemplate
{
  protected static String nl;
  public static synchronized SimpleAndroidDwpTemplate create(String lineSeparator)
  {
    nl = lineSeparator;
    SimpleAndroidDwpTemplate result = new SimpleAndroidDwpTemplate();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "#DWP 1.0 ascii" + NL + "( Include  $MLE_WORKPRINTS/Parts/sets/android/workprints/MleAndroid2dSet.wpf )";
  protected final String TEXT_2 = NL + "( Stage +rehearsal +inventor inventor MleIvStage" + NL + "   ( Set 2dSet Mle2dSet )" + NL + ")";
  protected final String TEXT_3 = NL + "( Stage +android MyStage Mle2dStage " + NL + "  ( Set 2dSet Mle2dSet" + NL + "    ( Property position MlVector2 0 0 ) " + NL + "    ( Property size MlVector2 320 480 ) " + NL + "  ) " + NL + ") " + NL + "( Scene  scene1 MleScene" + NL + "  ( Package  com.wizzer.mle.runtime.core )" + NL + "  ( Group  group1 MleGroup" + NL + "    ( Package com.wizzer.mle.runtime.core )" + NL + "  )" + NL + ")";
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
