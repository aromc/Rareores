package rareores.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import rareores.common.Rareores;
import rareores.common.config.RareoresConfigIds;
import rareores.common.config.RareoresConfigNames;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Blocks {
	
	public static Rareores mod;
	public static RareoresConfigIds ID;
	public static RareoresConfigNames Names;
	
	public static Block miscBlocks;
	public static Block oreBlocks;
	
	public static Block glowLog;
	public static Block glowLeaf;
	public static BlockFlower glowSapling;
	
	public static void initializeBlocks()
	{
		//Misc Metadata Blocks
		miscBlocks = new RareoresBlock(ID.MiscBlocksID, Material.iron).setUnlocalizedName("miscBlocks");
		GameRegistry.registerBlock(miscBlocks, RareoresItemBlock.class, mod.modid + (miscBlocks.getUnlocalizedName().substring(5)));
        
		LanguageRegistry.addName(new ItemStack(miscBlocks, 1, 0), Names.PherithiumBlockName);
		LanguageRegistry.addName(new ItemStack(miscBlocks, 1, 1), Names.CrystiniumBlockName);
		LanguageRegistry.addName(new ItemStack(miscBlocks, 1, 2), Names.TophiniteBlockName);
		LanguageRegistry.addName(new ItemStack(miscBlocks, 1, 3), Names.MagrolithBlockName);
		LanguageRegistry.addName(new ItemStack(miscBlocks, 1, 4), Names.NecroniteBlockName);
		LanguageRegistry.addName(new ItemStack(miscBlocks, 1, 5), Names.TrillintBlockName);
		LanguageRegistry.addName(new ItemStack(miscBlocks, 1, 6), Names.PSOName);
		LanguageRegistry.addName(new ItemStack(miscBlocks, 1, 7), Names.OILName);
		
		//Ore Blocks - metadata
		oreBlocks = new RareoresBlockOre(ID.OresID, Material.rock).setUnlocalizedName("oreBlocks");
		GameRegistry.registerBlock(oreBlocks, RareoresItemBlock.class, mod.modid + (oreBlocks.getUnlocalizedName().substring(5)));
		
		LanguageRegistry.addName(new ItemStack(oreBlocks, 1, 0), Names.PherithiumOreName);
		LanguageRegistry.addName(new ItemStack(oreBlocks, 1, 1), Names.CrystiniumOreName);
		LanguageRegistry.addName(new ItemStack(oreBlocks, 1, 2), Names.TophiniteOreName);
		LanguageRegistry.addName(new ItemStack(oreBlocks, 1, 3), Names.MagrolithOreName);
		LanguageRegistry.addName(new ItemStack(oreBlocks, 1, 4), Names.NecroniteOreName);
	
		
		glowLog = new GlowLog(ID.RarelogID).setUnlocalizedName("glowLog");
		GameRegistry.registerBlock(glowLog, glowLog.getUnlocalizedName().substring(5));
		LanguageRegistry.addName(glowLog,Names.RarelogName);
		
		glowLeaf = new GlowLeaves(ID.RareleavesID).setUnlocalizedName("glowLeaf");
		GameRegistry.registerBlock(glowLeaf, glowLeaf.getUnlocalizedName().substring(5));
		LanguageRegistry.addName(glowLeaf,Names.RareleavesName);
		
		glowSapling = (BlockFlower) new GlowSapling(ID.RaresaplingID).setUnlocalizedName("glowSapling");
		GameRegistry.registerBlock(glowSapling, glowSapling.getUnlocalizedName().substring(5));
		LanguageRegistry.addName(glowSapling,Names.RaresaplingName);
		
		MinecraftForge.setBlockHarvestLevel(miscBlocks, 0, "pickaxe", 3);
		MinecraftForge.setBlockHarvestLevel(miscBlocks, 1, "pickaxe", 4);
		MinecraftForge.setBlockHarvestLevel(miscBlocks, 2, "pickaxe", 5);
		MinecraftForge.setBlockHarvestLevel(miscBlocks, 3, "pickaxe", 3);
		MinecraftForge.setBlockHarvestLevel(miscBlocks, 4, "pickaxe", 4);
		MinecraftForge.setBlockHarvestLevel(miscBlocks, 5, "pickaxe", 3);
		MinecraftForge.setBlockHarvestLevel(miscBlocks, 6, "pickaxe", 3);
		MinecraftForge.setBlockHarvestLevel(miscBlocks, 7, "pickaxe", 3);
		MinecraftForge.setBlockHarvestLevel(oreBlocks, 0, "pickaxe", 3);
		MinecraftForge.setBlockHarvestLevel(oreBlocks, 1, "pickaxe", 4);
		MinecraftForge.setBlockHarvestLevel(oreBlocks, 2, "pickaxe", 5);
		MinecraftForge.setBlockHarvestLevel(oreBlocks, 3, "pickaxe", 3);
		MinecraftForge.setBlockHarvestLevel(oreBlocks, 4, "pickaxe", 4);
		
	}
}
