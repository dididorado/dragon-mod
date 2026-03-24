package com.example.dragonmod;

import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, DragonMod.MODID);

    public static final RegistryObject<Item> NIGHTFURY_SPAWN_EGG = ITEMS.register("nightfury_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.NIGHTFURY, 0x0a0a0a, 0x8a00e6,
                    new Item.Properties())
    );

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
