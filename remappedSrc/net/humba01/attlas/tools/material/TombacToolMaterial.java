package net.humba01.attlas.tools.material;

import net.humba01.attlas.itens.Ingots;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class TombacToolMaterial implements ToolMaterial {

  public static final TombacToolMaterial INSTANCE = new TombacToolMaterial();

  @Override
  public float getAttackDamage() {
    // TODO Auto-generated method stub
    return 22.5f;
  }

  @Override
  public int getDurability() {
    // TODO Auto-generated method stub
    return 2600;
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
    return Ingredient.ofItems(Ingots.TOMBAC_INGOT);
  }
  
}
