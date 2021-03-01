package net.humba01.inquiry.blocks.cromatic.bricks;

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

public class CromaticBrickStairs extends StairsBlock {

  protected CromaticBrickStairs(BlockState baseBlockState, Settings settings) {
    super(baseBlockState, settings);
    // TODO Auto-generated constructor stub
  }

  // Primary Brick Stairs
  public static final Block PRIMARY_RED_BRICK_STAIRS = new CromaticBrickStairs(CromaticBricks.PRIMARY_RED_BRICKS.getDefaultState(), FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));
  public static final Block PRIMARY_BLUE_BRICK_STAIRS = new CromaticBrickStairs(CromaticBricks.PRIMARY_BLUE_BRICKS.getDefaultState(), FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));
  public static final Block PRIMARY_YELLOW_BRICK_STAIRS = new CromaticBrickStairs(CromaticBricks.PRIMARY_YELLOW_BRICKS.getDefaultState(), FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));

  //Secondary Brick Stairs
  public static final Block SECONDARY_GREEN_BRICK_STAIRS = new CromaticBrickStairs(CromaticBricks.SECONDARY_GREEN_BRICKS.getDefaultState(), FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));
  public static final Block SECONDARY_ORANGE_BRICK_STAIRS = new CromaticBrickStairs(CromaticBricks.SECONDARY_ORANGE_BRICKS.getDefaultState(), FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));
  public static final Block SECONDARY_VIOLET_BRICK_STAIRS = new CromaticBrickStairs(CromaticBricks.SECONDARY_VIOLET_BRICKS.getDefaultState(), FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));

  //Tertiary Brick Stairs
  public static final Block TERTIARY_ORANGE_RED_BRICK_STAIRS = new CromaticBrickStairs(CromaticBricks.TERTIARY_ORANGE_RED_BRICKS.getDefaultState(), FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));
  public static final Block TERTIARY_PURPLISH_RED_BRICK_STAIRS = new CromaticBrickStairs(CromaticBricks.TERTIARY_PURPLISH_RED_BRICKS.getDefaultState(), FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));
  public static final Block TERTIARY_GREENISH_YELLOW_BRICK_STAIRS = new CromaticBrickStairs(CromaticBricks.TERTIARY_GREENISH_YELLOW_BRICKS.getDefaultState(), FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));
  public static final Block TERTIARY_ORANGE_YELLOW_BRICK_STAIRS = new CromaticBrickStairs(CromaticBricks.TERTIARY_ORANGE_YELLOW_BRICKS.getDefaultState(), FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));
  public static final Block TERTIARY_BLUE_GREEN_BRICK_STAIRS = new CromaticBrickStairs(CromaticBricks.TERTIARY_BLUE_GREEN_BRICKS.getDefaultState(), FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));
  public static final Block TERTIARY_BLUE_PURPLE_BRICK_STAIRS = new CromaticBrickStairs(CromaticBricks.TERTIARY_BLUE_PURPLE_BRICKS.getDefaultState(), FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));

  //Neutral Brick Stairs
  public static final Block NEUTRAL_WHITE_BRICK_STAIRS = new CromaticBrickStairs(CromaticBricks.NEUTRAL_WHITE_BRICKS.getDefaultState(), FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));
  public static final Block NEUTRAL_BLACK_BRICK_STAIRS = new CromaticBrickStairs(CromaticBricks.NEUTRAL_BLACK_BRICKS.getDefaultState(), FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));
  public static final Block NEUTRAL_GRAY_BRICK_STAIRS = new CromaticBrickStairs(CromaticBricks.NEUTRAL_GRAY_BRICKS.getDefaultState(), FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));
  
  //Mixed Brick Stairs
  public static final Block MIXED_BROWN_BRICK_STAIRS = new CromaticBrickStairs(CromaticBricks.MIXED_BROWN_BRICKS.getDefaultState(), FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));

  public static void registryPrimaryBrickStairs() {
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "primary_red_brick_stairs"), PRIMARY_RED_BRICK_STAIRS);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "primary_red_brick_stairs"), new BlockItem(PRIMARY_RED_BRICK_STAIRS, new Item.Settings().group(InquiryMod.CROMATIC_BRICK_BLOCKS)));
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "primary_blue_brick_stairs"), PRIMARY_BLUE_BRICK_STAIRS);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "primary_blue_brick_stairs"), new BlockItem(PRIMARY_BLUE_BRICK_STAIRS, new Item.Settings().group(InquiryMod.CROMATIC_BRICK_BLOCKS)));
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "primary_yellow_brick_stairs"), PRIMARY_YELLOW_BRICK_STAIRS);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "primary_yellow_brick_stairs"), new BlockItem(PRIMARY_YELLOW_BRICK_STAIRS, new Item.Settings().group(InquiryMod.CROMATIC_BRICK_BLOCKS)));
  }

  public static void registrySecondaryBrickStairs() {
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "secondary_green_brick_stairs"), SECONDARY_GREEN_BRICK_STAIRS);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "secondary_green_brick_stairs"), new BlockItem(SECONDARY_GREEN_BRICK_STAIRS, new Item.Settings().group(InquiryMod.CROMATIC_BRICK_BLOCKS)));
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "secondary_violet_brick_stairs"), SECONDARY_VIOLET_BRICK_STAIRS);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "secondary_violet_brick_stairs"), new BlockItem(SECONDARY_VIOLET_BRICK_STAIRS, new Item.Settings().group(InquiryMod.CROMATIC_BRICK_BLOCKS)));
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "secondary_orange_brick_stairs"), SECONDARY_ORANGE_BRICK_STAIRS);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "secondary_orange_brick_stairs"), new BlockItem(SECONDARY_ORANGE_BRICK_STAIRS, new Item.Settings().group(InquiryMod.CROMATIC_BRICK_BLOCKS)));
  }
  
  public static void registryTertiaryBrickStairs() {
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "tertiary_orange_red_brick_stairs"), TERTIARY_ORANGE_RED_BRICK_STAIRS);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "tertiary_orange_red_brick_stairs"), new BlockItem(TERTIARY_ORANGE_RED_BRICK_STAIRS, new Item.Settings().group(InquiryMod.CROMATIC_BRICK_BLOCKS)));
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "tertiary_purplish_red_brick_stairs"), TERTIARY_PURPLISH_RED_BRICK_STAIRS);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "tertiary_purplish_red_brick_stairs"), new BlockItem(TERTIARY_PURPLISH_RED_BRICK_STAIRS, new Item.Settings().group(InquiryMod.CROMATIC_BRICK_BLOCKS)));
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "tertiary_greenish_yellow_brick_stairs"), TERTIARY_GREENISH_YELLOW_BRICK_STAIRS);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "tertiary_greenish_yellow_brick_stairs"), new BlockItem(TERTIARY_GREENISH_YELLOW_BRICK_STAIRS, new Item.Settings().group(InquiryMod.CROMATIC_BRICK_BLOCKS)));
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "tertiary_orange_yellow_brick_stairs"), TERTIARY_ORANGE_YELLOW_BRICK_STAIRS);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "tertiary_orange_yellow_brick_stairs"), new BlockItem(TERTIARY_ORANGE_YELLOW_BRICK_STAIRS, new Item.Settings().group(InquiryMod.CROMATIC_BRICK_BLOCKS)));
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "tertiary_blue_green_brick_stairs"), TERTIARY_BLUE_GREEN_BRICK_STAIRS);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "tertiary_blue_green_brick_stairs"), new BlockItem(TERTIARY_BLUE_GREEN_BRICK_STAIRS, new Item.Settings().group(InquiryMod.CROMATIC_BRICK_BLOCKS)));
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "tertiary_blue_purple_brick_stairs"), TERTIARY_BLUE_PURPLE_BRICK_STAIRS);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "tertiary_blue_purple_brick_stairs"), new BlockItem(TERTIARY_BLUE_PURPLE_BRICK_STAIRS, new Item.Settings().group(InquiryMod.CROMATIC_BRICK_BLOCKS)));
  }
  
  public static void registryNeutralBrickStairs() {
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "neutral_white_brick_stairs"), NEUTRAL_WHITE_BRICK_STAIRS);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "neutral_white_brick_stairs"), new BlockItem(NEUTRAL_WHITE_BRICK_STAIRS, new Item.Settings().group(InquiryMod.CROMATIC_BRICK_BLOCKS)));
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "neutral_black_brick_stairs"), NEUTRAL_BLACK_BRICK_STAIRS);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "neutral_black_brick_stairs"), new BlockItem(NEUTRAL_BLACK_BRICK_STAIRS, new Item.Settings().group(InquiryMod.CROMATIC_BRICK_BLOCKS)));
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "neutral_gray_brick_stairs"), NEUTRAL_GRAY_BRICK_STAIRS);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "neutral_gray_brick_stairs"), new BlockItem(NEUTRAL_GRAY_BRICK_STAIRS, new Item.Settings().group(InquiryMod.CROMATIC_BRICK_BLOCKS)));
  }
  
  public static void registryMixedBrickStairs() {
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "mixed_brown_brick_stairs"), MIXED_BROWN_BRICK_STAIRS);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "mixed_brown_brick_stairs"), new BlockItem(MIXED_BROWN_BRICK_STAIRS, new Item.Settings().group(InquiryMod.CROMATIC_BRICK_BLOCKS)));
  }

}
