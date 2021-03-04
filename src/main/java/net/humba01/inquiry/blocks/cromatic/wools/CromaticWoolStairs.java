package net.humba01.inquiry.blocks.cromatic.wools;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.humba01.inquiry.InquiryMod;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.block.StairsBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class CromaticWoolStairs extends StairsBlock {

  protected CromaticWoolStairs(BlockState baseBlockState, Settings settings) {
    super(baseBlockState, settings);
    // TODO Auto-generated constructor stub
  }

  // Primary Wool Stairs
  public static final Block PRIMARY_RED_WOOL_STAIRS = new CromaticWoolStairs(CromaticWools.PRIMARY_RED_WOOL.getDefaultState(), FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));
  public static final Block PRIMARY_BLUE_WOOL_STAIRS = new CromaticWoolStairs(CromaticWools.PRIMARY_BLUE_WOOL.getDefaultState(), FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));
  public static final Block PRIMARY_YELLOW_WOOL_STAIRS = new CromaticWoolStairs(CromaticWools.PRIMARY_YELLOW_WOOL.getDefaultState(), FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));

  //Secondary Wool Stairs
  public static final Block SECONDARY_GREEN_WOOL_STAIRS = new CromaticWoolStairs(CromaticWools.SECONDARY_GREEN_WOOL.getDefaultState(), FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));
  public static final Block SECONDARY_ORANGE_WOOL_STAIRS = new CromaticWoolStairs(CromaticWools.SECONDARY_ORANGE_WOOL.getDefaultState(), FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));
  public static final Block SECONDARY_VIOLET_WOOL_STAIRS = new CromaticWoolStairs(CromaticWools.SECONDARY_VIOLET_WOOL.getDefaultState(), FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));

  //Tertiary Wool Stairs
  public static final Block TERTIARY_ORANGE_RED_WOOL_STAIRS = new CromaticWoolStairs(CromaticWools.TERTIARY_ORANGE_RED_WOOL.getDefaultState(), FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));
  public static final Block TERTIARY_PURPLISH_RED_WOOL_STAIRS = new CromaticWoolStairs(CromaticWools.TERTIARY_PURPLISH_RED_WOOL.getDefaultState(), FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));
  public static final Block TERTIARY_GREENISH_YELLOW_WOOL_STAIRS = new CromaticWoolStairs(CromaticWools.TERTIARY_GREENISH_YELLOW_WOOL.getDefaultState(), FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));
  public static final Block TERTIARY_ORANGE_YELLOW_WOOL_STAIRS = new CromaticWoolStairs(CromaticWools.TERTIARY_ORANGE_YELLOW_WOOL.getDefaultState(), FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));
  public static final Block TERTIARY_BLUE_GREEN_WOOL_STAIRS = new CromaticWoolStairs(CromaticWools.TERTIARY_BLUE_GREEN_WOOL.getDefaultState(), FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));
  public static final Block TERTIARY_BLUE_PURPLE_WOOL_STAIRS = new CromaticWoolStairs(CromaticWools.TERTIARY_BLUE_PURPLE_WOOL.getDefaultState(), FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));

  //Neutral Wool Stairs
  public static final Block NEUTRAL_WHITE_WOOL_STAIRS = new CromaticWoolStairs(CromaticWools.NEUTRAL_WHITE_WOOL.getDefaultState(), FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));
  public static final Block NEUTRAL_BLACK_WOOL_STAIRS = new CromaticWoolStairs(CromaticWools.NEUTRAL_BLACK_WOOL.getDefaultState(), FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));
  public static final Block NEUTRAL_GRAY_WOOL_STAIRS = new CromaticWoolStairs(CromaticWools.NEUTRAL_GRAY_WOOL.getDefaultState(), FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));
  
  //Mixed Wool Stairs
  public static final Block MIXED_BROWN_WOOL_STAIRS = new CromaticWoolStairs(CromaticWools.MIXED_BROWN_WOOL.getDefaultState(), FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));
  
  public static void registryPrimaryWoolStairs() {
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "primary_red_wool_stairs"), PRIMARY_RED_WOOL_STAIRS);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "primary_red_wool_stairs"), new BlockItem(PRIMARY_RED_WOOL_STAIRS, new Item.Settings().group(InquiryMod.CROMATIC_WOOL_BLOCKS)));
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "primary_blue_wool_stairs"), PRIMARY_BLUE_WOOL_STAIRS);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "primary_blue_wool_stairs"), new BlockItem(PRIMARY_BLUE_WOOL_STAIRS, new Item.Settings().group(InquiryMod.CROMATIC_WOOL_BLOCKS)));
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "primary_yellow_wool_stairs"), PRIMARY_YELLOW_WOOL_STAIRS);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "primary_yellow_wool_stairs"), new BlockItem(PRIMARY_YELLOW_WOOL_STAIRS, new Item.Settings().group(InquiryMod.CROMATIC_WOOL_BLOCKS)));
  }
  
  public static void registrySecondaryWoolStairs() {
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "secondary_green_wool_stairs"), SECONDARY_GREEN_WOOL_STAIRS);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "secondary_green_wool_stairs"), new BlockItem(SECONDARY_GREEN_WOOL_STAIRS, new Item.Settings().group(InquiryMod.CROMATIC_WOOL_BLOCKS)));
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "secondary_violet_wool_stairs"), SECONDARY_VIOLET_WOOL_STAIRS);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "secondary_violet_wool_stairs"), new BlockItem(SECONDARY_VIOLET_WOOL_STAIRS, new Item.Settings().group(InquiryMod.CROMATIC_WOOL_BLOCKS)));
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "secondary_orange_wool_stairs"), SECONDARY_ORANGE_WOOL_STAIRS);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "secondary_orange_wool_stairs"), new BlockItem(SECONDARY_ORANGE_WOOL_STAIRS, new Item.Settings().group(InquiryMod.CROMATIC_WOOL_BLOCKS)));
  }
  
  public static void registryTertiaryWoolStairs() {
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "tertiary_orange_red_wool_stairs"), TERTIARY_ORANGE_RED_WOOL_STAIRS);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "tertiary_orange_red_wool_stairs"), new BlockItem(TERTIARY_ORANGE_RED_WOOL_STAIRS, new Item.Settings().group(InquiryMod.CROMATIC_WOOL_BLOCKS)));
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "tertiary_purplish_red_wool_stairs"), TERTIARY_PURPLISH_RED_WOOL_STAIRS);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "tertiary_purplish_red_wool_stairs"), new BlockItem(TERTIARY_PURPLISH_RED_WOOL_STAIRS, new Item.Settings().group(InquiryMod.CROMATIC_WOOL_BLOCKS)));
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "tertiary_greenish_yellow_wool_stairs"), TERTIARY_GREENISH_YELLOW_WOOL_STAIRS);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "tertiary_greenish_yellow_wool_stairs"), new BlockItem(TERTIARY_GREENISH_YELLOW_WOOL_STAIRS, new Item.Settings().group(InquiryMod.CROMATIC_WOOL_BLOCKS)));
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "tertiary_orange_yellow_wool_stairs"), TERTIARY_ORANGE_YELLOW_WOOL_STAIRS);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "tertiary_orange_yellow_wool_stairs"), new BlockItem(TERTIARY_ORANGE_YELLOW_WOOL_STAIRS, new Item.Settings().group(InquiryMod.CROMATIC_WOOL_BLOCKS)));
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "tertiary_blue_green_wool_stairs"), TERTIARY_BLUE_GREEN_WOOL_STAIRS);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "tertiary_blue_green_wool_stairs"), new BlockItem(TERTIARY_BLUE_GREEN_WOOL_STAIRS, new Item.Settings().group(InquiryMod.CROMATIC_WOOL_BLOCKS)));
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "tertiary_blue_purple_wool_stairs"), TERTIARY_BLUE_PURPLE_WOOL_STAIRS);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "tertiary_blue_purple_wool_stairs"), new BlockItem(TERTIARY_BLUE_PURPLE_WOOL_STAIRS, new Item.Settings().group(InquiryMod.CROMATIC_WOOL_BLOCKS)));
  }
  
  public static void registryNeutralWoolStairs() {
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "neutral_white_wool_stairs"), NEUTRAL_WHITE_WOOL_STAIRS);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "neutral_white_wool_stairs"), new BlockItem(NEUTRAL_WHITE_WOOL_STAIRS, new Item.Settings().group(InquiryMod.CROMATIC_WOOL_BLOCKS)));
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "neutral_black_wool_stairs"), NEUTRAL_BLACK_WOOL_STAIRS);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "neutral_black_wool_stairs"), new BlockItem(NEUTRAL_BLACK_WOOL_STAIRS, new Item.Settings().group(InquiryMod.CROMATIC_WOOL_BLOCKS)));
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "neutral_gray_wool_stairs"), NEUTRAL_GRAY_WOOL_STAIRS);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "neutral_gray_wool_stairs"), new BlockItem(NEUTRAL_GRAY_WOOL_STAIRS, new Item.Settings().group(InquiryMod.CROMATIC_WOOL_BLOCKS)));
  }
  
  public static void registryMixedWoolStairs() {
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "mixed_brown_wool_stairs"), MIXED_BROWN_WOOL_STAIRS);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "mixed_brown_wool_stairs"), new BlockItem(MIXED_BROWN_WOOL_STAIRS, new Item.Settings().group(InquiryMod.CROMATIC_WOOL_BLOCKS)));
  }

}
