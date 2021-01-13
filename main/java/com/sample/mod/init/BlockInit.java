package com.sample.mod.init;

import com.sample.mod.init.blocks.CustomBlock;
import com.sample.mod.init.blocks.CustomBlock2;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class BlockInit {
    public static Block custom_block, custom_block2;

    public static void init() {
        custom_block = new CustomBlock("custom_block", 10.0F, 100.0F);
        custom_block2 = new CustomBlock2("custom_block2", 20.0F, 200.0F);
    }

    public static void register() {
        registerBlock(custom_block);
        registerBlock(custom_block2);
    }

    public static void registerBlock(Block block) {
        ForgeRegistries.ITEMS.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
        ForgeRegistries.BLOCKS.register(block);
    }

    public static void registerRenders() {
        registerRender(custom_block);
        registerRender(custom_block2);
    }

    public static void registerRender(Block block) {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
    }
}
