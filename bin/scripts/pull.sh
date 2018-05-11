#!/bin/sh

# This script needs to be executed from the directory where the git repos
# have been cloned.
#
# Tip: use "ssh-add ~/.ssh/id_rsa" to add your SSH key to the ssh-agent so
# you dont have to give your passphrase every time "git pull" in invoked.

echo " ***** Processing mle-core-env *****"
cd mle-core-env
git pull

echo " ***** Processing mle-core-util *****"
cd ../mle-core-util
git pull

echo " ***** Processing mle-core-math *****"
cd ../mle-core-math
git pull

echo " ***** Processing mle-core-dwp *****"
cd ../mle-core-dwp
git pull

echo " ***** Processing mle-core-dpp *****"
cd ../mle-core-dpp
git pull

echo " ***** Processing mle-core-mlert *****"
cd ../mle-core-mlert
git pull

echo " ***** Processing mle-studio *****"
cd ../mle-studio
git pull

echo " ***** Processing mle-parts *****"
cd ../mle-parts
git pull

echo " ***** Processing mle-atk *****"
cd ../mle-atk
git pull

echo " ***** Processing mle-players *****"
cd ../mle-players
git pull

echo " ***** Processing mle-core-env *****"
cd ../mle-titles
git pull

cd ..
