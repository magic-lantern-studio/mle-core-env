@echo off
rem This script is used to invoke the Android Edition of Magic Lantern
rem with the required arguments for execution.

rem
rem Set environment variables.
rem
set MLE_ROOT=C:\PROGRA~1\WizzerWorks\MagicLanternAndroidStudio
set MLE_HOME=C:\PROGRA~1\WizzerWorks\MagicLanternAndroidStudio
set MLE_WORKPRINTS=//C/PROGRA~1/WizzerWorks/MagicLanternAndroidStudio

rem
rem Set executable path.
rem
set PATH=%TCL_HOME%/bin;%MLE_ROOT%/bin;%PATH%

rem
rem Fork off a new MS-DOS shell running Magic Lantern.
rem
start %MLE_ROOT%\MagicLantern\mlestudio.exe ^
      -data %MLE_ROOT%\workspace ^
      -vm "%WINDIR%\SYSTEM32\javaw.exe" ^
      -vmargs -DMLE_ROOT=%MLE_ROOT% ^
      -DSYSTEMROOT=%WINDIR% ^
      -Declipse.log.size.max=1024 ^
      -Dosgi.requiredJavaVersion=1.5 ^
      -Xms40m -Xmx512m -XX:PermSize=64M -XX:MaxPermSize=128M
