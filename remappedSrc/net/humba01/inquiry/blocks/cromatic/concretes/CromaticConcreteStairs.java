package net.humba01.inquiry.blocks.cromatic.concretes;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class CromaticConcreteStairs {

  //Primary Concrete Stairs
  public static final Block PRIMARY_RED_CONCRETE_STAIR = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));
  public static final Block PRIMARY_BLUE_CONCRETE_STAIR = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));
  public static final Block PRIMARY_YELLOW_CONCRETE_STAIR = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));

  //Secondary Concrete Stairs
  public static final Block SECONDARY_GREEN_CONCRETE_STAIR = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));
  public static final Block SECONDARY_ORANGE_CONCRETE_STAIR = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));
  public static final Block SECONDARY_VIOLET_CONCRETE_STAIR = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));

  //Tertiary Concrete Stairs
  public static final Block TERTIARY_ORANGE_RED_CONCRETE_STAIR = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));
  public static final Block TERTIARY_PURPLISH_RED_CONCRETE_STAIR = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));
  public static final Block TERTIARY_GREENISH_YELLOW_CONCRETE_STAIR = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));
  public static final Block TERTIARY_ORANGE_YELLOW_CONCRETE_STAIR = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));
  public static final Block TERTIARY_BLUE_GREEN_CONCRETE_STAIR = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));
  public static final Block TERTIARY_BLUE_PURPLE_CONCRETE_STAIR = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));

  //Neutral Concrete Stairs
  public static final Block NEUTRAL_WHITE_CONCRETE_STAIR = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));
  public static final Block NEUTRAL_BLACK_CONCRETE_STAIR = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));
  public static final Block NEUTRAL_GRAY_CONCRETE_STAIR = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));

  public static void registryPrimaryConcreteStairs() {}
  public static void registrySecondaryConcreteStairs() {}
  public static void registryTertiaryConcreteStairs() {}
  public static void registryNeutralConcreteStairs() {}

}
