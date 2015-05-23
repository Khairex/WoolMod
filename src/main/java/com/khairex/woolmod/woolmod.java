package com.khairex.woolmod;

import com.khairex.woolmod.init.ModBlocks;
import com.khairex.woolmod.init.ModItems;
import com.khairex.woolmod.proxy.IProxy;
import com.khairex.woolmod.refrence.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

import javax.naming.directory.ModificationItem;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class woolmod
{
	@Mod.Instance("woolmod")
	public static woolmod instance;

	@SidedProxy(clientSide = "com.khairex.woolmod.proxy.ClientProxy", serverSide = "com.khairex.woolmod.proxy.ServerProxy")
	public static IProxy proxy;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		ModItems.init();
		ModBlocks.init();
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event)
	{

	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{

	}
}
