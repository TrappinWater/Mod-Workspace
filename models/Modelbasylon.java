// Made with Blockbench 4.0.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelbasylon extends EntityModel<Entity> {
	private final ModelRenderer ll;
	private final ModelRenderer rl;
	private final ModelRenderer t;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer h;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer la;
	private final ModelRenderer ra;
	private final ModelRenderer cube_r7;

	public Modelbasylon() {
		textureWidth = 128;
		textureHeight = 128;

		ll = new ModelRenderer(this);
		ll.setRotationPoint(6.0F, -3.5F, 3.0F);
		ll.setTextureOffset(90, 66).addBox(-3.0F, 0.5F, -3.0F, 6.0F, 27.0F, 6.0F, 0.0F, false);

		rl = new ModelRenderer(this);
		rl.setRotationPoint(-6.0F, -3.5F, 3.0F);
		rl.setTextureOffset(24, 81).addBox(-3.0F, 0.5F, -3.0F, 6.0F, 27.0F, 6.0F, 0.0F, false);

		t = new ModelRenderer(this);
		t.setRotationPoint(0.0F, -20.5903F, 3.0F);
		t.setTextureOffset(39, 45).addBox(-12.0F, -12.4097F, -6.0F, 24.0F, 9.0F, 12.0F, 0.0F, false);
		t.setTextureOffset(0, 0).addBox(-6.0F, -3.4097F, -3.0F, 12.0F, 21.0F, 6.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 44.5903F, -3.0F);
		t.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.48F);
		cube_r1.setTextureOffset(0, 45).addBox(-18.0F, -48.0F, 0.0F, 6.0F, 12.0F, 6.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 44.5903F, -3.0F);
		t.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.48F);
		cube_r2.setTextureOffset(48, 0).addBox(12.0F, -48.0F, 0.0F, 6.0F, 12.0F, 6.0F, 0.0F, false);

		h = new ModelRenderer(this);
		h.setRotationPoint(0.0F, -33.7423F, -1.5F);
		h.setTextureOffset(82, 0).addBox(-4.5F, -8.2577F, -4.5F, 9.0F, 9.0F, 9.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, 57.7423F, 1.5F);
		h.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -0.3491F);
		cube_r3.setTextureOffset(0, 27).addBox(27.0F, -72.0F, -3.0F, 3.0F, 9.0F, 3.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, 57.7423F, 1.5F);
		h.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, 0.3491F);
		cube_r4.setTextureOffset(12, 27).addBox(-30.0F, -72.0F, -3.0F, 3.0F, 9.0F, 3.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, 57.7423F, 1.5F);
		h.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, -0.3927F);
		cube_r5.setTextureOffset(24, 27).addBox(21.0F, -66.0F, -3.0F, 3.0F, 9.0F, 3.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, 57.7423F, 1.5F);
		h.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, 0.3927F);
		cube_r6.setTextureOffset(39, 45).addBox(-24.0F, -66.0F, -3.0F, 3.0F, 9.0F, 3.0F, 0.0F, false);

		la = new ModelRenderer(this);
		la.setRotationPoint(15.0F, -29.0F, 3.0F);
		la.setTextureOffset(0, 81).addBox(-3.0F, -1.0F, -3.0F, 6.0F, 30.0F, 6.0F, 0.0F, false);

		ra = new ModelRenderer(this);
		ra.setRotationPoint(-15.0F, -27.375F, 3.25F);
		ra.setTextureOffset(66, 66).addBox(-3.0F, -2.625F, -3.25F, 6.0F, 30.0F, 6.0F, 0.0F, false);
		ra.setTextureOffset(0, 0).addBox(-1.5F, 21.375F, -27.25F, 3.0F, 3.0F, 42.0F, 0.0F, false);
		ra.setTextureOffset(0, 45).addBox(-3.0F, 24.375F, -36.25F, 6.0F, 9.0F, 27.0F, 0.0F, false);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-15.0F, 51.375F, -3.25F);
		ra.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, 0.7854F);
		cube_r7.setTextureOffset(48, 0).addBox(-4.5F, -25.6F, -33.0F, 4.0F, 4.0F, 26.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		ll.render(matrixStack, buffer, packedLight, packedOverlay);
		rl.render(matrixStack, buffer, packedLight, packedOverlay);
		t.render(matrixStack, buffer, packedLight, packedOverlay);
		h.render(matrixStack, buffer, packedLight, packedOverlay);
		la.render(matrixStack, buffer, packedLight, packedOverlay);
		ra.render(matrixStack, buffer, packedLight, packedOverlay);
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
		this.ra.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.la.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.rl.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}