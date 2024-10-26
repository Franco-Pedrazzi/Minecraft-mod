
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.lashuevadas.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.lashuevadas.client.renderer.LorenzoRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class LasHuevadasModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(LasHuevadasModEntities.LORENZO.get(), LorenzoRenderer::new);
	}
}
