package impact;

import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;

import net.minecraft.src.ModLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.world.ChunkEvent;
import impact.lib.Reference;

import impact.world.storage.DataInitHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class Impact {

	
	@PreInit
	public void preInit(FMLPreInitializationEvent event){
	
		
	}
	
	@Init
	public void init(FMLInitializationEvent event){
		MinecraftForge.EVENT_BUS.register(new DataInitHandler());
		GameRegistry.registerPlayerTracker(new ImpactPlayerTracker());
		
		
	}
	@PostInit
	public void postInit(FMLPostInitializationEvent event){
		
		System.out.println("Impact loaded :)");
		
	}
	
	
	}
