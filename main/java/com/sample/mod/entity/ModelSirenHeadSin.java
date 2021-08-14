package com.sample.mod.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.util.math.MathHelper;

public class ModelSirenHeadSin extends ModelBase {
	private final ModelRenderer legR;
	private final ModelRenderer bone;
	private final ModelRenderer bone2;
	private final ModelRenderer bone3;
	private final ModelRenderer legL;
	private final ModelRenderer bone6;
	private final ModelRenderer bone4;
	private final ModelRenderer bone5;
	private final ModelRenderer bone9;
	private final ModelRenderer body;
	private final ModelRenderer bone13;
	private final ModelRenderer bone12;
	private final ModelRenderer bone11;
	private final ModelRenderer bone10;
	private final ModelRenderer armR;
	private final ModelRenderer bone22;
	private final ModelRenderer bone21;
	private final ModelRenderer bone18;
	private final ModelRenderer armL;
	private final ModelRenderer bone15;
	private final ModelRenderer bone20;
	private final ModelRenderer bone19;
	private final ModelRenderer head;
	private final ModelRenderer bone30;
	private final ModelRenderer bone28;
	private final ModelRenderer bone24;

	public ModelSirenHeadSin() {
		textureWidth = 64;
		textureHeight = 64;

				legR = new ModelRenderer(this);
		legR.setRotationPoint(-4.0F, 0.0F, 1.0F);
		legR.cubeList.add(new ModelBox(legR, 0, 0, -2.0F, 23.0F, -6.0F, 4, 1, 8, 0.0F, false));
		legR.cubeList.add(new ModelBox(legR, 0, 0, -1.0F, 9.0F, -2.0F, 2, 14, 3, 0.0F, false));
		legR.cubeList.add(new ModelBox(legR, 0, 0, -1.0F, 23.0F, -11.0F, 1, 1, 5, 0.0F, false));
		legR.cubeList.add(new ModelBox(legR, 0, 0, 1.0F, 5.0F, -2.0F, 1, 4, 3, 0.0F, false));
		legR.cubeList.add(new ModelBox(legR, 0, 0, -2.0F, 5.0F, -2.0F, 1, 4, 3, 0.0F, false));
		legR.cubeList.add(new ModelBox(legR, 0, 0, -1.0F, -1.0F, -2.0F, 2, 6, 3, 0.0F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(1.0F, 24.0F, -7.0F);
		setRotationAngle(bone, 0.0F, -0.1745F, 0.0F);
		legR.addChild(bone);
		bone.cubeList.add(new ModelBox(bone, 0, 0, -0.0152F, -1.0F, -3.1736F, 1, 1, 4, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(2.0F, 24.0F, -6.0F);
		setRotationAngle(bone2, 0.0F, -0.4363F, 0.0F);
		legR.addChild(bone2);
		bone2.cubeList.add(new ModelBox(bone2, 0, 0, 2.0194F, -1.0F, 1.1089F, 1, 1, 4, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(-2.0F, 24.0F, -7.0F);
		setRotationAngle(bone3, 0.0F, 0.1745F, 0.0F);
		legR.addChild(bone3);
		bone3.cubeList.add(new ModelBox(bone3, 0, 0, -1.0F, -1.0F, -3.0F, 1, 1, 5, 0.0F, false));

		legL = new ModelRenderer(this);
		legL.setRotationPoint(5.0F, 0.0F, 1.0F);
		legL.cubeList.add(new ModelBox(legL, 0, 0, -2.0F, 23.0F, -6.0F, 4, 1, 8, 0.0F, false));
		legL.cubeList.add(new ModelBox(legL, 0, 0, -1.0F, 9.0F, -2.0F, 2, 14, 3, 0.0F, false));
		legL.cubeList.add(new ModelBox(legL, 0, 0, 0.0F, 23.0F, -11.0F, 1, 1, 5, 0.0F, false));
		legL.cubeList.add(new ModelBox(legL, 0, 0, 1.0F, 5.0F, -2.0F, 1, 4, 3, 0.0F, false));
		legL.cubeList.add(new ModelBox(legL, 0, 0, -2.0F, 5.0F, -2.0F, 1, 4, 3, 0.0F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(3.0F, 24.0F, -7.0F);
		setRotationAngle(bone6, 0.0F, -0.1745F, 0.0F);
		legL.addChild(bone6);
		bone6.cubeList.add(new ModelBox(bone6, 0, 0, -1.0F, -1.0F, -3.0F, 1, 1, 5, 0.0F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(-1.0F, 24.0F, -7.0F);
		setRotationAngle(bone4, 0.0F, 0.1745F, 0.0F);
		legL.addChild(bone4);
		bone4.cubeList.add(new ModelBox(bone4, 0, 0, -1.0F, -1.0F, -3.0F, 1, 1, 4, 0.0F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(-2.0F, 24.0F, -1.0F);
		setRotationAngle(bone5, 0.0F, 0.4363F, 0.0F);
		legL.addChild(bone5);
		bone5.cubeList.add(new ModelBox(bone5, 0, 0, -1.0F, -1.0F, -4.0F, 1, 1, 5, 0.0F, false));

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(0.0F, 5.0F, -1.0F);
		legL.addChild(bone9);
		bone9.cubeList.add(new ModelBox(bone9, 0, 0, -1.0F, -6.0F, -1.0F, 2, 6, 3, 0.0F, false));

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, -14.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 4, 56, -1.0F, 6.0F, -1.0F, 3, 5, 3, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 49, -3.0F, -4.0F, -2.0F, 7, 10, 5, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 48, 0, 4.0F, -5.0F, -3.0F, 1, 1, 6, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 48, 0, 4.0F, 4.0F, -3.0F, 1, 1, 6, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 48, 0, -4.0F, 4.0F, -3.0F, 1, 1, 6, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 52, 0, 4.0F, -2.0F, -2.0F, 1, 1, 5, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 52, 0, 4.0F, 1.0F, -2.0F, 1, 1, 5, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 54, 0, 1.0F, 1.0F, -3.0F, 4, 1, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 52, 0, -4.0F, -2.0F, -2.0F, 1, 1, 5, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 48, 0, -4.0F, -5.0F, -3.0F, 1, 1, 6, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 54, 0, 1.0F, -2.0F, -3.0F, 4, 1, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 52, 0, -4.0F, 1.0F, -2.0F, 1, 1, 5, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 54, 0, -4.0F, 1.0F, -3.0F, 4, 1, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 54, 0, -4.0F, -2.0F, -3.0F, 4, 1, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 0, -5.0F, 11.0F, -1.0F, 11, 2, 3, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 0, 4.0F, -4.0F, 0.0F, 6, 2, 2, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 0, -9.0F, -4.0F, 0.0F, 6, 2, 2, 0.0F, false));

		bone13 = new ModelRenderer(this);
		bone13.setRotationPoint(2.0F, -3.0F, -3.0F);
		setRotationAngle(bone13, 0.0F, 0.0F, -0.1745F);
		body.addChild(bone13);
		bone13.cubeList.add(new ModelBox(bone13, 54, 0, -1.0F, -1.0F, 0.0F, 4, 1, 1, 0.0F, false));

		bone12 = new ModelRenderer(this);
		bone12.setRotationPoint(1.0F, 4.0F, -3.0F);
		setRotationAngle(bone12, 0.0F, 0.0F, 0.1745F);
		body.addChild(bone12);
		bone12.cubeList.add(new ModelBox(bone12, 54, 0, 0.0F, -1.0F, 0.0F, 4, 1, 1, 0.0F, false));

		bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(0.0F, 4.0F, -3.0F);
		setRotationAngle(bone11, 0.0F, 0.0F, -0.1745F);
		body.addChild(bone11);
		bone11.cubeList.add(new ModelBox(bone11, 54, 0, -4.0F, -1.0F, 0.0F, 4, 1, 1, 0.0F, false));

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(0.0F, -3.0F, -3.0F);
		setRotationAngle(bone10, 0.0F, 0.0F, 0.1745F);
		body.addChild(bone10);
		bone10.cubeList.add(new ModelBox(bone10, 54, 0, -4.0F, -1.0F, 0.0F, 4, 1, 1, 0.0F, false));

		armR = new ModelRenderer(this);
		armR.setRotationPoint(-8.0F, -17.0F, 1.0F);
		armR.cubeList.add(new ModelBox(armR, 0, 0, -1.0F, -2.0F, -1.0F, 2, 12, 2, 0.0F, false));
		armR.cubeList.add(new ModelBox(armR, 0, 0, 1.0F, 9.0F, -1.0F, 1, 6, 2, 0.0F, false));
		armR.cubeList.add(new ModelBox(armR, 0, 0, -2.0F, 9.0F, -1.0F, 1, 6, 2, 0.0F, false));
		armR.cubeList.add(new ModelBox(armR, 0, 0, -1.0F, 24.0F, -3.0F, 1, 5, 1, 0.0F, false));
		armR.cubeList.add(new ModelBox(armR, 0, 0, -3.0F, 23.0F, -1.0F, 1, 5, 1, 0.0F, false));

		bone22 = new ModelRenderer(this);
		bone22.setRotationPoint(2.0F, 25.0F, -3.0F);
		setRotationAngle(bone22, 0.0F, 0.0F, -0.0873F);
		armR.addChild(bone22);
		bone22.cubeList.add(new ModelBox(bone22, 0, 0, -1.0F, -1.0F, 0.0F, 1, 5, 1, 0.0F, false));

		bone21 = new ModelRenderer(this);
		bone21.setRotationPoint(-1.0F, 25.0F, -3.0F);
		setRotationAngle(bone21, 0.0F, 0.0F, 0.0873F);
		armR.addChild(bone21);
		bone21.cubeList.add(new ModelBox(bone21, 0, 0, -1.0F, -1.0F, 0.0F, 1, 5, 1, 0.0F, false));

		bone18 = new ModelRenderer(this);
		bone18.setRotationPoint(0.0F, 14.0F, 0.0F);
		setRotationAngle(bone18, -0.1745F, 0.0F, 0.0F);
		armR.addChild(bone18);
		bone18.cubeList.add(new ModelBox(bone18, 0, 0, -1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 0, 0, -2.0F, 7.7525F, -1.1712F, 4, 3, 2, 0.0F, false));

		armL = new ModelRenderer(this);
		armL.setRotationPoint(9.0F, -17.0F, 1.0F);
		armL.cubeList.add(new ModelBox(armL, 0, 0, -1.0F, -2.0F, -1.0F, 2, 12, 2, 0.0F, false));
		armL.cubeList.add(new ModelBox(armL, 0, 0, 1.0F, 9.0F, -1.0F, 1, 6, 2, 0.0F, false));
		armL.cubeList.add(new ModelBox(armL, 0, 0, -2.0F, 9.0F, -1.0F, 1, 6, 2, 0.0F, false));
		armL.cubeList.add(new ModelBox(armL, 0, 0, 0.0F, 24.0F, -4.0F, 1, 5, 1, 0.0F, false));
		armL.cubeList.add(new ModelBox(armL, 0, 0, 2.0F, 23.0F, -1.0F, 1, 5, 1, 0.0F, false));

		bone15 = new ModelRenderer(this);
		bone15.setRotationPoint(0.0F, 14.0F, 0.0F);
		setRotationAngle(bone15, -0.1745F, 0.0F, 0.0F);
		armL.addChild(bone15);
		bone15.cubeList.add(new ModelBox(bone15, 0, 0, -1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F, false));
		bone15.cubeList.add(new ModelBox(bone15, 0, 0, -2.0F, 8.2106F, -1.4068F, 4, 3, 2, 0.0F, false));

		bone20 = new ModelRenderer(this);
		bone20.setRotationPoint(2.0F, 25.0F, -4.0F);
		setRotationAngle(bone20, 0.0F, 0.0F, -0.0873F);
		armL.addChild(bone20);
		bone20.cubeList.add(new ModelBox(bone20, 0, 0, -1.0F, -1.0F, 0.0F, 1, 5, 1, 0.0F, false));

		bone19 = new ModelRenderer(this);
		bone19.setRotationPoint(-1.0F, 25.0F, -4.0F);
		setRotationAngle(bone19, 0.0F, 0.0F, 0.0873F);
		armL.addChild(bone19);
		bone19.cubeList.add(new ModelBox(bone19, 0, 0, -1.0F, -1.0F, 0.0F, 1, 5, 1, 0.0F, false));

		head = new ModelRenderer(this);
		head.setRotationPoint(1.0F, -19.0F, -2.0F);
		head.cubeList.add(new ModelBox(head, 56, 0, -5.0F, -5.0F, 0.0F, 0, 1, 4, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 56, 0, 4.0F, -8.0F, 0.0F, 0, 1, 4, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 56, 0, -5.0F, -10.0F, 0.0F, 0, 1, 4, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 37, 9, 3.0F, -9.0F, -2.0F, 1, 8, 8, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 56, 0, 4.0F, -3.0F, 0.0F, 0, 1, 4, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 46, 9, -5.0F, -11.0F, -2.0F, 1, 8, 8, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 0, 1.0F, -8.0F, -1.0F, 2, 6, 6, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 0, -4.0F, -10.0F, -1.0F, 2, 6, 6, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 0, 0.0F, -6.0F, 1.0F, 1, 2, 2, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 0, -2.0F, -8.0F, 1.0F, 1, 2, 2, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 28, 0, -1.0F, -10.0F, 1.0F, 1, 11, 2, 0.0F, false));

		bone30 = new ModelRenderer(this);
		bone30.setRotationPoint(4.0F, -3.0F, 4.0F);
		setRotationAngle(bone30, 0.0873F, 0.0F, 0.0F);
		head.addChild(bone30);
		bone30.cubeList.add(new ModelBox(bone30, 60, 0, 0.0F, 0.0F, 0.0F, 0, 1, 2, 0.0F, false));
		bone30.cubeList.add(new ModelBox(bone30, 60, 0, 0.0F, -4.8976F, 0.3448F, 0, 1, 2, 0.0F, false));
		bone30.cubeList.add(new ModelBox(bone30, 62, 0, -9.0F, -1.9962F, 0.0872F, 0, 1, 1, 0.0F, false));
		bone30.cubeList.add(new ModelBox(bone30, 60, 0, -9.0F, -6.9772F, 0.5229F, 0, 1, 2, 0.0F, false));

		bone28 = new ModelRenderer(this);
		bone28.setRotationPoint(-5.0F, -4.0F, -1.0F);
		setRotationAngle(bone28, -0.0873F, 0.0F, 0.0F);
		head.addChild(bone28);
		bone28.cubeList.add(new ModelBox(bone28, 60, 0, 9.0F, -3.9014F, -1.2577F, 0, 1, 2, 0.0F, false));
		bone28.cubeList.add(new ModelBox(bone28, 60, 0, 0.0F, -5.981F, -1.4358F, 0, 1, 2, 0.0F, false));
		bone28.cubeList.add(new ModelBox(bone28, 60, 2, 0.0F, -1.0F, -1.0F, 0, 1, 2, 0.0F, false));
		bone28.cubeList.add(new ModelBox(bone28, 47, 0, 9.0F, 0.9924F, -0.8257F, 0, 1, 2, 0.0F, false));

		bone24 = new ModelRenderer(this);
		bone24.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone28.addChild(bone24);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		legR.render(f5);
		legL.render(f5);
		body.render(f5);
		armR.render(f5);
		armL.render(f5);
		head.render(f5);
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
		this.head.rotateAngleY = MathHelper.cos(limbSwing * 0.6662F) * 0.7F * limbSwingAmount;
	}
}