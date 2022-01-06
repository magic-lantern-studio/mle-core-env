#!/bin/sh
# This script is used to invoke the Java2D Edition of Magic Lantern
# with the required arguments for execution.

#
# Set environment variables.
#
# Note that the Magic Lantern environment variables are established
# during the installation process.
#
export MLE_ROOT={{installdir}}
export MLE_HOME={{installdir}}
export MLE_WORKPRINTS={{installdir}}
export LD_LIBRARY_PATH={{installdir}}/lib

#
# Set executable path.
#
export PATH=$MLE_ROOT/bin:$PATH

#
# Fork off a new shell running Magic Lantern.
#
(setsid $MLE_ROOT/MagicLantern/mlestudio \
      -data $HOME/workspace \
      -vm "$MLE_ROOT/MagicLantern/jre/bin/java" \
      -vmargs -DMLE_ROOT=$MLE_ROOT \
      -Declipse.log.size.max=1024 \
      -Dosgi.requiredJavaVersion=1.8 \
      --add-modules=ALL-SYSTEM \
      -Xms256m -Xmx1024m &)
