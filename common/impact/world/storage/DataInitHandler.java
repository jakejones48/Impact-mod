package impact.world.storage;

import java.io.File;




import java.io.IOException;

import net.minecraft.client.Minecraft;
import net.minecraft.src.ModLoader;
import net.minecraft.world.WorldServer;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.storage.SaveHandler;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.world.ChunkEvent;
import net.minecraftforge.event.world.ChunkEvent.Load;

public class DataInitHandler {
	
	private File impactDataDir;
	SaveHandler rodger;
	Minecraft hello;
	ChunkEvent boo;
	
	@ForgeSubscribe
	public void onChunkCreate(Load event){
				
		// state variables for chunk position
		int chunkX;
		int chunkZ;
		
		//creates Impact mod directory
		impactDataDir = new File(ModLoader.getMinecraftInstance().mcDataDir + "\\saves\\" + ModLoader.getMinecraftServerInstance().getWorldName(), "\\ImpactData");
		impactDataDir.mkdirs();
		//impactDataDir.createNewFile();
		
		//sets values of chunk positions for storage
		chunkX= event.getChunk().xPosition;
		chunkZ= event.getChunk().zPosition;
		
		//test if working
		
		//System.out.println("" + chunkX);
		//System.out.println("" +chunkZ);*/
		
		
		
		    }
		}
	


