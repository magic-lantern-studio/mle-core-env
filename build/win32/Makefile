# -*- Makefile -*-
#
#  Copyright (C) 2000-2007  Wizzer Works
#
#  Wizzer Works makes available all content in this file ("Content").
#  Unless otherwise indicated below, the Content is provided to you
#  under the terms and conditions of the Common Public License Version 1.0
#  ("CPL"). A copy of the CPL is available at
#
#      http://opensource.org/licenses/cpl1.0.php
#
#  For purposes of the CPL, "Program" will mean the Content.
#
#  For information concerning this Makefile, contact Mark S. Millard,
#  of Wizzer Works at msm@wizzerworks.com.
#
#*************************************************************************
#
# Makefile - Builds Magic Lantern libraries and tools.
#
# $Id$
#
#*************************************************************************

PLATFORM = win32

MLE_TOP = $(MLE_ROOT)
#include $(MLE_TOP)/include/make/commondefs

#
# Macros for doing top-level builds. Makefiles define TOPDIRS
# with a list of directories to descend into. Define
# NOSUBMSG to any value to supress the warning message for
# subdirectories that do not exist.
#
_TOPDIR_MAKERULE = \
	errstat=0; \
	if test ! -d $$d; then \
		if test "$(NOSUBMSG)" = "" ; then \
			echo "SKIPPING $$d: No such directory"; \
		fi \
	else \
		echo "---- cd $$d; $(MAKE) $$targ"; \
		cd $$d; $(MAKE) $$targ || errstat=$$?; \
		cd $(MLE_TOP)/build; \
	fi; \
	test $$errstat -eq 0

TOPDIRS_MAKERULE = \
	@errstat=0; \
	targ=$@; for d in $(TOPDIRS); do $(_TOPDIR_MAKERULE) || break; done; \
	test $$errstat -eq 0

EXPORTDIRS_MAKERULE = \
	@errstat=0; \
	targ=$@; for d in $(EXPORTDIRS); do $(_TOPDIR_MAKERULE) || break; done; \
	test $$errstat -eq 0

#
# Descend into the directories:
#
TOPDIRS = \
	$(MLE_TOP)/Core/util/win32 \
	$(MLE_TOP)/Core/math/win32 \
	$(MLE_TOP)/DigitalWorkprint/lib/win32 \
	$(MLE_TOP)/DigitalPlayprint/lib/win32 \
	$(MLE_TOP)/DigitalPlayprint/runtime/win32 \
	$(MLE_TOP)/DigitalPlayprint/master/win32 \
	$(MLE_TOP)/Core/mlert/win32 \
	$(MLE_TOP)/Core/mlert/rehearsal \
	$(MLE_TOP)/ATK/win32 \
	$(MLE_TOP)/Parts/props/win32 \
	$(MLE_TOP)/Parts/roles/brender \
	$(MLE_TOP)/Parts/sets/brender \
	$(MLE_TOP)/Parts/mediaref/brender \
	$(MLE_TOP)/Parts/stages/brender \
	$(MLE_TOP)/Parts/roles/inventor \
	$(MLE_TOP)/Parts/roles/win32 \
	$(MLE_TOP)/Parts/sets/win32 \
	$(MLE_TOP)/Parts/mediaref/win32 \
	$(MLE_TOP)/Parts/stages/win32 \
	$(MLE_TOP)/Parts/stages/rehearsal \
	$(MLE_TOP)/Parts/packages/win32 \
	$(MLE_TOP)/Parts/actors/win32 \
	$(MLE_TOP)/Players/rehearsal \
	$(MLE_TOP)/Auteur/plugins/com.wizzer.auteur.mle.dwp/src/win32 \
	$(NULL)

EXPORTDIRS = \
	$(MLE_TOP)/Core/math/win32 \
	$(MLE_TOP)/Core/mlert/rehearsal \
	$(MLE_TOP)/DigitalWorkprint/lib/win32 \
	$(MLE_TOP)/Parts/roles/win32 \
	$(MLE_TOP)/Parts/sets/win32 \
	$(MLE_TOP)/Parts/mediaref/win32 \
	$(MLE_TOP)/Parts/stages/rehearsal \
	$(NULL)

all install clobber clean:
	$(TOPDIRS_MAKERULE)

export:
	$(EXPORTDIRS_MAKERULE)

#include $(MLE_TOP)/include/make/commonrules
