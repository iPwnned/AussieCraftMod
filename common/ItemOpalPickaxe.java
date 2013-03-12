package aussiecraft.common;

import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemPickaxe;

public class ItemOpalPickaxe extends ItemPickaxe {

	
	public ItemOpalPickaxe(int i, EnumToolMaterial enumToolMaterial){
		super(i, enumToolMaterial);
		this.setCreativeTab(aussiecraft.tabAussieCraft);
	}
	
}
