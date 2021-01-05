package com.sample.mod.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.util.math.MathHelper;

public class ModelCstmMan2 extends ModelBase {
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer arm1;
	private final ModelRenderer arm2;
	private final ModelRenderer leg1;
	private final ModelRenderer leg2;

	public ModelCstmMan2() {
		textureWidth = 32;
		textureHeight = 32;

		head = new ModelRenderer(this);
		head.setRotationPoint(1.0F, 13.0F, 0.0F);
		head.cubeList.add(new ModelBox(head, 12, 23, -4.0F, -7.0F, -1.0F, 8, 7, 2, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 0, -2.0F, -8.0F, -1.0F, 4, 1, 2, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 0, 2.0F, -10.0F, -1.0F, 1, 3, 2, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 0, 4.0F, -11.0F, -1.0F, 3, 3, 2, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 0, 3.0F, -10.0F, -1.0F, 2, 1, 2, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 0, -3.0F, -10.0F, -1.0F, 1, 3, 2, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 0, -5.0F, -10.0F, -1.0F, 2, 1, 2, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 0, -7.0F, -11.0F, -1.0F, 3, 3, 2, 0.0F, false));

		body = new ModelRenderer(this);
		body.setRotationPoint(4.0F, 24.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 0, 0, -7.0F, -11.0F, -1.0F, 8, 7, 2, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 0, -4.0F, -4.0F, -1.0F, 2, 2, 2, 0.0F, false));

		arm1 = new ModelRenderer(this);
		arm1.setRotationPoint(-4.0F, 13.0F, 0.0F);
		arm1.cubeList.add(new ModelBox(arm1, 0, 0, -2.0F, -1.0F, -1.0F, 3, 8, 2, 0.0F, false));

		arm2 = new ModelRenderer(this);
		arm2.setRotationPoint(6.0F, 13.0F, 0.0F);
		arm2.cubeList.add(new ModelBox(arm2, 0, 0, -1.0F, -1.0F, -1.0F, 3, 8, 2, 0.0F, false));

		leg1 = new ModelRenderer(this);
		leg1.setRotationPoint(-1.0F, 21.0F, 0.0F);
		leg1.cubeList.add(new ModelBox(leg1, 0, 0, -2.0F, -1.0F, -1.0F, 3, 8, 2, 0.0F, false));

		leg2 = new ModelRenderer(this);
		leg2.setRotationPoint(3.0F, 21.0F, 0.0F);
		leg2.cubeList.add(new ModelBox(leg2, 0, 0, -1.0F, -1.0F, -1.0F, 3, 8, 2, 0.0F, false));
		leg2.cubeList.add(new ModelBox(leg2, 0, 0, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		
		GlStateManager.pushMatrix();
        //GlStateManager.scale(0.9F, 0.9F, 0.9F);
        GlStateManager.translate(0.0F, -4.0F * f5, 0.0F);
		head.render(f5);
		body.render(f5);
		arm1.render(f5);
		arm2.render(f5);
		leg1.render(f5);
		leg2.render(f5);
		GlStateManager.popMatrix();
	}

	public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
							  float headPitch, float scaleFactor, Entity entityIn)
	{
		this.head.rotateAngleZ = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
		this.arm1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
		this.arm2.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
		this.leg1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
		this.leg2.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
	}
}