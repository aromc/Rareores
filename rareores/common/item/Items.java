package rareores.common.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import rareores.common.Rareores;
import rareores.common.config.RareoresConfigIds;
import rareores.common.config.RareoresConfigNames;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Items {
	
	public static Rareores mod;
	public static RareoresConfigIds ID;
	public static RareoresConfigNames Names;
	
	public static Item miscItemsStacked;
	public static Item miscItemsNonStacked;
	
	public static void initializeItems()
	{
		miscItemsStacked = new RareoresItem(ID.StackedItemID, 64, 15).setUnlocalizedName("itemsStacked");
		
		LanguageRegistry.addName(new ItemStack(miscItemsStacked, 1, 0), Names.PherithiumScrapName);
		LanguageRegistry.addName(new ItemStack(miscItemsStacked, 1, 1), Names.CrystiniumName);
		LanguageRegistry.addName(new ItemStack(miscItemsStacked, 1, 2), Names.TophiniteName);
		LanguageRegistry.addName(new ItemStack(miscItemsStacked, 1, 3), Names.MagrolithOreName);
		LanguageRegistry.addName(new ItemStack(miscItemsStacked, 1, 4), Names.NecroniteOreName);
		LanguageRegistry.addName(new ItemStack(miscItemsStacked, 1, 5), Names.PherithiumLumpName);
		LanguageRegistry.addName(new ItemStack(miscItemsStacked, 1, 6), Names.PherithiumBarName);
		LanguageRegistry.addName(new ItemStack(miscItemsStacked, 1, 7), Names.MagrolithIngotName);
		LanguageRegistry.addName(new ItemStack(miscItemsStacked, 1, 8), Names.NecroniteIngotName);
		LanguageRegistry.addName(new ItemStack(miscItemsStacked, 1, 9), Names.TrillintName);
		LanguageRegistry.addName(new ItemStack(miscItemsStacked, 1, 10), Names.PIOName);
		LanguageRegistry.addName(new ItemStack(miscItemsStacked, 1, 11), Names.DarkEssenceName);
		LanguageRegistry.addName(new ItemStack(miscItemsStacked, 1, 12), Names.GlowStickName);
		LanguageRegistry.addName(new ItemStack(miscItemsStacked, 1, 13), Names.PherithiumFlintName);
		LanguageRegistry.addName(new ItemStack(miscItemsStacked, 1, 14), Names.PherithiumArrowName);
		
		miscItemsNonStacked = new RareoresItem(ID.NonStackedItemID, 1, 16).setUnlocalizedName("itemsNonStacked");
		
		LanguageRegistry.addName(new ItemStack(miscItemsNonStacked, 1, 0), Names.EmblemName);
		LanguageRegistry.addName(new ItemStack(miscItemsNonStacked, 1, 1), Names.EmblemVisionName);
		LanguageRegistry.addName(new ItemStack(miscItemsNonStacked, 1, 2), Names.EmblemHasteName);
		LanguageRegistry.addName(new ItemStack(miscItemsNonStacked, 1, 3), Names.EmblemStrengthName);
		LanguageRegistry.addName(new ItemStack(miscItemsNonStacked, 1, 4), Names.EmblemResistanceName);
		LanguageRegistry.addName(new ItemStack(miscItemsNonStacked, 1, 5), Names.EmblemSpeedName);
		LanguageRegistry.addName(new ItemStack(miscItemsNonStacked, 1, 6), Names.EmblemJumpName);
		LanguageRegistry.addName(new ItemStack(miscItemsNonStacked, 1, 7), Names.EmblemMiningName);
		LanguageRegistry.addName(new ItemStack(miscItemsNonStacked, 1, 8), Names.EmblemFightName);
		LanguageRegistry.addName(new ItemStack(miscItemsNonStacked, 1, 9), Names.EmblemFlightName);
		LanguageRegistry.addName(new ItemStack(miscItemsNonStacked, 1, 10), Names.ERName);
		LanguageRegistry.addName(new ItemStack(miscItemsNonStacked, 1, 11), Names.ERSName);
		LanguageRegistry.addName(new ItemStack(miscItemsNonStacked, 1, 12), Names.NetherBaseName);
		LanguageRegistry.addName(new ItemStack(miscItemsNonStacked, 1, 13), Names.NetherBladeName);
		LanguageRegistry.addName(new ItemStack(miscItemsNonStacked, 1, 14), Names.FuelUpName);
		LanguageRegistry.addName(new ItemStack(miscItemsNonStacked, 1, 15), Names.XpUpName);
	
	}

}
