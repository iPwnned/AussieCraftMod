package aussiecraft.common;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockGumLog extends Block {

	private int blockIndexInTexture;

	public BlockGumLog(int par1, int par2, Material par3Material) {
		super(par1, par3Material);
		this.setCreativeTab(aussiecraft.tabAussieCraft);
	}
	}
