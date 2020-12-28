package net.humba01.attlas.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.humba01.attlas.AttlasMod;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class OresGroup1 {

  	
	/* Ores Group 1 */
	public static final Block STEEL_ORE = new Block(FabricBlockSettings.of(Material.STONE).hardness(10.1f).breakByTool(FabricToolTags.PICKAXES, 1).breakByHand(false).resistance(2.0f).requiresTool());
	public static final Block TIN_ORE = new Block(FabricBlockSettings.of(Material.STONE).hardness(10.1f).breakByTool(FabricToolTags.PICKAXES, 1).breakByHand(false).resistance(2.0f).requiresTool());
	public static final Block ALUMINUM_ORE = new Block(FabricBlockSettings.of(Material.STONE).hardness(10.1f).breakByTool(FabricToolTags.PICKAXES, 1).breakByHand(false).resistance(2.0f).requiresTool());
	public static final Block TITANIUM_ORE = new Block(FabricBlockSettings.of(Material.STONE).hardness(10.1f).breakByTool(FabricToolTags.PICKAXES, 1).breakByHand(false).resistance(2.0f).requiresTool());
	public static final Block BISMUTH_ORE = new Block(FabricBlockSettings.of(Material.STONE).hardness(10.1f).breakByTool(FabricToolTags.PICKAXES, 1).breakByHand(false).resistance(2.0f).requiresTool());
	public static final Block SILVER_ORE = new Block(FabricBlockSettings.of(Material.STONE).hardness(10.1f).breakByTool(FabricToolTags.PICKAXES, 1).breakByHand(false).resistance(2.0f).requiresTool());
	public static final Block CADMIUM_ORE = new Block(FabricBlockSettings.of(Material.STONE).hardness(10.1f).breakByTool(FabricToolTags.PICKAXES, 1).breakByHand(false).resistance(2.0f).requiresTool());
	public static final Block COOPER_ORE = new Block(FabricBlockSettings.of(Material.STONE).hardness(10.1f).breakByTool(FabricToolTags.PICKAXES, 1).breakByHand(false).resistance(2.0f).requiresTool());
	public static final Block COBALT_ORE = new Block(FabricBlockSettings.of(Material.STONE).hardness(10.1f).breakByTool(FabricToolTags.PICKAXES, 1).breakByHand(false).resistance(2.0f).requiresTool());
	public static final Block CHROME_ORE = new Block(FabricBlockSettings.of(Material.STONE).hardness(10.1f).breakByTool(FabricToolTags.PICKAXES, 1).breakByHand(false).resistance(2.0f).requiresTool());
	public static final Block IRIDIUM_ORE = new Block(FabricBlockSettings.of(Material.STONE).hardness(10.1f).breakByTool(FabricToolTags.PICKAXES, 1).breakByHand(false).resistance(2.0f).requiresTool());
	public static final Block OSMIUM_ORE = new Block(FabricBlockSettings.of(Material.STONE).hardness(10.1f).breakByTool(FabricToolTags.PICKAXES, 1).breakByHand(false).resistance(2.0f).requiresTool());
	public static final Block VIBRANIUM_ORE = new Block(FabricBlockSettings.of(Material.STONE).hardness(10.1f).breakByTool(FabricToolTags.PICKAXES, 1).breakByHand(false).resistance(2.0f).requiresTool());
	public static final Block ADAMANTIUM_ORE = new Block(FabricBlockSettings.of(Material.STONE).hardness(10.1f).breakByTool(FabricToolTags.PICKAXES, 1).breakByHand(false).resistance(2.0f).requiresTool());
	public static final Block NICKEL_ORE = new Block(FabricBlockSettings.of(Material.STONE).hardness(10.1f).breakByTool(FabricToolTags.PICKAXES, 1).breakByHand(false).resistance(2.0f).requiresTool());
	public static final Block LEAD_ORE = new Block(FabricBlockSettings.of(Material.STONE).hardness(10.1f).breakByTool(FabricToolTags.PICKAXES, 1).breakByHand(false).resistance(2.0f).requiresTool());
	public static final Block THALLIUM_ORE = new Block(FabricBlockSettings.of(Material.STONE).hardness(10.1f).breakByTool(FabricToolTags.PICKAXES, 1).breakByHand(false).resistance(2.0f).requiresTool());
	public static final Block INDIAN_ORE = new Block(FabricBlockSettings.of(Material.STONE).hardness(10.1f).breakByTool(FabricToolTags.PICKAXES, 1).breakByHand(false).resistance(2.0f).requiresTool());
	public static final Block BRONZE_ORE = new Block(FabricBlockSettings.of(Material.STONE).hardness(10.1f).breakByTool(FabricToolTags.PICKAXES, 1).breakByHand(false).resistance(2.0f).requiresTool());
	public static final Block BRASS_ORE = new Block(FabricBlockSettings.of(Material.STONE).hardness(10.1f).breakByTool(FabricToolTags.PICKAXES, 1).breakByHand(false).resistance(2.0f).requiresTool());
	public static final Block INVAR_ORE = new Block(FabricBlockSettings.of(Material.STONE).hardness(10.1f).breakByTool(FabricToolTags.PICKAXES, 1).breakByHand(false).resistance(2.0f).requiresTool());
	public static final Block TOMBAC_ORE = new Block(FabricBlockSettings.of(Material.STONE).hardness(10.1f).breakByTool(FabricToolTags.PICKAXES, 1).breakByHand(false).resistance(2.0f).requiresTool());
	public static final Block NICHROME_ORE = new Block(FabricBlockSettings.of(Material.STONE).hardness(10.1f).breakByTool(FabricToolTags.PICKAXES, 1).breakByHand(false).resistance(2.0f).requiresTool());
	public static final Block ELECTRON_ORE = new Block(FabricBlockSettings.of(Material.STONE).hardness(10.1f).breakByTool(FabricToolTags.PICKAXES, 1).breakByHand(false).resistance(2.0f).requiresTool());

  public static void registryOresGroup1() {
    
		Registry.register(Registry.BLOCK, new Identifier(AttlasMod.MOD_ID, "steel_ore"), STEEL_ORE);
		Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "steel_ore"), new BlockItem(STEEL_ORE, new Item.Settings().group(AttlasMod.ORES)));
		Registry.register(Registry.BLOCK, new Identifier(AttlasMod.MOD_ID, "tin_ore"), TIN_ORE);
		Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "tin_ore"), new BlockItem(TIN_ORE, new Item.Settings().group(AttlasMod.ORES)));
		Registry.register(Registry.BLOCK, new Identifier(AttlasMod.MOD_ID, "aluminum_ore"), ALUMINUM_ORE);
		Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "aluminum_ore"), new BlockItem(ALUMINUM_ORE, new Item.Settings().group(AttlasMod.ORES)));
		Registry.register(Registry.BLOCK, new Identifier(AttlasMod.MOD_ID, "titanium_ore"), TITANIUM_ORE);
		Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "titanium_ore"), new BlockItem(TITANIUM_ORE, new Item.Settings().group(AttlasMod.ORES)));
		Registry.register(Registry.BLOCK, new Identifier(AttlasMod.MOD_ID, "bismuth_ore"), BISMUTH_ORE);
		Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "bismuth_ore"), new BlockItem(BISMUTH_ORE, new Item.Settings().group(AttlasMod.ORES)));
		Registry.register(Registry.BLOCK, new Identifier(AttlasMod.MOD_ID, "silver_ore"), SILVER_ORE);
		Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "silver_ore"), new BlockItem(SILVER_ORE, new Item.Settings().group(AttlasMod.ORES)));
		Registry.register(Registry.BLOCK, new Identifier(AttlasMod.MOD_ID, "cadmium_ore"), CADMIUM_ORE);
		Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "cadmium_ore"), new BlockItem(CADMIUM_ORE, new Item.Settings().group(AttlasMod.ORES)));
		Registry.register(Registry.BLOCK, new Identifier(AttlasMod.MOD_ID, "cooper_ore"), COOPER_ORE);
		Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "cooper_ore"), new BlockItem(COOPER_ORE, new Item.Settings().group(AttlasMod.ORES)));
		Registry.register(Registry.BLOCK, new Identifier(AttlasMod.MOD_ID, "cobalt_ore"), COBALT_ORE);
		Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "cobalt_ore"), new BlockItem(COBALT_ORE, new Item.Settings().group(AttlasMod.ORES)));
		Registry.register(Registry.BLOCK, new Identifier(AttlasMod.MOD_ID, "chrome_ore"), CHROME_ORE);
		Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "chrome_ore"), new BlockItem(CHROME_ORE, new Item.Settings().group(AttlasMod.ORES)));
		Registry.register(Registry.BLOCK, new Identifier(AttlasMod.MOD_ID, "iridium_ore"), IRIDIUM_ORE);
		Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "iridium_ore"), new BlockItem(IRIDIUM_ORE, new Item.Settings().group(AttlasMod.ORES)));
		Registry.register(Registry.BLOCK, new Identifier(AttlasMod.MOD_ID, "osmium_ore"), OSMIUM_ORE);
		Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "osmium_ore"), new BlockItem(OSMIUM_ORE, new Item.Settings().group(AttlasMod.ORES)));
		Registry.register(Registry.BLOCK, new Identifier(AttlasMod.MOD_ID, "nickel_ore"), NICKEL_ORE);
		Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "nickel_ore"), new BlockItem(NICKEL_ORE, new Item.Settings().group(AttlasMod.ORES)));
		Registry.register(Registry.BLOCK, new Identifier(AttlasMod.MOD_ID, "lead_ore"), LEAD_ORE);
		Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "lead_ore"), new BlockItem(LEAD_ORE, new Item.Settings().group(AttlasMod.ORES)));
		Registry.register(Registry.BLOCK, new Identifier(AttlasMod.MOD_ID, "thallium_ore"), THALLIUM_ORE);
		Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "thallium_ore"), new BlockItem(THALLIUM_ORE, new Item.Settings().group(AttlasMod.ORES)));
		Registry.register(Registry.BLOCK, new Identifier(AttlasMod.MOD_ID, "indian_ore"), INDIAN_ORE);
		Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "indian_ore"), new BlockItem(INDIAN_ORE, new Item.Settings().group(AttlasMod.ORES)));
		Registry.register(Registry.BLOCK, new Identifier(AttlasMod.MOD_ID, "bronze_ore"), BRONZE_ORE);
		Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "bronze_ore"), new BlockItem(BRONZE_ORE, new Item.Settings().group(AttlasMod.ORES)));
		Registry.register(Registry.BLOCK, new Identifier(AttlasMod.MOD_ID, "brass_ore"), BRASS_ORE);
		Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "brass_ore"), new BlockItem(BRASS_ORE, new Item.Settings().group(AttlasMod.ORES)));
		Registry.register(Registry.BLOCK, new Identifier(AttlasMod.MOD_ID, "invar_ore"), INVAR_ORE);
		Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "invar_ore"), new BlockItem(INVAR_ORE, new Item.Settings().group(AttlasMod.ORES)));
		Registry.register(Registry.BLOCK, new Identifier(AttlasMod.MOD_ID, "tombac_ore"), TOMBAC_ORE);
		Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "tombac_ore"), new BlockItem(TOMBAC_ORE, new Item.Settings().group(AttlasMod.ORES)));
		Registry.register(Registry.BLOCK, new Identifier(AttlasMod.MOD_ID, "nichrome_ore"), NICHROME_ORE);
		Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "nichrome_ore"), new BlockItem(NICHROME_ORE, new Item.Settings().group(AttlasMod.ORES)));
		Registry.register(Registry.BLOCK, new Identifier(AttlasMod.MOD_ID, "electron_ore"), ELECTRON_ORE);
		Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "electron_ore"), new BlockItem(ELECTRON_ORE, new Item.Settings().group(AttlasMod.ORES)));
		Registry.register(Registry.BLOCK, new Identifier(AttlasMod.MOD_ID, "vibranium_ore"), VIBRANIUM_ORE);
		Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "vibranium_ore"), new BlockItem(VIBRANIUM_ORE, new Item.Settings().group(AttlasMod.ORES)));
		Registry.register(Registry.BLOCK, new Identifier(AttlasMod.MOD_ID, "adamantium_ore"), ADAMANTIUM_ORE);
		Registry.register(Registry.ITEM, new Identifier(AttlasMod.MOD_ID, "adamantium_ore"), new BlockItem(ADAMANTIUM_ORE, new Item.Settings().group(AttlasMod.ORES)));
  }
  
}
