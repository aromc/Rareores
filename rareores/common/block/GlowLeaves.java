package rareores.common.block;

import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import rareores.common.Rareores;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class GlowLeaves extends BlockLeaves
{
	Rareores mod;
   
    @SideOnly(Side.CLIENT)
    /** 1 for fast graphic. 0 for fancy graphics. used in iconArray. */
    public static int iconType;
    
    @SideOnly(Side.CLIENT)
    private Icon clear;
    
    int[] adjacentTreeBlocks;

    public GlowLeaves(int par1)
    {
        super(par1);
        this.setStepSound(soundGrassFootstep);
        this.setHardness(0.5F);
        this.setResistance(0.5F);
        this.setLightValue(.35F);
    }

    public int idDropped(int par1, Random par2Random, int par3)
    {
        return Block.sapling.blockID;
    }

    @Override
    public void dropBlockAsItemWithChance(World par1World, int par2, int par3, int par4, int par5, float par6, int par7)
    {
    	if(par1World.rand.nextInt(20)==0)
    	 this.dropBlockAsItem_do(par1World, par2, par3, par4, new ItemStack(Block.sapling, 1));
    }

    public boolean isOpaqueCube()
    {
        return iconType == 0 ? false : true;
    }

    @SideOnly(Side.CLIENT)

    /**
     * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
     */
    public Icon getIcon(int par1, int par2)
    {
        return this.iconType == 1 ? this.blockIcon : this.clear;
    }

    @SideOnly(Side.CLIENT)

    /**
     * Pass true to draw this block using fancy graphics, or false for fast graphics.
     */
    public void setGraphicsLevel(boolean par1)
    {
        this.graphicsLevel = par1;
        this.iconType = par1 ? 0 : 1;
    }

    @SideOnly(Side.CLIENT)

    /**
     * returns a list of blocks with the same ID, but different meta (eg: wood returns 4 blocks)
     */
    public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs, List par3List)
    {
        par3List.add(new ItemStack(par1, 1, 0));
    }

    /**
     * Returns an item stack containing a single instance of the current block type. 'i' is the block's subtype/damage
     * and is ignored for blocks which do not support subtypes. Blocks which cannot be harvested should return null.
     */
    protected ItemStack createStackedBlock(int par1)
    {
        return new ItemStack(this.blockID, 1, par1 & 3);
    }

    @SideOnly(Side.CLIENT)

    /**
     * When this method is called, your block should register all the icons it needs with the given IconRegister. This
     * is the only chance you get to register icons.
     */
    public void registerIcons(IconRegister iconRegister)
    {
       blockIcon = iconRegister.registerIcon(mod.modid + ":" + this.getUnlocalizedName().substring(5));
       clear = iconRegister.registerIcon(mod.modid + ":" + "LeavesClear");
    }


}