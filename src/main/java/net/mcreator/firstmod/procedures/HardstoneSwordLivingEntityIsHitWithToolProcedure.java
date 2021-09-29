package net.mcreator.firstmod.procedures;

import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.entity.Entity;

import net.mcreator.firstmod.VanillaAdditionsByTrappMod;

import java.util.Map;

public class HardstoneSwordLivingEntityIsHitWithToolProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				VanillaAdditionsByTrappMod.LOGGER.warn("Failed to load dependency entity for procedure HardstoneSwordLivingEntityIsHitWithTool!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.setMotionMultiplier(null, new Vector3d(0.25D, (double) 0.05F, 0.25D));
	}
}
