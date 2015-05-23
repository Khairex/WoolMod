package com.khairex.woolmod.init;


import com.khairex.woolmod.block.BlockWool;
import com.khairex.woolmod.block.woolblock;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class ModBlocks
{
	public static final woolblock MultiWool = new BlockWool(0);
	public static final woolblock Orange = new BlockWool(1);
	public static final woolblock Magenta = new BlockWool(2);
	public static final woolblock Light_blue = new BlockWool(3);
	public static final woolblock Yellow = new BlockWool(4);
	public static final woolblock Lime = new BlockWool(5);
	public static final woolblock Pink = new BlockWool(6);
	public static final woolblock Grey = new BlockWool(7);
	public static final woolblock Light_grey = new BlockWool(8);
	public static final woolblock Cyan = new BlockWool(9);
	public static final woolblock Purple = new BlockWool(10);
	public static final woolblock Blue = new BlockWool(11);
	public static final woolblock Brown = new BlockWool(12);
	public static final woolblock Green = new BlockWool(13);
	public static final woolblock Red = new BlockWool(14);
	public static final woolblock Black = new BlockWool(15);


	public static void init()
	{
		//GameRegistry.registerBlock(MultiWool, "MultiWool");
		//GameRegistry.registerBlock(MultiWool2, "MultiWool2");
		GameRegistry.registerBlock(MultiWool, "MultiWool");
		GameRegistry.registerBlock(Orange, "Orange");
		GameRegistry.registerBlock(Magenta, "Magenta");
		GameRegistry.registerBlock(Light_blue, "Light_blue");
		GameRegistry.registerBlock(Yellow, "Yellow");
		GameRegistry.registerBlock(Lime, "Lime");
		GameRegistry.registerBlock(Pink, "Pink");
		GameRegistry.registerBlock(Grey, "Grey");
		GameRegistry.registerBlock(Light_grey, "Light_grey");
		GameRegistry.registerBlock(Cyan, "Cyan");
		GameRegistry.registerBlock(Purple, "Purple");
		GameRegistry.registerBlock(Blue, "Blue");
		GameRegistry.registerBlock(Brown, "Brown");
		GameRegistry.registerBlock(Green, "Green");
		GameRegistry.registerBlock(Red, "Red");
		GameRegistry.registerBlock(Black, "Black");
	}
}
