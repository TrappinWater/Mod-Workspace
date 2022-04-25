
package net.mcreator.firstmod.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ArmorItem;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.firstmod.procedures.UpsidedownLeggingsTickEventProcedure;
import net.mcreator.firstmod.VanillaAdditionsByTrappModElements;

import java.util.Map;
import java.util.HashMap;

@VanillaAdditionsByTrappModElements.ModElement.Tag
public class UpsidedownItem extends VanillaAdditionsByTrappModElements.ModElement {
	@ObjectHolder("vanilla_additions_by_trapp:upsidedown_helmet")
	public static final Item helmet = null;
	@ObjectHolder("vanilla_additions_by_trapp:upsidedown_chestplate")
	public static final Item body = null;
	@ObjectHolder("vanilla_additions_by_trapp:upsidedown_leggings")
	public static final Item legs = null;
	@ObjectHolder("vanilla_additions_by_trapp:upsidedown_boots")
	public static final Item boots = null;
	public UpsidedownItem(VanillaAdditionsByTrappModElements instance) {
		super(instance, 409);
	}

	@Override
	public void initElements() {
		IArmorMaterial armormaterial = new IArmorMaterial() {
			@Override
			public int getDurability(EquipmentSlotType slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 64;
			}

			@Override
			public int getDamageReductionAmount(EquipmentSlotType slot) {
				return new int[]{2, 4, 6, 2}[slot.getIndex()];
			}

			@Override
			public int getEnchantability() {
				return 29;
			}

			@Override
			public net.minecraft.util.SoundEvent getSoundEvent() {
				return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}

			@OnlyIn(Dist.CLIENT)
			@Override
			public String getName() {
				return "upsidedown";
			}

			@Override
			public float getToughness() {
				return 0f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.1f;
			}
		};
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.LEGS, new Item.Properties().group(ItemGroup.COMBAT)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "vanilla_additions_by_trapp:textures/models/armor/upsie_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}

			@Override
			public void onArmorTick(ItemStack itemstack, World world, PlayerEntity entity) {
				double x = entity.getPosX();
				double y = entity.getPosY();
				double z = entity.getPosZ();
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					UpsidedownLeggingsTickEventProcedure.executeProcedure($_dependencies);
				}
			}
		}.setRegistryName("upsidedown_leggings"));
	}
}
