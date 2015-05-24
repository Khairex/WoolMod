package com.khairex.woolmod.block;

import com.khairex.woolmod.init.ModBlocks;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraft.item.Item;
import java.util.Random;

public class BlockWool extends woolblock
{
	private int state;

	public BlockWool(int val)
	{
		super();
		state = val;
		setHardness(0.8F);
		setStepSound(soundTypeCloth);
		setBlockName(woolblock.MultiNames[val]);

		if(val == 0)
		{
			setCreativeTab(CreativeTabs.tabRedstone);
		}
	}

	@Override
	public int tickRate(World p_149738_1_)
	{
		return 1;
	}

	@Override
	public void onBlockAdded(World p_149726_1_, int p_149726_2_, int p_149726_3_, int p_149726_4_)
	{
			if (p_149726_1_.isBlockIndirectlyGettingPowered(p_149726_2_, p_149726_3_, p_149726_4_))
			{
				p_149726_1_.scheduleBlockUpdate(p_149726_2_,p_149726_3_,p_149726_4_, this,0 );
			}
	}



	@Override
	public void onNeighborBlockChange(World world, int i, int j, int k, Block b)
	{
		if(world.isBlockIndirectlyGettingPowered(i, j, k) || world.isBlockIndirectlyGettingPowered(i, j + 1, k))
		{
			world.scheduleBlockUpdate(i, j, k, this, 1);
		}

	}

	@Override
	public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
	{
		return Item.getItemFromBlock(ModBlocks.MultiWool);
	}

	@SideOnly(Side.CLIENT)
	public Item getItem(World p_149694_1_, int p_149694_2_, int p_149694_3_, int p_149694_4_)
	{
		return Item.getItemFromBlock(ModBlocks.MultiWool);
	}


	/**
	 * Ticks the block if it's been scheduled
	 */
	@Override
	public void updateTick(World p_149726_1_, int p_149726_2_, int p_149726_3_, int p_149726_4_, Random p_149674_5_)
	{

		if (p_149726_1_.isBlockIndirectlyGettingPowered(p_149726_2_, p_149726_3_, p_149726_4_))
		{
			if(state >= 16)
			{
				state = 0;
			}

			//state = (int)(Math.random()*15);

			switch (state)
			{
				case 0:
					p_149726_1_.setBlock(p_149726_2_, p_149726_3_, p_149726_4_, ModBlocks.Orange);
					break;
				case 1:
					p_149726_1_.setBlock(p_149726_2_, p_149726_3_, p_149726_4_, ModBlocks.Magenta);
					break;
				case 2:
					p_149726_1_.setBlock(p_149726_2_, p_149726_3_, p_149726_4_, ModBlocks.Light_blue);
					break;
				case 3:
					p_149726_1_.setBlock(p_149726_2_, p_149726_3_, p_149726_4_, ModBlocks.Yellow);
					break;
				case 4:
					p_149726_1_.setBlock(p_149726_2_, p_149726_3_, p_149726_4_, ModBlocks.Lime);
					break;
				case 5:
					p_149726_1_.setBlock(p_149726_2_, p_149726_3_, p_149726_4_, ModBlocks.Pink);
					break;
				case 6:
					p_149726_1_.setBlock(p_149726_2_, p_149726_3_, p_149726_4_, ModBlocks.Grey);
					break;
				case 7:
					p_149726_1_.setBlock(p_149726_2_, p_149726_3_, p_149726_4_, ModBlocks.Light_grey);
					break;
				case 8:
					p_149726_1_.setBlock(p_149726_2_, p_149726_3_, p_149726_4_, ModBlocks.Cyan);
					break;
				case 9:
					p_149726_1_.setBlock(p_149726_2_, p_149726_3_, p_149726_4_, ModBlocks.Purple);
					break;
				case 10:
					p_149726_1_.setBlock(p_149726_2_, p_149726_3_, p_149726_4_, ModBlocks.Blue);
				case 11:
					p_149726_1_.setBlock(p_149726_2_, p_149726_3_, p_149726_4_, ModBlocks.Brown);
					break;
				case 12:
					p_149726_1_.setBlock(p_149726_2_, p_149726_3_, p_149726_4_, ModBlocks.Green);
					break;
				case 13:
					p_149726_1_.setBlock(p_149726_2_, p_149726_3_, p_149726_4_, ModBlocks.Red);
					break;
				case 14:
					p_149726_1_.setBlock(p_149726_2_, p_149726_3_, p_149726_4_, ModBlocks.Black);
					break;
				case 15:
					p_149726_1_.setBlock(p_149726_2_, p_149726_3_, p_149726_4_, ModBlocks.MultiWool);
					break;
			}
		}
	}

	protected ItemStack createStackedBlock(int p_149644_1_)
	{
		return new ItemStack(ModBlocks.MultiWool);
	}
}
