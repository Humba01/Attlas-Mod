package net.humba01.inquiry.blocks.cromatic.stained_glasses;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.humba01.inquiry.InquiryMod;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.StainedGlassBlock;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class CromaticStainedGlasses extends StainedGlassBlock {

    public CromaticStainedGlasses(DyeColor color, Settings settings) {
        super(color, settings);
        // TODO Auto-generated constructor stub
    }

    // Primary Stained Glasses
  public static final Block PRIMARY_RED_STAINED_GLASS = new CromaticStainedGlasses(DyeColor.RED, FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS).nonOpaque());
  public static final Block PRIMARY_BLUE_STAINED_GLASS = new CromaticStainedGlasses(DyeColor.BLUE, FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS).nonOpaque());
  public static final Block PRIMARY_YELLOW_STAINED_GLASS = new CromaticStainedGlasses(DyeColor.YELLOW, FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS).nonOpaque());

  // Secondary Stained Glasses
  public static final Block SECONDARY_GREEN_STAINED_GLASS = new CromaticStainedGlasses(DyeColor.GREEN, FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS).nonOpaque());
  public static final Block SECONDARY_ORANGE_STAINED_GLASS = new CromaticStainedGlasses(DyeColor.ORANGE, FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS).nonOpaque());
  public static final Block SECONDARY_VIOLET_STAINED_GLASS = new CromaticStainedGlasses(DyeColor.PURPLE, FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS).nonOpaque());

  // Tertiary Stained Glasses
  public static final Block TERTIARY_ORANGE_RED_STAINED_GLASS = new CromaticStainedGlasses(DyeColor.ORANGE, FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS).nonOpaque());
  public static final Block TERTIARY_PURPLISH_RED_STAINED_GLASS = new CromaticStainedGlasses(DyeColor.PURPLE, FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS).nonOpaque());
  public static final Block TERTIARY_GREENISH_YELLOW_STAINED_GLASS = new CromaticStainedGlasses(DyeColor.GREEN, FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS).nonOpaque());
  public static final Block TERTIARY_ORANGE_YELLOW_STAINED_GLASS = new CromaticStainedGlasses(DyeColor.ORANGE, FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS).nonOpaque());
  public static final Block TERTIARY_BLUE_GREEN_STAINED_GLASS = new CromaticStainedGlasses(DyeColor.GREEN, FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS).nonOpaque());
  public static final Block TERTIARY_BLUE_PURPLE_STAINED_GLASS = new CromaticStainedGlasses(DyeColor.PURPLE, FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS).nonOpaque());

  // Neutral Stained Glasses
  public static final Block NEUTRAL_WHITE_STAINED_GLASS = new CromaticStainedGlasses(DyeColor.WHITE, FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS).nonOpaque());
  public static final Block NEUTRAL_BLACK_STAINED_GLASS = new CromaticStainedGlasses(DyeColor.BLACK, FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS).nonOpaque());
  public static final Block NEUTRAL_GRAY_STAINED_GLASS = new CromaticStainedGlasses(DyeColor.GRAY, FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS).nonOpaque());

  // Mixed Stained Glasses
  public static final Block MIXED_BROWN_STAINED_GLASS = new CromaticStainedGlasses(DyeColor.BROWN, FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS).nonOpaque());

  public static void registryPrimaryStainedGlasses() {
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "primary_red_stained_glass"),
        PRIMARY_RED_STAINED_GLASS);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "primary_red_stained_glass"),
        new BlockItem(PRIMARY_RED_STAINED_GLASS, new Item.Settings().group(InquiryMod.CROMATIC_STAINED_GLASS_BLOCKS)));
    BlockRenderLayerMap.INSTANCE.putBlock(CromaticStainedGlasses.PRIMARY_RED_STAINED_GLASS,
        RenderLayer.getTranslucent());
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "primary_blue_stained_glass"),
        PRIMARY_BLUE_STAINED_GLASS);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "primary_blue_stained_glass"),
        new BlockItem(PRIMARY_BLUE_STAINED_GLASS, new Item.Settings().group(InquiryMod.CROMATIC_STAINED_GLASS_BLOCKS)));
    BlockRenderLayerMap.INSTANCE.putBlock(CromaticStainedGlasses.PRIMARY_BLUE_STAINED_GLASS,
        RenderLayer.getTranslucent());
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "primary_yellow_stained_glass"),
        PRIMARY_YELLOW_STAINED_GLASS);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "primary_yellow_stained_glass"), new BlockItem(
        PRIMARY_YELLOW_STAINED_GLASS, new Item.Settings().group(InquiryMod.CROMATIC_STAINED_GLASS_BLOCKS)));
    BlockRenderLayerMap.INSTANCE.putBlock(CromaticStainedGlasses.PRIMARY_YELLOW_STAINED_GLASS,
        RenderLayer.getTranslucent());
  }

  public static void registrySecondaryStainedGlasses() {
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "secondary_green_stained_glass"),
        SECONDARY_GREEN_STAINED_GLASS);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "secondary_green_stained_glass"), new BlockItem(
        SECONDARY_GREEN_STAINED_GLASS, new Item.Settings().group(InquiryMod.CROMATIC_STAINED_GLASS_BLOCKS)));
    BlockRenderLayerMap.INSTANCE.putBlock(CromaticStainedGlasses.SECONDARY_GREEN_STAINED_GLASS,
        RenderLayer.getTranslucent());
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "secondary_violet_stained_glass"),
        SECONDARY_VIOLET_STAINED_GLASS);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "secondary_violet_stained_glass"), new BlockItem(
        SECONDARY_VIOLET_STAINED_GLASS, new Item.Settings().group(InquiryMod.CROMATIC_STAINED_GLASS_BLOCKS)));
    BlockRenderLayerMap.INSTANCE.putBlock(CromaticStainedGlasses.SECONDARY_VIOLET_STAINED_GLASS,
        RenderLayer.getTranslucent());
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "secondary_orange_stained_glass"),
        SECONDARY_ORANGE_STAINED_GLASS);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "secondary_orange_stained_glass"), new BlockItem(
        SECONDARY_ORANGE_STAINED_GLASS, new Item.Settings().group(InquiryMod.CROMATIC_STAINED_GLASS_BLOCKS)));
    BlockRenderLayerMap.INSTANCE.putBlock(CromaticStainedGlasses.SECONDARY_ORANGE_STAINED_GLASS,
        RenderLayer.getTranslucent());
  }

  public static void registryTertiaryStainedGlasses() {
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "tertiary_orange_red_stained_glass"),
        TERTIARY_ORANGE_RED_STAINED_GLASS);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "tertiary_orange_red_stained_glass"),
        new BlockItem(TERTIARY_ORANGE_RED_STAINED_GLASS,
            new Item.Settings().group(InquiryMod.CROMATIC_STAINED_GLASS_BLOCKS)));
    BlockRenderLayerMap.INSTANCE.putBlock(CromaticStainedGlasses.TERTIARY_ORANGE_RED_STAINED_GLASS,
        RenderLayer.getTranslucent());
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "tertiary_purplish_red_stained_glass"),
        TERTIARY_PURPLISH_RED_STAINED_GLASS);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "tertiary_purplish_red_stained_glass"),
        new BlockItem(TERTIARY_PURPLISH_RED_STAINED_GLASS,
            new Item.Settings().group(InquiryMod.CROMATIC_STAINED_GLASS_BLOCKS)));
    BlockRenderLayerMap.INSTANCE.putBlock(CromaticStainedGlasses.TERTIARY_PURPLISH_RED_STAINED_GLASS,
        RenderLayer.getTranslucent());
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "tertiary_greenish_yellow_stained_glass"),
        TERTIARY_GREENISH_YELLOW_STAINED_GLASS);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "tertiary_greenish_yellow_stained_glass"),
        new BlockItem(TERTIARY_GREENISH_YELLOW_STAINED_GLASS,
            new Item.Settings().group(InquiryMod.CROMATIC_STAINED_GLASS_BLOCKS)));
    BlockRenderLayerMap.INSTANCE.putBlock(CromaticStainedGlasses.TERTIARY_GREENISH_YELLOW_STAINED_GLASS,
        RenderLayer.getTranslucent());
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "tertiary_orange_yellow_stained_glass"),
        TERTIARY_ORANGE_YELLOW_STAINED_GLASS);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "tertiary_orange_yellow_stained_glass"),
        new BlockItem(TERTIARY_ORANGE_YELLOW_STAINED_GLASS,
            new Item.Settings().group(InquiryMod.CROMATIC_STAINED_GLASS_BLOCKS)));
    BlockRenderLayerMap.INSTANCE.putBlock(CromaticStainedGlasses.TERTIARY_ORANGE_YELLOW_STAINED_GLASS,
        RenderLayer.getTranslucent());
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "tertiary_blue_green_stained_glass"),
        TERTIARY_BLUE_GREEN_STAINED_GLASS);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "tertiary_blue_green_stained_glass"),
        new BlockItem(TERTIARY_BLUE_GREEN_STAINED_GLASS,
            new Item.Settings().group(InquiryMod.CROMATIC_STAINED_GLASS_BLOCKS)));
    BlockRenderLayerMap.INSTANCE.putBlock(CromaticStainedGlasses.TERTIARY_BLUE_GREEN_STAINED_GLASS,
        RenderLayer.getTranslucent());
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "tertiary_blue_purple_stained_glass"),
        TERTIARY_BLUE_PURPLE_STAINED_GLASS);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "tertiary_blue_purple_stained_glass"),
        new BlockItem(TERTIARY_BLUE_PURPLE_STAINED_GLASS,
            new Item.Settings().group(InquiryMod.CROMATIC_STAINED_GLASS_BLOCKS)));
    BlockRenderLayerMap.INSTANCE.putBlock(CromaticStainedGlasses.TERTIARY_BLUE_PURPLE_STAINED_GLASS,
        RenderLayer.getTranslucent());
  }

  public static void registryNeutralStainedGlasses() {
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "neutral_white_stained_glass"),
        NEUTRAL_WHITE_STAINED_GLASS);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "neutral_white_stained_glass"), new BlockItem(
        NEUTRAL_WHITE_STAINED_GLASS, new Item.Settings().group(InquiryMod.CROMATIC_STAINED_GLASS_BLOCKS)));
    BlockRenderLayerMap.INSTANCE.putBlock(CromaticStainedGlasses.NEUTRAL_WHITE_STAINED_GLASS,
        RenderLayer.getTranslucent());
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "neutral_black_stained_glass"),
        NEUTRAL_BLACK_STAINED_GLASS);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "neutral_black_stained_glass"), new BlockItem(
        NEUTRAL_BLACK_STAINED_GLASS, new Item.Settings().group(InquiryMod.CROMATIC_STAINED_GLASS_BLOCKS)));
    BlockRenderLayerMap.INSTANCE.putBlock(CromaticStainedGlasses.NEUTRAL_BLACK_STAINED_GLASS,
        RenderLayer.getTranslucent());
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "neutral_gray_stained_glass"),
        NEUTRAL_GRAY_STAINED_GLASS);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "neutral_gray_stained_glass"),
        new BlockItem(NEUTRAL_GRAY_STAINED_GLASS, new Item.Settings().group(InquiryMod.CROMATIC_STAINED_GLASS_BLOCKS)));
    BlockRenderLayerMap.INSTANCE.putBlock(CromaticStainedGlasses.NEUTRAL_GRAY_STAINED_GLASS,
        RenderLayer.getTranslucent());
  }

  public static void registryMixedStainedGlasses() {
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "mixed_brown_stained_glass"),
        MIXED_BROWN_STAINED_GLASS);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "mixed_brown_stained_glass"),
        new BlockItem(MIXED_BROWN_STAINED_GLASS, new Item.Settings().group(InquiryMod.CROMATIC_STAINED_GLASS_BLOCKS)));
    BlockRenderLayerMap.INSTANCE.putBlock(CromaticStainedGlasses.MIXED_BROWN_STAINED_GLASS,
        RenderLayer.getTranslucent());
  }

}
