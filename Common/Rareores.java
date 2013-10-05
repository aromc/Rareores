package rareores.common;

import rareores.common.block.Blocks;
import rareores.common.config.RareoresConfigIds;
import rareores.common.config.RareoresConfigNames;
import rareores.common.element.WorldGeneratorRareores;
import rareores.common.item.Items;
import rareores.common.recipe.RareoresRecipes;
import rareores.common.recipe.RareoresSmelting;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid=Rareores.modid,name="Rareores",version="1.7")
@NetworkMod(clientSideRequired=true,serverSideRequired = false)


public class Rareores {
	
	public static final String modid = "rareores";
	 
	@Instance(modid)
	public static Rareores mod;
	public static Items items;
	public static Blocks blocks;
	public static RareoresConfigIds ID;
	public static RareoresConfigNames Names;
	public static RareoresRecipes Recipes;
	public static RareoresSmelting Smelting;
	
	
	 
	 @SidedProxy(clientSide="rareores.client.ClientProxyRareores", serverSide="rareores.common.CommonProxyRareores")
     public static CommonProxyRareores proxy;
	
	
	@EventHandler
	 public void preInit(FMLPreInitializationEvent event)
	{
       ID.doConfig(event);
       Names.doConfig(event);
       items.initializeItems();
       blocks.initializeBlocks();
       Recipes.initializerecipes();
       Smelting.initializeSmelting();
	}

	@EventHandler
	public void Init(FMLInitializationEvent event)
	{
	
		proxy.registerproxy();
		GameRegistry.registerWorldGenerator(new WorldGeneratorRareores());
	}
	
}
		