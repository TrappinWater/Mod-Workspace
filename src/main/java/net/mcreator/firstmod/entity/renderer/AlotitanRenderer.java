package net.mcreator.firstmod.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.math.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import net.mcreator.firstmod.entity.AlotitanEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class AlotitanRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(AlotitanEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelchungus(), 0.5f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("vanilla_additions_by_trapp:textures/chungus.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.9.3
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelchungus extends EntityModel<Entity> {
		private final ModelRenderer leftleg;
		private final ModelRenderer cube_r1;
		private final ModelRenderer rightleg;
		private final ModelRenderer cube_r2;
		private final ModelRenderer rightarm;
		private final ModelRenderer cube_r3;
		private final ModelRenderer head;
		private final ModelRenderer cube_r4;
		private final ModelRenderer cube_r5;
		private final ModelRenderer cube_r6;
		private final ModelRenderer torso;
		private final ModelRenderer cube_r7;
		private final ModelRenderer cube_r8;
		private final ModelRenderer leftarm;
		private final ModelRenderer cube_r9;
		public Modelchungus() {
			textureWidth = 128;
			textureHeight = 128;
			leftleg = new ModelRenderer(this);
			leftleg.setRotationPoint(6.0F, 0.0F, 3.0F);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(-6.0F, 24.0F, -3.0F);
			leftleg.addChild(cube_r1);
			setRotationAngle(cube_r1, 3.1416F, 0.0F, 0.0F);
			cube_r1.setTextureOffset(24, 72).addBox(3.36F, -0.04F, -6.24F, 6.0F, 25.0F, 6.0F, 0.0F, false);
			rightleg = new ModelRenderer(this);
			rightleg.setRotationPoint(-6.0F, 0.0F, 3.0F);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(6.0F, 24.0F, -3.0F);
			rightleg.addChild(cube_r2);
			setRotationAngle(cube_r2, 3.1416F, 0.0F, 0.0F);
			cube_r2.setTextureOffset(0, 72).addBox(-9.12F, -0.04F, -6.24F, 6.0F, 25.0F, 6.0F, 0.0F, false);
			rightarm = new ModelRenderer(this);
			rightarm.setRotationPoint(-17.0F, -34.0F, 3.0F);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(17.0F, 58.0F, -3.0F);
			rightarm.addChild(cube_r3);
			setRotationAngle(cube_r3, 3.1416F, 0.0F, 0.0F);
			cube_r3.setTextureOffset(66, 32).addBox(-20.04F, 22.28F, -6.24F, 6.0F, 37.0F, 6.0F, 0.0F, false);
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -39.0F, -2.0F);
			head.setTextureOffset(48, 75).addBox(-4.32F, -6.84F, -5.488F, 9.0F, 9.0F, 9.0F, 0.0F, false);
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(0.0F, 63.0F, 2.0F);
			head.addChild(cube_r4);
			setRotationAngle(cube_r4, 0.1745F, -0.3054F, 0.0F);
			cube_r4.setTextureOffset(6, 0).addBox(1.68F, -71.28F, 3.12F, 3.0F, 12.0F, 0.0F, 0.0F, false);
			cube_r5 = new ModelRenderer(this);
			cube_r5.setRotationPoint(0.0F, 63.0F, 2.0F);
			head.addChild(cube_r5);
			setRotationAngle(cube_r5, 0.1745F, 0.3054F, 0.0F);
			cube_r5.setTextureOffset(0, 0).addBox(-4.56F, -71.28F, 3.12F, 3.0F, 12.0F, 0.0F, 0.0F, false);
			cube_r6 = new ModelRenderer(this);
			cube_r6.setRotationPoint(0.0F, 63.0F, 2.0F);
			head.addChild(cube_r6);
			setRotationAngle(cube_r6, 0.0F, 0.0F, 0.7854F);
			cube_r6.setTextureOffset(90, 40).addBox(-48.24F, -48.24F, -9.36F, 3.0F, 3.0F, 6.0F, 0.0F, false);
			torso = new ModelRenderer(this);
			torso.setRotationPoint(0.0F, 24.0F, 0.0F);
			torso.setTextureOffset(72, 0).addBox(-9.64F, -32.4F, 0.0F, 19.0F, 9.0F, 6.0F, 0.0F, false);
			torso.setTextureOffset(0, 32).addBox(-4.32F, -60.76F, -2.496F, 9.0F, 28.0F, 12.0F, 0.0F, false);
			torso.setTextureOffset(0, 0).addBox(-13.96F, -62.8F, -4.68F, 28.0F, 16.0F, 16.0F, 0.0F, false);
			cube_r7 = new ModelRenderer(this);
			cube_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
			torso.addChild(cube_r7);
			setRotationAngle(cube_r7, 0.0F, 0.0F, -0.1745F);
			cube_r7.setTextureOffset(90, 15).addBox(-4.44F, -51.76F, 0.0F, 6.0F, 19.0F, 6.0F, 0.0F, false);
			cube_r8 = new ModelRenderer(this);
			cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
			torso.addChild(cube_r8);
			setRotationAngle(cube_r8, 0.0F, 0.0F, 0.1745F);
			cube_r8.setTextureOffset(84, 69).addBox(-1.32F, -51.76F, 0.0F, 6.0F, 19.0F, 6.0F, 0.0F, false);
			leftarm = new ModelRenderer(this);
			leftarm.setRotationPoint(17.0F, -34.0F, 3.0F);
			cube_r9 = new ModelRenderer(this);
			cube_r9.setRotationPoint(-17.0F, 58.0F, -3.0F);
			leftarm.addChild(cube_r9);
			setRotationAngle(cube_r9, 3.1416F, 0.0F, 0.0F);
			cube_r9.setTextureOffset(42, 32).addBox(14.28F, 22.28F, -6.24F, 6.0F, 37.0F, 6.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			leftleg.render(matrixStack, buffer, packedLight, packedOverlay);
			rightleg.render(matrixStack, buffer, packedLight, packedOverlay);
			rightarm.render(matrixStack, buffer, packedLight, packedOverlay);
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			torso.render(matrixStack, buffer, packedLight, packedOverlay);
			leftarm.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.rightarm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.leftleg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.rightleg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.leftarm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		}
	}
}
