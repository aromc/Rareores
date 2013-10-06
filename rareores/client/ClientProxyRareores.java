package rareores.client;

import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;
import rareores.common.CommonProxyRareores;

public class ClientProxyRareores extends CommonProxyRareores 
{
	public void registerproxy()
	{
		TickRegistry.registerTickHandler(new ClientTickHandlerRender(), Side.CLIENT);
	}
	
}
