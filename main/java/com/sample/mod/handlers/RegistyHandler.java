package com.sample.mod.handlers;

import com.sample.mod.gen.SampleOreGen;
import com.sample.mod.init.BlockInit;
import com.sample.mod.init.ItemInit;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class RegistyHandler {

    public static void Client() {
        RecipeHandler.registerCrafting();
        RecipeHandler.registerSmelting();
    }

    public static void Common() {
        ItemInit.init();
        ItemInit.register();
        BlockInit.init();
        BlockInit.register();
        BlockInit.registerRenders();
        GameRegistry.registerWorldGenerator(new SampleOreGen(), 0);
    }
}
