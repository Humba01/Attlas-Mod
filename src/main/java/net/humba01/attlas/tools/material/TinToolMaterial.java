package net.humba01.attlas.tools.material;

import net.humba01.attlas.itens.Ingots;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class TinToolMaterial implements ToolMaterial {

  public static final TinToolMaterial INSTANCE = new TinToolMaterial();

  @Override
  public float getAttackDamage() {
    // TODO Auto-generated method stub
    return 7.0f;
  }

  @Override
  public int getDurability() {
    // TODO Auto-generated method stub
    return 310;
  }

  @Override
  public int getEnchantability() {
    // TODO Auto-generated method stub
    return 18;
  }

  @Override
  public int getMiningLevel() {
    // TODO Auto-generated method stub
    return 3;
  }

  @Override
  public float getMiningSpeedMultiplier() {
    // TODO Auto-generated method stub
    return 2.0f;
  }

  @Override
  public Ingredient getRepairIngredient() {
    // TODO Auto-generated method stub
    return Ingredient.ofItems(Ingots.TIN_INGOT);
  }
  
}
