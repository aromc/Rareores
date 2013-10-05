package rareores.common.config;

import java.io.File;
import java.util.logging.Level;

import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class RareoresConfigIds {

	
	public static int OresID;
	public static int MiscBlocksID;
	
	public static int StackedItemID;
	public static int NonStackedItemID;
	
	public static int RareleavesID;
	public static int RarelogID;
	public static int RareplanksID;
	public static int RaresaplingID;
	public static int SmeltingBlockID;
	public static int SmallChestID;
	public static int LargeChestID;
	public static int NullifierID;//21
	
	public static int PherithiumSwordID;
	public static int PherithiumPickaxeID;
	public static int PherithiumSpadeID;
	public static int PherithiumAxeID;
	public static int PherithiumHoeID;
	public static int PherithiumHelmetID;
	public static int PherithiumPlateID;
	public static int PherithiumLegsID;
	public static int PherithiumBootsID;
	public static int CrystiniumSwordID;
	public static int CrystiniumPickaxeID;
	public static int CrystiniumSpadeID;
	public static int CrystiniumAxeID;
	public static int CrystiniumHoeID;
	public static int CrystiniumHelmetID;
	public static int CrystiniumPlateID;
	public static int CrystiniumLegsID;
	public static int CrystiniumBootsID;
	public static int TophiniteSwordID;
	public static int TophinitePickaxeID;
	public static int TophiniteSpadeID;
	public static int TophiniteAxeID;
	public static int TophiniteHoeID;
	public static int TophiniteHelmetID;
	public static int TophinitePlateID;
	public static int TophiniteLegsID;
	public static int TophiniteBootsID;
	public static int MagrolithSwordID;
	public static int MagrolithPickaxeID;
	public static int MagrolithSpadeID;
	public static int MagrolithAxeID;
	public static int MagrolithHoeID;
	public static int MagrolithHelmetID;
	public static int MagrolithPlateID;
	public static int MagrolithLegsID;
	public static int MagrolithBootsID;
	public static int NecroniteSwordID;
	public static int NecronitePickaxeID;
	public static int NecroniteSpadeID;
	public static int NecroniteAxeID;
	public static int NecroniteHoeID;
	public static int NecroniteHelmetID;
	public static int NecronitePlateID;
	public static int NecroniteLegsID;
	public static int NecroniteBootsID;
	public static int TrillintSwordID;
	public static int TrillintPickaxeID;
	public static int TrillintSpadeID;
	public static int TrillintAxeID;
	public static int TrillintHoeID;
	public static int TrillintHelmetID;
	public static int TrillintPlateID;
	public static int TrillintLegsID;
	public static int TrillintBootsID;
	public static int NetherSwordID;
	public static int NetherPickaxeID;
	public static int NetherAxeID;
	public static int NetherHelmetID;
	public static int NetherPlateID;
	public static int NetherLegsID;
	public static int NetherBootsID;
	public static int NetherBowID;
	public static int TophiniteBowID;
	public static int NecroniteBowID;
	public static int CrystiniumBowID;
	public static int MagrolithBowID;
	public static int PherithiumBowID;
	public static int TrillintBowID;
	public static int IronBowID;
	public static int GoldBowID;
	public static int DiamondBowID;//71
	
	public static int FireLauncherID;
	public static int ResistOneID;
	public static int ResistTwoID;
	public static int PherithiumFirestarterID;
	public static int MagrolithAppleID;
	public static int NecroniteAppleID;
	public static int ERID;
	public static int ERSID;
	public static int StaffID;//9
	
	
	public static void doConfig(FMLPreInitializationEvent eventConfig){
		
		Configuration config = new Configuration(eventConfig.getSuggestedConfigurationFile());

    	try
    	{
        config.load();

        OresID = config.get("Block Id's", "Ore IDs", 3175 ).getInt();
        MiscBlocksID = config.get("Block Id's", "Misc Block IDs", 3176).getInt();
    	StackedItemID = config.get("Item Id's", "Stacked Item IDs", 21500).getInt();
    	NonStackedItemID = config.get("Item Id's", "Non Stacked Item IDs", 21501).getInt();
    	
    	RarelogID = config.get("Block Id's", "Glowwood Log ID", 3177).getInt();
    	RareleavesID = config.get("Block Id's", "Glowwood leaves ID", 3178).getInt();
    	RareplanksID = config.get("Block Id's", "Glowwood Planks ID", 237).getInt();
    	RaresaplingID = config.get("Block Id's", "Glowwood Sapling ID", 239).getInt();
    	SmeltingBlockID = config.get("Block Id's", "Heat Block ID", 236).getInt();
    	SmallChestID = config.get("Block Id's", "GlowWood Crate ID", 235).getInt();
    	LargeChestID = config.get("Block Id's", "Pherithium Crate ID", 234).getInt();
    	NullifierID = config.get("Block Id's", "Nullifier ID", 233).getInt();
    	
    	PherithiumSwordID = config.get("Item Id's", "Pherithium Sword ID", 570).getInt();
    	PherithiumPickaxeID = config.get("Item Id's", "Pherithium Pickaxe ID", 572).getInt();
    	PherithiumSpadeID = config.get("Item Id's", "Pherithium Shovel ID", 573).getInt();
    	PherithiumAxeID = config.get("Item Id's", "Pherithium Axe ID", 571).getInt();
    	PherithiumHoeID = config.get("Item Id's", "Pherithium Hoe ID", 574).getInt();
    	PherithiumHelmetID = config.get("Item Id's", "Pherithium Helmet ID", 631).getInt();
    	PherithiumPlateID = config.get("Item Id's", "Pherithium Chestplate ID", 632).getInt();
    	PherithiumLegsID = config.get("Item Id's", "Pherithium Leggings ID", 633).getInt();
    	PherithiumBootsID = config.get("Item Id's", "Pherithium Boots ID", 634).getInt();
    	
    	CrystiniumSwordID = config.get("Item Id's", "Crystinium Sword ID", 575).getInt();
    	CrystiniumPickaxeID = config.get("Item Id's", "Crystinium Pickaxe ID", 577).getInt();
    	CrystiniumSpadeID = config.get("Item Id's", "Crystinium Shovel ID", 578).getInt();
    	CrystiniumAxeID = config.get("Item Id's", "Crystinium Axe ID", 576).getInt();
    	CrystiniumHoeID = config.get("Item Id's", "Crystinium Hoe ID", 579).getInt();
    	CrystiniumHelmetID = config.get("Item Id's", "Crystinium Helmet ID", 635).getInt();
    	CrystiniumPlateID = config.get("Item Id's", "Crystinium Chestplate ID", 636).getInt();
    	CrystiniumLegsID = config.get("Item Id's", "Crystinium Leggings ID", 637).getInt();
    	CrystiniumBootsID = config.get("Item Id's", "Crystinium Boots ID", 638).getInt();
    	
    	TophiniteSwordID = config.get("Item Id's", "Tophinite Sword ID", 580).getInt();
    	TophinitePickaxeID = config.get("Item Id's", "Tophinite Pickaxe ID", 582).getInt();
    	TophiniteSpadeID = config.get("Item Id's", "Tophinite Shovel ID", 583).getInt();
    	TophiniteAxeID = config.get("Item Id's", "Tophinite Axe ID", 581).getInt();
    	TophiniteHoeID = config.get("Item Id's", "Tophinite Hoe ID", 584).getInt();
    	TophiniteHelmetID = config.get("Item Id's", "Tophinite Helmet ID", 639).getInt();
    	TophinitePlateID = config.get("Item Id's", "Tophinite Chestplate ID", 640).getInt();
    	TophiniteLegsID = config.get("Item Id's", "Tophinite Leggings ID", 641).getInt();
    	TophiniteBootsID = config.get("Item Id's", "Tophinite Boots ID", 642).getInt();
    	
    	MagrolithSwordID = config.get("Item Id's", "Magrolith Sword ID", 585).getInt();
    	MagrolithPickaxeID = config.get("Item Id's", "Magrolith Pickaxe ID", 587).getInt();
    	MagrolithSpadeID = config.get("Item Id's", "Magrolith Shovel ID", 588).getInt();
    	MagrolithAxeID = config.get("Item Id's", "Magrolith Axe ID", 586).getInt();
    	MagrolithHoeID = config.get("Item Id's", "Magrolith Hoe ID", 589).getInt();
    	MagrolithHelmetID = config.get("Item Id's", "Magrolith Helmet ID", 643).getInt();
    	MagrolithPlateID = config.get("Item Id's", "Magrolith Chestplate ID", 644).getInt();
    	MagrolithLegsID = config.get("Item Id's", "Magrolith Leggings ID", 645).getInt();
    	MagrolithBootsID = config.get("Item Id's", "Magrolith Boots ID", 646).getInt();
    	
    	NecroniteSwordID = config.get("Item Id's", "Necronite Sword ID", 590).getInt();
    	NecronitePickaxeID = config.get("Item Id's", "Necronite Pickaxe ID", 592).getInt();
    	NecroniteSpadeID = config.get("Item Id's", "Necronite Shovel ID", 593).getInt();
    	NecroniteAxeID = config.get("Item Id's", "Necronite Axe ID", 591).getInt();
    	NecroniteHoeID = config.get("Item Id's", "Necronite Hoe ID", 594).getInt();
    	NecroniteHelmetID = config.get("Item Id's", "Necronite Helmet ID", 647).getInt();
    	NecronitePlateID = config.get("Item Id's", "Necronite Chestplate ID", 648).getInt();
    	NecroniteLegsID = config.get("Item Id's", "Necronite Leggings ID", 649).getInt();
    	NecroniteBootsID = config.get("Item Id's", "Necronite Boots ID", 650).getInt();
    	
    	TrillintSwordID = config.get("Item Id's", "Trillint Sword ID", 601).getInt();
    	TrillintPickaxeID = config.get("Item Id's", "Trillint Pickaxe ID", 603).getInt();
    	TrillintSpadeID = config.get("Item Id's", "Trillint Shovel ID", 604).getInt();
    	TrillintAxeID = config.get("Item Id's", "Trillint Axe ID", 602).getInt();
    	TrillintHoeID = config.get("Item Id's", "Trillint Hoe ID", 605).getInt();
    	TrillintHelmetID = config.get("Item Id's", "Trillint Helmet ID", 606).getInt();
    	TrillintPlateID = config.get("Item Id's", "Trillint Chestplate ID", 607).getInt();
    	TrillintLegsID = config.get("Item Id's", "Trillint Leggings ID", 608).getInt();
    	TrillintBootsID = config.get("Item Id's", "Trillint Boots ID", 609).getInt();
    	
    	NetherSwordID = config.get("Item Id's", "Nether's Wrath ID", 614).getInt();
    	NetherPickaxeID = config.get("Item Id's", "Miner's Fury ID", 616).getInt();
    	NetherAxeID = config.get("Item Id's", "The Utility ID", 615).getInt();
    	NetherHelmetID = config.get("Item Id's", "Guardian's Helmet ID", 651).getInt();
    	NetherPlateID = config.get("Item Id's", "Guardian's Chestplate ID", 652).getInt();
    	NetherLegsID = config.get("Item Id's", "Guardians Leggings ID", 653).getInt();
    	NetherBootsID = config.get("Item Id's", "Guardians Boots ID", 654).getInt();
    
    	NetherBowID = config.get("Item Id's", "Nether Bow ID", 626).getInt();
    	TophiniteBowID = config.get("Item Id's", "Tophinite Bow ID", 619).getInt();
    	NecroniteBowID = config.get("Item Id's", "Necronite Bow ID", 625).getInt();
    	CrystiniumBowID = config.get("Item Id's", "Crystinium Bow ID", 618).getInt();
    	MagrolithBowID = config.get("Item Id's", "Magrolith Bow ID", 624).getInt();
    	PherithiumBowID = config.get("Item Id's", "Pherithium Bow ID", 617).getInt();
    	TrillintBowID = config.get("Item Id's", "Trillint Bow ID", 623).getInt();
    	IronBowID = config.get("Item Id's", "Iron Bow ID", 622).getInt();
    	GoldBowID = config.get("Item Id's", "Gold Bow ID", 621).getInt();
    	DiamondBowID = config.get("Item Id's", "Diamond Bow ID", 620).getInt();
    	
    	FireLauncherID = config.get("Item Id's", "Firecharge Launcher ID", 657).getInt();
    	ResistOneID = config.get("Item Id's", "Thin Pherithium Mix ID", 610).getInt();
    	ResistTwoID = config.get("Item Id's", "Thick Pherithium Mix ID", 611).getInt();
    	PherithiumFirestarterID = config.get("Item Id's", "Pherithium Firestarter ID", 658).getInt();
    	MagrolithAppleID = config.get("Item Id's", "Magrolith Apple ID", 612).getInt();
    	NecroniteAppleID = config.get("Item Id's", "Necronite Apple ID", 613).getInt();
    	ERID = config.get("Item Id's", "Nullifyer ID", 659).getInt();
    	ERSID = config.get("Item Id's", "Uncharged Nullifyer ID", 660).getInt();
        StaffID = config.get("Item Id's", "Growth Staff ID", 661).getInt();
    	}
    	
    	catch (Exception e) 
    	{
    		FMLLog.log(Level.SEVERE, e, "[RareOres] A problem occured when trying to access the Rareores Config file (Ids), please tell the mod creator as soon as possible. Skipping...");
    	}
    	
    	finally 
    	{
    		config.save();
    		System.out.println("[RareOres] Config(Ids) was loaded successfully.");
    	}
    	
	}
}
