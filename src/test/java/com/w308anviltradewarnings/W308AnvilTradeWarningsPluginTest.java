package com.w308anviltradewarnings;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class W308AnvilTradeWarningsPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(W308AnvilTradeWarningsPlugin.class);
		RuneLite.main(args);
	}
}