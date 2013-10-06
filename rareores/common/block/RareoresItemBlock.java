package rareores.common.block;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;

public class RareoresItemBlock extends ItemBlock {

	public RareoresItemBlock(int Id)
	{
		super(Id);
		setHasSubtypes(true);
	}
	
	public String getUnlocalizedName(ItemStack itemStack)
    {
		String name = "";
	       switch(itemStack.getItemDamage())
	       {
	             case 0:
	             {
	                    name = "1";
	                    break;
	             }
	             case 1:
	             {
	                    name = "2";
	                    break;
	             }
	             case 2:
	             {
	                    name = "3";
	                    break;
	             }
	             case 3:
	             {
	                    name = "4";
	                    break;
	             }
	             case 4:
	             {
	                    name = "5";
	                    break;
	             }
	             case 5:
	             {
	                    name = "6";
	                    break;
	             }
	             case 6:
	             {
	                    name = "7";
	                    break;
	             }
	             case 7:
	             {
	                    name = "8";
	                    break;
	             }
	             default: name = "0";
	       }
	       return getUnlocalizedName() + "." + name;
    }
   
    public int getMetadata(int meta)
    {
          return meta;
    }

}
