package net.humba01.attlas.tools.tags;

import net.fabricmc.fabric.api.tag.TagRegistry;
import net.minecraft.item.Item;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;

public class AttlasToolTags {
  /* Tags */
  public static final Tag<Item> TOOLS_GROUP1 = register("tools_group1");
  public static final Tag<Item> TOOLS_GROUP2 = register("tools_group2");
  public static final Tag<Item> TOOLS_GROUP3 = register("tools_group3");
  public static final Tag<Item> TOOLS_GROUP4 = register("tools_group4");

  private AttlasToolTags() { }
  
	private static Tag<Item> register(String id) {
		return TagRegistry.item(new Identifier("fabric", id));
	}
  
}
