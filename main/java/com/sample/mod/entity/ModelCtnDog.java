package com.sample.mod.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.util.math.MathHelper;

public class ModelCtnDog extends ModelBase {
	private final ModelRenderer all;
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer arm1;
	private final ModelRenderer arm2;
	private final ModelRenderer leg1;
	private final ModelRenderer leg2;

	public ModelCtnDog() {
		textureWidth = 32;
		textureHeight = 32;

		all = new ModelRenderer(this);
		all.setRotationPoint(-3.0F, 11.0F, 0.0F);

		head = new ModelRenderer(this);
		head.setRotationPoint(3.0F, -4.0F, 0.0F);
		all.addChild(head);
		head.cubeList.add(new ModelBox(head, 24, 0, -7.0F, -5.0F, 0.0F, 1, 1, 3, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 5, 17, -3.0F, -5.0F, 0.0F, 1, 1, 3, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 7, -2.0F, -7.0F, 0.0F, 5, 3, 3, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 0, -6.0F, -3.0F, 0.0F, 9, 3, 3, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 27, -5.0F, -8.0F, 0.0F, 3, 1, 3, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 28, 3.0F, -8.0F, 0.0F, 4, 1, 3, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 17, -6.0F, -4.0F, 0.0F, 9, 1, 3, 0.0F, false));

		body = new ModelRenderer(this);
		body.setRotationPoint(3.0F, 0.0F, 0.0F);
		all.addChild(body);
		body.cubeList.add(new ModelBox(body, 0, 24, -2.0F, -3.0F, 0.0F, 5, 5, 3, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 24, -4.0F, -4.0F, 0.0F, 8, 1, 3, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 24, -3.0F, 0.0F, 0.0F, 1, 5, 3, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 24, -2.0F, 2.0F, 0.0F, 4, 3, 3, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 24, -5.0F, 5.0F, 0.0F, 9, 2, 3, 0.0F, false));

		arm1 = new ModelRenderer(this);
		arm1.setRotationPoint(-1.0F, -3.0F, 0.0F);
		all.addChild(arm1);
		arm1.cubeList.add(new ModelBox(arm1, 0, 28, -8.0F, 4.0F, 0.0F, 7, 1, 3, 0.0F, false));
		arm1.cubeList.add(new ModelBox(arm1, 0, 23, -1.0F, -1.0F, 0.0F, 1, 5, 3, 0.0F, false));

		arm2 = new ModelRenderer(this);
		arm2.setRotationPoint(7.0F, -3.0F, 0.0F);
		all.addChild(arm2);
		arm2.cubeList.add(new ModelBox(arm2, 0, 27, 1.0F, 4.0F, 0.0F, 7, 1, 3, 0.0F, false));
		arm2.cubeList.add(new ModelBox(arm2, 0, 24, 0.0F, -1.0F, 0.0F, 1, 5, 3, 0.0F, false));

		leg1 = new ModelRenderer(this);
		leg1.setRotationPoint(-1.0F, 5.0F, 0.0F);
		all.addChild(leg1);
		leg1.cubeList.add(new ModelBox(leg1, 26, 12, 2.0F, 7.0F, 7.0F, 1, 1, 2, 0.0F, false));
		leg1.cubeList.add(new ModelBox(leg1, 23, 11, -1.0F, 7.0F, 7.0F, 2, 1, 2, 0.0F, false));
		leg1.cubeList.add(new ModelBox(leg1, 26, 14, -3.0F, 7.0F, 7.0F, 1, 1, 2, 0.0F, false));
		leg1.cubeList.add(new ModelBox(leg1, 14, 13, -2.0F, 7.0F, 2.0F, 4, 1, 5, 0.0F, false));
		leg1.cubeList.add(new ModelBox(leg1, 11, 23, -1.0F, 0.0F, 3.0F, 2, 7, 2, 0.0F, false));

		leg2 = new ModelRenderer(this);
		leg2.setRotationPoint(6.0F, 5.0F, 0.0F);
		all.addChild(leg2);
		leg2.cubeList.add(new ModelBox(leg2, 8, 23, -1.0F, 0.0F, -2.0F, 2, 7, 2, 0.0F, false));
		leg2.cubeList.add(new ModelBox(leg2, 24, 15, -3.0F, 7.0F, -6.0F, 1, 1, 2, 0.0F, false));
		leg2.cubeList.add(new ModelBox(leg2, 24, 15, -1.0F, 7.0F, -6.0F, 2, 1, 2, 0.0F, false));
		leg2.cubeList.add(new ModelBox(leg2, 22, 13, 2.0F, 7.0F, -6.0F, 1, 1, 2, 0.0F, false));
		leg2.cubeList.add(new ModelBox(leg2, 14, 14, -2.0F, 7.0F, -4.0F, 4, 1, 5, 0.0F, false));
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
	}
}