package net.humba01.attlas.tools;

import net.humba01.attlas.AttlasMod;
import net.humba01.attlas.tools.material.*;
import net.humba01.attlas.tools.subclass.*;
import net.minecraft.item.Item;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Tools {

  //Swords
  public static final ToolItem STEEL_SWORD = new SwordItem(SteelToolMaterial.INSTANCE, 0, 0.0f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem TIN_SWORD = new SwordItem(TinToolMaterial.INSTANCE, 0, 0.0f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem ALUMINUM_SWORD = new SwordItem(AluminumToolMaterial.INSTANCE, 0, 0.0f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem TITANIUM_SWORD = new SwordItem(TitaniumToolMaterial.INSTANCE, 0, 0.0f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem SILVER_SWORD = new SwordItem(SilverToolMaterial.INSTANCE, 0, 0.0f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem CADMIUM_SWORD = new SwordItem(CadmiumToolMaterial.INSTANCE, 0, 0.0f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem COOPER_SWORD = new SwordItem(CooperToolMaterial.INSTANCE, 0, 0.0f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem COBALT_SWORD = new SwordItem(CobaltToolMaterial.INSTANCE, 0, 0.0f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem CHROME_SWORD = new SwordItem(ChromeToolMaterial.INSTANCE, 0, 0.0f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem IRIDIUM_SWORD = new SwordItem(IridiumToolMaterial.INSTANCE, 0, 0.0f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem OSMIUM_SWORD = new SwordItem(OsmiumToolMaterial.INSTANCE, 0, 0.0f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem NICKEL_SWORD = new SwordItem(NickelToolMaterial.INSTANCE, 0, 0.0f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem LEAD_SWORD = new SwordItem(LeadToolMaterial.INSTANCE, 0, 0.0f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem THALLIUM_SWORD = new SwordItem(ThalliumToolMaterial.INSTANCE, 0, 0.0f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem INDIAN_SWORD = new SwordItem(IndianToolMaterial.INSTANCE, 0, 0.0f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem BRONZE_SWORD = new SwordItem(BronzeToolMaterial.INSTANCE, 0, 0.0f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem BRASS_SWORD = new SwordItem(BrassToolMaterial.INSTANCE, 0, 0.0f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem INVAR_SWORD = new SwordItem(InvarToolMaterial.INSTANCE, 0, 0.0f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem TOMBAC_SWORD = new SwordItem(TombacToolMaterial.INSTANCE, 0, 0.0f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem NICHROME_SWORD = new SwordItem(NichromeToolMaterial.INSTANCE, 0, 0.0f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem ELECTRON_SWORD = new SwordItem(ElectronToolMaterial.INSTANCE, 0, 0.0f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem BISMUTH_SWORD = new SwordItem(BismuthToolMaterial.INSTANCE, 0, 0.0f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem VIBRANIUM_SWORD = new SwordItem(VibraniumToolMaterial.INSTANCE, 0, 0.0f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem ADAMANTIUM_SWORD = new SwordItem(AdamantiumToolMaterial.INSTANCE, 0, 0.0f, new Item.Settings().group(AttlasMod.TOOLS));

  //Axes
  public static final ToolItem STEEL_AXE = new CustomAxeItem(SteelToolMaterial.INSTANCE, 0.5f, 0.0f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem TIN_AXE = new CustomAxeItem(TinToolMaterial.INSTANCE, 0.5f, 0.0f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem ALUMINUM_AXE = new CustomAxeItem(AluminumToolMaterial.INSTANCE, 0.5f, 0.0f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem TITANIUM_AXE = new CustomAxeItem(TitaniumToolMaterial.INSTANCE, 0.5f, 0.0f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem SILVER_AXE = new CustomAxeItem(SilverToolMaterial.INSTANCE, 0.8f, 0.2f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem CADMIUM_AXE = new CustomAxeItem(CadmiumToolMaterial.INSTANCE, 0.8f, 0.2f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem COOPER_AXE = new CustomAxeItem(CooperToolMaterial.INSTANCE, 0.8f, 0.2f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem COBALT_AXE = new CustomAxeItem(CobaltToolMaterial.INSTANCE, 0.8f, 0.2f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem CHROME_AXE = new CustomAxeItem(ChromeToolMaterial.INSTANCE, 0.8f, 0.2f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem IRIDIUM_AXE = new CustomAxeItem(IridiumToolMaterial.INSTANCE, 1.4f, 0.4f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem OSMIUM_AXE = new CustomAxeItem(OsmiumToolMaterial.INSTANCE, 1.4f, 0.4f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem NICKEL_AXE = new CustomAxeItem(NickelToolMaterial.INSTANCE, 1.4f, 0.4f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem LEAD_AXE = new CustomAxeItem(LeadToolMaterial.INSTANCE, 1.4f, 0.4f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem THALLIUM_AXE = new CustomAxeItem(ThalliumToolMaterial.INSTANCE, 1.6f, 0.6f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem INDIAN_AXE = new CustomAxeItem(IndianToolMaterial.INSTANCE, 1.6f, 0.6f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem BRONZE_AXE = new CustomAxeItem(BronzeToolMaterial.INSTANCE, 1.6f, 0.6f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem BRASS_AXE = new CustomAxeItem(BrassToolMaterial.INSTANCE, 1.6f, 0.6f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem INVAR_AXE = new CustomAxeItem(InvarToolMaterial.INSTANCE, 2.0f, 0.8f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem TOMBAC_AXE = new CustomAxeItem(TombacToolMaterial.INSTANCE, 2.0f, 0.8f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem NICHROME_AXE = new CustomAxeItem(NichromeToolMaterial.INSTANCE, 2.0f, 0.8f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem ELECTRON_AXE = new CustomAxeItem(ElectronToolMaterial.INSTANCE, 2.0f, 0.8f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem BISMUTH_AXE = new CustomAxeItem(BismuthToolMaterial.INSTANCE, 2.6f, 1.8f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem VIBRANIUM_AXE = new CustomAxeItem(VibraniumToolMaterial.INSTANCE, 2.6f, 1.8f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem ADAMANTIUM_AXE = new CustomAxeItem(AdamantiumToolMaterial.INSTANCE, 3.2f, 1.8f, new Item.Settings().group(AttlasMod.TOOLS));
  
  //Pickaxes
  public static final ToolItem STEEL_PICKAXE = new CustomPickaxeItem(SteelToolMaterial.INSTANCE, -4, -3.0f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem TIN_PICKAXE = new CustomPickaxeItem(TinToolMaterial.INSTANCE, -4, -3.0f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem ALUMINUM_PICKAXE = new CustomPickaxeItem(AluminumToolMaterial.INSTANCE, -4, -3.0f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem TITANIUM_PICKAXE = new CustomPickaxeItem(TitaniumToolMaterial.INSTANCE, -4, -3.0f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem SILVER_PICKAXE = new CustomPickaxeItem(SilverToolMaterial.INSTANCE, -4, -3.0f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem CADMIUM_PICKAXE = new CustomPickaxeItem(CadmiumToolMaterial.INSTANCE, -4, -3.0f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem COOPER_PICKAXE = new CustomPickaxeItem(CooperToolMaterial.INSTANCE, -4, -3.0f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem COBALT_PICKAXE = new CustomPickaxeItem(CobaltToolMaterial.INSTANCE, -4, -3.0f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem CHROME_PICKAXE = new CustomPickaxeItem(ChromeToolMaterial.INSTANCE, -4, -3.0f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem IRIDIUM_PICKAXE = new CustomPickaxeItem(IridiumToolMaterial.INSTANCE, -4, -3.0f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem OSMIUM_PICKAXE = new CustomPickaxeItem(OsmiumToolMaterial.INSTANCE, -4, -3.0f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem NICKEL_PICKAXE = new CustomPickaxeItem(NickelToolMaterial.INSTANCE, -4, -3.0f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem LEAD_PICKAXE = new CustomPickaxeItem(LeadToolMaterial.INSTANCE, -4, -3.0f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem THALLIUM_PICKAXE = new CustomPickaxeItem(ThalliumToolMaterial.INSTANCE, -4, -3.0f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem INDIAN_PICKAXE = new CustomPickaxeItem(IndianToolMaterial.INSTANCE, -4, -3.0f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem BRONZE_PICKAXE = new CustomPickaxeItem(BronzeToolMaterial.INSTANCE, -4, -3.0f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem BRASS_PICKAXE = new CustomPickaxeItem(BrassToolMaterial.INSTANCE, -4, -3.0f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem INVAR_PICKAXE = new CustomPickaxeItem(InvarToolMaterial.INSTANCE, -4, -3.0f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem TOMBAC_PICKAXE = new CustomPickaxeItem(TombacToolMaterial.INSTANCE, -4, -3.0f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem NICHROME_PICKAXE = new CustomPickaxeItem(NichromeToolMaterial.INSTANCE, -4, -3.0f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem ELECTRON_PICKAXE = new CustomPickaxeItem(ElectronToolMaterial.INSTANCE, -4, -3.0f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem BISMUTH_PICKAXE = new CustomPickaxeItem(BismuthToolMaterial.INSTANCE, -4, -3.0f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem VIBRANIUM_PICKAXE = new CustomPickaxeItem(VibraniumToolMaterial.INSTANCE, -4, -3.0f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem ADAMANTIUM_PICKAXE = new CustomPickaxeItem(AdamantiumToolMaterial.INSTANCE, -4, -3.0f, new Item.Settings().group(AttlasMod.TOOLS));

  //Shovels
  public static final ToolItem STEEL_SHOVEL = new ShovelItem(SteelToolMaterial.INSTANCE, -2.5f, -1.2f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem TIN_SHOVEL = new ShovelItem(TinToolMaterial.INSTANCE, -2.5f, -1.2f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem ALUMINUM_SHOVEL = new ShovelItem(AluminumToolMaterial.INSTANCE, -2.5f, -1.2f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem TITANIUM_SHOVEL = new ShovelItem(TitaniumToolMaterial.INSTANCE, -2.5f, -1.2f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem SILVER_SHOVEL = new ShovelItem(SilverToolMaterial.INSTANCE, -2.5f, -1.2f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem CADMIUM_SHOVEL = new ShovelItem(CadmiumToolMaterial.INSTANCE, -2.5f, -1.2f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem COOPER_SHOVEL = new ShovelItem(CooperToolMaterial.INSTANCE, -2.5f, -1.2f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem COBALT_SHOVEL = new ShovelItem(CobaltToolMaterial.INSTANCE, -2.5f, -1.2f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem CHROME_SHOVEL = new ShovelItem(ChromeToolMaterial.INSTANCE, -2.5f, -1.2f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem IRIDIUM_SHOVEL = new ShovelItem(IridiumToolMaterial.INSTANCE, -2.5f, -1.2f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem OSMIUM_SHOVEL = new ShovelItem(OsmiumToolMaterial.INSTANCE, -2.5f, -1.2f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem NICKEL_SHOVEL = new ShovelItem(NickelToolMaterial.INSTANCE, -2.5f, -1.2f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem LEAD_SHOVEL = new ShovelItem(LeadToolMaterial.INSTANCE, -2.5f, -1.2f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem THALLIUM_SHOVEL = new ShovelItem(ThalliumToolMaterial.INSTANCE, -2.5f, -1.2f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem INDIAN_SHOVEL = new ShovelItem(IndianToolMaterial.INSTANCE, -2.5f, -1.2f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem BRONZE_SHOVEL = new ShovelItem(BronzeToolMaterial.INSTANCE, -2.5f, -1.2f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem BRASS_SHOVEL = new ShovelItem(BrassToolMaterial.INSTANCE, -2.5f, -1.2f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem INVAR_SHOVEL = new ShovelItem(InvarToolMaterial.INSTANCE, -2.5f, -1.2f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem TOMBAC_SHOVEL = new ShovelItem(TombacToolMaterial.INSTANCE, -2.5f, -1.2f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem NICHROME_SHOVEL = new ShovelItem(NichromeToolMaterial.INSTANCE, -2.5f, -1.2f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem ELECTRON_SHOVEL = new ShovelItem(ElectronToolMaterial.INSTANCE, -2.5f, -1.2f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem BISMUTH_SHOVEL = new ShovelItem(BismuthToolMaterial.INSTANCE, -2.5f, -1.2f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem VIBRANIUM_SHOVEL = new ShovelItem(VibraniumToolMaterial.INSTANCE, -2.5f, -1.2f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem ADAMANTIUM_SHOVEL = new ShovelItem(AdamantiumToolMaterial.INSTANCE, -2.5f, -1.2f, new Item.Settings().group(AttlasMod.TOOLS));

  //Hoes
  public static final ToolItem STEEL_HOE = new CustomHoeItem(SteelToolMaterial.INSTANCE, -2, 0.0f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem TIN_HOE = new CustomHoeItem(TinToolMaterial.INSTANCE, -2, 0.0f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem ALUMINUM_HOE = new CustomHoeItem(AluminumToolMaterial.INSTANCE, -2, 0.0f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem TITANIUM_HOE = new CustomHoeItem(TitaniumToolMaterial.INSTANCE, -9, 0.0f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem SILVER_HOE = new CustomHoeItem(SilverToolMaterial.INSTANCE, -9, 0.0f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem CADMIUM_HOE = new CustomHoeItem(CadmiumToolMaterial.INSTANCE, -9, 0.0f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem COOPER_HOE = new CustomHoeItem(CooperToolMaterial.INSTANCE, -9, -2.5f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem COBALT_HOE = new CustomHoeItem(CobaltToolMaterial.INSTANCE, -9, -2.5f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem CHROME_HOE = new CustomHoeItem(ChromeToolMaterial.INSTANCE, -9, -2.5f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem IRIDIUM_HOE = new CustomHoeItem(IridiumToolMaterial.INSTANCE, -9, -2.5f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem OSMIUM_HOE = new CustomHoeItem(OsmiumToolMaterial.INSTANCE, -9, -2.5f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem NICKEL_HOE = new CustomHoeItem(NickelToolMaterial.INSTANCE, -9, -2.5f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem LEAD_HOE = new CustomHoeItem(LeadToolMaterial.INSTANCE, -9, -2.5f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem THALLIUM_HOE = new CustomHoeItem(ThalliumToolMaterial.INSTANCE, -9, -2.5f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem INDIAN_HOE = new CustomHoeItem(IndianToolMaterial.INSTANCE, -9, -2.5f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem BRONZE_HOE = new CustomHoeItem(BronzeToolMaterial.INSTANCE, -9, -2.5f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem BRASS_HOE = new CustomHoeItem(BrassToolMaterial.INSTANCE, -9, -2.5f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem INVAR_HOE = new CustomHoeItem(InvarToolMaterial.INSTANCE, -9, -2.5f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem TOMBAC_HOE = new CustomHoeItem(TombacToolMaterial.INSTANCE, -9, -2.5f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem NICHROME_HOE = new CustomHoeItem(NichromeToolMaterial.INSTANCE, -9, -2.5f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem ELECTRON_HOE = new CustomHoeItem(ElectronToolMaterial.INSTANCE, -9, -2.5f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem BISMUTH_HOE = new CustomHoeItem(BismuthToolMaterial.INSTANCE, -9, -2.5f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem VIBRANIUM_HOE = new CustomHoeItem(VibraniumToolMaterial.INSTANCE, -9, -2.5f, new Item.Settings().group(AttlasMod.TOOLS));
  public static final ToolItem ADAMANTIUM_HOE = new CustomHoeItem(AdamantiumToolMaterial.INSTANCE, -9, -2.5f, new Item.Settings().group(AttlasMod.TOOLS));

  public static void registrySwords() {
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "steel_sword"), STEEL_SWORD);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "tin_sword"), TIN_SWORD);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "aluminum_sword"), ALUMINUM_SWORD);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "titanium_sword"), TITANIUM_SWORD);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "silver_sword"), SILVER_SWORD);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "cadmium_sword"), CADMIUM_SWORD);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "cooper_sword"), COOPER_SWORD);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "cobalt_sword"), COBALT_SWORD);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "chrome_sword"), CHROME_SWORD);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "iridium_sword"), IRIDIUM_SWORD);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "osmium_sword"), OSMIUM_SWORD);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "nickel_sword"), NICKEL_SWORD);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "lead_sword"), LEAD_SWORD);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "thallium_sword"), THALLIUM_SWORD);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "indian_sword"), INDIAN_SWORD);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "bronze_sword"), BRONZE_SWORD);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "brass_sword"), BRASS_SWORD);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "invar_sword"), INVAR_SWORD);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "tombac_sword"), TOMBAC_SWORD);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "nichrome_sword"), NICHROME_SWORD);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "electron_sword"), ELECTRON_SWORD);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "bismuth_sword"), BISMUTH_SWORD);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "vibranium_sword"), VIBRANIUM_SWORD);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "adamantium_sword"), ADAMANTIUM_SWORD);
  }

  public static void registryAxes() {
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "steel_axe"), STEEL_AXE);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "tin_axe"), TIN_AXE);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "aluminum_axe"), ALUMINUM_AXE);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "titanium_axe"), TITANIUM_AXE);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "silver_axe"), SILVER_AXE);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "cadmium_axe"), CADMIUM_AXE);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "cooper_axe"), COOPER_AXE);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "cobalt_axe"), COBALT_AXE);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "chrome_axe"), CHROME_AXE);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "iridium_axe"), IRIDIUM_AXE);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "osmium_axe"), OSMIUM_AXE);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "nickel_axe"), NICKEL_AXE);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "lead_axe"), LEAD_AXE);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "thallium_axe"), THALLIUM_AXE);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "indian_axe"), INDIAN_AXE);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "bronze_axe"), BRONZE_AXE);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "brass_axe"), BRASS_AXE);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "invar_axe"), INVAR_AXE);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "tombac_axe"), TOMBAC_AXE);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "nichrome_axe"), NICHROME_AXE);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "electron_axe"), ELECTRON_AXE);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "bismuth_axe"), BISMUTH_AXE);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "vibranium_axe"), VIBRANIUM_AXE);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "adamantium_axe"), ADAMANTIUM_AXE);
  }

  public static void registryPickaxes() {
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "steel_pickaxe"), STEEL_PICKAXE);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "tin_pickaxe"), TIN_PICKAXE);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "aluminum_pickaxe"), ALUMINUM_PICKAXE);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "titanium_pickaxe"), TITANIUM_PICKAXE);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "silver_pickaxe"), SILVER_PICKAXE);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "cadmium_pickaxe"), CADMIUM_PICKAXE);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "cooper_pickaxe"), COOPER_PICKAXE);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "cobalt_pickaxe"), COBALT_PICKAXE);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "chrome_pickaxe"), CHROME_PICKAXE);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "iridium_pickaxe"), IRIDIUM_PICKAXE);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "osmium_pickaxe"), OSMIUM_PICKAXE);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "nickel_pickaxe"), NICKEL_PICKAXE);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "lead_pickaxe"), LEAD_PICKAXE);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "thallium_pickaxe"), THALLIUM_PICKAXE);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "indian_pickaxe"), INDIAN_PICKAXE);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "bronze_pickaxe"), BRONZE_PICKAXE);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "brass_pickaxe"), BRASS_PICKAXE);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "invar_pickaxe"), INVAR_PICKAXE);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "tombac_pickaxe"), TOMBAC_PICKAXE);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "nichrome_pickaxe"), NICHROME_PICKAXE);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "electron_pickaxe"), ELECTRON_PICKAXE);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "bismuth_pickaxe"), BISMUTH_PICKAXE);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "vibranium_pickaxe"), VIBRANIUM_PICKAXE);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "adamantium_pickaxe"), ADAMANTIUM_PICKAXE);
  }

  public static void registryShovels() {
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "steel_shovel"), STEEL_SHOVEL);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "tin_shovel"), TIN_SHOVEL);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "aluminum_shovel"), ALUMINUM_SHOVEL);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "titanium_shovel"), TITANIUM_SHOVEL);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "silver_shovel"), SILVER_SHOVEL);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "cadmium_shovel"), CADMIUM_SHOVEL);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "cooper_shovel"), COOPER_SHOVEL);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "cobalt_shovel"), COBALT_SHOVEL);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "chrome_shovel"), CHROME_SHOVEL);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "iridium_shovel"), IRIDIUM_SHOVEL);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "osmium_shovel"), OSMIUM_SHOVEL);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "nickel_shovel"), NICKEL_SHOVEL);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "lead_shovel"), LEAD_SHOVEL);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "thallium_shovel"), THALLIUM_SHOVEL);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "indian_shovel"), INDIAN_SHOVEL);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "bronze_shovel"), BRONZE_SHOVEL);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "brass_shovel"), BRASS_SHOVEL);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "invar_shovel"), INVAR_SHOVEL);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "tombac_shovel"), TOMBAC_SHOVEL);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "nichrome_shovel"), NICHROME_SHOVEL);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "electron_shovel"), ELECTRON_SHOVEL);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "bismuth_shovel"), BISMUTH_SHOVEL);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "vibranium_shovel"), VIBRANIUM_SHOVEL);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "adamantium_shovel"), ADAMANTIUM_SHOVEL);
  }

  public static void registryHoes() {
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "steel_hoe"), STEEL_HOE);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "tin_hoe"), TIN_HOE);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "aluminum_hoe"), ALUMINUM_HOE);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "titanium_hoe"), TITANIUM_HOE);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "silver_hoe"), SILVER_HOE);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "cadmium_hoe"), CADMIUM_HOE);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "cooper_hoe"), COOPER_HOE);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "cobalt_hoe"), COBALT_HOE);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "chrome_hoe"), CHROME_HOE);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "iridium_hoe"), IRIDIUM_HOE);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "osmium_hoe"), OSMIUM_HOE);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "nickel_hoe"), NICKEL_HOE);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "lead_hoe"), LEAD_HOE);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "thallium_hoe"), THALLIUM_HOE);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "indian_hoe"), INDIAN_HOE);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "bronze_hoe"), BRONZE_HOE);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "brass_hoe"), BRASS_HOE);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "invar_hoe"), INVAR_HOE);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "tombac_hoe"), TOMBAC_HOE);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "nichrome_hoe"), NICHROME_HOE);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "electron_hoe"), ELECTRON_HOE);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "bismuth_hoe"), BISMUTH_HOE);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "vibranium_hoe"), VIBRANIUM_HOE);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "adamantium_hoe"), ADAMANTIUM_HOE);
  }

}
