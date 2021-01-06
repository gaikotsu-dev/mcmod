package com.sample.mod.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.util.math.MathHelper;

public class ModelSirenHead2 extends ModelBase {
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer arm1;
	private final ModelRenderer arm2;
	private final ModelRenderer leg2;
	private final ModelRenderer leg1;

	public ModelSirenHead2() {
		textureWidth = 256;
		textureHeight = 256;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -33.0F, 0.0F);
		head.cubeList.add(new ModelBox(head, 11, 232, -1.0F, -16.0F, 0.0F, 1, 17, 3, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 8, 220, 0.0F, -11.0F, 0.0F, 1, 3, 3, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 229, 1.0F, -12.0F, -1.0F, 1, 5, 5, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 176, 0, 2.0F, -13.0F, -3.0F, 4, 7, 9, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 9, 246, -3.0F, -8.0F, -1.0F, 1, 5, 5, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 47, 242, -2.0F, -7.0F, 0.0F, 1, 3, 3, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 1, 24, -7.0F, -9.0F, -4.0F, 4, 7, 10, 0.0F, false));

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, -19.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 213, 20, -5.0F, -11.0F, -2.0F, 9, 11, 7, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 13, 244, -4.0F, 0.0F, -1.0F, 7, 2, 5, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 243, -3.0F, 2.0F, 0.0F, 5, 10, 3, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 246, -10.0F, -13.0F, -2.0F, 19, 2, 7, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 251, -9.0F, 12.0F, 0.0F, 17, 2, 3, 0.0F, false));

		arm1 = new ModelRenderer(this);
		arm1.setRotationPoint(-11.0F, -31.0F, 2.0F);
		arm1.cubeList.add(new ModelBox(arm1, 1, 228, -2.0F, -1.0F, -3.0F, 3, 23, 5, 0.0F, false));
		arm1.cubeList.add(new ModelBox(arm1, 43, 243, 0.0F, 22.0F, -4.0F, 1, 6, 1, 0.0F, false));
		arm1.cubeList.add(new ModelBox(arm1, 15, 242, -3.0F, 22.0F, 1.0F, 1, 7, 1, 0.0F, false));
		arm1.cubeList.add(new ModelBox(arm1, 21, 236, -3.0F, 22.0F, -1.0F, 1, 7, 1, 0.0F, false));
		arm1.cubeList.add(new ModelBox(arm1, 19, 248, -3.0F, 22.0F, -3.0F, 1, 7, 1, 0.0F, false));

		arm2 = new ModelRenderer(this);
		arm2.setRotationPoint(11.0F, -31.0F, 2.0F);
		arm2.cubeList.add(new ModelBox(arm2, 0, 228, -2.0F, -1.0F, -3.0F, 3, 23, 5, 0.0F, false));
		arm2.cubeList.add(new ModelBox(arm2, 54, 248, 1.0F, 22.0F, 1.0F, 1, 7, 1, 0.0F, false));
		arm2.cubeList.add(new ModelBox(arm2, 8, 240, -2.0F, 22.0F, -4.0F, 1, 6, 1, 0.0F, false));
		arm2.cubeList.add(new ModelBox(arm2, 1, 230, 1.0F, 22.0F, -3.0F, 1, 7, 1, 0.0F, false));
		arm2.cubeList.add(new ModelBox(arm2, 44, 244, 1.0F, 22.0F, -1.0F, 1, 7, 1, 0.0F, false));

		leg2 = new ModelRenderer(this);
		leg2.setRotationPoint(5.0F, -4.0F, 0.0F);
		leg2.cubeList.add(new ModelBox(leg2, 0, 238, -2.0F, 11.0F, 0.0F, 4, 15, 3, 0.0F, false));
		leg2.cubeList.add(new ModelBox(leg2, 0, 242, -4.0F, 26.0F, -8.0F, 8, 2, 12, 0.0F, false));
		leg2.cubeList.add(new ModelBox(leg2, 1, 249, -2.0F, 8.0F, 0.0F, 1, 3, 3, 0.0F, false));
		leg2.cubeList.add(new ModelBox(leg2, 0, 249, 1.0F, 8.0F, 0.0F, 1, 3, 3, 0.0F, false));
		leg2.cubeList.add(new ModelBox(leg2, 1, 244, -2.0F, -1.0F, 0.0F, 4, 9, 3, 0.0F, false));

		leg1 = new ModelRenderer(this);
		leg1.setRotationPoint(-6.0F, -4.0F, 0.0F);
		leg1.cubeList.add(new ModelBox(leg1, 0, 242, -4.0F, 26.0F, -8.0F, 8, 2, 12, 0.0F, false));
		leg1.cubeList.add(new ModelBox(leg1, 2, 250, -2.0F, 8.0F, 0.0F, 1, 3, 3, 0.0F, false));
		leg1.cubeList.add(new ModelBox(leg1, 1, 249, 1.0F, 8.0F, 0.0F, 1, 3, 3, 0.0F, false));
		leg1.cubeList.add(new ModelBox(leg1, 0, 244, -2.0F, -1.0F, 0.0F, 4, 9, 3, 0.0F, false));
		leg1.cubeList.add(new ModelBox(leg1, 0, 238, -2.0F, 11.0F, 0.0F, 4, 15, 3, 0.0F, false));
	}

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
		head.render(f5);
		body.render(f5);
		arm1.render(f5);
		arm2.render(f5);
		leg2.render(f5);
		leg1.render(f5);
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