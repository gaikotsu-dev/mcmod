package com.sample.mod.handlers;

import com.sample.mod.Reference;
import com.sample.mod.entity.*;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class EntityHandler {
    public static void registerEntityRenderingHandler(FMLPreInitializationEvent event)
    {
        if(event.getSide().isClient()) {
            RenderingRegistry.registerEntityRenderingHandler(EntitySample.class, new IRenderFactory<EntitySample>(){
                @Override
                public Render<? super EntitySample> createRenderFor(RenderManager manager){
                    return new RenderSample(manager, new ModelSample(), 0.3f);
                }
            });
            RenderingRegistry.registerEntityRenderingHandler(EntityCat.class, new IRenderFactory<EntityCat>(){
                @Override
                public Render<? super EntityCat> createRenderFor(RenderManager manager){
                    return new RenderCat(manager, new ModelCat(), 0.3f);
                }
            });
            RenderingRegistry.registerEntityRenderingHandler(EntityCstmMan2.class, new IRenderFactory<EntityCstmMan2>(){
                @Override
                public Render<? super EntityCstmMan2> createRenderFor(RenderManager manager){
                    return new RenderCstmMan2(manager, new ModelCstmMan2(), 0.3f);
                }
            });
        }
    }
    public static void registerModEntity() {
        EntityRegistry.registerModEntity(new ResourceLocation("sample"), EntitySample.class, "Sample", 0, Reference.MODID, 50, 1, true, 1000, 22);
        EntityRegistry.registerModEntity(new ResourceLocation("cat"), EntityCat.class, "Cartoon Cat", 1, Reference.MODID, 50, 1, true, 1001, 23);
        EntityRegistry.registerModEntity(new ResourceLocation("cstmman"), EntityCstmMan2.class, "Costume Man2", 2, Reference.MODID, 50, 1, true, 1002, 24);
    }
}
