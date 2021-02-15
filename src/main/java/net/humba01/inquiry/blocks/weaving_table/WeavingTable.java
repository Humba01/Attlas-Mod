package net.humba01.inquiry.blocks.weaving_table;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.humba01.inquiry.InquiryMod;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class WeavingTable {

  public static final Block WEAVING_TABLE = new Block(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD));
  
  public static void registryWeavingTable() {
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "weaving_table"), WEAVING_TABLE);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID), new BlockItem(WEAVING_TABLE, new Item.Settings().group(InquiryMod.CRAFTING_TABLES)));
  };
}
