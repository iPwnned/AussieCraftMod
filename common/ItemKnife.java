package aussiecraft.common;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemKnife extends Item{

	
	public ItemKnife(int par1){
		super(par1);
		setMaxStackSize(1);
		this.setCreativeTab(aussiecraft.tabAussieCraft);
	}
	
}
