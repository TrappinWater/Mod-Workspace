// Made with Blockbench 4.0.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelrunner extends EntityModel<Entity> {
	private final ModelRenderer ll;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer rl;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer t;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;
	private final ModelRenderer cube_r17;
	private final ModelRenderer h;

	public Modelrunner() {
		textureWidth = 64;
		textureHeight = 64;

		ll = new ModelRenderer(this);
		ll.setRotationPoint(5.6556F, 0.1466F, 6.9772F);
		ll.setTextureOffset(32, 42).addBox(-1.0556F, 21.8534F, -9.1772F, 2.0F, 2.0F, 4.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-5.6556F, 23.8534F, -6.9772F);
		ll.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.5236F, 0.0F);
		cube_r1.setTextureOffset(4, 39).addBox(2.4F, -2.0F, 0.0F, 2.0F, 2.0F, 4.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-5.6556F, 23.8534F, -6.9772F);
		ll.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, -0.5236F, 0.0F);
		cube_r2.setTextureOffset(16, 39).addBox(5.8F, -2.0F, -5.4F, 2.0F, 2.0F, 4.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-5.6556F, 23.8534F, -6.9772F);
		ll.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.48F, 0.0F, 0.0F);
		cube_r3.setTextureOffset(28, 8).addBox(4.6F, -24.2F, -6.6F, 2.0F, 11.0F, 2.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-5.6556F, 23.8534F, -6.9772F);
		ll.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.3491F, 0.0F, 0.0F);
		cube_r4.setTextureOffset(28, 21).addBox(4.6F, -13.2F, 6.6F, 2.0F, 11.0F, 2.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-5.6556F, 23.8534F, -6.9772F);
		ll.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.6109F, 0.0F, 0.0F);
		cube_r5.setTextureOffset(28, 34).addBox(4.6F, -9.0F, 0.0F, 2.0F, 9.0F, 2.0F, 0.0F, false);

		rl = new ModelRenderer(this);
		rl.setRotationPoint(-5.3444F, 1.1466F, 5.9772F);
		rl.setTextureOffset(36, 36).addBox(-1.0556F, 20.8534F, -8.1772F, 2.0F, 2.0F, 4.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-5.6556F, 22.8534F, -5.9772F);
		rl.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.5236F, 0.0F);
		cube_r6.setTextureOffset(34, 30).addBox(2.4F, -2.0F, 0.0F, 2.0F, 2.0F, 4.0F, 0.0F, false);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-5.6556F, 22.8534F, -5.9772F);
		rl.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, -0.5236F, 0.0F);
		cube_r7.setTextureOffset(36, 24).addBox(5.8F, -2.0F, -5.4F, 2.0F, 2.0F, 4.0F, 0.0F, false);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-5.6556F, 22.8534F, -5.9772F);
		rl.addChild(cube_r8);
		setRotationAngle(cube_r8, -0.48F, 0.0F, 0.0F);
		cube_r8.setTextureOffset(12, 26).addBox(4.6F, -24.2F, -6.6F, 2.0F, 11.0F, 2.0F, 0.0F, false);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-5.6556F, 22.8534F, -5.9772F);
		rl.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.3491F, 0.0F, 0.0F);
		cube_r9.setTextureOffset(20, 26).addBox(4.6F, -13.2F, 6.6F, 2.0F, 11.0F, 2.0F, 0.0F, false);

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-5.6556F, 22.8534F, -5.9772F);
		rl.addChild(cube_r10);
		setRotationAngle(cube_r10, -0.6109F, 0.0F, 0.0F);
		cube_r10.setTextureOffset(0, 32).addBox(4.6F, -9.0F, 0.0F, 2.0F, 9.0F, 2.0F, 0.0F, false);

		t = new ModelRenderer(this);
		t.setRotationPoint(0.15F, -10.8493F, 6.5077F);
		t.setTextureOffset(0, 17).addBox(-1.95F, -7.9507F, -6.5077F, 4.0F, 2.0F, 4.0F, 0.0F, false);

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-0.15F, 34.8493F, -6.5077F);
		t.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.5672F, 0.0F, 0.0F);
		cube_r11.setTextureOffset(0, 0).addBox(-0.9F, -35.0F, 15.4F, 2.0F, 2.0F, 9.0F, 0.0F, false);

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-0.15F, 34.8493F, -6.5077F);
		t.addChild(cube_r12);
		setRotationAngle(cube_r12, 1.0472F, 0.0F, 0.0F);
		cube_r12.setTextureOffset(36, 6).addBox(-1.8F, -17.2F, 37.4F, 4.0F, 4.0F, 2.0F, 0.0F, false);

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-0.15F, 34.8493F, -6.5077F);
		t.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.7854F, 0.0F, 0.0F);
		cube_r13.setTextureOffset(36, 12).addBox(-1.8F, -23.8F, 33.0F, 4.0F, 4.0F, 2.0F, 0.0F, false);

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-0.15F, 34.8493F, -6.5077F);
		t.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.3054F, 0.0F, 0.0F);
		cube_r14.setTextureOffset(16, 17).addBox(-1.8F, -35.6F, 19.8F, 4.0F, 7.0F, 2.0F, 0.0F, false);

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-0.15F, 34.8493F, -6.5077F);
		t.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0436F, 0.0F, 0.0F);
		cube_r15.setTextureOffset(36, 18).addBox(-1.8F, -32.6F, 11.0F, 4.0F, 4.0F, 2.0F, 0.0F, false);

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(-0.15F, 34.8493F, -6.5077F);
		t.addChild(cube_r16);
		setRotationAngle(cube_r16, -0.2182F, 0.0F, 0.0F);
		cube_r16.setTextureOffset(0, 23).addBox(-1.8F, -31.2F, 2.2F, 4.0F, 7.0F, 2.0F, 0.0F, false);

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(-0.15F, 34.8493F, -6.5077F);
		t.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.3927F, 0.0F, 0.0F);
		cube_r17.setTextureOffset(0, 11).addBox(-4.6F, -19.6F, 13.2F, 9.0F, 2.0F, 4.0F, 0.0F, false);

		h = new ModelRenderer(this);
		h.setRotationPoint(0.2F, -14.9F, -5.1F);
		h.setTextureOffset(35, 0).addBox(-2.0F, -0.3F, -1.5F, 4.0F, 4.0F, 2.0F, 0.0F, false);
		h.setTextureOffset(13, 0).addBox(-3.5F, -3.7F, -1.5F, 7.0F, 4.0F, 4.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		ll.render(matrixStack, buffer, packedLight, packedOverlay);
		rl.render(matrixStack, buffer, packedLight, packedOverlay);
		t.render(matrixStack, buffer, packedLight, packedOverlay);
		h.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.ll.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.h.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.h.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.rl.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}