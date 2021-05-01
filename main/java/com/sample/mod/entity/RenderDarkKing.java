package com.sample.mod.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderDarkKing extends RenderLiving<EntityLiving>{
    public static final ResourceLocation texture = new ResourceLocation("sm:textures/entity/darkking.png");

    public RenderDarkKing(RenderManager rendermanagerIn, ModelBase modelbaseIn, float shadowsizeIn) {
        super(rendermanagerIn, modelbaseIn, shadowsizeIn);
    }

    @Override
    protected ResourceLocation getEntityTexture(EntityLiving entity) {
        return texture;
    }
}