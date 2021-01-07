package com.sample.mod.handlers;

import com.sample.mod.Reference;
import com.sample.mod.entity.*;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.EntityList.EntityEggInfo;
import net.minecraft.init.Biomes;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

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
            RenderingRegistry.registerEntityRenderingHandler(EntityCtnCat.class, new IRenderFactory<EntityCtnCat>(){
                @Override
                public Render<? super EntityCtnCat> createRenderFor(RenderManager manager){
                    return new RenderCtnCat(manager, new ModelCtnCat(), 0.3f);
                }
            });
            RenderingRegistry.registerEntityRenderingHandler(EntityCstmMan2.class, new IRenderFactory<EntityCstmMan2>(){
                @Override
                public Render<? super EntityCstmMan2> createRenderFor(RenderManager manager){
                    return new RenderCstmMan2(manager, new ModelCstmMan2(), 0.3f);
                }
            });
            RenderingRegistry.registerEntityRenderingHandler(EntitySlndrMan.class, new IRenderFactory<EntitySlndrMan>(){
                @Override
                public Render<? super EntitySlndrMan> createRenderFor(RenderManager manager){
                    return new RenderSlndrMan(manager, new ModelSlndrMan(), 0.3f);
                }
            });
            RenderingRegistry.registerEntityRenderingHandler(EntitySirenHead.class, new IRenderFactory<EntitySirenHead>(){
                @Override
                public Render<? super EntitySirenHead> createRenderFor(RenderManager manager){
                    return new RenderSirenHead(manager, new ModelSirenHead(), 0.3f);
                }
            });
            RenderingRegistry.registerEntityRenderingHandler(EntitySirenHead2.class, new IRenderFactory<EntitySirenHead2>(){
                @Override
                public Render<? super EntitySirenHead2> createRenderFor(RenderManager manager){
                    return new RenderSirenHead2(manager, new ModelSirenHead2(), 0.3f);
                }
            });

            RenderingRegistry.registerEntityRenderingHandler(EntityIronMan.class, new IRenderFactory<EntityIronMan>(){
                @Override
                public Render<? super EntityIronMan> createRenderFor(RenderManager manager){
                    return new RenderIronMan(manager, new ModelIronMan(), 0.3f);
                }
            });
        }
    }
    public static void registerModEntity() {
        EntityRegistry.registerModEntity(new ResourceLocation("sm:sample"), EntitySample.class, "Sample", 0, Reference.MODID, 50, 1, true, 1000, 22);
        EntityRegistry.addSpawn(EntitySample.class, 50, 6, 12, EnumCreatureType.MONSTER, Biomes.HELL,Biomes.PLAINS,Biomes.DEFAULT);
        EntityRegistry.registerModEntity(new ResourceLocation("sm:cartooncat"), EntityCtnCat.class, "CtnCat", 1, Reference.MODID, 50, 1, true, 1001, 23);
        EntityRegistry.addSpawn(EntityCtnCat.class, 50, 6, 12, EnumCreatureType.MONSTER, Biomes.HELL,Biomes.PLAINS,Biomes.DEFAULT);
        EntityRegistry.registerModEntity(new ResourceLocation("sm:costumeman"), EntityCstmMan2.class, "CstmMan2", 2, Reference.MODID, 50, 1, true, 1002, 24);
        EntityRegistry.addSpawn(EntityCstmMan2.class, 50, 6, 12, EnumCreatureType.MONSTER, Biomes.HELL,Biomes.PLAINS,Biomes.DEFAULT);
        EntityRegistry.registerModEntity(new ResourceLocation("sm:slenderman"), EntitySlndrMan.class, "SlndrMan", 3, Reference.MODID, 50, 1, true, 1003, 25);
        EntityRegistry.addSpawn(EntitySlndrMan.class, 50, 6, 12, EnumCreatureType.MONSTER, Biomes.HELL,Biomes.PLAINS,Biomes.DEFAULT);
        EntityRegistry.registerModEntity(new ResourceLocation("sm:sirenhead"), EntitySirenHead.class, "SirenHead", 4, Reference.MODID, 50, 1, true, 1004, 26);
        EntityRegistry.addSpawn(EntitySirenHead.class, 50, 6, 12, EnumCreatureType.MONSTER, Biomes.HELL,Biomes.PLAINS,Biomes.DEFAULT);
        EntityRegistry.registerModEntity(new ResourceLocation("sm:sirenhead2"), EntitySirenHead2.class, "SirenHead2", 5, Reference.MODID, 50, 1, true, 1005, 27);
        EntityRegistry.addSpawn(EntitySirenHead2.class, 50, 6, 12, EnumCreatureType.MONSTER, Biomes.HELL,Biomes.PLAINS,Biomes.DEFAULT);

        EntityRegistry.registerModEntity(new ResourceLocation("sm:ironman"), EntityIronMan.class, "IronMan", 100, Reference.MODID, 50, 1, true, 100000, 1000);
    }
}
