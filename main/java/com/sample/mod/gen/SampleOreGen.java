package com.sample.mod.gen;

import java.util.Random;

import com.sample.mod.init.BlockInit;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class SampleOreGen implements IWorldGenerator {

    private WorldGenerator sample_ore;

    public SampleOreGen() {
        sample_ore = new WorldGenMinable(BlockInit.sample_ore.getDefaultState(), 9);
    }

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,
                         IChunkProvider chunkProvider) {
        switch(world.provider.getDimension()) {
            case 0:
                runGenerator(sample_ore, world, random, chunkX, chunkZ, 50, 0, 50);
                break;
            case 1:
                break;
            case -1:
                break;
        }
    }

    private void runGenerator(WorldGenerator gen, World world, Random rand, int chunkX, int chunkZ, int chance, int minHeight, int maxHeight) {
        if (minHeight > maxHeight || minHeight < 0 || maxHeight > 256) throw new IllegalArgumentException("Ore generated out of bounds");
        int heightDiff = maxHeight - minHeight + 1;
        for (int i = 0; i < chance; i++) {
            int x = chunkX * 16 + rand.nextInt(16);
            int y = minHeight + rand.nextInt(heightDiff);
            int z = chunkZ * 16 + rand.nextInt(16);
            gen.generate(world, rand, new BlockPos(x, y, z));
        }
    }
}