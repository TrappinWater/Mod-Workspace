package net.mcreator.firstmod.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.IWorld;
import net.minecraft.item.ItemStack;
import net.minecraft.enchantment.Enchantments;

import net.mcreator.firstmod.VanillaAdditionsByTrappMod;

import java.util.Random;
import java.util.Map;

public class ForcefieldBodyTickEventProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				VanillaAdditionsByTrappMod.LOGGER.warn("Failed to load dependency itemstack for procedure ForcefieldBodyTickEvent!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				VanillaAdditionsByTrappMod.LOGGER.warn("Failed to load dependency world for procedure ForcefieldBodyTickEvent!");
			return;
		}
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		IWorld world = (IWorld) dependencies.get("world");
		((itemstack)).addEnchantment(Enchantments.PROTECTION, (int) 30);
		((itemstack)).addEnchantment(Enchantments.THORNS, (int) 20);
		((itemstack)).addEnchantment(Enchantments.BINDING_CURSE, (int) 10);
		new Object() {
			private int ticks = 0;
			private float waitTicks;
			private IWorld world;
			public void start(IWorld world, int waitTicks) {
				this.waitTicks = waitTicks;
				MinecraftForge.EVENT_BUS.register(this);
				this.world = world;
			}

			@SubscribeEvent
			public void tick(TickEvent.ServerTickEvent event) {
				if (event.phase == TickEvent.Phase.END) {
					this.ticks += 1;
					if (this.ticks >= this.waitTicks)
						run();
				}
			}

			private void run() {
				{
					ItemStack _ist = (itemstack);
					if (_ist.attemptDamageItem((int) 1000, new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamage(0);
					}
				}
				MinecraftForge.EVENT_BUS.unregister(this);
			}
		}.start(world, (int) 100);
	}
}
