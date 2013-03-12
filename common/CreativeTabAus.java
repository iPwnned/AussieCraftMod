package aussiecraft.common;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CreativeTabAus extends CreativeTabs {

	public CreativeTabAus(String label) {
    super(label);
}
	public ItemStack getIconItemStack() {
	    return new ItemStack(aussiecraft.darkOpal);
	}

}
