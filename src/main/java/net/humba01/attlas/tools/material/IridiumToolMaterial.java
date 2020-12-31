package net.humba01.attlas.tools.material;

import net.humba01.attlas.itens.Ingots;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class IridiumToolMaterial implements ToolMaterial {

  public static final IridiumToolMaterial INSTANCE = new IridiumToolMaterial();

  @Override
  public float getAttackDamage() {
    // TODO Auto-generated method stub
    return 16.0f;
  }

  @Override
  public int getDurability() {
    // TODO Auto-generated method stub
    return 840;
  }

  @Override
  public int getEnchantability() {
    // TODO Auto-generated method stub
    return 30;
  }

  @Override
  public int getMiningLevel() {
    // TODO Auto-generated method stub
    return 7;
  }

  @Override
  public float getMiningSpeedMultiplier() {
    // TODO Auto-generated method stub
    return 6.5f;
  }

  @Override
  public Ingredient getRepairIngredient() {
    // TODO Auto-generated method stub
    return Ingredient.ofItems(Ingots.IRIDIUM_INGOT);
  }
  
}
