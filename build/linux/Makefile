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
	cd $(MLE_HOME)/Core/util/linux/build; sudo -Eu $(USER) MLE_ROOT=$(MLE_ROOT) make install;

# Targets for Magic Lantern math library.
$(MLE_HOME)/Core/math/linux/libmlmath/Makefile:
	cd $(MLE_HOME)/Core/math/linux/libmlmath; libtoolize; aclocal; automake --add-missing; autoconf; ./configure;

libmlmath_stage: $(MLE_HOME)/Core/math/linux/libmlmath/Makefile

libmlmath: check_env libmlmath_stage
	cd $(MLE_HOME)/Core/math/linux/libmlmath; make;

libmlmath_clean: check_env libmlmath_stage
	cd $(MLE_HOME)/Core/math/linux/libmlmath; make clean;

libmlmath_install: check_env libmlmath_stage
	cd $(MLE_HOME)/Core/math/linux/libmlmath; sudo -Eu $(USER) MLE_ROOT=$(MLE_ROOT) make install;

$(MLE_HOME)/Core/math/linux/libmlmathtest/Makefile:
	cd $(MLE_HOME)/Core/math/linux/libmlmathtest; libtoolize; aclocal; automake --add-missing; autoconf; ./configure;

libmlmath-test_stage: $(MLE_HOME)/Core/math/linux/libmlmathtest/Makefile

libmlmath-test: check_env libmlmath-test_stage
	cd $(MLE_HOME)/Core/math/linux/libmlmathtest; make;

libmlmath-test_clean: check_env libmlmath-test_stage
	cd $(MLE_HOME)/Core/math/linux/libmlmathtest; make clean;

libmlmath-test_install: check_env libmlmath-test_stage
	cd $(MLE_HOME)/Core/math/linux/libmlmathtest; sudo -Eu $(USER) MLE_ROOT=$(MLE_ROOT) make install;

# Targets for Magic Lantern DigitalWorkprint library.
$(MLE_HOME)/DigitalWorkprint/lib/linux/Makefile:
	cd $(MLE_HOME)/DigitalWorkprint/lib/linux; libtoolize; aclocal; automake --add-missing; autoconf; ./configure;

libDWP_stage: $(MLE_HOME)/DigitalWorkprint/lib/linux/Makefile

libDWP: check_env libDWP_stage
	cd $(MLE_HOME)/DigitalWorkprint/lib/linux; make;

libDWP_clean: check_env libDWP_stage
	cd $(MLE_HOME)/DigitalWorkprint/lib/linux; make clean;

libDWP_install: check_env libDWP_stage
	cd $(MLE_HOME)/DigitalWorkprint/lib/linux; sudo -Eu $(USER) MLE_ROOT=$(MLE_ROOT) make install;

# Targets for Magic Lantern DigitalPlayprint library.
$(MLE_HOME)/DigitalPlayprint/lib/linux/Makefile:
	cd $(MLE_HOME)/DigitalPlayprint/lib/linux; libtoolize; aclocal; automake --add-missing; autoconf; ./configure;

libDPP_stage: $(MLE_HOME)/DigitalPlayprint/lib/linux/Makefile

libDPP: check_env libDPP_stage
	cd $(MLE_HOME)/DigitalPlayprint/lib/linux; make;

libDPP_clean: check_env libDPP_stage
	cd $(MLE_HOME)/DigitalPlayprint/lib/linux; make clean;

libDPP_install: check_env libDPP_stage
	cd $(MLE_HOME)/DigitalPlayprint/lib/linux; sudo -Eu $(USER) MLE_ROOT=$(MLE_ROOT) make install;

# Targets for Magic Lantern DigitalPlayprint Runtime Library.
$(MLE_HOME)/DigitalPlayprint/runtime/linux/Makefile:
	cd $(MLE_HOME)/DigitalPlayprint/runtime/linux; libtoolize; aclocal; automake --add-missing; autoconf; ./configure;

libplayprint_stage: $(MLE_HOME)/DigitalPlayprint/runtime/linux/Makefile

libplayprint: check_env libplayprint_stage
	cd $(MLE_HOME)/DigitalPlayprint/runtime/linux; make;

libplayprint_clean: check_env libplayprint_stage
	cd $(MLE_HOME)/DigitalPlayprint/runtime/linux; make clean;

libplayprint_install: check_env libplayprint_stage
	cd $(MLE_HOME)/DigitalPlayprint/runtime/linux; sudo -Eu $(USER) MLE_ROOT=$(MLE_ROOT) make install;

#
# Targets for Magic Lantern mastering tools.
#

# Build rules for DPPGen mastering library.
$(MLE_HOME)/DigitalPlayprint/master/linux/libDPPGen/Makefile:
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/libDPPGen; libtoolize; aclocal; automake --add-missing; autoconf; ./configure;

libDPPGen_stage: $(MLE_HOME)/DigitalPlayprint/master/linux/libDPPGen/Makefile

libDPPGen: check_env libDPPGen_stage
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/libDPPGen; make;

libDPPGen_clean: check_env libDPPGen_stage
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/libDPPGen; make clean;

libDPPGen_install: check_env libDPPGen_stage
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/libDPPGen; sudo -Eu $(USER) MLE_ROOT=$(MLE_ROOT) make install;

# Build rules for gentables mastering tool.
$(MLE_HOME)/DigitalPlayprint/master/linux/gentables/Makefile:
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/gentables; libtoolize; aclocal; automake --add-missing; autoconf; ./configure;

gentables_stage: $(MLE_HOME)/DigitalPlayprint/master/linux/gentables/Makefile

gentables: check_env libDPPGen gentables_stage
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/gentables; make;

gentables_clean: check_env libDPPGen_clean gentables_stage
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/gentables; make clean;

gentables_install: check_env libDPPGen_install gentables_stage
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/gentables; sudo -Eu $(USER) MLE_ROOT=$(MLE_ROOT) make install;

# Build rules for gengroup mastering tool.
$(MLE_HOME)/DigitalPlayprint/master/linux/gengroup/Makefile:
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/gengroup; libtoolize; aclocal; automake --add-missing; autoconf; ./configure;

gengroup_stage: $(MLE_HOME)/DigitalPlayprint/master/linux/gengroup/Makefile

gengroup: check_env libDPPGen gengroup_stage
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/gengroup; make;

gengroup_clean: check_env libDPPGen_clean gengroup_stage
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/gengroup; make clean;

gengroup_install: check_env libDPPGen_install gengroup_stage
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/gengroup; sudo -Eu $(USER) MLE_ROOT=$(MLE_ROOT) make install;

# Build rules for genscene mastering tool.
$(MLE_HOME)/DigitalPlayprint/master/linux/genscene/Makefile:
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/genscene; libtoolize; aclocal; automake --add-missing; autoconf; ./configure;

genscene_stage: $(MLE_HOME)/DigitalPlayprint/master/linux/genscene/Makefile

genscene: check_env libDPPGen genscene_stage
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/genscene; make;

genscene_clean: check_env libDPPGen_clean genscene_stage
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/genscene; make clean;

genscene_install: check_env libDPPGen_install genscene_stage
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/genscene; sudo -Eu $(USER) MLE_ROOT=$(MLE_ROOT) make install;

# Build rules for genmedia mastering tool.
$(MLE_HOME)/DigitalPlayprint/master/linux/genmedia/Makefile:
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/genmedia; libtoolize; aclocal; automake --add-missing; autoconf; ./configure;

genmedia_stage: $(MLE_HOME)/DigitalPlayprint/master/linux/genmedia/Makefile

genmedia: check_env libDPPGen genmedia_stage
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/genmedia; make;

genmedia_clean: check_env libDPPGen_clean genmedia_stage
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/genmedia; make clean;

genmedia_install: check_env libDPPGen_install genmedia_stage
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/genmedia; sudo -Eu $(USER) MLE_ROOT=$(MLE_ROOT) make install;

# Build rules for genmakefile mastering tool.
$(MLE_HOME)/DigitalPlayprint/master/linux/genmakefile/Makefile:
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/genmakefile; libtoolize; aclocal; automake --add-missing; autoconf; ./configure;

genmakefile_stage: $(MLE_HOME)/DigitalPlayprint/master/linux/genmakefile/Makefile

genmakefile: check_env libDPPGen genmakefile_stage
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/genmakefile; make;

genmakefile_clean: check_env libDPPGen_clean genmakefile_stage
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/genmakefile; make clean;

genmakefile_install: check_env libDPPGen_install genmakefile_stage
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/genmakefile; sudo -Eu $(USER) MLE_ROOT=$(MLE_ROOT) make install;

# Build rules for genppscript mastering tool.
$(MLE_HOME)/DigitalPlayprint/master/linux/genppscript/Makefile:
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/genppscript; libtoolize; aclocal; automake --add-missing; autoconf; ./configure;

genppscript_stage: $(MLE_HOME)/DigitalPlayprint/master/linux/genppscript/Makefile

genppscript: check_env libDPPGen genppscript_stage
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/genppscript; make;

genppscript_clean: check_env libDPPGen_clean genppscript_stage
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/genppscript; make clean;

genppscript_install: check_env libDPPGen_install genppscript_stage
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/genppscript; sudo -Eu $(USER) MLE_ROOT=$(MLE_ROOT) make install;

# Build rules for gendpp mastering tool.
$(MLE_HOME)/DigitalPlayprint/master/linux/gendpp/Makefile:
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/gendpp; libtoolize; aclocal; automake --add-missing; autoconf; ./configure;

gendpp_stage: $(MLE_HOME)/DigitalPlayprint/master/linux/gendpp/Makefile

gendpp: check_env libDPPGen gendpp_stage
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/gendpp; make;

gendpp_clean: check_env libDPPGen_clean gendpp_stage
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/gendpp; make clean;

gendpp_install: check_env libDPPGen_install gendpp_stage
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/gendpp; sudo -Eu $(USER) MLE_ROOT=$(MLE_ROOT) make install;

# Build rules for dumpgroup mastering tool.
$(MLE_HOME)/DigitalPlayprint/master/linux/dumpgroup/Makefile:
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/dumpgroup; libtoolize; aclocal; automake --add-missing; autoconf; ./configure;

dumpgroup_stage: $(MLE_HOME)/DigitalPlayprint/master/linux/dumpgroup/Makefile

dumpgroup: check_env libDPPGen dumpgroup_stage
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/dumpgroup; make;

dumpgroup_clean: check_env libDPPGen_clean dumpgroup_stage
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/dumpgroup; make clean;

dumpgroup_install: check_env libDPPGen_install dumpgroup_stage
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/dumpgroup; sudo -Eu $(USER) MLE_ROOT=$(MLE_ROOT) make install;

# Build rules for dumpscene mastering tool.
$(MLE_HOME)/DigitalPlayprint/master/linux/dumpscene/Makefile:
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/dumpscene; libtoolize; aclocal; automake --add-missing; autoconf; ./configure;

dumpscene_stage: $(MLE_HOME)/DigitalPlayprint/master/linux/dumpscene/Makefile

dumpscene: check_env libDPPGen dumpscene_stage
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/dumpscene; make;

dumpscene_clean: check_env libDPPGen_clean dumpscene_stage
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/dumpscene; make clean;

dumpscene_install: check_env libDPPGen_install dumpscene_stage
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/dumpscene; sudo -Eu $(USER) MLE_ROOT=$(MLE_ROOT) make install;

# Build rules for dumpmedia mastering tool.
$(MLE_HOME)/DigitalPlayprint/master/linux/dumpmedia/Makefile:
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/dumpmedia; libtoolize; aclocal; automake --add-missing; autoconf; ./configure;

dumpmedia_stage: $(MLE_HOME)/DigitalPlayprint/master/linux/dumpmedia/Makefile

dumpmedia: check_env libDPPGen dumpmedia_stage
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/dumpmedia; make;

dumpmedia_clean: check_env libDPPGen_clean dumpmedia_stage
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/dumpmedia; make clean;

dumpmedia_install: check_env libDPPGen_install dumpmedia_stage
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/dumpmedia; sudo -Eu $(USER) MLE_ROOT=$(MLE_ROOT) make install;

# Build rules for dumpdpp mastering tool.
$(MLE_HOME)/DigitalPlayprint/master/linux/dumpdpp/Makefile:
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/dumpdpp; libtoolize; aclocal; automake --add-missing; autoconf; ./configure;

dumpdpp_stage: $(MLE_HOME)/DigitalPlayprint/master/linux/dumpdpp/Makefile

dumpdpp: check_env libDPPGen dumpdpp_stage
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/dumpdpp; make;

dumpdpp_clean: check_env libDPPGen_clean dumpdpp_stage
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/dumpdpp; make clean;

dumpdpp_install: check_env libDPPGen_install dumpdpp_stage
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/dumpdpp; sudo -Eu $(USER) MLE_ROOT=$(MLE_ROOT) make install;

# Build rules for all mastering components.
master: libDPPGen gentables gengroup genscene genmedia genmakefile genppscript gendpp dumpgroup dumpscene dumpmedia dumpdpp

master_clean: libDPPGen_clean gentables_clean gengroup_clean genscene_clean genmedia_clean genmakefile_clean genppscript_clean gendpp_clean dumpgroup_clean dumpscene_clean dumpmedia_clean dumpdpp_clean

master_install: libDPPGen_install gentables_install gengroup_install genscene_install genmedia_install genmakefile_install genppscript_install gendpp_install dumpgroup_install dumpscene_install dumpmedia_install dumpdpp_install

# Targets for Magic Lantern Runtime Engine libraries.
$(MLE_HOME)/Core/mlert/linux/rehearsal/Makefile:
	cd $(MLE_HOME)/Core/mlert/linux/rehearsal; libtoolize; aclocal; automake --add-missing; autoconf; ./configure;

$(MLE_HOME)/Core/mlert/linux/runtime/Makefile:
	cd $(MLE_HOME)/Core/mlert/linux/runtime; libtoolize; aclocal; automake --add-missing; autoconf; ./configure;

libmlert_stage: $(MLE_HOME)/Core/mlert/linux/rehearsal/Makefile $(MLE_HOME)/Core/mlert/linux/runtime/Makefile

libmlert: check_env libmlert_stage
	cd $(MLE_HOME)/Core/mlert/linux/rehearsal; make;
	cd $(MLE_HOME)/Core/mlert/linux/runtime; make;

libmlert_clean: check_env libmlert_stage
	cd $(MLE_HOME)/Core/mlert/linux/rehearsal; make clean;
	cd $(MLE_HOME)/Core/mlert/linux/runtime; make clean;

libmlert_install: check_env libmlert_stage
	cd $(MLE_HOME)/Core/mlert/linux/rehearsal; sudo -Eu $(USER) MLE_ROOT=$(MLE_ROOT) make install;
	cd $(MLE_HOME)/Core/mlert/linux/runtime; sudo -Eu $(USER) MLE_ROOT=$(MLE_ROOT) make install;

$(MLE_HOME)/Core/mlert/linux/rehearsal-unittest/Makefile:
	cd $(MLE_HOME)/Core/mlert/linux/rehearsal-unittest; libtoolize; aclocal; automake --add-missing; autoconf; ./configure;

$(MLE_HOME)/Core/mlert/linux/runtime-unittest/Makefile:
	cd $(MLE_HOME)/Core/mlert/linux/runtime-unittest; libtoolize; aclocal; automake --add-missing; autoconf; ./configure;

libmlert-test_stage: $(MLE_HOME)/Core/mlert/linux/rehearsal-unittest/Makefile $(MLE_HOME)/Core/mlert/linux/runtime-unittest/Makefile

libmlert-test: check_env libmlert-test_stage
	cd $(MLE_HOME)/Core/mlert/linux/rehearsal-unittest; make;
	cd $(MLE_HOME)/Core/mlert/linux/runtime-unittest; make;

libmlert-test_clean: check_env libmlert-test_stage
	cd $(MLE_HOME)/Core/mlert/linux/rehearsal-unittest; make clean;
	cd $(MLE_HOME)/Core/mlert/linux/runtime-unittest; make clean;

libmlert-test_install: check_env libmlert-test_stage
	cd $(MLE_HOME)/Core/mlert/linux/rehearsal-unittest; sudo -Eu $(USER) MLE_ROOT=$(MLE_ROOT) make install;
	cd $(MLE_HOME)/Core/mlert/linux/runtime-unittest; sudo -Eu $(USER) MLE_ROOT=$(MLE_ROOT) make install;

# Targets for Magic Lantern SDK Properties
props: check_env
	cd $(MLE_HOME)/Parts/props/linux; make;

props_clean: check_env
	cd $(MLE_HOME)/Parts/props/linux; make clean;

props_install: check_env
	cd $(MLE_HOME)/Parts/props/linux; sudo -Eu $(USER) MLE_ROOT=$(MLE_ROOT) make install;

# Targets for Magic Lantern SDK Roles
$(MLE_HOME)/Parts/roles/inventor/build/linux/Makefile:
	cd $(MLE_HOME)/Parts/roles/inventor/build/linux; libtoolize; aclocal; automake --add-missing; autoconf; ./configure;

roles_stage: $(MLE_HOME)/Parts/roles/inventor/build/linux/Makefile

roles: check_env roles_stage
	cd $(MLE_HOME)/Parts/roles/inventor/build/linux; make;

roles_clean: check_env roles_stage
	cd $(MLE_HOME)/Parts/roles/inventor/build/linux; make clean;

roles_install: check_env roles_stage
	cd $(MLE_HOME)/Parts/roles/inventor/build/linux; sudo -Eu $(USER) MLE_ROOT=$(MLE_ROOT) make install;

# Targets for Magic Lantern SDK MediaRefs
$(MLE_HOME)/Parts/mediaref/rehearsal/build/linux/Makefile:
	cd $(MLE_HOME)/Parts/mediaref/rehearsal/build/linux; libtoolize; aclocal; automake --add-missing; autoconf; ./configure;

mediarefs_stage: $(MLE_HOME)/Parts/mediaref/rehearsal/build/linux/Makefile

mediarefs: check_env mediarefs_stage
	cd $(MLE_HOME)/Parts/mediaref/rehearsal/build/linux; make;

mediarefs_clean: check_env mediarefs_stage
	cd $(MLE_HOME)/Parts/mediaref/rehearsal/build/linux; make clean;

mediarefs_install: check_env mediarefs_stage
	cd $(MLE_HOME)/Parts/mediaref/rehearsal/build/linux; sudo -Eu $(USER) MLE_ROOT=$(MLE_ROOT) make install;

# Targets for Magic Lantern SDK Sets
$(MLE_HOME)/Parts/sets/inventor/linux/Makefile:
	cd $(MLE_HOME)/Parts/sets/inventor/linux; libtoolize; aclocal; automake --add-missing; autoconf; ./configure;

sets_stage: $(MLE_HOME)/Parts/sets/inventor/linux/Makefile

sets: check_env sets_stage
	cd $(MLE_HOME)/Parts/sets/inventor/linux; make;

sets_clean: check_env sets_stage
	cd $(MLE_HOME)/Parts/sets/inventor/linux; make clean;

sets_install: check_env sets_stage
	cd $(MLE_HOME)/Parts/sets/inventor/linux; sudo -Eu $(USER) MLE_ROOT=$(MLE_ROOT) make install;

# Targets for Magic Lantern SDK Stages
$(MLE_HOME)/Parts/stages/rehearsal/build/linux/Makefile:
	cd $(MLE_HOME)/Parts/stages/rehearsal/build/linux; libtoolize; aclocal; automake --add-missing; autoconf; ./configure;

stages_stage: $(MLE_HOME)/Parts/stages/rehearsal/build/linux/Makefile

stages: check_env stages_stage
	cd $(MLE_HOME)/Parts/stages/rehearsal/build/linux; make;

stages_clean: check_env stages_stage
	cd $(MLE_HOME)/Parts/stages/rehearsal/build/linux; make clean;

stages_install: check_env stages_stage
	cd $(MLE_HOME)/Parts/stages/rehearsal/build/linux; sudo -Eu $(USER) MLE_ROOT=$(MLE_ROOT) make install;

# Targets for Magic Lantern SDK Actors
$(MLE_HOME)/Parts/actors/rehearsal/build/linux/Makefile:
	cd $(MLE_HOME)/Parts/actors/rehearsal/build/linux; libtoolize; aclocal; automake --add-missing; autoconf; ./configure;

actors_stage: $(MLE_HOME)/Parts/actors/rehearsal/build/linux/Makefile

actors: check_env actors_stage
	cd $(MLE_HOME)/Parts/actors/rehearsal/build/linux; make;

actors_clean: check_env actors_stage
	cd $(MLE_HOME)/Parts/actors/rehearsal/build/linux; make clean;

actors_install: check_env actors_stage
	cd $(MLE_HOME)/Parts/actors/rehearsal/build/linux; sudo -Eu $(USER) MLE_ROOT=$(MLE_ROOT) make install;

# Targets for Magic Lantern SDK Players
$(MLE_HOME)/Players/rehearsal/build/linux/Makefile:
	cd $(MLE_HOME)/Players/rehearsal/build/linux; libtoolize; aclocal; automake --add-missing; autoconf; ./configure;

players_stage: $(MLE_HOME)/Players/rehearsal/build/linux/Makefile

players: check_env players_stage
	cd $(MLE_HOME)/Players/rehearsal/build/linux; make;

players_clean: check_env players_stage
	cd $(MLE_HOME)/Players/rehearsal/build/linux; make clean;

players_install: check_env players_stage
	cd $(MLE_HOME)/Players/rehearsal/build/linux; sudo -Eu $(USER) MLE_ROOT=$(MLE_ROOT) make install;

# Targets for Magic Lantern Qt Stage.
qtstage: check_env
	cd $(MLE_HOME)/Parts/stages/qt/build/build-mleqtstage-Desktop_Qt_5_8_0_GCC_64bit-Debug; make;

qtstage_clean: check_env
	cd $(MLE_HOME)/Parts/stages/qt/build/build-mleqtstage-Desktop_Qt_5_8_0_GCC_64bit-Debug; make clean;

qtstage_install: check_env
	cd $(MLE_HOME)/Parts/stages/qt/build/build-mleqtstage-Desktop_Qt_5_8_0_GCC_64bit-Debug; sudo -Eu $(USER) MLE_ROOT=$(MLE_ROOT) make install;

# Targets for Magic Lantern Qt Set.
qtset: check_env
	cd $(MLE_HOME)/Parts/sets/qt/build/build-mleqtset-Desktop_Qt_5_8_0_GCC_64bit-Debug; make;

qtset_clean: check_env
	cd $(MLE_HOME)/Parts/sets/qt/build/build-mleqtset-Desktop_Qt_5_8_0_GCC_64bit-Debug; make clean;

qtset_install: check_env
	cd $(MLE_HOME)/Parts/sets/qt/build/build-mleqtset-Desktop_Qt_5_8_0_GCC_64bit-Debug; sudo -Eu $(USER) MLE_ROOT=$(MLE_ROOT) make install;

# Targets for Magic Lantern Qt Mediaref.
qtmref: check_env
	cd $(MLE_HOME)/Parts/mediaref/qt/build/build-mleqtmref-Desktop_Qt_5_8_0_GCC_64bit-Debug; make;

qtmref_clean: check_env
	cd $(MLE_HOME)/Parts/mediaref/qt/build/build-mleqtmref-Desktop_Qt_5_8_0_GCC_64bit-Debug; make clean;

qtmref_install: check_env
	cd $(MLE_HOME)/Parts/mediaref/qt/build/build-mleqtmref-Desktop_Qt_5_8_0_GCC_64bit-Debug; sudo -Eu $(USER) MLE_ROOT=$(MLE_ROOT) make install;

# Targets for Magic Lantern Qt Role.
qtrole: check_env
	cd $(MLE_HOME)/Parts/roles/qt/build/build-mleqtrole-Desktop_Qt_5_8_0_GCC_64bit-Debug; make;

qtrole_clean: check_env
	cd $(MLE_HOME)/Parts/roles/qt/build/build-mleqtrole-Desktop_Qt_5_8_0_GCC_64bit-Debug; make clean;

qtrole_install: check_env
	cd $(MLE_HOME)/Parts/roles/qt/build/build-mleqtrole-Desktop_Qt_5_8_0_GCC_64bit-Debug; sudo -Eu $(USER) MLE_ROOT=$(MLE_ROOT) make install;

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
	cd $(MLE_HOME)/Titles/null/qt/build/build-null-Desktop_Qt_5_8_0_GCC_64bit-Debug; sudo -Eu $(USER) MLE_ROOT=$(MLE_ROOT) make install;

# Magic Lantern Titles
titles: null

titles_clean: null_clean

titles_install: null_install

# Targets for Magic Lantern Authoring Toolkit (ATK)
$(MLE_HOME)/ATK/linux/rehearsal/Makefile:
	cd $(MLE_HOME)/ATK/linux/rehearsal; libtoolize; aclocal; automake --add-missing; autoconf; ./configure;

libmleatk_stage: $(MLE_HOME)/ATK/linux/rehearsal/Makefile

libmleatk: check_env libmleatk_stage
	cd $(MLE_HOME)/ATK/linux/rehearsal; make;

libmleatk_clean: check_env libmleatk_stage
	cd $(MLE_HOME)/ATK/linux/rehearsal; make clean;

libmleatk_install: check_env libmleatk_stage
	cd $(MLE_HOME)/ATK/linux/rehearsal; sudo -Eu $(USER) MLE_ROOT=$(MLE_ROOT) make install;

# Targets for Magic Lantern utility library.
$(MLE_HOME)/Studio/DwpReader/linux/DwpReader/Makefile:
	cd $(MLE_HOME)/Studio/DwpReader/linux/DwpReader; libtoolize; aclocal; automake --add-missing; autoconf; ./configure;

libDwpReader_stage: $(MLE_HOME)/Studio/DwpReader/linux/DwpReader/Makefile

libDwpReader: check_env libDwpReader_stage
	cd $(MLE_HOME)/Studio/DwpReader/linux/DwpReader; make;

libDwpReader_clean: check_env libDwpReader_stage
	cd $(MLE_HOME)/Studio/DwpReader/linux/DwpReader; make clean;

libDwpReader_install: check_env libDwpReader_stage
	cd $(MLE_HOME)/Studio/DwpReader/linux/DwpReader; sudo -Eu $(USER) MLE_ROOT=$(MLE_ROOT) make install;
	cd $(MLE_HOME)/Studio/DwpReader/linux/DwpReader/libDwpReader; sudo -Eu $(USER) MLE_HOME=$(MLE_HOME) make install_plugin;

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
