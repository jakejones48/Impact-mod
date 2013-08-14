package impact.world.biome;

import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.event.world.WorldEvent.Load;

public class TimeChecker {

	public static float worldStartTime;
	
	@ForgeSubscribe
	public void onWorldLoad(Load event){
	worldStartTime = System.currentTimeMillis();	
		
	}
}
