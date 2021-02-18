package net.humba01.inquiry.blocks.cromatic.bricks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.humba01.inquiry.InquiryMod;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class CromaticBricks {
  
  //Primary Bricks
  public static final Block PRIMARY_RED_BRICKS = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));
  public static final Block PRIMARY_BLUE_BRICKS = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));
  public static final Block PRIMARY_YELLOW_BRICKS = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));

  //Secondary Bricks
  public static final Block SECONDARY_GREEN_BRICKS = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));
  public static final Block SECONDARY_ORANGE_BRICKS = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));
  public static final Block SECONDARY_VIOLET_BRICKS = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));

  //Tertiary Bricks
  public static final Block TERTIARY_ORANGE_RED_BRICKS = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));
  public static final Block TERTIARY_PURPLISH_RED_BRICKS = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));
  public static final Block TERTIARY_GREENISH_YELLOW_BRICKS = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));
  public static final Block TERTIARY_ORANGE_YELLOW_BRICKS = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));
  public static final Block TERTIARY_BLUE_GREEN_BRICKS = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));
  public static final Block TERTIARY_BLUE_PURPLE_BRICKS = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));

  //Neutral Bricks
  public static final Block NEUTRAL_WHITE_BRICKS = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));
  public static final Block NEUTRAL_BLACK_BRICKS = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));
  public static final Block NEUTRAL_GRAY_BRICKS = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));
  
  //Mixed Bricks
  public static final Block MIXED_BROWN_BRICKS = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));

  public static void registryPrimaryBricks() {
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "primary_red_bricks"), PRIMARY_RED_BRICKS);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "primary_red_bricks"), new BlockItem(PRIMARY_RED_BRICKS, new Item.Settings().group(InquiryMod.CROMATIC_BRICK_BLOCKS)));
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "primary_blue_bricks"), PRIMARY_BLUE_BRICKS);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "primary_blue_bricks"), new BlockItem(PRIMARY_BLUE_BRICKS, new Item.Settings().group(InquiryMod.CROMATIC_BRICK_BLOCKS)));
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "primary_yellow_bricks"), PRIMARY_YELLOW_BRICKS);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "primary_yellow_bricks"), new BlockItem(PRIMARY_YELLOW_BRICKS, new Item.Settings().group(InquiryMod.CROMATIC_BRICK_BLOCKS)));
  }

  public static void registrySecondaryBricks() {
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "secondary_green_bricks"), SECONDARY_GREEN_BRICKS);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "secondary_green_bricks"), new BlockItem(SECONDARY_GREEN_BRICKS, new Item.Settings().group(InquiryMod.CROMATIC_BRICK_BLOCKS)));
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "secondary_violet_bricks"), SECONDARY_VIOLET_BRICKS);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "secondary_violet_bricks"), new BlockItem(SECONDARY_VIOLET_BRICKS, new Item.Settings().group(InquiryMod.CROMATIC_BRICK_BLOCKS)));
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "secondary_orange_bricks"), SECONDARY_ORANGE_BRICKS);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "secondary_orange_bricks"), new BlockItem(SECONDARY_ORANGE_BRICKS, new Item.Settings().group(InquiryMod.CROMATIC_BRICK_BLOCKS)));
  }

  public static void registryTertiaryBricks() {
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "tertiary_orange_red_bricks"), TERTIARY_ORANGE_RED_BRICKS);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "tertiary_orange_red_bricks"), new BlockItem(TERTIARY_ORANGE_RED_BRICKS, new Item.Settings().group(InquiryMod.CROMATIC_BRICK_BLOCKS)));
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "tertiary_purplish_red_bricks"), TERTIARY_PURPLISH_RED_BRICKS);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "tertiary_purplish_red_bricks"), new BlockItem(TERTIARY_PURPLISH_RED_BRICKS, new Item.Settings().group(InquiryMod.CROMATIC_BRICK_BLOCKS)));
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "tertiary_greenish_yellow_bricks"), TERTIARY_GREENISH_YELLOW_BRICKS);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "tertiary_greenish_yellow_bricks"), new BlockItem(TERTIARY_GREENISH_YELLOW_BRICKS, new Item.Settings().group(InquiryMod.CROMATIC_BRICK_BLOCKS)));
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "tertiary_orange_yellow_bricks"), TERTIARY_ORANGE_YELLOW_BRICKS);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "tertiary_orange_yellow_bricks"), new BlockItem(TERTIARY_ORANGE_YELLOW_BRICKS, new Item.Settings().group(InquiryMod.CROMATIC_BRICK_BLOCKS)));
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "tertiary_blue_green_bricks"), TERTIARY_BLUE_GREEN_BRICKS);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "tertiary_blue_green_bricks"), new BlockItem(TERTIARY_BLUE_GREEN_BRICKS, new Item.Settings().group(InquiryMod.CROMATIC_BRICK_BLOCKS)));
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "tertiary_blue_purple_bricks"), TERTIARY_BLUE_PURPLE_BRICKS);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "tertiary_blue_purple_bricks"), new BlockItem(TERTIARY_BLUE_PURPLE_BRICKS, new Item.Settings().group(InquiryMod.CROMATIC_BRICK_BLOCKS)));
  }

  public static void registryNeutralBricks() {
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "neutral_white_bricks"), NEUTRAL_WHITE_BRICKS);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "neutral_white_bricks"), new BlockItem(NEUTRAL_WHITE_BRICKS, new Item.Settings().group(InquiryMod.CROMATIC_BRICK_BLOCKS)));
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "neutral_black_bricks"), NEUTRAL_BLACK_BRICKS);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "neutral_black_bricks"), new BlockItem(NEUTRAL_BLACK_BRICKS, new Item.Settings().group(InquiryMod.CROMATIC_BRICK_BLOCKS)));
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "neutral_gray_bricks"), NEUTRAL_GRAY_BRICKS);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "neutral_gray_bricks"), new BlockItem(NEUTRAL_GRAY_BRICKS, new Item.Settings().group(InquiryMod.CROMATIC_BRICK_BLOCKS)));

  }

  public static void registryMixedBricks() {
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "mixed_brown_bricks"), MIXED_BROWN_BRICKS);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "mixed_brown_bricks"), new BlockItem(MIXED_BROWN_BRICKS, new Item.Settings().group(InquiryMod.CROMATIC_BRICK_BLOCKS)));
  }

}
