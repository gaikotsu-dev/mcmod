package com.sample.mod.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.util.math.MathHelper;

public class ModelCat extends ModelBase {
	private final ModelRenderer all;
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer arm1;
	private final ModelRenderer arm2;
	private final ModelRenderer leg1;
	private final ModelRenderer leg2;

	public ModelCat() {
		textureWidth = 32;
		textureHeight = 32;

		all = new ModelRenderer(this);
		all.setRotationPoint(0.0F, 24.0F, 0.0F);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -14.0F, 0.0F);
		all.addChild(head);
		head.cubeList.add(new ModelBox(head, 0, 0, 1.0F, -8.0F, -1.0F, 2, 2, 2, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 0, 3.0F, -3.0F, -3.0F, 1, 2, 6, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 14, -3.0F, -6.0F, -3.0F, 6, 6, 6, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 0, -4.0F, -3.0F, -3.0F, 1, 2, 6, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 0, -3.0F, -8.0F, -1.0F, 2, 2, 2, 0.0F, false));

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, -11.0F, 0.0F);
		all.addChild(body);
		body.cubeList.add(new ModelBox(body, 0, 0, -1.0F, 4.0F, 1.0F, 2, 2, 2, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 0, -2.0F, -3.0F, -2.0F, 4, 6, 4, 0.0F, false));

		arm1 = new ModelRenderer(this);
		arm1.setRotationPoint(-3.0F, -12.0F, 0.0F);
		all.addChild(arm1);
		arm1.cubeList.add(new ModelBox(arm1, 20, 27, -1.0F, 4.0F, -2.0F, 2, 1, 4, 0.0F, false));
		arm1.cubeList.add(new ModelBox(arm1, 28, 28, 0.0F, 4.0F, -3.0F, 1, 3, 1, 0.0F, false));
		arm1.cubeList.add(new ModelBox(arm1, 28, 29, -1.0F, 5.0F, 0.0F, 1, 2, 1, 0.0F, false));
		arm1.cubeList.add(new ModelBox(arm1, 28, 29, -1.0F, 5.0F, -2.0F, 1, 2, 1, 0.0F, false));
		arm1.cubeList.add(new ModelBox(arm1, 28, 28, 0.0F, 5.0F, -1.0F, 1, 2, 1, 0.0F, false));
		arm1.cubeList.add(new ModelBox(arm1, 26, 1, 0.0F, -1.0F, -1.0F, 1, 5, 2, 0.0F, false));

		arm2 = new ModelRenderer(this);
		arm2.setRotationPoint(3.0F, -12.0F, 0.0F);
		all.addChild(arm2);
		arm2.cubeList.add(new ModelBox(arm2, 28, 28, -1.0F, 4.0F, -3.0F, 1, 3, 1, 0.0F, false));
		arm2.cubeList.add(new ModelBox(arm2, 28, 29, 0.0F, 5.0F, -2.0F, 1, 2, 1, 0.0F, false));
		arm2.cubeList.add(new ModelBox(arm2, 20, 27, -1.0F, 4.0F, -2.0F, 2, 1, 4, 0.0F, false));
		arm2.cubeList.add(new ModelBox(arm2, 28, 29, -1.0F, 5.0F, -1.0F, 1, 2, 1, 0.0F, false));
		arm2.cubeList.add(new ModelBox(arm2, 28, 29, 0.0F, 5.0F, 0.0F, 1, 2, 1, 0.0F, false));
		arm2.cubeList.add(new ModelBox(arm2, 26, 5, -1.0F, -1.0F, -1.0F, 1, 5, 2, 0.0F, false));

		leg1 = new ModelRenderer(this);
		leg1.setRotationPoint(-1.0F, -7.0F, 0.0F);
		all.addChild(leg1);
		leg1.cubeList.add(new ModelBox(leg1, 0, 0, -1.0F, -1.0F, -1.0F, 2, 8, 2, 0.0F, false));

		leg2 = new ModelRenderer(this);
		leg2.setRotationPoint(1.0F, -7.0F, 0.0F);
		all.addChild(leg2);
		leg2.cubeList.add(new ModelBox(leg2, 0, 0, -1.0F, -1.0F, -1.0F, 2, 8, 2, 0.0F, false));
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		all.render(f5);
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