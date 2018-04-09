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
    ln -s `pwd`/mle-core-env/build $MLE_HOME/build
    ln -s `pwd`/mle-core-env/doc $MLE_HOME/doc
    ln -s `pwd`/mle-core-env/include $MLE_HOME/include
    ln -s `pwd`/mle-core-env/lib $MLE_HOME/lib
    ln -s `pwd`/mle-core-env/tools $MLE_HOME/tools
fi

if [ -d `pwd`/mle-core-util ]
then
    mkdir $MLE_HOME/Core
    ln -s `pwd`/mle-core-util/util $MLE_HOME/Core/util
fi

if [ -d `pwd`/mle-core-math ]
then
    mkdir $MLE_HOME/Core
    ln -s `pwd`/mle-core-math/math $MLE_HOME/Core/math
fi

if [ -d `pwd`/mle-core-mlert ]
then
    mkdir $MLE_HOME/Core
    ln -s `pwd`/mle-core-mlert/mlert $MLE_HOME/Core/mlert
fi

if [ -d `pwd`/mle-core-dwp ]
then
    ln -s `pwd`/mle-core-dwp/DigitalWorkprint $MLE_HOME/DigitalWorkprint
fi

if [ -d `pwd`/mle-core-dpp ]
then
     ln -s `pwd`/mle-core-dpp/DigitalPlayprint $MLE_HOME/DigitalPlayprint
fi

if [ -d `pwd`/mle-atk ]
then
    ln -s `pwd`/mle-atk/ATK $MLE_HOME/ATK
fi

if [ -d `pwd`/mle-studio ]
then
    ln -s `pwd`/mle-studio/Studio $MLE_HOME/Studio
fi

if [ -d `pwd`/mle-players ]
then
    ln -s `pwd`/mle-players/Players $MLE_HOME/Players
fi

if [ -d `pwd`/mle-parts ]
then
    ln -s `pwd`/mle-parts/Parts $MLE_HOME/Parts
fi

if [ -d `pwd`/mle-titles ]
then
    ln -s `pwd`/mle-titles/Titles $MLE_HOME/Titles
fi
