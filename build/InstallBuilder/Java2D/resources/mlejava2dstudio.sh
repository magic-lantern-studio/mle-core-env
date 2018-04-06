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
# Test for the existence of TCL
# 
if [ -z ${TCL_HOME+x} ]; then
  echo The TCL_HOME environment variable is not set.
  echo Magic Lantern requires the Tcl scripting language.
  echo Please install Tcl and set the TCL_HOME variable to
  echo reference the installed location.
  zenity --error --text="The TCL_HOME environment variable is not set.\nMagic Lantern requires the Tcl scripting language.\nPlease install Tcl and set the TCL_HOME variable to\nreference the installed location."
  exit
else
  if [ -e $TCL_HOME/bin/tclsh ]; then
    echo Using $TCL_HOME
  else
      echo It appears that Tcl has not been installed.
      echo Has the TCL_HOME environment variable
      echo been set to the Tcl installation directory?
      zenity --error --text="It appears that Tcl has not been installed.\nHas the TCL_HOME environment variable\nbeen set to the Tcl installation directory?"
      exit
  fi
fi

#
# Set executable path.
#
export PATH=$TCL_HOME/bin:$MLE_ROOT/bin:$PATH

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
