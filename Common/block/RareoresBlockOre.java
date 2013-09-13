package rareores.common.block;

import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import rareores.common.RareoresBlock;

public class RareoresBlockOre extends RareoresBlock {

	Item item;
	
	public RareoresBlockOre(int id, Material blockMaterial, Item drop, int xpMin, int xpMax) {
		super(id, blockMaterial, false);
		item = drop;
	}
	
	@Override
	public int idDropped(int par1, Random par2Random, int par3)
	{
		return item.itemID;
	}
	
	@Override
	public void dropBlockAsItemWithChance(World par1World, int par2, int par3, int par4, int par5, float par6, int par7)
	   {
	       super.dropBlockAsItemWithChance(par1World, par2, par3, par4, par5, par6, par7);

	       if (this.idDropped(par5, par1World.rand, par7) != this.blockID)
	       {
	    	   int var8 = MathHelper.getRandomIntegerInRange(par1World.rand, 8, 14);
	    	   this.dropXpOnBlockBreak(par1World, par2, par3, par4, var8);
	       }
	    }
	 
	@Override
	 public int quantityDroppedWithBonus(int par1, Random par2Random)
	    {
	        if (par1 > 0 && this.blockID != this.idDropped(0, par2Random, par1))
	        {
	            int var3 = par2Random.nextInt(par1 + 2) - 1;

	            if (var3 < 0)
	            {
	                var3 = 0;
	            }

	            return this.quantityDropped(par2Random) * (var3 + 1);
	        }
	        else
	        {
	            return this.quantityDropped(par2Random);
	        }
	    }

}
