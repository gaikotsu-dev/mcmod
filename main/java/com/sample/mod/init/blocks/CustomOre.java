package com.sample.mod.init.blocks;

import net.minecraft.block.material.Material;

public class CustomOre extends CustomBlock {

    public CustomOre(String name, float hardness, float resistance, int harvestLevel) {
        super(name, hardness, resistance);
        setHarvestLevel("pickaxe", harvestLevel);
    }

    public CustomOre(Material materialIn) {
        super(materialIn);
    }
}