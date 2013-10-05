package rareores.common.item;

import java.util.List;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class RareoresItem extends Item {

	@SideOnly(Side.CLIENT)
	private Icon[] icons;
	int amt;
	
	
	public RareoresItem(int Id, int stacksize, int amount) {
		super(Id);
		this.maxStackSize = stacksize;
		this.setHasSubtypes(true);
		this.amt = amount;
		this.setCreativeTab(CreativeTabs.tabMaterials);
	}
	      
	@SideOnly(Side.CLIENT)
	/**
	 * Register icons / sprites for use in minecraft here, this is the only chance you get to do so!
	 */
	public void registerIcons(IconRegister iconRegister)
	{
	       icons = new Icon[amt];
	             
	       for(int i = 0; i < icons.length; i++)
	       {
	              icons[i] = iconRegister.registerIcon("rareores" + ":" + (this.getUnlocalizedName().substring(5)) + i);
	       }
	}
	
	@SideOnly(Side.CLIENT)
    /**
     * Gets an icon index based on an item's damage value
     * @param meta - The damage of the item.
     */
	public Icon getIconFromDamage(int meta)
	{
		return icons[meta];
	}
	
	@SideOnly(Side.CLIENT)
	/**
     * Returns a list of items with the same ID, but different meta (eg: dye returns 16 items)
     */
	public void getSubItems(int par1, CreativeTabs tabs, List list)
	{
	    for (int i = 0; i < amt; i++)
	    {
	        list.add(new ItemStack(this, 1, i));
	    }
	}
	
	/**
	 * Gets the name of the item. Meta is taken from the stack and it is checked
	 * with a switch statement to determine the name.
	 * @param itemStack - the ItemStack that the method will get its name from.
	 */
	public String getUnlocalizedName(ItemStack itemStack)
    {
		String name = Integer.toString(itemStack.getItemDamage() + 1);
		return getUnlocalizedName() + "." + name;
    }
	
	public boolean hasEffect(ItemStack itemStack, int pass)
    {
        int meta = itemStack.getItemDamage();
        if ((meta == 10 || meta == 14) && this.maxStackSize == 1)
        {
        	return true;
        }
        return false;
		
		
    }

}
