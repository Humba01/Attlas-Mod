package net.humba01.inquiry.blocks.cromatic.stained_glasses;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.humba01.inquiry.InquiryMod;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.StainedGlassPaneBlock;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class CromaticStainedGlassPanes extends StainedGlassPaneBlock {

  public CromaticStainedGlassPanes(DyeColor color, Settings settings) {
    super(color, settings);
    // TODO Auto-generated constructor stub
  }

  // Primary Stained Glass Panes
  public static final Block PRIMARY_RED_STAINED_GLASS_PANE = new CromaticStainedGlassPanes(DyeColor.RED, FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS).nonOpaque());
  public static final Block PRIMARY_BLUE_STAINED_GLASS_PANE = new CromaticStainedGlassPanes(DyeColor.BLUE, FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS).nonOpaque());
  public static final Block PRIMARY_YELLOW_STAINED_GLASS_PANE = new CromaticStainedGlassPanes(DyeColor.YELLOW, FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS).nonOpaque());

  //Secondary Stained Glass Panes
  public static final Block SECONDARY_GREEN_STAINED_GLASS_PANE = new CromaticStainedGlassPanes(DyeColor.GREEN, FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS).nonOpaque());
  public static final Block SECONDARY_ORANGE_STAINED_GLASS_PANE = new CromaticStainedGlassPanes(DyeColor.ORANGE, FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS).nonOpaque());
  public static final Block SECONDARY_VIOLET_STAINED_GLASS_PANE = new CromaticStainedGlassPanes(DyeColor.PURPLE, FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS).nonOpaque());

  //Tertiary Stained Glass Panes
  public static final Block TERTIARY_ORANGE_RED_STAINED_GLASS_PANE = new CromaticStainedGlassPanes(DyeColor.ORANGE, FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS).nonOpaque());
  public static final Block TERTIARY_PURPLISH_RED_STAINED_GLASS_PANE = new CromaticStainedGlassPanes(DyeColor.PURPLE, FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS).nonOpaque());
  public static final Block TERTIARY_GREENISH_YELLOW_STAINED_GLASS_PANE = new CromaticStainedGlassPanes(DyeColor.GREEN, FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS).nonOpaque());
  public static final Block TERTIARY_ORANGE_YELLOW_STAINED_GLASS_PANE = new CromaticStainedGlassPanes(DyeColor.ORANGE, FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS).nonOpaque());
  public static final Block TERTIARY_BLUE_GREEN_STAINED_GLASS_PANE = new CromaticStainedGlassPanes(DyeColor.GREEN, FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS).nonOpaque());
  public static final Block TERTIARY_BLUE_PURPLE_STAINED_GLASS_PANE = new CromaticStainedGlassPanes(DyeColor.PURPLE, FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS).nonOpaque());

  //Neutral Stained Glass Panes
  public static final Block NEUTRAL_WHITE_STAINED_GLASS_PANE = new CromaticStainedGlassPanes(DyeColor.WHITE, FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS).nonOpaque());
  public static final Block NEUTRAL_BLACK_STAINED_GLASS_PANE = new CromaticStainedGlassPanes(DyeColor.BLACK, FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS).nonOpaque());
  public static final Block NEUTRAL_GRAY_STAINED_GLASS_PANE = new CromaticStainedGlassPanes(DyeColor.GRAY, FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS).nonOpaque());
  
  //Mixed Stained Glass Panes
  public static final Block MIXED_BROWN_STAINED_GLASS_PANE = new CromaticStainedGlassPanes(DyeColor.BROWN, FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS).nonOpaque());
  
  public static void registryPrimaryStainedGlassPanes() {
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "primary_red_stained_glass_pane"), PRIMARY_RED_STAINED_GLASS_PANE);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "primary_red_stained_glass_pane"), new BlockItem(PRIMARY_RED_STAINED_GLASS_PANE, new Item.Settings().group(InquiryMod.CROMATIC_STAINED_GLASS_BLOCKS)));
    BlockRenderLayerMap.INSTANCE.putBlock(CromaticStainedGlassPanes.PRIMARY_RED_STAINED_GLASS_PANE, RenderLayer.getTranslucent());
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "primary_blue_stained_glass_pane"), PRIMARY_BLUE_STAINED_GLASS_PANE);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "primary_blue_stained_glass_pane"), new BlockItem(PRIMARY_BLUE_STAINED_GLASS_PANE, new Item.Settings().group(InquiryMod.CROMATIC_STAINED_GLASS_BLOCKS)));
    BlockRenderLayerMap.INSTANCE.putBlock(CromaticStainedGlassPanes.PRIMARY_BLUE_STAINED_GLASS_PANE, RenderLayer.getTranslucent());
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "primary_yellow_stained_glass_pane"), PRIMARY_YELLOW_STAINED_GLASS_PANE);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "primary_yellow_stained_glass_pane"), new BlockItem(PRIMARY_YELLOW_STAINED_GLASS_PANE, new Item.Settings().group(InquiryMod.CROMATIC_STAINED_GLASS_BLOCKS)));
    BlockRenderLayerMap.INSTANCE.putBlock(CromaticStainedGlassPanes.PRIMARY_YELLOW_STAINED_GLASS_PANE, RenderLayer.getTranslucent());
  }
  
  public static void registrySecondaryStainedGlassPanes() {
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "secondary_green_stained_glass_pane"), SECONDARY_GREEN_STAINED_GLASS_PANE);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "secondary_green_stained_glass_pane"), new BlockItem(SECONDARY_GREEN_STAINED_GLASS_PANE, new Item.Settings().group(InquiryMod.CROMATIC_STAINED_GLASS_BLOCKS)));
    BlockRenderLayerMap.INSTANCE.putBlock(CromaticStainedGlassPanes.SECONDARY_GREEN_STAINED_GLASS_PANE, RenderLayer.getTranslucent());
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "secondary_violet_stained_glass_pane"), SECONDARY_VIOLET_STAINED_GLASS_PANE);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "secondary_violet_stained_glass_pane"), new BlockItem(SECONDARY_VIOLET_STAINED_GLASS_PANE, new Item.Settings().group(InquiryMod.CROMATIC_STAINED_GLASS_BLOCKS)));
    BlockRenderLayerMap.INSTANCE.putBlock(CromaticStainedGlassPanes.SECONDARY_VIOLET_STAINED_GLASS_PANE, RenderLayer.getTranslucent());
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "secondary_orange_stained_glass_pane"), SECONDARY_ORANGE_STAINED_GLASS_PANE);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "secondary_orange_stained_glass_pane"), new BlockItem(SECONDARY_ORANGE_STAINED_GLASS_PANE, new Item.Settings().group(InquiryMod.CROMATIC_STAINED_GLASS_BLOCKS)));
    BlockRenderLayerMap.INSTANCE.putBlock(CromaticStainedGlassPanes.SECONDARY_ORANGE_STAINED_GLASS_PANE, RenderLayer.getTranslucent());
  }
  
  public static void registryTertiaryStainedGlassPanes() {
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "tertiary_orange_red_stained_glass_pane"), TERTIARY_ORANGE_RED_STAINED_GLASS_PANE);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "tertiary_orange_red_stained_glass_pane"), new BlockItem(TERTIARY_ORANGE_RED_STAINED_GLASS_PANE, new Item.Settings().group(InquiryMod.CROMATIC_STAINED_GLASS_BLOCKS)));
    BlockRenderLayerMap.INSTANCE.putBlock(CromaticStainedGlassPanes.TERTIARY_ORANGE_RED_STAINED_GLASS_PANE, RenderLayer.getTranslucent());  
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "tertiary_purplish_red_stained_glass_pane"), TERTIARY_PURPLISH_RED_STAINED_GLASS_PANE);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "tertiary_purplish_red_stained_glass_pane"), new BlockItem(TERTIARY_PURPLISH_RED_STAINED_GLASS_PANE, new Item.Settings().group(InquiryMod.CROMATIC_STAINED_GLASS_BLOCKS)));
    BlockRenderLayerMap.INSTANCE.putBlock(CromaticStainedGlassPanes.TERTIARY_PURPLISH_RED_STAINED_GLASS_PANE, RenderLayer.getTranslucent());  
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "tertiary_greenish_yellow_stained_glass_pane"), TERTIARY_GREENISH_YELLOW_STAINED_GLASS_PANE);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "tertiary_greenish_yellow_stained_glass_pane"), new BlockItem(TERTIARY_GREENISH_YELLOW_STAINED_GLASS_PANE, new Item.Settings().group(InquiryMod.CROMATIC_STAINED_GLASS_BLOCKS)));
    BlockRenderLayerMap.INSTANCE.putBlock(CromaticStainedGlassPanes.TERTIARY_GREENISH_YELLOW_STAINED_GLASS_PANE, RenderLayer.getTranslucent());  
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "tertiary_orange_yellow_stained_glass_pane"), TERTIARY_ORANGE_YELLOW_STAINED_GLASS_PANE);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "tertiary_orange_yellow_stained_glass_pane"), new BlockItem(TERTIARY_ORANGE_YELLOW_STAINED_GLASS_PANE, new Item.Settings().group(InquiryMod.CROMATIC_STAINED_GLASS_BLOCKS)));
    BlockRenderLayerMap.INSTANCE.putBlock(CromaticStainedGlassPanes.TERTIARY_ORANGE_YELLOW_STAINED_GLASS_PANE, RenderLayer.getTranslucent());  
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "tertiary_blue_green_stained_glass_pane"), TERTIARY_BLUE_GREEN_STAINED_GLASS_PANE);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "tertiary_blue_green_stained_glass_pane"), new BlockItem(TERTIARY_BLUE_GREEN_STAINED_GLASS_PANE, new Item.Settings().group(InquiryMod.CROMATIC_STAINED_GLASS_BLOCKS)));
    BlockRenderLayerMap.INSTANCE.putBlock(CromaticStainedGlassPanes.TERTIARY_BLUE_GREEN_STAINED_GLASS_PANE, RenderLayer.getTranslucent());  
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "tertiary_blue_purple_stained_glass_pane"), TERTIARY_BLUE_PURPLE_STAINED_GLASS_PANE);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "tertiary_blue_purple_stained_glass_pane"), new BlockItem(TERTIARY_BLUE_PURPLE_STAINED_GLASS_PANE, new Item.Settings().group(InquiryMod.CROMATIC_STAINED_GLASS_BLOCKS)));
    BlockRenderLayerMap.INSTANCE.putBlock(CromaticStainedGlassPanes.TERTIARY_BLUE_PURPLE_STAINED_GLASS_PANE, RenderLayer.getTranslucent());  
  }
  
  public static void registryNeutralStainedGlassPanes() {
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "neutral_white_stained_glass_pane"), NEUTRAL_WHITE_STAINED_GLASS_PANE);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "neutral_white_stained_glass_pane"), new BlockItem(NEUTRAL_WHITE_STAINED_GLASS_PANE, new Item.Settings().group(InquiryMod.CROMATIC_STAINED_GLASS_BLOCKS)));
    BlockRenderLayerMap.INSTANCE.putBlock(CromaticStainedGlassPanes.NEUTRAL_WHITE_STAINED_GLASS_PANE, RenderLayer.getTranslucent());  
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "neutral_black_stained_glass_pane"), NEUTRAL_BLACK_STAINED_GLASS_PANE);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "neutral_black_stained_glass_pane"), new BlockItem(NEUTRAL_BLACK_STAINED_GLASS_PANE, new Item.Settings().group(InquiryMod.CROMATIC_STAINED_GLASS_BLOCKS)));
    BlockRenderLayerMap.INSTANCE.putBlock(CromaticStainedGlassPanes.NEUTRAL_BLACK_STAINED_GLASS_PANE, RenderLayer.getTranslucent());  
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "neutral_gray_stained_glass_pane"), NEUTRAL_GRAY_STAINED_GLASS_PANE);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "neutral_gray_stained_glass_pane"), new BlockItem(NEUTRAL_GRAY_STAINED_GLASS_PANE, new Item.Settings().group(InquiryMod.CROMATIC_STAINED_GLASS_BLOCKS)));
    BlockRenderLayerMap.INSTANCE.putBlock(CromaticStainedGlassPanes.NEUTRAL_GRAY_STAINED_GLASS_PANE, RenderLayer.getTranslucent());  
  }
  
  public static void registryMixedStainedGlassPanes() {
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "neutral_gray_stained_glass_pane"), NEUTRAL_GRAY_STAINED_GLASS_PANE);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "neutral_gray_stained_glass_pane"), new BlockItem(NEUTRAL_GRAY_STAINED_GLASS_PANE, new Item.Settings().group(InquiryMod.CROMATIC_STAINED_GLASS_BLOCKS)));
    BlockRenderLayerMap.INSTANCE.putBlock(CromaticStainedGlassPanes.NEUTRAL_GRAY_STAINED_GLASS_PANE, RenderLayer.getTranslucent());    
  }

}
