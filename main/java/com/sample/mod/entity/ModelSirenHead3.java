package com.sample.mod.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.util.math.MathHelper;

public class ModelSirenHead3 extends ModelBase {
	private final ModelRenderer all;
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer arm1;
	private final ModelRenderer arm2;
	private final ModelRenderer leg1;
	private final ModelRenderer leg2;

	public ModelSirenHead3() {
		textureWidth = 64;
		textureHeight = 64;

		all = new ModelRenderer(this);
		all.setRotationPoint(0.0F, 24.0F, 0.0F);
		setRotationAngle(all, 0.0F, 3.1416F, 0.0F);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -48.0F, -4.0F);
		all.addChild(head);
		head.cubeList.add(new ModelBox(head, 0, 46, -6.0F, -8.0F, -4.0F, 1, 9, 9, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 6, 29, -1.0F, -11.0F, -1.0F, 2, 13, 2, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 52, 23, -3.0F, -5.0F, -2.0F, 2, 3, 4, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 25, 21, 6.0F, -11.0F, -4.0F, 1, 1, 8, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 20, -7.0F, -8.0F, -3.0F, 1, 1, 7, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 48, 21, 1.0F, -8.0F, -2.0F, 2, 3, 4, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 50, 20, 3.0F, -9.0F, -3.0F, 1, 5, 6, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 46, 15, 4.0F, -10.0F, -4.0F, 1, 7, 8, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 10, 5.0F, -11.0F, -5.0F, 1, 9, 10, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 1, 18, -7.0F, -8.0F, 4.0F, 1, 9, 1, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 48, 16, -5.0F, -7.0F, -3.0F, 1, 7, 7, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 20, -7.0F, -8.0F, -4.0F, 1, 8, 1, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 50, 20, -4.0F, -6.0F, -2.0F, 1, 5, 5, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 19, 6.0F, -11.0F, 4.0F, 1, 9, 1, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 19, 6.0F, -11.0F, -5.0F, 1, 9, 1, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 14, 10, 6.0F, -3.0F, -4.0F, 1, 1, 8, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 20, -7.0F, 0.0F, -4.0F, 1, 1, 8, 0.0F, false));

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		all.addChild(body);
		body.cubeList.add(new ModelBox(body, 0, 0, -5.0F, -26.0F, -7.0F, 10, 3, 5, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 42, 0, -3.0F, -33.0F, -7.0F, 6, 7, 5, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 26, 31, -5.0F, -46.0F, -9.0F, 10, 13, 9, 0.0F, false));

		arm1 = new ModelRenderer(this);
		arm1.setRotationPoint(7.0F, -43.0F, -4.0F);
		all.addChild(arm1);
		arm1.cubeList.add(new ModelBox(arm1, 46, 13, -1.0F, 1.0F, -3.0F, 2, 18, 5, 0.0F, false));
		arm1.cubeList.add(new ModelBox(arm1, 48, 20, -2.0F, 19.0F, -4.0F, 1, 6, 7, 0.0F, false));
		arm1.cubeList.add(new ModelBox(arm1, 46, 19, -1.0F, 25.0F, -4.0F, 2, 1, 7, 0.0F, false));
		arm1.cubeList.add(new ModelBox(arm1, 50, 22, -2.0F, 26.0F, -3.0F, 4, 2, 5, 0.0F, false));
		arm1.cubeList.add(new ModelBox(arm1, 0, 0, -1.0F, 27.0F, 2.0F, 1, 4, 1, 0.0F, false));
		arm1.cubeList.add(new ModelBox(arm1, 60, 23, 2.0F, 27.0F, 1.0F, 1, 5, 1, 0.0F, false));
		arm1.cubeList.add(new ModelBox(arm1, 60, 20, 2.0F, 27.0F, -1.0F, 1, 5, 1, 0.0F, false));
		arm1.cubeList.add(new ModelBox(arm1, 60, 30, 2.0F, 27.0F, -3.0F, 1, 5, 1, 0.0F, false));
		arm1.cubeList.add(new ModelBox(arm1, 48, 23, 1.0F, 19.0F, -4.0F, 1, 6, 7, 0.0F, false));
		arm1.cubeList.add(new ModelBox(arm1, 40, 14, -2.0F, -3.0F, -5.0F, 3, 4, 9, 0.0F, false));

		arm2 = new ModelRenderer(this);
		arm2.setRotationPoint(-7.0F, -43.0F, -4.0F);
		all.addChild(arm2);
		arm2.cubeList.add(new ModelBox(arm2, 40, 14, -1.0F, -3.0F, -5.0F, 3, 4, 9, 0.0F, false));
		arm2.cubeList.add(new ModelBox(arm2, 46, 14, -1.0F, 1.0F, -3.0F, 2, 18, 5, 0.0F, false));
		arm2.cubeList.add(new ModelBox(arm2, 48, 23, -2.0F, 19.0F, -4.0F, 1, 6, 7, 0.0F, false));
		arm2.cubeList.add(new ModelBox(arm2, 48, 25, 1.0F, 19.0F, -4.0F, 1, 6, 7, 0.0F, false));
		arm2.cubeList.add(new ModelBox(arm2, 46, 20, -1.0F, 25.0F, -4.0F, 2, 1, 7, 0.0F, false));
		arm2.cubeList.add(new ModelBox(arm2, 49, 21, -2.0F, 26.0F, -3.0F, 4, 2, 5, 0.0F, false));
		arm2.cubeList.add(new ModelBox(arm2, 60, 27, 0.0F, 27.0F, 2.0F, 1, 4, 1, 0.0F, false));
		arm2.cubeList.add(new ModelBox(arm2, 59, 19, -3.0F, 27.0F, 1.0F, 1, 5, 1, 0.0F, false));
		arm2.cubeList.add(new ModelBox(arm2, 60, 20, -3.0F, 27.0F, -1.0F, 1, 5, 1, 0.0F, false));
		arm2.cubeList.add(new ModelBox(arm2, 59, 20, -3.0F, 27.0F, -3.0F, 1, 5, 1, 0.0F, false));

		leg1 = new ModelRenderer(this);
		leg1.setRotationPoint(4.0F, -22.0F, -3.0F);
		all.addChild(leg1);
		leg1.cubeList.add(new ModelBox(leg1, 52, 17, 1.0F, 10.0F, -4.0F, 1, 10, 5, 0.0F, false));
		leg1.cubeList.add(new ModelBox(leg1, 44, 23, -3.0F, 20.0F, -4.0F, 5, 1, 5, 0.0F, false));
		leg1.cubeList.add(new ModelBox(leg1, 50, 24, -3.0F, 21.0F, 3.0F, 1, 1, 6, 0.0F, false));
		leg1.cubeList.add(new ModelBox(leg1, 40, 14, -3.0F, 21.0F, -4.0F, 5, 1, 7, 0.0F, false));
		leg1.cubeList.add(new ModelBox(leg1, 48, 21, -1.0F, 21.0F, 3.0F, 1, 1, 6, 0.0F, false));
		leg1.cubeList.add(new ModelBox(leg1, 50, 21, 1.0F, 21.0F, 3.0F, 1, 1, 6, 0.0F, false));
		leg1.cubeList.add(new ModelBox(leg1, 0, 30, -2.0F, -1.0F, -4.0F, 3, 11, 5, 0.0F, false));
		leg1.cubeList.add(new ModelBox(leg1, 52, 17, -3.0F, 10.0F, -4.0F, 1, 10, 5, 0.0F, false));

		leg2 = new ModelRenderer(this);
		leg2.setRotationPoint(-4.0F, -22.0F, -5.0F);
		all.addChild(leg2);
		leg2.cubeList.add(new ModelBox(leg2, 0, 29, -1.0F, -1.0F, -2.0F, 3, 11, 5, 0.0F, false));
		leg2.cubeList.add(new ModelBox(leg2, 52, 23, -2.0F, 10.0F, -2.0F, 1, 10, 5, 0.0F, false));
		leg2.cubeList.add(new ModelBox(leg2, 49, 16, 2.0F, 10.0F, -2.0F, 1, 10, 5, 0.0F, false));
		leg2.cubeList.add(new ModelBox(leg2, 44, 21, -2.0F, 20.0F, -2.0F, 5, 1, 5, 0.0F, false));
		leg2.cubeList.add(new ModelBox(leg2, 40, 13, -2.0F, 21.0F, -2.0F, 5, 1, 7, 0.0F, false));
		leg2.cubeList.add(new ModelBox(leg2, 50, 18, -2.0F, 21.0F, 5.0F, 1, 1, 6, 0.0F, false));
		leg2.cubeList.add(new ModelBox(leg2, 50, 18, 0.0F, 21.0F, 5.0F, 1, 1, 6, 0.0F, false));
		leg2.cubeList.add(new ModelBox(leg2, 50, 17, 2.0F, 21.0F, 5.0F, 1, 1, 6, 0.0F, false));
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
		this.arm1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
		this.arm2.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
		this.leg1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
		this.leg2.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
		this.head.rotateAngleY = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
	}
}