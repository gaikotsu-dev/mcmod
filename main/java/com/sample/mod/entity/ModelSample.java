package com.sample.mod.entity;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelSample extends ModelBiped {
	private final ModelRenderer arm2;
	private final ModelRenderer arm1;
	private final ModelRenderer leg1;
	private final ModelRenderer head;
	private final ModelRenderer leg2;
	private final ModelRenderer body;

	public ModelSample() {
		textureWidth = 128;
		textureHeight = 128;

		arm2 = new ModelRenderer(this);
		arm2.setRotationPoint(0.0F, -8.0F, 0.0F);
		arm2.cubeList.add(new ModelBox(arm2, 60, 58, 7.0F, -2.5F, -3.0F, 4, 15, 6, 0.0F, false));

		arm1 = new ModelRenderer(this);
		arm1.setRotationPoint(0.0F, -8.0F, 0.0F);
		setRotationAngle(arm1, -0.6981F, 0.0F, 0.0F);
		arm1.cubeList.add(new ModelBox(arm1, 60, 21, -11.0F, -2.5F, -3.0F, 4, 16, 6, 0.0F, false));

		leg1 = new ModelRenderer(this);
		leg1.setRotationPoint(-4.0F, 11.0F, 0.0F);
		leg1.cubeList.add(new ModelBox(leg1, 37, 0, -1.0F, -3.0F, -3.0F, 4, 16, 5, 0.0F, false));

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -7.0F, -2.0F);
		head.cubeList.add(new ModelBox(head, 0, 0, -4.0F, -12.0F, -2.5F, 8, 10, 8, 0.0F, false));

		leg2 = new ModelRenderer(this);
		leg2.setRotationPoint(5.0F, 11.0F, 0.0F);
		leg2.cubeList.add(new ModelBox(leg2, 60, 0, -4.0F, -3.0F, -3.0F, 4, 16, 5, 0.0F, true));

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, -7.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 0, 40, -7.0F, -2.0F, -6.0F, 14, 7, 11, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 70, -5.0F, 5.0F, -3.0F, 10, 6, 6, 0.5F, false));
		body.cubeList.add(new ModelBox(body, 0, 0, -6.0F, 11.0F, -3.0F, 12, 4, 6, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		if (this.isChild) {
			GlStateManager.pushMatrix();
			GlStateManager.scale(0.5F, 0.5F, 0.5F);
			GlStateManager.translate(0.0F, 30.0F * f5, 0.0F);
			arm2.render(f5);
			arm1.render(f5);
			leg1.render(f5);
			head.render(f5);
			leg2.render(f5);
			body.render(f5);
			GlStateManager.popMatrix();
		}
		else {
			arm2.render(f5);
			arm1.render(f5);
			leg1.render(f5);
			head.render(f5);
			leg2.render(f5);
			body.render(f5);
		}
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
							  float headPitch, float scaleFactor, Entity entityIn)
	{
        super.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor, entityIn);
		this.leg1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
		this.leg2.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;

        boolean flag = entityIn instanceof EntitySample && ((EntitySample)entityIn).isArmsRaised();
        float f = MathHelper.sin(this.swingProgress * (float)Math.PI);
        float f1 = MathHelper.sin((1.0F - (1.0F - this.swingProgress) * (1.0F - this.swingProgress)) * (float)Math.PI);
        this.bipedRightArm.setRotationPoint(-8.0F, 0.0F, 0.0F);
        this.bipedLeftArm.setRotationPoint(8.0F, -5.0F, 0.0F);
        this.bipedRightArm.rotateAngleZ = 0.0F;
        //this.bipedLeftArm.rotateAngleZ = 0.0F;
        this.bipedRightArm.rotateAngleY = -(0.1F - f * 0.6F);
        //this.bipedLeftArm.rotateAngleY = 0.1F - f * 0.6F;
        float f2 = -(float)Math.PI / (flag ? 1.5F : 2.25F);
        this.bipedRightArm.rotateAngleX = f2;
        //.bipedLeftArm.rotateAngleX = f2;
        this.bipedRightArm.rotateAngleX += f * 1.2F - f1 * 0.4F;
        //this.bipedLeftArm.rotateAngleX += f * 1.2F - f1 * 0.4F;
        this.bipedRightArm.rotateAngleZ += MathHelper.cos(ageInTicks * 0.09F) * 0.05F + 0.05F;
        //this.bipedLeftArm.rotateAngleZ -= MathHelper.cos(ageInTicks * 0.09F) * 0.05F + 0.05F;
        this.bipedRightArm.rotateAngleX += MathHelper.sin(ageInTicks * 0.067F) * 0.05F;
        //this.bipedLeftArm.rotateAngleX -= MathHelper.sin(ageInTicks * 0.067F) * 0.05F;
	}
}
