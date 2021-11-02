// Made with Blockbench 4.0.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelmalformed extends EntityModel<Entity> {
	private final ModelRenderer frontright;
	private final ModelRenderer cube_r1;
	private final ModelRenderer frontleft;
	private final ModelRenderer backleft;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer backright;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer torso;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer head1;
	private final ModelRenderer head2;
	private final ModelRenderer cube_r8;
	private final ModelRenderer rightarm1;
	private final ModelRenderer rightarm2;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;

	public Modelmalformed() {
		textureWidth = 16;
		textureHeight = 16;

		frontright = new ModelRenderer(this);
		frontright.setRotationPoint(-6.5F, 0.6972F, -4.8886F);
		frontright.setTextureOffset(0, 0).addBox(-1.5F, -2.1972F, -0.1114F, 3.0F, 13.0F, 3.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(1.5F, 23.3028F, 4.8886F);
		frontright.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.3491F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(0, 0).addBox(-3.0F, -12.5F, -10.0F, 3.0F, 15.0F, 3.0F, 0.0F, false);

		frontleft = new ModelRenderer(this);
		frontleft.setRotationPoint(3.5F, -0.5F, -6.0F);
		frontleft.setTextureOffset(0, 0).addBox(-1.5F, -0.5F, -1.5F, 3.0F, 25.0F, 3.0F, 0.0F, false);

		backleft = new ModelRenderer(this);
		backleft.setRotationPoint(3.5F, 0.1796F, 13.3519F);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-3.5F, 23.8204F, -13.3519F);
		backleft.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.4363F, 0.0F, 0.0F);
		cube_r2.setTextureOffset(0, 0).addBox(2.0F, -8.0F, 15.0F, 3.0F, 8.0F, 3.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-3.5F, 23.8204F, -13.3519F);
		backleft.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.2182F, 0.0F, 0.0F);
		cube_r3.setTextureOffset(0, 0).addBox(2.0F, -28.0F, 7.5F, 3.0F, 13.0F, 3.0F, 0.0F, false);

		backright = new ModelRenderer(this);
		backright.setRotationPoint(-6.5F, -0.1265F, 8.1044F);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(6.5F, 24.1265F, -8.1044F);
		backright.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.48F, 0.0F, 0.0F);
		cube_r4.setTextureOffset(0, 0).addBox(-8.0F, -27.5F, -5.0F, 3.0F, 10.0F, 3.0F, 0.0F, false);
		cube_r4.setTextureOffset(0, 0).addBox(-8.0F, -10.5F, 5.0F, 3.0F, 8.0F, 3.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(6.5F, 24.1265F, -8.1044F);
		backright.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.3054F, 0.0F, 0.0F);
		cube_r5.setTextureOffset(0, 0).addBox(-8.0F, -15.5F, 10.0F, 3.0F, 13.0F, 3.0F, 0.0F, false);

		torso = new ModelRenderer(this);
		torso.setRotationPoint(-1.3333F, -7.8557F, 1.9816F);
		torso.setTextureOffset(0, 0).addBox(-3.6667F, 6.3557F, -6.9816F, 10.0F, 3.0F, 3.0F, 0.0F, false);
		torso.setTextureOffset(0, 0).addBox(-6.6667F, 6.3557F, 8.0184F, 13.0F, 3.0F, 3.0F, 0.0F, false);
		torso.setTextureOffset(0, 0).addBox(-1.6667F, 6.3557F, -6.9816F, 3.0F, 3.0F, 18.0F, 0.0F, false);
		torso.setTextureOffset(0, 0).addBox(-6.6667F, -8.6443F, 0.5184F, 13.0F, 3.0F, 3.0F, 0.0F, false);
		torso.setTextureOffset(0, 0).addBox(0.8333F, 6.8557F, -1.9816F, 3.0F, 5.0F, 3.0F, 0.0F, false);
		torso.setTextureOffset(0, 0).addBox(0.8333F, 6.8557F, 3.0184F, 3.0F, 5.0F, 3.0F, 0.0F, false);
		torso.setTextureOffset(0, 0).addBox(3.8333F, -8.6443F, -4.4816F, 0.0F, 3.0F, 5.0F, 0.0F, false);
		torso.setTextureOffset(0, 0).addBox(-3.6667F, -8.6443F, -4.4816F, 0.0F, 3.0F, 5.0F, 0.0F, false);
		torso.setTextureOffset(0, 0).addBox(-3.6667F, -3.6443F, -4.4816F, 0.0F, 3.0F, 5.0F, 0.0F, false);
		torso.setTextureOffset(0, 0).addBox(-4.1667F, -8.6443F, -4.4816F, 8.0F, 3.0F, 0.0F, 0.0F, false);
		torso.setTextureOffset(0, 0).addBox(-4.1667F, -3.6443F, -4.4816F, 8.0F, 3.0F, 0.0F, 0.0F, false);
		torso.setTextureOffset(0, 0).addBox(-3.6667F, -3.6443F, -1.9816F, 5.0F, 3.0F, 3.0F, 0.0F, false);
		torso.setTextureOffset(0, 0).addBox(-1.6667F, 3.8557F, 3.0184F, 3.0F, 3.0F, 3.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(1.3333F, 31.8557F, -1.9816F);
		torso.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.2618F, 0.0F, 0.0F);
		cube_r6.setTextureOffset(0, 0).addBox(-3.0F, -45.5F, 12.5F, 3.0F, 8.0F, 3.0F, 0.0F, false);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(1.3333F, 31.8557F, -1.9816F);
		torso.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.2618F, 0.0F, 0.0F);
		cube_r7.setTextureOffset(0, 0).addBox(-3.0F, -40.5F, -10.0F, 3.0F, 18.0F, 3.0F, 0.0F, false);

		head1 = new ModelRenderer(this);
		head1.setRotationPoint(-0.3341F, -21.4581F, 0.4405F);
		setRotationAngle(head1, 0.0F, -0.0436F, -0.0873F);
		head1.setTextureOffset(0, 0).addBox(-2.625F, -0.75F, -4.0F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		head1.setTextureOffset(0, 0).addBox(-3.375F, -5.25F, -4.0F, 5.0F, 5.0F, 5.0F, 0.0F, false);

		head2 = new ModelRenderer(this);
		head2.setRotationPoint(-8.5516F, -0.5029F, 7.3F);
		head2.setTextureOffset(0, 0).addBox(5.5516F, -5.9971F, -2.3F, 13.0F, 3.0F, 5.0F, 0.0F, false);
		head2.setTextureOffset(0, 0).addBox(5.5516F, -10.4971F, -2.3F, 3.0F, 5.0F, 5.0F, 0.0F, false);
		head2.setTextureOffset(0, 0).addBox(8.0516F, -12.9971F, -2.3F, 3.0F, 5.0F, 5.0F, 0.0F, false);
		head2.setTextureOffset(0, 0).addBox(10.5516F, -10.9971F, -2.3F, 8.0F, 3.0F, 5.0F, 0.0F, false);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(8.5516F, 24.5029F, -7.3F);
		head2.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, 0.7854F);
		cube_r8.setTextureOffset(0, 0).addBox(-17.0F, -27.0F, 5.25F, 2.0F, 2.0F, 0.0F, 0.0F, false);
		cube_r8.setTextureOffset(0, 0).addBox(-23.5F, -25.5F, 9.25F, 2.0F, 2.0F, 0.0F, 0.0F, false);
		cube_r8.setTextureOffset(0, 0).addBox(-22.5F, -26.5F, 9.25F, 2.0F, 2.0F, 0.0F, 0.0F, false);
		cube_r8.setTextureOffset(0, 0).addBox(-21.5F, -27.5F, 9.25F, 2.0F, 2.0F, 0.0F, 0.0F, false);
		cube_r8.setTextureOffset(0, 0).addBox(-20.5F, -28.5F, 9.25F, 2.0F, 2.0F, 0.0F, 0.0F, false);
		cube_r8.setTextureOffset(0, 0).addBox(-19.5F, -29.5F, 9.25F, 2.0F, 2.0F, 0.0F, 0.0F, false);
		cube_r8.setTextureOffset(0, 0).addBox(-18.5F, -30.5F, 9.25F, 2.0F, 2.0F, 0.0F, 0.0F, false);
		cube_r8.setTextureOffset(0, 0).addBox(-18.5F, -30.5F, 5.25F, 2.0F, 2.0F, 0.0F, 0.0F, false);
		cube_r8.setTextureOffset(0, 0).addBox(-19.5F, -29.5F, 5.25F, 2.0F, 2.0F, 0.0F, 0.0F, false);
		cube_r8.setTextureOffset(0, 0).addBox(-20.5F, -28.5F, 5.25F, 2.0F, 2.0F, 0.0F, 0.0F, false);
		cube_r8.setTextureOffset(0, 0).addBox(-21.5F, -27.5F, 5.25F, 2.0F, 2.0F, 0.0F, 0.0F, false);
		cube_r8.setTextureOffset(0, 0).addBox(-22.5F, -26.5F, 5.25F, 2.0F, 2.0F, 0.0F, 0.0F, false);
		cube_r8.setTextureOffset(0, 0).addBox(-23.5F, -25.5F, 5.25F, 2.0F, 2.0F, 0.0F, 0.0F, false);
		cube_r8.setTextureOffset(0, 0).addBox(-20.5F, -23.5F, 5.25F, 2.0F, 2.0F, 0.0F, 0.0F, false);
		cube_r8.setTextureOffset(0, 0).addBox(-21.5F, -22.5F, 5.25F, 2.0F, 2.0F, 0.0F, 0.0F, false);
		cube_r8.setTextureOffset(0, 0).addBox(-21.5F, -22.5F, 9.25F, 2.0F, 2.0F, 0.0F, 0.0F, false);
		cube_r8.setTextureOffset(0, 0).addBox(-20.5F, -23.5F, 9.25F, 2.0F, 2.0F, 0.0F, 0.0F, false);
		cube_r8.setTextureOffset(0, 0).addBox(-18.5F, -25.5F, 9.25F, 2.0F, 2.0F, 0.0F, 0.0F, false);
		cube_r8.setTextureOffset(0, 0).addBox(-17.5F, -26.5F, 9.25F, 2.0F, 2.0F, 0.0F, 0.0F, false);
		cube_r8.setTextureOffset(0, 0).addBox(-16.5F, -27.5F, 9.25F, 2.0F, 2.0F, 0.0F, 0.0F, false);
		cube_r8.setTextureOffset(0, 0).addBox(-16.5F, -27.5F, 5.25F, 2.0F, 2.0F, 0.0F, 0.0F, false);
		cube_r8.setTextureOffset(0, 0).addBox(-17.5F, -26.5F, 5.25F, 2.0F, 2.0F, 0.0F, 0.0F, false);
		cube_r8.setTextureOffset(0, 0).addBox(-18.5F, -25.5F, 5.25F, 2.0F, 2.0F, 0.0F, 0.0F, false);
		cube_r8.setTextureOffset(0, 0).addBox(-19.5F, -24.5F, 5.25F, 2.0F, 2.0F, 0.0F, 0.0F, false);
		cube_r8.setTextureOffset(0, 0).addBox(-19.5F, -24.5F, 9.5F, 2.0F, 2.0F, 0.0F, 0.0F, false);
		cube_r8.setTextureOffset(0, 0).addBox(-17.0F, -27.0F, 9.5F, 2.0F, 2.0F, 0.0F, 0.0F, false);

		rightarm1 = new ModelRenderer(this);
		rightarm1.setRotationPoint(-9.0F, -15.0F, 4.0F);
		rightarm1.setTextureOffset(0, 0).addBox(-1.5F, -1.0F, -1.5F, 3.0F, 20.0F, 3.0F, 0.0F, false);

		rightarm2 = new ModelRenderer(this);
		rightarm2.setRotationPoint(-8.1715F, -15.3437F, 3.7888F);
		rightarm2.setTextureOffset(0, 0).addBox(-8.8285F, 1.3437F, -14.7888F, 1.0F, 1.0F, 3.0F, 0.0F, false);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(8.1715F, 39.3437F, -3.7888F);
		rightarm2.addChild(cube_r9);
		setRotationAngle(cube_r9, 1.0472F, -0.2618F, 0.1745F);
		cube_r9.setTextureOffset(0, 0).addBox(-24.0F, -22.0F, 23.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(8.1715F, 39.3437F, -3.7888F);
		rightarm2.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.6981F, 0.0F, 0.0F);
		cube_r10.setTextureOffset(0, 0).addBox(-17.0F, -33.0F, 14.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(8.1715F, 39.3437F, -3.7888F);
		rightarm2.addChild(cube_r11);
		setRotationAngle(cube_r11, -0.3054F, -0.0873F, 0.0F);
		cube_r11.setTextureOffset(0, 0).addBox(-15.0F, -33.0F, -22.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(8.1715F, 39.3437F, -3.7888F);
		rightarm2.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, -0.2618F, 0.1745F);
		cube_r12.setTextureOffset(0, 0).addBox(-23.0F, -35.0F, -6.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(8.1715F, 39.3437F, -3.7888F);
		rightarm2.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.9599F, 0.0F, 0.0F);
		cube_r13.setTextureOffset(0, 0).addBox(-17.0F, -32.0F, 21.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(8.1715F, 39.3437F, -3.7888F);
		rightarm2.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.5236F, -0.1309F, 0.0F);
		cube_r14.setTextureOffset(0, 0).addBox(-18.0F, -36.5F, 12.5F, 3.0F, 3.0F, 10.0F, 0.0F, false);

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(8.1715F, 39.3437F, -3.7888F);
		rightarm2.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, -0.3927F, 0.3491F);
		cube_r15.setTextureOffset(0, 0).addBox(-27.5F, -36.5F, 10.0F, 10.0F, 3.0F, 3.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		frontright.render(matrixStack, buffer, packedLight, packedOverlay);
		frontleft.render(matrixStack, buffer, packedLight, packedOverlay);
		backleft.render(matrixStack, buffer, packedLight, packedOverlay);
		backright.render(matrixStack, buffer, packedLight, packedOverlay);
		torso.render(matrixStack, buffer, packedLight, packedOverlay);
		head1.render(matrixStack, buffer, packedLight, packedOverlay);
		head2.render(matrixStack, buffer, packedLight, packedOverlay);
		rightarm1.render(matrixStack, buffer, packedLight, packedOverlay);
		rightarm2.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.frontright.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.rightarm2.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.backright.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.rightarm1.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.frontleft.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.head1.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head1.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.head2.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head2.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.backleft.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
	}
}