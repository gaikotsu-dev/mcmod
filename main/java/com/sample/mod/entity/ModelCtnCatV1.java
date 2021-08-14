package com.sample.mod.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.util.math.MathHelper;

public class ModelCtnCatV1 extends ModelBase {
	private final ModelRenderer head;
	private final ModelRenderer bone2;
	private final ModelRenderer bone3;
	private final ModelRenderer bone4;
	private final ModelRenderer bone6;
	private final ModelRenderer bone7;
	private final ModelRenderer bone8;
	private final ModelRenderer bone10;
	private final ModelRenderer bone;
	private final ModelRenderer body;
	private final ModelRenderer bone9;
	private final ModelRenderer bone11;
	private final ModelRenderer armR;
	private final ModelRenderer bone14;
	private final ModelRenderer bone16;
	private final ModelRenderer armL;
	private final ModelRenderer bone15;
	private final ModelRenderer bone17;
	private final ModelRenderer legR;
	private final ModelRenderer bone12;
	private final ModelRenderer legL;
	private final ModelRenderer bone13;

	public ModelCtnCatV1() {
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -18.0F, 2.0F);
		head.cubeList.add(new ModelBox(head, 0, 0, 6.0F, -16.0F, -5.0F, 2, 12, 8, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 36, -5.0F, -8.0F, -4.0F, 11, 1, 7, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 46, 63, -4.0F, -6.0F, -5.0F, 9, 1, 0, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 12, -6.0F, -17.0F, -6.0F, 13, 1, 9, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 12, -5.0F, -18.0F, -5.0F, 11, 1, 8, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 0, -7.0F, -16.0F, -5.0F, 2, 12, 8, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 20, 44, -5.0F, -7.0F, -4.0F, 11, 4, 7, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 0, -4.0F, -3.0F, -5.0F, 9, 1, 8, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 46, 62, -4.0F, -4.0F, -5.0F, 9, 1, 0, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 0, 0.0F, -15.0F, -5.0F, 1, 9, 1, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 56, 12, -4.0F, -14.0F, -5.0F, 3, 7, 1, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 28, 14, -5.0F, -16.0F, -4.0F, 11, 8, 7, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 56, 12, 2.0F, -14.0F, -5.0F, 3, 7, 1, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 0, -0.5F, -2.7417F, -2.0F, 2, 3, 3, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 0, 8.0F, -11.0F, -5.0F, 2, 7, 8, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 0, -9.0F, -11.0F, -5.0F, 2, 7, 8, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 60, 35, -1.0F, -5.0F, -5.0F, 3, 1, 1, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(-4.0F, -2.0F, -2.0F);
		setRotationAngle(bone2, 0.0F, 0.0F, 0.6981F);
		head.addChild(bone2);
		bone2.cubeList.add(new ModelBox(bone2, 0, 0, -4.0F, -1.0F, -3.0F, 4, 1, 8, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(5.0F, -2.0F, -2.0F);
		setRotationAngle(bone3, 0.0F, 0.0F, -0.6981F);
		head.addChild(bone3);
		bone3.cubeList.add(new ModelBox(bone3, 0, 0, 0.0F, -1.0F, -3.0F, 4, 1, 8, 0.0F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(-3.0F, -3.0F, -4.0F);
		setRotationAngle(bone4, 0.0F, 0.0F, 0.2618F);
		head.addChild(bone4);
		bone4.cubeList.add(new ModelBox(bone4, 60, 63, -1.9659F, -0.7412F, -1.0F, 1, 1, 0, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 60, 63, -2.5176F, -2.9319F, -1.0F, 2, 1, 0, 0.0F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(5.0F, -3.0F, -5.0F);
		setRotationAngle(bone6, 0.0F, 0.0F, -0.2618F);
		head.addChild(bone6);
		bone6.cubeList.add(new ModelBox(bone6, 60, 63, 0.0F, -1.0F, 0.0F, 1, 1, 0, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 58, 63, 0.0F, -2.9319F, 0.0F, 1, 1, 0, 0.0F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(-5.0F, -13.0F, -2.0F);
		setRotationAngle(bone7, 0.0F, 0.0F, -0.6981F);
		head.addChild(bone7);
		bone7.cubeList.add(new ModelBox(bone7, 0, 10, 0.4938F, -2.4983F, -3.0F, 3, 0, 8, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 0, 0, 11.4065F, 2.8832F, -2.0F, 5, 1, 6, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 50, 0, 1.5712F, -7.0642F, -2.0F, 1, 4, 6, 0.0F, false));

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(9.0F, -14.0F, -2.0F);
		setRotationAngle(bone8, 0.0F, 0.0F, 0.6981F);
		head.addChild(bone8);
		bone8.cubeList.add(new ModelBox(bone8, 2, 14, -5.0F, -1.0F, -3.0F, 3, 1, 8, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 0, 0, -18.0F, 5.7009F, -2.0F, 5, 1, 6, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 50, 0, -3.8177F, -5.2465F, -2.0F, 1, 5, 6, 0.0F, false));

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(0.0F, -15.0F, -5.0F);
		setRotationAngle(bone10, 0.0F, 0.0F, -0.5236F);
		head.addChild(bone10);
		bone10.cubeList.add(new ModelBox(bone10, 0, 0, 0.0F, 0.0F, 0.0F, 5, 1, 1, 0.0F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-1.0F, -14.0F, -4.0F);
		setRotationAngle(bone, 0.0F, 0.0F, 0.5236F);
		head.addChild(bone);
		bone.cubeList.add(new ModelBox(bone, 0, 0, -3.0F, -2.0F, -1.0F, 4, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -5.3301F, -0.5F, -1.0F, 1, 3, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 4.366F, -5.866F, -1.0F, 2, 1, 1, 0.0F, false));

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, -11.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 0, 0, -3.0F, -6.0F, -2.0F, 7, 17, 7, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 0, -5.0F, -7.0F, -1.0F, 11, 18, 5, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 11, -7.0F, -7.0F, -2.0F, 15, 2, 7, 0.0F, false));

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(-5.0F, -4.0F, 0.0F);
		setRotationAngle(bone9, 0.0F, 0.0F, -0.1745F);
		body.addChild(bone9);
		bone9.cubeList.add(new ModelBox(bone9, 0, 0, -2.0F, -4.0F, -2.0F, 2, 16, 7, 0.0F, false));

		bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(6.0F, -4.0F, 0.0F);
		setRotationAngle(bone11, 0.0F, 0.0F, 0.1745F);
		body.addChild(bone11);
		bone11.cubeList.add(new ModelBox(bone11, 0, 0, 0.0F, -4.0F, -2.0F, 2, 16, 7, 0.0F, false));

		armR = new ModelRenderer(this);
		armR.setRotationPoint(-8.0F, -17.0F, 1.0F);
		armR.cubeList.add(new ModelBox(armR, 60, 56, 0.0F, 23.0F, -6.0F, 1, 7, 1, 0.0F, false));
		armR.cubeList.add(new ModelBox(armR, 60, 58, 2.0F, 23.0F, -1.0F, 1, 5, 1, 0.0F, false));
		armR.cubeList.add(new ModelBox(armR, 60, 56, -4.0F, 23.0F, -6.0F, 1, 7, 1, 0.0F, false));
		armR.cubeList.add(new ModelBox(armR, 60, 56, -2.0F, 23.0F, -6.0F, 1, 7, 1, 0.0F, false));
		armR.cubeList.add(new ModelBox(armR, 36, 55, -5.0F, 22.0F, -5.0F, 7, 2, 7, 0.0F, false));

		bone14 = new ModelRenderer(this);
		bone14.setRotationPoint(1.0F, 0.0F, -1.0F);
		setRotationAngle(bone14, 0.0F, 0.0F, 0.0873F);
		armR.addChild(bone14);
		bone14.cubeList.add(new ModelBox(bone14, 0, 0, -3.0F, -1.0F, -1.0F, 3, 14, 4, 0.0F, false));

		bone16 = new ModelRenderer(this);
		bone16.setRotationPoint(-2.0F, 13.0F, -1.0F);
		setRotationAngle(bone16, -0.1745F, 0.0F, 0.0F);
		armR.addChild(bone16);
		bone16.cubeList.add(new ModelBox(bone16, 0, 0, -1.0F, -1.0F, -1.0F, 3, 10, 4, 0.0F, false));

		armL = new ModelRenderer(this);
		armL.setRotationPoint(9.0F, -17.0F, 1.0F);
		armL.cubeList.add(new ModelBox(armL, 38, 56, -2.0F, 22.0F, -4.0F, 7, 2, 5, 0.0F, false));
		armL.cubeList.add(new ModelBox(armL, 60, 56, -1.0F, 23.0F, -5.0F, 1, 7, 1, 0.0F, false));
		armL.cubeList.add(new ModelBox(armL, 60, 56, 3.0F, 23.0F, -5.0F, 1, 7, 1, 0.0F, false));
		armL.cubeList.add(new ModelBox(armL, 60, 56, 1.0F, 23.0F, -5.0F, 1, 7, 1, 0.0F, false));
		armL.cubeList.add(new ModelBox(armL, 58, 56, -3.0F, 23.0F, -1.0F, 1, 5, 1, 0.0F, false));

		bone15 = new ModelRenderer(this);
		bone15.setRotationPoint(-1.0F, 0.0F, -1.0F);
		setRotationAngle(bone15, 0.0F, 0.0F, -0.0873F);
		armL.addChild(bone15);
		bone15.cubeList.add(new ModelBox(bone15, 0, 0, 0.0F, -1.0F, 0.0F, 3, 14, 3, 0.0F, false));

		bone17 = new ModelRenderer(this);
		bone17.setRotationPoint(2.0F, 13.0F, -1.0F);
		setRotationAngle(bone17, -0.1745F, 0.0F, 0.0F);
		armL.addChild(bone17);
		bone17.cubeList.add(new ModelBox(bone17, 0, 0, -2.0F, -1.0F, 0.0F, 3, 10, 3, 0.0F, false));

		legR = new ModelRenderer(this);
		legR.setRotationPoint(-3.0F, 0.0F, 2.0F);
		legR.cubeList.add(new ModelBox(legR, 0, 0, -1.0F, 10.0F, -3.0F, 4, 14, 3, 0.0F, false));

		bone12 = new ModelRenderer(this);
		bone12.setRotationPoint(0.0F, 1.0F, -1.0F);
		setRotationAngle(bone12, -0.0873F, 0.0F, 0.0F);
		legR.addChild(bone12);
		bone12.cubeList.add(new ModelBox(bone12, 0, 0, -1.0F, -2.0F, -1.0F, 4, 12, 3, 0.0F, false));

		legL = new ModelRenderer(this);
		legL.setRotationPoint(3.0F, 0.0F, 2.0F);
		legL.cubeList.add(new ModelBox(legL, 0, 0, -2.0F, 10.0F, -3.0F, 4, 14, 3, 0.0F, false));

		bone13 = new ModelRenderer(this);
		bone13.setRotationPoint(1.0F, 1.0F, -1.0F);
		setRotationAngle(bone13, -0.0873F, 0.0F, 0.0F);
		legL.addChild(bone13);
		bone13.cubeList.add(new ModelBox(bone13, 0, 0, -3.0F, -3.0F, -1.0F, 4, 13, 3, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		head.render(f5);
		body.render(f5);
		armR.render(f5);
		armL.render(f5);
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
		this.head.rotateAngleZ = MathHelper.cos(limbSwing * 0.6662F) * 0.5F * limbSwingAmount;
	}
}