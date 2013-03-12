package aussiecraft.common;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.IArmorTextureProvider;

public class DopalArmor extends ItemArmor implements IArmorTextureProvider {

	public DopalArmor(int par1, EnumArmorMaterial par2EnumArmorMaterial,
			int par3, int par4) {
		super(par1, par2EnumArmorMaterial, par3, par4);
		this.setCreativeTab(aussiecraft.tabAussieCraft);
	}

	@Override
	public String getArmorTextureFile(ItemStack itemstack) {
		if(itemstack.itemID == aussiecraft.dopalHelmet.itemID || itemstack.itemID == aussiecraft.dopalPlate.itemID || itemstack.itemID == aussiecraft.dopalBoots.itemID){
			return "/aussiecraft/dopal_1.png";
		}
		if(itemstack.itemID == aussiecraft.dopalLegs.itemID){
			return "/aussiecraft/dopal_2.png";
		}
		else return "/aussiecraft/dopal_2.png";
	}
	public String getTextureFile(){
		return "/aussiecraft/aussiecraft_items.png";
	}
}
