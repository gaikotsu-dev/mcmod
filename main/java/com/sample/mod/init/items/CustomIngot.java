package com.sample.mod.init.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CustomIngot extends Item {

    public CustomIngot(String name) {
        setRegistryName(name);
        setCreativeTab(CreativeTabs.MATERIALS);
        setUnlocalizedName(name);
    }
}