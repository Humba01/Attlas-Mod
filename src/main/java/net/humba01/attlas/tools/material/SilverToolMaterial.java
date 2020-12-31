package net.humba01.attlas.tools.material;

import net.humba01.attlas.itens.Ingots;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class SilverToolMaterial implements ToolMaterial {

  public static final SilverToolMaterial INSTANCE = new SilverToolMaterial();

  @Override
  public float getAttackDamage() {
    // TODO Auto-generated method stub
    return 12.0f;
  }

  @Override
  public int getDurability() {
    // TODO Auto-generated method stub
    return 430;
  }

  @Override
  public int getEnchantability() {
    // TODO Auto-generated method stub
    return 24;
  }

  @Override
  public int getMiningLevel() {
    // TODO Auto-generated method stub
    return 4;
  }

  @Override
  public float getMiningSpeedMultiplier() {
    // TODO Auto-generated method stub
    return 3.0f;
  }

  @Override
  public Ingredient getRepairIngredient() {
    // TODO Auto-generated method stub
    return Ingredient.ofItems(Ingots.SILVER_INGOT);
  }
  
}
