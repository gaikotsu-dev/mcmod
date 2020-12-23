package com.sample.mod.handlers;

import com.sample.mod.Reference;
import com.sample.mod.entity.EntitySample;
import com.sample.mod.entity.ModelSample;
import com.sample.mod.entity.RenderSample;
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
        }
    }
    public static void registerModEntity() {
        EntityRegistry.registerModEntity(new ResourceLocation("sample"), EntitySample.class, "Sample", 0, Reference.MODID, 50, 1, true, 1000, 22);
    }
}
