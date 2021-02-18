package net.humba01.inquiry.blocks.cromatic.concretes;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class CromaticConcretes {

  //Primary Concretes
  public static final Block PRIMARY_RED_CONCRETE = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));
  public static final Block PRIMARY_BLUE_CONCRETE = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));
  public static final Block PRIMARY_YELLOW_CONCRETE = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));

  //Secondary Concretes
  public static final Block SECONDARY_GREEN_CONCRETE = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));
  public static final Block SECONDARY_ORANGE_CONCRETE = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));
  public static final Block SECONDARY_VIOLET_CONCRETE = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));

  //Tertiary Concretes
  public static final Block TERTIARY_ORANGE_RED_CONCRETE = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));
  public static final Block TERTIARY_PURPLISH_RED_CONCRETE = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));
  public static final Block TERTIARY_GREENISH_YELLOW_CONCRETE = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));
  public static final Block TERTIARY_ORANGE_YELLOW_CONCRETE = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));
  public static final Block TERTIARY_BLUE_GREEN_CONCRETE = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));
  public static final Block TERTIARY_BLUE_PURPLE_CONCRETE = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));

  //Neutral Concretes
  public static final Block NEUTRAL_WHITE_CONCRETE = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));
  public static final Block NEUTRAL_BLACK_CONCRETE = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));
  public static final Block NEUTRAL_GRAY_CONCRETE = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));
  
  //Mixed Concretes
  public static final Block MIXED_BROWN_CONCRETE = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));

  public static void registryPrimaryConcretes() {
    // Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "primary_red_wool"), PRIMARY_RED_CONCRETE);
    // Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "primary_red_wool"), new BlockItem(PRIMARY_RED_CONCRETE, new Item.Settings().group(InquiryMod.CROMATIC_WOOL_BLOCKS)));
  }

  public static void registrySecondaryConcretes() {}
  public static void registryTertiaryConcretes() {}
  public static void registryNeutralConcretes() {}
  public static void registryMixedConcretes() {}

}
