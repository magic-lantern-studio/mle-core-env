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
    echo "Creating symbolic links for mle-core-env."
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
    echo "Creating symbolic links for mle-core-util."
    ln -s `pwd`/mle-core-util/util $MLE_HOME/Core/util
fi

if [ -d `pwd`/mle-core-math ]
then
    mkdir $MLE_HOME/Core
    echo "Creating symbolic links for mle-core-math."
    ln -s `pwd`/mle-core-math/math $MLE_HOME/Core/math
fi

if [ -d `pwd`/mle-core-mlert ]
then
    mkdir $MLE_HOME/Core
    echo "Creating symbolic links for mle-core-mlert."
    ln -s `pwd`/mle-core-mlert/mlert $MLE_HOME/Core/mlert
fi

if [ -d `pwd`/mle-core-dwp ]
then
    echo "Creating symbolic links for mle-core-dwp."
    ln -s `pwd`/mle-core-dwp/DigitalWorkprint $MLE_HOME/DigitalWorkprint
fi

if [ -d `pwd`/mle-core-dpp ]
then
        echo "Creating symbolic links for mle-core-dpp."
     ln -s `pwd`/mle-core-dpp/DigitalPlayprint $MLE_HOME/DigitalPlayprint
fi

if [ -d `pwd`/mle-atk ]
then
    echo "Creating symbolic links for mle-atk."
    ln -s `pwd`/mle-atk/ATK $MLE_HOME/ATK
fi

if [ -d `pwd`/mle-loaders ]
then
    echo "Creating symbolic links for mle-loaders."
    ln -s `pwd`/mle-loaders/Loaders $MLE_HOME/Loaders
fi

if [ -d `pwd`/mle-studio ]
then
    echo "Creating symbolic links for mle-studio."
    ln -s `pwd`/mle-studio/Studio $MLE_HOME/Studio
fi

if [ -d `pwd`/mle-players ]
then
    echo "Creating symbolic links for mle-players."
    ln -s `pwd`/mle-players/Players $MLE_HOME/Players
fi

if [ -d `pwd`/mle-parts ]
then
    echo "Creating symbolic links for mle-parts."
    ln -s `pwd`/mle-parts/Parts $MLE_HOME/Parts
fi

if [ -d `pwd`/mle-titles ]
then
    echo "Creating symbolic links for mle-titles."
    ln -s `pwd`/mle-titles/Titles $MLE_HOME/Titles
fi
