REM COPYRIGHT_BEGIN
REM COPYRIGHT_END

REM This script is used to stage the Magic Lantern host development
REM envrionment using links. The MLE_HOME environment variable must
REM be referencing a valid directory. The script must be executed
REM as Administrator.

REM Verify that %MLE_HOME% exists
IF NOT EXIST %MLE_HOME%\ (
    ECHO "MLE_HOME environment variable is not set to a valid directory."
    ECHO "Please set MLE_HOME to the directory where you wish to build"
    ECHO "the Magic Lantern projects."
    EXIT /B 1
)

REM Create symbolic links from git repos.
IF EXIST %CD%\"mle-core-env"\ (
    MKLINK /D %MLE_HOME%\bin %CD%\mle-core-env\bin
    MKLINK /D %MLE_HOME%\build %CD%\mle-core-env\build
    MKLINK /D %MLE_HOME%\doc %CD%\mle-core-env\doc
    MKLINK /D %MLE_HOME%\include %CD%\mle-core-env\include
    MKLINK /D %MLE_HOME%\lib %CD%\mle-core-env\lib
    MKLINK /D %MLE_HOME%\tools %CD%\mle-core-env\tools
)

IF EXIST %CD%\mle-core-util\ (
    MKDIR %MLE_HOME%\Core
    MKLINK /D %MLE_HOME%\Core\util %CD%\mle-core-util\util
)

IF EXIST %CD%\mle-core-math\ (
    MKDIR %MLE_HOME%\Core
    MKLINK /D %MLE_HOME%\Core\math %CD%\mle-core-math\math
)

IF EXIST %CD%\mle-core-mlert\ (
    MKDIR %MLE_HOME%\Core
    MKLINK /D %MLE_HOME%\Core\mlert %CD%\mle-core-mlert\mlert
)

IF EXIST %CD%\mle-core-dwp\ (
    MKLINK /D %MLE_HOME%\DigitalWorkprint %CD%\mle-core-dwp\DigitalWorkprint
)

IF EXIST %CD%\mle-core-dpp\ (
     MKLINK /D %MLE_HOME%\DigitalPlayprint %CD%\mle-core-dpp\DigitalPlayprint
)

IF EXIST %CD%\mle-atk\ (
    MKLINK /D %MLE_HOME%\ATK %CD%\mle-atk\ATK
)

IF EXIST %CD%\mle-studio\ (
    MKLINK /D %MLE_HOME%\Studio %CD%\mle-studio\Studio
)

IF EXIST %CD%\mle-players\ (
    MKLINK /D %MLE_HOME%\Players %CD%\mle-players\Players
)

IF EXIST %CD%\mle-parts\ (
    MKLINK /D %MLE_HOME%\Parts %CD%\mle-parts\Parts
)

IF EXIST %CD%\mle-titles\ (
    MKLINK /D %MLE_HOME%\Titles %CD%\mle-titles\Titles
)
