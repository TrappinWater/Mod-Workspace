package net.mcreator.firstmod.procedures;

import net.minecraft.item.ItemStack;
import net.minecraft.enchantment.Enchantments;

import net.mcreator.firstmod.VanillaAdditionsByTrappMod;

import java.util.Map;

public class UmbralArmorTickEventProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				VanillaAdditionsByTrappMod.LOGGER.warn("Failed to load dependency itemstack for procedure UmbralArmorTickEvent!");
			return;
		}
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		((itemstack)).addEnchantment(Enchantments.THORNS, (int) 4);
	}
}
