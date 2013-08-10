package impact.world.biome;

import impact.world.storage.DataInitHandler;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

import net.minecraft.src.ModLoader;
import net.minecraft.world.World;

public class BiomeChanger {
	
	
	public int getCurrentImpactNumber(int x, int z){
		int num;
		File f;
		
		f = new File(DataInitHandler.impactDataDir + "\\" + Integer.toString(x) + Integer.toString(z) + ".txt");
		
		// creates scanner and reads "num" from file
		Scanner s;
		try {
			s = new Scanner(f);
			num = s.nextInt();
			s.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			num = 0;
		}
		
		//returns impact number
		return num;
		
	}
	
	public void writeCurrentImapctNumber(int x, int z, int num){
		
		File f;
		
		f= new File(DataInitHandler.impactDataDir + "\\" + Integer.toString(x) + Integer.toString(z) + ".txt");
		
		//writes "num" to "x" folder "z.txt" file for later reading
		Writer wr;
		try {
			wr = new FileWriter(f);
			wr.write(Integer.toString(num));
			wr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public byte[] getCurrentBiomeArray(int x, int z, World world){
		byte[] biomeArray;
		//gets biome array from world object
		biomeArray = world.getChunkFromChunkCoords(x, z).getBiomeArray();
		//returns biome array
		return biomeArray;
			
	}
	
	public void setBiomeArray(int x, int z, World world){
		byte[] current;
		byte[] newBiomeArray;
		
		//gets current biome array then modifies it
		current = getCurrentBiomeArray(x, z, world);
		newBiomeArray = modifyBiomeArray(current);
		
		//sets chunk biomes to new biome array
		world.getChunkFromChunkCoords(x, z).setBiomeArray(newBiomeArray);
		
		
	}
	
	public byte[] modifyBiomeArray(byte[] current){
		byte[] modifiedBiomeArray;
		
		//need to add a switch statement to change each value based on original
		//need to work out a list of biome order before setting this up
		modifiedBiomeArray = current;
		
		return modifiedBiomeArray;
		
		
	}

}
