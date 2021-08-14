package com.sample.mod.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.util.math.MathHelper;

public class ModelCtnMouseA extends ModelBase {
	private final ModelRenderer legL;
	private final ModelRenderer legR;
	private final ModelRenderer armR;
	private final ModelRenderer bone3;
	private final ModelRenderer bone5;
	private final ModelRenderer bone6;
	private final ModelRenderer armL;
	private final ModelRenderer bone4;
	private final ModelRenderer bone7;
	private final ModelRenderer bone8;
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer bone;
	private final ModelRenderer bone2;
	private final ModelRenderer bone15;
	private final ModelRenderer bone16;

	public ModelCtnMouseA() {
		textureWidth = 64;
		textureHeight = 64;

		legL = new ModelRenderer(this);
		legL.setRotationPoint(1.0F, 11.0F, 1.0F);
		legL.cubeList.add(new ModelBox(legL, 0, 0, -1.0F, -1.0F, -1.0F, 2, 14, 2, 0.0F, false));

		legR = new ModelRenderer(this);
		legR.setRotationPoint(-3.0F, 11.0F, 1.0F);
		legR.cubeList.add(new ModelBox(legR, 0, 0, -1.0F, -1.0F, -1.0F, 2, 14, 2, 0.0F, false));

		armR = new ModelRenderer(this);
		armR.setRotationPoint(-5.0F, 3.0F, 1.0F);
		armR.cubeList.add(new ModelBox(armR, 48, 59, -3.0F, 12.0F, -2.0F, 3, 1, 3, 0.0F, false));
		armR.cubeList.add(new ModelBox(armR, 60, 59, -2.0F, 12.0F, -3.0F, 1, 4, 1, 0.0F, false));
		armR.cubeList.add(new ModelBox(armR, 60, 59, -4.0F, 12.0F, -1.0F, 1, 4, 1, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(1.0F, -1.0F, 0.0F);
		setRotationAngle(bone3, 0.0F, 0.0F, 0.1745F);
		armR.addChild(bone3);
		bone3.cubeList.add(new ModelBox(bone3, 0, 0, -1.0F, 0.0F, -1.0F, 1, 14, 1, 0.0F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(-4.0F, 13.0F, -2.0F);
		setRotationAngle(bone5, -0.2618F, 0.0F, 0.0F);
		armR.addChild(bone5);
		bone5.cubeList.add(new ModelBox(bone5, 60, 59, 0.0F, -1.0F, 0.0F, 1, 4, 1, 0.0F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(-4.0F, 13.0F, 0.0F);
		setRotationAngle(bone6, 0.2618F, 0.0F, 0.0F);
		armR.addChild(bone6);
		bone6.cubeList.add(new ModelBox(bone6, 60, 59, 0.0F, -1.0F, 0.0F, 1, 4, 1, 0.0F, false));

		armL = new ModelRenderer(this);
		armL.setRotationPoint(3.0F, 3.0F, 1.0F);
		armL.cubeList.add(new ModelBox(armL, 48, 59, 0.0F, 12.0F, -2.0F, 3, 1, 3, 0.0F, false));
		armL.cubeList.add(new ModelBox(armL, 60, 59, 3.0F, 12.0F, -1.0F, 1, 4, 1, 0.0F, false));
		armL.cubeList.add(new ModelBox(armL, 60, 59, 1.0F, 12.0F, -3.0F, 1, 4, 1, 0.0F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(-1.0F, -1.0F, 0.0F);
		setRotationAngle(bone4, 0.0F, 0.0F, -0.1745F);
		armL.addChild(bone4);
		bone4.cubeList.add(new ModelBox(bone4, 0, 0, 0.0F, 0.0F, -1.0F, 1, 14, 1, 0.0F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(4.0F, 13.0F, 0.0F);
		setRotationAngle(bone7, 0.2618F, 0.0F, 0.0F);
		armL.addChild(bone7);
		bone7.cubeList.add(new ModelBox(bone7, 60, 59, -1.0F, -1.0F, 0.0F, 1, 4, 1, 0.0F, false));

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(5.0F, 14.0F, -2.0F);
		setRotationAngle(bone8, -0.2618F, 0.0F, 0.0F);
		armL.addChild(bone8);
		bone8.cubeList.add(new ModelBox(bone8, 60, 59, -2.0F, -2.0F, 0.0F, 1, 4, 1, 0.0F, false));

		head = new ModelRenderer(this);
		head.setRotationPoint(-1.0F, 2.0F, 1.0F);
		head.cubeList.add(new ModelBox(head, 0, 0, -1.0F, -2.0F, -1.0F, 2, 2, 2, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 44, 0, -3.0F, -4.0F, -2.0F, 6, 2, 4, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 48, 38, -2.0F, -7.0F, -2.0F, 4, 3, 4, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 42, -3.0F, -10.0F, -2.0F, 6, 3, 4, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 0, -5.0F, -12.0F, -1.0F, 3, 3, 1, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 0, 2.0F, -12.0F, -1.0F, 3, 3, 1, 0.0F, false));

		body = new ModelRenderer(this);
		body.setRotationPoint(-1.0F, 4.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 0, 0, -2.0F, -1.0F, 0.0F, 4, 8, 2, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 0, -3.0F, -2.0F, 0.0F, 6, 5, 2, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 0, 2.0F, -2.0F, 0.0F, 7, 1, 2, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 0, -9.0F, -8.0F, 0.0F, 1, 6, 2, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 0, -9.0F, -2.0F, 0.0F, 7, 1, 2, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 0, 8.0F, -8.0F, 0.0F, 1, 6, 2, 0.0F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(2.0F, 5.0F, 2.0F);
		setRotationAngle(bone, 0.0F, 0.0F, 0.3491F);
		body.addChild(bone);
		bone.cubeList.add(new ModelBox(bone, 0, 0, -1.0F, -2.0F, -2.0F, 1, 3, 2, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(-1.0F, 5.0F, 0.0F);
		setRotationAngle(bone2, 0.0F, 0.0F, -0.3491F);
		body.addChild(bone2);
		bone2.cubeList.add(new ModelBox(bone2, 0, 0, -1.0F, -3.0F, 0.0F, 1, 4, 2, 0.0F, false));

		bone15 = new ModelRenderer(this);
		bone15.setRotationPoint(-9.0F, -7.0F, 0.0F);
		setRotationAngle(bone15, 0.0F, 0.0F, -0.2618F);
		body.addChild(bone15);
		bone15.cubeList.add(new ModelBox(bone15, 0, 0, -7.0F, -1.0F, 0.0F, 7, 1, 2, 0.0F, false));

		bone16 = new ModelRenderer(this);
		bone16.setRotationPoint(10.0F, -7.0F, 0.0F);
		setRotationAngle(bone16, 0.0F, 0.0F, 0.2618F);
		body.addChild(bone16);
		bone16.cubeList.add(new ModelBox(bone16, 0, 0, -1.0F, -1.0F, 0.0F, 7, 1, 2, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		legL.render(f5);
		legR.render(f5);
		armR.render(f5);
		armL.render(f5);
		head.render(f5);
		body.render(f5);
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