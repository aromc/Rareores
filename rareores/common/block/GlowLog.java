package rareores.common.block;

import java.util.List;
import java.util.Random;
import rareores.common.Rareores;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLog;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class GlowLog extends BlockLog
{
	    @SideOnly(Side.CLIENT)
	    private Icon[] field_111052_c = new Icon[1];
	    @SideOnly(Side.CLIENT)
	    private Icon[] tree_top = new Icon[1];

	    protected GlowLog(int par1)
	    {
	        super(par1);
	        this.setHardness(5);
	        this.setResistance(4);
	        this.setStepSound(soundWoodFootstep);
	        this.setLightValue(.6F);
	    }

	    public int idDropped(int par1, Random par2Random, int par3)
	    {
	        return this.blockID;
	    }

	    @SideOnly(Side.CLIENT)
	    protected Icon getSideIcon(int par1)
	    {
	        return this.field_111052_c[0];
	    }

	    @SideOnly(Side.CLIENT)
	    protected Icon getEndIcon(int par1)
	    {
	        return this.tree_top[0];
	    }

	    public static int limitToValidMetadata(int par0)
	    {
	        return 0;
	    }

	    @SideOnly(Side.CLIENT)
	    public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs, List par3List)
	    {
	    	par3List.add(new ItemStack(par1, 1, 0));
	    }

	    @SideOnly(Side.CLIENT)
	    public void registerIcons(IconRegister iconRegister)
	    {
	            this.field_111052_c[0] = iconRegister.registerIcon("rareores:RareLogSide");
	            this.tree_top[0] = iconRegister.registerIcon("rareores:RareLogBottom");
	    }
	}