package net.humba01.inquiry.blocks.cromatic.concretes;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.humba01.inquiry.InquiryMod;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class CromaticConcretes {

  //Primary Concretes
  public static final Block PRIMARY_RED_CONCRETE = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));
  public static final Block PRIMARY_BLUE_CONCRETE = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));
  public static final Block PRIMARY_YELLOW_CONCRETE = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));

  //Secondary Concretes
  public static final Block SECONDARY_GREEN_CONCRETE = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));
  public static final Block SECONDARY_ORANGE_CONCRETE = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));
  public static final Block SECONDARY_VIOLET_CONCRETE = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));

  //Tertiary Concretes
  public static final Block TERTIARY_ORANGE_RED_CONCRETE = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));
  public static final Block TERTIARY_PURPLISH_RED_CONCRETE = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));
  public static final Block TERTIARY_GREENISH_YELLOW_CONCRETE = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));
  public static final Block TERTIARY_ORANGE_YELLOW_CONCRETE = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));
  public static final Block TERTIARY_BLUE_GREEN_CONCRETE = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));
  public static final Block TERTIARY_BLUE_PURPLE_CONCRETE = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));

  //Neutral Concretes
  public static final Block NEUTRAL_WHITE_CONCRETE = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));
  public static final Block NEUTRAL_BLACK_CONCRETE = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));
  public static final Block NEUTRAL_GRAY_CONCRETE = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));
  
  //Mixed Concretes
  public static final Block MIXED_BROWN_CONCRETE = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));

  public static void registryPrimaryConcretes() {
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "primary_red_concrete"), PRIMARY_RED_CONCRETE);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "primary_red_concrete"), new BlockItem(PRIMARY_RED_CONCRETE, new Item.Settings().group(InquiryMod.CROMATIC_CONCRETE_BLOCKS)));
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "primary_blue_concrete"), PRIMARY_BLUE_CONCRETE);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "primary_blue_concrete"), new BlockItem(PRIMARY_BLUE_CONCRETE, new Item.Settings().group(InquiryMod.CROMATIC_CONCRETE_BLOCKS)));
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "primary_yellow_concrete"), PRIMARY_YELLOW_CONCRETE);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "primary_yellow_concrete"), new BlockItem(PRIMARY_YELLOW_CONCRETE, new Item.Settings().group(InquiryMod.CROMATIC_CONCRETE_BLOCKS)));
  }

  public static void registrySecondaryConcretes() {
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "secondary_green_concrete"), SECONDARY_GREEN_CONCRETE);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "secondary_green_concrete"), new BlockItem(SECONDARY_GREEN_CONCRETE, new Item.Settings().group(InquiryMod.CROMATIC_CONCRETE_BLOCKS)));
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "secondary_violet_concrete"), SECONDARY_VIOLET_CONCRETE);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "secondary_violet_concrete"), new BlockItem(SECONDARY_VIOLET_CONCRETE, new Item.Settings().group(InquiryMod.CROMATIC_CONCRETE_BLOCKS)));
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "secondary_orange_concrete"), SECONDARY_ORANGE_CONCRETE);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "secondary_orange_concrete"), new BlockItem(SECONDARY_ORANGE_CONCRETE, new Item.Settings().group(InquiryMod.CROMATIC_CONCRETE_BLOCKS)));
  }

  public static void registryTertiaryConcretes() {
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "tertiary_orange_red_concrete"), TERTIARY_ORANGE_RED_CONCRETE);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "tertiary_orange_red_concrete"), new BlockItem(TERTIARY_ORANGE_RED_CONCRETE, new Item.Settings().group(InquiryMod.CROMATIC_CONCRETE_BLOCKS)));
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "tertiary_purplish_red_concrete"), TERTIARY_PURPLISH_RED_CONCRETE);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "tertiary_purplish_red_concrete"), new BlockItem(TERTIARY_PURPLISH_RED_CONCRETE, new Item.Settings().group(InquiryMod.CROMATIC_CONCRETE_BLOCKS)));
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "tertiary_greenish_yellow_concrete"), TERTIARY_GREENISH_YELLOW_CONCRETE);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "tertiary_greenish_yellow_concrete"), new BlockItem(TERTIARY_GREENISH_YELLOW_CONCRETE, new Item.Settings().group(InquiryMod.CROMATIC_CONCRETE_BLOCKS)));
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "tertiary_orange_yellow_concrete"), TERTIARY_ORANGE_YELLOW_CONCRETE);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "tertiary_orange_yellow_concrete"), new BlockItem(TERTIARY_ORANGE_YELLOW_CONCRETE, new Item.Settings().group(InquiryMod.CROMATIC_CONCRETE_BLOCKS)));
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "tertiary_blue_green_concrete"), TERTIARY_BLUE_GREEN_CONCRETE);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "tertiary_blue_green_concrete"), new BlockItem(TERTIARY_BLUE_GREEN_CONCRETE, new Item.Settings().group(InquiryMod.CROMATIC_CONCRETE_BLOCKS)));
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "tertiary_blue_purple_concrete"), TERTIARY_BLUE_PURPLE_CONCRETE);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "tertiary_blue_purple_concrete"), new BlockItem(TERTIARY_BLUE_PURPLE_CONCRETE, new Item.Settings().group(InquiryMod.CROMATIC_CONCRETE_BLOCKS)));
  }

  public static void registryNeutralConcretes() {
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "neutral_white_concrete"), NEUTRAL_WHITE_CONCRETE);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "neutral_white_concrete"), new BlockItem(NEUTRAL_WHITE_CONCRETE, new Item.Settings().group(InquiryMod.CROMATIC_CONCRETE_BLOCKS)));
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "neutral_black_concrete"), NEUTRAL_BLACK_CONCRETE);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "neutral_black_concrete"), new BlockItem(NEUTRAL_BLACK_CONCRETE, new Item.Settings().group(InquiryMod.CROMATIC_CONCRETE_BLOCKS)));
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "neutral_gray_concrete"), NEUTRAL_GRAY_CONCRETE);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "neutral_gray_concrete"), new BlockItem(NEUTRAL_GRAY_CONCRETE, new Item.Settings().group(InquiryMod.CROMATIC_CONCRETE_BLOCKS)));
  }

  public static void registryMixedConcretes() {
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "mixed_brown_concrete"), MIXED_BROWN_CONCRETE);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "mixed_brown_concrete"), new BlockItem(MIXED_BROWN_CONCRETE, new Item.Settings().group(InquiryMod.CROMATIC_CONCRETE_BLOCKS)));
  }

}
