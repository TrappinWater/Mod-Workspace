package net.mcreator.firstmod.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import net.mcreator.firstmod.entity.Spidertron8000Entity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class Spidertron8000Renderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(Spidertron8000Entity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelspidertron_8000(), 0.5f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("vanilla_additions_by_trapp:textures/spidertron_8000.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.0.3
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelspidertron_8000 extends EntityModel<Entity> {
		private final ModelRenderer h;
		private final ModelRenderer cube_r1;
		private final ModelRenderer fl;
		private final ModelRenderer cube_r2;
		private final ModelRenderer cube_r3;
		private final ModelRenderer bl;
		private final ModelRenderer cube_r4;
		private final ModelRenderer cube_r5;
		private final ModelRenderer br;
		private final ModelRenderer cube_r6;
		private final ModelRenderer cube_r7;
		private final ModelRenderer br2;
		private final ModelRenderer cube_r8;
		private final ModelRenderer cube_r9;
		public Modelspidertron_8000() {
			textureWidth = 256;
			textureHeight = 256;
			h = new ModelRenderer(this);
			h.setRotationPoint(0.375F, -63.0979F, -14.5962F);
			h.setTextureOffset(0, 0).addBox(-13.575F, -12.8021F, -13.0038F, 27.0F, 21.0F, 24.0F, 0.0F, false);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(-0.375F, 87.0979F, 14.5962F);
			h.addChild(cube_r1);
			setRotationAngle(cube_r1, -0.0873F, 0.0F, 0.0F);
			cube_r1.setTextureOffset(0, 45).addBox(-2.55F, -104.22F, -34.5F, 6.0F, 6.0F, 24.0F, 0.0F, false);
			fl = new ModelRenderer(this);
			fl.setRotationPoint(30.2533F, -28.5033F, -19.2F);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(-30.2533F, 52.5033F, 19.2F);
			fl.addChild(cube_r2);
			setRotationAngle(cube_r2, 0.0F, 0.0F, -0.0873F);
			cube_r2.setTextureOffset(12, 75).addBox(38.4F, -64.2F, -20.7F, 3.0F, 75.0F, 3.0F, 0.0F, false);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(-30.2533F, 52.5033F, 19.2F);
			fl.addChild(cube_r3);
			setRotationAngle(cube_r3, 0.0F, 0.0F, 0.6545F);
			cube_r3.setTextureOffset(78, 18).addBox(-40.8F, -75.0F, -20.7F, 27.0F, 3.0F, 3.0F, 0.0F, false);
			bl = new ModelRenderer(this);
			bl.setRotationPoint(30.2533F, -28.5033F, -5.4F);
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(-30.2533F, 52.5033F, 19.2F);
			bl.addChild(cube_r4);
			setRotationAngle(cube_r4, 0.0F, 0.0F, -0.0873F);
			cube_r4.setTextureOffset(0, 75).addBox(38.4F, -64.2F, -20.7F, 3.0F, 75.0F, 3.0F, 0.0F, false);
			cube_r5 = new ModelRenderer(this);
			cube_r5.setRotationPoint(-30.2533F, 52.5033F, 19.2F);
			bl.addChild(cube_r5);
			setRotationAngle(cube_r5, 0.0F, 0.0F, 0.6545F);
			cube_r5.setTextureOffset(78, 12).addBox(-40.8F, -75.0F, -20.7F, 27.0F, 3.0F, 3.0F, 0.0F, false);
			br = new ModelRenderer(this);
			br.setRotationPoint(-29.567F, -28.6467F, -5.4F);
			cube_r6 = new ModelRenderer(this);
			cube_r6.setRotationPoint(29.567F, 52.6467F, 19.2F);
			br.addChild(cube_r6);
			setRotationAngle(cube_r6, 0.0F, 0.0F, 0.0873F);
			cube_r6.setTextureOffset(72, 45).addBox(-40.5F, -64.2F, -20.7F, 3.0F, 75.0F, 3.0F, 0.0F, false);
			cube_r7 = new ModelRenderer(this);
			cube_r7.setRotationPoint(29.567F, 52.6467F, 19.2F);
			br.addChild(cube_r7);
			setRotationAngle(cube_r7, 0.0F, 0.0F, -0.6545F);
			cube_r7.setTextureOffset(78, 6).addBox(14.4F, -75.0F, -20.7F, 27.0F, 3.0F, 3.0F, 0.0F, false);
			br2 = new ModelRenderer(this);
			br2.setRotationPoint(-29.567F, -28.6467F, -19.2F);
			cube_r8 = new ModelRenderer(this);
			cube_r8.setRotationPoint(29.567F, 52.6467F, 19.2F);
			br2.addChild(cube_r8);
			setRotationAngle(cube_r8, 0.0F, 0.0F, 0.0873F);
			cube_r8.setTextureOffset(60, 45).addBox(-40.5F, -64.2F, -20.7F, 3.0F, 75.0F, 3.0F, 0.0F, false);
			cube_r9 = new ModelRenderer(this);
			cube_r9.setRotationPoint(29.567F, 52.6467F, 19.2F);
			br2.addChild(cube_r9);
			setRotationAngle(cube_r9, 0.0F, 0.0F, -0.6545F);
			cube_r9.setTextureOffset(78, 0).addBox(14.4F, -75.0F, -20.7F, 27.0F, 3.0F, 3.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			h.render(matrixStack, buffer, packedLight, packedOverlay);
			fl.render(matrixStack, buffer, packedLight, packedOverlay);
			bl.render(matrixStack, buffer, packedLight, packedOverlay);
			br.render(matrixStack, buffer, packedLight, packedOverlay);
			br2.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.h.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.h.rotateAngleX = f4 / (180F / (float) Math.PI);
		}
	}
}
