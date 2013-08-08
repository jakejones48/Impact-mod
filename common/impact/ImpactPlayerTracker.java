package impact;

import impact.lib.Reference;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.src.ModLoader;
import cpw.mods.fml.common.IPlayerTracker;

public class ImpactPlayerTracker implements IPlayerTracker{

	@Override
	public void onPlayerLogin(EntityPlayer player) {
		// TODO Auto-generated method stub
		System.out.println("Join Here?");
		//this doesnt appear to work at the moment FIX needed
		//ModLoader.getMinecraftInstance().thePlayer.addChatMessage("Test mode:");
		//player.sendChatToPlayer("Impact version: " + Reference.VERSION + " loaded not advised to use");
		
	}

	@Override
	public void onPlayerLogout(EntityPlayer player) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onPlayerChangedDimension(EntityPlayer player) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onPlayerRespawn(EntityPlayer player) {
		// TODO Auto-generated method stub
		
	}
	

}
