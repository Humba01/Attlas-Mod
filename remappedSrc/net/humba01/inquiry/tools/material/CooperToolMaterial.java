package net.humba01.inquiry.tools.material;

import net.humba01.inquiry.itens.Ingots;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class CooperToolMaterial implements ToolMaterial {

  public static final CooperToolMaterial INSTANCE = new CooperToolMaterial();

  @Override
  public float getAttackDamage() {
    // TODO Auto-generated method stub
    return 13.5f;
  }

  @Override
  public int getDurability() {
    // TODO Auto-generated method stub
    return 560;
  }

  @Override
  public int getEnchantability() {
    // TODO Auto-generated method stub
    return 22;
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
    return Ingredient.ofItems(Ingots.COOPER_INGOT);
  }
  
}
