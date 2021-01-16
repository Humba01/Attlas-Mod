package net.humba01.inquiry.tools.material;

import net.humba01.inquiry.itens.Ingots;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class ThalliumToolMaterial implements ToolMaterial {

  public static final ThalliumToolMaterial INSTANCE = new ThalliumToolMaterial();

  @Override
  public float getAttackDamage() {
    // TODO Auto-generated method stub
    return 20.0f;
  }

  @Override
  public int getDurability() {
    // TODO Auto-generated method stub
    return 1220;
  }

  @Override
  public int getEnchantability() {
    // TODO Auto-generated method stub
    return 20;
  }

  @Override
  public int getMiningLevel() {
    // TODO Auto-generated method stub
    return 8;
  }

  @Override
  public float getMiningSpeedMultiplier() {
    // TODO Auto-generated method stub
    return 8.0f;
  }

  @Override
  public Ingredient getRepairIngredient() {
    // TODO Auto-generated method stub
    return Ingredient.ofItems(Ingots.THALLIUM_INGOT);
  }
  
}
