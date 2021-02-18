package net.humba01.inquiry.blocks.cromatic.glasses;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class CromaticGlassVerticalSlabs {
  
  //Primary Glass Vertical Slabs
  public static final Block PRIMARY_RED_GLASS_VERTICAL_SLAB = new Block(FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS));
  public static final Block PRIMARY_BLUE_GLASS_VERTICAL_SLAB = new Block(FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS));
  public static final Block PRIMARY_YELLOW_GLASS_VERTICAL_SLAB = new Block(FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS));

  //Secondary Glass Vertical Slabs
  public static final Block SECONDARY_GREEN_GLASS_VERTICAL_SLAB = new Block(FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS));
  public static final Block SECONDARY_ORANGE_GLASS_VERTICAL_SLAB = new Block(FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS));
  public static final Block SECONDARY_VIOLET_GLASS_VERTICAL_SLAB = new Block(FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS));

  //Tertiary Glass Vertical Slabs
  public static final Block TERTIARY_ORANGE_RED_GLASS_VERTICAL_SLAB = new Block(FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS));
  public static final Block TERTIARY_PURPLISH_RED_GLASS_VERTICAL_SLAB = new Block(FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS));
  public static final Block TERTIARY_GREENISH_YELLOW_GLASS_VERTICAL_SLAB = new Block(FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS));
  public static final Block TERTIARY_ORANGE_YELLOW_GLASS_VERTICAL_SLAB = new Block(FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS));
  public static final Block TERTIARY_BLUE_GREEN_GLASS_VERTICAL_SLAB = new Block(FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS));
  public static final Block TERTIARY_BLUE_PURPLE_GLASS_VERTICAL_SLAB = new Block(FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS));

  //Neutral Glass Vertical Slabs
  public static final Block NEUTRAL_WHITE_GLASS_VERTICAL_SLAB = new Block(FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS));
  public static final Block NEUTRAL_BLACK_GLASS_VERTICAL_SLAB = new Block(FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS));
  public static final Block NEUTRAL_GRAY_GLASS_VERTICAL_SLAB = new Block(FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS));

  public static void registryPrimaryGlassVerticalSlabs() {}
  public static void registrySecondaryGlassVerticalSlabs() {}
  public static void registryTertiaryGlassVerticalSlabs() {}
  public static void registryNeutralGlassVerticalSlabs() {}

}
