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

public class AntBuildTemplate
{
  protected static String nl;
  public static synchronized AntBuildTemplate create(String lineSeparator)
  {
    nl = lineSeparator;
    AntBuildTemplate result = new AntBuildTemplate();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>" + NL + "<project name=\"Magic Lantern Project: ";
  protected final String TEXT_2 = "\" default=\"compile\">" + NL + "" + NL + "# Initialize the build environment." + NL + "<target name=\"init\">" + NL + "  <mkdir dir=\"";
  protected final String TEXT_3 = "\" />" + NL + "  <mkdir dir=\"";
  protected final String TEXT_4 = "\" />" + NL + "</target>" + NL + "" + NL + "# Compile the project." + NL + "<target name=\"compile\" depends=\"init\">" + NL + "  <javac srcdir=\"";
  protected final String TEXT_5 = "\"" + NL + "         destdir=\"";
  protected final String TEXT_6 = "\" />" + NL + "</target>" + NL + "" + NL + "</project>";
  protected final String TEXT_7 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    IMasteringConfiguration config = (IMasteringConfiguration)argument;
    stringBuffer.append(TEXT_1);
    stringBuffer.append(config.getPropertyValue(IMasteringConfiguration.PROJECT_NAME));
    stringBuffer.append(TEXT_2);
    stringBuffer.append(config.getPropertyValue(IMasteringConfiguration.PROJECT_DESTINATION_DIRECTORY));
    stringBuffer.append(TEXT_3);
    stringBuffer.append(config.getPropertyValue(IMasteringConfiguration.PROJECT_BUILD_DIRECTORY));
    stringBuffer.append(TEXT_4);
    stringBuffer.append(config.getPropertyValue(IMasteringConfiguration.PROJECT_SOURCE_DIRECTORY));
    stringBuffer.append(TEXT_5);
    stringBuffer.append(config.getPropertyValue(IMasteringConfiguration.PROJECT_DESTINATION_DIRECTORY));
    stringBuffer.append(TEXT_6);
    stringBuffer.append(TEXT_7);
    return stringBuffer.toString();
  }
}
