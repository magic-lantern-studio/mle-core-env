ECHO OFF

REM This script may be used to remove the 64-bit artifacts that are installed
REM in %MLE_ROOT% during development builds.

SET CURDIR=%CD%

IF "%MLE_ROOT%"=="" (
    ECHO MLE_ROOT is NOT defined
    EXIT
) ELSE (
    ECHO MLE_ROOT is %MLE_ROOT%
    ECHO Libraries will be deleted from %MLE_ROOT%\lib64
    ECHO Binaraies will be deleted from %MLE_ROOT%\bin64
    ECHO
)

REM Delete libraries.
IF EXIST %MLE_ROOT%\lib64 (
    ECHO Clobbering 64-bit libraries
    CD /d %MLE_ROOT%\lib64
    DIR
    DEL inventor\*.lib
    DEL rehearsal\*.lib
    DEL runtime\cdecl\*.lib
    DEL runtime\stdcall\*.lib
    DEL tools\*.lib
    DEL *.tmpl
    ECHO
)

REM Delete binaries.
IF EXIST %MLE_ROOT%\bin64 (
    ECHO Clobber 64-bit binaries
    CD /d %MLE_ROOT%\bin64
    DIR
    DEL *.exe
    DEL rehearsal\*.dll
    ECHO
)

REM Delete header files.
IF EXIST %MLE_ROOT%\include (
    ECHO Clobber header files
    CD /d %MLE_ROOT%\include
    DIR
    DEL math\*.h
    DEL mle\*.h
    DEL rehearsal\mle\*.h
    DEL runtime\mle\*.h
    ECHO
)

REM Delete miscellaneous files.
IF EXIST %MLE_ROOT%\include (
    ECHO Clobber Digital Workprints
    CD /d %MLE_ROOT%\include\workprints
    DIR
    DEL *.wpp
    CD /d %MLE_ROOT%\include\Parts\actors\workprints
    DEL *.wpa *.wpd
    CD /d %MLE_ROOT%\include\Parts\roles\workprints
    DEL *.wpd
    CD /d %MLE_ROOT%\include\Parts\sets\workprints
    DEL *.wpf
    ECHO
)

REM Clean up.
CD /d %CURDIR%
