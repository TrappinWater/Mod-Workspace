package net.mcreator.firstmod.procedures;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;

import net.mcreator.firstmod.VanillaAdditionsByTrappMod;

import java.util.Map;

public class OrichalcumLivingEntityIsHitWithToolProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				VanillaAdditionsByTrappMod.LOGGER.warn("Failed to load dependency entity for procedure OrichalcumLivingEntityIsHitWithTool!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((entity.isInWater())) {
			entity.attackEntityFrom(DamageSource.DROWN, (float) 4);
		}
	}
}
