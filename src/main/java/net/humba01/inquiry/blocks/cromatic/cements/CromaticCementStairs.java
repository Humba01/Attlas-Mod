package net.humba01.inquiry.blocks.cromatic.cements;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.ConcretePowderBlock;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class CromaticCementStairs extends ConcretePowderBlock {
  
  public CromaticCementStairs(Block hardened, Settings settings) {
    super(hardened, settings);
    // TODO Auto-generated constructor stub
  }

  // Primary Cement Stairs
  public static final Block PRIMARY_RED_CEMENT_STAIRS = new Block(FabricBlockSettings.of(Material.GOURD).sounds(BlockSoundGroup.SAND));
  public static final Block PRIMARY_BLUE_CEMENT_STAIRS = new Block(FabricBlockSettings.of(Material.GOURD).sounds(BlockSoundGroup.SAND));
  public static final Block PRIMARY_YELLOW_CEMENT_STAIRS = new Block(FabricBlockSettings.of(Material.GOURD).sounds(BlockSoundGroup.SAND));

  //Secondary Cement Stairs
  public static final Block SECONDARY_GREEN_CEMENT_STAIRS = new Block(FabricBlockSettings.of(Material.GOURD).sounds(BlockSoundGroup.SAND));
  public static final Block SECONDARY_ORANGE_CEMENT_STAIRS = new Block(FabricBlockSettings.of(Material.GOURD).sounds(BlockSoundGroup.SAND));
  public static final Block SECONDARY_VIOLET_CEMENT_STAIRS = new Block(FabricBlockSettings.of(Material.GOURD).sounds(BlockSoundGroup.SAND));

  //Tertiary Cement Stairs
  public static final Block TERTIARY_ORANGE_RED_CEMENT_STAIRS = new Block(FabricBlockSettings.of(Material.GOURD).sounds(BlockSoundGroup.SAND));
  public static final Block TERTIARY_PURPLISH_RED_CEMENT_STAIRS = new Block(FabricBlockSettings.of(Material.GOURD).sounds(BlockSoundGroup.SAND));
  public static final Block TERTIARY_GREENISH_YELLOW_CEMENT_STAIRS = new Block(FabricBlockSettings.of(Material.GOURD).sounds(BlockSoundGroup.SAND));
  public static final Block TERTIARY_ORANGE_YELLOW_CEMENT_STAIRS = new Block(FabricBlockSettings.of(Material.GOURD).sounds(BlockSoundGroup.SAND));
  public static final Block TERTIARY_BLUE_GREEN_CEMENT_STAIRS = new Block(FabricBlockSettings.of(Material.GOURD).sounds(BlockSoundGroup.SAND));
  public static final Block TERTIARY_BLUE_PURPLE_CEMENT_STAIRS = new Block(FabricBlockSettings.of(Material.GOURD).sounds(BlockSoundGroup.SAND));

  //Neutral Cement Stairs
  public static final Block NEUTRAL_WHITE_CEMENT_STAIRS = new Block(FabricBlockSettings.of(Material.GOURD).sounds(BlockSoundGroup.SAND));
  public static final Block NEUTRAL_BLACK_CEMENT_STAIRS = new Block(FabricBlockSettings.of(Material.GOURD).sounds(BlockSoundGroup.SAND));
  public static final Block NEUTRAL_GRAY_CEMENT_STAIRS = new Block(FabricBlockSettings.of(Material.GOURD).sounds(BlockSoundGroup.SAND));
  
  //Mixed Cement Stairs
  public static final Block MIXED_BROWN_CEMENT_STAIRS = new Block(FabricBlockSettings.of(Material.GOURD).sounds(BlockSoundGroup.SAND));
  
  public static void registryPrimaryCementStairs() {}
  public static void registrySecondaryCementStairs() {}
  public static void registryTertiaryCementStairs() {}
  public static void registryNeutralCementStairs() {}
  public static void registryMixedCementStairs() {}

}
