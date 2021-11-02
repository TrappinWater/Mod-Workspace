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

import net.mcreator.firstmod.entity.RevenantEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class RevenantRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(RevenantEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelcustom_model(), 0.5f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("vanilla_additions_by_trapp:textures/revenant.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.9.3
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelcustom_model extends EntityModel<Entity> {
		private final ModelRenderer t;
		private final ModelRenderer ll;
		private final ModelRenderer rl;
		private final ModelRenderer ra;
		private final ModelRenderer cube_r1;
		private final ModelRenderer la;
		private final ModelRenderer cube_r2;
		private final ModelRenderer ra2;
		private final ModelRenderer cube_r3;
		private final ModelRenderer h;
		private final ModelRenderer cube_r4;
		private final ModelRenderer cube_r5;
		private final ModelRenderer cube_r6;
		public Modelcustom_model() {
			textureWidth = 256;
			textureHeight = 256;
			t = new ModelRenderer(this);
			t.setRotationPoint(0.0F, 24.0F, 0.0F);
			t.setTextureOffset(96, 36).addBox(-3.24F, -30.6F, 0.0F, 6.0F, 3.0F, 3.0F, 0.0F, false);
			t.setTextureOffset(84, 0).addBox(-5.48F, -33.36F, 0.0F, 11.0F, 3.0F, 3.0F, 0.0F, false);
			t.setTextureOffset(0, 102).addBox(-1.62F, -52.12F, 2.76F, 3.0F, 19.0F, 0.0F, 0.0F, false);
			t.setTextureOffset(0, 0).addBox(-8.72F, -52.68F, 0.0F, 17.0F, 3.0F, 3.0F, 0.0F, false);
			t.setTextureOffset(96, 30).addBox(-5.48F, -49.92F, 2.76F, 11.0F, 3.0F, 0.0F, 0.0F, false);
			t.setTextureOffset(96, 42).addBox(-5.52F, -49.92F, -2.76F, 0.0F, 3.0F, 6.0F, 0.0F, false);
			t.setTextureOffset(96, 36).addBox(5.52F, -49.92F, -2.76F, 0.0F, 3.0F, 6.0F, 0.0F, false);
			t.setTextureOffset(96, 24).addBox(-5.48F, -49.92F, -2.76F, 11.0F, 3.0F, 0.0F, 0.0F, false);
			t.setTextureOffset(96, 18).addBox(-5.48F, -44.4F, 2.76F, 11.0F, 3.0F, 0.0F, 0.0F, false);
			t.setTextureOffset(12, 96).addBox(-5.52F, -44.4F, -2.76F, 0.0F, 3.0F, 6.0F, 0.0F, false);
			t.setTextureOffset(12, 90).addBox(5.52F, -44.4F, -2.76F, 0.0F, 3.0F, 6.0F, 0.0F, false);
			t.setTextureOffset(90, 12).addBox(-5.48F, -44.4F, -2.76F, 11.0F, 3.0F, 0.0F, 0.0F, false);
			t.setTextureOffset(108, 60).addBox(-1.62F, -51.576F, -2.76F, 3.0F, 3.0F, 3.0F, 0.0F, false);
			t.setTextureOffset(36, 102).addBox(-1.62F, -49.64F, -2.76F, 3.0F, 11.0F, 0.0F, 0.0F, false);
			ll = new ModelRenderer(this);
			ll.setRotationPoint(-4.0F, -4.0F, 1.0F);
			ll.setTextureOffset(24, 12).addBox(-1.76F, 0.0F, -1.0F, 3.0F, 28.0F, 3.0F, 0.0F, false);
			rl = new ModelRenderer(this);
			rl.setRotationPoint(4.0F, -4.0F, 1.0F);
			rl.setTextureOffset(0, 12).addBox(-1.48F, 0.0F, -1.0F, 3.0F, 28.0F, 3.0F, 0.0F, false);
			ra = new ModelRenderer(this);
			ra.setRotationPoint(-9.0F, -29.0F, 1.0F);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(9.0F, 53.0F, -1.0F);
			ra.addChild(cube_r1);
			setRotationAngle(cube_r1, -0.0038F, -0.0872F, 0.0438F);
			cube_r1.setTextureOffset(72, 12).addBox(-14.04F, -52.36F, 0.0F, 3.0F, 22.0F, 3.0F, 0.0F, false);
			la = new ModelRenderer(this);
			la.setRotationPoint(9.0F, -26.0F, 1.0F);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(-9.0F, 50.0F, -1.0F);
			la.addChild(cube_r2);
			setRotationAngle(cube_r2, -0.0436F, -0.0019F, -0.0436F);
			cube_r2.setTextureOffset(48, 12).addBox(9.42F, -49.6F, -2.76F, 3.0F, 22.0F, 3.0F, 0.0F, false);
			ra2 = new ModelRenderer(this);
			ra2.setRotationPoint(-7.0F, -26.0F, 0.0F);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(7.0F, 50.0F, 0.0F);
			ra2.addChild(cube_r3);
			setRotationAngle(cube_r3, 0.0F, -0.1309F, 0.0436F);
			cube_r3.setTextureOffset(48, 66).addBox(-11.28F, -49.6F, 0.0F, 3.0F, 22.0F, 3.0F, 0.0F, false);
			h = new ModelRenderer(this);
			h.setRotationPoint(0.0F, -29.0F, 2.0F);
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(0.0F, 53.0F, -2.0F);
			h.addChild(cube_r4);
			setRotationAngle(cube_r4, -0.0432F, -0.2177F, 0.0206F);
			cube_r4.setTextureOffset(72, 66).addBox(2.28F, -58.44F, -5.52F, 6.0F, 6.0F, 6.0F, 0.0F, false);
			cube_r5 = new ModelRenderer(this);
			cube_r5.setRotationPoint(0.0F, 53.0F, -2.0F);
			h.addChild(cube_r5);
			setRotationAngle(cube_r5, 0.0452F, -0.2615F, -0.099F);
			cube_r5.setTextureOffset(0, 78).addBox(-3.24F, -58.44F, 0.0F, 6.0F, 6.0F, 6.0F, 0.0F, false);
			cube_r6 = new ModelRenderer(this);
			cube_r6.setRotationPoint(0.0F, 53.0F, -2.0F);
			h.addChild(cube_r6);
			setRotationAngle(cube_r6, -0.1314F, -0.0865F, 0.0114F);
			cube_r6.setTextureOffset(72, 90).addBox(-3.24F, -58.44F, -11.04F, 6.0F, 6.0F, 6.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			t.render(matrixStack, buffer, packedLight, packedOverlay);
			ll.render(matrixStack, buffer, packedLight, packedOverlay);
			rl.render(matrixStack, buffer, packedLight, packedOverlay);
			ra.render(matrixStack, buffer, packedLight, packedOverlay);
			la.render(matrixStack, buffer, packedLight, packedOverlay);
			ra2.render(matrixStack, buffer, packedLight, packedOverlay);
			h.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.ll.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.ra2.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.h.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.h.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.ra.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.la.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.rl.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		}
	}
}
