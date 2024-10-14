# Download base image Ubuntu 16.04
FROM ubuntu:22.04

# Install the build environment dependencies
RUN apt-get update && apt-get install -y \
    autoconf \
    autoconf-archive \
    autoconf-doc \
    autogen \
    automake \
    build-essential \
    cmake \
    curl \
    doxygen \
    freeglut3-dev \
    g++ \
    gawk \
    gettext \
    git \
    gnu-standards \
    libboost-dev \
    libboost-all-dev \
    libfreeimage-dev \
    libgif-dev \
    libglu1-mesa-dev \
    libjpeg-dev \
    libmotif-dev \
    libsndfile1-dev \
    libtiff-dev \
    libtool \
    libxmu-dev \
    libxpm-dev \
    libxt-dev \
    libzstd-dev \
    mesa-common-dev \
    tree && \
    rm -rf /var/lib/apt/lists/*

# Establish a build workspace location
ENV BUILD_ROOT /magiclantern
WORKDIR $BUILD_ROOT
RUN mkdir $BUILD_ROOT/Projects && \
    mkdir $BUILD_ROOT/Projects/MagicLanternStudio && \
    mkdir $BUILD_ROOT/Projects/Github-MagicLantern && \
    mkdir $BUILD_ROOT/Downloads && \
    mkdir $BUILD_ROOT/bin && \
    mkdir /opt/MagicLantern

# Copy packages into BUILD_ROOT
COPY linux/makerules.tgz $BUILD_ROOT/Downloads

# Install Google repo command
#RUN curl https://storage.googleapis.com/git-repo-downloads/repo > $BUILD_ROOT/bin/repo && \
#    chmod a+x $BUILD_ROOT/bin/repo
#ENV PATH $BUILD_ROOT/bin:$PATH

# Install Coin3D libraries (libCoin.so, libSoXt.so, libsimage.so)
RUN cd $BUILD_ROOT/Projects && \
    git clone --recurse-submodules --branch magiclantern https://github.com/magic-lantern-studio/coin coin && \
    cmake -Hcoin -Bcoin_build -G "Unix Makefiles" -DCMAKE_INSTALL_PREFIX=/usr/local -DCMAKE_BUILD_TYPE=Release -DCOIN_BUILD_DOCUMENTATION=OFF && \
    cd coin_build && \
    make install && \
    cd $BUILD_ROOT/Projects && \
    git clone --recurse-submodules --branch magiclantern https://github.com/magic-lantern-studio/soxt soxt && \
    cmake -Hsoxt -Bsoxt_build -G "Unix Makefiles" -DCMAKE_BUILD_TYPE=Release -DCMAKE_INSTALL_PREFIX=/usr/local -DCMAKE_PREFIX_PATH="/usr/local" -DSOXT_BUILD_DOCUMENTATION=OFF && \
    cd soxt_build && \
    make install && \
    cd $BUILD_ROOT/Projects && \
    git clone --recurse-submodules https://github.com/magic-lantern-studio/simage simage && \
    cmake -Hsimage -Bsimage_build -G "Unix Makefiles" -DCMAKE_INSTALL_PREFIX=/usr/local -DCMAKE_BUILD_TYPE=Release -DSIMAGE_BUILD_DOCUMENTATION=OFF && \
    cd simage_build && \
    make install

# Define environment variables
ENV MLE_HOME $BUILD_ROOT/Projects/MagicLanternStudio
ENV MLE_ROOT /opt/MagicLantern
ENV MLE_WORKPRINTS $BUILD_ROOT/Projects/MagicLanternStudio

# Build Magic Langern SDK
RUN cd $BUILD_ROOT/Projects/Github-MagicLantern && \
    git clone https://github.com/magic-lantern-studio/mle-core-env.git && \
    git clone https://github.com/magic-lantern-studio/mle-core-util.git && \
    git clone https://github.com/magic-lantern-studio/mle-core-math.git && \
    git clone https://github.com/magic-lantern-studio/mle-core-dwp.git && \
    git clone https://github.com/magic-lantern-studio/mle-core-dpp.git && \
    git clone https://github.com/magic-lantern-studio/mle-core-mlert.git && \
    git clone https://github.com/magic-lantern-studio/mle-parts.git && \
    git clone https://github.com/magic-lantern-studio/mle-players.git && \
    git clone https://github.com/magic-lantern-studio/mle-atk.git && \
    git clone https://github.com/magic-lantern-studio/mle-studio.git && \
    git clone https://github.com/magic-lantern-studio/mle-titles.git && \
    ./mle-core-env/bin/scripts/stagemle.sh && \
    mkdir /opt/MagicLantern/include && \
    tar xzf $BUILD_ROOT/Downloads/makerules.tgz -C /opt/MagicLantern/include && \
    cd $MLE_HOME/build/linux && \
    make sdk_rehearsal_install && \
    make sdk_rehearsal_clean && \
    make sdk_runtime_install && \
    make sdk_runtime_clean

# Update PATH
ENV PATH $MLE_ROOT/bin:$TCL_HOME/bin:$PATH

# Set LD_LIBRARY_PATH
ENV LD_LIBRARY_PATH $MLE_ROOT/lib:$MLE_ROOT/lib/mle/rehearsal:/usr/local/lib
