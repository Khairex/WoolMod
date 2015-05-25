package com.khairex.woolmod.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

public class Recipes
{
	public static void init()
	{
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.MultiWool, 3), new ItemStack(Blocks.wool,1,14), new ItemStack(Blocks.wool,1,13),new ItemStack(Blocks.wool,1,11));
	}
}
