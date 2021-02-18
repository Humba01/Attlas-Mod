package net.humba01.inquiry.blocks.cromatic.stained_glasses;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class CromaticStainedGlasses {
  
  //Primary Stained Glasses
  public static final Block PRIMARY_RED_STAINED_GLASS = new Block(FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS));
  public static final Block PRIMARY_BLUE_STAINED_GLASS = new Block(FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS));
  public static final Block PRIMARY_YELLOW_STAINED_GLASS = new Block(FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS));

  //Secondary Stained Glasses
  public static final Block SECONDARY_GREEN_STAINED_GLASS = new Block(FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS));
  public static final Block SECONDARY_ORANGE_STAINED_GLASS = new Block(FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS));
  public static final Block SECONDARY_VIOLET_STAINED_GLASS = new Block(FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS));

  //Tertiary Stained Glasses
  public static final Block TERTIARY_ORANGE_RED_STAINED_GLASS = new Block(FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS));
  public static final Block TERTIARY_PURPLISH_RED_STAINED_GLASS = new Block(FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS));
  public static final Block TERTIARY_GREENISH_YELLOW_STAINED_GLASS = new Block(FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS));
  public static final Block TERTIARY_ORANGE_YELLOW_STAINED_GLASS = new Block(FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS));
  public static final Block TERTIARY_BLUE_GREEN_STAINED_GLASS = new Block(FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS));
  public static final Block TERTIARY_BLUE_PURPLE_STAINED_GLASS = new Block(FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS));

  //Neutral Stained Glasses
  public static final Block NEUTRAL_WHITE_STAINED_GLASS = new Block(FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS));
  public static final Block NEUTRAL_BLACK_STAINED_GLASS = new Block(FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS));
  public static final Block NEUTRAL_GRAY_STAINED_GLASS = new Block(FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS));
  
  //Mixed Stained Glasses
  public static final Block MIXED_WHITE_STAINED_GLASS = new Block(FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS));

  public static void registryPrimaryStainedGlasses() {}
  public static void registrySecondaryStainedGlasses() {}
  public static void registryTertiaryStainedGlasses() {}
  public static void registryNeutralStainedGlasses() {}
  public static void registryMixedStainedGlasses() {}

}
