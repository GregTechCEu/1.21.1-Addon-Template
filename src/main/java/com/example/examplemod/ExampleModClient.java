package com.example.examplemod;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.javafmlmod.FMLModContainer;

/**
 * This is the client-exclusive entrypoint for your mod.<br>
 * Clientside content should be initialised here.<br>
 * When the mod is running on the client side, this class is constructed in addition to the main entrypoint
 * ({@link ExampleMod}).
 */
@Mod(value = ExampleMod.MOD_ID, dist = Dist.CLIENT)
public class ExampleModClient {

    public ExampleModClient(IEventBus modBus, FMLModContainer container) {}
}
