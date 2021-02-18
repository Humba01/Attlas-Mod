package net.humba01.inquiry.blocks.cromatic.wools;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class CromaticWoolSlabs {

  //Primary Wool Slabs
  public static final Block PRIMARY_RED_WOOL_SLAB = new Block(FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));
  public static final Block PRIMARY_BLUE_WOOL_SLAB = new Block(FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));
  public static final Block PRIMARY_YELLOW_WOOL_SLAB = new Block(FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));

  //Secondary Wool Slabs
  public static final Block SECONDARY_GREEN_WOOL_SLAB = new Block(FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));
  public static final Block SECONDARY_ORANGE_WOOL_SLAB = new Block(FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));
  public static final Block SECONDARY_VIOLET_WOOL_SLAB = new Block(FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));

  //Tertiary Wool Slabs
  public static final Block TERTIARY_ORANGE_RED_WOOL_SLAB = new Block(FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));
  public static final Block TERTIARY_PURPLISH_RED_WOOL_SLAB = new Block(FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));
  public static final Block TERTIARY_GREENISH_YELLOW_WOOL_SLAB = new Block(FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));
  public static final Block TERTIARY_ORANGE_YELLOW_WOOL_SLAB = new Block(FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));
  public static final Block TERTIARY_BLUE_GREEN_WOOL_SLAB = new Block(FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));
  public static final Block TERTIARY_BLUE_PURPLE_WOOL_SLAB = new Block(FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));

  //Neutral Wool Slabs
  public static final Block NEUTRAL_WHITE_WOOL_SLAB = new Block(FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));
  public static final Block NEUTRAL_BLACK_WOOL_SLAB = new Block(FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));
  public static final Block NEUTRAL_GRAY_WOOL_SLAB = new Block(FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));

  public static void registryPrimaryWoolSlabs() {}
  public static void registrySecondaryWoolSlabs() {}
  public static void registryTertiaryWoolSlabs() {}
  public static void registryNeutralWoolSlabs() {}

}
