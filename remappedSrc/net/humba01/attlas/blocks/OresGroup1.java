package net.humba01.attlas.blocks;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.humba01.attlas.AttlasMod;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

public class OresGroup1 {
  	
	/* Ores Group 1 */
	public static final Block STEEL_ORE = new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 1).requiresTool().hardness(10.1f));
	public static final Block TIN_ORE = new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 1).requiresTool().hardness(10.1f));
	public static final Block ALUMINUM_ORE = new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 1).requiresTool().hardness(10.1f));
	public static final Block TITANIUM_ORE = new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 1).requiresTool().hardness(10.1f));
	public static final Block BISMUTH_ORE = new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 1).requiresTool().hardness(10.1f));
	public static final Block SILVER_ORE = new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 1).requiresTool().hardness(10.1f));
	public static final Block CADMIUM_ORE = new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 1).requiresTool().hardness(10.1f));
	public static final Block COOPER_ORE = new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 1).requiresTool().hardness(10.1f));
	public static final Block COBALT_ORE = new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 1).requiresTool().hardness(10.1f));
	public static final Block CHROME_ORE = new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 1).requiresTool().hardness(10.1f));
	public static final Block IRIDIUM_ORE = new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 1).requiresTool().hardness(10.1f));
	public static final Block OSMIUM_ORE = new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 1).requiresTool().hardness(10.1f));
	public static final Block VIBRANIUM_ORE = new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 1).requiresTool().hardness(10.1f));
	public static final Block ADAMANTIUM_ORE = new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 1).requiresTool().hardness(10.1f));
	public static final Block NICKEL_ORE = new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 1).requiresTool().hardness(10.1f));
	public static final Block LEAD_ORE = new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 1).requiresTool().hardness(10.1f));
	public static final Block THALLIUM_ORE = new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 1).requiresTool().hardness(10.1f));
	public static final Block INDIAN_ORE = new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 1).requiresTool().hardness(10.1f));
	public static final Block BRONZE_ORE = new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 1).requiresTool().hardness(10.1f));
	public static final Block BRASS_ORE = new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 1).requiresTool().hardness(10.1f));
	public static final Block INVAR_ORE = new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 1).requiresTool().hardness(10.1f));
	public static final Block TOMBAC_ORE = new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 1).requiresTool().hardness(10.1f));
	public static final Block NICHROME_ORE = new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 1).requiresTool().hardness(10.1f));
	public static final Block ELECTRON_ORE = new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 1).requiresTool().hardness(10.1f));

	//Ore Generation
	private static ConfiguredFeature<?, ?> STEEL_ORE_OVERWORLD = Feature.ORE
			.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, OresGroup1.STEEL_ORE.getDefaultState(), 4)) // vein // size 
			.decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 30, 64))).spreadHorizontally().repeat(8);
	private static ConfiguredFeature<?, ?> TIN_ORE_OVERWORLD = Feature.ORE
			.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, OresGroup1.TIN_ORE.getDefaultState(), 4)) // vein // size 
			.decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 5, 64))).spreadHorizontally().repeat(8);
	private static ConfiguredFeature<?, ?> ALUMINUM_ORE_OVERWORLD = Feature.ORE
			.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, OresGroup1.ALUMINUM_ORE.getDefaultState(), 4)) // vein // size 
			.decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 40))).spreadHorizontally().repeat(8);
	private static ConfiguredFeature<?, ?> TITANIUM_ORE_OVERWORLD = Feature.ORE
			.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, OresGroup1.TITANIUM_ORE.getDefaultState(), 4)) // vein // size 
			.decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 30))).spreadHorizontally().repeat(8);
	private static ConfiguredFeature<?, ?> BISMUTH_ORE_OVERWORLD = Feature.ORE
			.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, OresGroup1.BISMUTH_ORE.getDefaultState(), 4)) // vein // size 
			.decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 8))).spreadHorizontally().repeat(8);
	private static ConfiguredFeature<?, ?> SILVER_ORE_OVERWORLD = Feature.ORE
			.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, OresGroup1.SILVER_ORE.getDefaultState(), 4)) // vein // size 
			.decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 8))).spreadHorizontally().repeat(8);
	private static ConfiguredFeature<?, ?> CADMIUM_ORE_OVERWORLD = Feature.ORE
			.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, OresGroup1.CADMIUM_ORE.getDefaultState(), 4)) // vein // size 
			.decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 50, 90))).spreadHorizontally().repeat(8);
	private static ConfiguredFeature<?, ?> COOPER_ORE_OVERWORLD = Feature.ORE
			.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, OresGroup1.COOPER_ORE.getDefaultState(), 4)) // vein // size 
			.decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 30, 90))).spreadHorizontally().repeat(8);
	private static ConfiguredFeature<?, ?> COBALT_ORE_OVERWORLD = Feature.ORE
			.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, OresGroup1.COBALT_ORE.getDefaultState(), 4)) // vein // size 
			.decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 10, 20))).spreadHorizontally().repeat(8);
	private static ConfiguredFeature<?, ?> CHROME_ORE_OVERWORLD = Feature.ORE
			.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, OresGroup1.CHROME_ORE.getDefaultState(), 4)) // vein // size 
			.decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 2, 14))).spreadHorizontally().repeat(8);
	private static ConfiguredFeature<?, ?> IRIDIUM_ORE_OVERWORLD = Feature.ORE
			.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, OresGroup1.IRIDIUM_ORE.getDefaultState(), 4)) // vein // size 
			.decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 64))).spreadHorizontally().repeat(8);
	private static ConfiguredFeature<?, ?> OSMIUM_ORE_OVERWORLD = Feature.ORE
			.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, OresGroup1.OSMIUM_ORE.getDefaultState(), 4)) // vein // size 
			.decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 13))).spreadHorizontally().repeat(8);
	private static ConfiguredFeature<?, ?> VIBRANIUM_ORE_OVERWORLD = Feature.ORE
			.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, OresGroup1.VIBRANIUM_ORE.getDefaultState(), 3)) // vein // size 
			.decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 9))).spreadHorizontally().repeat(3);
	private static ConfiguredFeature<?, ?> ADAMANTIUM_ORE_OVERWORLD = Feature.ORE
			.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, OresGroup1.ADAMANTIUM_ORE.getDefaultState(), 2)) // vein // size 
			.decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 2, 88))).spreadHorizontally().repeat(1);
	private static ConfiguredFeature<?, ?> NICKEL_ORE_OVERWORLD = Feature.ORE
			.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, OresGroup1.NICKEL_ORE.getDefaultState(), 4)) // vein // size 
			.decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 64))).spreadHorizontally().repeat(8);
	private static ConfiguredFeature<?, ?> LEAD_ORE_OVERWORLD = Feature.ORE
			.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, OresGroup1.LEAD_ORE.getDefaultState(), 4)) // vein // size 
			.decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 64))).spreadHorizontally().repeat(8);
	private static ConfiguredFeature<?, ?> THALLIUM_ORE_OVERWORLD = Feature.ORE
			.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, OresGroup1.THALLIUM_ORE.getDefaultState(), 4)) // vein // size 
			.decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 64))).spreadHorizontally().repeat(8);
	private static ConfiguredFeature<?, ?> INDIAN_ORE_OVERWORLD = Feature.ORE
			.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, OresGroup1.INDIAN_ORE.getDefaultState(), 4)) // vein // size 
			.decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 64))).spreadHorizontally().repeat(8);
	private static ConfiguredFeature<?, ?> BRONZE_ORE_OVERWORLD = Feature.ORE
			.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, OresGroup1.BRONZE_ORE.getDefaultState(), 4)) // vein // size 
			.decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 64))).spreadHorizontally().repeat(8);
	private static ConfiguredFeature<?, ?> BRASS_ORE_OVERWORLD = Feature.ORE
			.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, OresGroup1.BRASS_ORE.getDefaultState(), 4)) // vein // size 
			.decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 64))).spreadHorizontally().repeat(8);
	private static ConfiguredFeature<?, ?> INVAR_ORE_OVERWORLD = Feature.ORE
			.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, OresGroup1.INVAR_ORE.getDefaultState(), 4)) // vein // size 
			.decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 64))).spreadHorizontally().repeat(8);
	private static ConfiguredFeature<?, ?> TOMBAC_ORE_OVERWORLD = Feature.ORE
			.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, OresGroup1.TOMBAC_ORE.getDefaultState(), 4)) // vein // size 
			.decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 64))).spreadHorizontally().repeat(8);
	private static ConfiguredFeature<?, ?> NICHROME_ORE_OVERWORLD = Feature.ORE
			.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, OresGroup1.NICHROME_ORE.getDefaultState(), 4)) // vein // size 
			.decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 64))).spreadHorizontally().repeat(2);
	private static ConfiguredFeature<?, ?> ELECTRON_ORE_OVERWORLD = Feature.ORE
			.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, OresGroup1.ELECTRON_ORE.getDefaultState(), 4)) // vein // size 
			.decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 40))).spreadHorizontally().repeat(1);

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

		RegistryKey<ConfiguredFeature<?, ?>> steelOreOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
				new Identifier(AttlasMod.MOD_ID, "steel_ore_overworld"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, steelOreOverworld.getValue(), STEEL_ORE_OVERWORLD);
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
				steelOreOverworld);
		RegistryKey<ConfiguredFeature<?, ?>> tinOreOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
				new Identifier(AttlasMod.MOD_ID, "tin_ore_overworld"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, tinOreOverworld.getValue(), TIN_ORE_OVERWORLD);
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
				tinOreOverworld);
		RegistryKey<ConfiguredFeature<?, ?>> aluminumOreOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
				new Identifier(AttlasMod.MOD_ID, "aluminum_ore_overworld"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, aluminumOreOverworld.getValue(), ALUMINUM_ORE_OVERWORLD);
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
				aluminumOreOverworld);
		RegistryKey<ConfiguredFeature<?, ?>> titaniumOreOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
				new Identifier(AttlasMod.MOD_ID, "titanium_ore_overworld"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, titaniumOreOverworld.getValue(), TITANIUM_ORE_OVERWORLD);
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
				titaniumOreOverworld);
		RegistryKey<ConfiguredFeature<?, ?>> bismuthOreOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
				new Identifier(AttlasMod.MOD_ID, "bismuth_ore_overworld"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, bismuthOreOverworld.getValue(), BISMUTH_ORE_OVERWORLD);
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
				bismuthOreOverworld);
		RegistryKey<ConfiguredFeature<?, ?>> silverOreOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
				new Identifier(AttlasMod.MOD_ID, "silver_ore_overworld"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, silverOreOverworld.getValue(), SILVER_ORE_OVERWORLD);
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
				silverOreOverworld);
		RegistryKey<ConfiguredFeature<?, ?>> cadmiumOreOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
				new Identifier(AttlasMod.MOD_ID, "cadmium_ore_overworld"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, cadmiumOreOverworld.getValue(), CADMIUM_ORE_OVERWORLD);
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
				cadmiumOreOverworld);
		RegistryKey<ConfiguredFeature<?, ?>> cooperOreOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
				new Identifier(AttlasMod.MOD_ID, "cooper_ore_overworld"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, cooperOreOverworld.getValue(), COOPER_ORE_OVERWORLD);
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
				cooperOreOverworld);
		RegistryKey<ConfiguredFeature<?, ?>> cobaltOreOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
				new Identifier(AttlasMod.MOD_ID, "cobalt_ore_overworld"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, cobaltOreOverworld.getValue(), COBALT_ORE_OVERWORLD);
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
				cobaltOreOverworld);
		RegistryKey<ConfiguredFeature<?, ?>> chromeOreOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
				new Identifier(AttlasMod.MOD_ID, "chrome_ore_overworld"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, chromeOreOverworld.getValue(), CHROME_ORE_OVERWORLD);
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
				chromeOreOverworld);
		RegistryKey<ConfiguredFeature<?, ?>> iridiumOreOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
				new Identifier(AttlasMod.MOD_ID, "iridium_ore_overworld"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, iridiumOreOverworld.getValue(), IRIDIUM_ORE_OVERWORLD);
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
				iridiumOreOverworld);
		RegistryKey<ConfiguredFeature<?, ?>> osmiumOreOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
				new Identifier(AttlasMod.MOD_ID, "osmium_ore_overworld"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, osmiumOreOverworld.getValue(), OSMIUM_ORE_OVERWORLD);
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
				osmiumOreOverworld);
		RegistryKey<ConfiguredFeature<?, ?>> nickelOreOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
				new Identifier(AttlasMod.MOD_ID, "nickel_ore_overworld"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, nickelOreOverworld.getValue(), NICKEL_ORE_OVERWORLD);
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
				nickelOreOverworld);
		RegistryKey<ConfiguredFeature<?, ?>> leadOreOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
				new Identifier(AttlasMod.MOD_ID, "lead_ore_overworld"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, leadOreOverworld.getValue(), LEAD_ORE_OVERWORLD);
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
				leadOreOverworld);
		RegistryKey<ConfiguredFeature<?, ?>> thalliumOreOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
				new Identifier(AttlasMod.MOD_ID, "thallium_ore_overworld"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, thalliumOreOverworld.getValue(), THALLIUM_ORE_OVERWORLD);
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
				thalliumOreOverworld);
		RegistryKey<ConfiguredFeature<?, ?>> indianOreOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
				new Identifier(AttlasMod.MOD_ID, "indian_ore_overworld"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, indianOreOverworld.getValue(), INDIAN_ORE_OVERWORLD);
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
				indianOreOverworld);
		RegistryKey<ConfiguredFeature<?, ?>> vibraniumOreOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
				new Identifier(AttlasMod.MOD_ID, "vibranium_ore_overworld"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, vibraniumOreOverworld.getValue(), VIBRANIUM_ORE_OVERWORLD);
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
				vibraniumOreOverworld);
		RegistryKey<ConfiguredFeature<?, ?>> adamantiumOreOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
				new Identifier(AttlasMod.MOD_ID, "adamantium_ore_overworld"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, adamantiumOreOverworld.getValue(), ADAMANTIUM_ORE_OVERWORLD);
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
				adamantiumOreOverworld);
		RegistryKey<ConfiguredFeature<?, ?>> bronzeOreOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
				new Identifier(AttlasMod.MOD_ID, "bronze_ore_overworld"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, bronzeOreOverworld.getValue(), BRONZE_ORE_OVERWORLD);
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
				bronzeOreOverworld);
		RegistryKey<ConfiguredFeature<?, ?>> brassOreOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
				new Identifier(AttlasMod.MOD_ID, "brass_ore_overworld"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, brassOreOverworld.getValue(), BRASS_ORE_OVERWORLD);
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
				brassOreOverworld);
		RegistryKey<ConfiguredFeature<?, ?>> invarOreOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
				new Identifier(AttlasMod.MOD_ID, "invar_ore_overworld"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, invarOreOverworld.getValue(), INVAR_ORE_OVERWORLD);
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
				invarOreOverworld);
		RegistryKey<ConfiguredFeature<?, ?>> tombacOreOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
				new Identifier(AttlasMod.MOD_ID, "tombac_ore_overworld"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, tombacOreOverworld.getValue(), TOMBAC_ORE_OVERWORLD);
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
				tombacOreOverworld);
		RegistryKey<ConfiguredFeature<?, ?>> nichromeOreOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
				new Identifier(AttlasMod.MOD_ID, "nichrome_ore_overworld"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, nichromeOreOverworld.getValue(), NICHROME_ORE_OVERWORLD);
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
				nichromeOreOverworld);
		RegistryKey<ConfiguredFeature<?, ?>> electronOreOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
				new Identifier(AttlasMod.MOD_ID, "electron_ore_overworld"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, electronOreOverworld.getValue(), ELECTRON_ORE_OVERWORLD);
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
				electronOreOverworld);
  }
  
}
