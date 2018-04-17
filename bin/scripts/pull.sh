#!/bin/sh

# This script needs to be executed from the directory where the git repos
# have been cloned.
#
# Tip: use "ssh-add ~/.ssh/id_rsa" ti add your SSH key to the ssh-agent so
# you dont have to give your passphrase every time "gi pull" in invoked.

cd mle-core-env
git pull
cd ../mle-core-util
git pull
cd ../mle-core-math
git pull
cd ../mle-core-dwp
git pull
cd ../mle-core-dpp
git pull
cd ../mle-core-mlert
git pull
cd ../mle-studio
git pull
cd ../mle-parts
git pull
cd ../mle-atk
git pull
cd ../mle-players
git pull
cd ../mle-titles
git pull
cd ..
