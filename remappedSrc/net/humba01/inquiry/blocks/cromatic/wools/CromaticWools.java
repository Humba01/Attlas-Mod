package net.humba01.inquiry.blocks.cromatic.wools;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class CromaticWools {

  //Primary Wools
  public static final Block PRIMARY_RED_WOOL = new Block(FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));
  public static final Block PRIMARY_BLUE_WOOL = new Block(FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));
  public static final Block PRIMARY_YELLOW_WOOL = new Block(FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));

  //Secondary Wools
  public static final Block SECONDARY_GREEN_WOOL = new Block(FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));
  public static final Block SECONDARY_ORANGE_WOOL = new Block(FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));
  public static final Block SECONDARY_VIOLET_WOOL = new Block(FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));

  //Tertiary Wools
  public static final Block TERTIARY_ORANGE_RED_WOOL = new Block(FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));
  public static final Block TERTIARY_PURPLISH_RED_WOOL = new Block(FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));
  public static final Block TERTIARY_GREENISH_YELLOW_WOOL = new Block(FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));
  public static final Block TERTIARY_ORANGE_YELLOW_WOOL = new Block(FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));
  public static final Block TERTIARY_BLUE_GREEN_WOOL = new Block(FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));
  public static final Block TERTIARY_BLUE_PURPLE_WOOL = new Block(FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));

  //Neutral Wools
  public static final Block NEUTRAL_WHITE_WOOL = new Block(FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));
  public static final Block NEUTRAL_BLACK_WOOL = new Block(FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));
  public static final Block NEUTRAL_GRAY_WOOL = new Block(FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL));

  public static void registryPrimaryWools() {}
  public static void registrySecondaryWools() {}
  public static void registryTertiaryWools() {}
  public static void registryNeutralWools() {}

}
