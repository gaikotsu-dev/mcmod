package com.sample.mod.init.items;

import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class BlasterSword extends ItemSword {

    public BlasterSword(String name) {
        super(EnumHelper.addToolMaterial(name, 1, 10, 5, 10, 1));
        setRegistryName(name);
        setUnlocalizedName(name);
    }
}
