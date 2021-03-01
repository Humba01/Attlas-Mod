package net.humba01.inquiry.blocks.cromatic.cements;

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

public class CromaticCementWalls extends WallBlock {
  
  public CromaticCementWalls(Settings settings) {
    super(settings);
    // TODO Auto-generated constructor stub
  }

  // Primary Cements
  public static final Block PRIMARY_RED_CEMENT_WALL = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));

  public void registryPrimaryCementWalls() {}
  public void registrySecondaryCementWalls() {}
  public void registryTertiaryCementWalls() {}
  public void registryNeutralCementWalls() {}
  public void registryMixedCementWalls() {}
}
