package aussiecraft.common;

import aussiecraft.client.ClientProxyAussie;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = "ipwnned_aussiecraft", name = "AussieCraft", version = "Beta 1.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = true)

public class aussiecraft {

	@SidedProxy(clientSide = "aussiecraft.client.ClientProxyAussie",
			serverSide = "aussiecraft.common.CommonProxyAussie")
	public static CommonProxyAussie proxy;

	public BiomeGenBase outbackBiome = new BiomeOutback(40);

	public static EnumToolMaterial OPAL = EnumHelper.addToolMaterial("OPAL", 2, 400, 7.0F, 6, 10);
	public static EnumToolMaterial DOPAL = EnumHelper.addToolMaterial("DOPAL", 3, 650, 10.0F, 9, 10);
	public static EnumArmorMaterial OPALL = EnumHelper.addArmorMaterial("OPAL_ARMOUR", 23, new int[]{2, 7, 5, 2} ,10);
	public static EnumArmorMaterial DOPALL = EnumHelper.addArmorMaterial("DOPAL_ARMOUR", 40, new int[]{4, 9, 6, 3} ,20);
	
	public static CreativeTabs tabAussieCraft = new CreativeTabAus("AussieCraft");

	public static Block testOre;
	public static Block opalOre;
	public static Block gumLog;
	public static Block gumLeaves;
	public static Block outbackBlock1;

	public static Item testingot;
	public static Item opalIngot;
	public static Item opalPickaxe;
	public static Item opalSword;
	public static Item opalAxe;
	public static Item opalShovel;
	public static Item opalHoe;
	public static Item damper;
	public static Item ashes;
	public static Item opalHelmet;
	public static Item opalPlate;
	public static Item opalLegs;
	public static Item opalBoots;
	public static Item infusedCoal;
	public static Item darkOpal;
	public static Item dopalPickaxe;
	public static Item dopalSword;
	public static Item dopalAxe;
	public static Item dopalShovel;
	public static Item dopalHoe;
	public static Item dopalHelmet;
	public static Item dopalPlate;
	public static Item dopalLegs;
	public static Item dopalBoots;
	public static Item knife;
	public static Item yeastSeed;

	int testOreID;
	int testingotID;
	int opalOreID;
	int opalIngotID;
	int opalPickaxeID;
	int opalSwordID;
	int opalAxeID;
	int opalShovelID;
	int opalHoeID;
	int gumLogID;
	int gumLeavesID;
	int damperID;
	int ashesID;
	int opalHelmetID;
	int opalPlateID;
	int opalLegsID;
	int opalBootsID;
	int outbackBlock1ID;
	int infusedCoalID;
	int darkOpalID;
	int dopalPickaxeID;
	int dopalSwordID;
	int dopalAxeID;
	int dopalShovelID;
	int dopalHoeID;
	int dopalHelmetID;
	int dopalPlateID;
	int dopalLegsID;
	int dopalBootsID;
	int knifeID;
	
	@PreInit
	public void preInit(FMLPreInitializationEvent event){
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		
		opalOreID = config.get("Block IDs", "Opal Ore ID", 1952).getInt();
		gumLogID = config.get("Block IDs", "Eucalyptus Log ID", 1959).getInt();
		gumLeavesID = config.get("Block IDs", "Eucalyptus Leaves ID", 1961).getInt();
		outbackBlock1ID = config.get("Block IDs", "Outback Dirt ID", 1960).getInt();
		testOreID = config.get("Block IDs", "Test Ore ID", 1950).getInt();
		
		opalIngotID = config.get("Item IDs", "Opal Ingot ID", 1953).getInt();
		opalPickaxeID = config.get("Item IDs", "Opal Pickaxe ID", 1954).getInt();
		opalSwordID = config.get("Item IDs", "Opal Sword ID", 1955).getInt();
		opalAxeID = config.get("Item IDs", "Opal Axe ID", 1956).getInt();
		opalShovelID = config.get("Item IDs", "Opal Shovel ID", 1957).getInt();
		opalHoeID = config.get("Item IDs", "Opal Hoe ID", 1958).getInt();
		ashesID = config.get("Item IDs", "Ashes ID", 1963).getInt();
		opalHelmetID = config.get("Item IDs", "Opal Helmet ID", 1964).getInt();
		opalPlateID = config.get("Item IDs", "Opal Chestplate ID", 1965).getInt();
		opalLegsID = config.get("Item IDs", "Opal Leggings ID", 1966).getInt();
		opalBootsID = config.get("Item IDs", "Opal Boots ID", 1967).getInt();
		infusedCoalID = config.get("Item IDs", "Infused Coal ID", 1969).getInt();
		darkOpalID = config.get("Item IDs", "Dark Opal ID", 1970).getInt();
		dopalPickaxeID = config.get("Item IDs", "Dark Opal Pickaxe ID", 1971).getInt();
		dopalSwordID = config.get("Item IDs", "Dark Opal Sword ID", 1972).getInt();
		dopalAxeID = config.get("Item IDs", "Dark Opal Axe ID", 1973).getInt();
		dopalShovelID = config.get("Item IDs", "Dark Opal Shovel ID", 1974).getInt();
		dopalHoeID = config.get("Item IDs", "Dark Opal Hoe ID", 1975).getInt();
		dopalHelmetID = config.get("Item IDs", "Dark Opal Helmet ID", 1976).getInt();
		dopalPlateID = config.get("Item IDs", "Dark Opal Chestplate ID", 1977).getInt();
		dopalLegsID = config.get("Item IDs", "Dark Opal Leggings ID", 1978).getInt();
		dopalBootsID = config.get("Item IDs", "Dark Opal Boots ID", 1979).getInt();
		testingotID = config.get("Item IDs", "Test Ingot ID", 1951).getInt();
		knifeID = config.get("Item IDs", "Knife ID", 1980).getInt();
		
		damperID = config.get("Item IDs", "Damper ID", 1962).getInt();
				
		config.save();
	}
	
	@Init
	public void load(FMLInitializationEvent event){

		testOre = new BlockTestOre(testOreID, 255, Material.iron).setUnlocalizedName("testOre").setHardness(2.5F).setResistance(50F).setStepSound(Block.soundMetalFootstep);
		opalOre = new BlockOpalOre(opalOreID, 0, Material.iron).setUnlocalizedName("opalOre").setHardness(4F).setResistance(30F).setStepSound(Block.soundStoneFootstep);
		testingot = new Itemtestingot(testingotID).setUnlocalizedName("testIngot");
		opalIngot = new ItemOpalIngot(opalIngotID).setUnlocalizedName("opalIngot");
		opalPickaxe = new ItemOpalPickaxe(opalPickaxeID, OPAL).setUnlocalizedName("opalPickaxe");
		opalSword = new ItemOpalSword(opalSwordID, OPAL).setUnlocalizedName("opalSword");
		opalAxe = new ItemOpalAxe(opalAxeID, OPAL).setUnlocalizedName("opalAxe");
		opalShovel = new ItemOpalShovel(opalShovelID, OPAL).setUnlocalizedName("opalShovel");
		opalHoe = new ItemOpalHoe(opalHoeID, OPAL).setUnlocalizedName("opalHoe");
		gumLog = new BlockGumLog(gumLogID, 2, Material.wood).setUnlocalizedName("gumLog").setHardness(2.0F);
		gumLeaves = new BlockGumLeaves(gumLeavesID, 6).setUnlocalizedName("gumLeaves").setHardness(0.2F).setLightOpacity(1).setStepSound(Block.soundGrassFootstep);
		damper = new ItemDamper(damperID, 6, 2.0F, false).setUnlocalizedName("damper");
		ashes = new ItemAshes(ashesID).setUnlocalizedName("ashes");
		opalHelmet = new OpalArmor(opalHelmetID, OPALL, proxy.addArmor("Opal"), 0).setUnlocalizedName("opalHelmet");
		opalPlate = new OpalArmor(opalPlateID, OPALL, proxy.addArmor("Opal"), 1).setUnlocalizedName("opalPlate");
		opalLegs = new OpalArmor(opalLegsID, OPALL, proxy.addArmor("Opal"), 2).setUnlocalizedName("opalLegs");
		opalBoots = new OpalArmor(opalBootsID, OPALL, proxy.addArmor("Opal"), 3).setUnlocalizedName("opalBoots");
		outbackBlock1 = new BlockOutbackDirt(outbackBlock1ID, 7, Material.grass).setUnlocalizedName("outbackBlock1").setHardness(2.0F).setStepSound(Block.soundGrassFootstep);
		infusedCoal = new ItemInfusedCoal(infusedCoalID).setUnlocalizedName("infusedCoal");
		darkOpal = new ItemDarkOpal(darkOpalID).setUnlocalizedName("darkOpal");
		dopalPickaxe = new ItemDopalPickaxe(dopalPickaxeID, DOPAL).setUnlocalizedName("dopalPickaxe");
		dopalSword = new ItemDopalSword(dopalSwordID, DOPAL).setUnlocalizedName("dopalSword");
		dopalAxe = new ItemDopalAxe(dopalAxeID, DOPAL).setUnlocalizedName("dopalAxe");
		dopalShovel = new ItemDopalShovel(dopalShovelID, DOPAL).setUnlocalizedName("dopalShovel");
		dopalHoe = new ItemDopalHoe(dopalHoeID, DOPAL).setUnlocalizedName("dopalHoe");
		dopalHelmet = new DopalArmor(dopalHelmetID, DOPALL, proxy.addArmor("Dark Opal"), 0).setUnlocalizedName("dopalHelmet");
		dopalPlate = new DopalArmor(dopalPlateID, DOPALL, proxy.addArmor("Dark Opal"), 1).setUnlocalizedName("dopalPlate");
		dopalLegs = new DopalArmor(dopalLegsID, DOPALL, proxy.addArmor("Dark Opal"), 2).setUnlocalizedName("dopalLegs");
		dopalBoots = new DopalArmor(dopalBootsID, DOPALL, proxy.addArmor("Dark Opal"), 3).setUnlocalizedName("dopalBoots");
		knife = new ItemKnife(knifeID).setUnlocalizedName("knife");
		

		gameRegisters();
		languageRegisters();
		craftingRecipes();

		proxy.registerRenderThings();


		GameRegistry.addSmelting(opalOreID, new ItemStack(opalIngot, 1), 1F);
		GameRegistry.registerWorldGenerator(new AusWorldGen());
		GameRegistry.addBiome(outbackBiome);
		MinecraftForge.setToolClass(opalPickaxe, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(opalOre, "pickaxe", 2);
		MinecraftForge.setToolClass(opalAxe, "axe", 2);
		MinecraftForge.setToolClass(opalShovel, "shovel", 2);
		MinecraftForge.setToolClass(dopalPickaxe, "pickaxe", 3);
		MinecraftForge.setToolClass(dopalAxe, "axe", 3);
		MinecraftForge.setToolClass(dopalShovel, "shovel", 3);

	}

	public void craftingRecipes(){
		GameRegistry.addRecipe(new ItemStack(aussiecraft.opalPickaxe), new Object[]{
			"OOO", " S ", " S ",
			'O', opalIngot,
			'S', Item.stick,

		});
		GameRegistry.addRecipe(new ItemStack(aussiecraft.opalSword), new Object[]{
			" O ", " O ", " S ",
			'O', opalIngot,
			'S', Item.stick			

		});
		GameRegistry.addRecipe(new ItemStack(aussiecraft.opalAxe), new Object[]{
			"OO ", "OS ", " S ",
			'O', opalIngot,
			'S', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(aussiecraft.opalShovel), new Object[]{
			" O ", " S ", " S ",
			'O', opalIngot,
			'S', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(aussiecraft.opalHoe), new Object[]{
			"OO ", " S ", " S ",
			'O', opalIngot,
			'S', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(aussiecraft.ashes, 7), new Object[]{
			"WWW", "WWW", "CWW",
			'W', Block.planks,
			'C', Item.coal
		});
		GameRegistry.addRecipe(new ItemStack(aussiecraft.opalHelmet), new Object[]{
			"OOO", "O O", "   ",
			'O', opalIngot,
		});
		GameRegistry.addRecipe(new ItemStack(aussiecraft.opalPlate), new Object[]{
			"O O", "OOO", "OOO",
			'O', opalIngot,
		});
		GameRegistry.addRecipe(new ItemStack(aussiecraft.opalLegs), new Object[]{
			"OOO", "O O", "O O",
			'O', opalIngot,
		});
		GameRegistry.addRecipe(new ItemStack(aussiecraft.opalBoots), new Object[]{
			"   ", "O O", "O O",
			'O', opalIngot,
		});
		GameRegistry.addRecipe(new ItemStack(aussiecraft.damper), new Object[]{
			"AAA", "WWW", "AAA",
			'A', ashes,
			'W', Item.wheat,
		});
		GameRegistry.addRecipe(new ItemStack(aussiecraft.infusedCoal), new Object[]{
			"RRR", "CCC", "RRR",
			'R', Item.redstone,
			'C', Item.coal,
		});
		GameRegistry.addRecipe(new ItemStack(aussiecraft.darkOpal), new Object[]{
			"IOI", "DOD", "IOI",
			'I', infusedCoal,
			'O', opalIngot,
			'D', Item.diamond,
		});
		GameRegistry.addRecipe(new ItemStack(aussiecraft.dopalPickaxe), new Object[]{
			"DDD", " S ", " S ",
			'D', darkOpal,
			'S', Item.stick,
		});
		GameRegistry.addRecipe(new ItemStack(aussiecraft.dopalSword), new Object[]{
			" D ", " D ", " S ",
			'D', darkOpal,
			'S', Item.stick,
		});
		GameRegistry.addRecipe(new ItemStack(aussiecraft.dopalAxe), new Object[]{
			"DD ", "DS ", " S ",
			'D', darkOpal,
			'S', Item.stick,
		});
		GameRegistry.addRecipe(new ItemStack(aussiecraft.dopalShovel), new Object[]{
			" D ", " S ", " S ",
			'D', darkOpal,
			'S', Item.stick,
		});
		GameRegistry.addRecipe(new ItemStack(aussiecraft.dopalHoe), new Object[]{
			"DD ", " S ", " S ",
			'D', darkOpal,
			'S', Item.stick,
		});
		GameRegistry.addRecipe(new ItemStack(aussiecraft.dopalHelmet), new Object[]{
			"DDD", "D D", "   ",
			'D', darkOpal,
		});
		GameRegistry.addRecipe(new ItemStack(aussiecraft.dopalPlate), new Object[]{
			"D D", "DDD", "DDD",
			'D', darkOpal,
		});
		GameRegistry.addRecipe(new ItemStack(aussiecraft.dopalLegs), new Object[]{
			"DDD", "D D", "D D",
			'D', darkOpal,
		});
		GameRegistry.addRecipe(new ItemStack(aussiecraft.dopalBoots), new Object[]{
			"   ", "D D", "D D",
			'D', darkOpal,
		});
		GameRegistry.addRecipe(new ItemStack(aussiecraft.dopalBoots), new Object[]{
			"   ", "  O", "  S",
			'I', opalIngot,
			'S', Item.stick,
		});
		GameRegistry.addShapelessRecipe(new ItemStack(Block.planks, 4), new Object[]{
		aussiecraft.gumLog,
		});
		
		
	}
	public void gameRegisters(){
		GameRegistry.registerBlock(testOre, "Test Ore");
		GameRegistry.registerBlock(opalOre, "Opal Ore");
		GameRegistry.registerBlock(gumLog, "Eucalyptus Log");
		GameRegistry.registerBlock(gumLeaves, "Eucalyptus Leaves");
		GameRegistry.registerItem(testingot, "Test Ingot");
		GameRegistry.registerItem(opalIngot, "Opal Ingot");
		GameRegistry.registerItem(opalPickaxe, "Opal Pickaxe");
		GameRegistry.registerItem(opalSword, "Opal Sword");
		GameRegistry.registerItem(opalAxe, "Opal Axe");
		GameRegistry.registerItem(opalShovel, "Opal Shovel");
		GameRegistry.registerItem(opalHoe, "Opal Hoe");
		GameRegistry.registerItem(damper, "Damper");
		GameRegistry.registerItem(ashes, "Ashes");
		GameRegistry.registerItem(opalHelmet, "Opal Helmet");
		GameRegistry.registerItem(opalPlate, "Opal Chestplate");
		GameRegistry.registerItem(opalLegs, "Opal Leggings");
		GameRegistry.registerItem(opalBoots, "Opal Boots");
		GameRegistry.registerBlock(outbackBlock1, "Outback Dirt");
		GameRegistry.registerItem(infusedCoal, "Infused Coal");
		GameRegistry.registerItem(darkOpal, "Dark Opal");
		GameRegistry.registerItem(dopalPickaxe, "Dark Opal Pickaxe");
		GameRegistry.registerItem(dopalSword, "Dark Opal Sword");
		GameRegistry.registerItem(dopalAxe, "Dark Opal Axe");
		GameRegistry.registerItem(dopalShovel, "Dark Opal Shovel");
		GameRegistry.registerItem(dopalHoe, "Dark Opal Hoe");
		GameRegistry.registerItem(dopalHelmet, "Dark Opal Helmet");
		GameRegistry.registerItem(dopalPlate, "Dark Opal Chestplate");
		GameRegistry.registerItem(dopalLegs, "Dark Opal Leggings");
		GameRegistry.registerItem(dopalBoots, "Dark Opal Boots");
		GameRegistry.registerItem(knife, "Opal Knife");
		

	}

	public void languageRegisters(){
		LanguageRegistry.addName(testOre, "Test Ore");
		LanguageRegistry.addName(opalOre, "Opal Ore");
		LanguageRegistry.addName(testingot, "Test Ingot");
		LanguageRegistry.addName(opalIngot, "Opal Ingot");
		LanguageRegistry.addName(opalPickaxe, "Opal Pickaxe");
		LanguageRegistry.addName(opalSword, "Opal Sword");
		LanguageRegistry.addName(opalAxe, "Opal Axe");
		LanguageRegistry.addName(opalShovel, "Opal Shovel");
		LanguageRegistry.addName(opalHoe, "Opal Hoe");
		LanguageRegistry.addName(gumLog, "Eucalyptus Log");
		LanguageRegistry.addName(gumLeaves, "Eucalyptus Leaves");
		LanguageRegistry.addName(damper, "Damper");
		LanguageRegistry.addName(ashes, "Ashes");
		LanguageRegistry.addName(opalHelmet, "Opal Helmet");
		LanguageRegistry.addName(opalPlate, "Opal Chestplate");
		LanguageRegistry.addName(opalLegs, "Opal Leggings");
		LanguageRegistry.addName(opalBoots, "Opal Boots");
		LanguageRegistry.addName(outbackBlock1, "Outback Dirt");
		LanguageRegistry.addName(infusedCoal, "Infused Coal");
		LanguageRegistry.addName(darkOpal, "Dark Opal");
		LanguageRegistry.addName(dopalPickaxe, "Dark Opal Pickaxe");
		LanguageRegistry.addName(dopalSword, "Dark Opal Sword");
		LanguageRegistry.addName(dopalAxe, "Dark Opal Axe");
		LanguageRegistry.addName(dopalShovel, "Dark Opal Shovel");
		LanguageRegistry.addName(dopalHoe, "Dark Opal Hoe");
		LanguageRegistry.addName(dopalHelmet, "Dark Opal Helmet");
		LanguageRegistry.addName(dopalPlate, "Dark Opal Chestplate");
		LanguageRegistry.addName(dopalLegs, "Dark Opal Leggings");
		LanguageRegistry.addName(dopalBoots, "Dark Opal Boots");
		LanguageRegistry.addName(knife, "Opal Knife");
	}

}
