
	package aussiecraft.common;

	import java.util.Random;

	import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

	public class BlockOutbackDirt extends Block {

		public BlockOutbackDirt(int id, int texture, Material mat){
			super(id, mat);
			this.setCreativeTab(aussiecraft.tabAussieCraft);
		}
		
	}
