package com.sample.mod.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.util.math.MathHelper;

public class ModelRedstoneGolem extends ModelBase {
	private final ModelRenderer all;
	private final ModelRenderer legL;
	private final ModelRenderer legR;
	private final ModelRenderer body;
	private final ModelRenderer armR;
	private final ModelRenderer armL;

	public ModelRedstoneGolem() {
		textureWidth = 128;
		textureHeight = 128;

		all = new ModelRenderer(this);
		all.setRotationPoint(0.0F, 24.0F, 0.0F);
		setRotationAngle(all, 0.0F, 3.1416F, 0.0F);
		all.cubeList.add(new ModelBox(all, 26, 30, -3.0F, -27.0F, -1.0F, 8, 8, 7, 0.0F, false));

		legL = new ModelRenderer(this);
		legL.setRotationPoint(-4.0F, -10.0F, -4.0F);
		all.addChild(legL);
		legL.cubeList.add(new ModelBox(legL, 108, 0, -2.0F, 0.0F, -3.0F, 5, 10, 5, 0.0F, false));

		legR = new ModelRenderer(this);
		legR.setRotationPoint(5.0F, -10.0F, -4.0F);
		all.addChild(legR);
		legR.cubeList.add(new ModelBox(legR, 108, 0, -2.0F, 0.0F, -3.0F, 5, 10, 5, 0.0F, false));

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		all.addChild(body);
		body.cubeList.add(new ModelBox(body, 0, 0, -7.0F, -27.0F, -8.0F, 16, 13, 7, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 0, -2.0F, -24.0F, -9.0F, 6, 5, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 73, 92, -5.0F, -14.0F, -7.0F, 12, 4, 5, 0.0F, false));

		armR = new ModelRenderer(this);
		armR.setRotationPoint(11.0F, -24.0F, -4.0F);
		all.addChild(armR);
		armR.cubeList.add(new ModelBox(armR, 0, 114, -2.0F, -2.0F, -3.0F, 4, 9, 5, 0.0F, false));
		armR.cubeList.add(new ModelBox(armR, 104, 0, -2.0F, 7.0F, -4.0F, 5, 5, 7, 0.0F, false));
		armR.cubeList.add(new ModelBox(armR, 36, 38, 1.0F, 12.0F, -3.0F, 1, 2, 1, 0.0F, false));
		armR.cubeList.add(new ModelBox(armR, 111, 8, 1.0F, 12.0F, 1.0F, 1, 2, 1, 0.0F, false));
		armR.cubeList.add(new ModelBox(armR, 94, 97, -1.0F, 12.0F, -3.0F, 1, 2, 1, 0.0F, false));
		armR.cubeList.add(new ModelBox(armR, 107, 10, -1.0F, 12.0F, 1.0F, 1, 2, 1, 0.0F, false));

		armL = new ModelRenderer(this);
		armL.setRotationPoint(-9.0F, -24.0F, -4.0F);
		all.addChild(armL);
		armL.cubeList.add(new ModelBox(armL, 110, 114, -2.0F, -2.0F, -3.0F, 4, 9, 5, 0.0F, false));
		armL.cubeList.add(new ModelBox(armL, 110, 114, -3.0F, 7.0F, -4.0F, 5, 5, 7, 0.0F, false));
		armL.cubeList.add(new ModelBox(armL, 110, 114, -2.0F, 12.0F, 1.0F, 1, 2, 1, 0.0F, false));
		armL.cubeList.add(new ModelBox(armL, 110, 114, -2.0F, 12.0F, -3.0F, 1, 2, 1, 0.0F, false));
		armL.cubeList.add(new ModelBox(armL, 110, 114, 0.0F, 12.0F, 1.0F, 1, 2, 1, 0.0F, false));
		armL.cubeList.add(new ModelBox(armL, 110, 114, 0.0F, 12.0F, -3.0F, 1, 2, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		all.render(f5);
	}
	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
							  float headPitch, float scaleFactor, Entity entityIn)
	{
		this.armR.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
		this.armL.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
		this.legR.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
		this.legL.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
	}
}