
package net.mcreator.firstmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.firstmod.VanillaAdditionsByTrappModElements;

@VanillaAdditionsByTrappModElements.ModElement.Tag
public class EnhancitefragmentItem extends VanillaAdditionsByTrappModElements.ModElement {
	@ObjectHolder("vanilla_additions_by_trapp:enhancitefragment")
	public static final Item block = null;
	public EnhancitefragmentItem(VanillaAdditionsByTrappModElements instance) {
		super(instance, 392);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.MISC).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("enhancitefragment");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
