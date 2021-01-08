package net.humba01.attlas.itens;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.humba01.attlas.AttlasMod;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Ingots {

  /* Ingots */
  public static final Item STEEL_INGOT = new Item(new FabricItemSettings().group(AttlasMod.INGOTS));
  public static final Item TIN_INGOT = new Item(new FabricItemSettings().group(AttlasMod.INGOTS));
  public static final Item ALUMINUM_INGOT = new Item(new FabricItemSettings().group(AttlasMod.INGOTS));
  public static final Item TITANIUM_INGOT = new Item(new FabricItemSettings().group(AttlasMod.INGOTS));
  public static final Item BISMUTH_INGOT = new Item(new FabricItemSettings().group(AttlasMod.INGOTS));
  public static final Item SILVER_INGOT = new Item(new FabricItemSettings().group(AttlasMod.INGOTS));
  public static final Item CADMIUM_INGOT = new Item(new FabricItemSettings().group(AttlasMod.INGOTS));
  public static final Item COOPER_INGOT = new Item(new FabricItemSettings().group(AttlasMod.INGOTS));
  public static final Item COBALT_INGOT = new Item(new FabricItemSettings().group(AttlasMod.INGOTS));
  public static final Item CHROME_INGOT = new Item(new FabricItemSettings().group(AttlasMod.INGOTS));
  public static final Item IRIDIUM_INGOT = new Item(new FabricItemSettings().group(AttlasMod.INGOTS));
  public static final Item OSMIUM_INGOT = new Item(new FabricItemSettings().group(AttlasMod.INGOTS));
  public static final Item VIBRANIUM_INGOT = new Item(new FabricItemSettings().group(AttlasMod.INGOTS));
  public static final Item ADAMANTIUM_INGOT = new Item(new FabricItemSettings().group(AttlasMod.INGOTS));
  public static final Item NICKEL_INGOT = new Item(new FabricItemSettings().group(AttlasMod.INGOTS));
  public static final Item LEAD_INGOT = new Item(new FabricItemSettings().group(AttlasMod.INGOTS));
  public static final Item THALLIUM_INGOT = new Item(new FabricItemSettings().group(AttlasMod.INGOTS));
  public static final Item INDIAN_INGOT = new Item(new FabricItemSettings().group(AttlasMod.INGOTS));
  public static final Item BRONZE_INGOT = new Item(new FabricItemSettings().group(AttlasMod.INGOTS));
  public static final Item BRASS_INGOT = new Item(new FabricItemSettings().group(AttlasMod.INGOTS));
  public static final Item INVAR_INGOT = new Item(new FabricItemSettings().group(AttlasMod.INGOTS));
  public static final Item TOMBAC_INGOT = new Item(new FabricItemSettings().group(AttlasMod.INGOTS));
  public static final Item NICHROME_INGOT = new Item(new FabricItemSettings().group(AttlasMod.INGOTS));
  public static final Item ELECTRON_INGOT = new Item(new FabricItemSettings().group(AttlasMod.INGOTS));

  public static void registryIngots() {
    
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "steel_ingot"), STEEL_INGOT);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "tin_ingot"), TIN_INGOT);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "aluminum_ingot"), ALUMINUM_INGOT);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "titanium_ingot"), TITANIUM_INGOT);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "bismuth_ingot"), BISMUTH_INGOT);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "silver_ingot"), SILVER_INGOT);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "cadmium_ingot"), CADMIUM_INGOT);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "cooper_ingot"), COOPER_INGOT);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "cobalt_ingot"), COBALT_INGOT);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "chrome_ingot"), CHROME_INGOT);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "iridium_ingot"), IRIDIUM_INGOT);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "osmium_ingot"), OSMIUM_INGOT);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "nickel_ingot"), NICKEL_INGOT);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "lead_ingot"), LEAD_INGOT);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "thallium_ingot"), THALLIUM_INGOT);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "indian_ingot"), INDIAN_INGOT);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "bronze_ingot"), BRONZE_INGOT);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "brass_ingot"), BRASS_INGOT);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "invar_ingot"), INVAR_INGOT);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "tombac_ingot"), TOMBAC_INGOT);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "nichrome_ingot"), NICHROME_INGOT);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "electron_ingot"), ELECTRON_INGOT);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "vibranium_ingot"), VIBRANIUM_INGOT);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "adamantium_ingot"), ADAMANTIUM_INGOT);

  }

}
