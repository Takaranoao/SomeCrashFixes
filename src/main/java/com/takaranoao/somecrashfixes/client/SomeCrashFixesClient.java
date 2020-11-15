package com.takaranoao.somecrashfixes.client;

import net.fabricmc.api.ClientModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@net.fabricmc.api.Environment(net.fabricmc.api.EnvType.CLIENT)
public class SomeCrashFixesClient implements ClientModInitializer {
    public static final Logger LOGGER = LogManager.getLogger();
    @Override
    public void onInitializeClient() {

    }
}
