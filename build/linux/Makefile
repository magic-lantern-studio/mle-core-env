# Makefile for building Linux targets:
#
# COPYRIGHT_BEGIN
#
# The MIT License (MIT)
#
# Copyright (c) 2020-2024 Wizzer Works
#
# Permission is hereby granted, free of charge, to any person obtaining a copy
# of this software and associated documentation files (the "Software"), to deal
# in the Software without restriction, including without limitation the rights
# to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
# copies of the Software, and to permit persons to whom the Software is
# furnished to do so, subject to the following conditions:
#
# The above copyright notice and this permission notice shall be included in all
# copies or substantial portions of the Software.
#
# THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
# IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
# FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
# AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
# LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
# OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
# SOFTWARE.
#
#  For information concerning this header file, contact Mark S. Millard,
#  of Wizzer Works at msm@wizzerworks.com.
#
#  More information concerning Wizzer Works may be found at
#
#      http://www.wizzerworks.com
#
# COPYRIGHT_END
#

# Uber targets.
#   studio targets includes sdk, inventor targets
all: studio inventor

clean: studio_clean inventor_clean

install: studio_install inventor_install

uninstall: studio_uninstall inventor_uninstall

# Targets for Magic Lantern utility library.

$(MLE_HOME)/Core/util/linux/build/Makefile:
	@echo ""
	@echo "***** Running Makefile target libmlutil configure *****"
	@echo ""
	cd $(MLE_HOME)/Core/util/linux/build; libtoolize; aclocal; automake --add-missing --ignore-deps; autoconf; ./configure;

libmlutil_stage: $(MLE_HOME)/Core/util/linux/build/Makefile

libmlutil: check_env libmlutil_stage
	@echo ""
	@echo "***** Running Makefile target libmlutil *****"
	@echo ""
	cd $(MLE_HOME)/Core/util/linux/build; make;

libmlutil_clean: check_env libmlutil_stage
	@echo ""
	@echo "***** Running Makefile target libmlutil_clean *****"
	@echo ""
	cd $(MLE_HOME)/Core/util/linux/build; make clean;

libmlutil_clobber: check_env libmlutil_stage libmlutil_clean
	@echo ""
	@echo "***** Running Makefile target libmlutil_clobber *****"
	@echo ""
	cd $(MLE_HOME)/Core/util/linux/build; make maintainer-clean;

libmlutil_install: libmlutil
	@echo ""
	@echo "***** Running Makefile target libmlutil_install *****"
	@echo ""
	cd $(MLE_HOME)/Core/util/linux/build; MLE_ROOT=$(MLE_ROOT) make install;

libmlutil_uninstall: check_env libmlutil_stage
	@echo ""
	@echo "***** Running Makefile target libmlutil_uninstall *****"
	@echo ""
	cd $(MLE_HOME)/Core/util/linux/build; MLE_ROOT=$(MLE_ROOT) make uninstall;

# Targets for Magic Lantern math library.

$(MLE_HOME)/Core/math/linux/libmlmath/Makefile:
	@echo ""
	@echo "***** Running Makefile target libmlmath configure *****"
	@echo ""
	cd $(MLE_HOME)/Core/math/linux/libmlmath; libtoolize; aclocal; automake --add-missing --ignore-deps; autoconf; ./configure;

libmlmath_stage: $(MLE_HOME)/Core/math/linux/libmlmath/Makefile

libmlmath: check_env libmlmath_stage libmlutil_install
	@echo ""
	@echo "***** Running Makefile target libmlmath *****"
	@echo ""
	cd $(MLE_HOME)/Core/math/linux/libmlmath; MLE_ROOT=$(MLE_ROOT) make;

libmlmath_clean: check_env libmlmath_stage
	@echo ""
	@echo "***** Running Makefile target libmlmath_clean *****"
	@echo ""
	cd $(MLE_HOME)/Core/math/linux/libmlmath; make clean;

libmlmath_clobber: check_env libmlmath_stage libmlmath_clean
	@echo ""
	@echo "***** Running Makefile target libmlmath_clobber *****"
	@echo ""
	cd $(MLE_HOME)/Core/math/linux/libmlmath; make maintainer-clean;

libmlmath_install: libmlmath
	@echo ""
	@echo "***** Running Makefile target libmlmath_install *****"
	@echo ""
	cd $(MLE_HOME)/Core/math/linux/libmlmath; MLE_ROOT=$(MLE_ROOT) make install;

libmlmath_uninstall: check_env libmlmath_stage
	@echo ""
	@echo "***** Running Makefile target libmlmath_uninstall *****"
	@echo ""
	cd $(MLE_HOME)/Core/math/linux/libmlmath; MLE_ROOT=$(MLE_ROOT) make uninstall;

# Targets for Magic Lantern DigitalWorkprint library.

$(MLE_HOME)/DigitalWorkprint/lib/linux/Makefile:
	@echo ""
	@echo "***** Running Makefile target libDWP configure *****"
	@echo ""
	cd $(MLE_HOME)/DigitalWorkprint/lib/linux; libtoolize; aclocal; automake --add-missing --ignore-deps; autoconf; ./configure;

libDWP_stage: $(MLE_HOME)/DigitalWorkprint/lib/linux/Makefile

libDWP: check_env libDWP_stage libmlutil_install libmlmath_install
	@echo ""
	@echo "***** Running Makefile target libDWP *****"
	@echo ""
	cd $(MLE_HOME)/DigitalWorkprint/lib/linux; MLE_ROOT=$(MLE_ROOT) make;

libDWP_clean: check_env libDWP_stage
	@echo ""
	@echo "***** Running Makefile target libDWP_clean *****"
	@echo ""
	cd $(MLE_HOME)/DigitalWorkprint/lib/linux; make clean;

libDWP_clobber: check_env libDWP_stage libDWP_clean
	@echo ""
	@echo "***** Running Makefile target libDWP_clobber *****"
	@echo ""
	cd $(MLE_HOME)/DigitalWorkprint/lib/linux; make maintainer-clean;

libDWP_install: libDWP
	@echo ""
	@echo "***** Running Makefile target libDWP_install *****"
	@echo ""
	cd $(MLE_HOME)/DigitalWorkprint/lib/linux; MLE_ROOT=$(MLE_ROOT) make install;

libDWP_uninstall: check_env libDWP_stage
	@echo ""
	@echo "***** Running Makefile target libDWP_uninstall *****"
	@echo ""
	cd $(MLE_HOME)/DigitalWorkprint/lib/linux; MLE_ROOT=$(MLE_ROOT) make uninstall;

# Targets for Magic Lantern DigitalPlayprint library.

$(MLE_HOME)/DigitalPlayprint/lib/linux/Makefile:
	@echo ""
	@echo "***** Running Makefile target libDPP configure *****"
	@echo ""
	cd $(MLE_HOME)/DigitalPlayprint/lib/linux; libtoolize; aclocal; automake --add-missing --ignore-deps; autoconf; ./configure;

libDPP_stage: $(MLE_HOME)/DigitalPlayprint/lib/linux/Makefile

libDPP: check_env libDPP_stage libDWP_install
	@echo ""
	@echo "***** Running Makefile target libDPP *****"
	@echo ""
	cd $(MLE_HOME)/DigitalPlayprint/lib/linux; MLE_ROOT=$(MLE_ROOT) make;

libDPP_clean: check_env libDPP_stage
	@echo ""
	@echo "***** Running Makefile target libDPP_clean *****"
	@echo ""
	cd $(MLE_HOME)/DigitalPlayprint/lib/linux; make clean;

libDPP_clobber: check_env libDPP_stage libDPP_clean
	@echo ""
	@echo "***** Running Makefile target libDPP_clobber *****"
	@echo ""
	cd $(MLE_HOME)/DigitalPlayprint/lib/linux; make maintainer-clean;

libDPP_install: libDPP
	@echo ""
	@echo "***** Running Makefile target libDPP_install *****"
	@echo ""
	cd $(MLE_HOME)/DigitalPlayprint/lib/linux; MLE_ROOT=$(MLE_ROOT) make install;

libDPP_uninstall: check_env libDPP_stage
	@echo ""
	@echo "***** Running Makefile target libDPP_uninstall *****"
	@echo ""
	cd $(MLE_HOME)/DigitalPlayprint/lib/linux; MLE_ROOT=$(MLE_ROOT) make uninstall;

# Targets for Magic Lantern DigitalPlayprint Runtime Library.

$(MLE_HOME)/DigitalPlayprint/runtime/linux/Makefile:
	@echo ""
	@echo "***** Running Makefile target libplayprint configure *****"
	@echo ""
	cd $(MLE_HOME)/DigitalPlayprint/runtime/linux; libtoolize; aclocal; automake --add-missing --ignore-deps; autoconf; ./configure;

libplayprint_stage: $(MLE_HOME)/DigitalPlayprint/runtime/linux/Makefile

libplayprint: check_env libplayprint_stage
	@echo ""
	@echo "***** Running Makefile target libplayprint *****"
	@echo ""
	cd $(MLE_HOME)/DigitalPlayprint/runtime/linux; MLE_ROOT=$(MLE_ROOT) make;

libplayprint_clean: check_env libplayprint_stage
	@echo ""
	@echo "***** Running Makefile target libplayprint_clean *****"
	@echo ""
	cd $(MLE_HOME)/DigitalPlayprint/runtime/linux; make clean;

libplayprint_clobber: check_env libplayprint_stage libplayprint_clean
	@echo ""
	@echo "***** Running Makefile target libplayprint_clobber *****"
	@echo ""
	cd $(MLE_HOME)/DigitalPlayprint/runtime/linux; make maintainer-clean;

libplayprint_install: libplayprint
	@echo ""
	@echo "***** Running Makefile target libplayprint_install *****"
	@echo ""
	cd $(MLE_HOME)/DigitalPlayprint/runtime/linux; MLE_ROOT=$(MLE_ROOT) make install;

libplayprint_uninstall: check_env libplayprint_stage
	@echo ""
	@echo "***** Running Makefile target libplayprint_uninstall *****"
	@echo ""
	cd $(MLE_HOME)/DigitalPlayprint/runtime/linux; MLE_ROOT=$(MLE_ROOT) make uninstall;

#
# Targets for Magic Lantern mastering tools.
#

# Build rules for DPPGen mastering library.

$(MLE_HOME)/DigitalPlayprint/master/linux/libDPPGen/Makefile:
	@echo ""
	@echo "***** Running Makefile target libDPPGen configure *****"
	@echo ""
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/libDPPGen; libtoolize; aclocal; automake --add-missing --ignore-deps; autoconf; ./configure;

libDPPGen_stage: $(MLE_HOME)/DigitalPlayprint/master/linux/libDPPGen/Makefile

libDPPGen: check_env libDPPGen_stage libDPP_install
	@echo ""
	@echo "***** Running Makefile target libDPPGen *****"
	@echo ""
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/libDPPGen; MLE_ROOT=$(MLE_ROOT) make;

libDPPGen_clean: check_env libDPPGen_stage
	@echo ""
	@echo "***** Running Makefile target libDPPGen_clean *****"
	@echo ""
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/libDPPGen; make clean;

libDPPGen_clobber: check_env libDPPGen_stage libDPPGen_clean
	@echo ""
	@echo "***** Running Makefile target libDPPGen_clobber *****"
	@echo ""
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/libDPPGen; make maintainer-clean;

libDPPGen_install: libDPPGen
	@echo ""
	@echo "***** Running Makefile target libDPPGen_install *****"
	@echo ""
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/libDPPGen; MLE_ROOT=$(MLE_ROOT) make install;

libDPPGen_uninstall: check_env libDPPGen_stage
	@echo ""
	@echo "***** Running Makefile target libDPPGen_uninstall *****"
	@echo ""
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/libDPPGen; MLE_ROOT=$(MLE_ROOT) make uninstall;

# Build rules for gentables mastering tool.

$(MLE_HOME)/DigitalPlayprint/master/linux/gentables/Makefile:
	@echo ""
	@echo "***** Running Makefile target gentables configure *****"
	@echo ""
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/gentables; libtoolize; aclocal; automake --add-missing --ignore-deps; autoconf; ./configure;

gentables_stage: $(MLE_HOME)/DigitalPlayprint/master/linux/gentables/Makefile

gentables: check_env gentables_stage libDPP_install libDPPGen_install
	@echo ""
	@echo "***** Running Makefile target gentables *****"
	@echo ""
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/gentables; MLE_ROOT=$(MLE_ROOT) make;

gentables_clean: check_env gentables_stage libDPPGen_clean 
	@echo ""
	@echo "***** Running Makefile target gemtables_clean *****"
	@echo ""
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/gentables; make clean;

gentables_clobber: check_env gentables_stage gentables_clean
	@echo ""
	@echo "***** Running Makefile target gemtables_clobber *****"
	@echo ""
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/gentables; make maintainer-clean;

gentables_install: gentables
	@echo ""
	@echo "***** Running Makefile target gentables_install *****"
	@echo ""
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/gentables; MLE_ROOT=$(MLE_ROOT) make install;

gentables_uninstall: check_env gentables_stage
	@echo ""
	@echo "***** Running Makefile target gentables_uninstall *****"
	@echo ""
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/gentables; MLE_ROOT=$(MLE_ROOT) make uninstall;

# Build rules for gengroup mastering tool.

$(MLE_HOME)/DigitalPlayprint/master/linux/gengroup/Makefile:
	@echo ""
	@echo "***** Running Makefile target gengroup configure *****"
	@echo ""
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/gengroup; libtoolize; aclocal; automake --add-missing --ignore-deps; autoconf; ./configure;

gengroup_stage: $(MLE_HOME)/DigitalPlayprint/master/linux/gengroup/Makefile

gengroup: check_env gengroup_stage libplayprint_install libDPP_install libDPPGen_install
	@echo ""
	@echo "***** Running Makefile target gengroup *****"
	@echo ""
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/gengroup; MLE_ROOT=$(MLE_ROOT) make;

gengroup_clean: check_env gengroup_stage libDPPGen_clean
	@echo ""
	@echo "***** Running Makefile target gengroup_clean *****"
	@echo ""
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/gengroup; make clean;

gengroup_clobber: check_env gengroup_stage gengroup_clean
	@echo ""
	@echo "***** Running Makefile target gengroup_clobber *****"
	@echo ""
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/gengroup; make maintainer-clean;

gengroup_install: gengroup
	@echo ""
	@echo "***** Running Makefile target gengroup_install *****"
	@echo ""
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/gengroup; MLE_ROOT=$(MLE_ROOT) make install;

gengroup_uninstall: check_env gengroup_stage
	@echo ""
	@echo "***** Running Makefile target gengroup_uninstall *****"
	@echo ""
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/gengroup; MLE_ROOT=$(MLE_ROOT) make uninstall;

# Build rules for genscene mastering tool.

$(MLE_HOME)/DigitalPlayprint/master/linux/genscene/Makefile:
	@echo ""
	@echo "***** Running Makefile target genscene configure *****"
	@echo ""
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/genscene; libtoolize; aclocal; automake --add-missing --ignore-deps; autoconf; ./configure;

genscene_stage: $(MLE_HOME)/DigitalPlayprint/master/linux/genscene/Makefile

genscene: check_env genscene_stage libDPPGen_install
	@echo ""
	@echo "***** Running Makefile target genscene *****"
	@echo ""
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/genscene; MLE_ROOT=$(MLE_ROOT) make;

genscene_clean: check_env genscene_stage genscene_clean
	@echo ""
	@echo "***** Running Makefile target genscene_clean *****"
	@echo ""
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/genscene; make clean;

genscene_clobber: check_env genscene_stage libDPPGen_clean
	@echo ""
	@echo "***** Running Makefile target genscene_clobber *****"
	@echo ""
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/genscene; make maintainer-clean;

genscene_install: genscene
	@echo ""
	@echo "***** Running Makefile target genscene_install *****"
	@echo ""
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/genscene; MLE_ROOT=$(MLE_ROOT) make install;

genscene_uninstall: check_env genscene_stage
	@echo ""
	@echo "***** Running Makefile target genscene_uninstall *****"
	@echo ""
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/genscene; MLE_ROOT=$(MLE_ROOT) make uninstall;

# Build rules for genmedia mastering tool.

$(MLE_HOME)/DigitalPlayprint/master/linux/genmedia/Makefile:
	@echo ""
	@echo "***** Running Makefile target genmedia configure *****"
	@echo ""
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/genmedia; libtoolize; aclocal; automake --add-missing --ignore-deps; autoconf; ./configure;

genmedia_stage: $(MLE_HOME)/DigitalPlayprint/master/linux/genmedia/Makefile

genmedia: check_env genmedia_stage libDPPGen_install
	@echo ""
	@echo "***** Running Makefile target genmedia *****"
	@echo ""
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/genmedia; MLE_ROOT=$(MLE_ROOT) make;

genmedia_clean: check_env genmedia_stage libDPPGen_clean
	@echo ""
	@echo "***** Running Makefile target genmedia_clean *****"
	@echo ""
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/genmedia; make clean;

genmedia_clobber: check_env genmedia_stage genmedia_clean
	@echo ""
	@echo "***** Running Makefile target genmedia_clobber *****"
	@echo ""
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/genmedia; make maintainer-clean;

genmedia_install: genmedia
	@echo ""
	@echo "***** Running Makefile target genmedia_install *****"
	@echo ""
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/genmedia; MLE_ROOT=$(MLE_ROOT) make install;

genmedia_uninstall: check_env genmedia_stage
	@echo ""
	@echo "***** Running Makefile target genmedia_uninstall *****"
	@echo ""
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/genmedia; MLE_ROOT=$(MLE_ROOT) make uninstall;

# Build rules for genmakefile mastering tool.

$(MLE_HOME)/DigitalPlayprint/master/linux/genmakefile/Makefile:
	@echo ""
	@echo "***** Running Makefile target genmakefile configure *****"
	@echo ""
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/genmakefile; libtoolize; aclocal; automake --add-missing --ignore-deps; autoconf; ./configure;

genmakefile_stage: $(MLE_HOME)/DigitalPlayprint/master/linux/genmakefile/Makefile

genmakefile: check_env genmakefile_stage libDPPGen_install
	@echo ""
	@echo "***** Running Makefile target genmakefile *****"
	@echo ""
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/genmakefile; MLE_ROOT=$(MLE_ROOT) make;

genmakefile_clean: check_env genmakefile_stage libDPPGen_clean
	@echo ""
	@echo "***** Running Makefile target genmakefile_clean *****"
	@echo ""
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/genmakefile; make clean;

genmakefile_clobber: check_env genmakefile_stage genmakefile_clean
	@echo ""
	@echo "***** Running Makefile target genmakefile_clobber *****"
	@echo ""
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/genmakefile; make maintainer-clean;

genmakefile_install: genmakefile
	@echo ""
	@echo "***** Running Makefile target genmakefile_install *****"
	@echo ""
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/genmakefile; MLE_ROOT=$(MLE_ROOT) make install;

genmakefile_uninstall: check_env genmakefile_stage
	@echo ""
	@echo "***** Running Makefile target genmakefile_uninstall *****"
	@echo ""
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/genmakefile; MLE_ROOT=$(MLE_ROOT) make uninstall;

# Build rules for genppscript mastering tool.

$(MLE_HOME)/DigitalPlayprint/master/linux/genppscript/Makefile:
	@echo ""
	@echo "***** Running Makefile target genppscript configure *****"
	@echo ""
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/genppscript; libtoolize; aclocal; automake --add-missing --ignore-deps; autoconf; ./configure;

genppscript_stage: $(MLE_HOME)/DigitalPlayprint/master/linux/genppscript/Makefile

genppscript: check_env genppscript_stage libDPPGen_install
	@echo ""
	@echo "***** Running Makefile target genppscript *****"
	@echo ""
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/genppscript; MLE_ROOT=$(MLE_ROOT) make;

genppscript_clean: check_env genppscript_stage libDPPGen_clean
	@echo ""
	@echo "***** Running Makefile target genppscript_clean *****"
	@echo ""
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/genppscript; make clean;

genppscript_clobber: check_env genppscript_stage genppscript_clean
	@echo ""
	@echo "***** Running Makefile target genppscript_clobber *****"
	@echo ""
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/genppscript; make maintainer-clean;

genppscript_install: genppscript
	@echo ""
	@echo "***** Running Makefile target genppscript_install *****"
	@echo ""
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/genppscript; MLE_ROOT=$(MLE_ROOT) make install;

genppscript_uninstall: check_env genppscript_stage
	@echo ""
	@echo "***** Running Makefile target genppscript_uninstall *****"
	@echo ""
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/genppscript; MLE_ROOT=$(MLE_ROOT) make uninstall;

# Build rules for gendpp mastering tool.

$(MLE_HOME)/DigitalPlayprint/master/linux/gendpp/Makefile:
	@echo ""
	@echo "***** Running Makefile target gendpp configure *****"
	@echo ""
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/gendpp; libtoolize; aclocal; automake --add-missing --ignore-deps; autoconf; ./configure;

gendpp_stage: $(MLE_HOME)/DigitalPlayprint/master/linux/gendpp/Makefile

gendpp: check_env gendpp_stage libDPPGen_install
	@echo ""
	@echo "***** Running Makefile target gendpp *****"
	@echo ""
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/gendpp; MLE_ROOT=$(MLE_ROOT) make;

gendpp_clean: check_env gendpp_stage libDPPGen_clean
	@echo ""
	@echo "***** Running Makefile target gendpp_clean *****"
	@echo ""
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/gendpp; make clean;

gendpp_clobber: check_env gendpp_stage gendpp_clean
	@echo ""
	@echo "***** Running Makefile target gendpp_clobber *****"
	@echo ""
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/gendpp; make maintainer-clean;

gendpp_install: gendpp
	@echo ""
	@echo "***** Running Makefile target gendpp_install *****"
	@echo ""
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/gendpp; MLE_ROOT=$(MLE_ROOT) make install;

gendpp_uninstall: check_env gendpp_stage
	@echo ""
	@echo "***** Running Makefile target gendpp_uninstall *****"
	@echo ""
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/gendpp; MLE_ROOT=$(MLE_ROOT) make uninstall;

# Build rules for dumpgroup mastering tool.

$(MLE_HOME)/DigitalPlayprint/master/linux/dumpgroup/Makefile:
	@echo ""
	@echo "***** Running Makefile target dumpgroup configure *****"
	@echo ""
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/dumpgroup; libtoolize; aclocal; automake --add-missing --ignore-deps; autoconf; ./configure;

dumpgroup_stage: $(MLE_HOME)/DigitalPlayprint/master/linux/dumpgroup/Makefile

dumpgroup: check_env dumpgroup_stage libDPPGen_install
	@echo ""
	@echo "***** Running Makefile target dumpgroup *****"
	@echo ""
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/dumpgroup; MLE_ROOT=$(MLE_ROOT) make;

dumpgroup_clean: check_env dumpgroup_stage libDPPGen_clean
	@echo ""
	@echo "***** Running Makefile target dumpgroup_clean *****"
	@echo ""
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/dumpgroup; make clean;

dumpgroup_clobber: check_env dumpgroup_stage dumpgroup_clean
	@echo ""
	@echo "***** Running Makefile target dumpgroup_clobber *****"
	@echo ""
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/dumpgroup; make maintainer-clean;

dumpgroup_install: dumpgroup
	@echo ""
	@echo "***** Running Makefile target dumpgroup_install *****"
	@echo ""
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/dumpgroup; MLE_ROOT=$(MLE_ROOT) make install;

dumpgroup_uninstall: check_env dumpgroup_stage
	@echo ""
	@echo "***** Running Makefile target dumpgroup_uninstall *****"
	@echo ""
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/dumpgroup; MLE_ROOT=$(MLE_ROOT) make uninstall;

# Build rules for dumpscene mastering tool.

$(MLE_HOME)/DigitalPlayprint/master/linux/dumpscene/Makefile:
	@echo ""
	@echo "***** Running Makefile target dumpscene configure *****"
	@echo ""
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/dumpscene; libtoolize; aclocal; automake --add-missing --ignore-deps; autoconf; ./configure;

dumpscene_stage: $(MLE_HOME)/DigitalPlayprint/master/linux/dumpscene/Makefile

dumpscene: check_env dumpscene_stage libDPPGen_install
	@echo ""
	@echo "***** Running Makefile target dumpscene *****"
	@echo ""
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/dumpscene; MLE_ROOT=$(MLE_ROOT) make;

dumpscene_clean: check_env dumpscene_stage libDPPGen_clean
	@echo ""
	@echo "***** Running Makefile target dumpscene_clean *****"
	@echo ""
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/dumpscene; make clean;

dumpscene_clobber: check_env dumpscene_stage dumpscene_clean
	@echo ""
	@echo "***** Running Makefile target dumpscene_clobber *****"
	@echo ""
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/dumpscene; make maintainer-clean;

dumpscene_install: dumpscene
	@echo ""
	@echo "***** Running Makefile target dumpscene_install *****"
	@echo ""
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/dumpscene; MLE_ROOT=$(MLE_ROOT) make install;

dumpscene_uninstall: check_env dumpscene_stage
	@echo ""
	@echo "***** Running Makefile target dumpscene_uninstall *****"
	@echo ""
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/dumpscene; MLE_ROOT=$(MLE_ROOT) make uninstall;

# Build rules for dumpmedia mastering tool.

$(MLE_HOME)/DigitalPlayprint/master/linux/dumpmedia/Makefile:
	@echo ""
	@echo "***** Running Makefile target dumpmedia configure *****"
	@echo ""
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/dumpmedia; libtoolize; aclocal; automake --add-missing --ignore-deps; autoconf; ./configure;

dumpmedia_stage: $(MLE_HOME)/DigitalPlayprint/master/linux/dumpmedia/Makefile

dumpmedia: check_env dumpmedia_stage libDPPGen_install
	@echo ""
	@echo "***** Running Makefile target dumpmedia *****"
	@echo ""
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/dumpmedia; MLE_ROOT=$(MLE_ROOT) make;

dumpmedia_clean: check_env dumpmedia_stage libDPPGen_clean
	@echo ""
	@echo "***** Running Makefile target dumpmedia_clean *****"
	@echo ""
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/dumpmedia; make clean;

dumpmedia_clobber: check_env dumpmedia_stage dumpmedia_clean
	@echo ""
	@echo "***** Running Makefile target dumpmedia_clobber *****"
	@echo ""
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/dumpmedia; make maintainer-clean;

dumpmedia_install: dumpmedia
	@echo ""
	@echo "***** Running Makefile target dumpmedia_install *****"
	@echo ""
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/dumpmedia; MLE_ROOT=$(MLE_ROOT) make install;

dumpmedia_uninstall: check_env dumpmedia_stage
	@echo ""
	@echo "***** Running Makefile target dumpmedia_uninstall *****"
	@echo ""
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/dumpmedia; MLE_ROOT=$(MLE_ROOT) make uninstall;

# Build rules for dumpdpp mastering tool.

$(MLE_HOME)/DigitalPlayprint/master/linux/dumpdpp/Makefile:
	@echo ""
	@echo "***** Running Makefile target dumpdpp configure *****"
	@echo ""
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/dumpdpp; libtoolize; aclocal; automake --add-missing --ignore-deps; autoconf; ./configure;

dumpdpp_stage: $(MLE_HOME)/DigitalPlayprint/master/linux/dumpdpp/Makefile

dumpdpp: check_env dumpdpp_stage libDPPGen_install
	@echo ""
	@echo "***** Running Makefile target dumpdpp *****"
	@echo ""
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/dumpdpp; MLE_ROOT=$(MLE_ROOT) make;

dumpdpp_clean: check_env dumpdpp_stage libDPPGen_clean
	@echo ""
	@echo "***** Running Makefile target dumpdpp_clean *****"
	@echo ""
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/dumpdpp; make clean;

dumpdpp_clobber: check_env dumpdpp_stage dumpdpp_clean
	@echo ""
	@echo "***** Running Makefile target dumpdpp_clobber *****"
	@echo ""
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/dumpdpp; make maintainer-clean;

dumpdpp_install: dumpdpp
	@echo ""
	@echo "***** Running Makefile target dumpdpp_install *****"
	@echo ""
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/dumpdpp; MLE_ROOT=$(MLE_ROOT) make install;

dumpdpp_uninstall: check_env dumpdpp_stage
	@echo ""
	@echo "***** Running Makefile target dumpdpp_uninstall *****"
	@echo ""
	cd $(MLE_HOME)/DigitalPlayprint/master/linux/dumpdpp; MLE_ROOT=$(MLE_ROOT) make uninstall;

# Build rules for all mastering components.

master: libDPPGen gentables gengroup genscene genmedia genmakefile genppscript gendpp dumpgroup dumpscene dumpmedia dumpdpp

master_clean: libDPPGen_clean gentables_clean gengroup_clean genscene_clean genmedia_clean genmakefile_clean genppscript_clean gendpp_clean dumpgroup_clean dumpscene_clean dumpmedia_clean dumpdpp_clean

master_clobber: libDPPGen_clobber gentables_clobber gengroup_clobber genscene_clobber genmedia_clobber genmakefile_clobber genppscript_clobber gendpp_clobber dumpgroup_clobber dumpscene_clobber dumpmedia_clobber dumpdpp_clobber

master_install: libDPPGen_install gentables_install gengroup_install genscene_install genmedia_install genmakefile_install genppscript_install gendpp_install dumpgroup_install dumpscene_install dumpmedia_install dumpdpp_install

master_uninstall: libDPPGen_uninstall gentables_uninstall gengroup_uninstall genscene_uninstall genmedia_uninstall genmakefile_uninstall genppscript_uninstall gendpp_uninstall dumpgroup_uninstall dumpscene_uninstall dumpmedia_uninstall dumpdpp_uninstall

# Targets for Magic Lantern Runtime Engine libraries.

$(MLE_HOME)/Core/mlert/linux/rehearsal/Makefile:
	@echo ""
	@echo "***** Running Makefile target libmlert_rehearsal configure *****"
	@echo ""
	cd $(MLE_HOME)/Core/mlert/linux/rehearsal; libtoolize; aclocal; automake --add-missing --ignore-deps; autoconf; ./configure;

$(MLE_HOME)/Core/mlert/linux/runtime/Makefile:
	@echo ""
	@echo "***** Running Makefile target libmlert_runtime configure *****"
	@echo ""
	cd $(MLE_HOME)/Core/mlert/linux/runtime; libtoolize; aclocal; automake --add-missing --ignore-deps; autoconf; ./configure;

$(MLE_HOME)/Core/mlert/linux/inventor/Makefile:
	@echo ""
	@echo "***** Running Makefile target libmlert_inventor configure *****"
	@echo ""
	cd $(MLE_HOME)/Core/mlert/linux/inventor; libtoolize; aclocal; automake --add-missing --ignore-deps; autoconf; ./configure;

libmlert_rehearsal_stage: $(MLE_HOME)/Core/mlert/linux/rehearsal/Makefile

libmlert_runtime_stage: $(MLE_HOME)/Core/mlert/linux/runtime/Makefile

libmlert_inventor_stage: $(MLE_HOME)/Core/mlert/linux/inventor/Makefile

libmlert: libmlert_rehearsal_clean libmlert_rehearsal libmlert_runtime_clean libmlert_runtime libmlert_inventor_clean libmlert_inventor

libmlert_rehearsal: check_env libmlert_rehearsal_stage libDWP_install libDPP_install
	@echo ""
	@echo "***** Running Makefile target libmlert_rehearsal *****"
	@echo ""
	cd $(MLE_HOME)/Core/mlert/linux/rehearsal; MLE_ROOT=$(MLE_ROOT) make;

libmlert_runtime: check_env libmlert_runtime_stage libDWP_install libDPP_install libplayprint_install
	@echo ""
	@echo "***** Running Makefile target libmlert_runtime *****"
	@echo ""
	cd $(MLE_HOME)/Core/mlert/linux/runtime; MLE_ROOT=$(MLE_ROOT) make;

libmlert_inventor: check_env libmlert_inventor_stage libDWP_install libDPP_install
	@echo ""
	@echo "***** Running Makefile target libmlert_inventor *****"
	@echo ""
	cd $(MLE_HOME)/Core/mlert/linux/inventor; MLE_ROOT=$(MLE_ROOT) make;

libmlert_clean: libmlert_rehearsal_clean libmlert_runtime_clean libmlert_inventor_clean

libmlert_rehearsal_clean: check_env libmlert_rehearsal_stage
	@echo ""
	@echo "***** Running Makefile target libmlert_rehearsal_clean *****"
	@echo ""
	cd $(MLE_HOME)/Core/mlert/linux/rehearsal; make clean;

libmlert_runtime_clean: check_env libmlert_runtime_stage
	@echo ""
	@echo "***** Running Makefile target libmlert_runtime_clean *****"
	@echo ""
	cd $(MLE_HOME)/Core/mlert/linux/runtime; make clean;

libmlert_inventor_clean: check_env libmlert_inventor_stage
	@echo ""
	@echo "***** Running Makefile target libmlert_inventor_clean *****"
	@echo ""
	cd $(MLE_HOME)/Core/mlert/linux/inventor; make clean;

libmlert_clobber: libmlert_rehearsal_clobber libmlert_runtime_clobber libmlert_inventor_clobber

libmlert_rehearsal_clobber: check_env libmlert_rehearsal_stage libmlert_rehearsal_clean
	@echo ""
	@echo "***** Running Makefile target libmlert_rehearsal_clobber *****"
	@echo ""
	cd $(MLE_HOME)/Core/mlert/linux/rehearsal; make maintainer-clean;

libmlert_runtime_clobber: check_env libmlert_runtime_stage libmlert_runtime_clean
	@echo ""
	@echo "***** Running Makefile target libmlert_runtime_clobber *****"
	@echo ""
	cd $(MLE_HOME)/Core/mlert/linux/runtime; make maintainer-clean;

libmlert_inventor_clobber: check_env libmlert_inventor_stage libmlert_inventor_clean
	@echo ""
	@echo "***** Running Makefile target libmlert_inventor_clobber *****"
	@echo ""
	cd $(MLE_HOME)/Core/mlert/linux/inventor; make maintainer-clean;

libmlert_install: libmlert_rehearsal_clean libmlert_rehearsal_install libmlert_runtime_clean libmlert_runtime_install libmlert_inventor_clean libmlert_inventor_install

libmlert_rehearsal_install: libmlert_rehearsal
	@echo ""
	@echo "***** Running Makefile target libmlert_rehearsal_install *****"
	@echo ""
	cd $(MLE_HOME)/Core/mlert/linux/rehearsal; MLE_ROOT=$(MLE_ROOT) make install;

libmlert_runtime_install: libmlert_runtime
	@echo ""
	@echo "***** Running Makefile target libmlert_runtime_install *****"
	@echo ""
	cd $(MLE_HOME)/Core/mlert/linux/runtime; MLE_ROOT=$(MLE_ROOT) make install;

libmlert_inventor_install: libmlert_inventor
	@echo ""
	@echo "***** Running Makefile target libmlert_inventor_install *****"
	@echo ""
	cd $(MLE_HOME)/Core/mlert/linux/inventor; MLE_ROOT=$(MLE_ROOT) make install;

libmlert_uninstall: libmlert_rehearsal_uninstall libmlert_runtime_uninstall libmlert_inventor_uninstall

libmlert_rehearsal_uninstall: check_env libmlert_rehearsal_stage
	@echo ""
	@echo "***** Running Makefile target libmlert_rehearsal_uninstall *****"
	@echo ""
	cd $(MLE_HOME)/Core/mlert/linux/rehearsal; MLE_ROOT=$(MLE_ROOT) make uninstall;

libmlert_runtime_uninstall: check_env libmlert_runtime_stage
	@echo ""
	@echo "***** Running Makefile target libmlert_runtime_uninstall *****"
	@echo ""
	cd $(MLE_HOME)/Core/mlert/linux/runtime;  MLE_ROOT=$(MLE_ROOT) make uninstall;

libmlert_inventor_uninstall: check_env libmlert_inventor_stage
	@echo ""
	@echo "***** Running Makefile target libmlert_inventor_uninstall *****"
	@echo ""
	cd $(MLE_HOME)/Core/mlert/linux/inventor; MLE_ROOT=$(MLE_ROOT) make uninstall;

# Targets for Magic Lantern SDK Properties

props: check_env
	@echo ""
	@echo "***** Running Makefile target props *****"
	@echo ""
	cd $(MLE_HOME)/Parts/props/linux; MLE_ROOT=$(MLE_ROOT) make;

props_clean: check_env
	@echo ""
	@echo "***** Running Makefile target props_clean *****"
	@echo ""
	cd $(MLE_HOME)/Parts/props/linux; make clean;

props_clobber: check_env
	@echo ""
	@echo "***** Running Makefile target props_clobber *****"
	@echo ""
	@echo "***** props_clobber NOT SUPPORTED

props_install: check_env
	@echo ""
	@echo "***** Running Makefile target props_install *****"
	@echo ""
	cd $(MLE_HOME)/Parts/props/linux; MLE_ROOT=$(MLE_ROOT) make install;

props_uninstall: check_env
	@echo ""
	@echo "***** Running Makefile target props_uninstall *****"
	@echo ""
	cd $(MLE_HOME)/Parts/props/linux; MLE_ROOT=$(MLE_ROOT) make uninstall;

# Targets for Magic Lantern SDK Roles

$(MLE_HOME)/Parts/roles/inventor/build/linux/ivrole-rehearsal/Makefile:
	@echo ""
	@echo "***** Running Makefile target ivrole_rehearsal configure *****"
	@echo ""
	cd $(MLE_HOME)/Parts/roles/inventor/build/linux/ivrole-rehearsal; libtoolize; aclocal; automake --add-missing --ignore-deps; autoconf; ./configure;

$(MLE_HOME)/Parts/roles/inventor/build/linux/ivrole-runtime/Makefile:
	@echo ""
	@echo "***** Running Makefile target ivrole_runtime configure *****"
	@echo ""
	cd $(MLE_HOME)/Parts/roles/inventor/build/linux/ivrole-runtime; libtoolize; aclocal; automake --add-missing --ignore-deps; autoconf; ./configure;

$(MLE_HOME)/Parts/roles/inventor/build/linux/ivrole-inventor/Makefile:
	@echo ""
	@echo "***** Running Makefile target ivrole_inventor configure *****"
	@echo ""
	cd $(MLE_HOME)/Parts/roles/inventor/build/linux/ivrole-inventor; libtoolize; aclocal; automake --add-missing --ignore-deps; autoconf; ./configure;

roles_stage: roles_rehearsal_stage roles_runtime_stage roles_inventor_stage

roles_rehearsal_stage: $(MLE_HOME)/Parts/roles/inventor/build/linux/ivrole-rehearsal/Makefile

roles_runtime_stage: $(MLE_HOME)/Parts/roles/inventor/build/linux/ivrole-runtime/Makefile

roles_inventor_stage: $(MLE_HOME)/Parts/roles/inventor/build/linux/ivrole-inventor/Makefile

roles: roles_rehearsal_clean roles_rehearsal roles_runtime_clean roles_runtime roles_inventor_clean roles_inventor

roles_rehearsal: check_env libmlert_rehearsal_install props_install roles_rehearsal_stage
	@echo ""
	@echo "***** Running Makefile target roles_rehearsal *****"
	@echo ""
	cd $(MLE_HOME)/Parts/roles/inventor/build/linux/ivrole-rehearsal; MLE_ROOT=$(MLE_ROOT) make;

roles_runtime: check_env libmlert_runtime_install props_install roles_runtime_stage
	@echo ""
	@echo "***** Running Makefile target roles_runtime *****"
	@echo ""
	cd $(MLE_HOME)/Parts/roles/inventor/build/linux/ivrole-runtime; MLE_ROOT=$(MLE_ROOT) make;

roles_inventor: check_env libmlert_inventor_install props_install roles_inventor_stage
	@echo ""
	@echo "***** Running Makefile target roles_inventor *****"
	@echo ""
	cd $(MLE_HOME)/Parts/roles/inventor/build/linux/ivrole-inventor; MLE_ROOT=$(MLE_ROOT) make;

roles_clean: roles_rehearsal_clean roles_runtime_clean roles_inventor_clean

roles_rehearsal_clean: check_env roles_rehearsal_stage
	@echo ""
	@echo "***** Running Makefile target roles_rehearsal_clean *****"
	@echo ""
	cd $(MLE_HOME)/Parts/roles/inventor/build/linux/ivrole-rehearsal; make clean;

roles_runtime_clean: check_env roles_runtime_stage
	@echo ""
	@echo "***** Running Makefile target roles_runtime_clean *****"
	@echo ""
	cd $(MLE_HOME)/Parts/roles/inventor/build/linux/ivrole-runtime; make clean;

roles_inventor_clean: check_env roles_inventor_stage
	@echo ""
	@echo "***** Running Makefile target roles_inventor_clean *****"
	@echo ""
	cd $(MLE_HOME)/Parts/roles/inventor/build/linux/ivrole-inventor; make clean;

roles_clobber: roles_rehearsal_clobber roles_runtime_clobber roles_inventor_clobber

roles_rehearsal_clobber: check_env roles_rehearsal_stage
	@echo ""
	@echo "***** Running Makefile target roles_rehearsal_clobber *****"
	@echo ""
	cd $(MLE_HOME)/Parts/roles/inventor/build/linux/ivrole-rehearsal; make maintainer-clean;

roles_runtime_clobber: check_env roles_runtime_stage
	@echo ""
	@echo "***** Running Makefile target roles_runtime_clobber *****"
	@echo ""
	cd $(MLE_HOME)/Parts/roles/inventor/build/linux/ivrole-runtime; make maintainer-clean;

roles_inventor_clobber: check_env roles_inventor_stage
	@echo ""
	@echo "***** Running Makefile target roles_inventor_clobber *****"
	@echo ""
	cd $(MLE_HOME)/Parts/roles/inventor/build/linux/ivrole-inventor; make maintainer-clean;

roles_install: roles_rehearsal_clean roles_rehearsal_install roles_runtime_clean roles_runtime_install roles_inventor_clean roles_inventor_install

roles_rehearsal_install: roles_rehearsal
	@echo ""
	@echo "***** Running Makefile target roles_rehearsal_install *****"
	@echo ""
	cd $(MLE_HOME)/Parts/roles/inventor/build/linux/ivrole-rehearsal; MLE_ROOT=$(MLE_ROOT) make install;

roles_runtime_install: roles_runtime
	@echo ""
	@echo "***** Running Makefile target roles_runtime_install *****"
	@echo ""
	cd $(MLE_HOME)/Parts/roles/inventor/build/linux/ivrole-runtime; MLE_ROOT=$(MLE_ROOT) make install;

roles_inventor_install: roles_inventor
	@echo ""
	@echo "***** Running Makefile target roles_inventor_install *****"
	@echo ""
	cd $(MLE_HOME)/Parts/roles/inventor/build/linux/ivrole-inventor; MLE_ROOT=$(MLE_ROOT) make install;

roles_uninstall: roles_rehearsal_uninstall roles_runtime_uninstall roles_inventor_uninstall

roles_rehearsal_uninstall: check_env roles_rehearsal_stage
	@echo ""
	@echo "***** Running Makefile target roles_rehearsal_uninstall *****"
	@echo ""
	cd $(MLE_HOME)/Parts/roles/inventor/build/linux/ivrole-rehearsal; MLE_ROOT=$(MLE_ROOT) make uninstall;

roles_runtime_uninstall: check_env roles_runtime_stage
	@echo ""
	@echo "***** Running Makefile target roles_runtime_uninstall *****"
	@echo ""
	cd $(MLE_HOME)/Parts/roles/inventor/build/linux/ivrole-runtime; MLE_ROOT=$(MLE_ROOT) make uninstall;

roles_inventor_uninstall: check_env roles_inventor_stage
	@echo ""
	@echo "***** Running Makefile target roles_inventor_uninstall *****"
	@echo ""
	cd $(MLE_HOME)/Parts/roles/inventor/build/linux/ivrole-inventor; MLE_ROOT=$(MLE_ROOT) make uninstall;

# Targets for Magic Lantern SDK MediaRefs

$(MLE_HOME)/Parts/mediaref/inventor/build/linux/ivmref-rehearsal/Makefile:
	@echo ""
	@echo "***** Running Makefile target mediaref_rehearsal configure *****"
	@echo ""
	cd $(MLE_HOME)/Parts/mediaref/inventor/build/linux/ivmref-rehearsal; libtoolize; aclocal; automake --add-missing --ignore-deps; autoconf; ./configure;

$(MLE_HOME)/Parts/mediaref/inventor/build/linux/ivmref-runtime/Makefile:
	@echo ""
	@echo "***** Running Makefile target mediaref_runtime configure *****"
	@echo ""
	cd $(MLE_HOME)/Parts/mediaref/inventor/build/linux/ivmref-runtime; libtoolize; aclocal; automake --add-missing --ignore-deps; autoconf; ./configure;

$(MLE_HOME)/Parts/mediaref/inventor/build/linux/ivmref-inventor/Makefile:
	@echo ""
	@echo "***** Running Makefile target mediaref_inventor configure *****"
	@echo ""
	cd $(MLE_HOME)/Parts/mediaref/inventor/build/linux/ivmref-inventor; libtoolize; aclocal; automake --add-missing --ignore-deps; autoconf; ./configure;

mediarefs_stage: mediarefs_rehearsal_stage mediarefs_runtime_stage mediarefs_inventor_stage

mediarefs_rehearsal_stage: $(MLE_HOME)/Parts/mediaref/inventor/build/linux/ivmref-rehearsal/Makefile

mediarefs_runtime_stage: $(MLE_HOME)/Parts/mediaref/inventor/build/linux/ivmref-runtime/Makefile

mediarefs_inventor_stage: $(MLE_HOME)/Parts/mediaref/inventor/build/linux/ivmref-inventor/Makefile

mediarefs: mediarefs_rehearsal_clean mediarefs_rehearsal mediarefs_runtime_clean mediarefs_runtime mediarefs_inventor_clean mediarefs_inventor

mediarefs_rehearsal: check_env libmlert_rehearsal_install mediarefs_rehearsal_stage
	@echo ""
	@echo "***** Running Makefile target mediarefs_rehearsal *****"
	@echo ""
	cd $(MLE_HOME)/Parts/mediaref/inventor/build/linux/ivmref-rehearsal; make;

mediarefs_runtime: check_env libmlert_runtime_install mediarefs_runtime_stage
	@echo ""
	@echo "***** Running Makefile target mediarefs_runtime *****"
	@echo ""
	cd $(MLE_HOME)/Parts/mediaref/inventor/build/linux/ivmref-runtime; make;

mediarefs_inventor: check_env libmlert_inventor_install mediarefs_inventor_stage
	@echo ""
	@echo "***** Running Makefile target mediarefs_inventor *****"
	@echo ""
	cd $(MLE_HOME)/Parts/mediaref/inventor/build/linux/ivmref-inventor; make;

mediarefs_clean: mediarefs_rehearsal_clean mediarefs_runtime_clean mediarefs_inventor_clean

mediarefs_rehearsal_clean: check_env mediarefs_rehearsal_stage
	@echo ""
	@echo "***** Running Makefile target mediarefs_rehearsal_clean *****"
	@echo ""
	cd $(MLE_HOME)/Parts/mediaref/inventor/build/linux/ivmref-rehearsal; make clean;

mediarefs_runtime_clean: check_env mediarefs_runtime_stage
	@echo ""
	@echo "***** Running Makefile target mediarefs_runtime_clean *****"
	@echo ""
	cd $(MLE_HOME)/Parts/mediaref/inventor/build/linux/ivmref-runtime; make clean;

mediarefs_inventor_clean: check_env mediarefs_inventor_stage
	@echo ""
	@echo "***** Running Makefile target mediarefs_inventor_clean *****"
	@echo ""
	cd $(MLE_HOME)/Parts/mediaref/inventor/build/linux/ivmref-inventor; make clean;

mediarefs_clobber: mediarefs_rehearsal_clobber mediarefs_runtime_clobber mediarefs_inventor_clobber

mediarefs_rehearsal_clobber: check_env mediarefs_rehearsal_stage
	@echo ""
	@echo "***** Running Makefile target mediarefs_rehearsal_clobber *****"
	@echo ""
	cd $(MLE_HOME)/Parts/mediaref/inventor/build/linux/ivmref-rehearsal; make maintainer-clean;

mediarefs_runtime_clobber: check_env mediarefs_runtime_stage
	@echo ""
	@echo "***** Running Makefile target mediarefs_runtime_clobber *****"
	@echo ""
	cd $(MLE_HOME)/Parts/mediaref/inventor/build/linux/ivmref-runtime; make maintainer-clean;

mediarefs_inventor_clobber: check_env mediarefs_inventor_stage
	@echo ""
	@echo "***** Running Makefile target mediarefs_inventor_clobber *****"
	@echo ""
	cd $(MLE_HOME)/Parts/mediaref/inventor/build/linux/ivmref-inventor; make maintainer-clean;

mediarefs_install: mediarefs_rehearsal_clean mediarefs_rehearsal_install mediarefs_runtime_clean mediarefs_runtime_install mediarefs_inventor_clean  mediarefs_inventor_install

mediarefs_rehearsal_install: mediarefs_rehearsal
	@echo ""
	@echo "***** Running Makefile target mediarefs_rehearsal_install *****"
	@echo ""
	cd $(MLE_HOME)/Parts/mediaref/inventor/build/linux/ivmref-rehearsal; MLE_ROOT=$(MLE_ROOT) make install;

mediarefs_runtime_install: mediarefs_runtime
	@echo ""
	@echo "***** Running Makefile target mediarefs_runtime_install *****"
	@echo ""
	cd $(MLE_HOME)/Parts/mediaref/inventor/build/linux/ivmref-runtime; MLE_ROOT=$(MLE_ROOT) make install;

mediarefs_inventor_install: mediarefs_inventor
	@echo ""
	@echo "***** Running Makefile target mediarefs_inventor_install *****"
	@echo ""
	cd $(MLE_HOME)/Parts/mediaref/inventor/build/linux/ivmref-inventor; MLE_ROOT=$(MLE_ROOT) make install;

mediarefs_uninstall: mediarefs_rehearsal_uninstall mediarefs_runtime_uninstall mediarefs_inventor_uninstall

mediarefs_rehearsal_uninstall: check_env mediarefs_rehearsal_stage
	@echo ""
	@echo "***** Running Makefile target mediarefs_rehearsal_uninstall *****"
	@echo ""
	cd $(MLE_HOME)/Parts/mediaref/inventor/build/linux/ivmref-rehearsal; MLE_ROOT=$(MLE_ROOT) make uninstall;

mediarefs_runtime_uninstall: check_env mediarefs_runtime_stage
	@echo ""
	@echo "***** Running Makefile target mediarefs_runtime_uninstall *****"
	@echo ""
	cd $(MLE_HOME)/Parts/mediaref/inventor/build/linux/ivmref-runtime; MLE_ROOT=$(MLE_ROOT) make uninstall;

mediarefs_inventor_uninstall: check_env mediarefs_inventor_stage
	@echo ""
	@echo "***** Running Makefile target mediarefs_inventor_uninstall *****"
	@echo ""
	cd $(MLE_HOME)/Parts/mediaref/inventor/build/linux/ivmref-inventor; MLE_ROOT=$(MLE_ROOT) make uninstall;

# Targets for Magic Lantern SDK Sets

$(MLE_HOME)/Parts/sets/inventor/build/ivset-rehearsal/Makefile:
	@echo ""
	@echo "***** Running Makefile target sets_rehearsal configure *****"
	@echo ""
	cd $(MLE_HOME)/Parts/sets/inventor/build/ivset-rehearsal; libtoolize; aclocal; automake --add-missing --ignore-deps; autoconf; ./configure;

$(MLE_HOME)/Parts/sets/inventor/build/ivset-runtime/Makefile:
	@echo ""
	@echo "***** Running Makefile target sets_runtime configure *****"
	@echo ""
	cd $(MLE_HOME)/Parts/sets/inventor/build/ivset-runtime; libtoolize; aclocal; automake --add-missing --ignore-deps; autoconf; ./configure;

$(MLE_HOME)/Parts/sets/inventor/build/ivset-inventor/Makefile:
	@echo ""
	@echo "***** Running Makefile target sets_inventor configure *****"
	@echo ""
	cd $(MLE_HOME)/Parts/sets/inventor/build/ivset-inventor; libtoolize; aclocal; automake --add-missing --ignore-deps; autoconf; ./configure;

sets_stage: sets_rehearsal_stage sets_runtime_stage sets_inventor_stage

sets_rehearsal_stage: $(MLE_HOME)/Parts/sets/inventor/build/ivset-rehearsal/Makefile

sets_runtime_stage: $(MLE_HOME)/Parts/sets/inventor/build/ivset-runtime/Makefile

sets_inventor_stage: $(MLE_HOME)/Parts/sets/inventor/build/ivset-inventor/Makefile

sets: sets_rehearsal_clean sets_rehearsal sets_runtime_clean sets_runtime sets_inventor_clean sets_inventor

sets_rehearsal: check_env props_install libmlert_rehearsal_install sets_rehearsal_stage
	@echo ""
	@echo "***** Running Makefile target sets_rehearsal *****"
	@echo ""
	cd $(MLE_HOME)/Parts/sets/inventor/build/ivset-rehearsal; make;

sets_runtime: check_env props_install libmlert_runtime_install sets_runtime_stage
	@echo ""
	@echo "***** Running Makefile target sets_runtime *****"
	@echo ""
	cd $(MLE_HOME)/Parts/sets/inventor/build/ivset-runtime; make;

sets_inventor: check_env props_install libmlert_inventor_install sets_inventor_stage
	@echo ""
	@echo "***** Running Makefile target sets_inventor *****"
	@echo ""
	cd $(MLE_HOME)/Parts/sets/inventor/build/ivset-inventor; make;

sets_clean: sets_rehearsal_clean sets_runtime_clean sets_inventor_clean

sets_rehearsal_clean: check_env sets_rehearsal_stage
	@echo ""
	@echo "***** Running Makefile target sets_rehearsal_clean *****"
	@echo ""
	cd $(MLE_HOME)/Parts/sets/inventor/build/ivset-rehearsal; make clean;

sets_runtime_clean: check_env sets_runtime_stage
	@echo ""
	@echo "***** Running Makefile target sets_runtime_clean *****"
	@echo ""
	cd $(MLE_HOME)/Parts/sets/inventor/build/ivset-runtime; make clean;

sets_inventor_clean: check_env sets_inventor_stage
	@echo ""
	@echo "***** Running Makefile target sets_inventor_clean *****"
	@echo ""
	cd $(MLE_HOME)/Parts/sets/inventor/build/ivset-runtime; make clean;

sets_clobber: sets_rehearsal_clobber sets_runtime_clobber sets_inventor_clobber

sets_rehearsal_clobber: check_env sets_rehearsal_stage
	@echo ""
	@echo "***** Running Makefile target sets_rehearsal_clobber *****"
	@echo ""
	cd $(MLE_HOME)/Parts/sets/inventor/build/ivset-rehearsal; make maintainer-clean;

sets_runtime_clobber: check_env sets_runtime_stage
	@echo ""
	@echo "***** Running Makefile target sets_runtime_clobber *****"
	@echo ""
	cd $(MLE_HOME)/Parts/sets/inventor/build/ivset-runtime; make maintainer-clean;

sets_inventor_clobber: check_env sets_inventor_stage
	@echo ""
	@echo "***** Running Makefile target sets_inventor_clobber *****"
	@echo ""
	cd $(MLE_HOME)/Parts/sets/inventor/build/ivset-runtime; make maintainer-clean;

sets_install: sets_rehearsal_clean sets_rehearsal_install sets_runtime_clean sets_runtime_install sets_inventor_clean sets_inventor_install

sets_rehearsal_install: sets_rehearsal
	@echo ""
	@echo "***** Running Makefile target sets_rehearsal_install *****"
	@echo ""
	cd $(MLE_HOME)/Parts/sets/inventor/build/ivset-rehearsal; MLE_ROOT=$(MLE_ROOT) make install;

sets_runtime_install: sets_runtime
	@echo ""
	@echo "***** Running Makefile target sets_runtime_install *****"
	@echo ""
	cd $(MLE_HOME)/Parts/sets/inventor/build/ivset-runtime; MLE_ROOT=$(MLE_ROOT) make install;

sets_inventor_install: sets_inventor
	@echo ""
	@echo "***** Running Makefile target sets_inventor_install *****"
	@echo ""
	cd $(MLE_HOME)/Parts/sets/inventor/build/ivset-inventor; MLE_ROOT=$(MLE_ROOT) make install;

sets_uninstall: sets_rehearsal_uninstall sets_runtime_uninstall sets_inventor_uninstall

sets_rehearsal_uninstall: check_env sets_rehearsal_stage
	@echo ""
	@echo "***** Running Makefile target sets_rehearsal_uninstall *****"
	@echo ""
	cd $(MLE_HOME)/Parts/sets/inventor/build/ivset-rehearsal; MLE_ROOT=$(MLE_ROOT) make uninstall;

sets_runtime_uninstall: check_env sets_runtime_stage
	@echo ""
	@echo "***** Running Makefile target sets_runtime_uninstall *****"
	@echo ""
	cd $(MLE_HOME)/Parts/sets/inventor/build/ivset-runtime; MLE_ROOT=$(MLE_ROOT) make uninstall;

sets_inventor_uninstall: check_env sets_inventor_stage
	@echo ""
	@echo "***** Running Makefile target sets_inventor_uninstall *****"
	@echo ""
	cd $(MLE_HOME)/Parts/sets/inventor/build/ivset-inventor; MLE_ROOT=$(MLE_ROOT) make uninstall;

# Targets for Magic Lantern SDK Stages

$(MLE_HOME)/Parts/stages/inventor/build/linux/ivstage-rehearsal/Makefile:
	@echo ""
	@echo "***** Running Makefile target stages_rehearsal configure *****"
	@echo ""
	cd $(MLE_HOME)/Parts/stages/inventor/build/linux/ivstage-rehearsal; libtoolize; aclocal; automake --add-missing --ignore-deps; autoconf; ./configure;

$(MLE_HOME)/Parts/stages/inventor/build/linux/ivstage-runtime/Makefile:
	@echo ""
	@echo "***** Running Makefile target stages_runtime configure *****"
	@echo ""
	cd $(MLE_HOME)/Parts/stages/inventor/build/linux/ivstage-runtime; libtoolize; aclocal; automake --add-missing --ignore-deps; autoconf; ./configure;

$(MLE_HOME)/Parts/stages/inventor/build/linux/ivstage-inventor/Makefile:
	@echo ""
	@echo "***** Running Makefile target stages_inventor configure *****"
	@echo ""
	cd $(MLE_HOME)/Parts/stages/inventor/build/linux/ivstage-inventor; libtoolize; aclocal; automake --add-missing --ignore-deps; autoconf; ./configure;

stages_stage: stages_rehearsal_stage stages_runtime_stage stages_inventor_stage

stages_rehearsal_stage: $(MLE_HOME)/Parts/stages/inventor/build/linux/ivstage-rehearsal/Makefile

stages_runtime_stage: $(MLE_HOME)/Parts/stages/inventor/build/linux/ivstage-runtime/Makefile

stages_inventor_stage: $(MLE_HOME)/Parts/stages/inventor/build/linux/ivstage-inventor/Makefile

stages: stages_rehearsal_clean stages_rehearsal stages_runtime_clean stages_runtime stages_inventor_clean stages_inventor

stages_rehearsal: check_env libmlert_rehearsal_install roles_rehearsal_install mediarefs_rehearsal_install sets_rehearsal_install stages_rehearsal_stage
	@echo ""
	@echo "***** Running Makefile target stages_rehearsal *****"
	@echo ""
	cd $(MLE_HOME)/Parts/stages/inventor/build/linux/ivstage-rehearsal; make clean; make;

stages_runtime: check_env libmlert_runtime_install roles_runtime_install mediarefs_runtime_install sets_runtime_install stages_runtime_stage
	@echo ""
	@echo "***** Running Makefile target stages_runtime *****"
	@echo ""
	cd $(MLE_HOME)/Parts/stages/inventor/build/linux/ivstage-runtime; make clean; make;

stages_inventor: check_env libmlert_inventor_install roles_inventor_install mediarefs_inventor_install sets_inventor_install stages_inventor_stage
	@echo ""
	@echo "***** Running Makefile target stages_inventor *****"
	@echo ""
	cd $(MLE_HOME)/Parts/stages/inventor/build/linux/ivstage-inventor; make clean; make;

stages_clean: stages_rehearsal_clean stages_runtime_clean stages_inventor_clean

stages_rehearsal_clean: check_env stages_rehearsal_stage
	@echo ""
	@echo "***** Running Makefile target stages_rehearsal_clean *****"
	@echo ""
	cd $(MLE_HOME)/Parts/stages/inventor/build/linux/ivstage-rehearsal; make clean;

stages_runtime_clean: check_env stages_runtime_stage
	@echo ""
	@echo "***** Running Makefile target stages_runtime_clean *****"
	@echo ""
	cd $(MLE_HOME)/Parts/stages/inventor/build/linux/ivstage-runtime; make clean;

stages_inventor_clean: check_env stages_inventor_stage
	@echo ""
	@echo "***** Running Makefile target stages_inventor_clean *****"
	@echo ""
	cd $(MLE_HOME)/Parts/stages/inventor/build/linux/ivstage-inventor; make clean;

stages_clobber: stages_rehearsal_clobber stages_runtime_clobber stages_inventor_clobber

stages_rehearsal_clobber: check_env stages_rehearsal_stage
	@echo ""
	@echo "***** Running Makefile target stages_rehearsal_clobber *****"
	@echo ""
	cd $(MLE_HOME)/Parts/stages/inventor/build/linux/ivstage-rehearsal; make maintainer-clean;

stages_runtime_clobber: check_env stages_runtime_stage
	@echo ""
	@echo "***** Running Makefile target stages_runtime_clobber *****"
	@echo ""
	cd $(MLE_HOME)/Parts/stages/inventor/build/linux/ivstage-runtime; make maintainer-clean;

stages_inventor_clobber: check_env stages_inventor_stage
	@echo ""
	@echo "***** Running Makefile target stages_inventor_clobber *****"
	@echo ""
	cd $(MLE_HOME)/Parts/stages/inventor/build/linux/ivstage-inventor; make maintainer-clean;

stages_install: stages_rehearsal_clean stages_rehearsal_install stages_runtime_clean stages_runtime_install stages_inventor_clean stages_inventor_install

stages_rehearsal_install: stages_rehearsal
	@echo ""
	@echo "***** Running Makefile target stages_rehearsal_install *****"
	@echo ""
	cd $(MLE_HOME)/Parts/stages/inventor/build/linux/ivstage-rehearsal; MLE_ROOT=$(MLE_ROOT) make install;

stages_runtime_install: stages_runtime
	@echo ""
	@echo "***** Running Makefile target stages_runtime_install *****"
	@echo ""
	cd $(MLE_HOME)/Parts/stages/inventor/build/linux/ivstage-runtime; MLE_ROOT=$(MLE_ROOT) make install;

stages_inventor_install: stages_inventor
	@echo ""
	@echo "***** Running Makefile target stages_inventor_install *****"
	@echo ""
	cd $(MLE_HOME)/Parts/stages/inventor/build/linux/ivstage-inventor; MLE_ROOT=$(MLE_ROOT) make install;

stages_uninstall: stages_rehearsal_uninstall stages_runtime_uninstall stages_inventor_uninstall

stages_rehearsal_uninstall: check_env stages_rehearsal_stage
	@echo ""
	@echo "***** Running Makefile target stages_rehearsal_uninstall *****"
	@echo ""
	cd $(MLE_HOME)/Parts/stages/inventor/build/linux/ivstage-rehearsal; MLE_ROOT=$(MLE_ROOT) make uninstall;

stages_runtime_uninstall: check_env stages_runtime_stage
	@echo ""
	@echo "***** Running Makefile target stages_runtime_uninstall *****"
	@echo ""
	cd $(MLE_HOME)/Parts/stages/inventor/build/linux/ivstage-runtime; MLE_ROOT=$(MLE_ROOT) make uninstall;

stages_inventor_uninstall: check_env stages_inventor_stage
	@echo ""
	@echo "***** Running Makefile target stages_inventor_uninstall *****"
	@echo ""
	cd $(MLE_HOME)/Parts/stages/inventor/build/linux/ivstage-inventor; MLE_ROOT=$(MLE_ROOT) make uninstall;

# Targets for Magic Lantern SDK Actors

$(MLE_HOME)/Parts/actors/inventor/build/linux/ivactor_rehearsal/Makefile:
	@echo ""
	@echo "***** Running Makefile target actors_rehearsal configure *****"
	@echo ""
	cd $(MLE_HOME)/Parts/actors/inventor/build/linux/ivactor_rehearsal; libtoolize; aclocal; automake --add-missing --ignore-deps; autoconf; ./configure;

$(MLE_HOME)/Parts/actors/inventor/build/linux/ivactor_runtime/Makefile:
	@echo ""
	@echo "***** Running Makefile target actors_runtime configure *****"
	@echo ""
	cd $(MLE_HOME)/Parts/actors/inventor/build/linux/ivactor_runtime; libtoolize; aclocal; automake --add-missing --ignore-deps; autoconf; ./configure;

$(MLE_HOME)/Parts/actors/inventor/build/linux/ivactor_inventor/Makefile:
	@echo ""
	@echo "***** Running Makefile target actors_inventor configure *****"
	@echo ""
	cd $(MLE_HOME)/Parts/actors/inventor/build/linux/ivactor_inventor; libtoolize; aclocal; automake --add-missing --ignore-deps; autoconf; ./configure;

actors_stage: actors_rehearsal_stage actors_runtime_stage actors_inventor_stage

actors_rehearsal_stage: $(MLE_HOME)/Parts/actors/inventor/build/linux/ivactor_rehearsal/Makefile

actors_runtime_stage: $(MLE_HOME)/Parts/actors/inventor/build/linux/ivactor_runtime/Makefile

actors_inventor_stage: $(MLE_HOME)/Parts/actors/inventor/build/linux/ivactor_inventor/Makefile

actors: actors_rehearsal_clean actors_rehearsal actors_runtime_clean actors_runtime actors_inventor_clean actors_inventor

actors_rehearsal: check_env actors_rehearsal_stage
	@echo ""
	@echo "***** Running Makefile target actors_rehearsal *****"
	@echo ""
	cd $(MLE_HOME)/Parts/actors/inventor/build/linux/ivactor_rehearsal; make;

actors_runtime: check_env actors_runtime_stage
	@echo ""
	@echo "***** Running Makefile target actors_runtime *****"
	@echo ""
	cd $(MLE_HOME)/Parts/actors/inventor/build/linux/ivactor_runtime; make;

actors_inventor: check_env actors_inventor_stage
	@echo ""
	@echo "***** Running Makefile target actors_inventor *****"
	@echo ""
	cd $(MLE_HOME)/Parts/actors/inventor/build/linux/ivactor_inventor; make;

actors_clean: actors_rehearsal_clean actors_runtime_clean actors_inventor_clean

actors_rehearsal_clean: check_env actors_rehearsal_stage
	@echo ""
	@echo "***** Running Makefile target actors_rehearsal_clean *****"
	@echo ""
	cd $(MLE_HOME)/Parts/actors/inventor/build/linux/ivactor_rehearsal; make clean;

actors_runtime_clean: check_env actors_runtime_stage
	@echo ""
	@echo "***** Running Makefile target actors_runtime_clean *****"
	@echo ""
	cd $(MLE_HOME)/Parts/actors/inventor/build/linux/ivactor_runtime; make clean;

actors_inventor_clean: check_env actors_inventor_stage
	@echo ""
	@echo "***** Running Makefile target actors_inventor_clean *****"
	@echo ""
	cd $(MLE_HOME)/Parts/actors/inventor/build/linux/ivactor_inventor; make clean;

actors_clobber: actors_rehearsal_clobber actors_runtime_clobber actors_inventor_clobber

actors_rehearsal_clobber: check_env actors_rehearsal_stage
	@echo ""
	@echo "***** Running Makefile target actors_rehearsal_clobber *****"
	@echo ""
	cd $(MLE_HOME)/Parts/actors/inventor/build/linux/ivactor_rehearsal; make maintainer-clean;

actors_runtime_clobber: check_env actors_runtime_stage
	@echo ""
	@echo "***** Running Makefile target actors_runtime_clobber *****"
	@echo ""
	cd $(MLE_HOME)/Parts/actors/inventor/build/linux/ivactor_runtime; make maintainer-clean;

actors_inventor_clobber: check_env actors_inventor_stage
	@echo ""
	@echo "***** Running Makefile target actors_inventor_clobber *****"
	@echo ""
	cd $(MLE_HOME)/Parts/actors/inventor/build/linux/ivactor_inventor; make maintainer-clean;

actors_install: actors_rehearsal_clean actors_rehearsal_install actors_runtime_clean actors_runtime_install actors_inventor_clean actors_inventor_install

actors_rehearsal_install: actors_rehearsal
	@echo ""
	@echo "***** Running Makefile target actors_rehearsal_install *****"
	@echo ""
	cd $(MLE_HOME)/Parts/actors/inventor/build/linux/ivactor_rehearsal; MLE_ROOT=$(MLE_ROOT) make install;

actors_runtime_install: actors_runtime
	@echo ""
	@echo "***** Running Makefile target actors_runtime_install *****"
	@echo ""
	cd $(MLE_HOME)/Parts/actors/inventor/build/linux/ivactor_runtime; MLE_ROOT=$(MLE_ROOT) make install;

actors_inventor_install: actors_inventor
	@echo ""
	@echo "***** Running Makefile target actors_inventor_install *****"
	@echo ""
	cd $(MLE_HOME)/Parts/actors/inventor/build/linux/ivactor_inventor; MLE_ROOT=$(MLE_ROOT) make install;

actors_uninstall: actors_rehearsal_uninstall actors_runtime_uninstall actors_inventor_uninstall

actors_rehearsal_uninstall: check_env actors_rehearsal_stage
	@echo ""
	@echo "***** Running Makefile target actors_rehearsal_uninstall *****"
	@echo ""
	cd $(MLE_HOME)/Parts/actors/inventor/build/linux/ivactor_rehearsal; MLE_ROOT=$(MLE_ROOT) make uninstall;

actors_runtime_uninstall: check_env actors_runtime_stage
	@echo ""
	@echo "***** Running Makefile target actors_runtime_uninstall *****"
	@echo ""
	cd $(MLE_HOME)/Parts/actors/inventor/build/linux/ivactor_runtime; MLE_ROOT=$(MLE_ROOT) make uninstall;

actors_inventor_uninstall: check_env actors_inventor_stage
	@echo ""
	@echo "***** Running Makefile target actors_inventor_uninstall *****"
	@echo ""
	cd $(MLE_HOME)/Parts/actors/inventor/build/linux/ivactor_inventor; MLE_ROOT=$(MLE_ROOT) make uninstall;

# Targets for Magic Lantern SDK Players

$(MLE_HOME)/Players/rehearsal/build/linux/Makefile:
	@echo ""
	@echo "***** Running Makefile target players configure *****"
	@echo ""
	cd $(MLE_HOME)/Players/rehearsal/build/linux; libtoolize; aclocal; automake --add-missing --ignore-deps; autoconf; ./configure;

players_stage: $(MLE_HOME)/Players/rehearsal/build/linux/Makefile

players: check_env players_stage libmleatk_install stages_rehearsal_install libmlloaders_rehearsal_install
	@echo ""
	@echo "***** Running Makefile target players *****"
	@echo ""
	cd $(MLE_HOME)/Players/rehearsal/build/linux; MLE_ROOT=$(MLE_ROOT) make;

players_clean: check_env players_stage
	@echo ""
	@echo "***** Running Makefile target players_clean *****"
	@echo ""
	cd $(MLE_HOME)/Players/rehearsal/build/linux; make clean;

players_clobber: check_env players_stage
	@echo ""
	@echo "***** Running Makefile target players_clobber *****"
	@echo ""
	cd $(MLE_HOME)/Players/rehearsal/build/linux; make maintainer-clean;

players_install: players
	@echo ""
	@echo "***** Running Makefile target players_install *****"
	@echo ""
	cd $(MLE_HOME)/Players/rehearsal/build/linux; MLE_ROOT=$(MLE_ROOT) make install;

players_uninstall: check_env players_stage
	@echo ""
	@echo "***** Running Makefile target players_uninstall *****"
	@echo ""
	cd $(MLE_HOME)/Players/rehearsal/build/linux; MLE_ROOT=$(MLE_ROOT) make uninstall;

# Magic Lantern SDK
#  sdk build does not include Qt target for Linux. See Makefile.qt.

sdk: libmlutil libmlmath libDWP libDPP libplayprint libDPPGen gentables gengroup genscene genmedia genmakefile genppscript gendpp dumpgroup dumpscene dumpmedia dumpdpp libmlert props roles mediarefs sets stages actors libmlloaders

sdk_clean: libmlutil_clean libmlmath_clean libDWP_clean libDPP_clean libplayprint_clean libDPPGen_clean gentables_clean gengroup_clean genscene_clean genmedia_clean genmakefile_clean genppscript_clean gendpp_clean dumpgroup_clean dumpscene_clean dumpmedia_clean dumpdpp_clean libmlert_clean props_clean roles_clean mediarefs_clean sets_clean stages_clean actors_clean libmlloaders_clean

sdk_clobber: libmlutil_clobber libmlmath_clobber libDWP_clobber libDPP_clobber libplayprint_clobber libDPPGen_clobber gentables_clobber gengroup_clobber genscene_clobber genmedia_clobber genmakefile_clobber genppscript_clobber gendpp_clobber dumpgroup_clobber dumpscene_clobber dumpmedia_clobber dumpdpp_clobber libmlert_clobber props_clobber roles_clobber mediarefs_clobber sets_clobber stages_clobber actors_clobber libmlloaders_clobber

sdk_install: libmlutil_install libmlmath_install libDWP_install libDPP_install libplayprint_install libDPPGen_install gentables_install gengroup_install genscene_install genmedia_install genmakefile_install genppscript_install gendpp_install dumpgroup_install dumpscene_install dumpmedia_install dumpdpp_install libmlert_install props_install roles_install mediarefs_install sets_install stages_install actors_install libmlloaders_install

sdk_uninstall: libmlutil_uninstall libmlmath_uninstall libDWP_uninstall libDPP_uninstall libplayprint_uninstall libDPPGen_uninstall gentables_uninstall gengroup_uninstall genscene_uninstall genmedia_uninstall genmakefile_uninstall genppscript_uninstall gendpp_uninstall dumpgroup_uninstall dumpscene_uninstall dumpmedia_uninstall dumpdpp_uninstall libmlert_uninstall props_uninstall roles_uninstall mediarefs_uninstall sets_uninstall stages_uninstall actors_uninstall libmlloaders_uninstall

sdk_rehearsal: libmlutil libmlmath libDWP libDPP libplayprint libDPPGen gentables gengroup genscene genmedia genmakefile genppscript gendpp dumpgroup dumpscene dumpmedia dumpdpp libmlert_rehearsal props roles_rehearsal mediarefs_rehearsal sets_rehearsal stages_rehearsal actors_rehearsal libmleatk libmlloaders_rehearsal players

sdk_rehearsal_clean: libmlutil_clean libmlmath_clean libDWP_clean libDPP_clean libplayprint_clean libDPPGen_clean gentables_clean gengroup_clean genscene_clean genmedia_clean genmakefile_clean genppscript_clean gendpp_clean dumpgroup_clean dumpscene_clean dumpmedia_clean dumpdpp_clean libmlert_rehearsal_clean props_clean roles_rehearsal_clean mediarefs_rehearsal_clean sets_rehearsal_clean stages_rehearsal_clean actors_rehearsal_clean libmleatk_clean libmlloaders_rehearsal_clean players_clean

sdk_rehearsal_clobber: libmlutil_clobber libmlmath_clobber libDWP_clobber libDPP_clobber libplayprint_clobber libDPPGen_clobber gentables_clobber gengroup_clobber genscene_clobber genmedia_clobber genmakefile_clobber genppscript_clobber gendpp_clobber dumpgroup_clobber dumpscene_clobber dumpmedia_clobber dumpdpp_clobber libmlert_rehearsal_clobber props_clobber roles_rehearsal_clobber mediarefs_rehearsal_clobber sets_rehearsal_clobber stages_rehearsal_clobber actors_rehearsal_clobber libmleatk_clobber libmlloaders_rehearsal_clobber players_clobber

sdk_rehearsal_install: libmlutil_install libmlmath_install libDWP_install libDPP_install libplayprint_install libDPPGen_install gentables_install gengroup_install genscene_install genmedia_install genmakefile_install genppscript_install gendpp_install dumpgroup_install dumpscene_install dumpmedia_install dumpdpp_install libmlert_rehearsal_install props_install roles_rehearsal_install mediarefs_rehearsal_install sets_rehearsal_install stages_rehearsal_install actors_rehearsal_install libmleatk_install libmlloaders_rehearsal_install players_install

sdk_rehearsal_uninstall: libmlutil_uninstall libmlmath_uninstall libDWP_uninstall libDPP_uninstall libplayprint_uninstall libDPPGen_uninstall gentables_uninstall gengroup_uninstall genscene_uninstall genmedia_uninstall genmakefile_uninstall genppscript_uninstall gendpp_uninstall dumpgroup_uninstall dumpscene_uninstall dumpmedia_uninstall dumpdpp_uninstall libmlert_rehearsal_uninstall props_uninstall roles_rehearsal_uninstall mediarefs_rehearsal_uninstall sets_rehearsal_uninstall stages_rehearsal_uninstall actors_rehearsal_uninstall libmleatk_uninstall libmlloaders_rehearsal_uninstall players_uninstall

sdk_runtime: libmlutil libmlmath libDWP libDPP libplayprint libDPPGen gentables gengroup genscene genmedia genmakefile genppscript gendpp dumpgroup dumpscene dumpmedia dumpdpp libmlert_runtime props roles_runtime mediarefs_runtime sets_runtime stages_runtime actors_runtime libmlloaders_runtime

sdk_runtime_clean: libmlutil_clean libmlmath_clean libDWP_clean libDPP_clean libplayprint_clean libDPPGen_clean gentables_clean gengroup_clean genscene_clean genmedia_clean genmakefile_clean genppscript_clean gendpp_clean dumpgroup_clean dumpscene_clean dumpmedia_clean dumpdpp_clean libmlert_runtime_clean props_clean roles_runtime_clean mediarefs_runtime_clean sets_runtime_clean stages_runtime_clean actors_runtime_clean libmlloaders_runtime_clean

sdk_runtime_clobber: libmlutil_clobber libmlmath_clobber libDWP_clobber libDPP_clobber libplayprint_clobber libDPPGen_clobber gentables_clobber gengroup_clobber genscene_clobber genmedia_clobber genmakefile_clobber genppscript_clobber gendpp_clobber dumpgroup_clobber dumpscene_clobber dumpmedia_clobber dumpdpp_clobber libmlert_runtime_clobber props_clobber roles_runtime_clobber mediarefs_runtime_clobber sets_runtime_clobber stages_runtime_clobber actors_runtime_clobber libmlloaders_runtime_clobber

sdk_runtime_install: libmlutil_install libmlmath_install libDWP_install libDPP_install libplayprint_install libDPPGen_install gentables_install gengroup_install genscene_install genmedia_install genmakefile_install genppscript_install gendpp_install dumpgroup_install dumpscene_install dumpmedia_install dumpdpp_install libmlert_runtime_install props_install roles_runtime_install mediarefs_runtime_install sets_runtime_install stages_runtime_install actors_runtime_install libmlloaders_runtime_install

sdk_runtime_uninstall: libmlutil_uninstall libmlmath_uninstall libDWP_uninstall libDPP_uninstall libplayprint_uninstall libDPPGen_uninstall gentables_uninstall gengroup_uninstall genscene_uninstall genmedia_uninstall genmakefile_uninstall genppscript_uninstall gendpp_uninstall dumpgroup_uninstall dumpscene_uninstall dumpmedia_uninstall dumpdpp_uninstall libmlert_runtime_uninstall props_uninstall roles_runtime_uninstall mediarefs_runtime_uninstall sets_runtime_uninstall stages_runtime_uninstall actors_runtime_uninstall libmlloaders_runtime_uninstall

sdk_inventor: libmlutil libmlmath libDWP libDPP libplayprint libDPPGen gentables gengroup genscene genmedia genmakefile genppscript gendpp dumpgroup dumpscene dumpmedia dumpdpp libmlert_inventor props roles_inventor mediarefs_inventor sets_inventor stages_inventor actors_inventor libmlloaders_inventor

sdk_inventor_clean: libmlutil_clean libmlmath_clean libDWP_clean libDPP_clean libplayprint_clean libDPPGen_clean gentables_clean gengroup_clean genscene_clean genmedia_clean genmakefile_clean genppscript_clean gendpp_clean dumpgroup_clean dumpscene_clean dumpmedia_clean dumpdpp_clean libmlert_inventor_clean props_clean roles_inventor_clean mediarefs_inventor_clean sets_inventor_clean stages_inventor_clean actors_inventor_clean libmlloaders_inventor_clean

sdk_inventor_clobber: libmlutil_clobber libmlmath_clobber libDWP_clobber libDPP_clobber libplayprint_clobber libDPPGen_clobber gentables_clobber gengroup_clobber genscene_clobber genmedia_clobber genmakefile_clobber genppscript_clobber gendpp_clobber dumpgroup_clobber dumpscene_clobber dumpmedia_clobber dumpdpp_clobber libmlert_inventor_clobber props_clobber roles_inventor_clobber mediarefs_inventor_clobber sets_inventor_clobber stages_inventor_clobber actors_inventor_clobber libmlloaders_inventor_clobber

sdk_inventor_install: libmlutil_install libmlmath_install libDWP_install libDPP_install libplayprint_install libDPPGen_install gentables_install gengroup_install genscene_install genmedia_install genmakefile_install genppscript_install gendpp_install dumpgroup_install dumpscene_install dumpmedia_install dumpdpp_install libmlert_inventor_install props_install roles_inventor_install mediarefs_inventor_install sets_inventor_install stages_inventor_install actors_inventor_install libmlloaders_inventor_install

sdk_inventor_uninstall: libmlutil_uninstall libmlmath_uninstall libDWP_uninstall libDPP_uninstall libplayprint_uninstall libDPPGen_uninstall gentables_uninstall gengroup_uninstall genscene_uninstall genmedia_uninstall genmakefile_uninstall genppscript_uninstall gendpp_uninstall dumpgroup_uninstall dumpscene_uninstall dumpmedia_uninstall dumpdpp_uninstall libmlert_inventor_uninstall props_uninstall roles_inventor_uninstall mediarefs_inventor_uninstall sets_inventor_uninstall stages_inventor_uninstall actors_inventor_uninstall libmlloaders_inventor_uninstall

# Targets for Magic Lantern Authoring Toolkit (ATK)

$(MLE_HOME)/ATK/linux/rehearsal/Makefile:
	@echo ""
	@echo "***** Running Makefile target libmleatk configure *****"
	@echo ""
	cd $(MLE_HOME)/ATK/linux/rehearsal; libtoolize; aclocal; automake --add-missing; autoconf; ./configure;

libmleatk_stage: $(MLE_HOME)/ATK/linux/rehearsal/Makefile

libmleatk: check_env libmleatk_stage
	@echo ""
	@echo "***** Running Makefile target libmleatk *****"
	@echo ""
	cd $(MLE_HOME)/ATK/linux/rehearsal; MLE_ROOT=$(MLE_ROOT) make;

libmleatk_clean: check_env libmleatk_stage
	@echo ""
	@echo "***** Running Makefile target libmleatk_clean *****"
	@echo ""
	cd $(MLE_HOME)/ATK/linux/rehearsal; make clean;

libmleatk_clobber: check_env libmleatk_stage
	@echo ""
	@echo "***** Running Makefile target libmleatk_clobber *****"
	@echo ""
	cd $(MLE_HOME)/ATK/linux/rehearsal; make maintainer-clean;

libmleatk_install: libmleatk
	@echo ""
	@echo "***** Running Makefile target libmleatk_install *****"
	@echo ""
	cd $(MLE_HOME)/ATK/linux/rehearsal; MLE_ROOT=$(MLE_ROOT) make install;

libmleatk_uninstall: check_env libmleatk_stage
	@echo ""
	@echo "***** Running Makefile target libmleatk_uninstall *****"
	@echo ""
	cd $(MLE_HOME)/ATK/linux/rehearsal; MLE_ROOT=$(MLE_ROOT) make uninstall;

# Targets for Magic Lantern Loader library.

$(MLE_HOME)/Parts/loaders/build/rehearsal/Makefile:
	@echo ""
	@echo "***** Running Makefile target libmlloaders_rehearsal configure *****"
	@echo ""
	cd $(MLE_HOME)/Parts/loaders/build/rehearsal; libtoolize; aclocal; automake --add-missing --ignore-deps; autoconf; ./configure;

$(MLE_HOME)/Parts/loaders/build/runtime/Makefile:
	@echo ""
	@echo "***** Running Makefile target libmlloaders_runtime configure *****"
	@echo ""
	cd $(MLE_HOME)/Parts/loaders/build/runtime; libtoolize; aclocal; automake --add-missing --ignore-deps; autoconf; ./configure;

$(MLE_HOME)/Parts/loaders/build/inventor/Makefile:
	@echo ""
	@echo "***** Running Makefile target libmlloaders_inventor configure *****"
	@echo ""
	cd $(MLE_HOME)/Parts/loaders/build/inventor; libtoolize; aclocal; automake --add-missing --ignore-deps; autoconf; ./configure;

libmlloaders_rehearsal_stage: $(MLE_HOME)/Parts/loaders/build/rehearsal/Makefile

libmlloaders_rehearsal: check_env libmlloaders_rehearsal_stage libmleatk_install
	@echo ""
	@echo "***** Running Makefile target libmlloaders_rehearsal *****"
	@echo ""
	cd $(MLE_HOME)/Parts/loaders/build/rehearsal; MLE_ROOT=$(MLE_ROOT) make;

libmlloaders_rehearsal_clean: check_env libmlloaders_rehearsal_stage
	@echo ""
	@echo "***** Running Makefile target libmlloaders_rehearsal_clean *****"
	@echo ""
	cd $(MLE_HOME)/Parts/loaders/build/rehearsal; make clean;

libmlloaders_rehearsal_clobber: check_env libmlloaders_rehearsal_stage
	@echo ""
	@echo "***** Running Makefile target libmlloaders_rehearsal_clobber *****"
	@echo ""
	cd $(MLE_HOME)/Parts/loaders/build/rehearsal; make maintainer-clean;

libmlloaders_rehearsal_install: libmlloaders_rehearsal
	@echo ""
	@echo "***** Running Makefile target libmlloaders_rehearsal_install *****"
	@echo ""
	cd $(MLE_HOME)/Parts/loaders/build/rehearsal; MLE_ROOT=$(MLE_ROOT) make install;

libmlloaders_rehearsal_uninstall: check_env libmlloaders_rehearsal_stage
	@echo ""
	@echo "***** Running Makefile target libmlloaders_rehearsal_uninstall *****"
	@echo ""
	cd $(MLE_HOME)/Parts/loaders/build/rehearsal; MLE_ROOT=$(MLE_ROOT) make uninstall;

libmlloaders_runtime_stage: $(MLE_HOME)/Parts/loaders/build/runtime/Makefile

libmlloaders_runtime: check_env libmlloaders_runtime_stage libplayprint_install
	@echo ""
	@echo "***** Running Makefile target libmlloaders_runtime *****"
	@echo ""
	cd $(MLE_HOME)/Parts/loaders/build/runtime; MLE_ROOT=$(MLE_ROOT) make;

libmlloaders_runtime_clean: check_env libmlloaders_runtime_stage libplayprint_clean
	@echo ""
	@echo "***** Running Makefile target libmlloaders_runtime_clean *****"
	@echo ""
	cd $(MLE_HOME)/Parts/loaders/build/runtime; make clean;

libmlloaders_runtime_clobber: check_env libmlloaders_runtime_stage libplayprint_clobber
	@echo ""
	@echo "***** Running Makefile target libmlloaders_runtime_clobber *****"
	@echo ""
	cd $(MLE_HOME)/Parts/loaders/build/runtime; make maintainer-clean;

libmlloaders_runtime_install: libmlloaders_runtime libplayprint_install
	@echo ""
	@echo "***** Running Makefile target libmlloaders_runtime_install *****"
	@echo ""
	cd $(MLE_HOME)/Parts/loaders/build/runtime; MLE_ROOT=$(MLE_ROOT) make install;

libmlloaders_runtime_uninstall: check_env libmlloaders_runtime_stage libplayprint_uninstall
	@echo ""
	@echo "***** Running Makefile target libmlloaders_runtime_uninstall *****"
	@echo ""
	cd $(MLE_HOME)/Parts/loaders/build/runtime; MLE_ROOT=$(MLE_ROOT) make uninstall;

libmlloaders_inventor_stage: $(MLE_HOME)/Parts/loaders/build/inventor/Makefile

libmlloaders_inventor: check_env libmlloaders_inventor_stage
	@echo ""
	@echo "***** Running Makefile target libmlloaders_inventor *****"
	@echo ""
	cd $(MLE_HOME)/Parts/loaders/build/inventor; MLE_ROOT=$(MLE_ROOT) make;

libmlloaders_inventor_clean: check_env libmlloaders_inventor_stage
	@echo ""
	@echo "***** Running Makefile target libmlloaders_inventor_clean *****"
	@echo ""
	cd $(MLE_HOME)/Parts/loaders/build/inventor; make clean;

libmlloaders_inventor_clobber: check_env libmlloaders_inventor_stage
	@echo ""
	@echo "***** Running Makefile target libmlloaders_inventor_clobber *****"
	@echo ""
	cd $(MLE_HOME)/Parts/loaders/build/inventor; make maintainer-clean;

libmlloaders_inventor_install: libmlloaders_inventor
	@echo ""
	@echo "***** Running Makefile target libmlloaders_inventor_install *****"
	@echo ""
	cd $(MLE_HOME)/Parts/loaders/build/inventor; MLE_ROOT=$(MLE_ROOT) make install;

libmlloaders_inventor_uninstall: check_env libmlloaders_inventor_stage
	@echo ""
	@echo "***** Running Makefile target libmlloaders_inventor_uninstall *****"
	@echo ""
	cd $(MLE_HOME)/Parts/loaders/build/inventor; MLE_ROOT=$(MLE_ROOT) make uninstall;

libmlloaders: libmlloaders_rehearsal_clean libmlloaders_rehearsal libmlloaders_inventor_clean libmlloaders_inventor libmlloaders_runtime_clean libmlloaders_runtime

libmlloaders_clean: libmlloaders_rehearsal_clean libmlloaders_inventor_clean libmlloaders_runtime_clean

libmlloaders_clobber: libmlloaders_rehearsal_clobber libmlloaders_inventor_clobber libmlloaders_runtime_clobber

libmlloaders_install: libmlloaders_rehearsal_clean libmlloaders_rehearsal_install libmlloaders_inventor_clean libmlloaders_inventor_install libmlloaders_runtime_clean libmlloaders_runtime_install

libmlloaders_uninstall: libmlloaders_rehearsal_uninstall libmlloaders_inventor_uninstall libmlloaders_runtime_uninstall

# Targets for Magic Lantern DWP reader library.

$(MLE_HOME)/Studio/DwpReader/linux/DwpReader/Makefile:
	@echo ""
	@echo "***** Running Makefile target DwpReader configure *****"
	@echo ""
	cd $(MLE_HOME)/Studio/DwpReader/linux/DwpReader; libtoolize; aclocal; automake --add-missing --ignore-deps; autoconf; ./configure;

libDwpReader_stage: $(MLE_HOME)/Studio/DwpReader/linux/DwpReader/Makefile

libDwpReader: check_env libDwpReader_stage
	@echo ""
	@echo "***** Running Makefile target libDwpReader *****"
	@echo ""
	cd $(MLE_HOME)/Studio/DwpReader/linux/DwpReader; make;

libDwpReader_clean: check_env libDwpReader_stage
	@echo ""
	@echo "***** Running Makefile target libDwpReader_clean *****"
	@echo ""
	cd $(MLE_HOME)/Studio/DwpReader/linux/DwpReader; make clean;

libDwpReader_clobber: check_env libDwpReader_stage
	@echo ""
	@echo "***** Running Makefile target libDwpReader_clobber *****"
	@echo ""
	cd $(MLE_HOME)/Studio/DwpReader/linux/DwpReader; make maintainer-clean;

libDwpReader_install: check_env libDwpReader_stage
	@echo ""
	@echo "***** Running Makefile target libDwpReader_install *****"
	@echo ""
	cd $(MLE_HOME)/Studio/DwpReader/linux/DwpReader; MLE_ROOT=$(MLE_ROOT) make install;
	cd $(MLE_HOME)/Studio/DwpReader/linux/DwpReader/libDwpReader; MLE_HOME=$(MLE_HOME) make install_plugin;

libDwpReader_uninstall: check_env libDwpReader_stage
	@echo ""
	@echo "***** Running Makefile target libDwpReader_uninstall *****"
	@echo ""
	cd $(MLE_HOME)/Studio/DwpReader/linux/DwpReader; MLE_ROOT=$(MLE_ROOT) make uninstall;
	cd $(MLE_HOME)/Studio/DwpReader/linux/DwpReader/libDwpReader; MLE_HOME=$(MLE_HOME) make uninstall_plugin;

# Magic Lantern Studio
studio: sdk_rehearsal sdk_runtime libmleatk libDwpReader players

studio_clean: sdk_rehearsal_clean sdk_runtime_clean libmleatk_clean libDwpReader_clean players_clean

studio_clobber: sdk_rehearsal_clobber sdk_runtime_clobber libmleatk_clobber libDwpReader_clobber players_clobber

studio_install: sdk_rehearsal_install sdk_runtime_install libmleatk_install libDwpReader_install players_install

studio_uninstall: sdk_rehearsal_uninstall sdk_runtime_uninstall libmleatk_uninstall libDwpReader_uninstall players_uninstall

# Rehearsal components
rehearsal: libmlert_rehearsal props roles_rehearsal mediarefs_rehearsal sets_rehearsal stages_rehearsal actors_rehearsal

rehearsal_clean: libmlert_rehearsal_clean props_clean roles_rehearsal_clean mediarefs_rehearsal_clean sets_rehearsal_clean stages_rehearsal_clean actors_rehearsal_clean

rehearsal_clobber: libmlert_rehearsal_clobber props_clobber roles_rehearsal_clobber mediarefs_rehearsal_clobber sets_rehearsal_clobber stages_rehearsal_clobber actors_rehearsal_clobber

rehearsal_install: libmlert_rehearsal_install props_install roles_rehearsal_install mediarefs_rehearsal_install sets_rehearsal_install stages_rehearsal_install actors_rehearsal_install

rehearsal_uninstall: libmlert_rehearsal_uninstall props_uninstall roles_rehearsal_uninstall mediarefs_rehearsal_uninstall sets_rehearsal_uninstall stages_rehearsal_uninstall actors_rehearsal_uninstall

# Inventor DPP Runtime components

runtime: libmlert_runtime props roles_runtime mediarefs_runtime sets_runtime stages_runtime actors_runtime

runtime_clean: libmlert_runtime_clean props_clean roles_runtime_clean mediarefs_runtime_clean sets_runtime_clean stages_runtime_clean actors_runtime_clean

runtime_clobber: libmlert_runtime_clobber props_clobber roles_runtime_clobber mediarefs_runtime_clobber sets_runtime_clobber stages_runtime_clobber actors_runtime_clobber

runtime_install: libmlert_runtime_install props_install roles_runtime_install mediarefs_runtime_install sets_runtime_install stages_runtime_install actors_runtime_install

runtime_uninstall: libmlert_runtime_uninstall props_uninstall roles_runtime_uninstall mediarefs_runtime_uninstall sets_runtime_uninstall stages_runtime_uninstall actors_runtime_uninstall

# Inventor DWP Runtime components

inventor: libmlert_inventor props roles_inventor mediarefs_inventor sets_inventor stages_inventor actors_inventor

inventor_clean: libmlert_inventor_clean props_clean roles_inventor_clean mediarefs_inventor_clean sets_inventor_clean stages_inventor_clean actors_inventor_clean

inventor_clobber: libmlert_inventor_clobber props_clobber roles_inventor_clobber mediarefs_inventor_clobber sets_inventor_clobber stages_inventor_clobber actors_inventor_clobber

inventor_install: libmlert_inventor_install props_install roles_inventor_install mediarefs_inventor_install sets_inventor_install stages_inventor_install actors_inventor_install

inventor_uninstall: libmlert_inventor_uninstall props_uninstall roles_inventor_uninstall mediarefs_inventor_uninstall sets_inventor_uninstall stages_inventor_uninstall actors_inventor_uninstall

.PHONY: check_MLE_HOME check_MLE_ROOT check_MLE_WORKPRINTS

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

check_env: check_MLE_HOME check_MLE_ROOT check_MLE_WORKPRINTS
	@echo "Using Magic Lantern environment:"; \
	echo "    MLE_HOME= $(MLE_HOME)"; \
	echo "    MLE_ROOT= $(MLE_ROOT)"; \
	echo "    MLE_WORKPRINTS= $(MLE_WORKPRINTS)"; \
	echo "    JAVA_HOME= $(JAVA_HOME)"; \
	echo "    PATH= $(PATH)"; \
	echo "";
