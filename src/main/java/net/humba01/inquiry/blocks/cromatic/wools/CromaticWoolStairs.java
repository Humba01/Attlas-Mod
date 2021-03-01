package net.humba01.inquiry.blocks.cromatic.wools;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.block.StairsBlock;
import net.minecraft.sound.BlockSoundGroup;

public class CromaticWoolStairs extends StairsBlock {

  protected CromaticWoolStairs(BlockState baseBlockState, Settings settings) {
    super(baseBlockState, settings);
    // TODO Auto-generated constructor stub
  }

  // Primary Wool Stairs
  public static final Block PRIMARY_RED_WOOL_STAIRS = new CromaticWoolStairs(CromaticWools.PRIMARY_RED_WOOL.getDefaultState(), FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));
  public static final Block PRIMARY_BLUE_WOOL_STAIRS = new CromaticWoolStairs(CromaticWools.PRIMARY_BLUE_WOOL.getDefaultState(), FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));
  public static final Block PRIMARY_YELLOW_WOOL_STAIRS = new CromaticWoolStairs(CromaticWools.PRIMARY_YELLOW_WOOL.getDefaultState(), FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));

  //Secondary Wool Stairs
  public static final Block SECONDARY_GREEN_WOOL_STAIRS = new CromaticWoolStairs(CromaticWools.SECONDARY_GREEN_WOOL.getDefaultState(), FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));
  public static final Block SECONDARY_ORANGE_WOOL_STAIRS = new CromaticWoolStairs(CromaticWools.SECONDARY_ORANGE_WOOL.getDefaultState(), FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));
  public static final Block SECONDARY_VIOLET_WOOL_STAIRS = new CromaticWoolStairs(CromaticWools.SECONDARY_VIOLET_WOOL.getDefaultState(), FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));

  //Tertiary Wool Stairs
  public static final Block TERTIARY_ORANGE_RED_WOOL_STAIRS = new CromaticWoolStairs(CromaticWools.TERTIARY_ORANGE_RED_WOOL.getDefaultState(), FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));
  public static final Block TERTIARY_PURPLISH_RED_WOOL_STAIRS = new CromaticWoolStairs(CromaticWools.TERTIARY_PURPLISH_RED_WOOL.getDefaultState(), FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));
  public static final Block TERTIARY_GREENISH_YELLOW_WOOL_STAIRS = new CromaticWoolStairs(CromaticWools.TERTIARY_GREENISH_YELLOW_WOOL.getDefaultState(), FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));
  public static final Block TERTIARY_ORANGE_YELLOW_WOOL_STAIRS = new CromaticWoolStairs(CromaticWools.TERTIARY_ORANGE_YELLOW_WOOL.getDefaultState(), FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));
  public static final Block TERTIARY_BLUE_GREEN_WOOL_STAIRS = new CromaticWoolStairs(CromaticWools.TERTIARY_BLUE_GREEN_WOOL.getDefaultState(), FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));
  public static final Block TERTIARY_BLUE_PURPLE_WOOL_STAIRS = new CromaticWoolStairs(CromaticWools.TERTIARY_BLUE_PURPLE_WOOL.getDefaultState(), FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));

  //Neutral Wool Stairs
  public static final Block NEUTRAL_WHITE_WOOL_STAIRS = new CromaticWoolStairs(CromaticWools.NEUTRAL_WHITE_WOOL.getDefaultState(), FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));
  public static final Block NEUTRAL_BLACK_WOOL_STAIRS = new CromaticWoolStairs(CromaticWools.NEUTRAL_BLACK_WOOL.getDefaultState(), FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));
  public static final Block NEUTRAL_GRAY_WOOL_STAIRS = new CromaticWoolStairs(CromaticWools.NEUTRAL_GRAY_WOOL.getDefaultState(), FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));
  
  //Mixed Wool Stairs
  public static final Block MIXED_BROWN_WOOL_STAIRS = new CromaticWoolStairs(CromaticWools.MIXED_BROWN_WOOL.getDefaultState(), FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));
  
  public static void registryPrimaryWoolStairs() {}
  public static void registrySecondaryWoolStairs() {}
  public static void registryTertiaryWoolStairs() {}
  public static void registryNeutralWoolStairs() {}
  public static void registryMixedWoolStairs() {}

}
