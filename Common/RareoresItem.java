package rareores.common;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class RareoresItem extends Item {

	public RareoresItem(int par1, int par2) {
		super(par1);
		this.maxStackSize = par2;
	}
	
	@Override
	public void registerIcons(IconRegister iconRegister)
	{
	         this.itemIcon = iconRegister.registerIcon("Rareores:" + this.getUnlocalizedName().substring(5));
	}

}
