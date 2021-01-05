package com.sample.mod.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.util.math.MathHelper;

public class ModelSirenHead extends ModelBase {
	private final ModelRenderer all;
	private final ModelRenderer leg2;
	private final ModelRenderer leg1;
	private final ModelRenderer body;
	private final ModelRenderer arm1;
	private final ModelRenderer arm2;
	private final ModelRenderer head;

	public ModelSirenHead() {
		textureWidth = 32;
		textureHeight = 32;

		all = new ModelRenderer(this);
		all.setRotationPoint(-3.0F, 10.0F, 0.0F);

		leg2 = new ModelRenderer(this);
		leg2.setRotationPoint(6.0F, -4.0F, 1.0F);
		all.addChild(leg2);
		leg2.cubeList.add(new ModelBox(leg2, 0, 0, -1.0F, -1.0F, -1.0F, 3, 5, 3, 0.0F, false));
		leg2.cubeList.add(new ModelBox(leg2, 0, 0, 0.0F, -3.0F, -1.0F, 2, 1, 3, 0.0F, false));
		leg2.cubeList.add(new ModelBox(leg2, 0, 0, -1.0F, 4.0F, -1.0F, 1, 3, 3, 0.0F, false));
		leg2.cubeList.add(new ModelBox(leg2, 0, 0, 1.0F, 4.0F, -1.0F, 1, 3, 3, 0.0F, false));
		leg2.cubeList.add(new ModelBox(leg2, 0, 0, -1.0F, 7.0F, -1.0F, 3, 9, 3, 0.0F, false));
		leg2.cubeList.add(new ModelBox(leg2, 0, 0, -2.0F, 16.0F, -6.0F, 5, 1, 8, 0.0F, false));

		leg1 = new ModelRenderer(this);
		leg1.setRotationPoint(-1.0F, -4.0F, 1.0F);
		all.addChild(leg1);
		leg1.cubeList.add(new ModelBox(leg1, 0, 0, -2.0F, -1.0F, -1.0F, 3, 5, 3, 0.0F, false));
		leg1.cubeList.add(new ModelBox(leg1, 0, 0, -2.0F, 4.0F, -1.0F, 1, 3, 3, 0.0F, false));
		leg1.cubeList.add(new ModelBox(leg1, 0, 0, 0.0F, 4.0F, -1.0F, 1, 3, 3, 0.0F, false));
		leg1.cubeList.add(new ModelBox(leg1, 0, 0, -2.0F, 7.0F, -1.0F, 3, 9, 3, 0.0F, false));
		leg1.cubeList.add(new ModelBox(leg1, 0, 0, -3.0F, 16.0F, -6.0F, 5, 1, 8, 0.0F, false));
		leg1.cubeList.add(new ModelBox(leg1, 0, 0, -2.0F, -3.0F, -1.0F, 2, 1, 3, 0.0F, false));

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		all.addChild(body);
		body.cubeList.add(new ModelBox(body, 8, 5, -1.0F, -22.0F, -1.0F, 7, 8, 5, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 0, 1.0F, -13.0F, 0.0F, 3, 7, 3, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 0, -6.0F, -24.0F, -1.0F, 17, 2, 5, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 0, 0.0F, -14.0F, -1.0F, 5, 1, 5, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 0, -3.0F, -6.0F, 0.0F, 11, 1, 3, 0.0F, false));

		arm1 = new ModelRenderer(this);
		arm1.setRotationPoint(-5.0F, -20.0F, 0.0F);
		all.addChild(arm1);
		arm1.cubeList.add(new ModelBox(arm1, 0, 0, -1.0F, -2.0F, 0.0F, 2, 13, 3, 0.0F, false));
		arm1.cubeList.add(new ModelBox(arm1, 0, 0, -2.0F, 11.0F, -2.0F, 4, 1, 7, 0.0F, false));
		arm1.cubeList.add(new ModelBox(arm1, 0, 0, 1.0F, 11.0F, -3.0F, 1, 4, 1, 0.0F, false));
		arm1.cubeList.add(new ModelBox(arm1, 0, 0, -2.0F, 12.0F, -1.0F, 1, 4, 1, 0.0F, false));
		arm1.cubeList.add(new ModelBox(arm1, 0, 0, -2.0F, 12.0F, 1.0F, 1, 4, 1, 0.0F, false));
		arm1.cubeList.add(new ModelBox(arm1, 0, 0, -2.0F, 12.0F, 3.0F, 1, 4, 1, 0.0F, false));

		arm2 = new ModelRenderer(this);
		arm2.setRotationPoint(10.0F, -20.0F, 0.0F);
		all.addChild(arm2);
		arm2.cubeList.add(new ModelBox(arm2, 0, 0, -2.0F, 11.0F, -2.0F, 4, 1, 7, 0.0F, false));
		arm2.cubeList.add(new ModelBox(arm2, 0, 0, -1.0F, -2.0F, 0.0F, 2, 13, 3, 0.0F, false));
		arm2.cubeList.add(new ModelBox(arm2, 0, 0, 1.0F, 12.0F, -1.0F, 1, 4, 1, 0.0F, false));
		arm2.cubeList.add(new ModelBox(arm2, 0, 0, 1.0F, 12.0F, 1.0F, 1, 4, 1, 0.0F, false));
		arm2.cubeList.add(new ModelBox(arm2, 0, 0, 1.0F, 12.0F, 3.0F, 1, 4, 1, 0.0F, false));
		arm2.cubeList.add(new ModelBox(arm2, 0, 0, -2.0F, 11.0F, -3.0F, 1, 4, 1, 0.0F, false));

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, 0.0F);
		all.addChild(head);
		head.cubeList.add(new ModelBox(head, 0, 17, 2.0F, -36.0F, 0.0F, 1, 12, 3, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 16, 18, 6.0F, -32.0F, -2.0F, 1, 7, 7, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 22, 4.0F, -31.0F, -1.0F, 2, 5, 5, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 26, 3.0F, -30.0F, 0.0F, 1, 3, 3, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 3, 26, 1.0F, -33.0F, 0.0F, 1, 3, 3, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 16, 18, -2.0F, -35.0F, -2.0F, 1, 7, 7, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 22, -1.0F, -34.0F, -1.0F, 2, 5, 5, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 0, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));
	}

    @Override
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
		this.head.rotateAngleY = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
	}
}