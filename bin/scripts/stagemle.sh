#!/bin/sh

# Verify that $MLE_HOME exists
if [ ! -d "$MLE_HOME" ]
then
    echo "MLE_HOME environment variable is not set to a valid directory."
    echo "Please set MLE_HOME to the directory where you wish to build"
    echo "the Magic Lantern projects."
    exit 1
fi

# Create symbolic links from git repos.
if [ -d `pwd`/mle-core-env ]
then
    ln -s `pwd`/mle-core-env/bin $MLE_HOME/bin
    ln -s `pwd`/mle-core-env/lib $MLE_HOME/build
    ln -s `pwd`/mle-core-env/bin $MLE_HOME/doc
    ln -s `pwd`/mle-core-env/bin $MLE_HOME/include
    ln -s `pwd`/mle-core-env/bin $MLE_HOME/lib
    ln -s `pwd`/mle-core-env/bin $MLE_HOME/tools
fi

if [ -d `pwd`/mle-core-env ]
then
    mkdir $MLE_HOME/Core
    ln -s `pwd`/mle-core-util/util $MLE_HOME/Core/util
fi
