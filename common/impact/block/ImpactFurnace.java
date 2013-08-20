package impact.block;

import impact.world.biome.TimeChecker;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFurnace;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class ImpactFurnace extends BlockFurnace{
	
	private static float startTime;
	private static float endTime;
	private static float activeTime;
	
	protected ImpactFurnace(int par1, boolean par2) {
		super(par1, par2);
		// TODO Auto-generated constructor stub
	}

	
	 public static void updateFurnaceBlockState(boolean par0, World par1World, int par2, int par3, int par4)
	    {
	        int l = par1World.getBlockMetadata(par2, par3, par4);
	        TileEntity tileentity = par1World.getBlockTileEntity(par2, par3, par4);
	        keepFurnaceInventory = true;

	        if (par0)
	        {
	        	startTime = System.currentTimeMillis();
	        	System.out.println("hit to burning");
	            par1World.setBlock(par2, par3, par4, Block.furnaceBurning.blockID);
	            
	        }
	        else
	        {
	        	endTime = System.currentTimeMillis();
	            par1World.setBlock(par2, par3, par4, Block.furnaceIdle.blockID);
	            if(startTime == 0){
	            	activeTime = endTime - TimeChecker.worldStartTime;
	            }else{
	            	activeTime = endTime - startTime;
	            }
	            System.out.println("Fire At Will " + activeTime);
	            
	        }

	        keepFurnaceInventory = false;
	        par1World.setBlockMetadataWithNotify(par2, par3, par4, l, 2);

	        if (tileentity != null)
	        {
	            tileentity.validate();
	            par1World.setBlockTileEntity(par2, par3, par4, tileentity);
	        }
	    }
}
