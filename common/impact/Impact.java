package impact;

import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;

import net.minecraft.src.ModLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.world.ChunkEvent;
import impact.lib.Reference;
import impact.world.storage.ChunkNumberStore;
import impact.world.storage.DataInitHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class Impact {

	private ChunkNumberStore bob;
	@PreInit
	public void preInit(FMLPreInitializationEvent event){
	
		
	}
	
	@Init
	public void init(FMLInitializationEvent event){
		MinecraftForge.EVENT_BUS.register(new DataInitHandler());
		System.out.print("testing impact console config");
		
	}
	@PostInit
	public void postInit(FMLPostInitializationEvent event){
		File impactDataDir;
		impactDataDir = new File(ModLoader.getMinecraftInstance().mcDataDir, "\\ImpactData.txt");
		impactDataDir.mkdirs();
		try {
			impactDataDir.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	}
