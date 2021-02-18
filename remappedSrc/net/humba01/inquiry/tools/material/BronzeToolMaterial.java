package net.humba01.inquiry.tools.material;

import net.humba01.inquiry.itens.Ingots;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class BronzeToolMaterial implements ToolMaterial {

  public static final BronzeToolMaterial INSTANCE = new BronzeToolMaterial();

  @Override
  public float getAttackDamage() {
    // TODO Auto-generated method stub
    return 21.0f;
  }

  @Override
  public int getDurability() {
    // TODO Auto-generated method stub
    return 1500;
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
    return Ingredient.ofItems(Ingots.BRONZE_INGOT);
  }
  
}
