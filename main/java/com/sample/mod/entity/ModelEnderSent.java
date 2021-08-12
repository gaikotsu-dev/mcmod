package com.sample.mod.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.util.math.MathHelper;

public class ModelEnderSent extends ModelBase {
	private final ModelRenderer body;
	private final ModelRenderer armR;
	private final ModelRenderer bone5;
	private final ModelRenderer bone2;
	private final ModelRenderer bone7;
	private final ModelRenderer armL;
	private final ModelRenderer bone4;
	private final ModelRenderer bone8;
	private final ModelRenderer bone9;
	private final ModelRenderer bone10;
	private final ModelRenderer head;
	private final ModelRenderer legR;
	private final ModelRenderer legL;

	public ModelEnderSent() {
		textureWidth = 128;
		textureHeight = 128;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, -34.0F, -6.0F);
		setRotationAngle(body, 0.6981F, 0.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 0, 0, -4.0F, -4.2385F, -4.8117F, 9, 19, 5, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 0, -3.0F, 14.2241F, -3.6367F, 7, 5, 3, 0.0F, false));

		armR = new ModelRenderer(this);
		armR.setRotationPoint(-6.0F, -35.0F, -8.0F);

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(0.0F, 25.0487F, -2.9335F);
		setRotationAngle(bone5, 1.0472F, 0.0F, 0.0F);
		armR.addChild(bone5);
		bone5.cubeList.add(new ModelBox(bone5, 0, 32, -1.0F, -1.0F, -21.0F, 3, 3, 22, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, 0.0F, 1.0F);
		setRotationAngle(bone2, 1.3963F, 0.0F, 0.0F);
		armR.addChild(bone2);
		bone2.cubeList.add(new ModelBox(bone2, 0, 32, -1.0F, -1.0F, -26.0F, 3, 3, 27, 0.0F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(0.0F, 41.0F, -4.8038F);
		setRotationAngle(bone7, -0.5236F, 0.0F, 0.0F);
		armR.addChild(bone7);
		bone7.cubeList.add(new ModelBox(bone7, 0, 32, -2.0F, 4.8301F, -8.0981F, 5, 5, 13, 0.0F, false));

		armL = new ModelRenderer(this);
		armL.setRotationPoint(7.0F, -35.0F, -7.0F);

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(-12.0F, 0.0F, 0.0F);
		armL.addChild(bone4);

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(0.0F, 23.0487F, -3.9335F);
		setRotationAngle(bone8, 1.0472F, 0.0F, 0.0F);
		bone4.addChild(bone8);
		bone8.cubeList.add(new ModelBox(bone8, 0, 65, 10.0F, 0.0F, -20.7321F, 3, 3, 20, 0.0F, false));

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone9, 1.3963F, 0.0F, 0.0F);
		bone4.addChild(bone9);
		bone9.cubeList.add(new ModelBox(bone9, 0, 65, 10.0F, -1.0F, -26.0F, 3, 3, 27, 0.0F, false));

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(0.0F, 41.0F, -4.8038F);
		setRotationAngle(bone10, -0.5236F, 0.0F, 0.0F);
		bone4.addChild(bone10);
		bone10.cubeList.add(new ModelBox(bone10, 0, 65, 9.0F, 3.9641F, -8.5981F, 5, 5, 13, 0.0F, false));

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -35.0F, -13.0F);
		setRotationAngle(head, 0.0873F, 0.0F, 0.0F);
		head.cubeList.add(new ModelBox(head, 102, 113, -3.0F, -4.0F, -3.0F, 7, 10, 4, 0.0F, false));

		legR = new ModelRenderer(this);
		legR.setRotationPoint(-1.0F, -18.0F, 3.0F);
		legR.cubeList.add(new ModelBox(legR, 78, 0, -2.0F, -1.0F, -1.0F, 3, 43, 4, 0.0F, true));

		legL = new ModelRenderer(this);
		legL.setRotationPoint(2.0F, -18.0F, 3.0F);
		legL.cubeList.add(new ModelBox(legL, 101, 0, -1.0F, -1.0F, -1.0F, 3, 43, 4, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		body.render(f5);
		armR.render(f5);
		armL.render(f5);
		head.render(f5);
		legR.render(f5);
		legL.render(f5);
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