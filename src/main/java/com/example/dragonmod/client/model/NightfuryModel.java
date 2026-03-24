package com.example.dragonmod.client.model;

import com.example.dragonmod.DragonMod;
import com.example.dragonmod.entity.NightfuryEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class NightfuryModel extends GeoModel<NightfuryEntity> {

    @Override
    public ResourceLocation getModelResource(NightfuryEntity entity) {
        return new ResourceLocation(DragonMod.MODID, "geo/nightfury.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(NightfuryEntity entity) {
        return new ResourceLocation(DragonMod.MODID, "textures/entity/nightfury_0.png");
    }

    @Override
    public ResourceLocation getAnimationResource(NightfuryEntity entity) {
        return new ResourceLocation(DragonMod.MODID, "animations/nightfury.animation.json");
    }
}
