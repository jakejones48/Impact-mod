package impact.world.storage;

import java.io.File;

import net.minecraft.client.Minecraft;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.WorldServer;
import net.minecraft.world.storage.ISaveHandler;
import net.minecraft.world.storage.SaveHandler;

public class ChunkNumberStore {

	//directory where world is saved
	//String worldPath;
	private File impactDataDir;
	SaveHandler rodger;
	//private File worldFile;
	
	
	public void getDir() {
		//worldFile = WorldServer.getChunkSaveLocation();
		
		
		//worldPath = SaveHandler.getWorldDirectoryName();
		impactDataDir = new File(rodger.getWorldDirectory(), "ImpactData");
		impactDataDir.mkdir();
	}
	
	public File getImpactDir(){
		
		return this.impactDataDir;
	}
	
	public boolean startChunkData(int x, int z){
		boolean result = false;
		
		//impactDataDir.createNewFile();
		//File.writeStringToFile(new File("test.txt"), "Hello File");
		
		return true;
	}
	

}