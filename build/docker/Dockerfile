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
    libtool \
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
    mkdir $BUILD_ROOT/bin \
    mkdir /opt/MagicLantern

# Copy packages into BUILD_ROOT
COPY linux/ActiveTcl8.6.4.1.299124-linux-x86_64-threaded.tgz $BUILD_ROOT/Downloads
COPY linux/mle-patch-1.0.diff $BUILD_ROOT/Downloads

# Install Google repo command
RUN curl https://storage.googleapis.com/git-repo-downloads/repo > $BUILD_ROOT/bin/repo && \
    chmod a+x $BUILD_ROOT/bin/repo

# Install Tcl/Tk
RUN mkdir /opt/ActiveTcl-8.6 && \
    tar xzf $BUILD_ROOT/Downloads/ActiveTcl8.6.4.1.299124-linux-x86_64-threaded.tgz -C /opt/ActiveTcl-8.6
ENV TCL_HOME /opt/ActiveTcl-8.6

# Install Coin3D libraries
RUN cd $BUILD_ROOT/Projects && \
    git clone https://github.com/coin3d/mle-coin3d.git coin3d-code && \
    cd coin3d-code && \
    git checkout magiclantern && \
    git apply $BUILD_ROOT/Downloads/mle-patch-1.0.diff && \
    cd .. && \
    mkdir coin3d-build && \
    cd coin3d-build && \
    ../coin3d-code/configure --enable-html --enable-man && \
    make install

# Define environment variables
ENV MLE_HOME $BUILD_ROOT/Projects/MagicLanternStudio
ENV MLE_ROOT /opt/MagicLantern
ENV MLE_WORKPRINTS $BUILD_ROOT/Projects/MagicLanternStudio

# Update PATH
ENV PATH $MLE_ROOT/bin:$TCL_HOME/bin:$PATH
