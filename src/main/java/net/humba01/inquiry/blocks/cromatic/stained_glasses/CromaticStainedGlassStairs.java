package net.humba01.inquiry.blocks.cromatic.stained_glasses;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.block.StairsBlock;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.DyeColor;

public class CromaticStainedGlassStairs extends StairsBlock {

public CromaticStainedGlassStairs(DyeColor color, BlockState baseBlockState, Settings settings) {
    super(baseBlockState, settings);
    // TODO Auto-generated constructor stub
  }

  // Transparent Block
  protected void TransparentBlock(net.minecraft.block.AbstractBlock.Settings settings) {
  }

  public boolean isSideInvisible(net.minecraft.block.BlockState state, net.minecraft.block.BlockState stateFrom,
      net.minecraft.util.math.Direction direction) {
    return false;
  }

  // AbstractGlassBlock
  protected void AbstractGlassBlock(net.minecraft.block.AbstractBlock.Settings settings) {
  }

  public net.minecraft.util.shape.VoxelShape getVisualShape(net.minecraft.block.BlockState state,
      net.minecraft.world.BlockView world, net.minecraft.util.math.BlockPos pos,
      net.minecraft.block.ShapeContext context) {
    return null;
  }

  public float getAmbientOcclusionLightLevel(net.minecraft.block.BlockState state, net.minecraft.world.BlockView world,
      net.minecraft.util.math.BlockPos pos) {
    return 0;
  }

  public boolean isTranslucent(net.minecraft.block.BlockState state, net.minecraft.world.BlockView world,
      net.minecraft.util.math.BlockPos pos) {
    return false;
  }

  //StainedGlassBlock
  public void StainedGlassBlock(net.minecraft.util.DyeColor color, net.minecraft.block.AbstractBlock.Settings settings) {
  }

  public net.minecraft.util.DyeColor getColor() {
    return null;
  }

  // Primary Stained Glass Stairs
  public static final Block PRIMARY_RED_STAINED_GLASS_STAIRS = new CromaticStainedGlassStairs(DyeColor.RED, CromaticStainedGlasses.PRIMARY_RED_STAINED_GLASS.getDefaultState(), FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS));
  public static final Block PRIMARY_BLUE_STAINED_GLASS_STAIRS = new CromaticStainedGlassStairs(DyeColor.BLUE, CromaticStainedGlasses.PRIMARY_BLUE_STAINED_GLASS.getDefaultState(), FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS));
  public static final Block PRIMARY_YELLOW_STAINED_GLASS_STAIRS = new CromaticStainedGlassStairs(DyeColor.YELLOW, CromaticStainedGlasses.PRIMARY_YELLOW_STAINED_GLASS.getDefaultState(), FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS));

  //Secondary Stained Glass Stairs
  public static final Block SECONDARY_GREEN_STAINED_GLASS_STAIRS = new CromaticStainedGlassStairs(DyeColor.GREEN, CromaticStainedGlasses.SECONDARY_GREEN_STAINED_GLASS.getDefaultState(), FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS));
  public static final Block SECONDARY_ORANGE_STAINED_GLASS_STAIRS = new CromaticStainedGlassStairs(DyeColor.ORANGE, CromaticStainedGlasses.SECONDARY_ORANGE_STAINED_GLASS.getDefaultState(), FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS));
  public static final Block SECONDARY_VIOLET_STAINED_GLASS_STAIRS = new CromaticStainedGlassStairs(DyeColor.PURPLE, CromaticStainedGlasses.SECONDARY_VIOLET_STAINED_GLASS.getDefaultState(), FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS));

  //Tertiary Stained Glass Stairs
  public static final Block TERTIARY_ORANGE_RED_STAINED_GLASS_STAIRS = new CromaticStainedGlassStairs(DyeColor.ORANGE, CromaticStainedGlasses.TERTIARY_ORANGE_RED_STAINED_GLASS.getDefaultState(), FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS));
  public static final Block TERTIARY_PURPLISH_RED_STAINED_GLASS_STAIRS = new CromaticStainedGlassStairs(DyeColor.PURPLE, CromaticStainedGlasses.TERTIARY_PURPLISH_RED_STAINED_GLASS.getDefaultState(), FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS));
  public static final Block TERTIARY_GREENISH_YELLOW_STAINED_GLASS_STAIRS = new CromaticStainedGlassStairs(DyeColor.GREEN, CromaticStainedGlasses.TERTIARY_GREENISH_YELLOW_STAINED_GLASS.getDefaultState(), FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS));
  public static final Block TERTIARY_ORANGE_YELLOW_STAINED_GLASS_STAIRS = new CromaticStainedGlassStairs(DyeColor.ORANGE, CromaticStainedGlasses.TERTIARY_ORANGE_YELLOW_STAINED_GLASS.getDefaultState(), FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS));
  public static final Block TERTIARY_BLUE_GREEN_STAINED_GLASS_STAIRS = new CromaticStainedGlassStairs(DyeColor.GREEN, CromaticStainedGlasses.TERTIARY_BLUE_GREEN_STAINED_GLASS.getDefaultState(), FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS));
  public static final Block TERTIARY_BLUE_PURPLE_STAINED_GLASS_STAIRS = new CromaticStainedGlassStairs(DyeColor.PURPLE, CromaticStainedGlasses.TERTIARY_BLUE_PURPLE_STAINED_GLASS.getDefaultState(), FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS));

  //Neutral Stained Glass Stairs
  public static final Block NEUTRAL_WHITE_STAINED_GLASS_STAIRS = new CromaticStainedGlassStairs(DyeColor.WHITE, CromaticStainedGlasses.NEUTRAL_WHITE_STAINED_GLASS.getDefaultState(), FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS));
  public static final Block NEUTRAL_BLACK_STAINED_GLASS_STAIRS = new CromaticStainedGlassStairs(DyeColor.BLACK, CromaticStainedGlasses.NEUTRAL_BLACK_STAINED_GLASS.getDefaultState(), FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS));
  public static final Block NEUTRAL_GRAY_STAINED_GLASS_STAIRS = new CromaticStainedGlassStairs(DyeColor.GRAY, CromaticStainedGlasses.NEUTRAL_GRAY_STAINED_GLASS.getDefaultState(), FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS));
  
  //Mixed Stained Glass Stairs
  public static final Block MIXED_BROWN_STAINED_GLASS_STAIRS = new CromaticStainedGlassStairs(DyeColor.BROWN, CromaticStainedGlasses.MIXED_BROWN_STAINED_GLASS.getDefaultState(), FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS));

  public static void registryPrimaryStainedGlassStairs() {}
  public static void registrySecondaryStainedGlassStairs() {}
  public static void registryTertiaryStainedGlassStairs() {}
  public static void registryNeutralStainedGlassStairs() {}
  public static void registryMixedStainedGlassStairs() {}

}
