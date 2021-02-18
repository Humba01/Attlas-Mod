package net.humba01.inquiry.tools.material;

import net.humba01.inquiry.itens.Ingots;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class IndianToolMaterial implements ToolMaterial {

  public static final IndianToolMaterial INSTANCE = new IndianToolMaterial();

  @Override
  public float getAttackDamage() {
    // TODO Auto-generated method stub
    return 20.5f;
  }

  @Override
  public int getDurability() {
    // TODO Auto-generated method stub
    return 1260;
  }

  @Override
  public int getEnchantability() {
    // TODO Auto-generated method stub
    return 22;
  }

  @Override
  public int getMiningLevel() {
    // TODO Auto-generated method stub
    return 8;
  }

  @Override
  public float getMiningSpeedMultiplier() {
    // TODO Auto-generated method stub
    return 6.5f;
  }

  @Override
  public Ingredient getRepairIngredient() {
    // TODO Auto-generated method stub
    return Ingredient.ofItems(Ingots.INDIAN_INGOT);
  }

}