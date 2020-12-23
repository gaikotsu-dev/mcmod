package com.sample.mod.handlers;

import com.sample.mod.init.BlockInit;
import com.sample.mod.init.ItemInit;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RecipeHandler {
    public static void registerCrafting() {
        GameRegistry.addShapedRecipe(new ResourceLocation("sm:sample_ore"), new ResourceLocation("sm:sample_blocks"), new ItemStack(BlockInit.sample_ore), new Object[] {"SSS", "SIS", "SSS", 'S', Blocks.STONE, 'I', ItemInit.sample_ingot});
    }

    public static void registerSmelting() {
        GameRegistry.addSmelting(BlockInit.sample_ore, new ItemStack(ItemInit.sample_ingot), 10);
    }
}
