package net.humba01.attlas.itens;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.humba01.attlas.AttlasMod;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Sticks {

  /* Sticks */
    public final static Item STONE_STICK = new Item(new FabricItemSettings().group(AttlasMod.STICKS));
    public final static Item IRON_STICK = new Item(new FabricItemSettings().group(AttlasMod.STICKS));
    public final static Item STEEL_STICK = new Item(new FabricItemSettings().group(AttlasMod.STICKS));
    public final static Item TIN_STICK = new Item(new FabricItemSettings().group(AttlasMod.STICKS));
    public final static Item ALUMINUM_STICK = new Item(new FabricItemSettings().group(AttlasMod.STICKS));
    public final static Item TITANIUM_STICK = new Item(new FabricItemSettings().group(AttlasMod.STICKS));
    public final static Item CADMIUM_STICK = new Item(new FabricItemSettings().group(AttlasMod.STICKS));
    public final static Item COBALT_STICK = new Item(new FabricItemSettings().group(AttlasMod.STICKS));
    public final static Item VIBRANIUM_STICK = new Item(new FabricItemSettings().group(AttlasMod.STICKS));
    public final static Item ADAMANTIUM_STICK = new Item(new FabricItemSettings().group(AttlasMod.STICKS));

  public static void registrySticks() {
    
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "stone_stick"), STONE_STICK);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "iron_stick"), IRON_STICK);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "steel_stick"), STEEL_STICK);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "tin_stick"), TIN_STICK);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "aluminum_stick"), ALUMINUM_STICK);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "titanium_stick"), TITANIUM_STICK);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "cadmium_stick"), CADMIUM_STICK);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "cobalt_stick"), COBALT_STICK);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "vibranium_stick"), VIBRANIUM_STICK);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "adamantium_stick"), ADAMANTIUM_STICK);

  }
}

