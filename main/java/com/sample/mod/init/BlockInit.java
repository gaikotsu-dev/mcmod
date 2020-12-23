package com.sample.mod.init;

import com.sample.mod.init.blocks.CustomOre;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class BlockInit {
    public static Block sample_ore, sample_ore2;

    public static void init() {
        sample_ore = new CustomOre("sample_ore", 2.0F, 4.0F, 2);
        //sample_ore2 = new CustomOre("sample_ore2", 2.0F, 4.0F, 2);
    }

    public static void register() {
        registerBlock(sample_ore);
        //registerBlock(sample_ore2);
    }

    public static void registerBlock(Block block) {
        ForgeRegistries.BLOCKS.register(block);
        block.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        ItemBlock item = new ItemBlock(block);
        item.setRegistryName(block.getRegistryName());
        ForgeRegistries.ITEMS.register(item);
    }

    public static void registerRenders() {
        registerRender(sample_ore);
        //registerRender(sample_ore2);
    }

    public static void registerRender(Block block) {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
    }
}
