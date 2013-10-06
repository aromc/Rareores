package rareores.common.block;

import java.util.List;
import java.util.Random;

import net.minecraft.block.BlockFlower;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenBigTree;
import net.minecraft.world.gen.feature.WorldGenForest;
import net.minecraft.world.gen.feature.WorldGenHugeTrees;
import net.minecraft.world.gen.feature.WorldGenTaiga2;
import net.minecraft.world.gen.feature.WorldGenTrees;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.event.terraingen.TerrainGen;
import rareores.common.Rareores;
import rareores.common.element.GlowTreeGen;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

//Extends BlockFlower for plantable status and rendering.
public class GlowSapling extends BlockFlower
{
    protected GlowSapling(int id)
    {
        super(id, Material.plants);
        float f = 0.4F;
        this.setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 2.0F, 0.5F + f);
        this.setCreativeTab(CreativeTabs.tabDecorations);
        this.setTickRandomly(true);
        this.setStepSound(soundGrassFootstep);
    }

    /**
     * Ticks the block if it's been scheduled
     * If it is on the serverside, then check if conditions are right
     * for a sapling to grow, if they are, then call the growtree method.
     */
    public void updateTick(World world, int x, int y, int z, Random random)
    {
        if (!world.isRemote)
        {
            super.updateTick(world, x, y, z, random);
            
            if (world.getBlockLightValue(x, y + 1, z) >= 9 && random.nextInt(10) == 0)
            {
            	this.growTree(world, x, y, z, random);
            }
        }
    }

    /**
     * Attempts to grow a sapling into a tree
     */
    public void growTree(World world, int x, int y, int z, Random random)
    {
    	//If the tree can't grow in its current status, then return.
        if (!TerrainGen.saplingGrowTree(world, random, x, y, z))
        	return;

        GlowTreeGen gen = new GlowTreeGen(true, 4);
        //Chance for a tall tree
        if(random.nextInt(10) == 0)
        {
        	gen = new GlowTreeGen(true, 8);
        }
        
        //Attempts to generate, and if it doesn't succeed then make sure a sapling is still there.
        if (!(gen.generate(world, random, x, y, z)))
        {
                world.setBlock(x, y, z, this.blockID, 0, 4);
        }
    }

    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister)
    {
        this.blockIcon = iconRegister.registerIcon(Rareores.modid + ":" + this.getUnlocalizedName().substring(5));

    }
}