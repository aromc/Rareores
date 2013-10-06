package rareores.common.config;

import java.io.File;
import java.util.logging.Level;

import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class RareoresConfigNames {

	
	public static String PherithiumOreName;
	public static String PherithiumBlockName;
	public static String CrystiniumOreName;
	public static String CrystiniumBlockName;
	public static String TophiniteOreName;
	public static String TophiniteBlockName;
	public static String MagrolithOreName;
	public static String MagrolithBlockName;
	public static String NecroniteOreName;
	public static String NecroniteBlockName;
	public static String PSOName;
	public static String OILName;
	public static String TrillintBlockName;
	public static String RareleavesName;
	public static String RarelogName;
	public static String RareplanksName;
	public static String RaresaplingName;
	public static String SmeltingBlockName;
	public static String SmallChestName;
	public static String LargeChestName;
	public static String NullifierName;//21
	
	
	public static String PherithiumScrapName;
	public static String PherithiumLumpName;
	public static String PherithiumBarName;
	public static String PIOName;
	public static String MagrolithOreItemName;
	public static String NecroniteOreItemName;
	public static String MagrolithIngotName;
	public static String NecroniteIngotName;
	public static String CrystiniumName;
	public static String TophiniteName;
	public static String PherithiumArrowName;
	public static String PherithiumFlintName;
	public static String GlowStickName;
	public static String TrillintName;
	public static String DarkEssenceName;
	public static String NetherBladeName;
	public static String NetherBaseName;//17
	
	public static String PherithiumSwordName;
	public static String PherithiumPickaxeName;
	public static String PherithiumSpadeName;
	public static String PherithiumAxeName;
	public static String PherithiumHoeName;
	public static String PherithiumHelmetName;
	public static String PherithiumPlateName;
	public static String PherithiumLegsName;
	public static String PherithiumBootsName;
	public static String CrystiniumSwordName;
	public static String CrystiniumPickaxeName;
	public static String CrystiniumSpadeName;
	public static String CrystiniumAxeName;
	public static String CrystiniumHoeName;
	public static String CrystiniumHelmetName;
	public static String CrystiniumPlateName;
	public static String CrystiniumLegsName;
	public static String CrystiniumBootsName;
	public static String TophiniteSwordName;
	public static String TophinitePickaxeName;
	public static String TophiniteSpadeName;
	public static String TophiniteAxeName;
	public static String TophiniteHoeName;
	public static String TophiniteHelmetName;
	public static String TophinitePlateName;
	public static String TophiniteLegsName;
	public static String TophiniteBootsName;
	public static String MagrolithSwordName;
	public static String MagrolithPickaxeName;
	public static String MagrolithSpadeName;
	public static String MagrolithAxeName;
	public static String MagrolithHoeName;
	public static String MagrolithHelmetName;
	public static String MagrolithPlateName;
	public static String MagrolithLegsName;
	public static String MagrolithBootsName;
	public static String NecroniteSwordName;
	public static String NecronitePickaxeName;
	public static String NecroniteSpadeName;
	public static String NecroniteAxeName;
	public static String NecroniteHoeName;
	public static String NecroniteHelmetName;
	public static String NecronitePlateName;
	public static String NecroniteLegsName;
	public static String NecroniteBootsName;
	public static String TrillintSwordName;
	public static String TrillintPickaxeName;
	public static String TrillintSpadeName;
	public static String TrillintAxeName;
	public static String TrillintHoeName;
	public static String TrillintHelmetName;
	public static String TrillintPlateName;
	public static String TrillintLegsName;
	public static String TrillintBootsName;
	public static String NetherSwordName;
	public static String NetherPickaxeName;
	public static String NetherAxeName;
	public static String NetherHelmetName;
	public static String NetherPlateName;
	public static String NetherLegsName;
	public static String NetherBootsName;
	public static String NetherBowName;
	public static String TophiniteBowName;
	public static String NecroniteBowName;
	public static String CrystiniumBowName;
	public static String MagrolithBowName;
	public static String PherithiumBowName;
	public static String TrillintBowName;
	public static String IronBowName;
	public static String GoldBowName;
	public static String DiamondBowName;//71
	
	public static String FireLauncherName;
	public static String ResistOneName;
	public static String ResistTwoName;
	public static String PherithiumFirestarterName;
	public static String MagrolithAppleName;
	public static String NecroniteAppleName;
	public static String ERName;
	public static String ERSName;
	public static String StaffName;//9
	
	public static String EmblemName;
	public static String EmblemVisionName;
	public static String EmblemHasteName;
	public static String EmblemResistanceName;
	public static String EmblemStrengthName;
	public static String EmblemSpeedName;
	public static String EmblemJumpName;
	public static String EmblemMiningName;
	public static String EmblemFightName;
	public static String EmblemFlightName;//10
	
	public static String XpUpName;
	public static String FuelUpName;//2
	
	public static void doConfig(FMLPreInitializationEvent eventConfig){
		
		Configuration config = new Configuration(eventConfig.getSuggestedConfigurationFile());
    	try
    	{
        config.load();

        PherithiumOreName = config.get("Block Name's", "Pherithium Ore Name", "Pherithium Ore").getString();
        PherithiumBlockName = config.get("Block Name's", "Pherithium Block Name", "Pherithium Block").getString();
    	CrystiniumOreName = config.get("Block Name's", "Crystinium Ore Name", "Crystinium Ore").getString();
    	CrystiniumBlockName = config.get("Block Name's", "Crystinium Block Name", "Crystinium Block").getString();
    	TophiniteOreName = config.get("Block Name's", "Tophinite Ore Name", "Tophinite Ore").getString();
    	TophiniteBlockName = config.get("Block Name's", "Tophinite Block Name", "Tophinite Block").getString();
    	MagrolithOreName = config.get("Block Name's", "Magrolith Ore Name", "Magrolith Ore").getString();
    	MagrolithBlockName = config.get("Block Name's", "Magrolith Block Name", "Magrolith Block").getString();
    	NecroniteOreName = config.get("Block Name's", "Necronite Ore Name", "Necronite Ore").getString();
    	NecroniteBlockName = config.get("Block Name's", "Necronite Block Name", "Necronite Block").getString();
    	PSOName = config.get("Block Name's", "Pherithium Imbedded in Obsidian Block Name", "Pherithium In Obsidian").getString();
    	OILName = config.get("Block Name's", "ObsNameian In Lapis Name", "Crude Trillint").getString();
    	TrillintBlockName = config.get("Block Name's", "Trillint Block Name", "Trillint Block").getString();
    	RareleavesName = config.get("Block Name's", "Glowwood leaves Name", " ").getString();
    	RarelogName = config.get("Block Name's", "Glowwood Log Name", " ").getString();
    	RareplanksName = config.get("Block Name's", "Glowwood Planks Name", " ").getString();
    	RaresaplingName = config.get("Block Name's", "Glowwood Sapling Name", " ").getString();
    	SmeltingBlockName = config.get("Block Name's", "Heat Block Name", " ").getString();
    	SmallChestName = config.get("Block Name's", "GlowWood Crate Name", " ").getString();
    	LargeChestName = config.get("Block Name's", "Pherithium Crate Name", " ").getString();
    	NullifierName = config.get("Block Name's", "Nullifier Name", " ").getString();
    	
    	PherithiumScrapName = config.get("Item Name's", "Pherithium Scraps Name", "Pherithium Scraps").getString();
    	PherithiumLumpName = config.get("Item Name's", "Pherithium Lumps Name", "Pherithium Lump").getString();
    	PherithiumBarName = config.get("Item Name's", "Pherithium Bars Name", "Pherithium Bar").getString();
    	PIOName = config.get("Item Name's", "Pherithium In Obsidian Item Name", "Pherithium in Obsidian").getString();
    	MagrolithOreItemName = config.get("Item Name's", "Magrolith Ore Name", "Magrolith Ore").getString();
    	NecroniteOreItemName = config.get("Item Name's", "Necronite Ore Name", "Necronite Ore").getString();
    	MagrolithIngotName = config.get("Item Name's", "Magrolith Ingot Name", "Magrolith Ingot").getString();
    	NecroniteIngotName = config.get("Item Name's", "Necronite Ingot Name", "Necronite Ingot").getString();
    	CrystiniumName = config.get("Item Name's", "Crystinium Gem Name", "Crystinium").getString();
    	TophiniteName = config.get("Item Name's", "Tophinite Gem Name", "Tophinite").getString();
    	PherithiumArrowName = config.get("Item Name's", "Pherithium Arrow Name", "Pherithium Arrow").getString();
    	PherithiumFlintName = config.get("Item Name's", "Pherithium Flint Name", "Pherithium Arrowhead").getString();
    	GlowStickName = config.get("Item Name's", "Glow Stick Name", "Glowwood Stick").getString();
    	TrillintName = config.get("Item Name's", "Trillint Gem Name", "Trillint").getString();
    	DarkEssenceName = config.get("Item Name's", "Dark Essence Name", "Dark Essence").getString();
    	NetherBladeName = config.get("Item Name's", "Nether's Wrath Blade Name", "Nether's Wrath Blade").getString();
    	NetherBaseName = config.get("Item Name's", "Nether's Wrath Base Name", "Nether's Wrath Base").getString();
    	
    	PherithiumSwordName = config.get("Item Name's", "Pherithium Sword Name", " ").getString();
    	PherithiumPickaxeName = config.get("Item Name's", "Pherithium Pickaxe Name", " ").getString();
    	PherithiumSpadeName = config.get("Item Name's", "Pherithium Shovel Name", " ").getString();
    	PherithiumAxeName = config.get("Item Name's", "Pherithium Axe Name", " ").getString();
    	PherithiumHoeName = config.get("Item Name's", "Pherithium Hoe Name", " ").getString();
    	PherithiumHelmetName = config.get("Item Name's", "Pherithium Helmet Name", " ").getString();
    	PherithiumPlateName = config.get("Item Name's", "Pherithium Chestplate Name", " ").getString();
    	PherithiumLegsName = config.get("Item Name's", "Pherithium Leggings Name", " ").getString();
    	PherithiumBootsName = config.get("Item Name's", "Pherithium Boots Name", " ").getString();
    	
    	CrystiniumSwordName = config.get("Item Name's", "Crystinium Sword Name", " ").getString();
    	CrystiniumPickaxeName = config.get("Item Name's", "Crystinium Pickaxe Name", " ").getString();
    	CrystiniumSpadeName = config.get("Item Name's", "Crystinium Shovel Name", " ").getString();
    	CrystiniumAxeName = config.get("Item Name's", "Crystinium Axe Name", " ").getString();
    	CrystiniumHoeName = config.get("Item Name's", "Crystinium Hoe Name", " ").getString();
    	CrystiniumHelmetName = config.get("Item Name's", "Crystinium Helmet Name", " ").getString();
    	CrystiniumPlateName = config.get("Item Name's", "Crystinium Chestplate Name", " ").getString();
    	CrystiniumLegsName = config.get("Item Name's", "Crystinium Leggings Name", " ").getString();
    	CrystiniumBootsName = config.get("Item Name's", "Crystinium Boots Name", " ").getString();
    	
    	TophiniteSwordName = config.get("Item Name's", "Tophinite Sword Name", " ").getString();
    	TophinitePickaxeName = config.get("Item Name's", "Tophinite Pickaxe Name", " ").getString();
    	TophiniteSpadeName = config.get("Item Name's", "Tophinite Shovel Name", " ").getString();
    	TophiniteAxeName = config.get("Item Name's", "Tophinite Axe Name", " ").getString();
    	TophiniteHoeName = config.get("Item Name's", "Tophinite Hoe Name", " ").getString();
    	TophiniteHelmetName = config.get("Item Name's", "Tophinite Helmet Name", " ").getString();
    	TophinitePlateName = config.get("Item Name's", "Tophinite Chestplate Name", " ").getString();
    	TophiniteLegsName = config.get("Item Name's", "Tophinite Leggings Name", " ").getString();
    	TophiniteBootsName = config.get("Item Name's", "Tophinite Boots Name", " ").getString();
    	
    	MagrolithSwordName = config.get("Item Name's", "Magrolith Sword Name", " ").getString();
    	MagrolithPickaxeName = config.get("Item Name's", "Magrolith Pickaxe Name", " ").getString();
    	MagrolithSpadeName = config.get("Item Name's", "Magrolith Shovel Name", " ").getString();
    	MagrolithAxeName = config.get("Item Name's", "Magrolith Axe Name", " ").getString();
    	MagrolithHoeName = config.get("Item Name's", "Magrolith Hoe Name", " ").getString();
    	MagrolithHelmetName = config.get("Item Name's", "Magrolith Helmet Name", " ").getString();
    	MagrolithPlateName = config.get("Item Name's", "Magrolith Chestplate Name", " ").getString();
    	MagrolithLegsName = config.get("Item Name's", "Magrolith Leggings Name", " ").getString();
    	MagrolithBootsName = config.get("Item Name's", "Magrolith Boots Name", " ").getString();
    	
    	NecroniteSwordName = config.get("Item Name's", "Necronite Sword Name", " ").getString();
    	NecronitePickaxeName = config.get("Item Name's", "Necronite Pickaxe Name", " ").getString();
    	NecroniteSpadeName = config.get("Item Name's", "Necronite Shovel Name", " ").getString();
    	NecroniteAxeName = config.get("Item Name's", "Necronite Axe Name", " ").getString();
    	NecroniteHoeName = config.get("Item Name's", "Necronite Hoe Name", " ").getString();
    	NecroniteHelmetName = config.get("Item Name's", "Necronite Helmet Name", " ").getString();
    	NecronitePlateName = config.get("Item Name's", "Necronite Chestplate Name", " ").getString();
    	NecroniteLegsName = config.get("Item Name's", "Necronite Leggings Name", " ").getString();
    	NecroniteBootsName = config.get("Item Name's", "Necronite Boots Name", " ").getString();
    	
    	TrillintSwordName = config.get("Item Name's", "Trillint Sword Name", " ").getString();
    	TrillintPickaxeName = config.get("Item Name's", "Trillint Pickaxe Name", " ").getString();
    	TrillintSpadeName = config.get("Item Name's", "Trillint Shovel Name", " ").getString();
    	TrillintAxeName = config.get("Item Name's", "Trillint Axe Name", " ").getString();
    	TrillintHoeName = config.get("Item Name's", "Trillint Hoe Name", " ").getString();
    	TrillintHelmetName = config.get("Item Name's", "Trillint Helmet Name", " ").getString();
    	TrillintPlateName = config.get("Item Name's", "Trillint Chestplate Name", " ").getString();
    	TrillintLegsName = config.get("Item Name's", "Trillint Leggings Name", " ").getString();
    	TrillintBootsName = config.get("Item Name's", "Trillint Boots Name"," ").getString();
    	
    	NetherSwordName = config.get("Item Name's", "Nether's Wrath Name", " ").getString();
    	NetherPickaxeName = config.get("Item Name's", "Miner's Fury Name", " ").getString();
    	NetherAxeName = config.get("Item Name's", "The Utility Name", " ").getString();
    	NetherHelmetName = config.get("Item Name's", "Guardian's Helmet Name", " ").getString();
    	NetherPlateName = config.get("Item Name's", "Guardian's Chestplate Name", " ").getString();
    	NetherLegsName = config.get("Item Name's", "Guardians Leggings Name", " ").getString();
    	NetherBootsName = config.get("Item Name's", "Guardians Boots Name", " ").getString();
    
    	NetherBowName = config.get("Item Name's", "Nether Bow Name", " ").getString();
    	TophiniteBowName = config.get("Item Name's", "Tophinite Bow Name", " ").getString();
    	NecroniteBowName = config.get("Item Name's", "Necronite Bow Name", " ").getString();
    	CrystiniumBowName = config.get("Item Name's", "Crystinium Bow Name", " ").getString();
    	MagrolithBowName = config.get("Item Name's", "Magrolith Bow Name", " ").getString();
    	PherithiumBowName = config.get("Item Name's", "Pherithium Bow Name", " ").getString();
    	TrillintBowName = config.get("Item Name's", "Trillint Bow Name", " ").getString();
    	IronBowName = config.get("Item Name's", "Iron Bow Name", " ").getString();
    	GoldBowName = config.get("Item Name's", "Gold Bow Name", " ").getString();
    	DiamondBowName = config.get("Item Name's", "Diamond Bow Name", " ").getString();
    	
    	FireLauncherName = config.get("Item Name's", "Firecharge Launcher Name", " ").getString();
    	ResistOneName = config.get("Item Name's", "Thin Pherithium Mix Name", " ").getString();
    	ResistTwoName = config.get("Item Name's", "Thick Pherithium Mix Name", " ").getString();
    	PherithiumFirestarterName = config.get("Item Name's", "Pherithium Firestarter Name", " ").getString();
    	MagrolithAppleName = config.get("Item Name's", "Magrolith Apple Name", " ").getString();
    	NecroniteAppleName = config.get("Item Name's", "Necronite Apple Name", " ").getString();
    	ERName = config.get("Item Name's", "Nullifyer Name", "The Nullifier").getString();
    	ERSName = config.get("Item Name's", "Uncharged Nullifyer Name", "The Nullifier").getString();
        StaffName = config.get("Item Name's", "Growth Staff Name", " ").getString();
    	
        EmblemName= config.get("Item Name's", "Emblem Name", "Crystal Star").getString();
    	EmblemVisionName= config.get("Item Name's", "Emblem of NightVision Name", "Emblem of Sharp Vision").getString();
    	EmblemHasteName= config.get("Item Name's", "Emblem of Haste Name", "Emblem of Haste").getString();
    	EmblemResistanceName= config.get("Item Name's", "Emblem of Toughness Name", "Emblem of Toughness").getString();
    	EmblemStrengthName= config.get("Item Name's", "Emblem of Strength Name", "Emblem of Strength").getString();
    	EmblemSpeedName= config.get("Item Name's", "Emblem of Swiftness Name", "Emblem of Swiftness").getString();
    	EmblemJumpName= config.get("Item Name's", "Emblem of Leaping Name", "Emblem of Leaping").getString();
    	EmblemMiningName= config.get("Item Name's", "Emblem of Precision Name", "Emblem of Precision").getString();
    	EmblemFightName= config.get("Item Name's", "Emblem of Combat Name", "Emblem of Combat").getString();
    	EmblemFlightName= config.get("Item Name's", "Emblem of Freedom Name", "Emblem of Freedom").getString();
        
    	XpUpName= config.get("Item Name's", "Fuel Upgrade Name", "Heated Orb").getString();
    	FuelUpName= config.get("Item Name's", "Xp Upgrade Name", "Gleaming Orb").getString();
    	}
    	
    	catch (Exception e) 
    	{
    		FMLLog.log(Level.SEVERE, e, "[RareOres] A problem occured when trying to access the Rareores Config file (Names), please tell the mod creator as soon as possible. Skipping...");
    	}
    	
    	finally 
    	{
    		config.save();
    		System.out.println("[RareOres] Config(Names) was loaded successfully.");
    	}
    	
	}
}