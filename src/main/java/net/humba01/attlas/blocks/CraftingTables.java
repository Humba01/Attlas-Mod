package net.humba01.attlas.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.humba01.attlas.AttlasMod;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class CraftingTables {

  /* Crafting Tables */
  public static final Block EXTENDED_CRAFTING_TABLE_TIER1 = new Block(
      FabricBlockSettings.of(Material.WOOD).hardness(6.0f).resistance(1.4f).sounds(BlockSoundGroup.WOOD));
  public static final Block EXTENDED_CRAFTING_TABLE_TIER2 = new Block(
      FabricBlockSettings.of(Material.WOOD).hardness(6.0f).resistance(1.4f).sounds(BlockSoundGroup.WOOD));
  public static final Block EXTENDED_CRAFTING_TABLE_TIER3 = new Block(
      FabricBlockSettings.of(Material.WOOD).hardness(6.0f).resistance(1.4f).sounds(BlockSoundGroup.WOOD));
  public static final Block EXTENDED_CRAFTING_TABLE_TIER4 = new Block(
      FabricBlockSettings.of(Material.WOOD).hardness(6.0f).resistance(1.4f).sounds(BlockSoundGroup.WOOD));
  public static final Block EXTENDED_CRAFTING_TABLE_TIER5 = new Block(
      FabricBlockSettings.of(Material.WOOD).hardness(6.0f).resistance(1.4f).sounds(BlockSoundGroup.WOOD));
  public static final Block EXTENDED_CRAFTING_TABLE_TIER6 = new Block(
      FabricBlockSettings.of(Material.WOOD).hardness(6.0f).resistance(1.4f).sounds(BlockSoundGroup.WOOD));

  public static void registryCraftingTables() {

    Registry.register(Registry.BLOCK, new Identifier(AttlasMod.MOD_ID, "extended_crafting_table_tier1"), EXTENDED_CRAFTING_TABLE_TIER1);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "extended_crafting_table_tier1"), new BlockItem(EXTENDED_CRAFTING_TABLE_TIER1, new Item.Settings().group(AttlasMod.EXTENDED_CRAFTING_TABLES)));
    Registry.register(Registry.BLOCK, new Identifier(AttlasMod.MOD_ID, "extended_crafting_table_tier2"), EXTENDED_CRAFTING_TABLE_TIER2);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "extended_crafting_table_tier2"), new BlockItem(EXTENDED_CRAFTING_TABLE_TIER2, new Item.Settings().group(AttlasMod.EXTENDED_CRAFTING_TABLES)));
    Registry.register(Registry.BLOCK, new Identifier(AttlasMod.MOD_ID, "extended_crafting_table_tier3"), EXTENDED_CRAFTING_TABLE_TIER3);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "extended_crafting_table_tier3"), new BlockItem(EXTENDED_CRAFTING_TABLE_TIER3, new Item.Settings().group(AttlasMod.EXTENDED_CRAFTING_TABLES)));
    Registry.register(Registry.BLOCK, new Identifier(AttlasMod.MOD_ID, "extended_crafting_table_tier4"), EXTENDED_CRAFTING_TABLE_TIER4);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "extended_crafting_table_tier4"), new BlockItem(EXTENDED_CRAFTING_TABLE_TIER4, new Item.Settings().group(AttlasMod.EXTENDED_CRAFTING_TABLES)));
    Registry.register(Registry.BLOCK, new Identifier(AttlasMod.MOD_ID, "extended_crafting_table_tier5"), EXTENDED_CRAFTING_TABLE_TIER5);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "extended_crafting_table_tier5"), new BlockItem(EXTENDED_CRAFTING_TABLE_TIER5, new Item.Settings().group(AttlasMod.EXTENDED_CRAFTING_TABLES)));
    Registry.register(Registry.BLOCK, new Identifier(AttlasMod.MOD_ID, "extended_crafting_table_tier6"), EXTENDED_CRAFTING_TABLE_TIER6);
    Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "extended_crafting_table_tier6"), new BlockItem(EXTENDED_CRAFTING_TABLE_TIER6, new Item.Settings().group(AttlasMod.EXTENDED_CRAFTING_TABLES)));

  }
  
}
