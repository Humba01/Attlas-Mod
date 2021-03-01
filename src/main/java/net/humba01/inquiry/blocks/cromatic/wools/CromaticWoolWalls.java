package net.humba01.inquiry.blocks.cromatic.wools;

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

public class CromaticWoolWalls extends WallBlock {
  
  public CromaticWoolWalls(Settings settings) {
    super(settings);
    // TODO Auto-generated constructor stub
  }

  // Primary Wools
  public static final Block PRIMARY_RED_WOOL_WALL = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));

  public void registryPrimaryWoolWalls() {}
  public void registrySecondaryWoolWalls() {}
  public void registryTertiaryWoolWalls() {}
  public void registryNeutralWoolWalls() {}
  public void registryMixedWoolWalls() {}
}
