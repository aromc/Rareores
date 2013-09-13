package rareores.common;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraftforge.common.ISpecialArmor;

public class RareoresArmor extends ItemArmor implements ISpecialArmor {

	String armorNamePrefix;
	double enviornmentalProtection;
	double Protection;
	int halfShirts;
	
	public RareoresArmor(int par1, EnumArmorMaterial par2EnumArmorMaterial,	int par3, int par4, String ArmorName, double par6, double par7, int par8) {
		super(par1, par2EnumArmorMaterial, par3, par4);
		armorNamePrefix = ArmorName;
		enviornmentalProtection = par6 / 100.0D;
		Protection = par7 / 100.0D;
		halfShirts = par8;
	}
	
	@Override
	public void registerIcons(IconRegister iconRegister)
	{
	         this.itemIcon = iconRegister.registerIcon("Rareores:" + this.getUnlocalizedName().substring(5));
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, int layer)
    {
		if (stack.toString().contains("leg")) 
		{
				return "rareores:"+"textures/armor/" + armorNamePrefix + "_2.png";
		}
		if (stack.toString().contains("Leg")) 
		{
				return "rareores:"+"textures/armor/" + armorNamePrefix + "_2.png";
		}
		return "rareores:"+"textures/armor/" + armorNamePrefix + "_1.png";
	}
	
	@Override
	public ArmorProperties getProperties(EntityLivingBase player, ItemStack armor, DamageSource source, double damage, int slot) 
	{
		if (source.getDamageType().equals("indirectMagic")||source.getDamageType().equals("fall")||source.getDamageType().equals("Generic")||source.getDamageType().equals("onFire")||source.getDamageType().equals("inWall")||source.getDamageType().equals("drown")||source.getDamageType().equals("starve")||source.getDamageType().equals("magic")||source.getDamageType().equals("outOfWorld")||source.getDamageType().equals("wither")) 
		{
			return new ArmorProperties(0, enviornmentalProtection, Integer.MAX_VALUE); 
		} 
		else 
		{
			return new ArmorProperties(0, Protection, Integer.MAX_VALUE);
		}
	}

	@Override
	public int getArmorDisplay(EntityPlayer player, ItemStack armor, int slot) 
	{
		return halfShirts;
	}

	@Override
	public void damageArmor(EntityLivingBase entity, ItemStack stack, DamageSource source, int damage, int slot) 
	{
		if (source.getDamageType().equals("indirectMagic")||source.getDamageType().equals("fall")||source.getDamageType().equals("Generic")||source.getDamageType().equals("onFire")||source.getDamageType().equals("inWall")||source.getDamageType().equals("drown")||source.getDamageType().equals("starve")||source.getDamageType().equals("magic")||source.getDamageType().equals("outOfWorld")||source.getDamageType().equals("wither")) 
		{
			//Nothing here, because the armor shouldn't get damaged!
		}
		else
		{
			stack.damageItem(damage, entity);
		}
	}
}