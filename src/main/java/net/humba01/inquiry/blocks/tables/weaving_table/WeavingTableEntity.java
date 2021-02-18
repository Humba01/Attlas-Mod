package net.humba01.inquiry.blocks.tables.weaving_table;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.nbt.CompoundTag;

public class WeavingTableEntity extends BlockEntity {

  private int number = 7;

  public WeavingTableEntity() {
    super(WeavingTable.WEAVING_TABLE_ENTITY);
    // TODO Auto-generated constructor stub
  }
  
  // Serialize the BlockEntity
  @Override
  public CompoundTag toTag(CompoundTag tag) {
    super.toTag(tag);

    // Save the current value of the number to the tag
    tag.putInt("number", number);

    return tag;
  }

  // Deserialize the BlockEntity
  @Override
  public void fromTag(BlockState state, CompoundTag tag) {
    super.fromTag(state, tag);   number = tag.getInt("number");
  }

}
