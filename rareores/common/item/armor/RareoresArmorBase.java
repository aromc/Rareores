package rareores.common.item.armor;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraftforge.common.ISpecialArmor;

public class RareoresArmorBase extends ItemArmor implements ISpecialArmor {

	/**
	* Essentially this controls the name of the texture, All armor texture
	* names are the same except for the prefix of the armor name. E.G
	* If your armor texture name is test_1 and test_2, than this should be "test". 
	*/
	String armorNamePrefix;
	
	//How much enviornmental protection will this piece of armor give?(in percent)
	double enviornmentalProtection;
	
	//How much protection will this armor give?(in percent)
	double Protection;
	
	//How many shirts will appear on the gui?
	int halfShirts;
	
	//The armor material of the armor, used to determine durability, enchantibility, and repair substance
	EnumArmorMaterial material;
	
	public RareoresArmorBase(int id, EnumArmorMaterial par2EnumArmorMaterial, int par3, int par4, String ArmorName, double par6, double par7, int par8)
	{
		super(id, par2EnumArmorMaterial, par3, par4);
		armorNamePrefix = ArmorName;
		enviornmentalProtection = par6 / 100.0D;
		Protection = par7 / 100.0D;
		halfShirts = par8;
		material = par2EnumArmorMaterial;
	}
	
	@Override
	/**
	 * The texture icon on the armor should be the same as the unlocalized name.
	 */
	public void registerIcons(IconRegister iconRegister)
	{
	         this.itemIcon = iconRegister.registerIcon("Rareores:" + this.getUnlocalizedName().substring(5));
	}
	
	@Override
	/**
	 * See info on armorNamePrefix to see how this works
	 */
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
	/**
	 * Repairing material.
	 * Set with material.customCraftingMateial = Item.someItem; in your main mod file.
	 */
	public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack)
    {
        return this.material.getArmorCraftingMaterial() == par2ItemStack.itemID ? true : super.getIsRepairable(par1ItemStack, par2ItemStack);
    }
	
	@Override
	/**
	 * Calculates armor protection
	 */
	public ArmorProperties getProperties(EntityLivingBase player, ItemStack armor, DamageSource source, double damage, int slot) 
	{
		//Environmental damage
		if (source.getDamageType().equals("indirectMagic")||source.getDamageType().equals("fall")||source.getDamageType().equals("Generic")||source.getDamageType().equals("onFire")||source.getDamageType().equals("inWall")||source.getDamageType().equals("drown")||source.getDamageType().equals("starve")||source.getDamageType().equals("magic")||source.getDamageType().equals("outOfWorld")||source.getDamageType().equals("wither")) 
		{
			return new ArmorProperties(0, enviornmentalProtection, Integer.MAX_VALUE); 
		} 
		//If not environmental, then do normal protection.
		else 
		{
			return new ArmorProperties(0, Protection, Integer.MAX_VALUE);
		}
	}

	@Override
	//The gui display
	public int getArmorDisplay(EntityPlayer player, ItemStack armor, int slot) 
	{
		return halfShirts;
	}

	@Override
	public void damageArmor(EntityLivingBase entity, ItemStack stack, DamageSource source, int damage, int slot) 
	{
		if (source.getDamageType().equals("indirectMagic")||source.getDamageType().equals("fall")||source.getDamageType().equals("Generic")||source.getDamageType().equals("onFire")||source.getDamageType().equals("inWall")||source.getDamageType().equals("drown")||source.getDamageType().equals("starve")||source.getDamageType().equals("magic")||source.getDamageType().equals("outOfWorld")||source.getDamageType().equals("wither")) 
		{
			//Nothing here, because the armor shouldn't get damaged if it is environmental.
		}
		//If not environmental, then do normal armor damage.
		else
		{
			stack.damageItem(damage, entity);
		}
	}
}