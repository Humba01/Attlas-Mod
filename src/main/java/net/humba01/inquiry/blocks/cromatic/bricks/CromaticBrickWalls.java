package net.humba01.inquiry.blocks.cromatic.bricks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
// import net.humba01.inquiry.InquiryMod;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.WallBlock;
// import net.minecraft.item.BlockItem;
// import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;
// import net.minecraft.util.Identifier;
// import net.minecraft.util.registry.Registry;

public class CromaticBrickWalls extends WallBlock {
  
  public CromaticBrickWalls(Settings settings) {
    super(settings);
    // TODO Auto-generated constructor stub
  }

  // Primary Bricks
  public static final Block PRIMARY_RED_BRICK_WALL = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));

  public void registryPrimaryBrickWalls() {}
  public void registrySecondaryBrickWalls() {}
  public void registryTertiaryBrickWalls() {}
  public void registryNeutralBrickWalls() {}
  public void registryMixedBrickWalls() {}
}
