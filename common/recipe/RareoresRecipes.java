package rareores.common.recipe;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import rareores.common.block.Blocks;
import rareores.common.item.Items;
import cpw.mods.fml.common.registry.GameRegistry;

public class RareoresRecipes {
	
	public static Blocks B;
	public static Items I;
	
	public static void initializerecipes()
	{
		GameRegistry.addRecipe(new ItemStack(B.miscBlocks, 1, 0), new Object[]{
            "XXX",
            "XXX",
            "XXX",
            'X', new ItemStack(I.miscItemsStacked, 1, 6)
     });
		
		GameRegistry.addRecipe(new ItemStack(B.miscBlocks, 1, 1), new Object[]{
            "XXX",
            "XXX",
            "XXX",
            'X', new ItemStack(I.miscItemsStacked, 1, 1)
     });
		
		GameRegistry.addRecipe(new ItemStack(B.miscBlocks, 1, 2), new Object[]{
            "XXX",
            "XXX",
            "XXX",
            'X', new ItemStack(I.miscItemsStacked, 1, 2)
            
     });
		
		GameRegistry.addRecipe(new ItemStack(B.miscBlocks, 1, 3), new Object[]{
            "XXX",
            "XXX",
            "XXX",
            'X', new ItemStack(I.miscItemsStacked, 1, 7)
     });
		
		GameRegistry.addRecipe(new ItemStack(B.miscBlocks, 1, 4), new Object[]{
            "XXX",
            "XXX",
            "XXX",
            'X', new ItemStack(I.miscItemsStacked, 1, 8)
     });
		
		
		GameRegistry.addShapelessRecipe(new ItemStack(I.miscItemsStacked,9 ,6 ), new Object[]{
	            new ItemStack(B.miscBlocks, 1, 0)
	 });
		
		GameRegistry.addShapelessRecipe(new ItemStack(I.miscItemsStacked,9 ,1 ), new Object[]{
            new ItemStack(B.miscBlocks, 1, 1)
	 });
		
		GameRegistry.addShapelessRecipe(new ItemStack(I.miscItemsStacked,9 ,2 ), new Object[]{
            new ItemStack(B.miscBlocks, 1, 2)
	});
		
		GameRegistry.addShapelessRecipe(new ItemStack(I.miscItemsStacked,9 ,7 ), new Object[]{
            new ItemStack(B.miscBlocks, 1, 3)
	});
		
		GameRegistry.addShapelessRecipe(new ItemStack(I.miscItemsStacked,9 ,8 ), new Object[]{
            new ItemStack(B.miscBlocks, 1, 4)
	});
		
		GameRegistry.addRecipe(new ItemStack(I.miscItemsStacked, 1, 5), new Object[]{
            "XXX",
            "XXX",
            'X', new ItemStack(I.miscItemsStacked, 1, 0)
     });
		
	}

}
