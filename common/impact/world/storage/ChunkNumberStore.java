package impact.world.storage;

import java.io.File;

import net.minecraft.world.storage.ISaveHandler;

public class ChunkNumberStore {

	//directory where world is saved
	private final File worldDir;
	
	
	worldDir = SaveHandler.getWorldDirectory();
	private final File impactDataDir;
	
	
	this.impactDataDir = new File(SavHandler.getWorldDirectory, "ImapactData");
	

}