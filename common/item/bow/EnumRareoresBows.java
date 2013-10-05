package rareores.common.item.bow;

public enum EnumRareoresBows {
	
	PHERITHIUM(1250, 16, true, 2.6F, 1.25D, 6);
	
	private final int maxDamage;
	
	private final int useSpeed;
	
	private final boolean shootsPherithium;
	
	private final float shotSpeed;
	
	private final double shotDamage;
	
	private final int enchantability;
	
	private EnumRareoresBows(int maxDamage, int pullSpeed, boolean shootsPherithium, float shotSpeed, double shotDamage, int enchantability)
    {
        this.maxDamage = maxDamage;
        this.useSpeed = pullSpeed;
        this.shootsPherithium = shootsPherithium;
        this.shotSpeed = shotSpeed;
        this.shotDamage = shotDamage;
        this.enchantability = enchantability;
    }

}
