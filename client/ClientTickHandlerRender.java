package rareores.client;

import java.util.EnumSet;

import rareores.common.block.GlowLeaves;

import net.minecraft.client.Minecraft;

import cpw.mods.fml.common.ITickHandler;
import cpw.mods.fml.common.TickType;

public class ClientTickHandlerRender implements ITickHandler {

	@Override
	public void tickStart(EnumSet<TickType> type, Object... tickData) 
	{
		if(Minecraft.isFancyGraphicsEnabled())
		{
			GlowLeaves.iconType = 0;
		}
		else
		{
			GlowLeaves.iconType = 1;
		}
	}

	@Override
	public void tickEnd(EnumSet<TickType> type, Object... tickData) {}

	@Override
	public EnumSet<TickType> ticks() 
	{
		 return EnumSet.of(TickType.RENDER);
	}

	@Override
	public String getLabel() 
	{
		return null;
	}

}
