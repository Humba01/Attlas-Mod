package net.humba01.inquiry.tools.material;

import net.humba01.inquiry.itens.Ingots;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class ChromeToolMaterial implements ToolMaterial {

  public static final ChromeToolMaterial INSTANCE = new ChromeToolMaterial();

  @Override
  public float getAttackDamage() {
    // TODO Auto-generated method stub
    return 14.0f;
  }

  @Override
  public int getDurability() {
    // TODO Auto-generated method stub
    return 800;
  }

  @Override
  public int getEnchantability() {
    // TODO Auto-generated method stub
    return 28;
  }

  @Override
  public int getMiningLevel() {
    // TODO Auto-generated method stub
    return 6;
  }

  @Override
  public float getMiningSpeedMultiplier() {
    // TODO Auto-generated method stub
    return 6.5f;
  }

  @Override
  public Ingredient getRepairIngredient() {
    // TODO Auto-generated method stub
    return Ingredient.ofItems(Ingots.CHROME_INGOT);
  }
  
}
