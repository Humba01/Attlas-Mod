package net.humba01.inquiry.blocks.cromatic.stained_glasses;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.humba01.inquiry.InquiryMod;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.block.Stainable;
import net.minecraft.block.StairsBlock;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class CromaticStainedGlassStairs extends StairsBlock {

  protected CromaticStainedGlassStairs(BlockState baseBlockState, Settings settings) {
    super(baseBlockState, settings);
    // TODO Auto-generated constructor stub
  }

  // Primary Stained Glass Stairs
  public static final Block PRIMARY_RED_STAINED_GLASS_STAIRS = new CromaticStainedGlassStairs(CromaticStainedGlasses.PRIMARY_RED_STAINED_GLASS.getDefaultState(), FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS).nonOpaque());
  public static final Block PRIMARY_BLUE_STAINED_GLASS_STAIRS = new CromaticStainedGlassStairs(CromaticStainedGlasses.PRIMARY_BLUE_STAINED_GLASS.getDefaultState(), FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS).nonOpaque());
  public static final Block PRIMARY_YELLOW_STAINED_GLASS_STAIRS = new CromaticStainedGlassStairs(CromaticStainedGlasses.PRIMARY_YELLOW_STAINED_GLASS.getDefaultState(), FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS).nonOpaque());

  //Secondary Stained Glass Stairs
  public static final Block SECONDARY_GREEN_STAINED_GLASS_STAIRS = new CromaticStainedGlassStairs(CromaticStainedGlasses.SECONDARY_GREEN_STAINED_GLASS.getDefaultState(), FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS).nonOpaque());
  public static final Block SECONDARY_ORANGE_STAINED_GLASS_STAIRS = new CromaticStainedGlassStairs(CromaticStainedGlasses.SECONDARY_ORANGE_STAINED_GLASS.getDefaultState(), FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS).nonOpaque());
  public static final Block SECONDARY_VIOLET_STAINED_GLASS_STAIRS = new CromaticStainedGlassStairs(CromaticStainedGlasses.SECONDARY_VIOLET_STAINED_GLASS.getDefaultState(), FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS).nonOpaque());

  //Tertiary Stained Glass Stairs
  public static final Block TERTIARY_ORANGE_RED_STAINED_GLASS_STAIRS = new CromaticStainedGlassStairs(CromaticStainedGlasses.TERTIARY_ORANGE_RED_STAINED_GLASS.getDefaultState(), FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS).nonOpaque());
  public static final Block TERTIARY_PURPLISH_RED_STAINED_GLASS_STAIRS = new CromaticStainedGlassStairs(CromaticStainedGlasses.TERTIARY_PURPLISH_RED_STAINED_GLASS.getDefaultState(), FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS).nonOpaque());
  public static final Block TERTIARY_GREENISH_YELLOW_STAINED_GLASS_STAIRS = new CromaticStainedGlassStairs(CromaticStainedGlasses.TERTIARY_GREENISH_YELLOW_STAINED_GLASS.getDefaultState(), FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS).nonOpaque());
  public static final Block TERTIARY_ORANGE_YELLOW_STAINED_GLASS_STAIRS = new CromaticStainedGlassStairs(CromaticStainedGlasses.TERTIARY_ORANGE_YELLOW_STAINED_GLASS.getDefaultState(), FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS).nonOpaque());
  public static final Block TERTIARY_BLUE_GREEN_STAINED_GLASS_STAIRS = new CromaticStainedGlassStairs(CromaticStainedGlasses.TERTIARY_BLUE_GREEN_STAINED_GLASS.getDefaultState(), FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS).nonOpaque());
  public static final Block TERTIARY_BLUE_PURPLE_STAINED_GLASS_STAIRS = new CromaticStainedGlassStairs(CromaticStainedGlasses.TERTIARY_BLUE_PURPLE_STAINED_GLASS.getDefaultState(), FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS).nonOpaque());

  //Neutral Stained Glass Stairs
  public static final Block NEUTRAL_WHITE_STAINED_GLASS_STAIRS = new CromaticStainedGlassStairs(CromaticStainedGlasses.NEUTRAL_WHITE_STAINED_GLASS.getDefaultState(), FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS).nonOpaque());
  public static final Block NEUTRAL_BLACK_STAINED_GLASS_STAIRS = new CromaticStainedGlassStairs(CromaticStainedGlasses.NEUTRAL_BLACK_STAINED_GLASS.getDefaultState(), FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS).nonOpaque());
  public static final Block NEUTRAL_GRAY_STAINED_GLASS_STAIRS = new CromaticStainedGlassStairs(CromaticStainedGlasses.NEUTRAL_GRAY_STAINED_GLASS.getDefaultState(), FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS).nonOpaque());
  
  //Mixed Stained Glass Stairs
  public static final Block MIXED_BROWN_STAINED_GLASS_STAIRS = new CromaticStainedGlassStairs(CromaticStainedGlasses.MIXED_BROWN_STAINED_GLASS.getDefaultState(), FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS).nonOpaque());

  public static void registryPrimaryStainedGlassStairs() {
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "primary_red_stained_glass_stairs"), PRIMARY_RED_STAINED_GLASS_STAIRS);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "primary_red_stained_glass_stairs"), new BlockItem(PRIMARY_RED_STAINED_GLASS_STAIRS, new Item.Settings().group(InquiryMod.CROMATIC_STAINED_GLASS_BLOCKS)));
    BlockRenderLayerMap.INSTANCE.putBlock(CromaticStainedGlassStairs.PRIMARY_RED_STAINED_GLASS_STAIRS, RenderLayer.getTranslucent());
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "primary_blue_stained_glass_stairs"), PRIMARY_BLUE_STAINED_GLASS_STAIRS);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "primary_blue_stained_glass_stairs"), new BlockItem(PRIMARY_BLUE_STAINED_GLASS_STAIRS, new Item.Settings().group(InquiryMod.CROMATIC_STAINED_GLASS_BLOCKS)));
    BlockRenderLayerMap.INSTANCE.putBlock(CromaticStainedGlassStairs.PRIMARY_BLUE_STAINED_GLASS_STAIRS, RenderLayer.getTranslucent());
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "primary_yellow_stained_glass_stairs"), PRIMARY_YELLOW_STAINED_GLASS_STAIRS);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "primary_yellow_stained_glass_stairs"), new BlockItem(PRIMARY_YELLOW_STAINED_GLASS_STAIRS, new Item.Settings().group(InquiryMod.CROMATIC_STAINED_GLASS_BLOCKS)));
    BlockRenderLayerMap.INSTANCE.putBlock(CromaticStainedGlassStairs.PRIMARY_YELLOW_STAINED_GLASS_STAIRS, RenderLayer.getTranslucent());
  }
  
  public static void registrySecondaryStainedGlassStairs() {
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "secondary_green_stained_glass_stairs"), SECONDARY_GREEN_STAINED_GLASS_STAIRS);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "secondary_green_stained_glass_stairs"), new BlockItem(SECONDARY_GREEN_STAINED_GLASS_STAIRS, new Item.Settings().group(InquiryMod.CROMATIC_STAINED_GLASS_BLOCKS)));
    BlockRenderLayerMap.INSTANCE.putBlock(CromaticStainedGlassStairs.SECONDARY_GREEN_STAINED_GLASS_STAIRS, RenderLayer.getTranslucent());
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "secondary_violet_stained_glass_stairs"), SECONDARY_VIOLET_STAINED_GLASS_STAIRS);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "secondary_violet_stained_glass_stairs"), new BlockItem(SECONDARY_VIOLET_STAINED_GLASS_STAIRS, new Item.Settings().group(InquiryMod.CROMATIC_STAINED_GLASS_BLOCKS)));
    BlockRenderLayerMap.INSTANCE.putBlock(CromaticStainedGlassStairs.SECONDARY_VIOLET_STAINED_GLASS_STAIRS, RenderLayer.getTranslucent());
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "secondary_orange_stained_glass_stairs"), SECONDARY_ORANGE_STAINED_GLASS_STAIRS);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "secondary_orange_stained_glass_stairs"), new BlockItem(SECONDARY_ORANGE_STAINED_GLASS_STAIRS, new Item.Settings().group(InquiryMod.CROMATIC_STAINED_GLASS_BLOCKS)));
    BlockRenderLayerMap.INSTANCE.putBlock(CromaticStainedGlassStairs.SECONDARY_ORANGE_STAINED_GLASS_STAIRS, RenderLayer.getTranslucent());
  }
  
  public static void registryTertiaryStainedGlassStairs() {
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "tertiary_orange_red_stained_glass_stairs"), TERTIARY_ORANGE_RED_STAINED_GLASS_STAIRS);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "tertiary_orange_red_stained_glass_stairs"), new BlockItem(TERTIARY_ORANGE_RED_STAINED_GLASS_STAIRS, new Item.Settings().group(InquiryMod.CROMATIC_STAINED_GLASS_BLOCKS)));
    BlockRenderLayerMap.INSTANCE.putBlock(CromaticStainedGlassStairs.TERTIARY_ORANGE_RED_STAINED_GLASS_STAIRS, RenderLayer.getTranslucent());
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "tertiary_purplish_red_stained_glass_stairs"), TERTIARY_PURPLISH_RED_STAINED_GLASS_STAIRS);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "tertiary_purplish_red_stained_glass_stairs"), new BlockItem(TERTIARY_PURPLISH_RED_STAINED_GLASS_STAIRS, new Item.Settings().group(InquiryMod.CROMATIC_STAINED_GLASS_BLOCKS)));
    BlockRenderLayerMap.INSTANCE.putBlock(CromaticStainedGlassStairs.TERTIARY_PURPLISH_RED_STAINED_GLASS_STAIRS, RenderLayer.getTranslucent());
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "tertiary_greenish_yellow_stained_glass_stairs"), TERTIARY_GREENISH_YELLOW_STAINED_GLASS_STAIRS);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "tertiary_greenish_yellow_stained_glass_stairs"), new BlockItem(TERTIARY_GREENISH_YELLOW_STAINED_GLASS_STAIRS, new Item.Settings().group(InquiryMod.CROMATIC_STAINED_GLASS_BLOCKS)));
    BlockRenderLayerMap.INSTANCE.putBlock(CromaticStainedGlassStairs.TERTIARY_GREENISH_YELLOW_STAINED_GLASS_STAIRS, RenderLayer.getTranslucent());
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "tertiary_orange_yellow_stained_glass_stairs"), TERTIARY_ORANGE_YELLOW_STAINED_GLASS_STAIRS);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "tertiary_orange_yellow_stained_glass_stairs"), new BlockItem(TERTIARY_ORANGE_YELLOW_STAINED_GLASS_STAIRS, new Item.Settings().group(InquiryMod.CROMATIC_STAINED_GLASS_BLOCKS)));
    BlockRenderLayerMap.INSTANCE.putBlock(CromaticStainedGlassStairs.TERTIARY_ORANGE_YELLOW_STAINED_GLASS_STAIRS, RenderLayer.getTranslucent());
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "tertiary_blue_green_stained_glass_stairs"), TERTIARY_BLUE_GREEN_STAINED_GLASS_STAIRS);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "tertiary_blue_green_stained_glass_stairs"), new BlockItem(TERTIARY_BLUE_GREEN_STAINED_GLASS_STAIRS, new Item.Settings().group(InquiryMod.CROMATIC_STAINED_GLASS_BLOCKS)));
    BlockRenderLayerMap.INSTANCE.putBlock(CromaticStainedGlassStairs.TERTIARY_BLUE_GREEN_STAINED_GLASS_STAIRS, RenderLayer.getTranslucent());
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "tertiary_blue_purple_stained_glass_stairs"), TERTIARY_BLUE_PURPLE_STAINED_GLASS_STAIRS);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "tertiary_blue_purple_stained_glass_stairs"), new BlockItem(TERTIARY_BLUE_PURPLE_STAINED_GLASS_STAIRS, new Item.Settings().group(InquiryMod.CROMATIC_STAINED_GLASS_BLOCKS)));
    BlockRenderLayerMap.INSTANCE.putBlock(CromaticStainedGlassStairs.TERTIARY_BLUE_PURPLE_STAINED_GLASS_STAIRS, RenderLayer.getTranslucent());
  }
  
  public static void registryNeutralStainedGlassStairs() {
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "neutral_white_stained_glass_stairs"), NEUTRAL_WHITE_STAINED_GLASS_STAIRS);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "neutral_white_stained_glass_stairs"), new BlockItem(NEUTRAL_WHITE_STAINED_GLASS_STAIRS, new Item.Settings().group(InquiryMod.CROMATIC_STAINED_GLASS_BLOCKS)));
    BlockRenderLayerMap.INSTANCE.putBlock(CromaticStainedGlassStairs.NEUTRAL_WHITE_STAINED_GLASS_STAIRS, RenderLayer.getTranslucent());
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "neutral_black_stained_glass_stairs"), NEUTRAL_BLACK_STAINED_GLASS_STAIRS);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "neutral_black_stained_glass_stairs"), new BlockItem(NEUTRAL_BLACK_STAINED_GLASS_STAIRS, new Item.Settings().group(InquiryMod.CROMATIC_STAINED_GLASS_BLOCKS)));
    BlockRenderLayerMap.INSTANCE.putBlock(CromaticStainedGlassStairs.NEUTRAL_BLACK_STAINED_GLASS_STAIRS, RenderLayer.getTranslucent());
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "neutral_gray_stained_glass_stairs"), NEUTRAL_GRAY_STAINED_GLASS_STAIRS);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "neutral_gray_stained_glass_stairs"), new BlockItem(NEUTRAL_GRAY_STAINED_GLASS_STAIRS, new Item.Settings().group(InquiryMod.CROMATIC_STAINED_GLASS_BLOCKS)));
    BlockRenderLayerMap.INSTANCE.putBlock(CromaticStainedGlassStairs.NEUTRAL_GRAY_STAINED_GLASS_STAIRS, RenderLayer.getTranslucent());
  }
  
  public static void registryMixedStainedGlassStairs() {
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "mixed_brown_stained_glass_stairs"), MIXED_BROWN_STAINED_GLASS_STAIRS);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "mixed_brown_stained_glass_stairs"), new BlockItem(MIXED_BROWN_STAINED_GLASS_STAIRS, new Item.Settings().group(InquiryMod.CROMATIC_STAINED_GLASS_BLOCKS)));
    BlockRenderLayerMap.INSTANCE.putBlock(CromaticStainedGlassStairs.MIXED_BROWN_STAINED_GLASS_STAIRS, RenderLayer.getTranslucent());
  }

}
