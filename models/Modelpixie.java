// Made with Blockbench 4.0.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelpixie extends EntityModel<Entity> {
	private final ModelRenderer t;
	private final ModelRenderer rw;
	private final ModelRenderer cube_r1;
	private final ModelRenderer lw;
	private final ModelRenderer cube_r2;

	public Modelpixie() {
		textureWidth = 16;
		textureHeight = 16;

		t = new ModelRenderer(this);
		t.setRotationPoint(0.0F, 17.0F, 1.0F);
		t.setTextureOffset(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		rw = new ModelRenderer(this);
		rw.setRotationPoint(-1.2679F, 16.5F, 1.7189F);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(1.2679F, 7.5F, -1.7189F);
		rw.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, -0.4363F, 0.0F);
		cube_r1.setTextureOffset(4, 2).addBox(0.0F, -10.0F, 2.0F, 0.0F, 5.0F, 2.0F, 0.0F, false);

		lw = new ModelRenderer(this);
		lw.setRotationPoint(1.2679F, 16.5F, 1.7189F);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-1.2679F, 7.5F, -1.7189F);
		lw.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.4363F, 0.0F);
		cube_r2.setTextureOffset(0, 2).addBox(0.0F, -10.0F, 2.0F, 0.0F, 5.0F, 2.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		t.render(matrixStack, buffer, packedLight, packedOverlay);
		rw.render(matrixStack, buffer, packedLight, packedOverlay);
		lw.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
	}
}