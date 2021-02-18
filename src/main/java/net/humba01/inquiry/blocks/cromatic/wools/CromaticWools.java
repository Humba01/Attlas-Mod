package net.humba01.inquiry.blocks.cromatic.wools;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.humba01.inquiry.InquiryMod;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class CromaticWools {

  //Primary Wools
  public static final Block PRIMARY_RED_WOOL = new Block(FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));
  public static final Block PRIMARY_BLUE_WOOL = new Block(FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));
  public static final Block PRIMARY_YELLOW_WOOL = new Block(FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));

  //Secondary Wools
  public static final Block SECONDARY_GREEN_WOOL = new Block(FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));
  public static final Block SECONDARY_ORANGE_WOOL = new Block(FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));
  public static final Block SECONDARY_VIOLET_WOOL = new Block(FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));

  //Tertiary Wools
  public static final Block TERTIARY_ORANGE_RED_WOOL = new Block(FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));
  public static final Block TERTIARY_PURPLISH_RED_WOOL = new Block(FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));
  public static final Block TERTIARY_GREENISH_YELLOW_WOOL = new Block(FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));
  public static final Block TERTIARY_ORANGE_YELLOW_WOOL = new Block(FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));
  public static final Block TERTIARY_BLUE_GREEN_WOOL = new Block(FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));
  public static final Block TERTIARY_BLUE_PURPLE_WOOL = new Block(FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));

  //Neutral Wools
  public static final Block NEUTRAL_WHITE_WOOL = new Block(FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));
  public static final Block NEUTRAL_BLACK_WOOL = new Block(FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));
  public static final Block NEUTRAL_GRAY_WOOL = new Block(FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));

  //Mixed Wools 
  public static final Block MIXED_BROWN_WOOL = new Block(FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));

  public static void registryPrimaryWools() {
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "primary_red_wool"), PRIMARY_RED_WOOL);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "primary_red_wool"), new BlockItem(PRIMARY_RED_WOOL, new Item.Settings().group(InquiryMod.CROMATIC_WOOL_BLOCKS)));
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "primary_blue_wool"), PRIMARY_BLUE_WOOL);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "primary_blue_wool"), new BlockItem(PRIMARY_BLUE_WOOL, new Item.Settings().group(InquiryMod.CROMATIC_WOOL_BLOCKS)));
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "primary_yellow_wool"), PRIMARY_YELLOW_WOOL);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "primary_yellow_wool"), new BlockItem(PRIMARY_YELLOW_WOOL, new Item.Settings().group(InquiryMod.CROMATIC_WOOL_BLOCKS)));
  }

  public static void registrySecondaryWools() {
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "secondary_green_wool"), SECONDARY_GREEN_WOOL);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "secondary_green_wool"), new BlockItem(SECONDARY_GREEN_WOOL, new Item.Settings().group(InquiryMod.CROMATIC_WOOL_BLOCKS)));
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "secondary_violet_wool"), SECONDARY_VIOLET_WOOL);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "secondary_violet_wool"), new BlockItem(SECONDARY_VIOLET_WOOL, new Item.Settings().group(InquiryMod.CROMATIC_WOOL_BLOCKS)));
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "secondary_orange_wool"), SECONDARY_ORANGE_WOOL);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "secondary_orange_wool"), new BlockItem(SECONDARY_ORANGE_WOOL, new Item.Settings().group(InquiryMod.CROMATIC_WOOL_BLOCKS)));
  }

  public static void registryTertiaryWools() {
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "tertiary_orange_red_wool"), TERTIARY_ORANGE_RED_WOOL);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "tertiary_orange_red_wool"), new BlockItem(TERTIARY_ORANGE_RED_WOOL, new Item.Settings().group(InquiryMod.CROMATIC_WOOL_BLOCKS)));
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "tertiary_purplish_red_wool"), TERTIARY_PURPLISH_RED_WOOL);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "tertiary_purplish_red_wool"), new BlockItem(TERTIARY_PURPLISH_RED_WOOL, new Item.Settings().group(InquiryMod.CROMATIC_WOOL_BLOCKS)));
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "tertiary_greenish_yellow_wool"), TERTIARY_GREENISH_YELLOW_WOOL);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "tertiary_greenish_yellow_wool"), new BlockItem(TERTIARY_GREENISH_YELLOW_WOOL, new Item.Settings().group(InquiryMod.CROMATIC_WOOL_BLOCKS)));
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "tertiary_orange_yellow_wool"), TERTIARY_ORANGE_YELLOW_WOOL);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "tertiary_orange_yellow_wool"), new BlockItem(TERTIARY_ORANGE_YELLOW_WOOL, new Item.Settings().group(InquiryMod.CROMATIC_WOOL_BLOCKS)));
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "tertiary_blue_green_wool"), TERTIARY_BLUE_GREEN_WOOL);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "tertiary_blue_green_wool"), new BlockItem(TERTIARY_BLUE_GREEN_WOOL, new Item.Settings().group(InquiryMod.CROMATIC_WOOL_BLOCKS)));
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "tertiary_blue_purple_wool"), TERTIARY_BLUE_PURPLE_WOOL);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "tertiary_blue_purple_wool"), new BlockItem(TERTIARY_BLUE_PURPLE_WOOL, new Item.Settings().group(InquiryMod.CROMATIC_WOOL_BLOCKS)));
  }

  public static void registryNeutralWools() {
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "neutral_white_wool"), NEUTRAL_WHITE_WOOL);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "neutral_white_wool"), new BlockItem(NEUTRAL_WHITE_WOOL, new Item.Settings().group(InquiryMod.CROMATIC_WOOL_BLOCKS)));
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "neutral_black_wool"), NEUTRAL_BLACK_WOOL);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "neutral_black_wool"), new BlockItem(NEUTRAL_BLACK_WOOL, new Item.Settings().group(InquiryMod.CROMATIC_WOOL_BLOCKS)));
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "neutral_gray_wool"), NEUTRAL_GRAY_WOOL);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "neutral_gray_wool"), new BlockItem(NEUTRAL_GRAY_WOOL, new Item.Settings().group(InquiryMod.CROMATIC_WOOL_BLOCKS)));
  }

  public static void registryMixedWools() {
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "mixed_brown_wool"), MIXED_BROWN_WOOL);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "mixed_brown_wool"), new BlockItem(MIXED_BROWN_WOOL, new Item.Settings().group(InquiryMod.CROMATIC_WOOL_BLOCKS)));
  }

}
