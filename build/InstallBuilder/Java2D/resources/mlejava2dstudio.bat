@echo off
rem This script is used to invoke the Java2D Edition of Magic Lantern
rem with the required arguments for execution.

rem
rem Set environment variables.
rem
set MLE_ROOT=C:\PROGRA~1\WizzerWorks\MagicLanternJava2DStudio
set MLE_HOME=C:\PROGRA~1\WizzerWorks\MagicLanternJava2DStudio
set MLE_WORKPRINTS=//C/PROGRA~1/WizzerWorks/MagicLanternJava2DStudio

rem
rem Test for the existence of TCL
rem 
if not defined TCL_HOME (
  echo The TCL_HOME environment variable is not set.
  echo Magic Lantern requires the Tcl scripting language.
  echo Please install Tcl and set the TCL_HOME variable to
  echo reference the installed location. && pause
  exit
) else (
  echo Using %TCL_HOME%
)

rem
rem Set executable path.
rem
set PATH=%TCL_HOME%/bin;%MLE_ROOT%/bin;%PATH%

rem
rem Fork off a new MS-DOS shell running Magic Lantern.
rem
start %MLE_ROOT%\MagicLantern\mlestudio.exe ^
      -data %MLE_ROOT%\workspace ^
      -vm "%MLE_ROOT%\MagicLantern\jre\bin\javaw.exe" ^
      -vmargs -DMLE_ROOT=%MLE_ROOT% ^
      -DSYSTEMROOT=%WINDIR% ^
      -Declipse.log.size.max=1024 ^
      -Dosgi.requiredJavaVersion=1.8 ^
      --add-modules=ALL-SYSTEM ^
      -Xms256m -Xmx1024m
