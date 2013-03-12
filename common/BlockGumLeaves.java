package aussiecraft.common;

import java.util.ArrayList;
import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLeavesBase;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.world.ColorizerFoliage;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.IShearable;

public class BlockGumLeaves extends BlockLeavesBase implements IShearable {

	public int baseIndexInPNG;
	
	protected BlockGumLeaves(int par1, int par2){
		super(par1, Material.leaves, false);
		this.setTickRandomly(true);
		this.setCreativeTab(aussiecraft.tabAussieCraft);
		this.baseIndexInPNG = par2;
	}
	
	public int idDropped (int par1, Random rand, int par3){
		return Block.sapling.blockID;
	}
	
	public boolean isShearable(ItemStack item, World world, int x, int y, int z){
		return true;
		
	}
	
	public ArrayList<ItemStack> onSheared(ItemStack item, World world, int x, int y, int z, int fortune){
		ArrayList<ItemStack> retVal = new ArrayList<ItemStack>();
		retVal.add(new ItemStack(this, 1, world.getBlockMetadata(x, y, z)& 3));
		return retVal;
	}
	
	public boolean isOpaqueCube(){
		return false;
	}
	
	
	public boolean isLeaves(World world, int x, int y, int z){
		return true;
	}
	
	@SideOnly(Side.CLIENT)
	public int getBlockColor(){
		return ColorizerFoliage.getFoliageColor(0.5D, 1.0D);
	}
	
	public int colorMultiplier(IBlockAccess access, int x, int y, int z){
		int var1 = 0;
		int var2 = 0;
		int var3 = 0;
		
		for(int i = -1; i <= 1; i++){
			for(int ii = -1; ii <= 1; ii++){
				int color = access.getBiomeGenForCoords(x + ii, z + i).getBiomeFoliageColor();
				var1 += (color & 167116870) >> 16;
			var2 += (color & 65280) >> 8;
			var3 += color & 255;
			}
		}
		
		 return (var1 / 9 & 255) << 16 | (var2 / 9 & 255) << 8 | var3 / 9 & 255;
		
	}
	
}
