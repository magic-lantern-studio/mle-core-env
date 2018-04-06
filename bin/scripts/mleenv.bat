@ECHO OFF

REM Set the root for the build and runtime environment.
SET MLE_ROOT=C:/Users/msm/projects/MagicLantern

REM Set variables particular to the Magic Lantern build.
SET PLATFORM=win32
SET MAKE_MODE=UNIX
SET BRENDER_PATH=C:/BRENDER/V1_2_1/DAT

REM Set the path.
PATH=.;C:\cygwin\bin;C:\cygwin\sbin;C:\Perl\bin;C:\Program Files\Microsoft Visual Studio\VC98\Bin;C:\Program Files\Microsoft Visual Studio\Common\MSDev98\Bin;C:\Users\msm\projects\MagicLantern\bin;%PATH%

REM Set the include and library paths for Microsoft Visual Studio 6.0.
SET INCLUDE=C:\Program Files\Microsoft Visual Studio\VC98\atl\include;C:\Program Files\Microsoft Visual Studio\VC98\mfc\include;C:\Program Files\Microsoft Visual Studio\VC98\include
SET LIB=C:\Program Files\Microsoft Visual Studio\VC98\mfc\lib;C:\Program Files\Microsoft Visual Studio\VC98\lib;C:\BRENDER\V1_2_1\LIB;C:\Users\msm\projects\MagicLantern\lib\runtime

REM Start up a Cygwin shell.
C:\cygwin\cygwin.bat
