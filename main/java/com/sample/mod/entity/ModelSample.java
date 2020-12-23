package com.sample.mod.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.util.math.MathHelper;

public class ModelSample extends ModelBase {
	private final ModelRenderer field_78176_b0;
	private final ModelRenderer field_78176_b1;
	private final ModelRenderer field_78174_d;
	private final ModelRenderer field_78177_c;
	private final ModelRenderer field_78175_e;
	private final ModelRenderer field_78178_a0;
	private final ModelRenderer field_78178_a1;
	private final ModelRenderer field_78173_f;

	public ModelSample() {
		textureWidth = 128;
		textureHeight = 128;

		field_78176_b0 = new ModelRenderer(this);
		field_78176_b0.setRotationPoint(0.0F, -7.0F, 0.0F);
		field_78176_b0.cubeList.add(new ModelBox(field_78176_b0, 0, 40, -9.0F, -2.0F, -6.0F, 18, 12, 11, 0.0F, false));

		field_78176_b1 = new ModelRenderer(this);
		field_78176_b1.setRotationPoint(0.0F, -7.0F, 0.0F);
		field_78176_b1.cubeList.add(new ModelBox(field_78176_b1, 0, 70, -4.5F, 10.0F, -3.0F, 9, 5, 6, 0.5F, false));

		field_78174_d = new ModelRenderer(this);
		field_78174_d.setRotationPoint(0.0F, -7.0F, 0.0F);
		field_78174_d.cubeList.add(new ModelBox(field_78174_d, 60, 58, 9.0F, -2.5F, -3.0F, 4, 15, 6, 0.0F, false));

		field_78177_c = new ModelRenderer(this);
		field_78177_c.setRotationPoint(0.0F, -7.0F, 0.0F);
		field_78177_c.cubeList.add(new ModelBox(field_78177_c, 60, 21, -13.0F, -2.5F, -3.0F, 4, 16, 6, 0.0F, false));

		field_78175_e = new ModelRenderer(this);
		field_78175_e.setRotationPoint(-4.0F, 11.0F, 0.0F);
		field_78175_e.cubeList.add(new ModelBox(field_78175_e, 37, 0, -3.5F, -3.0F, -3.0F, 6, 16, 5, 0.0F, false));

		field_78178_a0 = new ModelRenderer(this);
		field_78178_a0.setRotationPoint(0.0F, -7.0F, -2.0F);
		field_78178_a0.cubeList.add(new ModelBox(field_78178_a0, 0, 0, -4.0F, -12.0F, -2.5F, 8, 10, 8, 0.0F, false));

		field_78178_a1 = new ModelRenderer(this);
		field_78178_a1.setRotationPoint(0.0F, -7.0F, -2.0F);

		field_78173_f = new ModelRenderer(this);
		field_78173_f.setRotationPoint(5.0F, 11.0F, 0.0F);
		field_78173_f.cubeList.add(new ModelBox(field_78173_f, 60, 0, -3.5F, -3.0F, -3.0F, 6, 16, 5, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		field_78176_b0.render(f5);
		field_78176_b1.render(f5);
		field_78174_d.render(f5);
		field_78177_c.render(f5);
		field_78175_e.render(f5);
		field_78178_a0.render(f5);
		field_78178_a1.render(f5);
		field_78173_f.render(f5);
	}
//	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
//		modelRenderer.rotateAngleX = x;
//		modelRenderer.rotateAngleY = y;
//		modelRenderer.rotateAngleZ = z;
//	}
	@Override
	public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
							  float headPitch, float scaleFactor, Entity entityIn)
	{
		this.field_78173_f.rotateAngleX = 0.26F;
		this.field_78173_f.rotateAngleY = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
	}
}