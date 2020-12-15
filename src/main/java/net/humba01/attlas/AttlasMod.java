package net.humba01.attlas;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class AttlasMod implements ModInitializer {
	//Grupos
	public static final ItemGroup ATTLAS_STICKS = FabricItemGroupBuilder.build(new Identifier("attlas", "sticks"), () -> new ItemStack(Items.STICK));
	public static final ItemGroup ATTLAS_ORES = FabricItemGroupBuilder.build(new Identifier("attlas", "ores"), () -> new ItemStack(Blocks.COAL_ORE));


	//Gravetos
	public static final Item STONE_STICK = new Item(new FabricItemSettings().group(AttlasMod.ATTLAS_STICKS).maxCount(80));
	public static final Item IRON_STICK = new Item(new FabricItemSettings().group(AttlasMod.ATTLAS_STICKS).maxCount(80));
	public static final Item GOLD_STICK = new Item(new FabricItemSettings().group(AttlasMod.ATTLAS_STICKS).maxCount(80));
	public static final Item STEEL_STICK = new Item(new FabricItemSettings().group(AttlasMod.ATTLAS_STICKS).maxCount(80));
	public static final Item DIAMOND_STICK = new Item(new FabricItemSettings().group(AttlasMod.ATTLAS_STICKS).maxCount(80));
	public static final Item PLATINUM_STICK = new Item(new FabricItemSettings().group(AttlasMod.ATTLAS_STICKS).maxCount(80));
	public static final Item GRAPHITE_STICK = new Item(new FabricItemSettings().group(AttlasMod.ATTLAS_STICKS).maxCount(80));
	public static final Item TUMARINES_STICK = new Item(new FabricItemSettings().group(AttlasMod.ATTLAS_STICKS).maxCount(80));
	public static final Item GRANADES_STICK = new Item(new FabricItemSettings().group(AttlasMod.ATTLAS_STICKS).maxCount(80));
	public static final Item RUBY_STICK = new Item(new FabricItemSettings().group(AttlasMod.ATTLAS_STICKS).maxCount(80));
	public static final Item SILVER_STICK = new Item(new FabricItemSettings().group(AttlasMod.ATTLAS_STICKS).maxCount(80));
	public static final Item SAPPHIRE_STICK = new Item(new FabricItemSettings().group(AttlasMod.ATTLAS_STICKS).maxCount(80));
	public static final Item AMETHYST_STICK = new Item(new FabricItemSettings().group(AttlasMod.ATTLAS_STICKS).maxCount(80));
	public static final Item IVORY_STICK = new Item(new FabricItemSettings().group(AttlasMod.ATTLAS_STICKS).maxCount(80));
	public static final Item AMBER_STICK = new Item(new FabricItemSettings().group(AttlasMod.ATTLAS_STICKS).maxCount(80));
	public static final Item COOPER_STICK = new Item(new FabricItemSettings().group(AttlasMod.ATTLAS_STICKS).maxCount(80));
	public static final Item LEAD_STICK = new Item(new FabricItemSettings().group(AttlasMod.ATTLAS_STICKS).maxCount(80));
	public static final Item SLATE_STICK = new Item(new FabricItemSettings().group(AttlasMod.ATTLAS_STICKS).maxCount(80));
	public static final Item AGATE_STICK = new Item(new FabricItemSettings().group(AttlasMod.ATTLAS_STICKS).maxCount(80));
	public static final Item MALAGUITA_STICK = new Item(new FabricItemSettings().group(AttlasMod.ATTLAS_STICKS).maxCount(80));
	public static final Item ALABASTER_STICK = new Item(new FabricItemSettings().group(AttlasMod.ATTLAS_STICKS).maxCount(80));
	public static final Item SODALITE_STICK = new Item(new FabricItemSettings().group(AttlasMod.ATTLAS_STICKS).maxCount(80));
	public static final Item CRYSTAL_STICK = new Item(new FabricItemSettings().group(AttlasMod.ATTLAS_STICKS).maxCount(80));

	//Minérios
	public static final Block STEEL_ORE = new Block(FabricBlockSettings.of(Material.STONE).hardness(4.0f).sounds(BlockSoundGroup.STONE));
	public static final Block PLATINUM_ORE = new Block(FabricBlockSettings.of(Material.STONE).hardness(4.0f).sounds(BlockSoundGroup.STONE));
	public static final Block GRAPHITE_ORE = new Block(FabricBlockSettings.of(Material.STONE).hardness(4.0f).sounds(BlockSoundGroup.STONE));
	public static final Block TUMARINES_ORE = new Block(FabricBlockSettings.of(Material.STONE).hardness(4.0f).sounds(BlockSoundGroup.STONE));
	public static final Block GRANADES_ORE = new Block(FabricBlockSettings.of(Material.STONE).hardness(4.0f).sounds(BlockSoundGroup.STONE));
	public static final Block RUBY_ORE = new Block(FabricBlockSettings.of(Material.STONE).hardness(4.0f).sounds(BlockSoundGroup.STONE));
	public static final Block SILVER_ORE = new Block(FabricBlockSettings.of(Material.STONE).hardness(4.0f).sounds(BlockSoundGroup.STONE));
	public static final Block SAPPHIRE_ORE = new Block(FabricBlockSettings.of(Material.STONE).hardness(4.0f).sounds(BlockSoundGroup.STONE));
	public static final Block AMETHYST_ORE = new Block(FabricBlockSettings.of(Material.STONE).hardness(4.0f).sounds(BlockSoundGroup.STONE));
	public static final Block IVORY_ORE = new Block(FabricBlockSettings.of(Material.STONE).hardness(4.0f).sounds(BlockSoundGroup.STONE));
	public static final Block AMBER_ORE = new Block(FabricBlockSettings.of(Material.STONE).hardness(4.0f).sounds(BlockSoundGroup.STONE));
	public static final Block COOPER_ORE = new Block(FabricBlockSettings.of(Material.STONE).hardness(4.0f).sounds(BlockSoundGroup.STONE));
	public static final Block LEAD_ORE = new Block(FabricBlockSettings.of(Material.STONE).hardness(4.0f).sounds(BlockSoundGroup.STONE));
	public static final Block SLATE_ORE = new Block(FabricBlockSettings.of(Material.STONE).hardness(4.0f).sounds(BlockSoundGroup.STONE));
	public static final Block AGATE_ORE = new Block(FabricBlockSettings.of(Material.STONE).hardness(4.0f).sounds(BlockSoundGroup.STONE));
	public static final Block MALAGUITA_ORE = new Block(FabricBlockSettings.of(Material.STONE).hardness(4.0f).sounds(BlockSoundGroup.STONE));
	public static final Block ALABASTER_ORE = new Block(FabricBlockSettings.of(Material.STONE).hardness(4.0f).sounds(BlockSoundGroup.STONE));
	public static final Block SODALITE_ORE = new Block(FabricBlockSettings.of(Material.STONE).hardness(4.0f).sounds(BlockSoundGroup.STONE));
	public static final Block CRYSTAL_ORE = new Block(FabricBlockSettings.of(Material.STONE).hardness(4.0f).sounds(BlockSoundGroup.STONE));

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		System.out.println("Hello Fabric world!");

		/* Gravetos */
		Registry.register(Registry.ITEM, new Identifier("attlas", "stone_stick"), STONE_STICK);
		Registry.register(Registry.ITEM, new Identifier("attlas", "iron_stick"), IRON_STICK);
		Registry.register(Registry.ITEM, new Identifier("attlas", "gold_stick"), GOLD_STICK);
		Registry.register(Registry.ITEM, new Identifier("attlas", "steel_stick"), STEEL_STICK);
		Registry.register(Registry.ITEM, new Identifier("attlas", "diamond_stick"), DIAMOND_STICK);
		Registry.register(Registry.ITEM, new Identifier("attlas", "platinum_stick"), PLATINUM_STICK);
		Registry.register(Registry.ITEM, new Identifier("attlas", "graphite_stick"), GRAPHITE_STICK);
		Registry.register(Registry.ITEM, new Identifier("attlas", "tumarines_stick"), TUMARINES_STICK);
		Registry.register(Registry.ITEM, new Identifier("attlas", "granades_stick"), GRANADES_STICK);
		Registry.register(Registry.ITEM, new Identifier("attlas", "ruby_stick"), RUBY_STICK);
		Registry.register(Registry.ITEM, new Identifier("attlas", "silver_stick"), SILVER_STICK);
		Registry.register(Registry.ITEM, new Identifier("attlas", "sapphire_stick"), SAPPHIRE_STICK);
		Registry.register(Registry.ITEM, new Identifier("attlas", "amethyst_stick"), AMETHYST_STICK);
		Registry.register(Registry.ITEM, new Identifier("attlas", "ivory_stick"), IVORY_STICK);
		Registry.register(Registry.ITEM, new Identifier("attlas", "amber_stick"), AMBER_STICK);
		Registry.register(Registry.ITEM, new Identifier("attlas", "cooper_stick"), COOPER_STICK);
		Registry.register(Registry.ITEM, new Identifier("attlas", "lead_stick"), LEAD_STICK);
		Registry.register(Registry.ITEM, new Identifier("attlas", "slate_stick"), SLATE_STICK);
		Registry.register(Registry.ITEM, new Identifier("attlas", "agate_stick"), AGATE_STICK);
		Registry.register(Registry.ITEM, new Identifier("attlas", "malaguita_stick"), MALAGUITA_STICK);
		Registry.register(Registry.ITEM, new Identifier("attlas", "alabaster_stick"), ALABASTER_STICK);
		Registry.register(Registry.ITEM, new Identifier("attlas", "sodalite_stick"), SODALITE_STICK);
		Registry.register(Registry.ITEM, new Identifier("attlas", "crystal_stick"), CRYSTAL_STICK);

		/* Minérios */
		Registry.register(Registry.BLOCK, new Identifier("attlas", "steel_ore"), STEEL_ORE);
		Registry.register(Registry.BLOCK, new Identifier("attlas", "platinum_ore"), PLATINUM_ORE);
		Registry.register(Registry.BLOCK, new Identifier("attlas", "graphite_ore"), GRAPHITE_ORE);
		Registry.register(Registry.BLOCK, new Identifier("attlas", "tumarines_ore"), TUMARINES_ORE);
		Registry.register(Registry.BLOCK, new Identifier("attlas", "granades_ore"), GRANADES_ORE);
		Registry.register(Registry.BLOCK, new Identifier("attlas", "ruby_ore"), RUBY_ORE);
		Registry.register(Registry.BLOCK, new Identifier("attlas", "silver_ore"), SILVER_ORE);
		Registry.register(Registry.BLOCK, new Identifier("attlas", "sapphire_ore"), SAPPHIRE_ORE);
		Registry.register(Registry.BLOCK, new Identifier("attlas", "amethyst_ore"), AMETHYST_ORE);
		Registry.register(Registry.BLOCK, new Identifier("attlas", "ivory_ore"), IVORY_ORE);
		Registry.register(Registry.BLOCK, new Identifier("attlas", "amber_ore"), AMBER_ORE);
		Registry.register(Registry.BLOCK, new Identifier("attlas", "cooper_ore"), COOPER_ORE);
		Registry.register(Registry.BLOCK, new Identifier("attlas", "lead_ore"), LEAD_ORE);
		Registry.register(Registry.BLOCK, new Identifier("attlas", "slate_ore"), SLATE_ORE);
		Registry.register(Registry.BLOCK, new Identifier("attlas", "agate_ore"), AGATE_ORE);
		Registry.register(Registry.BLOCK, new Identifier("attlas", "malaguita_ore"), MALAGUITA_ORE);
		Registry.register(Registry.BLOCK, new Identifier("attlas", "alabaster_ore"), ALABASTER_ORE);
		Registry.register(Registry.BLOCK, new Identifier("attlas", "sodalite_ore"), SODALITE_ORE);
		Registry.register(Registry.BLOCK, new Identifier("attlas", "crystal_ore"), CRYSTAL_ORE);
	}
}
