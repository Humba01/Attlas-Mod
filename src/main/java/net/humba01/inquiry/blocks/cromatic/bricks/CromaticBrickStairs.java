package net.humba01.inquiry.blocks.cromatic.bricks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class CromaticBrickStairs {
  
  //Primary Brick Stairs
  public static final Block PRIMARY_RED_BRICK_STAIRS = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));
  public static final Block PRIMARY_BLUE_BRICK_STAIRS = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));
  public static final Block PRIMARY_YELLOW_BRICK_STAIRS = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));

  //Secondary Brick Stairs
  public static final Block SECONDARY_GREEN_BRICK_STAIRS = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));
  public static final Block SECONDARY_ORANGE_BRICK_STAIRS = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));
  public static final Block SECONDARY_VIOLET_BRICK_STAIRS = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));

  //Tertiary Brick Stairs
  public static final Block TERTIARY_ORANGE_RED_BRICK_STAIRS = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));
  public static final Block TERTIARY_PURPLISH_RED_BRICK_STAIRS = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));
  public static final Block TERTIARY_GREENISH_YELLOW_BRICK_STAIRS = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));
  public static final Block TERTIARY_ORANGE_YELLOW_BRICK_STAIRS = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));
  public static final Block TERTIARY_BLUE_GREEN_BRICK_STAIRS = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));
  public static final Block TERTIARY_BLUE_PURPLE_BRICK_STAIRS = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));

  //Neutral Brick Stairs
  public static final Block NEUTRAL_WHITE_BRICK_STAIRS = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));
  public static final Block NEUTRAL_BLACK_BRICK_STAIRS = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));
  public static final Block NEUTRAL_GRAY_BRICK_STAIRS = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));
  
  //Mixed Brick Stairs
  public static final Block MIXED_BROWN_BRICK_STAIRS = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));

  public static void registryPrimaryBrickStairs() {}
  public static void registrySecondaryBrickStairs() {}
  public static void registryTertiaryBrickStairs() {}
  public static void registryNeutralBrickStairs() {}
  public static void registryMixedBrickStairs() {}

}
