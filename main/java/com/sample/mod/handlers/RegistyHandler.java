package com.sample.mod.handlers;

import com.sample.mod.init.BlockInit;
import com.sample.mod.init.ItemInit;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class RegistyHandler {
    public static void Common() {
        ItemInit.init();
        ItemInit.register();
        BlockInit.init();
        BlockInit.register();
        BlockInit.registerRenders();
    }
}
