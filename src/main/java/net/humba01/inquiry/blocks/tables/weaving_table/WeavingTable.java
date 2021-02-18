package net.humba01.inquiry.blocks.tables.weaving_table;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.humba01.inquiry.InquiryMod;
import net.minecraft.block.Block;
import net.minecraft.block.BlockEntityProvider;
import net.minecraft.block.Material;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.BlockView;

public class WeavingTable extends Block implements BlockEntityProvider {

  public WeavingTable(Settings settings) {
    super(settings);
    // TODO Auto-generated constructor stub
  }

  // Block Entity
  public static BlockEntityType<WeavingTableEntity> WEAVING_TABLE_ENTITY;

  // Block
  public static final Block WEAVING_TABLE = new Block(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD));

  @Override
  public BlockEntity createBlockEntity(BlockView blockview) {
    return new WeavingTableEntity();
  }
  
  public static void registryWeavingTable() {
    // Block
    Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "weaving_table"), WEAVING_TABLE);
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "weaving_table"), new BlockItem(WEAVING_TABLE, new Item.Settings().group(InquiryMod.CRAFTING_TABLES)));

    // Block Entity
    WEAVING_TABLE_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier(InquiryMod.MOD_ID, "weaving_table_entity"), BlockEntityType.Builder.create(WeavingTableEntity::new, WEAVING_TABLE).build(null));
  };
}
