package net.mcreator.firstmod.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.passive.RabbitEntity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.Entity;

import net.mcreator.firstmod.item.MysteriousfruitItem;
import net.mcreator.firstmod.VanillaAdditionsByTrappMod;

import java.util.Map;

public class PlantclickProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				VanillaAdditionsByTrappMod.LOGGER.warn("Failed to load dependency entity for procedure Plantclick!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				VanillaAdditionsByTrappMod.LOGGER.warn("Failed to load dependency x for procedure Plantclick!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				VanillaAdditionsByTrappMod.LOGGER.warn("Failed to load dependency y for procedure Plantclick!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				VanillaAdditionsByTrappMod.LOGGER.warn("Failed to load dependency z for procedure Plantclick!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				VanillaAdditionsByTrappMod.LOGGER.warn("Failed to load dependency world for procedure Plantclick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((entity instanceof RabbitEntity)) {
			if (world instanceof World && !world.isRemote()) {
				ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(MysteriousfruitItem.block));
				entityToSpawn.setPickupDelay((int) 10);
				world.addEntity(entityToSpawn);
			}
		}
	}
}
