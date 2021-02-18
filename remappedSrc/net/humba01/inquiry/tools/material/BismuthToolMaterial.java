package net.humba01.inquiry.tools.material;

import net.humba01.inquiry.itens.Ingots;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class BismuthToolMaterial implements ToolMaterial {

  public static final BismuthToolMaterial INSTANCE = new BismuthToolMaterial();

  @Override
  public float getAttackDamage() {
    // TODO Auto-generated method stub
    return 30.0f;
  }

  @Override
  public int getDurability() {
    // TODO Auto-generated method stub
    return 4200;
  }

  @Override
  public int getEnchantability() {
    // TODO Auto-generated method stub
    return 24;
  }

  @Override
  public int getMiningLevel() {
    // TODO Auto-generated method stub
    return 10;
  }

  @Override
  public float getMiningSpeedMultiplier() {
    // TODO Auto-generated method stub
    return 7.5f;
  }

  @Override
  public Ingredient getRepairIngredient() {
    // TODO Auto-generated method stub
    return Ingredient.ofItems(Ingots.BISMUTH_INGOT);
  }
  
}
