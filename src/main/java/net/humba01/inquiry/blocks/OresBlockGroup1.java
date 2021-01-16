package net.humba01.inquiry.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.humba01.inquiry.InquiryMod;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class OresBlockGroup1 {

	/* Ore Blocks Group 1 */
	public static final Block STEEL_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).hardness(15.3f).sounds(BlockSoundGroup.METAL));
	public static final Block TIN_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).hardness(15.3f).sounds(BlockSoundGroup.METAL));
	public static final Block ALUMINUM_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).hardness(15.3f).sounds(BlockSoundGroup.METAL));
	public static final Block TITANIUM_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).hardness(15.3f).sounds(BlockSoundGroup.METAL));
	public static final Block BISMUTH_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).hardness(15.3f).sounds(BlockSoundGroup.METAL));
	public static final Block SILVER_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).hardness(15.3f).sounds(BlockSoundGroup.METAL));
	public static final Block CADMIUM_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).hardness(15.3f).sounds(BlockSoundGroup.METAL));
	public static final Block COOPER_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).hardness(15.3f).sounds(BlockSoundGroup.METAL));
	public static final Block COBALT_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).hardness(15.3f).sounds(BlockSoundGroup.METAL));
	public static final Block CHROME_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).hardness(15.3f).sounds(BlockSoundGroup.METAL));
	public static final Block IRIDIUM_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).hardness(15.3f).sounds(BlockSoundGroup.METAL));
	public static final Block OSMIUM_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).hardness(15.3f).sounds(BlockSoundGroup.METAL));
	public static final Block VIBRANIUM_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).hardness(15.3f).sounds(BlockSoundGroup.METAL));
	public static final Block ADAMANTIUM_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).hardness(15.3f).sounds(BlockSoundGroup.METAL));
	public static final Block NICKEL_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).hardness(15.3f).sounds(BlockSoundGroup.METAL));
	public static final Block LEAD_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).hardness(15.3f).sounds(BlockSoundGroup.METAL));
	public static final Block THALLIUM_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).hardness(15.3f).sounds(BlockSoundGroup.METAL));
	public static final Block INDIAN_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).hardness(15.3f).sounds(BlockSoundGroup.METAL));
	public static final Block BRONZE_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).hardness(15.3f).sounds(BlockSoundGroup.METAL));
	public static final Block BRASS_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).hardness(15.3f).sounds(BlockSoundGroup.METAL));
	public static final Block INVAR_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).hardness(15.3f).sounds(BlockSoundGroup.METAL));
	public static final Block TOMBAC_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).hardness(15.3f).sounds(BlockSoundGroup.METAL));
	public static final Block NICHROME_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).hardness(15.3f).sounds(BlockSoundGroup.METAL));
	public static final Block ELECTRON_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).hardness(15.3f).sounds(BlockSoundGroup.METAL));

  public static void registryOresBlockGroup1() {
    
		Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "steel_block"), STEEL_BLOCK);
		Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "steel_block"), new BlockItem(STEEL_BLOCK, new Item.Settings().group(InquiryMod.ORE_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "tin_block"), TIN_BLOCK);
		Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "tin_block"), new BlockItem(TIN_BLOCK, new Item.Settings().group(InquiryMod.ORE_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "aluminum_block"), ALUMINUM_BLOCK);
		Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "aluminum_block"), new BlockItem(ALUMINUM_BLOCK, new Item.Settings().group(InquiryMod.ORE_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "titanium_block"), TITANIUM_BLOCK);
		Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "titanium_block"), new BlockItem(TITANIUM_BLOCK, new Item.Settings().group(InquiryMod.ORE_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "bismuth_block"), BISMUTH_BLOCK);
		Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "bismuth_block"), new BlockItem(BISMUTH_BLOCK, new Item.Settings().group(InquiryMod.ORE_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "silver_block"), SILVER_BLOCK);
		Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "silver_block"), new BlockItem(SILVER_BLOCK, new Item.Settings().group(InquiryMod.ORE_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "cadmium_block"), CADMIUM_BLOCK);
		Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "cadmium_block"), new BlockItem(CADMIUM_BLOCK, new Item.Settings().group(InquiryMod.ORE_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "cooper_block"), COOPER_BLOCK);
		Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "cooper_block"), new BlockItem(COOPER_BLOCK, new Item.Settings().group(InquiryMod.ORE_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "cobalt_block"), COBALT_BLOCK);
		Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "cobalt_block"), new BlockItem(COBALT_BLOCK, new Item.Settings().group(InquiryMod.ORE_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "chrome_block"), CHROME_BLOCK);
		Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "chrome_block"), new BlockItem(CHROME_BLOCK, new Item.Settings().group(InquiryMod.ORE_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "iridium_block"), IRIDIUM_BLOCK);
		Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "iridium_block"), new BlockItem(IRIDIUM_BLOCK, new Item.Settings().group(InquiryMod.ORE_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "osmium_block"), OSMIUM_BLOCK);
		Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "osmium_block"), new BlockItem(OSMIUM_BLOCK, new Item.Settings().group(InquiryMod.ORE_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "nickel_block"), NICKEL_BLOCK);
		Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "nickel_block"), new BlockItem(NICKEL_BLOCK, new Item.Settings().group(InquiryMod.ORE_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "lead_block"), LEAD_BLOCK);
		Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "lead_block"), new BlockItem(LEAD_BLOCK, new Item.Settings().group(InquiryMod.ORE_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "thallium_block"), THALLIUM_BLOCK);
		Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "thallium_block"), new BlockItem(THALLIUM_BLOCK, new Item.Settings().group(InquiryMod.ORE_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "indian_block"), INDIAN_BLOCK);
		Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "indian_block"), new BlockItem(INDIAN_BLOCK, new Item.Settings().group(InquiryMod.ORE_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "bronze_block"), BRONZE_BLOCK);
		Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "bronze_block"), new BlockItem(BRONZE_BLOCK, new Item.Settings().group(InquiryMod.ORE_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "brass_block"), BRASS_BLOCK);
		Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "brass_block"), new BlockItem(BRASS_BLOCK, new Item.Settings().group(InquiryMod.ORE_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "invar_block"), INVAR_BLOCK);
		Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "invar_block"), new BlockItem(INVAR_BLOCK, new Item.Settings().group(InquiryMod.ORE_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "tombac_block"), TOMBAC_BLOCK);
		Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "tombac_block"), new BlockItem(TOMBAC_BLOCK, new Item.Settings().group(InquiryMod.ORE_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "nichrome_block"), NICHROME_BLOCK);
		Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "nichrome_block"), new BlockItem(NICHROME_BLOCK, new Item.Settings().group(InquiryMod.ORE_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "electron_block"), ELECTRON_BLOCK);
		Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "electron_block"), new BlockItem(ELECTRON_BLOCK, new Item.Settings().group(InquiryMod.ORE_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "vibranium_block"), VIBRANIUM_BLOCK);
		Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "vibranium_block"), new BlockItem(VIBRANIUM_BLOCK, new Item.Settings().group(InquiryMod.ORE_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier(InquiryMod.MOD_ID, "adamantium_block"), ADAMANTIUM_BLOCK);
		Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "adamantium_block"), new BlockItem(ADAMANTIUM_BLOCK, new Item.Settings().group(InquiryMod.ORE_BLOCKS)));

  }
}
