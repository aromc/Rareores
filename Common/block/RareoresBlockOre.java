package rareores.common.block;

import java.util.List;
import java.util.Random;

import rareores.common.item.Items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class RareoresBlockOre extends Block {

	
	@SideOnly(Side.CLIENT)
	private Icon[] icons;
	
	public RareoresBlockOre(int id, Material blockMaterial )
	{
		super(id, blockMaterial);
		setCreativeTab(CreativeTabs.tabBlock);
	}
	
	@Override
	public int damageDropped(int meta)
	{
	    return meta;

	}
	      
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister)
	{
	       icons = new Icon[5];
	            
	       for(int i = 0; i < icons.length; i++)
	       {
	        icons[i] = iconRegister.registerIcon("rareores" + ":" + (this.getUnlocalizedName().substring(5))+i);
	       }
	}
	
	@SideOnly(Side.CLIENT)
	
	/**
     * From the specified side and block metadata retrieves the blocks texture.
     * Args: side, metadata
     */
	public Icon getIcon(int blockSide, int metaData)
	{
	       return icons[metaData];
	}
	
	@SideOnly(Side.CLIENT)
	
	/**
     * returns a list of blocks with the same ID, but different meta.
     */
	public void getSubBlocks(int par1, CreativeTabs tab, List list)
	{
	    for (int i = 0; i < 5; i++)
	    {
	        list.add(new ItemStack(par1, 1, i));
	    }
	}
	
	
	@Override
	public int idDropped(int par1, Random par2Random, int par3)
	{
		return Items.miscItemsStacked.itemID;
	}
	
	@Override
	public void dropBlockAsItemWithChance(World par1World, int par2, int par3, int par4, int meta, float par6, int par7)
	{
		int xp;
		super.dropBlockAsItemWithChance(par1World, par2, par3, par4, meta, par6, par7);

		if (this.idDropped(meta, par1World.rand, par7) != this.blockID)
		{
			switch(meta)
	         {
	                case 0:
	                {
	                	xp = MathHelper.getRandomIntegerInRange(par1World.rand, 8,13);
	                    break;
	                }
	                case 1:
	                {
	                	xp = MathHelper.getRandomIntegerInRange(par1World.rand, 17,25);
	                    break;
	                }
	                case 2:
	                {
	                	xp = MathHelper.getRandomIntegerInRange(par1World.rand, 37,53);
	                    break;
	                }
	                case 3:
	                {
	                	xp = MathHelper.getRandomIntegerInRange(par1World.rand, 11,17);
	                    break;
	                }
	                case 4:
	                {
	                	xp = MathHelper.getRandomIntegerInRange(par1World.rand, 22,30);
	                    break;
	                }
	                default: xp = 0;
	         }
			this.dropXpOnBlockBreak(par1World, par2, par3, par4, xp);
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
	
	@Override
	protected boolean canSilkHarvest()
    {
		return true;
    }
	
	@Override
	public float getExplosionResistance(Entity par1Entity, World world, int x, int y, int z, double explosionX, double explosionY, double explosionZ)
    {
		int meta = world.getBlockMetadata(x, y, z);
		float resistance = 0.0F;
		
		switch (meta)
		{
			case 0:
			{
				resistance = 15.0F;
				break;
			}
			case 1:
			{
				resistance = 25.0F;
				break;
			}
			case 2:
			{
				resistance = 35.0F;
				break;
			}
			case 3:
			{
				resistance = 20.0F;
				break;
			}
			case 4:
			{
				resistance = 30.0F;
				break;
			}
			default: resistance = 15.0F;
		}
		return resistance;
    }
	
	@Override
	public float getBlockHardness(World world, int x, int y, int z)
	{
		int meta = world.getBlockMetadata(x, y, z);
		float hardness = 0.0F;
		
		switch (meta)
		{
			case 0:
			{
				hardness = 4.0F;
				break;
			}
			case 1:
			{
				hardness = 6.0F;
				break;
			}
			case 2:
			{
				hardness = 8.0F;
				break;
			}
			case 3:
			{
				hardness = 5.0F;
				break;
			}
			case 4:
			{
				hardness = 7.0F;
				break;
			}
			
			default: hardness = 1.0F;
		}
		return hardness;
	}
	
	@Override
	 public int getLightValue(IBlockAccess world, int x, int y, int z)
    {
       int meta = world.getBlockMetadata(x, y, z);
       int light;
       switch (meta)
		{
			case 2:
			{
				light = 15;
				break;
			}
			default: light = 0;
		}
		return light;
    }

	@Override
	 public int quantityDropped(int meta, int fortune, Random random)
	    {
			if(meta == 0)
			{
				return quantityDroppedWithBonus(fortune, random) * (random.nextInt(6) + 2);
			}
			else
			{
				return quantityDroppedWithBonus(fortune, random);
			}
	    }
}
