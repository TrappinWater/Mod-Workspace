package net.mcreator.firstmod.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.world.Explosion;
import net.minecraft.util.math.BlockPos;

import net.mcreator.firstmod.block.HyperfuelBlock;
import net.mcreator.firstmod.VanillaAdditionsByTrappMod;

import java.util.Map;

public class FuelcellBlockDestroyedProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				VanillaAdditionsByTrappMod.LOGGER.warn("Failed to load dependency x for procedure FuelcellBlockDestroyed!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				VanillaAdditionsByTrappMod.LOGGER.warn("Failed to load dependency y for procedure FuelcellBlockDestroyed!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				VanillaAdditionsByTrappMod.LOGGER.warn("Failed to load dependency z for procedure FuelcellBlockDestroyed!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				VanillaAdditionsByTrappMod.LOGGER.warn("Failed to load dependency world for procedure FuelcellBlockDestroyed!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (world instanceof World && !((World) world).isRemote) {
			((World) world).createExplosion(null, (int) x, (int) y, (int) z, (float) 3, Explosion.Mode.DESTROY);
		}
		world.setBlockState(new BlockPos((int) x, (int) y, (int) z), HyperfuelBlock.block.getDefaultState(), 3);
	}
}
