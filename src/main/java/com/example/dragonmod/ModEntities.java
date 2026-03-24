package com.example.dragonmod;

import com.example.dragonmod.entity.NightfuryEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {

    public static final DeferredRegister<EntityType<?>> ENTITIES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, DragonMod.MODID);

    public static final RegistryObject<EntityType<NightfuryEntity>> NIGHTFURY =
            ENTITIES.register("nightfury",
                    () -> EntityType.Builder.of(NightfuryEntity::new, MobCategory.CREATURE)
                            .sized(2.0F, 2.0F)
                            .clientTrackingRange(10)
                            .build("nightfury")
            );

    public static void register(IEventBus eventBus) {
        ENTITIES.register(eventBus);
    }
}
