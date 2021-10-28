// Made with Blockbench 4.0.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelinfernosentry extends EntityModel<Entity> {
	private final ModelRenderer bone;
	private final ModelRenderer bone2;
	private final ModelRenderer cube_r1;

	public Modelinfernosentry() {
		textureWidth = 64;
		textureHeight = 64;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone.setTextureOffset(0, 0).addBox(-5.0F, -3.0F, -5.0F, 10.0F, 3.0F, 13.0F, 0.0F, false);
		bone.setTextureOffset(36, 26).addBox(-5.5F, -17.5F, 0.0F, 3.0F, 15.0F, 3.0F, 0.0F, false);
		bone.setTextureOffset(24, 26).addBox(2.0F, -17.5F, 0.0F, 3.0F, 15.0F, 3.0F, 0.0F, false);
		bone.setTextureOffset(33, 6).addBox(-2.5F, -15.5F, 0.0F, 5.0F, 3.0F, 3.0F, 0.0F, false);
		bone.setTextureOffset(33, 0).addBox(-2.5F, -8.0F, 0.0F, 5.0F, 3.0F, 3.0F, 0.0F, false);
		bone.setTextureOffset(12, 16).addBox(-1.75F, -25.5F, 6.25F, 3.0F, 23.0F, 3.0F, 0.0F, false);
		bone.setTextureOffset(0, 16).addBox(-1.75F, -25.5F, -6.25F, 3.0F, 23.0F, 3.0F, 0.0F, false);

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, -0.3068F, 1.3258F);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 24.3068F, -1.3258F);
		bone2.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.7854F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(24, 16).addBox(-2.5F, -20.625F, -18.75F, 5.0F, 5.0F, 5.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		bone.render(matrixStack, buffer, packedLight, packedOverlay);
		bone2.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.bone2.rotateAngleX = f2 / 20.f;
	}
}