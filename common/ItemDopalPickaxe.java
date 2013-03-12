package aussiecraft.common;

import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemPickaxe;

public class ItemDopalPickaxe extends ItemPickaxe {

	
	public ItemDopalPickaxe(int i, EnumToolMaterial enumToolMaterial){
		super(i, enumToolMaterial);
		this.setCreativeTab(aussiecraft.tabAussieCraft);
	}
	
}
