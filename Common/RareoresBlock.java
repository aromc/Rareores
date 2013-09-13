package rareores.common;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.world.World;

public class RareoresBlock extends Block {

	boolean beaconBase;
	
	public RareoresBlock(int par1, Material par2Material, boolean par3) {
		super(par1, par2Material);
		beaconBase = par3;
	}

	@Override
	public void registerIcons(IconRegister iconRegister)
	{
	         this.blockIcon = iconRegister.registerIcon("Rareores:"+ this.getUnlocalizedName().substring(5));
	}
	
	@Override
	public boolean isBeaconBase(World worldObj, int x, int y, int z, int beaconX, int beaconY, int beaconZ)
	{
	    return beaconBase;
	}
}
