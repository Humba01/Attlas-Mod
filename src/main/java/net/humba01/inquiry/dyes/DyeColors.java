package net.humba01.inquiry.dyes;

import net.humba01.inquiry.InquiryMod;
import net.minecraft.item.DyeItem;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class DyeColors extends DyeItem {

  public DyeColors(DyeColor color, Settings settings) {
    super(color, settings);
    // TODO Auto-generated constructor stub
  }

  private net.minecraft.util.DyeColor A_RED;
  private net.minecraft.util.DyeColor A_BLUE;
  private net.minecraft.util.DyeColor A_YELLOW;
  private net.minecraft.util.DyeColor A_GREEN;
  private net.minecraft.util.DyeColor A_VIOLET;
  private net.minecraft.util.DyeColor A_ORANGE;
  private net.minecraft.util.DyeColor A_ORANGE_RED;
  private net.minecraft.util.DyeColor A_PURPLISH_RED;
  private net.minecraft.util.DyeColor A_GREENISH_YELLOW;
  private net.minecraft.util.DyeColor A_ORANGE_YELLOW;
  private net.minecraft.util.DyeColor A_BLUE_GREEN;
  private net.minecraft.util.DyeColor A_BLUE_PURPLE;
  private net.minecraft.util.DyeColor A_WHITE;
  private net.minecraft.util.DyeColor A_BLACK;
  private net.minecraft.util.DyeColor A_GRAY;
  private net.minecraft.util.DyeColor A_BROWN;

  public static final DyeItem CROMATIC_RED_DYE = new DyeItem(DyeColor.byName("D_RED", DyeColor.valueOf("#ff0000")),
      new Settings().group(InquiryMod.CRAFTING_TABLES));

  public void registryCustomDyes() {
    Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "cromatic_red_dye"), CROMATIC_RED_DYE);
  }

}
