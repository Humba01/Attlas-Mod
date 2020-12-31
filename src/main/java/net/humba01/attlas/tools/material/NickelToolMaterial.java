package net.humba01.attlas.tools.material;

import net.humba01.attlas.itens.Ingots;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class NickelToolMaterial implements ToolMaterial {

  public static final NickelToolMaterial INSTANCE = new NickelToolMaterial();

  @Override
  public float getAttackDamage() {
    // TODO Auto-generated method stub
    return 18.0f;
  }

  @Override
  public int getDurability() {
    // TODO Auto-generated method stub
    return 996;
  }

  @Override
  public int getEnchantability() {
    // TODO Auto-generated method stub
    return 26;
  }

  @Override
  public int getMiningLevel() {
    // TODO Auto-generated method stub
    return 7;
  }

  @Override
  public float getMiningSpeedMultiplier() {
    // TODO Auto-generated method stub
    return 7.0f;
  }

  @Override
  public Ingredient getRepairIngredient() {
    // TODO Auto-generated method stub
    return Ingredient.ofItems(Ingots.NICKEL_INGOT);
  }
  
}
