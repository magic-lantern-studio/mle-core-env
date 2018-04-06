To build Magic Lantern using msbuild:

Requirements:

1) Standard Magic Lantern build environment is configured for
   Visual Studio 2010. Note that Visual Studio 2005 (msvc8) is no longer
   supported.

   See project web site for Wiki describing build environment.

Command-line Usage:

  msbuild build.msvc10.proj /p:Action={Clean|Build|Rebuild} /t:<target>

  where <target> includes:

  BuildSDK32		Build the 32-bit version of the runtime SDK
  BuildRehearsal32	Build the 32-bit version of the rehearsal player SDK
  BuildBrender32	Build the 32-bit version of the BRender SDK
  BuildStudio32		Build the 32-bit version of the Studio
  Build32		Build the 32-bit version of everything

  BuildSDK64		Build the 64-bit version of the runtime SDK
  BuildRehearsal64	Build the 64-bit version of the rehearsal player SDK
  BuildBrender64	Build the 64-bit version of the BRender SDK
  BuildStudio64		Build the 64-bit version of the Studio
  Build64		Build the 64-bit version of everything


Examples:

1) msbuild build.msvc10.proj

   Builds everything for the 32-bit version of Magic Lantern.

2) msbuild build.msvc10.proj /p:Configuration="Release;Debug"

   Builds Release and Debug Configurations for 32-bit version of Magic Lantern.

3) msbuild build.msvc10.proj /p:Action="<action>"

   where <action> is "Build | Clean | Rebuild"

   Build builds the 32-bit version of Magic Lantern.
   Clean removes the build artifacts of the 32-bit version of Magic Lantern
   Rebuild will clean and rebuild the 32-bit version of Magic Lanter.

   Example: msbuild build.msvc10.proj /p:Action=Rebuild
