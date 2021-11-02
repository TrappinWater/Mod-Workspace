// Made with Blockbench 4.0.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modeleye extends EntityModel<Entity> {
	private final ModelRenderer eye;
	private final ModelRenderer cube_r1;
	private final ModelRenderer ring1;
	private final ModelRenderer ring2;
	private final ModelRenderer ring3;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;

	public Modeleye() {
		textureWidth = 128;
		textureHeight = 128;

		eye = new ModelRenderer(this);
		eye.setRotationPoint(0.0F, -12.3453F, -1.6F);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 36.3453F, 1.6F);
		eye.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.7854F);
		cube_r1.setTextureOffset(42, 37).addBox(-31.5F, -31.5F, -9.6F, 13.0F, 13.0F, 16.0F, 0.0F, false);

		ring1 = new ModelRenderer(this);
		ring1.setRotationPoint(0.1F, -11.1F, -1.4F);
		ring1.setTextureOffset(0, 24).addBox(-9.5F, -9.5F, -5.0F, 19.0F, 19.0F, 10.0F, 0.0F, false);

		ring2 = new ModelRenderer(this);
		ring2.setRotationPoint(0.05F, -11.15F, -1.7F);
		ring2.setTextureOffset(48, 28).addBox(-16.05F, 12.95F, -0.5F, 32.0F, 3.0F, 1.0F, 0.0F, false);
		ring2.setTextureOffset(48, 24).addBox(-16.05F, -15.85F, -0.5F, 32.0F, 3.0F, 1.0F, 0.0F, false);
		ring2.setTextureOffset(8, 53).addBox(-15.85F, -16.05F, -0.5F, 3.0F, 32.0F, 1.0F, 0.0F, false);
		ring2.setTextureOffset(0, 53).addBox(12.95F, -16.05F, -0.5F, 3.0F, 32.0F, 1.0F, 0.0F, false);

		ring3 = new ModelRenderer(this);
		ring3.setRotationPoint(0.1945F, -9.1456F, -1.7F);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-0.1945F, 33.1456F, 1.7F);
		ring3.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 2.3562F);
		cube_r2.setTextureOffset(0, 0).addBox(-48.0F, 45.0F, -3.2F, 48.0F, 3.0F, 3.0F, 0.0F, false);
		cube_r2.setTextureOffset(0, 12).addBox(-45.0F, 0.2F, -3.2F, 45.0F, 3.0F, 3.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-0.1945F, 33.1456F, 1.7F);
		ring3.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, 0.7854F);
		cube_r3.setTextureOffset(0, 6).addBox(-45.0F, -47.8F, -3.2F, 45.0F, 3.0F, 3.0F, 0.0F, false);
		cube_r3.setTextureOffset(0, 18).addBox(-45.0F, -3.0F, -3.2F, 45.0F, 3.0F, 3.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		eye.render(matrixStack, buffer, packedLight, packedOverlay);
		ring1.render(matrixStack, buffer, packedLight, packedOverlay);
		ring2.render(matrixStack, buffer, packedLight, packedOverlay);
		ring3.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.ring3.rotateAngleZ = f2 / 20.f;
		this.ring2.rotateAngleZ = f2;
		this.ring1.rotateAngleZ = f2 / 20.f;
	}
}