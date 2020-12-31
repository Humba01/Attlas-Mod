package net.humba01.attlas.tools;

import net.humba01.attlas.AttlasMod;
import net.humba01.attlas.tools.material.*;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Weapons {

  //Swords
  public static final ToolItem STEEL_SWORD = new SwordItem(SteelToolMaterial.INSTANCE, 0, 0, new Item.Settings().group(AttlasMod.WEAPONS));
  public static final ToolItem TIN_SWORD = new SwordItem(TinToolMaterial.INSTANCE, 0, 0, new Item.Settings().group(AttlasMod.WEAPONS));
  public static final ToolItem ALUMINUM_SWORD = new SwordItem(AluminumToolMaterial.INSTANCE, 0, 0, new Item.Settings().group(AttlasMod.WEAPONS));
  public static final ToolItem TITANIUM_SWORD = new SwordItem(TitaniumToolMaterial.INSTANCE, 0, 0, new Item.Settings().group(AttlasMod.WEAPONS));
  public static final ToolItem SILVER_SWORD = new SwordItem(SilverToolMaterial.INSTANCE, 0, 0, new Item.Settings().group(AttlasMod.WEAPONS));
  public static final ToolItem CADMIUM_SWORD = new SwordItem(CadmiumToolMaterial.INSTANCE, 0, 0, new Item.Settings().group(AttlasMod.WEAPONS));
  public static final ToolItem COOPER_SWORD = new SwordItem(CooperToolMaterial.INSTANCE, 0, 0, new Item.Settings().group(AttlasMod.WEAPONS));
  public static final ToolItem COBALT_SWORD = new SwordItem(CobaltToolMaterial.INSTANCE, 0, 0, new Item.Settings().group(AttlasMod.WEAPONS));
  public static final ToolItem CHROME_SWORD = new SwordItem(ChromeToolMaterial.INSTANCE, 0, 0, new Item.Settings().group(AttlasMod.WEAPONS));
  public static final ToolItem IRIDIUM_SWORD = new SwordItem(IridiumToolMaterial.INSTANCE, 0, 0, new Item.Settings().group(AttlasMod.WEAPONS));
  public static final ToolItem OSMIUM_SWORD = new SwordItem(OsmiumToolMaterial.INSTANCE, 0, 0, new Item.Settings().group(AttlasMod.WEAPONS));
  public static final ToolItem NICKEL_SWORD = new SwordItem(NickelToolMaterial.INSTANCE, 0, 0, new Item.Settings().group(AttlasMod.WEAPONS));
  public static final ToolItem LEAD_SWORD = new SwordItem(LeadToolMaterial.INSTANCE, 0, 0, new Item.Settings().group(AttlasMod.WEAPONS));
  public static final ToolItem THALLIUM_SWORD = new SwordItem(ThalliumToolMaterial.INSTANCE, 0, 0, new Item.Settings().group(AttlasMod.WEAPONS));
  public static final ToolItem INDIAN_SWORD = new SwordItem(IndianToolMaterial.INSTANCE, 0, 0, new Item.Settings().group(AttlasMod.WEAPONS));
  public static final ToolItem BRONZE_SWORD = new SwordItem(BronzeToolMaterial.INSTANCE, 0, 0, new Item.Settings().group(AttlasMod.WEAPONS));
  public static final ToolItem BRASS_SWORD = new SwordItem(BrassToolMaterial.INSTANCE, 0, 0, new Item.Settings().group(AttlasMod.WEAPONS));
  public static final ToolItem INVAR_SWORD = new SwordItem(InvarToolMaterial.INSTANCE, 0, 0, new Item.Settings().group(AttlasMod.WEAPONS));
  public static final ToolItem TOMBAC_SWORD = new SwordItem(TombacToolMaterial.INSTANCE, 0, 0, new Item.Settings().group(AttlasMod.WEAPONS));
  public static final ToolItem NICHROME_SWORD = new SwordItem(NichromeToolMaterial.INSTANCE, 0, 0, new Item.Settings().group(AttlasMod.WEAPONS));
  public static final ToolItem ELECTRON_SWORD = new SwordItem(ElectronToolMaterial.INSTANCE, 0, 0, new Item.Settings().group(AttlasMod.WEAPONS));
  public static final ToolItem BISMUTH_SWORD = new SwordItem(BismuthToolMaterial.INSTANCE, 0, 0, new Item.Settings().group(AttlasMod.WEAPONS));
  public static final ToolItem VIBRANIUM_SWORD = new SwordItem(VibraniumToolMaterial.INSTANCE, 0, 0, new Item.Settings().group(AttlasMod.WEAPONS));
  public static final ToolItem ADAMANTIUM_SWORD = new SwordItem(AdamantiumToolMaterial.INSTANCE, 0, 0, new Item.Settings().group(AttlasMod.WEAPONS));
  
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

  public static void registryAxes() {}
  public static void registryPickaxes() {}
  public static void registryShovels() {}
  public static void registryHoes() {}

}
