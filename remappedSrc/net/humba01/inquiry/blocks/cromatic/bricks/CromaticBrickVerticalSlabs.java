package net.humba01.inquiry.blocks.cromatic.bricks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class CromaticBrickVerticalSlabs {
  
  //Primary Brick Vertical Slabs
  public static final Block PRIMARY_RED_BRICK_VERTICAL_SLAB = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));
  public static final Block PRIMARY_BLUE_BRICK_VERTICAL_SLAB = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));
  public static final Block PRIMARY_YELLOW_BRICK_VERTICAL_SLAB = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));

  //Secondary Brick Vertical Slabs
  public static final Block SECONDARY_GREEN_BRICK_VERTICAL_SLAB = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));
  public static final Block SECONDARY_ORANGE_BRICK_VERTICAL_SLAB = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));
  public static final Block SECONDARY_VIOLET_BRICK_VERTICAL_SLAB = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));

  //Tertiary Brick Vertical Slabs
  public static final Block TERTIARY_ORANGE_RED_BRICK_VERTICAL_SLAB = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));
  public static final Block TERTIARY_PURPLISH_RED_BRICK_VERTICAL_SLAB = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));
  public static final Block TERTIARY_GREENISH_YELLOW_BRICK_VERTICAL_SLAB = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));
  public static final Block TERTIARY_ORANGE_YELLOW_BRICK_VERTICAL_SLAB = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));
  public static final Block TERTIARY_BLUE_GREEN_BRICK_VERTICAL_SLAB = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));
  public static final Block TERTIARY_BLUE_PURPLE_BRICK_VERTICAL_SLAB = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));

  //Neutral Brick Vertical Slabs
  public static final Block NEUTRAL_WHITE_BRICK_VERTICAL_SLAB = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));
  public static final Block NEUTRAL_BLACK_BRICK_VERTICAL_SLAB = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));
  public static final Block NEUTRAL_GRAY_BRICK_VERTICAL_SLAB = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));

  public static void registryPrimaryBrickVerticalSlabs() {}
  public static void registrySecondaryBrickVerticalSlabs() {}
  public static void registryTertiaryBrickVerticalSlabs() {}
  public static void registryNeutralBrickVerticalSlabs() {}

}
