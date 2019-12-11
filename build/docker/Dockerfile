# Download base image Ubuntu 16.04
FROM ubuntu:16.04

# Install the build environment dependencies
RUN apt-get update && apt-get install -y \
    autoconf \
    autoconf-archive \
    autoconf-doc \
    autogen \
    automake \
    build-essential \
    curl \
    doxygen \
    freeglut3-dev \
    g++ \
    gawk \
    gettext \
    git \
    gnu-standards \
    libglu1-mesa-dev \
    libmotif-dev \
    libtool \
    libxmu-dev \
    libxpm-dev \
    libxt-dev \
    mesa-common-dev \
    python && \
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
COPY linux/ActiveTcl8.6.4.1.299124-linux-x86_64-threaded.tgz $BUILD_ROOT/Downloads
COPY linux/mle-patch-1.0.diff $BUILD_ROOT/Downloads

# Install Google repo command
#RUN curl https://storage.googleapis.com/git-repo-downloads/repo > $BUILD_ROOT/bin/repo && \
#    chmod a+x $BUILD_ROOT/bin/repo
#ENV PATH $BUILD_ROOT/bin:$PATH

# Install Tcl/Tk
RUN mkdir /opt/ActiveTcl-8.6 && \
    tar xzf $BUILD_ROOT/Downloads/ActiveTcl8.6.4.1.299124-linux-x86_64-threaded.tgz -C /opt/ActiveTcl-8.6
ENV TCL_HOME /opt/ActiveTcl-8.6

# Install Coin3D libraries (libCoin.so, libSoXt.so, libsimage.so)
RUN cd $BUILD_ROOT/Projects && \
    git clone https://github.com/coin3d/mle-coin3d.git coin3d-code && \
    cd coin3d-code && \
    git checkout magiclantern && \
    git apply $BUILD_ROOT/Downloads/mle-patch-1.0.diff && \
    cd .. && \
    mkdir coin3d-build && \
    cd coin3d-build && \
    ../coin3d-code/configure --enable-html --enable-man && \
    make install && \
    cd $BUILD_ROOT/Projects && \
    git clone https://github.com/coin3d/mle-SoXt.git coin3d-soxt-code && \
    cd coin3d-soxt-code && \
    git checkout magiclantern && \
    cd .. && \
    mkdir coin3d-soxt-build && \
    cd coin3d-soxt-build && \
    ../coin3d-soxt-code/configure --enable-html --enable-man && \
    make install && \
    cd $BUILD_ROOT/Projects && \
    git clone https://github.com/coin3d/mle-simage.git coin3d-simage-code && \
    mkdir coin3d-simage-build && \
    cd coin3d-simage-build && \
    ../coin3d-simage-code/configure --enable-html --enable-man && \
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
    cd $MLE_HOME/build/linux && \
    make libmlutil_install

# Update PATH
ENV PATH $MLE_ROOT/bin:$TCL_HOME/bin:$PATH
