package com.sample.mod.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.util.math.MathHelper;

public class ModelCtnCat2 extends ModelBase {
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer arm1;
	private final ModelRenderer arm2;
	private final ModelRenderer leg1;
	private final ModelRenderer leg2;

	public ModelCtnCat2() {
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.cubeList.add(new ModelBox(head, 38, 57, -5.0F, -5.0F, -1.0F, 10, 4, 3, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 59, -4.0F, -7.0F, -1.0F, 8, 2, 3, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 42, 34, -4.0F, -1.0F, -1.0F, 8, 1, 3, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 54, 38, 1.0F, -10.0F, -1.0F, 2, 3, 3, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 28, -3.0F, -10.0F, -1.0F, 2, 3, 3, 0.0F, false));

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 7.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 28, 10, -3.0F, -4.0F, -1.0F, 6, 8, 3, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 0, -7.0F, -6.0F, -1.0F, 14, 2, 3, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 0, -1.0F, -7.0F, -1.0F, 2, 1, 3, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 8, -2.0F, 2.0F, -2.0F, 4, 2, 1, 0.0F, false));

		arm1 = new ModelRenderer(this);
		arm1.setRotationPoint(6.0F, 4.0F, 0.0F);
		arm1.cubeList.add(new ModelBox(arm1, 0, 0, -1.0F, -1.0F, -1.0F, 2, 9, 3, 0.0F, false));
		arm1.cubeList.add(new ModelBox(arm1, 46, 0, -2.0F, 8.0F, -2.0F, 4, 2, 5, 0.0F, false));
		arm1.cubeList.add(new ModelBox(arm1, 60, 0, -1.0F, 10.0F, 3.0F, 1, 3, 1, 0.0F, false));
		arm1.cubeList.add(new ModelBox(arm1, 60, 0, 2.0F, 10.0F, 2.0F, 1, 4, 1, 0.0F, false));
		arm1.cubeList.add(new ModelBox(arm1, 60, 0, 2.0F, 10.0F, -2.0F, 1, 4, 1, 0.0F, false));
		arm1.cubeList.add(new ModelBox(arm1, 60, 0, 2.0F, 10.0F, 0.0F, 1, 4, 1, 0.0F, false));

		arm2 = new ModelRenderer(this);
		arm2.setRotationPoint(-6.0F, 4.0F, 0.0F);
		arm2.cubeList.add(new ModelBox(arm2, 0, 0, -1.0F, -1.0F, -1.0F, 2, 9, 3, 0.0F, false));
		arm2.cubeList.add(new ModelBox(arm2, 46, 0, -2.0F, 8.0F, -2.0F, 4, 2, 5, 0.0F, false));
		arm2.cubeList.add(new ModelBox(arm2, 60, 0, -3.0F, 10.0F, 2.0F, 1, 4, 1, 0.0F, false));
		arm2.cubeList.add(new ModelBox(arm2, 60, 0, 0.0F, 10.0F, 3.0F, 1, 3, 1, 0.0F, false));
		arm2.cubeList.add(new ModelBox(arm2, 60, 0, -3.0F, 10.0F, 0.0F, 1, 4, 1, 0.0F, false));
		arm2.cubeList.add(new ModelBox(arm2, 60, 0, -3.0F, 10.0F, -2.0F, 1, 4, 1, 0.0F, false));

		leg1 = new ModelRenderer(this);
		leg1.setRotationPoint(1.0F, 12.0F, 0.0F);
		leg1.cubeList.add(new ModelBox(leg1, 0, 0, -1.0F, -1.0F, -1.0F, 2, 13, 3, 0.0F, false));

		leg2 = new ModelRenderer(this);
		leg2.setRotationPoint(-1.0F, 12.0F, 0.0F);
		leg2.cubeList.add(new ModelBox(leg2, 0, 0, -1.0F, -1.0F, -1.0F, 2, 13, 3, 0.0F, false));
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		head.render(f5);
		body.render(f5);
		arm1.render(f5);
		arm2.render(f5);
		leg1.render(f5);
		leg2.render(f5);
	}

	public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
							  float headPitch, float scaleFactor, Entity entityIn)
	{
		this.arm1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
		this.arm2.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
		this.leg1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
		this.leg2.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
	}
}