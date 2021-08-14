package com.sample.mod.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.util.math.MathHelper;

public class ModelCtnDogDX extends ModelBase {
	private final ModelRenderer head;
	private final ModelRenderer bone18;
	private final ModelRenderer bone17;
	private final ModelRenderer bone15;
	private final ModelRenderer body;
	private final ModelRenderer legL;
	private final ModelRenderer bone5;
	private final ModelRenderer bone4;
	private final ModelRenderer bone8;
	private final ModelRenderer bone9;
	private final ModelRenderer legR;
	private final ModelRenderer bone3;
	private final ModelRenderer bone2;
	private final ModelRenderer bone;
	private final ModelRenderer armR;
	private final ModelRenderer bone12;
	private final ModelRenderer armL;
	private final ModelRenderer bone14;

	public ModelCtnDogDX() {
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -7.0F, 1.0F);
		head.cubeList.add(new ModelBox(head, 0, 0, 2.0F, -13.0F, -1.0F, 1, 2, 2, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 0, 9.0F, -9.0F, -1.0F, 1, 6, 2, 0.0F, false));

		bone18 = new ModelRenderer(this);
		bone18.setRotationPoint(0.0F, -3.0F, 0.0F);
		setRotationAngle(bone18, 0.0F, 0.0F, -0.1745F);
		head.addChild(bone18);
		bone18.cubeList.add(new ModelBox(bone18, 44, 35, -5.0F, 0.0F, -1.0F, 8, 1, 2, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 49, 62, -5.0F, -1.0F, -1.0F, 6, 1, 0, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 56, 62, -5.0F, -0.7142F, 1.0F, 5, 1, 0, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 47, 61, -4.9696F, -1.3473F, -1.0F, 0, 1, 2, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 0, 30, -0.0152F, -2.8264F, -1.0F, 3, 3, 2, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 54, 63, -5.0F, -2.9696F, 1.0F, 6, 1, 0, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 52, 56, -4.6527F, -2.9696F, -1.0F, 6, 1, 0, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 51, 58, -4.7656F, -2.6794F, -1.0F, 0, 1, 2, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 44, 18, -5.0F, -3.9544F, -1.0F, 8, 1, 2, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 0, 61, -5.4031F, -4.8227F, -1.0F, 1, 1, 2, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 0, 0, -3.0F, -10.3842F, -1.0F, 7, 1, 2, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 0, 0, 7.7467F, -4.5349F, -1.0F, 3, 1, 2, 0.0F, false));

		bone17 = new ModelRenderer(this);
		bone17.setRotationPoint(4.0F, -5.0F, 0.0F);
		setRotationAngle(bone17, 0.0F, 0.0F, 0.6109F);
		head.addChild(bone17);
		bone17.cubeList.add(new ModelBox(bone17, 50, 0, -5.3927F, -5.0112F, -1.0F, 6, 7, 2, 0.0F, false));

		bone15 = new ModelRenderer(this);
		bone15.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.addChild(bone15);
		bone15.cubeList.add(new ModelBox(bone15, 0, 0, -1.0F, -2.0F, -1.0F, 2, 2, 2, 0.0F, false));

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, -2.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 0, 0, -4.0F, 7.0F, 0.0F, 8, 2, 2, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 0, -2.0F, -4.0F, 0.0F, 4, 11, 2, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 0, -3.0F, -4.0F, 0.0F, 6, 7, 2, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 0, -6.0F, -5.0F, 0.0F, 12, 2, 2, 0.0F, false));

		legL = new ModelRenderer(this);
		legL.setRotationPoint(4.0F, 8.0F, 1.0F);
		legL.cubeList.add(new ModelBox(legL, 46, 58, -2.0F, 15.0F, -3.0F, 4, 1, 5, 0.0F, false));
		legL.cubeList.add(new ModelBox(legL, 0, 0, -1.0F, -1.0F, -1.0F, 2, 16, 2, 0.0F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(-3.0F, 16.0F, 0.0F);
		setRotationAngle(bone5, 0.0F, 0.5236F, 0.0F);
		legL.addChild(bone5);
		bone5.cubeList.add(new ModelBox(bone5, 52, 59, 1.0F, -1.0F, -3.0F, 1, 1, 4, 0.0F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(-4.0F, 16.0F, -1.0F);
		legL.addChild(bone4);
		bone4.cubeList.add(new ModelBox(bone4, 54, 59, 4.0F, -1.0F, -6.0F, 1, 1, 4, 0.0F, false));

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(-3.0F, 16.0F, -1.0F);
		setRotationAngle(bone8, 0.0F, 0.1745F, 0.0F);
		legL.addChild(bone8);
		bone8.cubeList.add(new ModelBox(bone8, 52, 58, 2.0F, -1.0F, -6.0F, 1, 1, 5, 0.0F, false));

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(-4.0F, 16.0F, -1.0F);
		setRotationAngle(bone9, 0.0F, -0.1745F, 0.0F);
		legL.addChild(bone9);
		bone9.cubeList.add(new ModelBox(bone9, 52, 58, 5.0F, -1.0F, -7.0F, 1, 1, 5, 0.0F, false));

		legR = new ModelRenderer(this);
		legR.setRotationPoint(-4.0F, 8.0F, 1.0F);
		legR.cubeList.add(new ModelBox(legR, 44, 57, -2.0F, 15.0F, -3.0F, 4, 1, 5, 0.0F, false));
		legR.cubeList.add(new ModelBox(legR, 54, 59, -1.0F, 15.0F, -7.0F, 1, 1, 4, 0.0F, false));
		legR.cubeList.add(new ModelBox(legR, 0, 0, -1.0F, -1.0F, -1.0F, 2, 16, 2, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(3.0F, 16.0F, 4.0F);
		setRotationAngle(bone3, 0.0F, -0.5236F, 0.0F);
		legR.addChild(bone3);
		bone3.cubeList.add(new ModelBox(bone3, 54, 59, -3.583F, -1.0F, -6.3395F, 1, 1, 4, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(3.0F, 16.0F, 0.0F);
		setRotationAngle(bone2, 0.0F, -0.1745F, 0.0F);
		legR.addChild(bone2);
		bone2.cubeList.add(new ModelBox(bone2, 52, 58, -2.8264F, -1.0F, -7.0152F, 1, 1, 5, 0.0F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(5.0F, 16.0F, -2.0F);
		setRotationAngle(bone, 0.0F, 0.1745F, 0.0F);
		legR.addChild(bone);
		bone.cubeList.add(new ModelBox(bone, 52, 58, -7.3473F, -1.0F, -6.0304F, 1, 1, 5, 0.0F, false));

		armR = new ModelRenderer(this);
		armR.setRotationPoint(-5.0F, -4.0F, 1.0F);
		armR.cubeList.add(new ModelBox(armR, 0, 0, -1.0F, -1.0F, -1.0F, 2, 9, 2, 0.0F, false));

		bone12 = new ModelRenderer(this);
		bone12.setRotationPoint(0.0F, 9.0F, 0.0F);
		setRotationAngle(bone12, -0.8727F, 0.6109F, -0.6109F);
		armR.addChild(bone12);
		bone12.cubeList.add(new ModelBox(bone12, 0, 0, -1.0F, -1.0F, -1.0F, 2, 9, 2, 0.0F, false));

		armL = new ModelRenderer(this);
		armL.setRotationPoint(5.0F, -4.0F, 1.0F);
		armL.cubeList.add(new ModelBox(armL, 0, 0, -1.0F, -1.0F, -1.0F, 2, 9, 2, 0.0F, false));

		bone14 = new ModelRenderer(this);
		bone14.setRotationPoint(0.0F, 9.0F, 0.0F);
		setRotationAngle(bone14, -0.8727F, -0.5236F, 0.5236F);
		armL.addChild(bone14);
		bone14.cubeList.add(new ModelBox(bone14, 0, 0, -1.0F, -1.0F, -1.0F, 2, 9, 2, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		head.render(f5);
		body.render(f5);
		legL.render(f5);
		legR.render(f5);
		armR.render(f5);
		armL.render(f5);
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
		this.head.rotateAngleZ = MathHelper.cos(limbSwing * 0.6662F) * 0.2F * limbSwingAmount;
	}
}