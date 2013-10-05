package rareores.common.block;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class RareoresBlock extends Block {

	boolean beaconBase;
	
	@SideOnly(Side.CLIENT)
	private Icon[] icons;
	
	public RareoresBlock(int par1, Material par2Material) {
		super(par1, Material.iron);
		setCreativeTab(CreativeTabs.tabBlock);
		setStepSound(Block.soundMetalFootstep);
	}
	
	@Override
	public int damageDropped(int meta)
	{
	    return meta;

	}
	      
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister)
	{
	       icons = new Icon[8];
	            
	       for(int i = 0; i < icons.length; i++)
	       {
	        icons[i] = iconRegister.registerIcon("rareores" + ":" + (this.getUnlocalizedName().substring(5)) + i);
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
	    for (int i = 0; i < 8; i++)
	    {
	        list.add(new ItemStack(par1, 1, i));
	    }
	}
	
	@Override
	
	/**
     * Is this block useable in a beacon? If so, return true.
     */
	public boolean isBeaconBase(World worldObj, int x, int y, int z, int beaconX, int beaconY, int beaconZ)
	{
		int meta = worldObj.getBlockMetadata(x, y, z);
		
		boolean beacon;
		
		 switch(meta)
         {
                case 0:
                {
                       beacon = true;
                       break;
                }
                case 1:
                {
                       beacon = true;
                       break;
                }
                case 2:
                {
                       beacon = true;
                       break;
                }
                case 3:
                {
                       beacon = true;
                       break;
                }
                case 4:
                {
                       beacon = true;
                       break;
                }
                case 5:
                {
                       beacon = true;
                       break;
                }
                default: beacon = false;
         }
         return beacon;
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
				resistance = 25.0F;
				break;
			}
			case 1:
			{
				resistance = 37.0F;
				break;
			}
			case 2:
			{
				resistance = 60.0F;
				break;
			}
			case 3:
			{
				resistance = 30.0F;
				break;
			}
			case 4:
			{
				resistance = 40.0F;
				break;
			}
			case 5:
			{
				resistance = 50.0F;
				break;
			}
			case 6:
			{
				resistance = 100.0F;
				break;
			}
			case 7:
			{
				resistance = 25.0F;
				break;
			}
			default: resistance = 1.0F;
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
				hardness = 6.0F;
				break;
			}
			case 1:
			{
				hardness = 8.0F;
				break;
			}
			case 2:
			{
				hardness = 12.0F;
				break;
			}
			case 3:
			{
				hardness = 7.0F;
				break;
			}
			case 4:
			{
				hardness = 10.0F;
				break;
			}
			case 5:
			{
				hardness = 12.0F;
				break;
			}
			case 6:
			{
				hardness = 55.0F;
				break;
			}
			case 7:
			{
				hardness = 40.0F;
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
}
