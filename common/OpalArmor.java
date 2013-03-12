package aussiecraft.common;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.IArmorTextureProvider;

public class OpalArmor extends ItemArmor implements IArmorTextureProvider {

	public OpalArmor(int par1, EnumArmorMaterial par2EnumArmorMaterial,
			int par3, int par4) {
		super(par1, par2EnumArmorMaterial, par3, par4);
		this.setCreativeTab(aussiecraft.tabAussieCraft);
	}

	@Override
	public String getArmorTextureFile(ItemStack itemstack) {
		if(itemstack.itemID == aussiecraft.opalHelmet.itemID || itemstack.itemID == aussiecraft.opalPlate.itemID || itemstack.itemID == aussiecraft.opalBoots.itemID){
			return "/aussiecraft/opal_1.png";
		}
		if(itemstack.itemID == aussiecraft.opalLegs.itemID){
			return "/aussiecraft/opal_2.png";
		}
		else return "/aussiecraft/opal_2.png";
	}
	public String getTextureFile(){
		return "/aussiecraft/aussiecraft_items.png";
	}
}
