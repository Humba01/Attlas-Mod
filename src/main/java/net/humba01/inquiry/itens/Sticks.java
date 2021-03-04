package net.humba01.inquiry.itens;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.humba01.inquiry.InquiryMod;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Sticks {

  /* Sticks */
    public final static Item STONE_STICK = new Item(new FabricItemSettings().group(InquiryMod.STICKS));
    public final static Item IRON_STICK = new Item(new FabricItemSettings().group(InquiryMod.STICKS));
    public final static Item STEEL_STICK = new Item(new FabricItemSettings().group(InquiryMod.STICKS));
    public final static Item TIN_STICK = new Item(new FabricItemSettings().group(InquiryMod.STICKS));
    public final static Item ALUMINUM_STICK = new Item(new FabricItemSettings().group(InquiryMod.STICKS));
    public final static Item TITANIUM_STICK = new Item(new FabricItemSettings().group(InquiryMod.STICKS));
    public final static Item CADMIUM_STICK = new Item(new FabricItemSettings().group(InquiryMod.STICKS));
    public final static Item COBALT_STICK = new Item(new FabricItemSettings().group(InquiryMod.STICKS));
    public final static Item VIBRANIUM_STICK = new Item(new FabricItemSettings().group(InquiryMod.STICKS));
    public final static Item ADAMANTIUM_STICK = new Item(new FabricItemSettings().group(InquiryMod.STICKS));
    public final static Item BISMUTH_STICK = new Item(new FabricItemSettings().group(InquiryMod.STICKS));
    public final static Item SILVER_STICK = new Item(new FabricItemSettings().group(InquiryMod.STICKS));
    public final static Item COOPER_STICK = new Item(new FabricItemSettings().group(InquiryMod.STICKS));
    public final static Item CHROME_STICK = new Item(new FabricItemSettings().group(InquiryMod.STICKS));
    public final static Item IRIDIUM_STICK = new Item(new FabricItemSettings().group(InquiryMod.STICKS));
    public final static Item OSMIUM_STICK = new Item(new FabricItemSettings().group(InquiryMod.STICKS));
    public final static Item NICKEL_STICK = new Item(new FabricItemSettings().group(InquiryMod.STICKS));
    public final static Item LEAD_STICK = new Item(new FabricItemSettings().group(InquiryMod.STICKS));
    public final static Item THALLIUM_STICK = new Item(new FabricItemSettings().group(InquiryMod.STICKS));
    public final static Item INDIAN_STICK = new Item(new FabricItemSettings().group(InquiryMod.STICKS));
    public final static Item BRONZE_STICK = new Item(new FabricItemSettings().group(InquiryMod.STICKS));
    public final static Item BRASS_STICK = new Item(new FabricItemSettings().group(InquiryMod.STICKS));
    public final static Item INVAR_STICK = new Item(new FabricItemSettings().group(InquiryMod.STICKS));
    public final static Item TOMBAC_STICK = new Item(new FabricItemSettings().group(InquiryMod.STICKS));
    public final static Item ELECTRON_STICK = new Item(new FabricItemSettings().group(InquiryMod.STICKS));
    public final static Item NICHROME_STICK = new Item(new FabricItemSettings().group(InquiryMod.STICKS));

  public static void registrySticks() {
    
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "stone_stick"), STONE_STICK);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "iron_stick"), IRON_STICK);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "steel_stick"), STEEL_STICK);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "tin_stick"), TIN_STICK);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "aluminum_stick"), ALUMINUM_STICK);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "titanium_stick"), TITANIUM_STICK);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "cadmium_stick"), CADMIUM_STICK);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "cobalt_stick"), COBALT_STICK);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "vibranium_stick"), VIBRANIUM_STICK);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "adamantium_stick"), ADAMANTIUM_STICK);

    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "silver_stick"), SILVER_STICK);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "bismuth_stick"), BISMUTH_STICK);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "cooper_stick"), COOPER_STICK);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "chrome_stick"), CHROME_STICK);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "iridium_stick"), IRIDIUM_STICK);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "osmium_stick"), OSMIUM_STICK);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "nickel_stick"), NICKEL_STICK);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "lead_stick"), LEAD_STICK);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "thallium_stick"), THALLIUM_STICK);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "indian_stick"), INDIAN_STICK);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "bronze_stick"), BRONZE_STICK);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "brass_stick"), BRASS_STICK);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "invar_stick"), INVAR_STICK);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "tombac_stick"), TOMBAC_STICK);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "nichrome_stick"), NICHROME_STICK);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "electron_stick"), ELECTRON_STICK);

  }
}

