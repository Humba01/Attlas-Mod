package net.humba01.inquiry.blocks.cromatic.wools;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class CromaticWoolVerticalSlabs {

  //Primary Wool Vertical Slabs
  public static final Block PRIMARY_RED_WOOL_VERTICAL_SLAB = new Block(FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));
  public static final Block PRIMARY_BLUE_WOOL_VERTICAL_SLAB = new Block(FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));
  public static final Block PRIMARY_YELLOW_WOOL_VERTICAL_SLAB = new Block(FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));

  //Secondary Wool Vertical Slabs
  public static final Block SECONDARY_GREEN_WOOL_VERTICAL_SLAB = new Block(FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));
  public static final Block SECONDARY_ORANGE_WOOL_VERTICAL_SLAB = new Block(FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));
  public static final Block SECONDARY_VIOLET_WOOL_VERTICAL_SLAB = new Block(FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));

  //Tertiary Wool Vertical Slabs
  public static final Block TERTIARY_ORANGE_RED_WOOL_VERTICAL_SLAB = new Block(FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));
  public static final Block TERTIARY_PURPLISH_RED_WOOL_VERTICAL_SLAB = new Block(FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));
  public static final Block TERTIARY_GREENISH_YELLOW_WOOL_VERTICAL_SLAB = new Block(FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));
  public static final Block TERTIARY_ORANGE_YELLOW_WOOL_VERTICAL_SLAB = new Block(FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));
  public static final Block TERTIARY_BLUE_GREEN_WOOL_VERTICAL_SLAB = new Block(FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));
  public static final Block TERTIARY_BLUE_PURPLE_WOOL_VERTICAL_SLAB = new Block(FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));

  //Neutral Wool Vertical Slabs
  public static final Block NEUTRAL_WHITE_WOOL_VERTICAL_SLAB = new Block(FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));
  public static final Block NEUTRAL_BLACK_WOOL_VERTICAL_SLAB = new Block(FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));
  public static final Block NEUTRAL_GRAY_WOOL_VERTICAL_SLAB = new Block(FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));
  
  //Mixed Wool Vertical Slabs
  public static final Block MIXED_BROWN_WOOL_VERTICAL_SLAB = new Block(FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));

  public static void registryPrimaryWoolVerticalSlabs() {}
  public static void registrySecondaryWoolVerticalSlabs() {}
  public static void registryTertiaryWoolVerticalSlabs() {}
  public static void registryNeutralWoolVerticalSlabs() {}
  public static void registryMixedWoolVerticalSlabs() {}

}
