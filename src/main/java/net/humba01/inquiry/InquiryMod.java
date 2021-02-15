package net.humba01.inquiry;

import net.humba01.inquiry.blocks.*;
import net.humba01.inquiry.blocks.weaving_table.*;
import net.humba01.inquiry.itens.*;
import net.humba01.inquiry.tools.*;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class InquiryMod implements ModInitializer {

	public static final String MOD_ID = "inquiry";

	/* Abas */
	public static final ItemGroup CRAFTING_TABLES = FabricItemGroupBuilder.build(new Identifier(InquiryMod.MOD_ID, "crafting_tables"), () -> new ItemStack(Blocks.CRAFTING_TABLE));
	
	public static final ItemGroup ORES = FabricItemGroupBuilder.build(new Identifier(InquiryMod.MOD_ID, "ores"), () -> new ItemStack(OresGroup1.STEEL_ORE));
	
	public static final ItemGroup INGOTS = FabricItemGroupBuilder.build(new Identifier(InquiryMod.MOD_ID, "ingots"), () -> new ItemStack(Ingots.STEEL_INGOT));
	
	public static final ItemGroup ORE_BLOCKS = FabricItemGroupBuilder.build(new Identifier(InquiryMod.MOD_ID, "ore_blocks"), () -> new ItemStack(OresBlockGroup1.STEEL_BLOCK));

	public static final ItemGroup STICKS = FabricItemGroupBuilder.build(new Identifier(InquiryMod.MOD_ID, "sticks"), () -> new ItemStack(Sticks.STEEL_STICK));

	public static final ItemGroup TOOLS = FabricItemGroupBuilder.build(new Identifier(InquiryMod.MOD_ID, "tools"), () -> new ItemStack(Tools.STEEL_SWORD));

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		System.out.println("Welcome to Inquiry Mod!");

		Sticks.registrySticks();
		Ingots.registryIngots();
		Tools.registrySwords();
		Tools.registryAxes();
		Tools.registryPickaxes();
		Tools.registryShovels();
		Tools.registryHoes();
		
		OresGroup1.registryOresGroup1();
		OresBlockGroup1.registryOresBlockGroup1();
		WeavingTable.registryWeavingTable();
	}
}
