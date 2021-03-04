package net.humba01.inquiry.blocks.cromatic.concretes;

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

public class CromaticConcreteStairs extends StairsBlock {

  protected CromaticConcreteStairs(BlockState baseBlockState, Settings settings) {
    super(baseBlockState, settings);
    // TODO Auto-generated constructor stub
  }

  // Primary Concrete Stairs
  public static final Block PRIMARY_RED_CONCRETE_STAIRS = new CromaticConcreteStairs(CromaticConcretes.PRIMARY_RED_CONCRETE.getDefaultState(), FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));
  public static final Block PRIMARY_BLUE_CONCRETE_STAIRS = new CromaticConcreteStairs(CromaticConcretes.PRIMARY_BLUE_CONCRETE.getDefaultState(), FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));
  public static final Block PRIMARY_YELLOW_CONCRETE_STAIRS = new CromaticConcreteStairs(CromaticConcretes.PRIMARY_YELLOW_CONCRETE.getDefaultState(), FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));

  //Secondary Concrete Stairs
  public static final Block SECONDARY_GREEN_CONCRETE_STAIRS = new CromaticConcreteStairs(CromaticConcretes.SECONDARY_GREEN_CONCRETE.getDefaultState(), FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));
  public static final Block SECONDARY_ORANGE_CONCRETE_STAIRS = new CromaticConcreteStairs(CromaticConcretes.SECONDARY_ORANGE_CONCRETE.getDefaultState(), FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));
  public static final Block SECONDARY_VIOLET_CONCRETE_STAIRS = new CromaticConcreteStairs(CromaticConcretes.SECONDARY_VIOLET_CONCRETE.getDefaultState(),FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));

  //Tertiary Concrete Stairs
  public static final Block TERTIARY_ORANGE_RED_CONCRETE_STAIRS = new CromaticConcreteStairs(CromaticConcretes.TERTIARY_ORANGE_RED_CONCRETE.getDefaultState(), FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));
  public static final Block TERTIARY_PURPLISH_RED_CONCRETE_STAIRS = new CromaticConcreteStairs(CromaticConcretes.TERTIARY_PURPLISH_RED_CONCRETE.getDefaultState(), FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));
  public static final Block TERTIARY_GREENISH_YELLOW_CONCRETE_STAIRS = new CromaticConcreteStairs(CromaticConcretes.TERTIARY_GREENISH_YELLOW_CONCRETE.getDefaultState(), FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));
  public static final Block TERTIARY_ORANGE_YELLOW_CONCRETE_STAIRS = new CromaticConcreteStairs(CromaticConcretes.TERTIARY_ORANGE_YELLOW_CONCRETE.getDefaultState(), FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));
  public static final Block TERTIARY_BLUE_GREEN_CONCRETE_STAIRS = new CromaticConcreteStairs(CromaticConcretes.TERTIARY_BLUE_GREEN_CONCRETE.getDefaultState(), FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));
  public static final Block TERTIARY_BLUE_PURPLE_CONCRETE_STAIRS = new CromaticConcreteStairs(CromaticConcretes.TERTIARY_BLUE_PURPLE_CONCRETE.getDefaultState(), FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));

  //Neutral Concrete Stairs
  public static final Block NEUTRAL_WHITE_CONCRETE_STAIRS = new CromaticConcreteStairs(CromaticConcretes.NEUTRAL_WHITE_CONCRETE.getDefaultState(), FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));
  public static final Block NEUTRAL_BLACK_CONCRETE_STAIRS = new CromaticConcreteStairs(CromaticConcretes.NEUTRAL_BLACK_CONCRETE.getDefaultState(), FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));
  public static final Block NEUTRAL_GRAY_CONCRETE_STAIRS = new CromaticConcreteStairs(CromaticConcretes.NEUTRAL_GRAY_CONCRETE.getDefaultState(), FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));
  
  //Mixed Concrete Stairs
  public static final Block MIXED_BROWN_CONCRETE_STAIRS = new CromaticConcreteStairs(CromaticConcretes.MIXED_BROWN_CONCRETE.getDefaultState(), FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));
  
  public static void registryPrimaryConcreteStairs() {
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "primary_red_concrete_stairs"), PRIMARY_RED_CONCRETE_STAIRS);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "primary_red_concrete_stairs"), new BlockItem(PRIMARY_RED_CONCRETE_STAIRS, new Item.Settings().group(InquiryMod.CROMATIC_CONCRETE_BLOCKS)));
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "primary_blue_concrete_stairs"), PRIMARY_BLUE_CONCRETE_STAIRS);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "primary_blue_concrete_stairs"), new BlockItem(PRIMARY_BLUE_CONCRETE_STAIRS, new Item.Settings().group(InquiryMod.CROMATIC_CONCRETE_BLOCKS)));
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "primary_yellow_concrete_stairs"), PRIMARY_YELLOW_CONCRETE_STAIRS);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "primary_yellow_concrete_stairs"), new BlockItem(PRIMARY_YELLOW_CONCRETE_STAIRS, new Item.Settings().group(InquiryMod.CROMATIC_CONCRETE_BLOCKS)));
  }
  
  public static void registrySecondaryConcreteStairs() {
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "secondary_green_concrete_stairs"), SECONDARY_GREEN_CONCRETE_STAIRS);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "secondary_green_concrete_stairs"), new BlockItem(SECONDARY_GREEN_CONCRETE_STAIRS, new Item.Settings().group(InquiryMod.CROMATIC_CONCRETE_BLOCKS)));
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "secondary_violet_concrete_stairs"), SECONDARY_VIOLET_CONCRETE_STAIRS);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "secondary_violet_concrete_stairs"), new BlockItem(SECONDARY_VIOLET_CONCRETE_STAIRS, new Item.Settings().group(InquiryMod.CROMATIC_CONCRETE_BLOCKS)));
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "secondary_orange_concrete_stairs"), SECONDARY_ORANGE_CONCRETE_STAIRS);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "secondary_orange_concrete_stairs"), new BlockItem(SECONDARY_ORANGE_CONCRETE_STAIRS, new Item.Settings().group(InquiryMod.CROMATIC_CONCRETE_BLOCKS)));
  }
  
  public static void registryTertiaryConcreteStairs() {
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "tertiary_orange_red_concrete_stairs"), TERTIARY_ORANGE_RED_CONCRETE_STAIRS);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "tertiary_orange_red_concrete_stairs"), new BlockItem(TERTIARY_ORANGE_RED_CONCRETE_STAIRS, new Item.Settings().group(InquiryMod.CROMATIC_CONCRETE_BLOCKS)));
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "tertiary_purplish_red_concrete_stairs"), TERTIARY_PURPLISH_RED_CONCRETE_STAIRS);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "tertiary_purplish_red_concrete_stairs"), new BlockItem(TERTIARY_PURPLISH_RED_CONCRETE_STAIRS, new Item.Settings().group(InquiryMod.CROMATIC_CONCRETE_BLOCKS)));
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "tertiary_greenish_yellow_concrete_stairs"), TERTIARY_GREENISH_YELLOW_CONCRETE_STAIRS);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "tertiary_greenish_yellow_concrete_stairs"), new BlockItem(TERTIARY_GREENISH_YELLOW_CONCRETE_STAIRS, new Item.Settings().group(InquiryMod.CROMATIC_CONCRETE_BLOCKS)));
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "tertiary_orange_yellow_concrete_stairs"), TERTIARY_ORANGE_YELLOW_CONCRETE_STAIRS);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "tertiary_orange_yellow_concrete_stairs"), new BlockItem(TERTIARY_ORANGE_YELLOW_CONCRETE_STAIRS, new Item.Settings().group(InquiryMod.CROMATIC_CONCRETE_BLOCKS)));
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "tertiary_blue_green_concrete_stairs"), TERTIARY_BLUE_GREEN_CONCRETE_STAIRS);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "tertiary_blue_green_concrete_stairs"), new BlockItem(TERTIARY_BLUE_GREEN_CONCRETE_STAIRS, new Item.Settings().group(InquiryMod.CROMATIC_CONCRETE_BLOCKS)));
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "tertiary_blue_purple_concrete_stairs"), TERTIARY_BLUE_PURPLE_CONCRETE_STAIRS);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "tertiary_blue_purple_concrete_stairs"), new BlockItem(TERTIARY_BLUE_PURPLE_CONCRETE_STAIRS, new Item.Settings().group(InquiryMod.CROMATIC_CONCRETE_BLOCKS)));
  }
  
  public static void registryNeutralConcreteStairs() {
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "neutral_white_concrete_stairs"), NEUTRAL_WHITE_CONCRETE_STAIRS);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "neutral_white_concrete_stairs"), new BlockItem(NEUTRAL_WHITE_CONCRETE_STAIRS, new Item.Settings().group(InquiryMod.CROMATIC_CONCRETE_BLOCKS)));
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "neutral_black_concrete_stairs"), NEUTRAL_BLACK_CONCRETE_STAIRS);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "neutral_black_concrete_stairs"), new BlockItem(NEUTRAL_BLACK_CONCRETE_STAIRS, new Item.Settings().group(InquiryMod.CROMATIC_CONCRETE_BLOCKS)));
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "neutral_gray_concrete_stairs"), NEUTRAL_GRAY_CONCRETE_STAIRS);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "neutral_gray_concrete_stairs"), new BlockItem(NEUTRAL_GRAY_CONCRETE_STAIRS, new Item.Settings().group(InquiryMod.CROMATIC_CONCRETE_BLOCKS)));
  }
  
  public static void registryMixedConcreteStairs() {
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "mixed_brown_concrete_stairs"), MIXED_BROWN_CONCRETE_STAIRS);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "mixed_brown_concrete_stairs"), new BlockItem(MIXED_BROWN_CONCRETE_STAIRS, new Item.Settings().group(InquiryMod.CROMATIC_CONCRETE_BLOCKS)));
  }

}
