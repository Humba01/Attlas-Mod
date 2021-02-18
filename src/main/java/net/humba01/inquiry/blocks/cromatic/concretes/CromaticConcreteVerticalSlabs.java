package net.humba01.inquiry.blocks.cromatic.concretes;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class CromaticConcreteVerticalSlabs {

  //Primary Concrete Vertical Slabs
  public static final Block PRIMARY_RED_CONCRETE_VERTICAL_SLAB = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));
  public static final Block PRIMARY_BLUE_CONCRETE_VERTICAL_SLAB = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));
  public static final Block PRIMARY_YELLOW_CONCRETE_VERTICAL_SLAB = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));

  //Secondary Concrete Vertical Slabs
  public static final Block SECONDARY_GREEN_CONCRETE_VERTICAL_SLAB = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));
  public static final Block SECONDARY_ORANGE_CONCRETE_VERTICAL_SLAB = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));
  public static final Block SECONDARY_VIOLET_CONCRETE_VERTICAL_SLAB = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));

  //Tertiary Concrete Vertical Slabs
  public static final Block TERTIARY_ORANGE_RED_CONCRETE_VERTICAL_SLAB = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));
  public static final Block TERTIARY_PURPLISH_RED_CONCRETE_VERTICAL_SLAB = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));
  public static final Block TERTIARY_GREENISH_YELLOW_CONCRETE_VERTICAL_SLAB = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));
  public static final Block TERTIARY_ORANGE_YELLOW_CONCRETE_VERTICAL_SLAB = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));
  public static final Block TERTIARY_BLUE_GREEN_CONCRETE_VERTICAL_SLAB = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));
  public static final Block TERTIARY_BLUE_PURPLE_CONCRETE_VERTICAL_SLAB = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));

  //Neutral Concrete Vertical Slabs
  public static final Block NEUTRAL_WHITE_CONCRETE_VERTICAL_SLAB = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));
  public static final Block NEUTRAL_BLACK_CONCRETE_VERTICAL_SLAB = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));
  public static final Block NEUTRAL_GRAY_CONCRETE_VERTICAL_SLAB = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));
  
  //Mixed Concrete Vertical Slabs
  public static final Block MIXED_BROWN_CONCRETE_VERTICAL_SLAB = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));
  
  public static void registryPrimaryConcreteVerticalSlabs() {}
  public static void registrySecondaryConcreteVerticalSlabs() {}
  public static void registryTertiaryConcreteVerticalSlabs() {}
  public static void registryNeutralConcreteVerticalSlabs() {}
  public static void registryMixedConcreteVerticalSlabs() {}

}
