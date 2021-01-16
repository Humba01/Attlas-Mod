package net.humba01.inquiry.tools.material;

import net.humba01.inquiry.itens.Ingots;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class CadmiumToolMaterial implements ToolMaterial {

  public static final CadmiumToolMaterial INSTANCE = new CadmiumToolMaterial();

  @Override
  public float getAttackDamage() {
    // TODO Auto-generated method stub
    return 12.0f;
  }

  @Override
  public int getDurability() {
    // TODO Auto-generated method stub
    return 450;
  }

  @Override
  public int getEnchantability() {
    // TODO Auto-generated method stub
    return 30;
  }

  @Override
  public int getMiningLevel() {
    // TODO Auto-generated method stub
    return 5;
  }

  @Override
  public float getMiningSpeedMultiplier() {
    // TODO Auto-generated method stub
    return 6.0f;
  }

  @Override
  public Ingredient getRepairIngredient() {
    // TODO Auto-generated method stub
    return Ingredient.ofItems(Ingots.CADMIUM_INGOT);
  }
  
}
