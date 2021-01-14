package com.sample.mod.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.util.math.MathHelper;

public class ModelCtnCat3 extends ModelBase {
	private final ModelRenderer all;
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer arm1;
	private final ModelRenderer arm2;
	private final ModelRenderer leg1;
	private final ModelRenderer leg2;

	public ModelCtnCat3() {
		textureWidth = 64;
		textureHeight = 64;

		all = new ModelRenderer(this);
		all.setRotationPoint(0.0F, 24.0F, 0.0F);
		setRotationAngle(all, 0.0F, 3.1416F, 0.0F);

		head = new ModelRenderer(this);
		head.setRotationPoint(-1.0F, -33.0F, 0.0F);
		all.addChild(head);
		head.cubeList.add(new ModelBox(head, 0, 0, -1.0F, -1.0F, 0.0F, 3, 2, 3, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 44, -5.0F, -11.0F, -1.0F, 11, 10, 5, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 0, 6.0F, -6.0F, -1.0F, 1, 4, 5, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 0, -6.0F, -6.0F, -1.0F, 1, 4, 5, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 52, 12, 2.0F, -15.0F, 0.0F, 3, 4, 3, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 52, 0, -4.0F, -15.0F, 0.0F, 3, 4, 3, 0.0F, false));

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		all.addChild(body);
		body.cubeList.add(new ModelBox(body, 0, 0, -2.0F, -19.0F, -3.0F, 3, 3, 2, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 30, 25, -5.0F, -30.0F, -1.0F, 9, 13, 5, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 0, -9.0F, -32.0F, -1.0F, 17, 2, 5, 0.0F, false));

		arm1 = new ModelRenderer(this);
		arm1.setRotationPoint(6.0F, -29.0F, 0.0F);
		all.addChild(arm1);
		arm1.cubeList.add(new ModelBox(arm1, 60, 59, 2.0F, 13.0F, -1.0F, 1, 4, 1, 0.0F, false));
		arm1.cubeList.add(new ModelBox(arm1, 59, 58, 2.0F, 13.0F, 1.0F, 1, 4, 1, 0.0F, false));
		arm1.cubeList.add(new ModelBox(arm1, 56, 56, 2.0F, 13.0F, 3.0F, 1, 4, 1, 0.0F, false));
		arm1.cubeList.add(new ModelBox(arm1, 58, 59, -2.0F, 13.0F, 4.0F, 1, 4, 1, 0.0F, false));
		arm1.cubeList.add(new ModelBox(arm1, 46, 57, -2.0F, 11.0F, -1.0F, 5, 2, 6, 0.0F, false));
		arm1.cubeList.add(new ModelBox(arm1, 0, 0, -1.0F, -1.0F, 0.0F, 2, 12, 3, 0.0F, false));

		arm2 = new ModelRenderer(this);
		arm2.setRotationPoint(-7.0F, -29.0F, 0.0F);
		all.addChild(arm2);
		arm2.cubeList.add(new ModelBox(arm2, 0, 0, -1.0F, -1.0F, 0.0F, 2, 12, 3, 0.0F, false));
		arm2.cubeList.add(new ModelBox(arm2, 46, 56, -3.0F, 11.0F, -1.0F, 5, 2, 6, 0.0F, false));
		arm2.cubeList.add(new ModelBox(arm2, 56, 59, 1.0F, 13.0F, 4.0F, 1, 4, 1, 0.0F, false));
		arm2.cubeList.add(new ModelBox(arm2, 56, 58, -3.0F, 13.0F, 3.0F, 1, 4, 1, 0.0F, false));
		arm2.cubeList.add(new ModelBox(arm2, 60, 59, -3.0F, 13.0F, 1.0F, 1, 4, 1, 0.0F, false));
		arm2.cubeList.add(new ModelBox(arm2, 57, 56, -3.0F, 13.0F, -1.0F, 1, 4, 1, 0.0F, false));

		leg1 = new ModelRenderer(this);
		leg1.setRotationPoint(2.0F, -16.0F, 1.0F);
		all.addChild(leg1);
		leg1.cubeList.add(new ModelBox(leg1, 0, 0, -1.0F, -1.0F, -1.0F, 3, 17, 3, 0.0F, false));

		leg2 = new ModelRenderer(this);
		leg2.setRotationPoint(-3.0F, -16.0F, 1.0F);
		all.addChild(leg2);
		leg2.cubeList.add(new ModelBox(leg2, 0, 0, -2.0F, -1.0F, -1.0F, 3, 17, 3, 0.0F, false));
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