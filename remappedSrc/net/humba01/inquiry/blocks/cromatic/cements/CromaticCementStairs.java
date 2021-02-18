package net.humba01.inquiry.blocks.cromatic.cements;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class CromaticCementStairs {
  
  //Primary Cement Stairs
  public static final Block PRIMARY_RED_CEMENT_STAIR = new Block(FabricBlockSettings.of(Material.GOURD).sounds(BlockSoundGroup.SAND));
  public static final Block PRIMARY_BLUE_CEMENT_STAIR = new Block(FabricBlockSettings.of(Material.GOURD).sounds(BlockSoundGroup.SAND));
  public static final Block PRIMARY_YELLOW_CEMENT_STAIR = new Block(FabricBlockSettings.of(Material.GOURD).sounds(BlockSoundGroup.SAND));

  //Secondary Cement Stairs
  public static final Block SECONDARY_GREEN_CEMENT_STAIR = new Block(FabricBlockSettings.of(Material.GOURD).sounds(BlockSoundGroup.SAND));
  public static final Block SECONDARY_ORANGE_CEMENT_STAIR = new Block(FabricBlockSettings.of(Material.GOURD).sounds(BlockSoundGroup.SAND));
  public static final Block SECONDARY_VIOLET_CEMENT_STAIR = new Block(FabricBlockSettings.of(Material.GOURD).sounds(BlockSoundGroup.SAND));

  //Tertiary Cement Stairs
  public static final Block TERTIARY_ORANGE_RED_CEMENT_STAIR = new Block(FabricBlockSettings.of(Material.GOURD).sounds(BlockSoundGroup.SAND));
  public static final Block TERTIARY_PURPLISH_RED_CEMENT_STAIR = new Block(FabricBlockSettings.of(Material.GOURD).sounds(BlockSoundGroup.SAND));
  public static final Block TERTIARY_GREENISH_YELLOW_CEMENT_STAIR = new Block(FabricBlockSettings.of(Material.GOURD).sounds(BlockSoundGroup.SAND));
  public static final Block TERTIARY_ORANGE_YELLOW_CEMENT_STAIR = new Block(FabricBlockSettings.of(Material.GOURD).sounds(BlockSoundGroup.SAND));
  public static final Block TERTIARY_BLUE_GREEN_CEMENT_STAIR = new Block(FabricBlockSettings.of(Material.GOURD).sounds(BlockSoundGroup.SAND));
  public static final Block TERTIARY_BLUE_PURPLE_CEMENT_STAIR = new Block(FabricBlockSettings.of(Material.GOURD).sounds(BlockSoundGroup.SAND));

  //Neutral Cement Stairs
  public static final Block NEUTRAL_WHITE_CEMENT_STAIR = new Block(FabricBlockSettings.of(Material.GOURD).sounds(BlockSoundGroup.SAND));
  public static final Block NEUTRAL_BLACK_CEMENT_STAIR = new Block(FabricBlockSettings.of(Material.GOURD).sounds(BlockSoundGroup.SAND));
  public static final Block NEUTRAL_GRAY_CEMENT_STAIR = new Block(FabricBlockSettings.of(Material.GOURD).sounds(BlockSoundGroup.SAND));

  public static void registryPrimaryCementStairs() {}
  public static void registrySecondaryCementStairs() {}
  public static void registryTertiaryCementStairs() {}
  public static void registryNeutralCementStairs() {}

}
