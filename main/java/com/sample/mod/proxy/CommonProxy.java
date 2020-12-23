package com.sample.mod.proxy;

import com.sample.mod.handlers.EntityHandler;
import com.sample.mod.handlers.RegistyHandler;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
    public void preInit(FMLPreInitializationEvent event) {
        RegistyHandler.Common();
        EntityHandler.registerEntityRenderingHandler(event);
    }

    public void init(FMLInitializationEvent event) {
        EntityHandler.registerModEntity();
    }

    public void postInit(FMLPostInitializationEvent event) {
    }
}