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
import net.minecraftforge.event.world.WorldEvent.Load;

public class DataInitHandler {
	
	private File impactDataDir;
	SaveHandler rodger;
	Minecraft hello;
	ChunkEvent boo;
	
	@ForgeSubscribe
	public void onChunkCreate(Load event){
		Chunk loaded;
		loaded = boo.getChunk();
		
		int chunkX;
		int chunkZ;
		impactDataDir = new File(ModLoader.getMinecraftInstance().mcDataDir, "\\ImpactData.txt");
		impactDataDir.mkdirs();
		//impactDataDir.createNewFile();
		chunkX= loaded.xPosition;
		chunkZ= loaded.zPosition;
		System.out.println("" + chunkX);
		System.out.println("" + chunkZ);
		ModLoader.getMinecraftInstance().thePlayer.addChatMessage("Test mode:" + chunkX);
		
		    }
		}
	


