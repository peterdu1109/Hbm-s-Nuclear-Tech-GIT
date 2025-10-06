package com.hbm;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Entry point for the 1.20.1 port of Hbm's Nuclear Tech Mod.
 * <p>
 * The legacy 1.7.10 sources were moved to {@code legacy-src/} to be
 * incrementally migrated onto modern Forge APIs. Each system should be
 * reintroduced behind the new registry/event infrastructure and then the
 * legacy classes deleted once their responsibilities are fulfilled.
 * </p>
 */
@Mod(HbmMod.MOD_ID)
public final class HbmMod {
    public static final String MOD_ID = "hbm";
    private static final Logger LOGGER = LogManager.getLogger();

    public HbmMod() {
        LOGGER.info("Initialising Hbm's Nuclear Tech Mod placeholder for 1.20.1.");

        IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();
        modBus.addListener(this::handleCommonSetup);

        // TODO: Re-register content using DeferredRegister instances and
        // modernised data-driven definitions.
    }

    private void handleCommonSetup(final FMLCommonSetupEvent event) {
        LOGGER.info("Common setup placeholder invoked. Implement integration tasks here.");
        // TODO: Port networking, capabilities, and world systems.
    }
}
