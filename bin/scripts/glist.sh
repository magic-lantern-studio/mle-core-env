#!/bin/sh

# List the git branches in the Magic Lantern modules.
#
# This script needs to be executed from the directory where the git repos
# have been cloned.
#
# Tip: use "ssh-add ~/.ssh/id_rsa" to add your SSH key to the ssh-agent so
# you dont have to give your passphrase every time "git branch" in invoked.

echo " ***** Processing mle-core-env *****"
cd mle-core-env
git branch -a

echo " ***** Processing mle-core-util *****"
cd ../mle-core-util
git branch -a

echo " ***** Processing mle-core-math *****"
cd ../mle-core-math
git branch -a

echo " ***** Processing mle-core-dwp *****"
cd ../mle-core-dwp
git branch -a

echo " ***** Processing mle-core-dpp *****"
cd ../mle-core-dpp
git branch -a

echo " ***** Processing mle-core-mlert *****"
cd ../mle-core-mlert
git branch -a

echo " ***** Processing mle-studio *****"
cd ../mle-studio
git branch -a

echo " ***** Processing mle-parts *****"
cd ../mle-parts
git branch -a

echo " ***** Processing mle-atk *****"
cd ../mle-atk
git branch -a

echo " ***** Processing mle-loaders *****"
cd ../mle-loaders
git branch -a

echo " ***** Processing mle-players *****"
cd ../mle-players
git branch -a

echo " ***** Processing mle-core-env *****"
cd ../mle-titles
git branch -a

cd ..
