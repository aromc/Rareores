package rareores.common.element;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSapling;
import net.minecraft.util.Direction;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.ForgeDirection;
import rareores.common.block.Blocks;

/**
 * This class is mostly a working class, I have labeled a few things
 * and cleaned it up as much as possible, so if you study it
 * hard enough you should be able to mostly see what it is doing.
 */
public class GlowTreeGen extends WorldGenerator
{
    /** The minimum height of a generated tree. */
    private final int minTreeHeight;

    public GlowTreeGen(boolean markRender, int min)
    {
        super(markRender);
        this.minTreeHeight = min;
    }

    public boolean generate(World world, Random random, int x, int y, int z)
    {
    	//Remember, TH will resemble Tree Height.
        int TH = random.nextInt(3) + this.minTreeHeight;
        boolean flag = true;

        //If the Tree wont generate into the void or sky limit, continue.
        if (y >= 1 && y + TH + 1 <= 256)
        {
            int i1;
            byte b0;
            int j1;
            int k1;

            for (i1 = y; i1 <= y + 1 + TH; ++i1)
            {
                b0 = 1;

                if (i1 == y)
                {
                    b0 = 0;
                }

                if (i1 >= y + 1 + TH - 2)
                {
                    b0 = 2;
                }

                for (int l1 = x - b0; l1 <= x + b0 && flag; ++l1)
                {
                    for (j1 = z - b0; j1 <= z + b0 && flag; ++j1)
                    {
                        if (i1 >= 0 && i1 < 256)
                        {
                        	//Gets block above sapling
                            k1 = world.getBlockId(l1, i1 - 1, j1);
                            Block block = Block.blocksList[k1];
                            boolean isAir = world.isAirBlock(l1, i1, j1);
                            
                            //If blocks above are not replaceable, 
                            //or if block below doesn't support plant,
                            //stop generation.
                            if(block != null)
                            if (!isAir &&
                               !block.isLeaves(world, l1, i1, j1) &&
                                k1 != Block.grass.blockID &&
                                k1 != Block.dirt.blockID &&
                               !block.isWood(world, l1, i1, j1))
                            {
                            	flag = false;
                            }
                        }
                        else
                        {
                            flag = false;
                        }
                    }
                }
            }

            if (!flag)
            {
                return false;
            }
            else
            {
            	//gets the block below the given location
                i1 = world.getBlockId(x, y - 1, z);
                Block soil = Block.blocksList[i1];
                //If it isn't air/null, and if the block can sustain a tree.
                boolean isSoil = (soil != null && soil.canSustainPlant(world, x, y - 1, z, ForgeDirection.UP, (BlockSapling)Block.sapling));

                if (isSoil && y < 256 - TH - 1)
                {
                	//Make the block turn into dirt, at this point nothing is stopping
                	//The tree from growing
                    soil.onPlantGrow(world, x, y - 1, z, x, y, z);
                    b0 = 3;
                    byte b1 = 0;
                    int i2;
                    int j2;
                    int k2;

                    //Generate leaves
                    for (j1 = y - b0 + TH; j1 <= y + TH; ++j1)
                    {
                        k1 = j1 - (y + TH);
                        i2 = b1 + 1 - k1 / 2;

                        for (j2 = x - i2; j2 <= x + i2; ++j2)
                        {
                            k2 = j2 - x;

                            for (int l2 = z - i2; l2 <= z + i2; ++l2)
                            {
                                int i3 = l2 - z;

                                if (Math.abs(k2) != i2 || Math.abs(i3) != i2 || random.nextInt(2) != 0 && k1 != 0)
                                { 
                                    int j3 = world.getBlockId(j2, j1, l2);
                                    Block block = Block.blocksList[j3];

                                    //Can the block be replaced by leaves? If so, put leaves there.
                                    if (block == null || block.canBeReplacedByLeaves(world, j2, j1, l2))
                                    {
                                    	//The leaves to generate
                                        this.setBlock(world, j2, j1, l2, Blocks.glowLeaf.blockID);
                                    }
                                }
                            }
                        }
                    }

                    //Generate logs, where j1 is how high up from the starting point you are.
                    //Starts at -1 so it gets the sapling.
                    for (j1 = -1; j1 < TH; ++j1)
                    {
                        k1 = world.getBlockId(x, y + j1, z);

                        Block block = Block.blocksList[k1];
                        
                        //If id is air/0/glowSapling, or if the block is leaves, generate logs.
                        if ( k1 == Blocks.glowSapling.blockID||k1 == 0 || block == null || block.isLeaves(world, x, y + j1, z))
                        {
                        	//The Logs to generate.
                            this.setBlock(world, x, y + j1, z, Blocks.glowLog.blockID);
                        }
                    }
                    //The tree generated, so return true.
                    return true;
                }
                //If the generating failed, return false.
                else
                {
                    return false;
                }
            }
        }
        else
        {
            return false;
        }
    }
}

