package rareores.common.element;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import rareores.common.Rareores;
import rareores.common.block.Blocks;
import rareores.common.config.RareoresConfigIds;
import rareores.common.config.RareoresConfigNames;
import rareores.common.item.Items;
import rareores.common.item.tool.RareoresTools;
import rareores.common.recipe.RareoresRecipes;
import rareores.common.recipe.RareoresSmelting;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGeneratorRareores implements IWorldGenerator {

	public static Items item;
	public static Blocks block;
	public static Rareores mod;
	public static RareoresRecipes crafting;
	public static RareoresSmelting smelting;
	public static RareoresTools tools;
	public static RareoresConfigIds ID;
	public static RareoresConfigNames names;
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) 
	{
		switch(world.provider.dimensionId)
		{
			case -1: generateNether(world, random,chunkX*16,chunkZ*16);
			case 0: generateSurface(world, random,chunkX*16,chunkZ*16);
		}
	}

	private void generateSurface(World world, Random random, int X, int Z) 
	{
		//Pherithium Generation
		if (random.nextInt(2) == 0)
		{
			int Xcoord = X + random.nextInt(16);
			int Zcoord = Z + random.nextInt(16);
			int Ycoord = random.nextInt(13)+2;
		
			(new WorldGenMinable(block.oreBlocks.blockID, 0, 5 + random.nextInt(1), Block.stone.blockID)).generate(world, random, Xcoord, Ycoord, Zcoord);
		}
		
		//Crystinium Generation
		if (random.nextInt(7) == 0)
		{
			int Xcoord = X + random.nextInt(16);
			int Zcoord = Z + random.nextInt(16);
			int Ycoord = random.nextInt(12)+2;
			(new WorldGenMinable(block.oreBlocks.blockID, 1, 4, Block.stone.blockID)).generate(world, random, Xcoord, Ycoord, Zcoord);
		}
		
		//Tophinite Generation
		if (random.nextInt(18) == 0)
		{
			int Xcoord = X + random.nextInt(16);
			int Zcoord = Z + random.nextInt(16);
			int Ycoord = random.nextInt(12)+1;
			(new WorldGenMinable(block.oreBlocks.blockID, 2, 3, Block.stone.blockID)).generate(world, random, Xcoord, Ycoord, Zcoord);
		}
		
	}

	private void generateNether(World world, Random random, int X, int Z) 
	{
		//Main Magrolith Generation
		for(int i = 0; i < 2; i++)
		{
			int Xcoord = X + random.nextInt(16);
			int Zcoord = Z + random.nextInt(16);
			int Ycoord = random.nextInt(128);
			(new WorldGenMinable(block.oreBlocks.blockID, 3, 3 + random.nextInt(1), Block.netherrack.blockID)).generate(world, random, Xcoord, Ycoord, Zcoord);
		}
		
		//Main Necronite Generation
		if(random.nextInt(5) < 4)
		{
			int Xcoord = X + random.nextInt(16);
			int Zcoord = Z + random.nextInt(16);
			int Ycoord = random.nextInt(128);
			(new WorldGenMinable(block.oreBlocks.blockID, 4, 3, Block.netherrack.blockID)).generate(world, random, Xcoord, Ycoord, Zcoord);
		}
		
		//Misc Magrolith Generation
		if(random.nextInt(5) < 2)
		{
			int Xcoord = X + random.nextInt(16);
			int Zcoord = Z + random.nextInt(16);
			int Ycoord = random.nextInt(26)+100;
			(new WorldGenMinable(block.oreBlocks.blockID, 3, 3, Block.netherrack.blockID)).generate(world, random, Xcoord, Ycoord, Zcoord);
		}
		
		//Misc Magrolith Generation
		if(random.nextInt(5) < 2)
		{
			int Xcoord = X + random.nextInt(16);
			int Zcoord = Z + random.nextInt(16);
			int Ycoord = random.nextInt(25);
			(new WorldGenMinable(block.oreBlocks.blockID, 3, 3, Block.netherrack.blockID)).generate(world, random, Xcoord, Ycoord, Zcoord);
		}
		
		//Misc Necronite Generation
		if(random.nextInt(7) == 1)
		{
			int Xcoord = X + random.nextInt(16);
			int Zcoord = Z + random.nextInt(16);
			int Ycoord = random.nextInt(20)+104;
			(new WorldGenMinable(block.oreBlocks.blockID, 4, 3, Block.netherrack.blockID)).generate(world, random, Xcoord, Ycoord, Zcoord);
		}
		
		//Misc Necronite Generation
		if(random.nextInt(7) == 1)
		{
			int Xcoord = X + random.nextInt(16);
			int Zcoord = Z + random.nextInt(16);
			int Ycoord = random.nextInt(20);
			(new WorldGenMinable(block.oreBlocks.blockID, 4, 3, Block.netherrack.blockID)).generate(world, random, Xcoord, Ycoord, Zcoord);
		}
	}
}
