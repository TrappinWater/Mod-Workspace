package net.mcreator.firstmod.procedures;

import net.minecraft.item.ItemStack;
import net.minecraft.enchantment.Enchantments;

import net.mcreator.firstmod.VanillaAdditionsByTrappMod;

import java.util.Map;

public class UmbralstoneItemIsCraftedsmeltedProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				VanillaAdditionsByTrappMod.LOGGER.warn("Failed to load dependency itemstack for procedure UmbralstoneItemIsCraftedsmelted!");
			return;
		}
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		((itemstack)).addEnchantment(Enchantments.FIRE_ASPECT, (int) 3);
	}
}
