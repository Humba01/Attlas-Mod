package net.humba01.inquiry.blocks.cromatic.concretes;

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

public class CromaticConcreteWalls extends WallBlock {
  
  public CromaticConcreteWalls(Settings settings) {
    super(settings);
    // TODO Auto-generated constructor stub
  }

  // Primary Concretes
  public static final Block PRIMARY_RED_CONCRETE_WALL = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE));

  public void registryPrimaryConcreteWalls() {}
  public void registrySecondaryConcreteWalls() {}
  public void registryTertiaryConcreteWalls() {}
  public void registryNeutralConcreteWalls() {}
  public void registryMixedConcreteWalls() {}
}
