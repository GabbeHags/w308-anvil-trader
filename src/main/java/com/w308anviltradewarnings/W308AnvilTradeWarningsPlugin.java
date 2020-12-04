package com.w308anviltradewarnings;

import com.google.inject.Provides;

import javax.inject.Inject;

import lombok.extern.slf4j.Slf4j;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.events.WidgetLoaded;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetID;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.api.InventoryID;

import java.util.Arrays;

//TODO
//  check if you are in the cc w308 anvil
//  get the price of r2hs from the Talking name
//  check if the one who is sending a trade request is in the cc
//  

@Slf4j
@PluginDescriptor(
        name = "W308 Anvil Trade Warnings",
        description = "A simple example plugin to illustrate how to write plugin config menus",
        tags = {"trade", "warning", "rune", "high", "alch"},
        loadWhenOutdated = true,
        enabledByDefault = true
)
public class W308AnvilTradeWarningsPlugin extends Plugin {
    @Inject
    private Client client;

    @Inject
    private W308AnvilTradeWarningsConfig config;

    @Override
    protected void startUp() throws Exception {
        log.info("Example started!");
    }

    @Override
    protected void shutDown() throws Exception {
        log.info("Example stopped!");
    }


    @Subscribe
    public void onGameStateChanged(GameStateChanged gameStateChanged) {
        if (gameStateChanged.getGameState() == GameState.LOGGED_IN) {
            client.addChatMessage(ChatMessageType.GAMEMESSAGE, "", "boolCheckIfInCC() is " + config.boolCheckIfInCC(), null);
            client.addChatMessage(ChatMessageType.GAMEMESSAGE, "", "boolCalcTradedItem() is " + config.boolCalcTradedItem(), null);

        }
    }
    @Subscribe
    public void onWidgetLoaded(WidgetLoaded widget) {
        if (widget.getGroupId() == WidgetID.PLAYER_TRADE_INVENTORY_GROUP_ID) {

            System.out.println(InventoryID.TRADEOTHER);
        }
    }

    @Provides
    W308AnvilTradeWarningsConfig provideConfig(ConfigManager configManager) {
        return configManager.getConfig(W308AnvilTradeWarningsConfig.class);
    }
}
