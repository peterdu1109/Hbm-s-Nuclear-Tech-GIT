# Legacy source set

All original 1.7.10 java sources were moved here so they no longer block the
1.20.1 toolchain from compiling. Classes should be copied back into the active
`src/main/java` tree once they are ported to the modern Forge APIs. Please delete
legacy counterparts as soon as their replacements are functional to avoid
regressions.
