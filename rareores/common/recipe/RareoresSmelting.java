package rareores.common.recipe;

import rareores.common.block.Blocks;
import rareores.common.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import cpw.mods.fml.common.registry.GameRegistry;

public class RareoresSmelting {
	
	
	public static void initializeSmelting()
	{
		FurnaceRecipes.smelting().addSmelting(Items.miscItemsStacked.itemID, 5, new ItemStack(Items.miscItemsStacked, 1, 6 ), 1.0F);
		FurnaceRecipes.smelting().addSmelting(Items.miscItemsStacked.itemID, 3, new ItemStack(Items.miscItemsStacked, 1, 7 ), 1.0F);
		FurnaceRecipes.smelting().addSmelting(Items.miscItemsStacked.itemID, 4, new ItemStack(Items.miscItemsStacked, 1, 8 ), 1.0F);
		FurnaceRecipes.smelting().addSmelting(Blocks.miscBlocks.blockID, 6, new ItemStack(Items.miscItemsStacked, 1, 10 ), 0.5F);
		FurnaceRecipes.smelting().addSmelting(Blocks.miscBlocks.blockID, 7, new ItemStack(Items.miscItemsStacked, 1, 9 ), 1.0F);
	}

}
