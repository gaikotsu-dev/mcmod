package com.sample.mod.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.util.math.MathHelper;

public class ModelAlien extends ModelBase {
	private final ModelRenderer head;
	private final ModelRenderer bone2;
	private final ModelRenderer bone;
	private final ModelRenderer bone19;
	private final ModelRenderer legL2;
	private final ModelRenderer bone7;
	private final ModelRenderer legL3;
	private final ModelRenderer bone14;
	private final ModelRenderer legL1;
	private final ModelRenderer bone11;
	private final ModelRenderer bone5;
	private final ModelRenderer bone20;
	private final ModelRenderer legR2;
	private final ModelRenderer bone8;
	private final ModelRenderer legR3;
	private final ModelRenderer bone13;
	private final ModelRenderer legR1;
	private final ModelRenderer bone9;
	private final ModelRenderer bone6;
	private final ModelRenderer body;
	private final ModelRenderer tail;
	private final ModelRenderer bone24;
	private final ModelRenderer bone23;
	private final ModelRenderer bone22;

	public ModelAlien() {
		textureWidth = 128;
		textureHeight = 128;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 4.0F, 0.0F);
		setRotationAngle(head, -0.2618F, 0.0F, 0.0F);
		head.cubeList.add(new ModelBox(head, 98, 26, -3.0F, -3.0F, -10.0F, 6, 2, 9, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 0, 2.0F, -4.0F, -4.0F, 1, 1, 7, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 0, -3.0F, -4.0F, -4.0F, 1, 1, 7, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 118, 125, -1.0F, 0.0F, -5.0F, 2, 0, 3, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, 0.0F, -8.0F);
		setRotationAngle(bone2, -0.3491F, 0.0F, 0.0F);
		head.addChild(bone2);
		bone2.cubeList.add(new ModelBox(bone2, 118, 125, -1.0F, 0.0F, -2.0F, 2, 0, 3, 0.0F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 9.0F, 0.0F);
		setRotationAngle(bone, 0.2618F, 0.0F, 0.0F);
		head.addChild(bone);
		bone.cubeList.add(new ModelBox(bone, 0, 0, -3.0F, -8.4698F, -6.5684F, 6, 0, 7, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -2.0F, -9.6126F, 0.3468F, 4, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 120, 126, -1.0F, -10.0215F, -4.7591F, 2, 0, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 118, 125, -1.0F, -12.0F, -9.3299F, 2, 0, 3, 0.0F, false));

		bone19 = new ModelRenderer(this);
		bone19.setRotationPoint(0.0F, 24.0F, 0.0F);

		legL2 = new ModelRenderer(this);
		legL2.setRotationPoint(3.0F, -19.0F, 6.0F);
		bone19.addChild(legL2);
		legL2.cubeList.add(new ModelBox(legL2, 6, 110, 3.0F, 8.0F, -1.0F, 1, 11, 2, 0.0F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(1.0F, 1.0F, -1.0F);
		setRotationAngle(bone7, 0.0F, 0.0F, -0.4363F);
		legL2.addChild(bone7);
		bone7.cubeList.add(new ModelBox(bone7, 0, 126, -1.0F, -1.0F, 0.0F, 1, 9, 2, 0.0F, false));

		legL3 = new ModelRenderer(this);
		legL3.setRotationPoint(3.0F, -19.0F, 12.0F);
		bone19.addChild(legL3);
		legL3.cubeList.add(new ModelBox(legL3, 43, 108, 3.0F, 8.0F, -1.0F, 1, 11, 2, 0.0F, false));

		bone14 = new ModelRenderer(this);
		bone14.setRotationPoint(4.0F, 7.0F, 0.0F);
		setRotationAngle(bone14, 0.0F, 0.0F, -0.4363F);
		legL3.addChild(bone14);
		bone14.cubeList.add(new ModelBox(bone14, 80, 106, -1.0F, -8.0F, -1.0F, 1, 9, 2, 0.0F, false));

		legL1 = new ModelRenderer(this);
		legL1.setRotationPoint(3.0F, -19.0F, 2.0F);
		bone19.addChild(legL1);

		bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(2.0F, 15.0F, -3.0F);
		setRotationAngle(bone11, 0.2618F, 0.0F, 0.0F);
		legL1.addChild(bone11);
		bone11.cubeList.add(new ModelBox(bone11, 0, 117, -1.0F, -11.0F, 0.0F, 1, 12, 2, 0.0F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(1.0F, 1.0F, -1.0F);
		setRotationAngle(bone5, -0.6109F, 0.0F, -0.2618F);
		legL1.addChild(bone5);
		bone5.cubeList.add(new ModelBox(bone5, 0, 120, -1.0F, -2.0F, 0.0F, 1, 7, 1, 0.0F, false));

		bone20 = new ModelRenderer(this);
		bone20.setRotationPoint(0.0F, 7.0F, 0.0F);

		legR2 = new ModelRenderer(this);
		legR2.setRotationPoint(-3.0F, -2.0F, 6.0F);
		bone20.addChild(legR2);
		legR2.cubeList.add(new ModelBox(legR2, 36, 101, -4.0F, 8.0F, -1.0F, 1, 11, 2, 0.0F, false));

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(0.0F, 1.0F, -1.0F);
		setRotationAngle(bone8, 0.0F, 0.0F, 0.4363F);
		legR2.addChild(bone8);
		bone8.cubeList.add(new ModelBox(bone8, 0, 117, -1.0F, -1.0F, 0.0F, 1, 9, 2, 0.0F, false));

		legR3 = new ModelRenderer(this);
		legR3.setRotationPoint(-3.0F, -2.0F, 12.0F);
		bone20.addChild(legR3);
		legR3.cubeList.add(new ModelBox(legR3, 50, 88, -4.0F, 8.0F, -1.0F, 1, 11, 2, 0.0F, false));

		bone13 = new ModelRenderer(this);
		bone13.setRotationPoint(-3.0F, 8.0F, -1.0F);
		setRotationAngle(bone13, 0.0F, 0.0F, 0.4363F);
		legR3.addChild(bone13);
		bone13.cubeList.add(new ModelBox(bone13, 60, 72, -1.0F, -8.0F, 0.0F, 1, 8, 2, 0.0F, false));

		legR1 = new ModelRenderer(this);
		legR1.setRotationPoint(-3.0F, -2.0F, 2.0F);
		bone20.addChild(legR1);

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(-2.0F, 16.0F, -3.0F);
		setRotationAngle(bone9, 0.2618F, 0.0F, 0.0F);
		legR1.addChild(bone9);
		bone9.cubeList.add(new ModelBox(bone9, 6, 115, -1.0F, -12.0F, 0.0F, 1, 12, 2, 0.0F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(0.0F, 1.0F, 0.0F);
		setRotationAngle(bone6, 0.9599F, 0.0F, 0.5236F);
		legR1.addChild(bone6);
		bone6.cubeList.add(new ModelBox(bone6, 0, 120, -1.0F, -1.0F, -6.0F, 1, 1, 7, 0.0F, false));

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 4.0F, 5.0F);
		body.cubeList.add(new ModelBox(body, 0, 114, -3.0F, -2.0F, -3.0F, 6, 4, 13, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 123, -1.0F, -1.0F, 10.0F, 2, 2, 5, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 119, -2.0F, -1.0F, -7.0F, 4, 2, 7, 0.0F, false));

		tail = new ModelRenderer(this);
		tail.setRotationPoint(0.0F, 4.0F, 19.0F);
		tail.cubeList.add(new ModelBox(tail, 86, 39, -22.0F, 3.0F, -29.0F, 4, 4, 1, 0.0F, false));
		tail.cubeList.add(new ModelBox(tail, 53, 28, -21.0F, 4.0F, -28.0F, 2, 2, 24, 0.0F, false));
		tail.cubeList.add(new ModelBox(tail, 79, 62, -22.0F, 6.0F, -34.0F, 4, 1, 5, 0.0F, false));
		tail.cubeList.add(new ModelBox(tail, 106, 0, -22.0F, 2.0F, -35.0F, 4, 2, 7, 0.0F, false));
		tail.cubeList.add(new ModelBox(tail, 72, 32, -19.0F, 1.0F, -32.0F, 1, 1, 4, 0.0F, false));
		tail.cubeList.add(new ModelBox(tail, 70, 55, -22.0F, 1.0F, -32.0F, 1, 1, 4, 0.0F, false));
		tail.cubeList.add(new ModelBox(tail, 69, 54, -11.0F, 4.0F, 10.0F, 12, 2, 2, 0.0F, false));

		bone24 = new ModelRenderer(this);
		bone24.setRotationPoint(-11.0F, 5.0F, 11.0F);
		setRotationAngle(bone24, 0.0F, -1.0472F, 0.0F);
		tail.addChild(bone24);
		bone24.cubeList.add(new ModelBox(bone24, 76, 52, -18.0F, -1.0F, -1.0F, 19, 2, 2, 0.0F, false));

		bone23 = new ModelRenderer(this);
		bone23.setRotationPoint(0.0F, -3.0F, 6.0F);
		setRotationAngle(bone23, -1.1345F, 0.0F, 0.0F);
		tail.addChild(bone23);
		bone23.cubeList.add(new ModelBox(bone23, 96, 88, -1.0F, -2.0F, -1.0F, 2, 2, 10, 0.0F, false));

		bone22 = new ModelRenderer(this);
		bone22.setRotationPoint(0.0F, 0.0F, 1.0F);
		setRotationAngle(bone22, 0.4363F, 0.0F, 0.0F);
		tail.addChild(bone22);
		bone22.cubeList.add(new ModelBox(bone22, 0, 126, -1.0F, -1.517F, -1.3521F, 2, 2, 7, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		head.render(f5);
		bone19.render(f5);
		bone20.render(f5);
		body.render(f5);
		tail.render(f5);
	}
	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
							  float headPitch, float scaleFactor, Entity entityIn)
	{
		this.legL2.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
		this.legR2.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
		this.legL3.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
		this.legR3.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
		this.head.rotateAngleY = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
	}
}