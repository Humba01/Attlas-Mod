package net.humba01.attlas.tools.material;

import net.humba01.attlas.itens.Ingots;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class BrassToolMaterial implements ToolMaterial {

  public static final BrassToolMaterial INSTANCE = new BrassToolMaterial();

  @Override
  public float getAttackDamage() {
    // TODO Auto-generated method stub
    return 21.5f;
  }

  @Override
  public int getDurability() {
    // TODO Auto-generated method stub
    return 1380;
  }

  @Override
  public int getEnchantability() {
    // TODO Auto-generated method stub
    return 21;
  }

  @Override
  public int getMiningLevel() {
    // TODO Auto-generated method stub
    return 9;
  }

  @Override
  public float getMiningSpeedMultiplier() {
    // TODO Auto-generated method stub
    return 7.0f;
  }

  @Override
  public Ingredient getRepairIngredient() {
    // TODO Auto-generated method stub
    return Ingredient.ofItems(Ingots.BRASS_INGOT);
  }

}