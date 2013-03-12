package aussiecraft.common;

import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeOutback extends BiomeGenBase {

	public BiomeOutback(int par1) {
		super(par1);
		this.setBiomeName("Outback Biome");
		this.topBlock = (byte) Block.grass.blockID;
	}

	
	
}
