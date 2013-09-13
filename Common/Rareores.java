package rareores.common;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDispenser;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.StepSound;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntityDamageSourceIndirect;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid="rareores",name="rareores",version="1.6.2")
@NetworkMod(clientSideRequired=true,serverSideRequired = false)


public class Rareores {
	
	 @Instance("rareores")
	 public static Rareores instance;
	 
	 @SidedProxy(clientSide="rareores.client.ClientProxyRareores", serverSide="rareores.common.CommonProxyRareores")
     public static CommonProxyRareores proxy;
	
	
	
	@EventHandler
	 public void preInit(FMLPreInitializationEvent eventConfig) {
       
	
    		
    		
	}

	//Declaring init
	@EventHandler
	public void Init(FMLInitializationEvent event){
	
	
	}
	
}
		