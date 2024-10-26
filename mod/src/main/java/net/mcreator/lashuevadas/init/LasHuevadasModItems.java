
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.lashuevadas.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;

import net.mcreator.lashuevadas.LasHuevadasMod;

public class LasHuevadasModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, LasHuevadasMod.MODID);
	public static final RegistryObject<Item> LORENZO_SPAWN_EGG = REGISTRY.register("lorenzo_spawn_egg", () -> new ForgeSpawnEggItem(LasHuevadasModEntities.LORENZO, -1, -1, new Item.Properties()));
	// Start of user code block custom items
	// End of user code block custom items
}
