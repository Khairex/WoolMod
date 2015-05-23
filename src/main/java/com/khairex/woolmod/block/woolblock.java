package com.khairex.woolmod.block;


import com.khairex.woolmod.init.ModBlocks;
import com.khairex.woolmod.refrence.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class woolblock extends Block
{
	public woolblock(Material material)
	{
		super(material);
	}

	public woolblock()
	{
		this(Material.cloth);
	}

	public static woolblock[] Multiarr = {ModBlocks.MultiWool, ModBlocks.Orange, ModBlocks.Magenta, ModBlocks.Light_blue, ModBlocks.Yellow, ModBlocks.Lime, ModBlocks.Pink, ModBlocks.Grey, ModBlocks.Light_grey, ModBlocks.Cyan, ModBlocks.Purple, ModBlocks.Blue, ModBlocks.Brown, ModBlocks.Green, ModBlocks.Red, ModBlocks.Black};

	public static String MultiNames[] = new String[] {"MultiWool", "Orange", "Magenta", "Light_blue", "Yellow", "Lime", "Pink", "Grey", "Light_grey", "Cyan", "Purple", "Blue", "Brown", "Green", "Red", "Black"};

	@Override
	public String getUnlocalizedName()
	{
		return String.format("tile.%s:%s", Reference.MOD_ID.toLowerCase(), getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister)
	{
		blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
	}

	protected String getUnwrappedUnlocalizedName(String unlocalizedName)
	{
		return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
	}

}
