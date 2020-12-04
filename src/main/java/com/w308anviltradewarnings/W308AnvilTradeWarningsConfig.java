package com.w308anviltradewarnings;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("w308anviltradewarnings")
public interface W308AnvilTradeWarningsConfig extends Config {
    @ConfigItem(
            keyName = "boolCheckIfInCC",
            name = "Check If Player Is In CC",
            description = "Checks if the player you are trading is in the CC"
//            position = 0
    )
    default boolean boolCheckIfInCC() {
        return true;
    }

    @ConfigItem(
            keyName = "boolCalcTradedItem",
            name = "Calculate Trade Screen",
            description = "Calculates the current trading screen and checks if its OK"
//            position = 0
    )
    default boolean boolCalcTradedItem() {
        return true;
    }
}
