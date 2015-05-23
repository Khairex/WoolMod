package com.khairex.woolmod.init;

import com.khairex.woolmod.item.Itemleaf;
import com.khairex.woolmod.item.woolItem;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems
{
	public static final woolItem leaf = new Itemleaf();

	public static void init()
	{
		GameRegistry.registerItem(leaf, "leaf");

	}
}
