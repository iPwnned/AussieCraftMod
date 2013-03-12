package aussiecraft.common;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemOpalIngot extends Item{

	
	public ItemOpalIngot(int par1){
		super(par1);
		setMaxStackSize(64);
		this.setCreativeTab(aussiecraft.tabAussieCraft);
	}
	
}
