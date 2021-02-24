package net.humba01.inquiry.blocks.cromatic.cements;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.humba01.inquiry.InquiryMod;
import net.humba01.inquiry.blocks.cromatic.concretes.CromaticConcretes;
import net.minecraft.block.Block;
import net.minecraft.block.ConcretePowderBlock;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class CromaticCements extends ConcretePowderBlock {

  public CromaticCements(Block color, Settings settings) {
    super(color, settings);
    // TODO Auto-generated constructor stub
  }

  // Primary Cements
  public static final Block PRIMARY_RED_CEMENT = new CromaticCements(CromaticConcretes.PRIMARY_RED_CONCRETE, FabricBlockSettings.of(Material.GOURD).sounds(BlockSoundGroup.SAND));
  public static final Block PRIMARY_BLUE_CEMENT = new CromaticCements(CromaticConcretes.PRIMARY_BLUE_CONCRETE, FabricBlockSettings.of(Material.GOURD).sounds(BlockSoundGroup.SAND));
  public static final Block PRIMARY_YELLOW_CEMENT = new CromaticCements(CromaticConcretes.PRIMARY_YELLOW_CONCRETE, FabricBlockSettings.of(Material.GOURD).sounds(BlockSoundGroup.SAND));

  //Secondary Cements
  public static final Block SECONDARY_GREEN_CEMENT = new CromaticCements(CromaticConcretes.SECONDARY_GREEN_CONCRETE, FabricBlockSettings.of(Material.GOURD).sounds(BlockSoundGroup.SAND));
  public static final Block SECONDARY_ORANGE_CEMENT = new CromaticCements(CromaticConcretes.SECONDARY_VIOLET_CONCRETE, FabricBlockSettings.of(Material.GOURD).sounds(BlockSoundGroup.SAND));
  public static final Block SECONDARY_VIOLET_CEMENT = new CromaticCements(CromaticConcretes.SECONDARY_ORANGE_CONCRETE, FabricBlockSettings.of(Material.GOURD).sounds(BlockSoundGroup.SAND));

  //Tertiary Cements
  public static final Block TERTIARY_ORANGE_RED_CEMENT = new CromaticCements(CromaticConcretes.TERTIARY_ORANGE_RED_CONCRETE, FabricBlockSettings.of(Material.GOURD).sounds(BlockSoundGroup.SAND));
  public static final Block TERTIARY_PURPLISH_RED_CEMENT = new CromaticCements(CromaticConcretes.TERTIARY_PURPLISH_RED_CONCRETE, FabricBlockSettings.of(Material.GOURD).sounds(BlockSoundGroup.SAND));
  public static final Block TERTIARY_GREENISH_YELLOW_CEMENT = new CromaticCements(CromaticConcretes.TERTIARY_GREENISH_YELLOW_CONCRETE, FabricBlockSettings.of(Material.GOURD).sounds(BlockSoundGroup.SAND));
  public static final Block TERTIARY_ORANGE_YELLOW_CEMENT = new CromaticCements(CromaticConcretes.TERTIARY_ORANGE_YELLOW_CONCRETE, FabricBlockSettings.of(Material.GOURD).sounds(BlockSoundGroup.SAND));
  public static final Block TERTIARY_BLUE_GREEN_CEMENT = new CromaticCements(CromaticConcretes.TERTIARY_BLUE_GREEN_CONCRETE, FabricBlockSettings.of(Material.GOURD).sounds(BlockSoundGroup.SAND));
  public static final Block TERTIARY_BLUE_PURPLE_CEMENT = new CromaticCements(CromaticConcretes.TERTIARY_BLUE_PURPLE_CONCRETE, FabricBlockSettings.of(Material.GOURD).sounds(BlockSoundGroup.SAND));

  //Neutral Cements
  public static final Block NEUTRAL_WHITE_CEMENT = new CromaticCements(CromaticConcretes.NEUTRAL_WHITE_CONCRETE, FabricBlockSettings.of(Material.GOURD).sounds(BlockSoundGroup.SAND));
  public static final Block NEUTRAL_BLACK_CEMENT = new CromaticCements(CromaticConcretes.NEUTRAL_BLACK_CONCRETE, FabricBlockSettings.of(Material.GOURD).sounds(BlockSoundGroup.SAND));
  public static final Block NEUTRAL_GRAY_CEMENT = new CromaticCements(CromaticConcretes.NEUTRAL_GRAY_CONCRETE, FabricBlockSettings.of(Material.GOURD).sounds(BlockSoundGroup.SAND));
  
  //Mixed Cements
  public static final Block MIXED_BROWN_CEMENT = new CromaticCements(CromaticConcretes.MIXED_BROWN_CONCRETE, FabricBlockSettings.of(Material.GOURD).sounds(BlockSoundGroup.SAND));
  
  public static void registryPrimaryCements() {
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "primary_red_cement"), PRIMARY_RED_CEMENT);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "primary_red_cement"), new BlockItem(PRIMARY_RED_CEMENT, new Item.Settings().group(InquiryMod.CROMATIC_CEMENT_BLOCKS)));
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "primary_blue_cement"), PRIMARY_BLUE_CEMENT);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "primary_blue_cement"), new BlockItem(PRIMARY_BLUE_CEMENT, new Item.Settings().group(InquiryMod.CROMATIC_CEMENT_BLOCKS)));
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "primary_yellow_cement"), PRIMARY_YELLOW_CEMENT);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "primary_yellow_cement"), new BlockItem(PRIMARY_YELLOW_CEMENT, new Item.Settings().group(InquiryMod.CROMATIC_CEMENT_BLOCKS)));
  }

  public static void registrySecondaryCements() {
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "secondary_green_cement"), SECONDARY_GREEN_CEMENT);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "secondary_green_cement"), new BlockItem(SECONDARY_GREEN_CEMENT, new Item.Settings().group(InquiryMod.CROMATIC_CEMENT_BLOCKS)));
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "secondary_violet_cement"), SECONDARY_VIOLET_CEMENT);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "secondary_violet_cement"), new BlockItem(SECONDARY_VIOLET_CEMENT, new Item.Settings().group(InquiryMod.CROMATIC_CEMENT_BLOCKS)));
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "secondary_orange_cement"), SECONDARY_ORANGE_CEMENT);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "secondary_orange_cement"), new BlockItem(SECONDARY_ORANGE_CEMENT, new Item.Settings().group(InquiryMod.CROMATIC_CEMENT_BLOCKS)));
  }

  public static void registryTertiaryCements() {
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "tertiary_orange_red_cement"), TERTIARY_ORANGE_RED_CEMENT);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "tertiary_orange_red_cement"), new BlockItem(TERTIARY_ORANGE_RED_CEMENT, new Item.Settings().group(InquiryMod.CROMATIC_CEMENT_BLOCKS)));
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "tertiary_purplish_red_cement"), TERTIARY_PURPLISH_RED_CEMENT);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "tertiary_purplish_red_cement"), new BlockItem(TERTIARY_PURPLISH_RED_CEMENT, new Item.Settings().group(InquiryMod.CROMATIC_CEMENT_BLOCKS)));
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "tertiary_greenish_yellow_cement"), TERTIARY_GREENISH_YELLOW_CEMENT);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "tertiary_greenish_yellow_cement"), new BlockItem(TERTIARY_GREENISH_YELLOW_CEMENT, new Item.Settings().group(InquiryMod.CROMATIC_CEMENT_BLOCKS)));
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "tertiary_orange_yellow_cement"), TERTIARY_ORANGE_YELLOW_CEMENT);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "tertiary_orange_yellow_cement"), new BlockItem(TERTIARY_ORANGE_YELLOW_CEMENT, new Item.Settings().group(InquiryMod.CROMATIC_CEMENT_BLOCKS)));
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "tertiary_blue_green_cement"), TERTIARY_BLUE_GREEN_CEMENT);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "tertiary_blue_green_cement"), new BlockItem(TERTIARY_BLUE_GREEN_CEMENT, new Item.Settings().group(InquiryMod.CROMATIC_CEMENT_BLOCKS)));
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "tertiary_blue_purple_cement"), TERTIARY_BLUE_PURPLE_CEMENT);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "tertiary_blue_purple_cement"), new BlockItem(TERTIARY_BLUE_PURPLE_CEMENT, new Item.Settings().group(InquiryMod.CROMATIC_CEMENT_BLOCKS)));
  }

  public static void registryNeutralCements() {
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "neutral_white_cement"), NEUTRAL_WHITE_CEMENT);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "neutral_white_cement"), new BlockItem(NEUTRAL_WHITE_CEMENT, new Item.Settings().group(InquiryMod.CROMATIC_CEMENT_BLOCKS)));
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "neutral_black_cement"), NEUTRAL_BLACK_CEMENT);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "neutral_black_cement"), new BlockItem(NEUTRAL_BLACK_CEMENT, new Item.Settings().group(InquiryMod.CROMATIC_CEMENT_BLOCKS)));
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "neutral_gray_cement"), NEUTRAL_GRAY_CEMENT);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "neutral_gray_cement"), new BlockItem(NEUTRAL_GRAY_CEMENT, new Item.Settings().group(InquiryMod.CROMATIC_CEMENT_BLOCKS)));
  }

  public static void registryMixedCements() {
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "mixed_brown_cement"), MIXED_BROWN_CEMENT);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "mixed_brown_cement"), new BlockItem(MIXED_BROWN_CEMENT, new Item.Settings().group(InquiryMod.CROMATIC_CEMENT_BLOCKS)));
  }

}
