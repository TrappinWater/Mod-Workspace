package net.mcreator.firstmod.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.firstmod.VanillaAdditionsByTrappMod;

import java.util.Map;

public class FirestoneLivingEntityIsHitWithToolProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				VanillaAdditionsByTrappMod.LOGGER.warn("Failed to load dependency entity for procedure FirestoneLivingEntityIsHitWithTool!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.setFire((int) 4);
	}
}
