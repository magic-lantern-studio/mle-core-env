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
