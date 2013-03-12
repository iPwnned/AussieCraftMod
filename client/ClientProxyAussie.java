package aussiecraft.client;

import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraftforge.client.MinecraftForgeClient;
import aussiecraft.common.CommonProxyAussie;

public class ClientProxyAussie extends CommonProxyAussie {

	@Override
	public void registerRenderThings(){
		MinecraftForgeClient.preloadTexture("/aussiecraft/aussiecraft_textures.png");
		MinecraftForgeClient.preloadTexture("/aussiecraft/aussiecraft_items.png");
		RenderingRegistry.registerEntityRenderingHandler(AusEnity.class, new RenderKolaMob(new ModelKoala(), 0.5F));
	}
	
	public int addArmor(String Armor){
		return RenderingRegistry.addNewArmourRendererPrefix(Armor);
	}
}
