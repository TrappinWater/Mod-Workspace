
package net.mcreator.firstmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.firstmod.VanillaAdditionsByTrappModElements;

@VanillaAdditionsByTrappModElements.ModElement.Tag
public class CompresseddiamondswordItem extends VanillaAdditionsByTrappModElements.ModElement {
	@ObjectHolder("vanilla_additions_by_trapp:compresseddiamondsword")
	public static final Item block = null;
	public CompresseddiamondswordItem(VanillaAdditionsByTrappModElements instance) {
		super(instance, 8);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 3042;
			}

			public float getEfficiency() {
				return 12f;
			}

			public float getAttackDamage() {
				return 6f;
			}

			public int getHarvestLevel() {
				return 5;
			}

			public int getEnchantability() {
				return 20;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(CompresseddiamondItem.block));
			}
		}, 3, -2.2f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("compresseddiamondsword"));
	}
}
