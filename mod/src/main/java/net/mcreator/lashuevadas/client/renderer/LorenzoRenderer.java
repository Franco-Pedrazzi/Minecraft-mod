
package net.mcreator.lashuevadas.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.lashuevadas.entity.LorenzoEntity;
import net.mcreator.lashuevadas.client.model.ModelCustomModel;

public class LorenzoRenderer extends MobRenderer<LorenzoEntity, ModelCustomModel<LorenzoEntity>> {
	public LorenzoRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelCustomModel(context.bakeLayer(ModelCustomModel.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(LorenzoEntity entity) {
		return new ResourceLocation("las_huevadas:textures/entities/piel.png");
	}
}
