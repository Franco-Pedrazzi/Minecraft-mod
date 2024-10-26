// Made with Blockbench 4.11.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelCustomModel<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "custommodel"), "main");
	private final ModelPart Body;
	private final ModelPart head;
	private final ModelPart manoderecha;
	private final ModelPart manoizquierda;

	public ModelCustomModel(ModelPart root) {
		this.Body = root.getChild("Body");
		this.head = root.getChild("head");
		this.manoderecha = root.getChild("manoderecha");
		this.manoizquierda = root.getChild("manoizquierda");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(50, 60)
						.addBox(-5.0F, 4.0F, -5.0F, 10.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 63)
						.addBox(-3.0F, -12.0F, -3.0F, 6.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 25)
						.addBox(-7.0F, 0.0F, -7.0F, 14.0F, 4.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(56, 17)
						.addBox(-5.0F, -10.0F, -5.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 17.0F, 0.0F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(56, 0)
				.addBox(-1.0F, -12.0F, -6.0F, 11.0F, 5.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 5.0F, 0.0F));

		PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 43).addBox(-12.0F, -8.0F, -6.0F, 13.0F, 8.0F, 12.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0F, -7.0F, 0.0F, 0.0037F, 0.0117F, 1.1628F));

		PartDefinition cube_r2 = head.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(50, 43).addBox(-12.0F, -5.0F, -6.0F, 13.0F, 5.0F, 12.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0F, -5.0F, 0.0F, 0.0069F, -0.017F, 0.3485F));

		PartDefinition cube_r3 = head
				.addOrReplaceChild("cube_r3",
						CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, -9.0F, -8.0F, 12.0F, 9.0F, 16.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition manoderecha = partdefinition.addOrReplaceChild("manoderecha", CubeListBuilder.create()
				.texOffs(24, 63).addBox(-14.0F, 7.0F, -2.0F, 5.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 5.0F, 0.0F));

		PartDefinition manoizquierda = partdefinition.addOrReplaceChild("manoizquierda", CubeListBuilder.create()
				.texOffs(0, 71).addBox(-14.0F, 7.0F, -2.0F, 5.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(23.0F, 5.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		manoderecha.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		manoizquierda.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}