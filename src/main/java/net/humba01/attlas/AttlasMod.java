package net.humba01.attlas;

import net.humba01.attlas.blocks.*;
import net.humba01.attlas.itens.*;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

public class AttlasMod implements ModInitializer {

	public static final String MOD_ID = "attlas";

	/* Abas */
	public static final ItemGroup WOOLS = FabricItemGroupBuilder.build(new Identifier(AttlasMod.MOD_ID, "wools"), () -> new ItemStack(Wools.ALBA_PORCELAIN_WOOL));

	public static final ItemGroup EXTENDED_CRAFTING_TABLES = FabricItemGroupBuilder.build(new Identifier(AttlasMod.MOD_ID, "crafting_tables"), () -> new ItemStack(Blocks.CRAFTING_TABLE));
	
	public static final ItemGroup ORES = FabricItemGroupBuilder.build(new Identifier(AttlasMod.MOD_ID, "ores"), () -> new ItemStack(OresGroup1.STEEL_ORE));
	
	public static final ItemGroup INGOTS = FabricItemGroupBuilder.build(new Identifier(AttlasMod.MOD_ID, "ingots"), () -> new ItemStack(Ingots.STEEL_INGOT));
	
	public static final ItemGroup ORE_BLOCKS = FabricItemGroupBuilder.build(new Identifier(AttlasMod.MOD_ID, "ore_blocks"), () -> new ItemStack(OresBlockGroup1.STEEL_BLOCK));

	public static final ItemGroup STICKS = FabricItemGroupBuilder.build(new Identifier(AttlasMod.MOD_ID, "sticks"), () -> new ItemStack(Sticks.STEEL_STICK));

	public static final ItemGroup SWORDS = FabricItemGroupBuilder.build(new Identifier(AttlasMod.MOD_ID, "swords"), () -> new ItemStack(Items.IRON_SWORD));

	public static final ItemGroup AXES = FabricItemGroupBuilder.build(new Identifier(AttlasMod.MOD_ID, "axes"), () -> new ItemStack(Items.IRON_AXE));

	public static final ItemGroup PICKAXES = FabricItemGroupBuilder.build(new Identifier(AttlasMod.MOD_ID, "pickaxes"), () -> new ItemStack(Items.IRON_PICKAXE)); 

	public static final ItemGroup SHOVELS = FabricItemGroupBuilder.build(new Identifier(AttlasMod.MOD_ID, "shovels"), () -> new ItemStack(Items.IRON_SHOVEL)); 

	public static final ItemGroup HOES = FabricItemGroupBuilder.build(new Identifier(AttlasMod.MOD_ID, "hoes"), () -> new ItemStack(Items.IRON_HOE)); 
	
	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		System.out.println("Welcome to Attlas Mod!");

		Sticks.registrySticks();
		Ingots.registryIngots();
		CraftingTables.registryCraftingTables();
		OresGroup1.registryOresGroup1();
		OresBlockGroup1.registryOresBlockGroup1();
		Wools.registryWools();

	}
}
