
package net.mcreator.firstmod.block;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fluids.FluidAttributes;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.ChanceConfig;
import net.minecraft.world.gen.feature.LakesFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.BlockStateFeatureConfig;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.World;
import net.minecraft.world.ISeedReader;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IBlockDisplayReader;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.RegistryKey;
import net.minecraft.item.Rarity;
import net.minecraft.item.Items;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.BucketItem;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FlowingFluid;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.Minecraft;
import net.minecraft.block.material.Material;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.firstmod.procedures.UmbralessenceMobplayerCollidesBlockProcedure;
import net.mcreator.firstmod.VanillaAdditionsByTrappModElements;

import java.util.function.BiFunction;
import java.util.Random;
import java.util.Map;
import java.util.HashMap;

@VanillaAdditionsByTrappModElements.ModElement.Tag
public class UmbralessenceBlock extends VanillaAdditionsByTrappModElements.ModElement {
	@ObjectHolder("vanilla_additions_by_trapp:umbralessence")
	public static final FlowingFluidBlock block = null;
	@ObjectHolder("vanilla_additions_by_trapp:umbralessence_bucket")
	public static final Item bucket = null;
	public static FlowingFluid flowing = null;
	public static FlowingFluid still = null;
	private ForgeFlowingFluid.Properties fluidproperties = null;
	public UmbralessenceBlock(VanillaAdditionsByTrappModElements instance) {
		super(instance, 123);
		FMLJavaModLoadingContext.get().getModEventBus().register(new FluidRegisterHandler());
		MinecraftForge.EVENT_BUS.register(this);
		FMLJavaModLoadingContext.get().getModEventBus().register(new FeatureRegisterHandler());
	}
	private static class FluidRegisterHandler {
		@SubscribeEvent
		public void registerFluids(RegistryEvent.Register<Fluid> event) {
			event.getRegistry().register(still);
			event.getRegistry().register(flowing);
		}
	}
	@Override
	@OnlyIn(Dist.CLIENT)
	public void clientLoad(FMLClientSetupEvent event) {
		RenderTypeLookup.setRenderLayer(still, RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(flowing, RenderType.getTranslucent());
	}

	@Override
	public void initElements() {
		fluidproperties = new ForgeFlowingFluid.Properties(() -> still, () -> flowing,
				CustomFluidAttributes
						.builder(new ResourceLocation("vanilla_additions_by_trapp:blocks/umbralessence"),
								new ResourceLocation("vanilla_additions_by_trapp:blocks/umbralessence"))
						.luminosity(0).density(1000).viscosity(1000).temperature(300).rarity(Rarity.COMMON).color(-16448205))
								.explosionResistance(100f).canMultiply().tickRate(7).levelDecreasePerBlock(1).slopeFindDistance(4)
								.bucket(() -> bucket).block(() -> block);
		still = (FlowingFluid) new ForgeFlowingFluid.Source(fluidproperties).setRegistryName("umbralessence");
		flowing = (FlowingFluid) new ForgeFlowingFluid.Flowing(fluidproperties).setRegistryName("umbralessence_flowing");
		elements.blocks
				.add(() -> new FlowingFluidBlock(still, Block.Properties.create(Material.WATER).hardnessAndResistance(100f).setLightLevel(s -> 3)) {
					@Override
					public boolean propagatesSkylightDown(BlockState state, IBlockReader reader, BlockPos pos) {
						return true;
					}

					@Override
					public void onEntityCollision(BlockState blockstate, World world, BlockPos pos, Entity entity) {
						super.onEntityCollision(blockstate, world, pos, entity);
						int x = pos.getX();
						int y = pos.getY();
						int z = pos.getZ();
						{
							Map<String, Object> $_dependencies = new HashMap<>();
							$_dependencies.put("entity", entity);
							UmbralessenceMobplayerCollidesBlockProcedure.executeProcedure($_dependencies);
						}
					}
				}.setRegistryName("umbralessence"));
		elements.items.add(() -> new BucketItem(still,
				new Item.Properties().containerItem(Items.BUCKET).maxStackSize(1).group(ItemGroup.MISC).rarity(Rarity.COMMON))
						.setRegistryName("umbralessence_bucket"));
	}
	public static class CustomFluidAttributes extends FluidAttributes {
		public static class CustomBuilder extends FluidAttributes.Builder {
			protected CustomBuilder(ResourceLocation stillTexture, ResourceLocation flowingTexture,
					BiFunction<FluidAttributes.Builder, Fluid, FluidAttributes> factory) {
				super(stillTexture, flowingTexture, factory);
			}
		}
		protected CustomFluidAttributes(CustomFluidAttributes.Builder builder, Fluid fluid) {
			super(builder, fluid);
		}

		public static CustomBuilder builder(ResourceLocation stillTexture, ResourceLocation flowingTexture) {
			return new CustomBuilder(stillTexture, flowingTexture, CustomFluidAttributes::new);
		}

		@Override
		public int getColor(IBlockDisplayReader world, BlockPos pos) {
			return Minecraft.getInstance().world.getBiome(pos).getWaterFogColor() | 0xFF000000;
		}
	}
	private static Feature<BlockStateFeatureConfig> feature = null;
	private static ConfiguredFeature<?, ?> configuredFeature = null;
	private static class FeatureRegisterHandler {
		@SubscribeEvent
		public void registerFeature(RegistryEvent.Register<Feature<?>> event) {
			feature = new LakesFeature(BlockStateFeatureConfig.field_236455_a_) {
				@Override
				public boolean generate(ISeedReader world, ChunkGenerator generator, Random rand, BlockPos pos, BlockStateFeatureConfig config) {
					RegistryKey<World> dimensionType = world.getWorld().getDimensionKey();
					boolean dimensionCriteria = false;
					if (dimensionType == RegistryKey.getOrCreateKey(Registry.WORLD_KEY, new ResourceLocation("vanilla_additions_by_trapp:umbra")))
						dimensionCriteria = true;
					if (!dimensionCriteria)
						return false;
					return super.generate(world, generator, rand, pos, config);
				}
			};
			configuredFeature = feature.withConfiguration(new BlockStateFeatureConfig(block.getDefaultState()))
					.withPlacement(Placement.WATER_LAKE.configure(new ChanceConfig(5)));
			event.getRegistry().register(feature.setRegistryName("umbralessence_lakes"));
			Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation("vanilla_additions_by_trapp:umbralessence_lakes"),
					configuredFeature);
		}
	}
	@SubscribeEvent
	public void addFeatureToBiomes(BiomeLoadingEvent event) {
		event.getGeneration().getFeatures(GenerationStage.Decoration.LOCAL_MODIFICATIONS).add(() -> configuredFeature);
	}
}
