package com.sample.mod.init;

import com.sample.mod.init.items.CustomIngot;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ItemInit {
    public static Item sample_ingot;

    public static void init() {
        sample_ingot = new CustomIngot("sample_ingot");
    }

    public static void register() {
        registerItem(sample_ingot);
    }

    public static void registerItem(Item item) {
        ForgeRegistries.ITEMS.register(item);
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
