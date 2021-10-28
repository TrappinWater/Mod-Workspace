package net.mcreator.firstmod.procedures;

import net.minecraft.util.DamageSource;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.firstmod.entity.AlotitanEntity;
import net.mcreator.firstmod.VanillaAdditionsByTrappMod;

import java.util.Map;

public class ElectrolyticfluidMobplayerCollidesBlockProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				VanillaAdditionsByTrappMod.LOGGER.warn("Failed to load dependency entity for procedure ElectrolyticfluidMobplayerCollidesBlock!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.attackEntityFrom(DamageSource.LIGHTNING_BOLT, (float) 4);
		if ((entity instanceof AlotitanEntity.CustomEntity)) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.REGENERATION, (int) 60, (int) 0, (false), (false)));
		}
	}
}
