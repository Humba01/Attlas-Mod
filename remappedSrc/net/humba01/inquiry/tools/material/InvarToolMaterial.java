package net.humba01.inquiry.tools.material;

import net.humba01.inquiry.itens.Ingots;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class InvarToolMaterial implements ToolMaterial {

  public static final InvarToolMaterial INSTANCE = new InvarToolMaterial();

  @Override
  public float getAttackDamage() {
    // TODO Auto-generated method stub
    return 22.0f;
  }

  @Override
  public int getDurability() {
    // TODO Auto-generated method stub
    return 2200;
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
    return Ingredient.ofItems(Ingots.INVAR_INGOT);
  }
  
}
