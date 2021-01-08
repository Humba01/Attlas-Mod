package net.humba01.attlas.tools.material;

import net.humba01.attlas.itens.Ingots;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class AluminumToolMaterial implements ToolMaterial {

  public static final AluminumToolMaterial INSTANCE = new AluminumToolMaterial(); 

  @Override
  public float getAttackDamage() {
    // TODO Auto-generated method stub
    return 8.0f;
  }

  @Override
  public int getDurability() {
    // TODO Auto-generated method stub
    return 330;
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
    return 3.0f;
  }

  @Override
  public Ingredient getRepairIngredient() {
    // TODO Auto-generated method stub
    return Ingredient.ofItems(Ingots.ALUMINUM_INGOT);
  }
  
}
