package net.humba01.attlas.tools.material;

import net.humba01.attlas.itens.Ingots;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class CobaltToolMaterial implements ToolMaterial {

  public static final CobaltToolMaterial INSTANCE = new CobaltToolMaterial();

  @Override
  public float getAttackDamage() {
    // TODO Auto-generated method stub
    return 14.0f;
  }

  @Override
  public int getDurability() {
    // TODO Auto-generated method stub
    return 580;
  }

  @Override
  public int getEnchantability() {
    // TODO Auto-generated method stub
    return 26;
  }

  @Override
  public int getMiningLevel() {
    // TODO Auto-generated method stub
    return 6;
  }

  @Override
  public float getMiningSpeedMultiplier() {
    // TODO Auto-generated method stub
    return 6.0f;
  }

  @Override
  public Ingredient getRepairIngredient() {
    // TODO Auto-generated method stub
    return Ingredient.ofItems(Ingots.COBALT_INGOT);
  }
  
}
