package com.sample.mod.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.util.math.MathHelper;

public class ModelDarkKing extends ModelBase {
	private final ModelRenderer arm2;
	private final ModelRenderer arm1;
	private final ModelRenderer body;
	private final ModelRenderer head;
	private final ModelRenderer bone;
	private final ModelRenderer body2;
	private final ModelRenderer Head;

	public ModelDarkKing() {
		textureWidth = 128;
		textureHeight = 128;


		arm2 = new ModelRenderer(this);
		arm2.setRotationPoint(14.0F, -18.0F, 6.0F);
		arm2.cubeList.add(new ModelBox(arm2, 0, 39, -2.0F, 27.0F, -6.0F, 2, 6, 1, 0.0F, false));
		arm2.cubeList.add(new ModelBox(arm2, 25, 76, -2.0F, 20.0F, -5.0F, 4, 8, 8, 0.0F, false));
		arm2.cubeList.add(new ModelBox(arm2, 13, 63, -1.0F, -1.0F, -3.0F, 2, 21, 5, 0.0F, false));
		arm2.cubeList.add(new ModelBox(arm2, 0, 37, 1.0F, 10.0F, -4.0F, 1, 10, 7, 0.0F, false));
		arm2.cubeList.add(new ModelBox(arm2, 0, 28, 2.0F, 27.0F, -5.0F, 1, 6, 2, 0.0F, false));
		arm2.cubeList.add(new ModelBox(arm2, 0, 27, 2.0F, 27.0F, -2.0F, 1, 6, 2, 0.0F, false));
		arm2.cubeList.add(new ModelBox(arm2, 0, 32, 2.0F, 27.0F, 1.0F, 1, 6, 2, 0.0F, false));
		arm2.cubeList.add(new ModelBox(arm2, 105, 117, 10.6832F, -7.0F, -8.3553F, 7, 7, 2, 0.0F, false));
		arm2.cubeList.add(new ModelBox(arm2, 4, 40, 12.0F, -6.0F, -12.0F, 5, 5, 4, 0.0F, false));
		arm2.cubeList.add(new ModelBox(arm2, 2, 29, 11.0F, -2.0F, -16.0F, 1, 1, 5, 0.0F, false));
		arm2.cubeList.add(new ModelBox(arm2, 33, 68, 12.0F, -7.0F, -17.0F, 1, 1, 6, 0.0F, false));
		arm2.cubeList.add(new ModelBox(arm2, 31, 54, 14.0F, -7.0F, -17.0F, 1, 1, 6, 0.0F, false));
		arm2.cubeList.add(new ModelBox(arm2, 4, 40, 16.0F, -7.0F, -17.0F, 1, 1, 6, 0.0F, false));

		arm1 = new ModelRenderer(this);
		arm1.setRotationPoint(-10.0F, -18.0F, 6.0F);
		arm1.cubeList.add(new ModelBox(arm1, 59, 81, -1.0F, -1.0F, -3.0F, 2, 21, 5, 0.0F, false));
		arm1.cubeList.add(new ModelBox(arm1, 63, 73, -2.0F, 20.0F, -5.0F, 4, 8, 8, 0.0F, false));
		arm1.cubeList.add(new ModelBox(arm1, 2, 37, 0.0F, 27.0F, -6.0F, 2, 6, 1, 0.0F, false));
		arm1.cubeList.add(new ModelBox(arm1, 0, 43, -3.0F, 27.0F, -5.0F, 1, 6, 2, 0.0F, false));
		arm1.cubeList.add(new ModelBox(arm1, 0, 49, -3.0F, 27.0F, -2.0F, 1, 6, 2, 0.0F, false));
		arm1.cubeList.add(new ModelBox(arm1, 0, 109, -3.0F, 27.0F, 1.0F, 1, 6, 2, 0.0F, false));
		arm1.cubeList.add(new ModelBox(arm1, 3, 29, -2.0F, 10.0F, -4.0F, 1, 10, 7, 0.0F, false));
		arm1.cubeList.add(new ModelBox(arm1, 2, 40, -11.0F, -6.0F, -13.0F, 5, 5, 5, 0.0F, false));
		arm1.cubeList.add(new ModelBox(arm1, 2, 35, -11.0F, -7.0F, -17.0F, 1, 1, 5, 0.0F, false));
		arm1.cubeList.add(new ModelBox(arm1, 111, 120, -12.0F, -7.0F, -8.0F, 7, 7, 3, 0.0F, false));
		arm1.cubeList.add(new ModelBox(arm1, 0, 44, -9.0F, -7.0F, -17.0F, 1, 1, 5, 0.0F, false));
		arm1.cubeList.add(new ModelBox(arm1, 3, 43, -7.0F, -7.0F, -17.0F, 1, 1, 5, 0.0F, false));
		arm1.cubeList.add(new ModelBox(arm1, 0, 44, -6.0F, -2.0F, -17.0F, 1, 1, 5, 0.0F, false));

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 24.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 0, 103, -1.0F, -36.0F, 3.0F, 6, 9, 5, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 1, 110, -9.0F, -43.0F, 3.0F, 22, 7, 5, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 108, 124, -2.0F, -40.0F, 1.0F, 8, 2, 2, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 118, 123, 0.0F, -41.0F, 1.0F, 4, 4, 2, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 48, 125, 1.0F, -39.7851F, 0.1056F, 2, 2, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 108, 117, -13.0F, -43.0F, 3.0F, 2, 6, 5, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 108, 119, -12.0F, -45.0F, 3.0F, 4, 2, 5, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 110, 120, 12.0F, -45.0F, 3.0F, 4, 2, 5, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 109, 115, 15.0F, -43.0F, 3.0F, 2, 6, 5, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 116, 120, 6.0F, -44.0F, 8.0F, 3, 4, 5, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 116, 119, 4.0F, -41.0F, 8.0F, 1, 2, 5, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 116, 121, -1.0F, -41.0F, 8.0F, 1, 2, 5, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 114, 119, -5.0F, -44.0F, 8.0F, 3, 4, 5, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 24, 7.0F, -54.0F, 14.0F, 1, 11, 2, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 24, -4.0F, -54.0F, 14.0F, 1, 11, 2, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 8, 84, -4.0F, -54.0F, 16.0F, 1, 2, 15, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 43, 7.0F, -46.0F, 16.0F, 1, 2, 11, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 42, -4.0F, -50.0F, 16.0F, 1, 2, 13, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 42, 7.0F, -50.0F, 16.0F, 1, 2, 13, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 5, 42, 7.0F, -54.0F, 16.0F, 1, 2, 15, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 2, 34, -16.0F, -43.0F, 8.0F, 9, 3, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 19, -16.0F, -53.0F, 8.0F, 3, 10, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 12, -27.0F, -53.0F, 8.0F, 11, 2, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 46, -26.0F, -49.0F, 8.0F, 10, 2, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 33, -25.0F, -45.0F, 8.0F, 9, 2, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 27, 11.0F, -43.0F, 8.0F, 9, 3, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 18, 17.0F, -53.0F, 8.0F, 3, 10, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 10, 20.0F, -53.0F, 8.0F, 11, 2, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 1, 48, 20.0F, -49.0F, 8.0F, 10, 2, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 3, 42, 20.0F, -45.0F, 8.0F, 9, 2, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 117, 1.0F, -46.0F, 5.0F, 2, 3, 2, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 43, -4.0F, -46.0F, 16.0F, 1, 2, 11, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 119, 118, 1.0F, -43.0F, 1.0F, 2, 8, 2, 0.0F, false));

		head = new ModelRenderer(this);
		head.setRotationPoint(2.0F, -27.0F, 4.0F);
		head.cubeList.add(new ModelBox(head, 5, 21, -3.0F, 3.0F, -4.0F, 1, 1, 1, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 17, 14, 2.0F, 3.0F, -4.0F, 1, 1, 1, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 126, -3.0F, 1.0F, -4.0F, 1, 1, 1, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 126, 2.0F, 1.0F, -4.0F, 1, 1, 1, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 54, -3.0F, -3.0F, -4.0F, 6, 4, 7, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 119, -3.0F, 1.0F, 2.0F, 6, 3, 1, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 119, -6.0F, -3.0F, 0.0F, 3, 2, 1, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 8, -3.0F, 4.0F, -4.0F, 6, 1, 7, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 45, 3.0F, -3.0F, 0.0F, 3, 2, 1, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 1, 16, -3.0F, 3.0F, -2.0F, 1, 1, 1, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 40, -3.0F, 1.0F, -2.0F, 1, 1, 1, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 1, 40, -3.0F, 1.0F, 0.0F, 1, 1, 1, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 13, 2.0F, 3.0F, -2.0F, 1, 1, 1, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 11, 2.0F, 3.0F, 0.0F, 1, 1, 1, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 9, 38, 2.0F, 1.0F, -2.0F, 1, 1, 1, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 42, 2.0F, 1.0F, 0.0F, 1, 1, 1, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 6, 9, -3.0F, 3.0F, 0.0F, 1, 1, 1, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 33, 3.0F, 1.0F, 2.0F, 4, 2, 1, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 107, 117, 6.0F, 1.0F, 3.0F, 1, 2, 5, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 115, 121, -7.0F, 1.0F, 3.0F, 1, 2, 5, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 33, -7.0F, 1.0F, 2.0F, 4, 2, 1, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 110, 119, 2.0F, -4.0F, -1.0F, 1, 1, 8, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 110, 116, -3.0F, -4.0F, -1.0F, 1, 1, 8, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 5, 36, 5.0F, 8.0F, 9.0F, 1, 3, 3, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 29, -6.0F, 8.0F, 9.0F, 1, 3, 3, 0.0F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, -4.0F, 3.0F);
		setRotationAngle(bone, 0.6981F, 0.0F, 0.0F);
		head.addChild(bone);
		bone.cubeList.add(new ModelBox(bone, 122, 1, -6.0F, -6.0F, -3.0F, 2, 7, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 92, 18, 4.0F, -6.0F, -3.0F, 2, 7, 1, 0.0F, false));

		body2 = new ModelRenderer(this);
		body2.setRotationPoint(2.0F, -5.0F, 5.0F);
		setRotationAngle(body2, 0.0F, -0.6981F, 0.0F);
		body2.cubeList.add(new ModelBox(body2, 0, 0, -7.0F, 0.0F, -7.0F, 14, 4, 14, 0.0F, false));
		body2.cubeList.add(new ModelBox(body2, 0, 0, -6.0F, 4.0F, -5.6428F, 11, 2, 11, 0.0F, false));
		body2.cubeList.add(new ModelBox(body2, 0, 0, -5.0716F, 6.0F, -4.7019F, 10, 3, 9, 0.0F, false));
		body2.cubeList.add(new ModelBox(body2, 0, 0, -4.0F, 9.0F, -3.5786F, 7, 4, 7, 0.0F, false));
		body2.cubeList.add(new ModelBox(body2, 0, 0, -3.1433F, 13.0F, -2.4037F, 6, 3, 5, 0.0F, false));
		body2.cubeList.add(new ModelBox(body2, 0, 0, -2.0F, 19.0F, -1.1698F, 3, 8, 3, 0.0F, false));
		body2.cubeList.add(new ModelBox(body2, 0, 0, -3.0F, 16.0F, -2.5861F, 5, 3, 5, 0.0F, false));
		body2.cubeList.add(new ModelBox(body2, 0, 0, -10.8493F, 14.0F, -11.3232F, 2, 2, 2, 0.0F, false));
		body2.cubeList.add(new ModelBox(body2, 0, 0, 8.4079F, 6.0F, -1.1521F, 3, 3, 11, 0.0F, false));
		body2.cubeList.add(new ModelBox(body2, 0, 0, 8.0F, 7.0F, 9.8404F, 1, 2, 3, 0.0F, false));
		body2.cubeList.add(new ModelBox(body2, 0, 0, 3.1158F, 11.0F, -8.6818F, 3, 2, 2, 0.0F, false));
		body2.cubeList.add(new ModelBox(body2, 0, 0, -5.0F, 10.0F, -8.9284F, 9, 3, 2, 0.0F, false));
		body2.cubeList.add(new ModelBox(body2, 0, 0, -11.0F, 13.0F, -9.2149F, 3, 4, 11, 0.0F, false));

		Head = new ModelRenderer(this);
		Head.setRotationPoint(-4.0F, 29.0F, -5.0F);
		body2.addChild(Head);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		arm2.render(f5);
		arm1.render(f5);
		body.render(f5);
		head.render(f5);
		body2.render(f5);
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
		this.body2.rotateAngleY = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
	}
}