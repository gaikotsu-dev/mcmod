package com.sample.mod.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelLongHorse extends ModelBase {
	private final ModelRenderer all;
	private final ModelRenderer head;
	private final ModelRenderer body1;
	private final ModelRenderer body2;

	public ModelLongHorse() {
		textureWidth = 32;
		textureHeight = 32;

		all = new ModelRenderer(this);
		all.setRotationPoint(0.0F, 24.0F, 0.0F);
		setRotationAngle(all, 0.0F, 1.5708F, 0.0F);

		head = new ModelRenderer(this);
		head.setRotationPoint(-9.0F, 0.0F, 1.0F);
		all.addChild(head);
		head.cubeList.add(new ModelBox(head, 8, 26, 9.0F, -3.0F, -3.0F, 9, 3, 3, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 28, 9.0F, -4.0F, -3.0F, 4, 1, 3, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 0, 16.0F, 0.0F, -3.0F, 2, 1, 3, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 0, 10.0F, 0.0F, -3.0F, 2, 1, 3, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 0, 13.0F, 0.0F, -3.0F, 2, 1, 3, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 0, 0.0F, -1.0F, -3.0F, 9, 2, 3, 0.0F, false));

		body1 = new ModelRenderer(this);
		body1.setRotationPoint(-1.0F, 1.0F, 0.0F);
		all.addChild(body1);
		body1.cubeList.add(new ModelBox(body1, 0, 0, -11.0F, -3.0F, -11.0F, 3, 2, 10, 0.0F, false));
		body1.cubeList.add(new ModelBox(body1, 0, 0, -8.0F, -5.0F, -13.0F, 8, 2, 3, 0.0F, false));
		body1.cubeList.add(new ModelBox(body1, 0, 0, -1.0F, -7.0F, -10.0F, 3, 2, 8, 0.0F, false));
		body1.cubeList.add(new ModelBox(body1, 0, 0, -8.0F, -9.0F, -3.0F, 7, 2, 3, 0.0F, false));

		body2 = new ModelRenderer(this);
		body2.setRotationPoint(-1.0F, 1.0F, 0.0F);
		all.addChild(body2);
		body2.cubeList.add(new ModelBox(body2, 0, 0, -10.0F, -11.0F, -12.0F, 3, 2, 10, 0.0F, false));
		body2.cubeList.add(new ModelBox(body2, 0, 0, -7.0F, -13.0F, -14.0F, 11, 2, 3, 0.0F, false));
		body2.cubeList.add(new ModelBox(body2, 0, 0, 3.0F, -15.0F, -11.0F, 3, 2, 11, 0.0F, false));
		body2.cubeList.add(new ModelBox(body2, 0, 0, -11.0F, -17.0F, -1.0F, 14, 2, 3, 0.0F, false));
		body2.cubeList.add(new ModelBox(body2, 0, 0, -13.0F, -19.0F, -15.0F, 3, 2, 14, 0.0F, false));
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
		this.head.rotateAngleY = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.0F * limbSwingAmount;
		this.body1.rotateAngleY = MathHelper.cos(limbSwing * 0.6662F) * 1.0F * limbSwingAmount;
		this.body2.rotateAngleY = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.0F * limbSwingAmount;
	}
}