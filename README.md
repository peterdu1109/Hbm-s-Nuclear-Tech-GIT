# HBM's Nuclear Tech Mod (1.20.1 Port Scaffold)

This branch tracks the ongoing migration of **Hbm's Nuclear Tech Mod** to
Minecraft **1.20.1** on modern Forge tooling. The goal of this initial pass is to
update the build system, metadata, and entry points so that individual gameplay
systems can be reintroduced incrementally using the Forge 47.x API surface.

> ⚠️ **Work in progress:** the original 1.7.10 gameplay code has been moved to
> [`legacy-src/`](legacy-src/) to simplify compilation while porting. Each
> subsystem should be reimplemented using the new registries, data packs and
> event architecture before removing the corresponding legacy classes.

## Project status

* Minecraft: **1.20.1**
* Forge: **47.2.0**
* Java toolchain: **17**
* Gradle: **8.7 wrapper**

## Building & running

1. Install **JDK 17** (e.g. from [Adoptium](https://adoptium.net/)).
2. Clone the repository and enter the workspace:
   ```bash
   git clone https://github.com/HbmMods/Hbm-s-Nuclear-Tech-GIT.git
   cd Hbm-s-Nuclear-Tech-GIT
   ```
3. Generate the gradle wrapper files (once per environment) if the bundled
   wrapper cannot download dependencies:
   ```bash
   gradle wrapper --gradle-version 8.7 --distribution-type all
   ```
4. Run a build:
   ```bash
   ./gradlew build
   ```
5. Launch the client (creates a run directory under `run/client`):
   ```bash
   ./gradlew runClient
   ```

The data generator can be invoked with `./gradlew runData` to export resources
into `src/generated/resources`.

## Porting guidelines

* Re-register content using `DeferredRegister` and the 1.20.1 registry keys.
* Replace legacy packet handlers with the modern `CustomPacketPayload`
  networking system.
* Move bespoke configuration and loot/recipe logic into data packs located under
  `src/main/resources/data/hbm/`.
* Use `DistExecutor` or dedicated event listeners to keep client-specific code
  in the client distribution only.
* Ensure textures, blockstate files, models, and sounds comply with the
  `pack_format` **15** resource specifications.

## Contributing

Pull requests should target the 1.20.1 port and include:

* Updated documentation or TODO notes when functionality remains unported.
* References to the legacy implementation to aid future migration work.
* Verification that `./gradlew build` completes (attach logs when the CI cannot
  reach Maven repositories).

## Links

* [Modrinth](https://modrinth.com/mod/ntm)
* [CurseForge](https://minecraft.curseforge.com/projects/hbms-nuclear-tech-mod)
* [Official Wiki](https://nucleartech.wiki/wiki/Main_Page)

## License

The project continues to be distributed under the **GNU LGPL-3.0-or-later**.
Refer to [`LICENSE`](LICENSE) and [`LICENSE.LESSER`](LICENSE.LESSER) for details.
