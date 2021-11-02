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

import net.mcreator.firstmod.entity.TitaniaEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class TitaniaRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(TitaniaEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modeltitania(), 0.5f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("vanilla_additions_by_trapp:textures/titania.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.9.3
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modeltitania extends EntityModel<Entity> {
		private final ModelRenderer h;
		private final ModelRenderer cube_r1;
		private final ModelRenderer cube_r2;
		private final ModelRenderer cube_r3;
		private final ModelRenderer cube_r4;
		private final ModelRenderer cube_r5;
		private final ModelRenderer cube_r6;
		private final ModelRenderer cube_r7;
		private final ModelRenderer cube_r8;
		private final ModelRenderer cube_r9;
		private final ModelRenderer cube_r10;
		private final ModelRenderer cube_r11;
		private final ModelRenderer t;
		private final ModelRenderer cube_r12;
		private final ModelRenderer cube_r13;
		private final ModelRenderer cube_r14;
		private final ModelRenderer cube_r15;
		private final ModelRenderer cube_r16;
		private final ModelRenderer cube_r17;
		private final ModelRenderer cube_r18;
		private final ModelRenderer cube_r19;
		private final ModelRenderer cube_r20;
		private final ModelRenderer cube_r21;
		private final ModelRenderer cube_r22;
		private final ModelRenderer cube_r23;
		private final ModelRenderer cube_r24;
		public Modeltitania() {
			textureWidth = 256;
			textureHeight = 256;
			h = new ModelRenderer(this);
			h.setRotationPoint(0.0F, -25.0F, 10.0F);
			h.setTextureOffset(34, 38).addBox(-6.2F, -12.3F, -10.0F, 12.0F, 12.0F, 12.0F, 0.0F, false);
			h.setTextureOffset(70, 0).addBox(-6.2F, -13.26F, -9.42F, 12.0F, 6.0F, 12.0F, 0.0F, false);
			h.setTextureOffset(61, 0).addBox(-4.45F, -12.0F, 1.6F, 3.0F, 3.0F, 6.0F, 0.0F, false);
			h.setTextureOffset(0, 6).addBox(1.35F, -12.0F, 1.6F, 3.0F, 3.0F, 6.0F, 0.0F, false);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(0.0F, 49.0F, -10.0F);
			h.addChild(cube_r1);
			setRotationAngle(cube_r1, -0.3491F, 0.0F, 0.0F);
			cube_r1.setTextureOffset(76, 91).addBox(1.35F, -58.1F, 5.8F, 3.0F, 3.0F, 9.0F, 0.0F, false);
			cube_r1.setTextureOffset(110, 63).addBox(-4.45F, -58.1F, 5.8F, 3.0F, 3.0F, 9.0F, 0.0F, false);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(0.0F, 49.0F, -10.0F);
			h.addChild(cube_r2);
			setRotationAngle(cube_r2, -0.6109F, 0.0F, 0.0F);
			cube_r2.setTextureOffset(40, 88).addBox(1.35F, -58.1F, -20.3F, 3.0F, 3.0F, 12.0F, 0.0F, false);
			cube_r2.setTextureOffset(58, 91).addBox(-4.45F, -58.1F, -20.3F, 3.0F, 3.0F, 12.0F, 0.0F, false);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(0.0F, 49.0F, -10.0F);
			h.addChild(cube_r3);
			setRotationAngle(cube_r3, 0.1309F, 0.0F, 0.0F);
			cube_r3.setTextureOffset(111, 117).addBox(-3.0F, -43.6F, 40.6F, 3.0F, 3.0F, 9.0F, 0.0F, false);
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(0.0F, 49.0F, -10.0F);
			h.addChild(cube_r4);
			setRotationAngle(cube_r4, -0.0436F, 0.0F, 0.0F);
			cube_r4.setTextureOffset(0, 112).addBox(2.8F, -52.3F, 34.8F, 3.0F, 3.0F, 9.0F, 0.0F, false);
			cube_r5 = new ModelRenderer(this);
			cube_r5.setRotationPoint(0.0F, 49.0F, -10.0F);
			h.addChild(cube_r5);
			setRotationAngle(cube_r5, 0.0873F, 0.0F, 0.0F);
			cube_r5.setTextureOffset(15, 115).addBox(-0.1F, -52.3F, 40.6F, 3.0F, 3.0F, 9.0F, 0.0F, false);
			cube_r6 = new ModelRenderer(this);
			cube_r6.setRotationPoint(0.0F, 49.0F, -10.0F);
			h.addChild(cube_r6);
			setRotationAngle(cube_r6, 0.2182F, 0.0F, 0.0F);
			cube_r6.setTextureOffset(30, 118).addBox(-5.9F, -40.7F, 46.4F, 3.0F, 3.0F, 9.0F, 0.0F, false);
			cube_r7 = new ModelRenderer(this);
			cube_r7.setRotationPoint(0.0F, 49.0F, -10.0F);
			h.addChild(cube_r7);
			setRotationAngle(cube_r7, -0.5672F, 0.0F, 0.0F);
			cube_r7.setTextureOffset(40, 65).addBox(-3.0F, -61.0F, -14.5F, 3.0F, 3.0F, 20.0F, 0.0F, false);
			cube_r7.setTextureOffset(14, 62).addBox(2.8F, -63.9F, -14.5F, 3.0F, 3.0F, 20.0F, 0.0F, false);
			cube_r7.setTextureOffset(62, 42).addBox(-0.1F, -66.8F, -17.4F, 3.0F, 3.0F, 20.0F, 0.0F, false);
			cube_r7.setTextureOffset(66, 68).addBox(-5.9F, -63.9F, -14.5F, 3.0F, 3.0F, 20.0F, 0.0F, false);
			cube_r8 = new ModelRenderer(this);
			cube_r8.setRotationPoint(0.0F, 49.0F, -10.0F);
			h.addChild(cube_r8);
			setRotationAngle(cube_r8, -0.3927F, 0.0F, 0.0F);
			cube_r8.setTextureOffset(0, 97).addBox(-3.0F, -63.9F, -11.6F, 3.0F, 3.0F, 12.0F, 0.0F, false);
			cube_r9 = new ModelRenderer(this);
			cube_r9.setRotationPoint(0.0F, 49.0F, -10.0F);
			h.addChild(cube_r9);
			setRotationAngle(cube_r9, 0.0436F, 0.0F, 0.0F);
			cube_r9.setTextureOffset(88, 91).addBox(2.8F, -61.0F, 14.5F, 3.0F, 3.0F, 12.0F, 0.0F, false);
			cube_r10 = new ModelRenderer(this);
			cube_r10.setRotationPoint(0.0F, 49.0F, -10.0F);
			h.addChild(cube_r10);
			setRotationAngle(cube_r10, 0.1745F, 0.0F, 0.0F);
			cube_r10.setTextureOffset(92, 65).addBox(-0.1F, -61.0F, 20.3F, 3.0F, 3.0F, 12.0F, 0.0F, false);
			cube_r11 = new ModelRenderer(this);
			cube_r11.setRotationPoint(0.0F, 49.0F, -10.0F);
			h.addChild(cube_r11);
			setRotationAngle(cube_r11, -0.1309F, 0.0F, 0.0F);
			cube_r11.setTextureOffset(18, 100).addBox(-5.9F, -63.9F, 2.9F, 3.0F, 3.0F, 12.0F, 0.0F, false);
			t = new ModelRenderer(this);
			t.setRotationPoint(0.0F, 24.0F, 0.0F);
			t.setTextureOffset(0, 0).addBox(-8.3F, -46.5F, 11.6F, 17.0F, 3.0F, 3.0F, 0.0F, false);
			cube_r12 = new ModelRenderer(this);
			cube_r12.setRotationPoint(0.0F, 0.0F, 0.0F);
			t.addChild(cube_r12);
			setRotationAngle(cube_r12, 0.3491F, 0.0F, 0.0F);
			cube_r12.setTextureOffset(22, 85).addBox(8.02F, -29.1F, 17.4F, 3.0F, 3.0F, 12.0F, 0.0F, false);
			cube_r12.setTextureOffset(88, 36).addBox(-11.12F, -29.1F, 17.4F, 3.0F, 3.0F, 12.0F, 0.0F, false);
			cube_r13 = new ModelRenderer(this);
			cube_r13.setRotationPoint(0.0F, 0.0F, 0.0F);
			t.addChild(cube_r13);
			setRotationAngle(cube_r13, 0.1745F, 0.0F, -0.1745F);
			cube_r13.setTextureOffset(40, 62).addBox(14.4F, -41.0F, 20.3F, 3.0F, 12.0F, 3.0F, 0.0F, false);
			cube_r14 = new ModelRenderer(this);
			cube_r14.setRotationPoint(0.0F, 0.0F, 0.0F);
			t.addChild(cube_r14);
			setRotationAngle(cube_r14, 0.1745F, 0.0F, 0.1745F);
			cube_r14.setTextureOffset(66, 65).addBox(-17.5F, -41.0F, 20.3F, 3.0F, 12.0F, 3.0F, 0.0F, false);
			cube_r15 = new ModelRenderer(this);
			cube_r15.setRotationPoint(0.0F, 0.0F, 0.0F);
			t.addChild(cube_r15);
			setRotationAngle(cube_r15, 0.0F, 0.0F, -0.7854F);
			cube_r15.setTextureOffset(48, 106).addBox(8.4F, -14.1F, 23.2F, 9.0F, 17.0F, 3.0F, 0.0F, false);
			cube_r15.setTextureOffset(72, 106).addBox(8.4F, -14.1F, 8.7F, 9.0F, 17.0F, 3.0F, 0.0F, false);
			cube_r16 = new ModelRenderer(this);
			cube_r16.setRotationPoint(0.0F, 0.0F, 0.0F);
			t.addChild(cube_r16);
			setRotationAngle(cube_r16, 0.0F, 0.0F, 0.7854F);
			cube_r16.setTextureOffset(106, 18).addBox(-17.7F, -14.1F, 23.2F, 9.0F, 17.0F, 3.0F, 0.0F, false);
			cube_r16.setTextureOffset(96, 106).addBox(-17.7F, -14.1F, 8.7F, 9.0F, 17.0F, 3.0F, 0.0F, false);
			cube_r17 = new ModelRenderer(this);
			cube_r17.setRotationPoint(0.0F, 0.0F, 0.0F);
			t.addChild(cube_r17);
			setRotationAngle(cube_r17, 0.0F, 0.0F, 0.6109F);
			cube_r17.setTextureOffset(106, 6).addBox(-12.1F, -23.3F, 20.3F, 15.0F, 3.0F, 3.0F, 0.0F, false);
			cube_r17.setTextureOffset(106, 91).addBox(-12.1F, -23.3F, 14.5F, 15.0F, 3.0F, 3.0F, 0.0F, false);
			cube_r17.setTextureOffset(106, 38).addBox(-12.1F, -20.4F, 17.4F, 15.0F, 3.0F, 3.0F, 0.0F, false);
			cube_r17.setTextureOffset(106, 97).addBox(-12.1F, -20.4F, 11.6F, 15.0F, 3.0F, 3.0F, 0.0F, false);
			cube_r18 = new ModelRenderer(this);
			cube_r18.setRotationPoint(0.0F, 0.0F, 0.0F);
			t.addChild(cube_r18);
			setRotationAngle(cube_r18, 0.0F, 0.0F, -0.6109F);
			cube_r18.setTextureOffset(88, 51).addBox(-3.4F, -23.3F, 20.3F, 15.0F, 3.0F, 3.0F, 0.0F, false);
			cube_r18.setTextureOffset(106, 0).addBox(-3.4F, -23.3F, 14.5F, 15.0F, 3.0F, 3.0F, 0.0F, false);
			cube_r18.setTextureOffset(92, 80).addBox(-3.4F, -20.4F, 17.4F, 15.0F, 3.0F, 3.0F, 0.0F, false);
			cube_r18.setTextureOffset(108, 57).addBox(-3.4F, -20.4F, 11.6F, 15.0F, 3.0F, 3.0F, 0.0F, false);
			cube_r19 = new ModelRenderer(this);
			cube_r19.setRotationPoint(0.0F, 0.0F, 0.0F);
			t.addChild(cube_r19);
			setRotationAngle(cube_r19, -0.7444F, -0.4798F, 0.0F);
			cube_r19.setTextureOffset(0, 46).addBox(2.9F, -49.7F, -14.5F, 0.0F, 12.0F, 17.0F, 0.0F, false);
			cube_r20 = new ModelRenderer(this);
			cube_r20.setRotationPoint(0.0F, 0.0F, 0.0F);
			t.addChild(cube_r20);
			setRotationAngle(cube_r20, -0.7444F, 0.4798F, -0.0064F);
			cube_r20.setTextureOffset(0, 68).addBox(-2.9F, -49.7F, -14.5F, 0.0F, 12.0F, 17.0F, 0.0F, false);
			cube_r21 = new ModelRenderer(this);
			cube_r21.setRotationPoint(0.0F, 0.0F, 0.0F);
			t.addChild(cube_r21);
			setRotationAngle(cube_r21, -0.0462F, -0.4798F, 0.0F);
			cube_r21.setTextureOffset(0, 0).addBox(2.9F, -63.6F, 14.5F, 0.0F, 23.0F, 17.0F, 0.0F, false);
			cube_r22 = new ModelRenderer(this);
			cube_r22.setRotationPoint(0.0F, 0.0F, 0.0F);
			t.addChild(cube_r22);
			setRotationAngle(cube_r22, -0.0462F, 0.4798F, 0.0F);
			cube_r22.setTextureOffset(0, 23).addBox(-2.9F, -63.6F, 14.5F, 0.0F, 23.0F, 17.0F, 0.0F, false);
			cube_r23 = new ModelRenderer(this);
			cube_r23.setRotationPoint(0.0F, 0.0F, 0.0F);
			t.addChild(cube_r23);
			setRotationAngle(cube_r23, 0.6981F, 0.0F, 0.0F);
			cube_r23.setTextureOffset(70, 18).addBox(-4.65F, -32.2F, 31.9F, 9.0F, 9.0F, 9.0F, 0.0F, false);
			cube_r24 = new ModelRenderer(this);
			cube_r24.setRotationPoint(0.0F, 0.0F, 0.0F);
			t.addChild(cube_r24);
			setRotationAngle(cube_r24, 0.3054F, 0.0F, 0.0F);
			cube_r24.setTextureOffset(34, 0).addBox(-4.65F, -43.5F, 20.3F, 9.0F, 29.0F, 9.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			h.render(matrixStack, buffer, packedLight, packedOverlay);
			t.render(matrixStack, buffer, packedLight, packedOverlay);
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
