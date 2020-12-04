package com.w308anviltrader;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("w308anviltrader")
public interface W308AnvilTraderConfig extends Config {
    @ConfigItem(
            keyName = "boolCheckIfInCC",
            name = "Check if player is in clan chat",
            description = "Checks if the player you are trading is in the CC"
//            position = 0
    )
    default boolean boolCheckIfInCC() {
        return true;
    }

    @ConfigItem(
            keyName = "boolCalcTradedItem",
            name = "Calculate trade screen",
            description = "Calculates the current trading screen and checks if its OK"
//            position = 0
    )
    default boolean boolCalcTradedItem() {
        return true;
    }
}
