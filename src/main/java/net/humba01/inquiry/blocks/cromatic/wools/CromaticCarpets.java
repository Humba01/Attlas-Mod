package net.humba01.inquiry.blocks.cromatic.wools;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.humba01.inquiry.InquiryMod;
import net.minecraft.block.Block;
import net.minecraft.block.CarpetBlock;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class CromaticCarpets extends CarpetBlock {

  protected CromaticCarpets(DyeColor color, Settings settings) {
    super(color, settings);
    // TODO Auto-generated constructor stub
  }

  // Primary Carpets
  public static final Block PRIMARY_RED_CARPET = new CromaticCarpets(DyeColor.RED, FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));
  public static final Block PRIMARY_BLUE_CARPET = new CromaticCarpets(DyeColor.BLUE, FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));
  public static final Block PRIMARY_YELLOW_CARPET = new CromaticCarpets(DyeColor.YELLOW, FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));

  //Secondary Carpets
  public static final Block SECONDARY_GREEN_CARPET = new CromaticCarpets(DyeColor.GREEN, FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));
  public static final Block SECONDARY_ORANGE_CARPET = new CromaticCarpets(DyeColor.ORANGE, FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));
  public static final Block SECONDARY_VIOLET_CARPET = new CromaticCarpets(DyeColor.PURPLE, FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));

  //Tertiary Carpets
  public static final Block TERTIARY_ORANGE_RED_CARPET = new CromaticCarpets(DyeColor.ORANGE, FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));
  public static final Block TERTIARY_PURPLISH_RED_CARPET = new CromaticCarpets(DyeColor.PURPLE, FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));
  public static final Block TERTIARY_GREENISH_YELLOW_CARPET = new CromaticCarpets(DyeColor.GREEN, FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));
  public static final Block TERTIARY_ORANGE_YELLOW_CARPET = new CromaticCarpets(DyeColor.ORANGE, FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));
  public static final Block TERTIARY_BLUE_GREEN_CARPET = new CromaticCarpets(DyeColor.GREEN, FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));
  public static final Block TERTIARY_BLUE_PURPLE_CARPET = new CromaticCarpets(DyeColor.PURPLE, FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));

  //Neutral Carpets
  public static final Block NEUTRAL_WHITE_CARPET = new CromaticCarpets(DyeColor.WHITE, FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));
  public static final Block NEUTRAL_BLACK_CARPET = new CromaticCarpets(DyeColor.BLACK, FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));
  public static final Block NEUTRAL_GRAY_CARPET = new CromaticCarpets(DyeColor.GRAY, FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));
  
  //Mixed Carpets
  public static final Block MIXED_BROWN_CARPET = new CromaticCarpets(DyeColor.BROWN, FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));

  public static void registryPrimaryCarpets() {
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "primary_red_carpet"), PRIMARY_RED_CARPET);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "primary_red_carpet"), new BlockItem(PRIMARY_RED_CARPET, new Item.Settings().group(InquiryMod.CROMATIC_WOOL_BLOCKS)));
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "primary_blue_carpet"), PRIMARY_BLUE_CARPET);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "primary_blue_carpet"), new BlockItem(PRIMARY_BLUE_CARPET, new Item.Settings().group(InquiryMod.CROMATIC_WOOL_BLOCKS)));
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "primary_yellow_carpet"), PRIMARY_YELLOW_CARPET);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "primary_yellow_carpet"), new BlockItem(PRIMARY_YELLOW_CARPET, new Item.Settings().group(InquiryMod.CROMATIC_WOOL_BLOCKS)));
  }
  
  public static void registrySecondaryCarpets() {
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "secondary_green_carpet"), SECONDARY_GREEN_CARPET);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "secondary_green_carpet"), new BlockItem(SECONDARY_GREEN_CARPET, new Item.Settings().group(InquiryMod.CROMATIC_WOOL_BLOCKS)));
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "secondary_violet_carpet"), SECONDARY_VIOLET_CARPET);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "secondary_violet_carpet"), new BlockItem(SECONDARY_VIOLET_CARPET, new Item.Settings().group(InquiryMod.CROMATIC_WOOL_BLOCKS)));
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "secondary_orange_carpet"), SECONDARY_ORANGE_CARPET);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "secondary_orange_carpet"), new BlockItem(SECONDARY_ORANGE_CARPET, new Item.Settings().group(InquiryMod.CROMATIC_WOOL_BLOCKS)));
  }
  
  public static void registryTertiaryCarpets() {
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "tertiary_orange_red_carpet"), TERTIARY_ORANGE_RED_CARPET);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "tertiary_orange_red_carpet"), new BlockItem(TERTIARY_ORANGE_RED_CARPET, new Item.Settings().group(InquiryMod.CROMATIC_WOOL_BLOCKS)));
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "tertiary_purplish_red_carpet"), TERTIARY_PURPLISH_RED_CARPET);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "tertiary_purplish_red_carpet"), new BlockItem(TERTIARY_PURPLISH_RED_CARPET, new Item.Settings().group(InquiryMod.CROMATIC_WOOL_BLOCKS)));
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "tertiary_greenish_yellow_carpet"), TERTIARY_GREENISH_YELLOW_CARPET);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "tertiary_greenish_yellow_carpet"), new BlockItem(TERTIARY_GREENISH_YELLOW_CARPET, new Item.Settings().group(InquiryMod.CROMATIC_WOOL_BLOCKS)));
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "tertiary_orange_yellow_carpet"), TERTIARY_ORANGE_YELLOW_CARPET);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "tertiary_orange_yellow_carpet"), new BlockItem(TERTIARY_ORANGE_YELLOW_CARPET, new Item.Settings().group(InquiryMod.CROMATIC_WOOL_BLOCKS)));
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "tertiary_blue_green_carpet"), TERTIARY_BLUE_GREEN_CARPET);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "tertiary_blue_green_carpet"), new BlockItem(TERTIARY_BLUE_GREEN_CARPET, new Item.Settings().group(InquiryMod.CROMATIC_WOOL_BLOCKS)));
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "tertiary_blue_purple_carpet"), TERTIARY_BLUE_PURPLE_CARPET);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "tertiary_blue_purple_carpet"), new BlockItem(TERTIARY_BLUE_PURPLE_CARPET, new Item.Settings().group(InquiryMod.CROMATIC_WOOL_BLOCKS)));
  }
  
  public static void registryNeutralCarpets() {
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "neutral_white_carpet"), NEUTRAL_WHITE_CARPET);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "neutral_white_carpet"), new BlockItem(NEUTRAL_WHITE_CARPET, new Item.Settings().group(InquiryMod.CROMATIC_WOOL_BLOCKS)));
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "neutral_black_carpet"), NEUTRAL_BLACK_CARPET);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "neutral_black_carpet"), new BlockItem(NEUTRAL_BLACK_CARPET, new Item.Settings().group(InquiryMod.CROMATIC_WOOL_BLOCKS)));
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "neutral_gray_carpet"), NEUTRAL_GRAY_CARPET);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "neutral_gray_carpet"), new BlockItem(NEUTRAL_GRAY_CARPET, new Item.Settings().group(InquiryMod.CROMATIC_WOOL_BLOCKS)));
  }
  
  public static void registryMixedCarpets() {
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "mixed_brown_carpet"), MIXED_BROWN_CARPET);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "mixed_brown_carpet"), new BlockItem(MIXED_BROWN_CARPET, new Item.Settings().group(InquiryMod.CROMATIC_WOOL_BLOCKS)));
  }

}
