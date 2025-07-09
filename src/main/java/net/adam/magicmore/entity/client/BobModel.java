package net.adam.magicmore.entity.client;

import net.adam.magicmore.entity.custom.BobEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;

// Made with Blockbench 4.12.5
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class BobModel<T extends BobEntity> extends SinglePartEntityModel<T> {
	private final ModelPart bob;
	private final ModelPart body;
	public BobModel(ModelPart root) {
		this.bob = root.getChild("bob");
		this.body = this.bob.getChild("body");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData bob = modelPartData.addChild("bob", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData body = bob.addChild("body", ModelPartBuilder.create().uv(0, 0).cuboid(-3.0F, -2.5F, -8.0F, 6.0F, 5.0F, 16.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -2.5F, 0.0F));
		return TexturedModelData.of(modelData, 64, 64);
	}

	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		bob.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart getPart() {
		return null;
	}

	@Override
	public void setAngles(BobEntity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {

	}
}