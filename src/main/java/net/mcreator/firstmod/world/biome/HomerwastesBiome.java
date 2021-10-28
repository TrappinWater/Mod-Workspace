
package net.mcreator.firstmod.world.biome;

import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.biome.MobSpawnInfo;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.biome.BiomeGenerationSettings;
import net.minecraft.world.biome.BiomeAmbience;
import net.minecraft.world.biome.Biome;
import net.minecraft.entity.EntityClassification;
import net.minecraft.block.Blocks;

import net.mcreator.firstmod.entity.HomerEntity;
import net.mcreator.firstmod.block.ElectrolyticfluidBlock;
import net.mcreator.firstmod.VanillaAdditionsByTrappModElements;

@VanillaAdditionsByTrappModElements.ModElement.Tag
public class HomerwastesBiome extends VanillaAdditionsByTrappModElements.ModElement {
	public static Biome biome;
	public HomerwastesBiome(VanillaAdditionsByTrappModElements instance) {
		super(instance, 244);
		FMLJavaModLoadingContext.get().getModEventBus().register(new BiomeRegisterHandler());
	}
	private static class BiomeRegisterHandler {
		@SubscribeEvent
		public void registerBiomes(RegistryEvent.Register<Biome> event) {
			if (biome == null) {
				BiomeAmbience effects = new BiomeAmbience.Builder().setFogColor(-16737895).setWaterColor(4159204).setWaterFogColor(329011)
						.withSkyColor(-16737895).withFoliageColor(10387789).withGrassColor(9470285).build();
				BiomeGenerationSettings.Builder biomeGenerationSettings = new BiomeGenerationSettings.Builder()
						.withSurfaceBuilder(SurfaceBuilder.DEFAULT.func_242929_a(new SurfaceBuilderConfig(Blocks.REDSTONE_BLOCK.getDefaultState(),
								ElectrolyticfluidBlock.block.getDefaultState(), ElectrolyticfluidBlock.block.getDefaultState())));
				DefaultBiomeFeatures.withCavesAndCanyons(biomeGenerationSettings);
				DefaultBiomeFeatures.withOverworldOres(biomeGenerationSettings);
				DefaultBiomeFeatures.withFrozenTopLayer(biomeGenerationSettings);
				MobSpawnInfo.Builder mobSpawnInfo = new MobSpawnInfo.Builder().isValidSpawnBiomeForPlayer();
				mobSpawnInfo.withSpawner(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(HomerEntity.entity, 19, 2, 5));
				biome = new Biome.Builder().precipitation(Biome.RainType.RAIN).category(Biome.Category.NONE).depth(0.1f).scale(0.2f).temperature(0.5f)
						.downfall(0.5f).setEffects(effects).withMobSpawnSettings(mobSpawnInfo.copy())
						.withGenerationSettings(biomeGenerationSettings.build()).build();
				event.getRegistry().register(biome.setRegistryName("vanilla_additions_by_trapp:homerwastes"));
			}
		}
	}
	@Override
	public void init(FMLCommonSetupEvent event) {
	}
}
