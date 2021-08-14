package com.sample.mod.handlers;

import com.sample.mod.Reference;
import com.sample.mod.entity.*;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Biomes;
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
            RenderingRegistry.registerEntityRenderingHandler(EntityCtnCat.class, new IRenderFactory<EntityCtnCat>(){
                @Override
                public Render<? super EntityCtnCat> createRenderFor(RenderManager manager){
                    return new RenderCtnCat(manager, new ModelCtnCat(), 0.3f);
                }
            });
            RenderingRegistry.registerEntityRenderingHandler(EntityCtnCat2.class, new IRenderFactory<EntityCtnCat2>(){
                @Override
                public Render<? super EntityCtnCat2> createRenderFor(RenderManager manager){
                    return new RenderCtnCat2(manager, new ModelCtnCat2(), 0.3f);
                }
            });
            RenderingRegistry.registerEntityRenderingHandler(EntityCtnCat3.class, new IRenderFactory<EntityCtnCat3>(){
                @Override
                public Render<? super EntityCtnCat3> createRenderFor(RenderManager manager){
                    return new RenderCtnCat3(manager, new ModelCtnCat3(), 0.3f);
                }
            });
            RenderingRegistry.registerEntityRenderingHandler(EntityCtnCatV1.class, new IRenderFactory<EntityCtnCatV1>(){
                @Override
                public Render<? super EntityCtnCatV1> createRenderFor(RenderManager manager){
                    return new RenderCtnCatV1(manager, new ModelCtnCatV1(), 0.3f);
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
            RenderingRegistry.registerEntityRenderingHandler(EntitySirenHead3.class, new IRenderFactory<EntitySirenHead3>(){
                @Override
                public Render<? super EntitySirenHead3> createRenderFor(RenderManager manager){
                    return new RenderSirenHead3(manager, new ModelSirenHead3(), 0.3f);
                }
            });
            RenderingRegistry.registerEntityRenderingHandler(EntitySirenHeadSin.class, new IRenderFactory<EntitySirenHeadSin>(){
                @Override
                public Render<? super EntitySirenHeadSin> createRenderFor(RenderManager manager){
                    return new RenderSirenHeadSin(manager, new ModelSirenHeadSin(), 0.3f);
                }
            });
            RenderingRegistry.registerEntityRenderingHandler(EntityLongHorse.class, new IRenderFactory<EntityLongHorse>(){
                @Override
                public Render<? super EntityLongHorse> createRenderFor(RenderManager manager){
                    return new RenderLongHorse(manager, new ModelLongHorse(), 0.3f);
                }
            });
            RenderingRegistry.registerEntityRenderingHandler(EntityCtnDog.class, new IRenderFactory<EntityCtnDog>(){
                @Override
                public Render<? super EntityCtnDog> createRenderFor(RenderManager manager){
                    return new RenderCtnDog(manager, new ModelCtnDog(), 0.3f);
                }
            });
            RenderingRegistry.registerEntityRenderingHandler(EntityCtnDogDX.class, new IRenderFactory<EntityCtnDogDX>(){
                @Override
                public Render<? super EntityCtnDogDX> createRenderFor(RenderManager manager){
                    return new RenderCtnDogDX(manager, new ModelCtnDogDX(), 0.3f);
                }
            });
            RenderingRegistry.registerEntityRenderingHandler(EntityLightHead.class, new IRenderFactory<EntityLightHead>(){
                @Override
                public Render<? super EntityLightHead> createRenderFor(RenderManager manager){
                    return new RenderLightHead(manager, new ModelLightHead(), 0.3f);
                }
            });
            RenderingRegistry.registerEntityRenderingHandler(EntityWeiSkeleton.class, new IRenderFactory<EntityWeiSkeleton>(){
                @Override
                public Render<? super EntityWeiSkeleton> createRenderFor(RenderManager manager){
                    return new RenderWeiSkeleton(manager, new ModelWeiSkeleton(), 0.3f);
                }
            });
            RenderingRegistry.registerEntityRenderingHandler(EntitySlimeT.class, new IRenderFactory<EntitySlimeT>(){
                @Override
                public Render<? super EntitySlimeT> createRenderFor(RenderManager manager){
                    return new RenderSlimeT(manager, new ModelSlimeT(), 0.3f);
                }
            });
            RenderingRegistry.registerEntityRenderingHandler(EntityDarkKing.class, new IRenderFactory<EntityDarkKing>(){
                @Override
                public Render<? super EntityDarkKing> createRenderFor(RenderManager manager){
                    return new RenderDarkKing(manager, new ModelDarkKing(), 0.3f);
                }
            });
            RenderingRegistry.registerEntityRenderingHandler(EntityAlien.class, new IRenderFactory<EntityAlien>(){
                @Override
                public Render<? super EntityAlien> createRenderFor(RenderManager manager){
                    return new RenderAlien(manager, new ModelAlien(), 0.3f);
                }
            });
            RenderingRegistry.registerEntityRenderingHandler(EntityEnderSent.class, new IRenderFactory<EntityEnderSent>(){
                @Override
                public Render<? super EntityEnderSent> createRenderFor(RenderManager manager){
                    return new RenderEnderSent(manager, new ModelEnderSent(), 0.3f);
                }
            });
            RenderingRegistry.registerEntityRenderingHandler(EntityRedstoneGolem.class, new IRenderFactory<EntityRedstoneGolem>(){
                @Override
                public Render<? super EntityRedstoneGolem> createRenderFor(RenderManager manager){
                    return new RenderRedstoneGolem(manager, new ModelRedstoneGolem(), 0.3f);
                }
            });
            RenderingRegistry.registerEntityRenderingHandler(EntityCtnMouse.class, new IRenderFactory<EntityCtnMouse>(){
                @Override
                public Render<? super EntityCtnMouse> createRenderFor(RenderManager manager){
                    return new RenderCtnMouse(manager, new ModelCtnMouse(), 0.3f);
                }
            });
            RenderingRegistry.registerEntityRenderingHandler(EntityCtnMouseA.class, new IRenderFactory<EntityCtnMouseA>(){
                @Override
                public Render<? super EntityCtnMouseA> createRenderFor(RenderManager manager){
                    return new RenderCtnMouseA(manager, new ModelCtnMouseA(), 0.3f);
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
        EntityRegistry.registerModEntity(new ResourceLocation("sm:cartooncat"), EntityCtnCat.class, "CtnCat", 1, Reference.MODID, 50, 1, true, 1000, 22);
        EntityRegistry.addSpawn(EntityCtnCat.class, 50, 6, 12, EnumCreatureType.MONSTER, Biomes.HELL,Biomes.PLAINS,Biomes.DEFAULT);
        EntityRegistry.registerModEntity(new ResourceLocation("sm:cartooncat2"), EntityCtnCat2.class, "CtnCat2", 2, Reference.MODID, 50, 1, true, 1000, 22);
        EntityRegistry.addSpawn(EntityCtnCat2.class, 50, 6, 12, EnumCreatureType.MONSTER, Biomes.HELL,Biomes.PLAINS,Biomes.DEFAULT);
        EntityRegistry.registerModEntity(new ResourceLocation("sm:cartooncat3"), EntityCtnCat3.class, "CtnCat3", 3, Reference.MODID, 50, 1, true, 1000, 22);
        EntityRegistry.addSpawn(EntityCtnCat3.class, 50, 6, 12, EnumCreatureType.MONSTER, Biomes.HELL,Biomes.PLAINS,Biomes.DEFAULT);
        EntityRegistry.registerModEntity(new ResourceLocation("sm:cartooncatv1"), EntityCtnCatV1.class, "CtnCatv1", 4, Reference.MODID, 50, 1, true, 1000, 22);
        EntityRegistry.addSpawn(EntityCtnCatV1.class, 50, 6, 12, EnumCreatureType.MONSTER, Biomes.HELL,Biomes.PLAINS,Biomes.DEFAULT);
        EntityRegistry.registerModEntity(new ResourceLocation("sm:costumeman"), EntityCstmMan2.class, "CstmMan2", 5, Reference.MODID, 50, 1, true, 1000, 22);
        EntityRegistry.addSpawn(EntityCstmMan2.class, 50, 6, 12, EnumCreatureType.MONSTER, Biomes.HELL,Biomes.PLAINS,Biomes.DEFAULT);
        EntityRegistry.registerModEntity(new ResourceLocation("sm:slenderman"), EntitySlndrMan.class, "SlndrMan", 6, Reference.MODID, 50, 1, true, 1000, 22);
        EntityRegistry.addSpawn(EntitySlndrMan.class, 50, 6, 12, EnumCreatureType.MONSTER, Biomes.HELL,Biomes.PLAINS,Biomes.DEFAULT);
        EntityRegistry.registerModEntity(new ResourceLocation("sm:sirenhead"), EntitySirenHead.class, "SirenHead", 7, Reference.MODID, 50, 1, true, 1000, 22);
        EntityRegistry.addSpawn(EntitySirenHead.class, 50, 6, 12, EnumCreatureType.MONSTER, Biomes.HELL,Biomes.PLAINS,Biomes.DEFAULT);
        EntityRegistry.registerModEntity(new ResourceLocation("sm:sirenhead2"), EntitySirenHead2.class, "SirenHead2", 8, Reference.MODID, 50, 1, true, 1000, 22);
        EntityRegistry.addSpawn(EntitySirenHead2.class, 50, 6, 12, EnumCreatureType.MONSTER, Biomes.HELL,Biomes.PLAINS,Biomes.DEFAULT);
        EntityRegistry.registerModEntity(new ResourceLocation("sm:sirenhead3"), EntitySirenHead3.class, "SirenHead3", 9, Reference.MODID, 50, 1, true, 1000, 22);
        EntityRegistry.addSpawn(EntitySirenHead3.class, 50, 6, 12, EnumCreatureType.MONSTER, Biomes.HELL,Biomes.PLAINS,Biomes.DEFAULT);
        EntityRegistry.registerModEntity(new ResourceLocation("sm:sirenheadsin"), EntitySirenHeadSin.class, "SirenHeadSin", 10, Reference.MODID, 50, 1, true, 1000, 22);
        EntityRegistry.addSpawn(EntitySirenHeadSin.class, 50, 6, 12, EnumCreatureType.MONSTER, Biomes.HELL,Biomes.PLAINS,Biomes.DEFAULT);
        EntityRegistry.registerModEntity(new ResourceLocation("sm:longhorse"), EntityLongHorse.class, "LongHorse", 11, Reference.MODID, 50, 1, true, 1000, 22);
        EntityRegistry.addSpawn(EntityLongHorse.class, 50, 6, 12, EnumCreatureType.MONSTER, Biomes.HELL,Biomes.PLAINS,Biomes.DEFAULT);
        EntityRegistry.registerModEntity(new ResourceLocation("sm:cartoondog"), EntityCtnDog.class, "CtnDog", 12, Reference.MODID, 50, 1, true, 1000, 22);
        EntityRegistry.addSpawn(EntityCtnDog.class, 50, 6, 12, EnumCreatureType.MONSTER, Biomes.HELL,Biomes.PLAINS,Biomes.DEFAULT);
        EntityRegistry.registerModEntity(new ResourceLocation("sm:cartoondogdx"), EntityCtnDogDX.class, "CtnDogDX", 13, Reference.MODID, 50, 1, true, 1000, 22);
        EntityRegistry.addSpawn(EntityCtnDogDX.class, 50, 6, 12, EnumCreatureType.MONSTER, Biomes.HELL,Biomes.PLAINS,Biomes.DEFAULT);
        EntityRegistry.registerModEntity(new ResourceLocation("sm:lighthead"), EntityLightHead.class, "LightHead", 14, Reference.MODID, 50, 1, true, 1000, 22);
        EntityRegistry.addSpawn(EntityLightHead.class, 50, 6, 12, EnumCreatureType.MONSTER, Biomes.HELL,Biomes.PLAINS,Biomes.DEFAULT);
        EntityRegistry.registerModEntity(new ResourceLocation("sm:weiskeleton"), EntityWeiSkeleton.class, "WeiSkeleton", 15, Reference.MODID, 50, 1, true, 1000, 22);
        EntityRegistry.addSpawn(EntityWeiSkeleton.class, 50, 6, 12, EnumCreatureType.MONSTER, Biomes.HELL,Biomes.PLAINS,Biomes.DEFAULT);
        EntityRegistry.registerModEntity(new ResourceLocation("sm:slimet"), EntitySlimeT.class, "SlimeT", 16, Reference.MODID, 50, 1, true, 1000, 22);
        EntityRegistry.addSpawn(EntitySlimeT.class, 50, 6, 12, EnumCreatureType.MONSTER, Biomes.HELL,Biomes.PLAINS,Biomes.DEFAULT);
        EntityRegistry.registerModEntity(new ResourceLocation("sm:darkking"), EntityDarkKing.class, "DarkKing", 17, Reference.MODID, 50, 1, true, 1000, 22);
        EntityRegistry.addSpawn(EntityDarkKing.class, 50, 6, 12, EnumCreatureType.MONSTER, Biomes.HELL,Biomes.PLAINS,Biomes.DEFAULT);
        EntityRegistry.registerModEntity(new ResourceLocation("sm:alien"), EntityAlien.class, "Alien", 18, Reference.MODID, 50, 1, true, 1000, 22);
        EntityRegistry.addSpawn(EntityAlien.class, 50, 6, 12, EnumCreatureType.MONSTER, Biomes.HELL,Biomes.PLAINS,Biomes.DEFAULT);
        EntityRegistry.registerModEntity(new ResourceLocation("sm:endersent"), EntityEnderSent.class, "EnderSent", 19, Reference.MODID, 50, 1, true, 1000, 22);
        EntityRegistry.addSpawn(EntityEnderSent.class, 50, 6, 12, EnumCreatureType.MONSTER, Biomes.HELL,Biomes.PLAINS,Biomes.DEFAULT);
        EntityRegistry.registerModEntity(new ResourceLocation("sm:redstonegolem"), EntityRedstoneGolem.class, "RedstoneGolem", 20, Reference.MODID, 50, 1, true, 1000, 22);
        EntityRegistry.addSpawn(EntityRedstoneGolem.class, 50, 6, 12, EnumCreatureType.MONSTER, Biomes.HELL,Biomes.PLAINS,Biomes.DEFAULT);
        EntityRegistry.registerModEntity(new ResourceLocation("sm:cartoonmouse"), EntityCtnMouse.class, "CtnMouse", 21, Reference.MODID, 50, 1, true, 1000, 22);
        EntityRegistry.addSpawn(EntityCtnMouse.class, 50, 6, 12, EnumCreatureType.MONSTER, Biomes.HELL,Biomes.PLAINS,Biomes.DEFAULT);
        EntityRegistry.registerModEntity(new ResourceLocation("sm:cartoonmousea"), EntityCtnMouseA.class, "CtnMouseA", 22, Reference.MODID, 50, 1, true, 1000, 22);
        EntityRegistry.addSpawn(EntityCtnMouseA.class, 50, 6, 12, EnumCreatureType.MONSTER, Biomes.HELL,Biomes.PLAINS,Biomes.DEFAULT);

        EntityRegistry.registerModEntity(new ResourceLocation("sm:ironman"), EntityIronMan.class, "IronMan", 100, Reference.MODID, 50, 1, true, 100000, 1000);
    }
}
