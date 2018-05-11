#!/bin/sh

# This script needs to be executed from the directory where the git repos
# have been cloned.
#
# Tip: use "ssh-add ~/.ssh/id_rsa" to add your SSH key to the ssh-agent so
# you dont have to give your passphrase every time "git diff" in invoked.

echo " ***** Processing mle-core-env *****"
cd mle-core-env
git diff --exit-code > /dev/null
rc=$?
if [[ $rc != 0 ]]
then
    echo "There are local, unstaged changes."
fi
git diff --cached --exit-code > /dev/null
rc=$?
if [[ $rc != 0 ]]
then
    echo "There are changes staged, but not committed."
fi

echo " ***** Processing mle-core-util *****"
cd ../mle-core-util
git diff --exit-code > /dev/null
rc=$?
if [[ $rc != 0 ]]
then
    echo "There are local, unstaged changes."
fi
git diff --cached --exit-code > /dev/null
rc=$?
if [[ $rc != 0 ]]
then
    echo "There are changes staged, but not committed."
fi

echo " ***** Processing mle-core-math *****"
cd ../mle-core-math
git diff --exit-code > /dev/null
rc=$?
if [[ $rc != 0 ]]
then
    echo "There are local, unstaged changes."
fi
git diff --cached --exit-code > /dev/null
rc=$?
if [[ $rc != 0 ]]
then
    echo "There are changes staged, but not committed."
fi

echo " ***** Processing mle-core-dwp *****"
cd ../mle-core-dwp
git diff --exit-code > /dev/null
rc=$?
if [[ $rc != 0 ]]
then
    echo "There are local, unstaged changes."
fi
git diff --cached --exit-code > /dev/null
rc=$?
if [[ $rc != 0 ]]
then
    echo "There are changes staged, but not committed."
fi

echo " ***** Processing mle-core-dpp *****"
cd ../mle-core-dpp
git diff --exit-code > /dev/null
rc=$?
if [[ $rc != 0 ]]
then
    echo "There are local, unstaged changes."
fi
git diff --cached --exit-code > /dev/null
rc=$?
if [[ $rc != 0 ]]
then
    echo "There are changes staged, but not committed."
fi

echo " ***** Processing mle-core-mlert *****"
cd ../mle-core-mlert
git diff --exit-code > /dev/null
rc=$?
if [[ $rc != 0 ]]
then
    echo "There are local, unstaged changes."
fi
git diff --cached --exit-code > /dev/null
rc=$?
if [[ $rc != 0 ]]
then
    echo "There are changes staged, but not committed."
fi

echo " ***** Processing mle-studio *****"
cd ../mle-studio
git diff --exit-code > /dev/null
rc=$?
if [[ $rc != 0 ]]
then
    echo "There are local, unstaged changes."
fi
git diff --cached --exit-code > /dev/null
rc=$?
if [[ $rc != 0 ]]
then
    echo "There are changes staged, but not committed."
fi

echo " ***** Processing mle-parts *****"
cd ../mle-parts
git diff --exit-code > /dev/null
rc=$?
if [[ $rc != 0 ]]
then
    echo "There are local, unstaged changes."
fi
git diff --cached --exit-code > /dev/null
rc=$?
if [[ $rc != 0 ]]
then
    echo "There are changes staged, but not committed."
fi

echo " ***** Processing mle-atk *****"
cd ../mle-atk
git diff --exit-code > /dev/null
rc=$?
if [[ $rc != 0 ]]
then
    echo "There are local, unstaged changes."
fi
git diff --cached --exit-code > /dev/null
rc=$?
if [[ $rc != 0 ]]
then
    echo "There are changes staged, but not committed."
fi

echo " ***** Processing mle-players *****"
cd ../mle-players
git diff --exit-code > /dev/null
rc=$?
if [[ $rc != 0 ]]
then
    echo "There are local, unstaged changes."
fi
git diff --cached --exit-code > /dev/null
rc=$?
if [[ $rc != 0 ]]
then
    echo "There are changes staged, but not committed."
fi

echo " ***** Processing mle-titles *****"
cd ../mle-titles
git diff --exit-code > /dev/null
rc=$?
if [[ $rc != 0 ]]
then
    echo "There are local, unstaged changes."
fi
git diff --cached --exit-code > /dev/null
rc=$?
if [[ $rc != 0 ]]
then
    echo "There are changes staged, but not committed."
fi

cd ..
