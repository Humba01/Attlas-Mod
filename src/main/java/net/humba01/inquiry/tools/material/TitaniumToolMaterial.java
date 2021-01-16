package net.humba01.inquiry.tools.material;

import net.humba01.inquiry.itens.Ingots;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class TitaniumToolMaterial implements ToolMaterial {

  public static final TitaniumToolMaterial INSTANCE = new TitaniumToolMaterial();

  @Override
  public float getAttackDamage() {
    // TODO Auto-generated method stub
    return 10.0f;
  }

  @Override
  public int getDurability() {
    // TODO Auto-generated method stub
    return 400;
  }

  @Override
  public int getEnchantability() {
    // TODO Auto-generated method stub
    return 22;
  }

  @Override
  public int getMiningLevel() {
    // TODO Auto-generated method stub
    return 4;
  }

  @Override
  public float getMiningSpeedMultiplier() {
    // TODO Auto-generated method stub
    return 5.0f;
  }

  @Override
  public Ingredient getRepairIngredient() {
    // TODO Auto-generated method stub
    return Ingredient.ofItems(Ingots.TITANIUM_INGOT);
  }
  
}
