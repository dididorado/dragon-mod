package com.example.dragonmod.client.renderer;

import com.example.dragonmod.client.model.NightfuryModel;
import com.example.dragonmod.entity.NightfuryEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class NightfuryRenderer extends GeoEntityRenderer<NightfuryEntity> {

    public NightfuryRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new NightfuryModel());

        this.shadowRadius = 2.0F;
    }
}
