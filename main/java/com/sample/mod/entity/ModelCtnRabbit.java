package com.sample.mod.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.util.math.MathHelper;

public class ModelCtnRabbit extends ModelBase {
	private final ModelRenderer armL;
	private final ModelRenderer armR;
	private final ModelRenderer head;
	private final ModelRenderer bone6;
	private final ModelRenderer bone7;
	private final ModelRenderer bone8;
	private final ModelRenderer bone4;
	private final ModelRenderer bone3;
	private final ModelRenderer bone5;
	private final ModelRenderer body;
	private final ModelRenderer legL;
	private final ModelRenderer legR;

	public ModelCtnRabbit() {
		textureWidth = 128;
		textureHeight = 128;

		armL = new ModelRenderer(this);
		armL.setRotationPoint(4.0F, -16.0F, 0.0F);
		setRotationAngle(armL, 0.0F, 0.0F, -0.3491F);
		armL.cubeList.add(new ModelBox(armL, 0, 0, -2.0F, -1.0F, -2.0F, 4, 19, 4, 0.0F, false));
		armL.cubeList.add(new ModelBox(armL, 106, 119, -3.0F, 17.9847F, -3.0F, 5, 3, 6, 0.0F, false));
		armL.cubeList.add(new ModelBox(armL, 124, 121, 1.8985F, 20.2744F, -1.0F, 1, 6, 1, 0.0F, false));
		armL.cubeList.add(new ModelBox(armL, 124, 121, 1.8985F, 20.2744F, -3.0F, 1, 6, 1, 0.0F, false));
		armL.cubeList.add(new ModelBox(armL, 124, 122, -3.484F, 20.4436F, -4.0F, 1, 5, 1, 0.0F, false));
		armL.cubeList.add(new ModelBox(armL, 124, 121, 1.8985F, 20.2744F, 2.0F, 1, 6, 1, 0.0F, false));

		armR = new ModelRenderer(this);
		armR.setRotationPoint(-8.0F, -16.0F, 0.0F);
		setRotationAngle(armR, 0.0F, 0.0F, 0.3491F);
		armR.cubeList.add(new ModelBox(armR, 0, 0, -2.0F, -1.0F, -2.0F, 4, 20, 4, 0.0F, false));
		armR.cubeList.add(new ModelBox(armR, 104, 119, -2.9335F, 19.0487F, -3.0F, 6, 3, 6, 0.0F, false));
		armR.cubeList.add(new ModelBox(armR, 118, 120, -3.5565F, 21.2141F, 2.0F, 1, 6, 1, 0.0F, false));
		armR.cubeList.add(new ModelBox(armR, 115, 119, -3.5565F, 21.2141F, -1.0F, 1, 6, 1, 0.0F, false));
		armR.cubeList.add(new ModelBox(armR, 124, 121, -3.5565F, 21.2141F, -3.0F, 1, 6, 1, 0.0F, false));
		armR.cubeList.add(new ModelBox(armR, 124, 122, 2.7657F, 21.0413F, -4.0F, 1, 5, 1, 0.0F, false));

		head = new ModelRenderer(this);
		head.setRotationPoint(-2.0F, -18.0F, 0.0F);
		head.cubeList.add(new ModelBox(head, 0, 107, -5.0F, -11.0F, -4.0F, 10, 9, 8, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 0, -1.0F, -1.6498F, -1.0F, 2, 3, 2, 0.0F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(-4.0F, -13.0F, 0.0F);
		setRotationAngle(bone6, 0.0F, 0.0F, -0.3491F);
		head.addChild(bone6);
		bone6.cubeList.add(new ModelBox(bone6, 1, 1, -2.0F, -4.0F, -2.0F, 3, 6, 4, 0.0F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone7, 0.0F, 0.0F, -0.2618F);
		bone6.addChild(bone7);
		bone7.cubeList.add(new ModelBox(bone7, 1, 1, -8.0F, -3.5634F, -2.0F, 7, 2, 4, 0.0F, false));

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(-6.0F, 2.0F, 0.0F);
		head.addChild(bone8);
		bone8.cubeList.add(new ModelBox(bone8, 0, 0, 9.0F, -20.0F, -2.0F, 2, 7, 4, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 0, 0, 11.0F, -20.0F, -2.0F, 8, 2, 4, 0.0F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(2.0F, 42.0F, 0.0F);
		head.addChild(bone4);
		bone4.cubeList.add(new ModelBox(bone4, 104, 122, -5.0F, -46.0F, -4.0F, 6, 1, 0, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(4.0F, -4.0F, 0.0F);
		setRotationAngle(bone3, 0.0F, 0.0F, -0.2618F);
		head.addChild(bone3);
		bone3.cubeList.add(new ModelBox(bone3, 112, 122, -1.9848F, -0.1736F, -4.0F, 3, 1, 0, 0.0F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(-3.0F, -3.0F, 0.0F);
		setRotationAngle(bone5, 0.0F, 0.0F, 0.3491F);
		head.addChild(bone5);
		bone5.cubeList.add(new ModelBox(bone5, 108, 126, -2.0F, -1.0F, -4.0F, 2, 1, 0, 0.0F, false));

		body = new ModelRenderer(this);
		body.setRotationPoint(-2.0F, -12.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 0, 0, -3.0F, 11.0F, -2.0F, 6, 1, 4, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 28, 38, -4.0F, -5.0F, -2.0F, 8, 16, 4, 0.0F, false));

		legL = new ModelRenderer(this);
		legL.setRotationPoint(2.0F, 0.0F, 0.0F);
		legL.cubeList.add(new ModelBox(legL, 0, 3, -2.0F, -1.0F, -2.0F, 4, 25, 4, 0.0F, false));

		legR = new ModelRenderer(this);
		legR.setRotationPoint(-6.0F, 0.0F, 0.0F);
		legR.cubeList.add(new ModelBox(legR, 0, 0, -2.0F, -1.0F, -2.0F, 4, 25, 4, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		armL.render(f5);
		armR.render(f5);
		head.render(f5);
		body.render(f5);
		legL.render(f5);
		legR.render(f5);
	}
	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
							  float headPitch, float scaleFactor, Entity entityIn)
	{
		this.armR.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
		this.armL.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
		this.legR.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
		this.legL.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
		this.head.rotateAngleZ = MathHelper.cos(limbSwing * 0.6662F) * 0.2F * limbSwingAmount;
	}
}