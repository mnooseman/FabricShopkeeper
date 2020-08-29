package io.github.mnooseman.fabricshopkeeper;

import net.fabricmc.api.ModInitializer;

public class FabricShopkeeper implements ModInitializer {

    public static final String MODID = "fabricshopkeeper";
    @Override
    public void onInitialize() {
        System.out.println(MODID + " Initialized!");
    }
}
