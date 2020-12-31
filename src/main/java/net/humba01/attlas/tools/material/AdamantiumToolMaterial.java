package net.humba01.attlas.tools.material;

import net.humba01.attlas.itens.Ingots;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class AdamantiumToolMaterial implements ToolMaterial {

  public static final AdamantiumToolMaterial INSTANCE = new AdamantiumToolMaterial();

  @Override
  public float getAttackDamage() {
    // TODO Auto-generated method stub
    return 32.0f;
  }

  @Override
  public int getDurability() {
    // TODO Auto-generated method stub
    return 6500;
  }

  @Override
  public int getEnchantability() {
    // TODO Auto-generated method stub
    return 28;
  }

  @Override
  public int getMiningLevel() {
    // TODO Auto-generated method stub
    return 10;
  }

  @Override
  public float getMiningSpeedMultiplier() {
    // TODO Auto-generated method stub
    return 8.0f;
  }

  @Override
  public Ingredient getRepairIngredient() {
    // TODO Auto-generated method stub
    return Ingredient.ofItems(Ingots.ADAMANTIUM_INGOT);
  }
  
}
