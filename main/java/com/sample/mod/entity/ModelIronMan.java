package com.sample.mod.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.util.math.MathHelper;

public class ModelIronMan extends ModelBase {
	private final ModelRenderer all;
	private final ModelRenderer field_178730_v;
	private final ModelRenderer field_178722_k;
	private final ModelRenderer field_178724_i;
	private final ModelRenderer field_78115_e;
	private final ModelRenderer field_78116_c;
	private final ModelRenderer field_178721_j;
	private final ModelRenderer field_178723_h;
	private final ModelRenderer field_178733_c;
	private final ModelRenderer field_178720_f;
	private final ModelRenderer field_178732_b;
	private final ModelRenderer field_178731_d;
	private final ModelRenderer field_178734_a;
	private final ModelRenderer field_178729_w;
	private final ModelRenderer field_178736_x;

	public ModelIronMan() {
 		textureWidth = 64;
		textureHeight = 64;

		all = new ModelRenderer(this);
		all.setRotationPoint(0.0F, 4.0F, 0.0F);
		setRotationAngle(all, 1.2217F, 0.0F, 0.0F);

		field_178730_v = new ModelRenderer(this);
		field_178730_v.setRotationPoint(0.0F, -4.0F, 0.0F);
		all.addChild(field_178730_v);
		field_178730_v.cubeList.add(new ModelBox(field_178730_v, 16, 32, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.25F, false));

		field_178722_k = new ModelRenderer(this);
		field_178722_k.setRotationPoint(1.9F, 8.0F, 0.1F);
		all.addChild(field_178722_k);
		field_178722_k.cubeList.add(new ModelBox(field_178722_k, 16, 48, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F, false));

		field_178724_i = new ModelRenderer(this);
		field_178724_i.setRotationPoint(5.0F, -2.0F, 0.0F);
		setRotationAngle(field_178724_i, 0.0F, 0.0F, -0.1F);
		all.addChild(field_178724_i);
		field_178724_i.cubeList.add(new ModelBox(field_178724_i, 32, 48, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F, false));

		field_78115_e = new ModelRenderer(this);
		field_78115_e.setRotationPoint(0.0F, -4.0F, 0.0F);
		all.addChild(field_78115_e);
		field_78115_e.cubeList.add(new ModelBox(field_78115_e, 16, 16, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F, false));

		field_78116_c = new ModelRenderer(this);
		field_78116_c.setRotationPoint(0.0F, -4.0F, 0.0F);
		all.addChild(field_78116_c);
		field_78116_c.cubeList.add(new ModelBox(field_78116_c, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F, false));

		field_178721_j = new ModelRenderer(this);
		field_178721_j.setRotationPoint(-1.9F, 8.0F, 0.1F);
		all.addChild(field_178721_j);
		field_178721_j.cubeList.add(new ModelBox(field_178721_j, 0, 16, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F, false));

		field_178723_h = new ModelRenderer(this);
		field_178723_h.setRotationPoint(-5.0F, -2.0F, 0.0F);
		setRotationAngle(field_178723_h, 0.0F, 0.0F, 0.1F);
		all.addChild(field_178723_h);
		field_178723_h.cubeList.add(new ModelBox(field_178723_h, 40, 16, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F, false));

		field_178733_c = new ModelRenderer(this);
		field_178733_c.setRotationPoint(1.9F, 8.0F, 0.1F);
		all.addChild(field_178733_c);
		field_178733_c.cubeList.add(new ModelBox(field_178733_c, 0, 48, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.25F, false));

		field_178720_f = new ModelRenderer(this);
		field_178720_f.setRotationPoint(0.0F, -4.0F, 0.0F);
		all.addChild(field_178720_f);
		field_178720_f.cubeList.add(new ModelBox(field_178720_f, 32, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.5F, false));

		field_178732_b = new ModelRenderer(this);
		field_178732_b.setRotationPoint(-5.0F, -2.0F, 0.0F);
		setRotationAngle(field_178732_b, 0.0F, 0.0F, 0.1F);
		all.addChild(field_178732_b);
		field_178732_b.cubeList.add(new ModelBox(field_178732_b, 40, 32, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.25F, false));

		field_178731_d = new ModelRenderer(this);
		field_178731_d.setRotationPoint(-1.9F, 8.0F, 0.1F);
		all.addChild(field_178731_d);
		field_178731_d.cubeList.add(new ModelBox(field_178731_d, 0, 32, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.25F, false));

		field_178734_a = new ModelRenderer(this);
		field_178734_a.setRotationPoint(5.0F, -2.0F, 0.0F);
		setRotationAngle(field_178734_a, 0.0F, 0.0F, -0.1F);
		all.addChild(field_178734_a);
		field_178734_a.cubeList.add(new ModelBox(field_178734_a, 48, 48, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.25F, false));

		field_178729_w = new ModelRenderer(this);
		field_178729_w.setRotationPoint(0.0F, -4.0F, 0.0F);
		all.addChild(field_178729_w);
		field_178729_w.cubeList.add(new ModelBox(field_178729_w, 0, 0, -5.0F, 0.0F, -1.0F, 10, 16, 1, 0.0F, false));

		field_178736_x = new ModelRenderer(this);
		field_178736_x.setRotationPoint(0.0F, -4.0F, 0.0F);
		all.addChild(field_178736_x);
		field_178736_x.cubeList.add(new ModelBox(field_178736_x, 24, 0, -3.0F, -6.0F, -1.0F, 6, 6, 1, 0.0F, false));
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
}