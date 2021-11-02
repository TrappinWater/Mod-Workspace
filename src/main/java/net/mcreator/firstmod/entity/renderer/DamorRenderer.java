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

import net.mcreator.firstmod.entity.DamorEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class DamorRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(DamorEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelgemini(), 0.5f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("vanilla_additions_by_trapp:textures/gemini2.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.0.3
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelgemini extends EntityModel<Entity> {
		private final ModelRenderer ll;
		private final ModelRenderer rl;
		private final ModelRenderer t;
		private final ModelRenderer cube_r1;
		private final ModelRenderer cube_r2;
		private final ModelRenderer cube_r3;
		private final ModelRenderer cube_r4;
		private final ModelRenderer orb;
		private final ModelRenderer cube_r5;
		private final ModelRenderer ra;
		private final ModelRenderer la;
		private final ModelRenderer h;
		public Modelgemini() {
			textureWidth = 64;
			textureHeight = 64;
			ll = new ModelRenderer(this);
			ll.setRotationPoint(5.9F, 3.5F, 1.0F);
			ll.setTextureOffset(24, 35).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 21.0F, 2.0F, 0.0F, false);
			rl = new ModelRenderer(this);
			rl.setRotationPoint(-5.6F, 3.5F, 1.0F);
			rl.setTextureOffset(16, 33).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 21.0F, 2.0F, 0.0F, false);
			t = new ModelRenderer(this);
			t.setRotationPoint(0.0958F, -11.2725F, 2.2427F);
			t.setTextureOffset(21, 14).addBox(-7.1958F, 9.5725F, -2.2427F, 14.0F, 5.0F, 2.0F, 0.0F, false);
			t.setTextureOffset(32, 51).addBox(-6.6958F, 2.9725F, -2.2427F, 2.0F, 7.0F, 2.0F, 0.0F, false);
			t.setTextureOffset(51, 25).addBox(4.8042F, 2.9725F, -2.2427F, 2.0F, 7.0F, 2.0F, 0.0F, false);
			t.setTextureOffset(0, 55).addBox(-4.3958F, 7.9725F, -2.2427F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			t.setTextureOffset(53, 16).addBox(2.5042F, 7.9725F, -2.2427F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			t.setTextureOffset(54, 43).addBox(-4.3958F, -8.8275F, -2.2427F, 2.0F, 5.0F, 2.0F, 0.0F, false);
			t.setTextureOffset(40, 53).addBox(2.5042F, -8.8275F, -2.2427F, 2.0F, 5.0F, 2.0F, 0.0F, false);
			t.setTextureOffset(0, 0).addBox(-8.8958F, -13.1275F, -4.5427F, 18.0F, 7.0F, 7.0F, 0.0F, false);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(-0.0958F, 35.2725F, -2.2427F);
			t.addChild(cube_r1);
			setRotationAngle(cube_r1, 0.3491F, 0.0F, 0.0F);
			cube_r1.setTextureOffset(52, 51).addBox(-1.0F, -41.0F, 19.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(-0.0958F, 35.2725F, -2.2427F);
			t.addChild(cube_r2);
			setRotationAngle(cube_r2, 0.0873F, 0.0F, 0.0F);
			cube_r2.setTextureOffset(44, 35).addBox(-2.0F, -42.0F, 9.0F, 4.0F, 8.0F, 2.0F, 0.0F, false);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(-0.0958F, 35.2725F, -2.2427F);
			t.addChild(cube_r3);
			setRotationAngle(cube_r3, -0.48F, 0.0F, 0.0F);
			cube_r3.setTextureOffset(32, 35).addBox(-2.0F, -35.0F, -10.0F, 4.0F, 14.0F, 2.0F, 0.0F, false);
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(-0.0958F, 35.2725F, -2.2427F);
			t.addChild(cube_r4);
			setRotationAngle(cube_r4, 0.2182F, 0.0F, 0.0F);
			cube_r4.setTextureOffset(51, 7).addBox(-0.85F, -53.0F, 11.5F, 2.0F, 7.0F, 2.0F, 0.0F, false);
			orb = new ModelRenderer(this);
			orb.setRotationPoint(0.0F, -10.224F, 1.2F);
			cube_r5 = new ModelRenderer(this);
			cube_r5.setRotationPoint(0.0F, 34.224F, -1.2F);
			orb.addChild(cube_r5);
			setRotationAngle(cube_r5, 0.0F, 0.0F, 0.7854F);
			cube_r5.setTextureOffset(0, 14).addBox(-27.7F, -27.7F, -2.3F, 7.0F, 7.0F, 7.0F, 0.0F, false);
			ra = new ModelRenderer(this);
			ra.setRotationPoint(-10.2F, -22.2F, 1.0F);
			ra.setTextureOffset(8, 28).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 25.0F, 2.0F, 0.0F, false);
			la = new ModelRenderer(this);
			la.setRotationPoint(10.5F, -21.2F, 1.0F);
			la.setTextureOffset(0, 28).addBox(-1.0F, -1.5F, -1.0F, 2.0F, 25.0F, 2.0F, 0.0F, false);
			h = new ModelRenderer(this);
			h.setRotationPoint(-0.125F, -30.125F, 0.05F);
			h.setTextureOffset(46, 21).addBox(-2.575F, -1.775F, -4.65F, 5.0F, 2.0F, 2.0F, 0.0F, false);
			h.setTextureOffset(23, 23).addBox(-4.275F, -8.075F, -4.65F, 9.0F, 7.0F, 5.0F, 0.0F, false);
			h.setTextureOffset(44, 45).addBox(-2.575F, -3.475F, -0.05F, 5.0F, 8.0F, 0.0F, 0.0F, false);
			h.setTextureOffset(43, 0).addBox(-2.575F, 3.825F, -4.65F, 5.0F, 2.0F, 5.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			ll.render(matrixStack, buffer, packedLight, packedOverlay);
			rl.render(matrixStack, buffer, packedLight, packedOverlay);
			t.render(matrixStack, buffer, packedLight, packedOverlay);
			orb.render(matrixStack, buffer, packedLight, packedOverlay);
			ra.render(matrixStack, buffer, packedLight, packedOverlay);
			la.render(matrixStack, buffer, packedLight, packedOverlay);
			h.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.ll.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.la.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.h.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.h.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.rl.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.orb.rotateAngleZ = f2 / 20.f;
			this.ra.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		}
	}
}
