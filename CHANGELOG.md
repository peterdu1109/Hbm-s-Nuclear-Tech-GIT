# Changelog

## Migration 1.20.1

* Upgraded the build to ForgeGradle 6 with Minecraft 1.20.1, Forge 47.2.0, and
  Gradle 8.7 tooling.
* Introduced Java 17 toolchain configuration and refreshed project metadata.
* Added a placeholder Forge mod entry point compatible with the modern event
  bus architecture.
* Converted legacy `mcmod.info` metadata to an expandable `mods.toml` file and
  updated the resource pack format to 15.
* Documented new build steps and porting guidelines in the README.
* Archived the legacy 1.7.10 sources under `legacy-src/` for incremental
  migration.
