To build Magic Lantern using msbuild:

Requirements:

1) Standard Magic Lantern build environment is configured for
   Visual Studio 2022. Note that Visual Studio 2017 (msvc15), 2010 (msvc10)
   and 2005 (msvc8) are no longer supported.

   See project web site for Wiki describing build environment.

Command-line Usage:

  msbuild build.msvc17.proj /p:Action={Clean|Build|Rebuild} /t:<target>

  where <target> includes:

  BuildSDK64		Build the 64-bit version of the runtime SDK
  BuildRehearsal64	Build the 64-bit version of the rehearsal player SDK
  BuildStudio64		Build the 64-bit version of the Studio
  Build64		Build the 64-bit version of everything


Examples:

1) msbuild build.msvc17.proj

   Builds everything for the 64-bit version of Magic Lantern.

2) msbuild build.msvc17.proj /p:Configuration="Release;Debug"

   Builds Release and Debug Configurations for 64-bit version of Magic Lantern.

3) msbuild build.msvc17.proj /p:Action="<action>"

   where <action> is "Build | Clean | Rebuild"

   Build builds the 64-bit version of Magic Lantern.
   Clean removes the build artifacts of the 64-bit version of Magic Lantern
   Rebuild will clean and rebuild the 64-bit version of Magic Lanter.

   Example: msbuild build.msvc17.proj /p:Action=Rebuild
