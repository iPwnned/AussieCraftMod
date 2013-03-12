package aussiecraft.common;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockOpalOre extends Block {

	public BlockOpalOre(int id, int texture, Material mat){
		super(id, mat);
		this.setCreativeTab(aussiecraft.tabAussieCraft);
	}
	
}
