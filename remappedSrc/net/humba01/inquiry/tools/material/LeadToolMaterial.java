package net.humba01.inquiry.tools.material;

import net.humba01.inquiry.itens.Ingots;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class LeadToolMaterial implements ToolMaterial {

  public static final LeadToolMaterial INSTANCE = new LeadToolMaterial();

  @Override
  public float getAttackDamage() {
    // TODO Auto-generated method stub
    return 18.5f;
  }

  @Override
  public int getDurability() {
    // TODO Auto-generated method stub
    return 1026;
  }

  @Override
  public int getEnchantability() {
    // TODO Auto-generated method stub
    return 20;
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
    return Ingredient.ofItems(Ingots.LEAD_INGOT);
  }
  
}
