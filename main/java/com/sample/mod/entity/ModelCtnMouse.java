package com.sample.mod.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.util.math.MathHelper;

public class ModelCtnMouse extends ModelBase {
	private final ModelRenderer armR;
	private final ModelRenderer e;
	private final ModelRenderer bone13;
	private final ModelRenderer bone21;
	private final ModelRenderer bone22;
	private final ModelRenderer armL;
	private final ModelRenderer w;
	private final ModelRenderer bone19;
	private final ModelRenderer bone18;
	private final ModelRenderer bone16;
	private final ModelRenderer bone17;
	private final ModelRenderer head;
	private final ModelRenderer bone11;
	private final ModelRenderer bone12;
	private final ModelRenderer bone20;
	private final ModelRenderer legL;
	private final ModelRenderer bone2;
	private final ModelRenderer body;
	private final ModelRenderer bone7;
	private final ModelRenderer bone5;
	private final ModelRenderer bone9;
	private final ModelRenderer bone8;
	private final ModelRenderer legR;
	private final ModelRenderer bone;

	public ModelCtnMouse() {
		textureWidth = 64;
		textureHeight = 64;

		armR = new ModelRenderer(this);
		armR.setRotationPoint(-3.0F, 3.0F, 1.0F);

		e = new ModelRenderer(this);
		e.setRotationPoint(0.0F, 13.0F, 0.0F);
		armR.addChild(e);
		e.cubeList.add(new ModelBox(e, 0, 60, -5.0F, -5.0F, -2.0F, 3, 1, 3, 0.0F, false));
		e.cubeList.add(new ModelBox(e, 1, 60, -4.0F, -5.0F, -5.0F, 1, 1, 3, 0.0F, false));

		bone13 = new ModelRenderer(this);
		bone13.setRotationPoint(0.0F, -14.0F, 0.0F);
		setRotationAngle(bone13, 0.0F, 0.0F, 0.4363F);
		e.addChild(bone13);
		bone13.cubeList.add(new ModelBox(bone13, 28, 32, 0.0F, 0.0F, -1.0F, 1, 10, 2, 0.0F, false));

		bone21 = new ModelRenderer(this);
		bone21.setRotationPoint(0.0F, 0.0F, -1.0F);
		setRotationAngle(bone21, 0.0F, 0.3491F, 0.0F);
		e.addChild(bone21);
		bone21.cubeList.add(new ModelBox(bone21, 2, 60, -5.0F, -5.0F, -5.0F, 1, 1, 3, 0.0F, false));

		bone22 = new ModelRenderer(this);
		bone22.setRotationPoint(-1.0F, 0.0F, 1.0F);
		setRotationAngle(bone22, 0.0F, -0.3491F, 0.0F);
		e.addChild(bone22);
		bone22.cubeList.add(new ModelBox(bone22, 0, 60, -2.0F, -5.0F, -5.0F, 1, 1, 3, 0.0F, false));

		armL = new ModelRenderer(this);
		armL.setRotationPoint(3.0F, 3.0F, 1.0F);

		w = new ModelRenderer(this);
		w.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(w, 0.0F, 0.0F, -0.4363F);
		armL.addChild(w);
		w.cubeList.add(new ModelBox(w, 10, 25, -1.0F, -1.0F, -1.0F, 1, 13, 2, 0.0F, false));

		bone19 = new ModelRenderer(this);
		bone19.setRotationPoint(-7.0F, 14.0F, -2.0F);
		setRotationAngle(bone19, 0.0F, -0.4363F, 0.4363F);
		w.addChild(bone19);
		bone19.cubeList.add(new ModelBox(bone19, 1, 60, 5.4246F, -5.1F, -5.8126F, 1, 1, 3, 0.0F, false));

		bone18 = new ModelRenderer(this);
		bone18.setRotationPoint(-7.4837F, 11.6711F, 0.0F);
		setRotationAngle(bone18, 0.0F, 0.0F, 0.4363F);
		w.addChild(bone18);
		bone18.cubeList.add(new ModelBox(bone18, 0, 60, 6.1283F, -3.0895F, -5.0F, 1, 1, 3, 0.0F, false));

		bone16 = new ModelRenderer(this);
		bone16.setRotationPoint(-4.0F, 13.0F, 0.0F);
		setRotationAngle(bone16, 0.0F, 0.0F, 0.4363F);
		w.addChild(bone16);
		bone16.cubeList.add(new ModelBox(bone16, 0, 60, 1.0F, -2.8411F, -2.0F, 3, 1, 3, 0.0F, false));

		bone17 = new ModelRenderer(this);
		bone17.setRotationPoint(-6.0937F, 13.4226F, 1.0F);
		setRotationAngle(bone17, 0.0F, 0.2618F, 0.4363F);
		w.addChild(bone17);
		bone17.cubeList.add(new ModelBox(bone17, 2, 60, 2.8931F, -4.0285F, -5.0F, 1, 1, 3, 0.0F, false));

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 2.0F, 1.0F);
		head.cubeList.add(new ModelBox(head, 55, 41, -1.0F, -2.0F, -1.0F, 2, 2, 2, 0.0F, false));

		bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.addChild(bone11);

		bone12 = new ModelRenderer(this);
		bone12.setRotationPoint(0.0F, -2.0F, 0.0F);
		bone11.addChild(bone12);
		bone12.cubeList.add(new ModelBox(bone12, 0, 0, -3.0F, -5.0F, -3.0F, 6, 5, 5, 0.0F, false));

		bone20 = new ModelRenderer(this);
		bone20.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.addChild(bone20);
		bone20.cubeList.add(new ModelBox(bone20, 0, 0, -6.0F, -10.0F, 0.0F, 4, 4, 1, 0.0F, false));
		bone20.cubeList.add(new ModelBox(bone20, 0, 0, 2.0F, -10.0F, 0.0F, 4, 4, 1, 0.0F, false));

		legL = new ModelRenderer(this);
		legL.setRotationPoint(3.0F, 11.0F, 1.0F);
		legL.cubeList.add(new ModelBox(legL, 27, 24, -1.0F, -1.0F, -1.0F, 2, 6, 2, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, 5.0F, 0.0F);
		setRotationAngle(bone2, 0.1745F, 0.0F, 0.0F);
		legL.addChild(bone2);
		bone2.cubeList.add(new ModelBox(bone2, 37, 33, -1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F, false));

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 22.0F, 1.0F);
		body.cubeList.add(new ModelBox(body, 19, 28, -3.0F, -20.0F, -1.0F, 6, 4, 2, 0.0F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(-2.0F, -17.0F, 0.0F);
		setRotationAngle(bone7, 0.0F, 0.0F, -0.1745F);
		body.addChild(bone7);
		bone7.cubeList.add(new ModelBox(bone7, 31, 27, -1.0F, 0.0F, -1.0F, 1, 4, 2, 0.0F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(-3.0F, -6.0F, 0.0F);
		body.addChild(bone5);
		bone5.cubeList.add(new ModelBox(bone5, 34, 38, 1.0F, -13.9088F, -0.9581F, 4, 9, 1, 0.0F, false));

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(bone9);

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(2.0F, -17.0F, 0.0F);
		setRotationAngle(bone8, 0.0F, 0.0F, 0.0873F);
		body.addChild(bone8);
		bone8.cubeList.add(new ModelBox(bone8, 38, 38, 0.0F, 0.0F, -1.0F, 1, 4, 2, 0.0F, false));

		legR = new ModelRenderer(this);
		legR.setRotationPoint(-3.0F, 11.0F, 1.0F);
		legR.cubeList.add(new ModelBox(legR, 10, 26, -1.0F, -1.0F, -1.0F, 2, 6, 2, 0.0F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 5.0F, 0.0F);
		setRotationAngle(bone, 0.1745F, 0.0F, 0.0F);
		legR.addChild(bone);
		bone.cubeList.add(new ModelBox(bone, 39, 32, -1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		armR.render(f5);
		armL.render(f5);
		head.render(f5);
		legL.render(f5);
		body.render(f5);
		legR.render(f5);
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