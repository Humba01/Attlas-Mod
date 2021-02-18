package net.humba01.inquiry.blocks.cromatic.cements;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class CromaticCements {
  
  //Primary Cements
  public static final Block PRIMARY_RED_CEMENT = new Block(FabricBlockSettings.of(Material.GOURD).sounds(BlockSoundGroup.SAND));
  public static final Block PRIMARY_BLUE_CEMENT = new Block(FabricBlockSettings.of(Material.GOURD).sounds(BlockSoundGroup.SAND));
  public static final Block PRIMARY_YELLOW_CEMENT = new Block(FabricBlockSettings.of(Material.GOURD).sounds(BlockSoundGroup.SAND));

  //Secondary Cements
  public static final Block SECONDARY_GREEN_CEMENT = new Block(FabricBlockSettings.of(Material.GOURD).sounds(BlockSoundGroup.SAND));
  public static final Block SECONDARY_ORANGE_CEMENT = new Block(FabricBlockSettings.of(Material.GOURD).sounds(BlockSoundGroup.SAND));
  public static final Block SECONDARY_VIOLET_CEMENT = new Block(FabricBlockSettings.of(Material.GOURD).sounds(BlockSoundGroup.SAND));

  //Tertiary Cements
  public static final Block TERTIARY_ORANGE_RED_CEMENT = new Block(FabricBlockSettings.of(Material.GOURD).sounds(BlockSoundGroup.SAND));
  public static final Block TERTIARY_PURPLISH_RED_CEMENT = new Block(FabricBlockSettings.of(Material.GOURD).sounds(BlockSoundGroup.SAND));
  public static final Block TERTIARY_GREENISH_YELLOW_CEMENT = new Block(FabricBlockSettings.of(Material.GOURD).sounds(BlockSoundGroup.SAND));
  public static final Block TERTIARY_ORANGE_YELLOW_CEMENT = new Block(FabricBlockSettings.of(Material.GOURD).sounds(BlockSoundGroup.SAND));
  public static final Block TERTIARY_BLUE_GREEN_CEMENT = new Block(FabricBlockSettings.of(Material.GOURD).sounds(BlockSoundGroup.SAND));
  public static final Block TERTIARY_BLUE_PURPLE_CEMENT = new Block(FabricBlockSettings.of(Material.GOURD).sounds(BlockSoundGroup.SAND));

  //Neutral Cements
  public static final Block NEUTRAL_WHITE_CEMENT = new Block(FabricBlockSettings.of(Material.GOURD).sounds(BlockSoundGroup.SAND));
  public static final Block NEUTRAL_BLACK_CEMENT = new Block(FabricBlockSettings.of(Material.GOURD).sounds(BlockSoundGroup.SAND));
  public static final Block NEUTRAL_GRAY_CEMENT = new Block(FabricBlockSettings.of(Material.GOURD).sounds(BlockSoundGroup.SAND));

  public static void registryPrimaryCements() {}
  public static void registrySecondaryCements() {}
  public static void registryTertiaryCements() {}
  public static void registryNeutralCements() {}

}
