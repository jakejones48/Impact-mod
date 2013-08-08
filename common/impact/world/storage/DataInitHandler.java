package impact.world.storage;

import impact.lib.Reference;

import java.io.File;




import java.io.IOException;

import cpw.mods.fml.common.IPlayerTracker;
import net.minecraft.client.Minecraft;
import net.minecraft.src.ModLoader;
import net.minecraft.world.WorldServer;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.storage.SaveHandler;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.terraingen.SaplingGrowTreeEvent;
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
		
		
		//sets values of chunk positions for storage
		chunkX= event.getChunk().xPosition;
		chunkZ= event.getChunk().zPosition;
		
		//create folder based on "x" location
		File tmp = new File(impactDataDir, Integer.toString(chunkX));
		if(!tmp.exists()){
			tmp.mkdir();
		}
		File tmp2 = new File(tmp, Integer.toString(chunkZ)+".txt");
		if(!tmp2.isFile()){
			try {
				tmp2.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//test if working
		
		//System.out.println("" + chunkX);
		//System.out.println("" +chunkZ);*/
		
		
		
		    }
	
	@ForgeSubscribe
	public void treeOutput(SaplingGrowTreeEvent event){
		int x = event.x;
		System.out.println("Tree here"+ x);
		
	}
		}
	


