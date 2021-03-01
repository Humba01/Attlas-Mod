package net.humba01.inquiry;

import net.humba01.inquiry.blocks.*;
import net.humba01.inquiry.blocks.cromatic.bricks.CromaticBrickStairs;
import net.humba01.inquiry.blocks.cromatic.bricks.CromaticBricks;
import net.humba01.inquiry.blocks.cromatic.cements.CromaticCements;
import net.humba01.inquiry.blocks.cromatic.concretes.CromaticConcretes;
import net.humba01.inquiry.blocks.cromatic.stained_glasses.CromaticStainedGlassPanes;
import net.humba01.inquiry.blocks.cromatic.stained_glasses.CromaticStainedGlasses;
import net.humba01.inquiry.blocks.cromatic.wools.CromaticCarpets;
import net.humba01.inquiry.blocks.cromatic.wools.CromaticWools;
import net.humba01.inquiry.blocks.tables.weaving_table.*;
import net.humba01.inquiry.itens.*;
import net.humba01.inquiry.tools.*;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class InquiryMod implements ModInitializer {

	public static final String MOD_ID = "inquiry";

	/* Abas */
	public static final ItemGroup ORES = FabricItemGroupBuilder.build(new Identifier(InquiryMod.MOD_ID, "ores"), () -> new ItemStack(OresGroup1.STEEL_ORE));
	
	public static final ItemGroup INGOTS = FabricItemGroupBuilder.build(new Identifier(InquiryMod.MOD_ID, "ingots"), () -> new ItemStack(Ingots.STEEL_INGOT));
	
	public static final ItemGroup ORE_BLOCKS = FabricItemGroupBuilder.build(new Identifier(InquiryMod.MOD_ID, "ore_blocks"), () -> new ItemStack(OresBlockGroup1.STEEL_BLOCK));
	
	public static final ItemGroup STICKS = FabricItemGroupBuilder.build(new Identifier(InquiryMod.MOD_ID, "sticks"), () -> new ItemStack(Sticks.STEEL_STICK));
	
	public static final ItemGroup TOOLS = FabricItemGroupBuilder.build(new Identifier(InquiryMod.MOD_ID, "tools"), () -> new ItemStack(Tools.STEEL_SWORD));
	
	public static final ItemGroup CRAFTING_TABLES = FabricItemGroupBuilder.build(new Identifier(InquiryMod.MOD_ID, "crafting_tables"), () -> new ItemStack(WeavingTable.WEAVING_TABLE));
// NOVO
	public static final ItemGroup CROMATIC_BRICK_BLOCKS = FabricItemGroupBuilder.build(new Identifier(InquiryMod.MOD_ID, "cromatic_brick_blocks"), () -> new ItemStack(CromaticBricks.PRIMARY_BLUE_BRICKS));

	public static final ItemGroup CROMATIC_WOOL_BLOCKS = FabricItemGroupBuilder.build(new Identifier(InquiryMod.MOD_ID, "cromatic_wool_blocks"), () -> new ItemStack(CromaticWools.PRIMARY_BLUE_WOOL));

	public static final ItemGroup CROMATIC_CONCRETE_BLOCKS = FabricItemGroupBuilder.build(new Identifier(InquiryMod.MOD_ID, "cromatic_concrete_blocks"), () -> new ItemStack(CromaticConcretes.PRIMARY_BLUE_CONCRETE));

	public static final ItemGroup CROMATIC_CEMENT_BLOCKS = FabricItemGroupBuilder.build(new Identifier(InquiryMod.MOD_ID, "cromatic_cement_blocks"), () -> new ItemStack(CromaticCements.PRIMARY_BLUE_CEMENT));

	public static final ItemGroup CROMATIC_STAINED_GLASS_BLOCKS = FabricItemGroupBuilder.build(new Identifier(InquiryMod.MOD_ID, "cromatic_stained_glass_blocks"), () -> new ItemStack(CromaticStainedGlasses.PRIMARY_BLUE_STAINED_GLASS));

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		System.out.println("Welcome to Inquiry Mod!");

		// Items
		Sticks.registrySticks();
		Ingots.registryIngots();
		Tools.registrySwords();
		Tools.registryAxes();
		Tools.registryPickaxes();
		Tools.registryShovels();
		Tools.registryHoes();
		
		// Blocks
		OresGroup1.registryOresGroup1();
		OresBlockGroup1.registryOresBlockGroup1();
		WeavingTable.registryWeavingTable();

		CromaticBricks.registryPrimaryBricks();
		CromaticBricks.registrySecondaryBricks();
		CromaticBricks.registryTertiaryBricks();
		CromaticBricks.registryNeutralBricks();
		CromaticBricks.registryMixedBricks();

		CromaticBrickStairs.registryPrimaryBrickStairs();
		CromaticBrickStairs.registrySecondaryBrickStairs();
		CromaticBrickStairs.registryTertiaryBrickStairs();
		CromaticBrickStairs.registryNeutralBrickStairs();
		CromaticBrickStairs.registryMixedBrickStairs();

		CromaticWools.registryPrimaryWools();
		CromaticWools.registrySecondaryWools();
		CromaticWools.registryTertiaryWools();
		CromaticWools.registryNeutralWools();
		CromaticWools.registryMixedWools();

		CromaticCarpets.registryPrimaryCarpets();
		CromaticCarpets.registrySecondaryCarpets();
		CromaticCarpets.registryTertiaryCarpets();
		CromaticCarpets.registryNeutralCarpets();
		CromaticCarpets.registryMixedCarpets();

		CromaticConcretes.registryPrimaryConcretes();
		CromaticConcretes.registrySecondaryConcretes();
		CromaticConcretes.registryTertiaryConcretes();
		CromaticConcretes.registryNeutralConcretes();
		CromaticConcretes.registryMixedConcretes();

		CromaticCements.registryPrimaryCements();
		CromaticCements.registrySecondaryCements();
		CromaticCements.registryTertiaryCements();
		CromaticCements.registryNeutralCements();
		CromaticCements.registryMixedCements();

		CromaticStainedGlasses.registryPrimaryStainedGlasses();
		CromaticStainedGlasses.registrySecondaryStainedGlasses();
		CromaticStainedGlasses.registryTertiaryStainedGlasses();
		CromaticStainedGlasses.registryNeutralStainedGlasses();
		CromaticStainedGlasses.registryMixedStainedGlasses();

		CromaticStainedGlassPanes.registryPrimaryStainedGlassPanes();
		CromaticStainedGlassPanes.registrySecondaryStainedGlassPanes();
		CromaticStainedGlassPanes.registryTertiaryStainedGlassPanes();
		CromaticStainedGlassPanes.registryNeutralStainedGlassPanes();
		CromaticStainedGlassPanes.registryMixedStainedGlassPanes();
		
	}
}
