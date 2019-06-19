SUMMARY = "Intel(R) METEE Library"
DESCRIPTION = "MEETEE library provides a cross-platform simple \
 programing interface for accessing Intel HECI interfaces on devices \
 found in BigCore and Atom based products."

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://COPYING;md5=2ee41112a44fe7014dce33e26468ba93"

COMPATIBLE_HOST = '(i.86|x86_64).*-linux'

inherit cmake

SRC_URI = "git://github.com/intel/metee.git"
SRCREV = "642eedfcacc677fc43181f0b7c16d8f90724a9cb"

COMPATIBLE_HOST_libc-musl = "null"

S = "${WORKDIR}/git"

