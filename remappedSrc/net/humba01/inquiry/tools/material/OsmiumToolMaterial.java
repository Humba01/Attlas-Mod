package net.humba01.inquiry.tools.material;

import net.humba01.inquiry.itens.Ingots;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class OsmiumToolMaterial implements ToolMaterial {

  public static final OsmiumToolMaterial INSTANCE = new OsmiumToolMaterial();

  @Override
  public float getAttackDamage() {
    // TODO Auto-generated method stub
    return 16.5f;
  }

  @Override
  public int getDurability() {
    // TODO Auto-generated method stub
    return 900;
  }

  @Override
  public int getEnchantability() {
    // TODO Auto-generated method stub
    return 32;
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
    return Ingredient.ofItems(Ingots.OSMIUM_INGOT);
  }
  
}
