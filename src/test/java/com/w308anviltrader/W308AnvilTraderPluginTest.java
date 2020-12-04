package com.w308anviltrader;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;


public class W308AnvilTraderPluginTest {
    public static void main(String[] args) throws Exception {
        ExternalPluginManager.loadBuiltin(W308AnvilTraderPlugin.class);
        RuneLite.main(args);
    }
}

