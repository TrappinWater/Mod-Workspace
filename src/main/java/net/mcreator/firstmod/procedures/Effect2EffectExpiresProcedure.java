package net.mcreator.firstmod.procedures;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.firstmod.VanillaAdditionsByTrappMod;

import java.util.Map;

public class Effect2EffectExpiresProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				VanillaAdditionsByTrappMod.LOGGER.warn("Failed to load dependency entity for procedure Effect2EffectExpires!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).setHealth((float) 0);
	}
}
