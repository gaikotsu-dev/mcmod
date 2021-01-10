package com.sample.mod.entity;

import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerBipedArmor;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderSample extends RenderBiped<EntitySample> {
    public static final ResourceLocation texture = new ResourceLocation("sm:textures/entity/sample.png");

    public RenderSample(RenderManager rendermanagerIn, ModelSample modelbaseIn, float shadowsizeIn) {
        super(rendermanagerIn, modelbaseIn, shadowsizeIn);
        this.addLayer(new LayerBipedArmor(this)
        {
            protected void initArmor()
            {
                this.modelLeggings = modelbaseIn;
                this.modelArmor = modelbaseIn;
            }
        });
    }

    @Override
    protected ResourceLocation getEntityTexture(EntitySample entity) {
        return texture;
    }
}