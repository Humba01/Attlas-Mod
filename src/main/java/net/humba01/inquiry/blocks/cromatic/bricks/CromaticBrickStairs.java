package net.humba01.inquiry.blocks.cromatic.bricks;

import java.util.Random;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.humba01.inquiry.InquiryMod;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.structure.StrongholdGenerator.Stairs;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockBox;
import net.minecraft.util.math.Direction;
import net.minecraft.util.registry.Registry;

public class CromaticBrickStairs extends Stairs {

  public CromaticBrickStairs(int chainLength, Random random, BlockBox boundingBox, Direction orientation) {
    super(chainLength, random, boundingBox, orientation);
    // TODO Auto-generated constructor stub
  }

  // Primary Brick Stairs
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

  public static void registryPrimaryBrickStairs() {
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "primary_red_bricks_stairs"), PRIMARY_RED_BRICK_STAIRS);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "primary_red_bricks_stairs"), new BlockItem(PRIMARY_RED_BRICK_STAIRS, new Item.Settings().group(InquiryMod.CROMATIC_BRICK_BLOCKS)));
  }
  public static void registrySecondaryBrickStairs() {}
  public static void registryTertiaryBrickStairs() {}
  public static void registryNeutralBrickStairs() {}
  public static void registryMixedBrickStairs() {}

}
