# Makefile for building Linux targets:
#
# COPYRIGHT_BEGIN
# COPYRIGHT_END
#

# Uber targets.
#   studio build includes sdk
all: studio titles

clean: studio_clean titles_clean

install: studio_install titles_install

# Targets for Magic Lantern utility library.

$(MLE_HOME)/Core/util/linux/build/Makefile:
	cd $(MLE_HOME)/Core/util/linux/build; libtoolize; aclocal; automake --add-missing; autoconf; ./configure;

libmlutil_stage: $(MLE_HOME)/Core/util/linux/build/Makefile

libmlutil: check_env libmlutil_stage
	cd $(MLE_HOME)/Core/util/linux/build; make;

libmlutil_clean: check_env libmlutil_stage
	cd $(MLE_HOME)/Core/util/linux/build; make clean;

libmlutil_install: check_env libmlutil_stage
	cd $(MLE_HOME)/Core/util/linux/build; sudo MLE_ROOT=$(MLE_ROOT) make install;

# Targets for Magic Lantern math library.
$(MLE_HOME)/Core/math/linux/libmlmath/Makefile:
	cd $(MLE_HOME)/Core/math/linux/libmlmath; libtoolize; aclocal; automake --add-missing; autoconf; ./configure;

libmlmath_stage: $(MLE_HOME)/Core/math/linux/libmlmath/Makefile

libmlmath: check_env libmlmath_stage
	cd $(MLE_HOME)/Core/math/linux/libmlmath; make;

libmlmath_clean: check_env libmlmath_stage
	cd $(MLE_HOME)/Core/math/linux/libmlmath; make clean;

libmlmath_install: check_env libmlmath_stage
	cd $(MLE_HOME)/Core/math/linux/libmlmath; sudo MLE_ROOT=$(MLE_ROOT) make install;

libmlmath-test: check_env
	cd $(MLE_HOME)/Core/math/linux/libmlmathtest; make;

libmlmath-test_clean: check_env
	cd $(MLE_HOME)/Core/math/linux/libmlmathtest; make clean;

libmlmath-test_install: check_env
	cd $(MLE_HOME)/Core/math/linux/libmlmathtest; sudo MLE_ROOT=$(MLE_ROOT) make install;

# Targets for Magic Lantern DigitalWorkprint library.
libDWP: check_env
	cd $(MLE_HOME)/DigitalWorkprint/lib/linux; make;

libDWP_clean: check_env
	cd $(MLE_HOME)/DigitalWorkprint/lib/linux; make clean;

libDWP_install: check_env
	cd $(MLE_HOME)/DigitalWorkprint/lib/linux; sudo MLE_ROOT=$(MLE_ROOT) make install;

# Targets for Magic Lantern DigitalPlayprint library.
libDPP: check_env
	cd $(MLE_HOME)/DigitalPlayprint/lib/linux; make;

libDPP_clean: check_env
	cd $(MLE_HOME)/DigitalPlayprint/lib/linux; make clean;

libDPP_install: check_env
	cd $(MLE_HOME)/DigitalPlayprint/lib/linux; sudo MLE_ROOT=$(MLE_ROOT) make install;

# Targets for Magic Lantern DigitalPlayprint Runtime Library.
libplayprint: check_env
	cd $(MLE_HOME)/DigitalPlayprint/runtime/linux; make;

libplayprint_clean: check_env
	cd $(MLE_HOME)/DigitalPlayprint/runtime/linux; make clean;

libplayprint_install: check_env
	cd $(MLE_HOME)/DigitalPlayprint/runtime/linux; sudo MLE_ROOT=$(MLE_ROOT) make install;

#
# Targets for Magic Lantern mastering tools.
#

# Build rules for DPPGen mastering library.
libDPPGen: check_env
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/libDPPGen; make;

libDPPGen_clean: check_env
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/libDPPGen; make clean;

libDPPGen_install: check_env
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/libDPPGen; sudo MLE_ROOT=$(MLE_ROOT) make install;

# Build rules for gentables mastering tool.
gentables: check_env libDPPGen
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/gentables; make;

gentables_clean: check_env libDPPGen_clean
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/gentables; make clean;

gentables_install: check_env libDPPGen_install
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/gentables; sudo MLE_ROOT=$(MLE_ROOT) make install;

# Build rules for gengroup mastering tool.
gengroup: check_env libDPPGen
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/gengroup; make;

gengroup_clean: check_env libDPPGen_clean
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/gengroup; make clean;

gengroup_install: check_env libDPPGen_install
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/gengroup; sudo MLE_ROOT=$(MLE_ROOT) make install;

# Build rules for genscene mastering tool.
genscene: check_env libDPPGen
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/genscene; make;

genscene_clean: check_env libDPPGen_clean
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/genscene; make clean;

genscene_install: check_env libDPPGen_install
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/genscene; sudo MLE_ROOT=$(MLE_ROOT) make install;

# Build rules for genmedia mastering tool.
genmedia: check_env libDPPGen
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/genmedia; make;

genmedia_clean: check_env libDPPGen_clean
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/genmedia; make clean;

genmedia_install: check_env libDPPGen_install
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/genmedia; sudo MLE_ROOT=$(MLE_ROOT) make install;

# Build rules for genmakefile mastering tool.
genmakefile: check_env libDPPGen
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/genmakefile; make;

genmakefile_clean: check_env libDPPGen_clean
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/genmakefile; make clean;

genmakefile_install: check_env libDPPGen_install
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/genmakefile; sudo MLE_ROOT=$(MLE_ROOT) make install;

# Build rules for genppscript mastering tool.
genppscript: check_env libDPPGen
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/genppscript; make;

genppscript_clean: check_env libDPPGen_clean
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/genppscript; make clean;

genppscript_install: check_env libDPPGen_install
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/genppscript; sudo MLE_ROOT=$(MLE_ROOT) make install;

# Build rules for gendpp mastering tool.
gendpp: check_env libDPPGen
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/gendpp; make;

gendpp_clean: check_env libDPPGen_clean
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/gendpp; make clean;

gendpp_install: check_env libDPPGen_install
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/gendpp; sudo MLE_ROOT=$(MLE_ROOT) make install;

# Build rules for dumpgroup mastering tool.
dumpgroup: check_env libDPPGen
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/dumpgroup; make;

dumpgroup_clean: check_env libDPPGen_clean
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/dumpgroup; make clean;

dumpgroup_install: check_env libDPPGen_install
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/dumpgroup; sudo MLE_ROOT=$(MLE_ROOT) make install;

# Build rules for dumpscene mastering tool.
dumpscene: check_env libDPPGen
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/dumpscene; make;

dumpscene_clean: check_env libDPPGen_clean
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/dumpscene; make clean;

dumpscene_install: check_env libDPPGen_install
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/dumpscene; sudo MLE_ROOT=$(MLE_ROOT) make install;

# Build rules for dumpmedia mastering tool.
dumpmedia: check_env libDPPGen
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/dumpmedia; make;

dumpmedia_clean: check_env libDPPGen_clean
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/dumpmedia; make clean;

dumpmedia_install: check_env libDPPGen_install
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/dumpmedia; sudo MLE_ROOT=$(MLE_ROOT) make install;

# Build rules for dumpdpp mastering tool.
dumpdpp: check_env libDPPGen
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/dumpdpp; make;

dumpdpp_clean: check_env libDPPGen_clean
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/dumpdpp; make clean;

dumpdpp_install: check_env libDPPGen_install
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/dumpdpp; sudo MLE_ROOT=$(MLE_ROOT) make install;

# Build rules for all mastering components.
master: libDPPGen gentables gengroup genscene genmedia genmakefile genppscript gendpp dumpgroup dumpscene dumpmedia dumpdpp

master_clean: libDPPGen_clean gentables_clean gengroup_clean genscene_clean genmedia_clean genmakefile_clean genppscript_clean gendpp_clean dumpgroup_clean dumpscene_clean dumpmedia_clean dumpdpp_clean

master_install: libDPPGen_install gentables_install gengroup_install genscene_install genmedia_install genmakefile_install genppscript_install gendpp_install dumpgroup_install dumpscene_install dumpmedia_install dumpdpp_install

# Targets for Magic Lantern Runtime Engine libraries.
libmlert: check_env
	cd $(MLE_HOME)/Core/mlert/linux/rehearsal; make;
	cd $(MLE_HOME)/Core/mlert/linux/runtime; make;

libmlert_clean: check_env
	cd $(MLE_HOME)/Core/mlert/linux/rehearsal; make clean;
	cd $(MLE_HOME)/Core/mlert/linux/runtime; make clean;

libmlert_install: check_env
	cd $(MLE_HOME)/Core/mlert/linux/rehearsal; sudo MLE_ROOT=$(MLE_ROOT) make install;
	cd $(MLE_HOME)/Core/mlert/linux/runtime; sudo MLE_ROOT=$(MLE_ROOT) make install;

libmlert-test: check_env
	cd $(MLE_HOME)/Core/mlert/linux/rehearsal-unittest; make;
	cd $(MLE_HOME)/Core/mlert/linux/runtime-unittest; make;

libmlert-test_clean: check_env
	cd $(MLE_HOME)/Core/mlert/linux/rehearsal-unittest; make clean;
	cd $(MLE_HOME)/Core/mlert/linux/runtime-unittest; make clean;

libmlert-test_install: check_env
	cd $(MLE_HOME)/Core/mlert/linux/rehearsal-unittest; sudo MLE_ROOT=$(MLE_ROOT) make install;
	cd $(MLE_HOME)/Core/mlert/linux/runtime-unittest; sudo MLE_ROOT=$(MLE_ROOT) make install;

# Targets for Magic Lantern SDK Properties
props: check_env
	cd $(MLE_HOME)/Parts/props/linux; make;

props_clean: check_env
	cd $(MLE_HOME)/Parts/props/linux; make clean;

props_install: check_env
	cd $(MLE_HOME)/Parts/props/linux; sudo MLE_ROOT=$(MLE_ROOT) make install;

# Targets for Magic Lantern SDK Roles
roles: check_env
	cd $(MLE_HOME)/Parts/roles/inventor/build/linux; make;

roles_clean: check_env
	cd $(MLE_HOME)/Parts/roles/inventor/build/linux; make clean;

roles_install: check_env
	cd $(MLE_HOME)/Parts/roles/inventor/build/linux; sudo MLE_ROOT=$(MLE_ROOT) make install;

# Targets for Magic Lantern SDK MediaRefs
mediarefs: check_env
	cd $(MLE_HOME)/Parts/mediaref/rehearsal/build/linux; make;

mediarefs_clean: check_env
	cd $(MLE_HOME)/Parts/mediaref/rehearsal/build/linux; make clean;

mediarefs_install: check_env
	cd $(MLE_HOME)/Parts/mediaref/rehearsal/build/linux; sudo MLE_ROOT=$(MLE_ROOT) make install;

# Targets for Magic Lantern SDK Sets
sets: check_env
	cd $(MLE_HOME)/Parts/sets/inventor/linux; make;

sets_clean: check_env
	cd $(MLE_HOME)/Parts/sets/inventor/linux; make clean;

sets_install: check_env
	cd $(MLE_HOME)/Parts/sets/inventor/linux; sudo MLE_ROOT=$(MLE_ROOT) make install;

# Targets for Magic Lantern SDK Stages
stages: check_env
	cd $(MLE_HOME)/Parts/stages/rehearsal/build/linux; make;

stages_clean: check_env
	cd $(MLE_HOME)/Parts/stages/rehearsal/build/linux; make clean;

stages_install: check_env
	cd $(MLE_HOME)/Parts/stages/rehearsal/build/linux; sudo MLE_ROOT=$(MLE_ROOT) make install;

# Targets for Magic Lantern SDK Actors
actors: check_env
	cd $(MLE_HOME)/Parts/actors/rehearsal/build/linux; make;

actors_clean: check_env
	cd $(MLE_HOME)/Parts/actors/rehearsal/build/linux; make clean;

actors_install: check_env
	cd $(MLE_HOME)/Parts/actors/rehearsal/build/linux; sudo MLE_ROOT=$(MLE_ROOT) make install;

# Targets for Magic Lantern SDK Players
players: check_env
	cd $(MLE_HOME)/Players/rehearsal/build/linux; make;

players_clean: check_env
	cd $(MLE_HOME)/Players/rehearsal/build/linux; make clean;

players_install: check_env
	cd $(MLE_HOME)/Players/rehearsal/build/linux; sudo MLE_ROOT=$(MLE_ROOT) make install;

# Targets for Magic Lantern Qt Stage.
qtstage: check_env
	cd $(MLE_HOME)/Parts/stages/qt/build/build-mleqtstage-Desktop_Qt_5_8_0_GCC_64bit-Debug; make;

qtstage_clean: check_env
	cd $(MLE_HOME)/Parts/stages/qt/build/build-mleqtstage-Desktop_Qt_5_8_0_GCC_64bit-Debug; make clean;

qtstage_install: check_env
	cd $(MLE_HOME)/Parts/stages/qt/build/build-mleqtstage-Desktop_Qt_5_8_0_GCC_64bit-Debug; sudo MLE_ROOT=$(MLE_ROOT) make install;

# Targets for Magic Lantern Qt Set.
qtset: check_env
	cd $(MLE_HOME)/Parts/sets/qt/build/build-mleqtset-Desktop_Qt_5_8_0_GCC_64bit-Debug; make;

qtset_clean: check_env
	cd $(MLE_HOME)/Parts/sets/qt/build/build-mleqtset-Desktop_Qt_5_8_0_GCC_64bit-Debug; make clean;

qtset_install: check_env
	cd $(MLE_HOME)/Parts/sets/qt/build/build-mleqtset-Desktop_Qt_5_8_0_GCC_64bit-Debug; sudo MLE_ROOT=$(MLE_ROOT) make install;

# Targets for Magic Lantern Qt Mediaref.
qtmref: check_env
	cd $(MLE_HOME)/Parts/mediaref/qt/build/build-mleqtmref-Desktop_Qt_5_8_0_GCC_64bit-Debug; make;

qtmref_clean: check_env
	cd $(MLE_HOME)/Parts/mediaref/qt/build/build-mleqtmref-Desktop_Qt_5_8_0_GCC_64bit-Debug; make clean;

qtmref_install: check_env
	cd $(MLE_HOME)/Parts/mediaref/qt/build/build-mleqtmref-Desktop_Qt_5_8_0_GCC_64bit-Debug; sudo MLE_ROOT=$(MLE_ROOT) make install;

# Targets for Magic Lantern Qt Role.
qtrole: check_env
	cd $(MLE_HOME)/Parts/roles/qt/build/build-mleqtrole-Desktop_Qt_5_8_0_GCC_64bit-Debug; make;

qtrole_clean: check_env
	cd $(MLE_HOME)/Parts/roles/qt/build/build-mleqtrole-Desktop_Qt_5_8_0_GCC_64bit-Debug; make clean;

qtrole_install: check_env
	cd $(MLE_HOME)/Parts/roles/qt/build/build-mleqtrole-Desktop_Qt_5_8_0_GCC_64bit-Debug; sudo MLE_ROOT=$(MLE_ROOT) make install;

# Qt Targets
qt: qtstage qtset qtmref qtrole

qt_clean: qtstage_clean qtset_clean qtmref_clean qtrole_clean

qt_install: qtstage_install qtset_install qtmref_install qtrole_install

# Magic Lantern SDK
#  sdk build includes Qt target for Linux
sdk: libmlutil libmlmath libDWP libDPP libplayprint libDPPGen gentables gengroup genscene genmedia genmakefile genppscript gendpp dumpgroup dumpscene dumpmedia dumpdpp libmlert props roles mediarefs sets stages actors players qt

sdk_clean: libmlutil_clean libmlmath_clean libDWP_clean libDPP_clean libplayprint_clean libDPPGen_clean gentables_clean gengroup_clean genscene_clean genmedia_clean genmakefile_clean genppscript_clean gendpp_clean dumpgroup_clean dumpscene_clean dumpmedia_clean dumpdpp_clean libmlert_clean props_clean roles_clean mediarefs_clean sets_clean stages_clean actors_clean players_clean qt_clean

sdk_install: libmlutil_install libmlmath_install libDWP_install libDPP_install libplayprint_install libDPPGen_install gentables_install gengroup_install genscene_install genmedia_install genmakefile_install genppscript_install gendpp_install dumpgroup_install dumpscene_install dumpmedia_install dumpdpp_install libmlert_install props_install roles_install mediarefs_install sets_install stages_install actors_install players_install qt_install

# Targets for Magic Lantern SDK Titles
null: check_env qt
	cd $(MLE_HOME)/Titles/null/qt/build/build-null-Desktop_Qt_5_8_0_GCC_64bit-Debug; make;

null_clean: check_env qt_clean
	cd $(MLE_HOME)/Titles/null/qt/build/build-null-Desktop_Qt_5_8_0_GCC_64bit-Debug; make clean;

null_install: check_env qt_install
	cd $(MLE_HOME)/Titles/null/qt/build/build-null-Desktop_Qt_5_8_0_GCC_64bit-Debug; sudo MLE_ROOT=$(MLE_ROOT) make install;

# Magic Lantern Titles
titles: null

titles_clean: null_clean

titles_install: null_install

# Targets for Magic Lantern Authoring Toolkit (ATK)
libmleatk: check_env
	cd $(MLE_HOME)/ATK/linux/rehearsal; make;

libmleatk_clean: check_env
	cd $(MLE_HOME)/ATK/linux/rehearsal; make clean;

libmleatk_install: check_env
	cd $(MLE_HOME)/ATK/linux/rehearsal; sudo MLE_ROOT=$(MLE_ROOT) make install;

# Targets for Magic Lantern utility library.
libDwpReader: check_env
	cd $(MLE_HOME)/Studio/DwpReader/linux/DwpReader; make;

libDwpReader_clean: check_env
	cd $(MLE_HOME)/Studio/DwpReader/linux/DwpReader; make clean;

libDwpReader_install: check_env
	cd $(MLE_HOME)/Studio/DwpReader/linux/DwpReader; sudo MLE_ROOT=$(MLE_ROOT) make install;
	cd $(MLE_HOME)/Studio/DwpReader/linux/DwpReader/libDwpReader; sudo MLE_HOME=$(MLE_HOME) make install_plugin;

# Magic Lantern Studio
studio: sdk libmleatk libDwpReader

studio_clean: sdk_clean libmleatk_clean libDwpReader_clean

studio_install: sdk_install libmleatk_install libDwpReader_install

# Magic Lantern Studio Unit Tests
unittests: studio libmlmath-test libmlert-test

unittests_clean: studio_clean libmlmath-test_clean libmlert-test_clean

unittests_install: studio_install libmlmath-test_install libmlert-test_install

.PHONY: check_MLE_HOME check_MLE_ROOT check_MLE_WORKPRINTS check_TCL_HOME

# Make sure environment variables are set.
check_MLE_HOME:
	@if test "$(MLE_HOME)" = "" ; then \
	echo "***** MLE_HOME environment variable not set."; \
	exit 1; \
	fi

check_MLE_ROOT:
	@if test "$(MLE_ROOT)" = "" ; then \
	echo "***** MLE_ROOT environment variable not set."; \
	exit 1; \
	fi

check_MLE_WORKPRINTS:
	@if test "$(MLE_WORKPRINTS)" = "" ; then \
	echo "***** MLE_WORKPRINTS environment variable not set."; \
	exit 1; \
	fi

check_TCL_HOME:
	@if test "$(TCL_HOME)" = "" ; then \
	echo "***** TCL_HOME environment variable not set."; \
	exit 1; \
	fi

check_env: check_MLE_HOME check_MLE_ROOT check_MLE_WORKPRINTS check_TCL_HOME
	@echo "Using Magic Lantern environment:"; \
	echo "    MLE_HOME= $(MLE_HOME)"; \
	echo "    MLE_ROOT= $(MLE_ROOT)"; \
	echo "    MLE_WORKPRINTS= $(MLE_WORKPRINTS)"; \
	echo "    JAVA_HOME= $(JAVA_HOME)"; \
	echo "    TCL_HOME= $(TCL_HOME)"; \
	echo "    PATH= $(PATH)"; \
	echo "";
