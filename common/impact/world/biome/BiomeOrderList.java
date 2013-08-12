package impact.world.biome;

import java.util.Arrays;

import net.minecraft.world.biome.BiomeGenBase;

public class BiomeOrderList {
	
	BiomeGenBase[] biomeList = BiomeGenBase.biomeList;
	
	public void getBiomeListOrder(){
		
		boolean sort = true;
		int length = biomeList.length;
		//bug sorting
		//length = 10;
		
		for (int i = 0; i < biomeList.length; i++){
			if(biomeList[i] == null){
				length = i;
				break;
			}
			
		}
		int[] unsortedID = new int[length];
		int[] sortedID = new int[length];
		String[] unsortedName = new String[length];
		String[] sortedName = new String[length];
		float[] unsortedTemp = new float[length];
		float[] sortedTemp = new float[length];
		
		for (int i = 0; i < length; i++) {
			unsortedID[i] = biomeList[i].biomeID;
			unsortedName[i] = biomeList[i].biomeName;
			unsortedTemp[i] = biomeList[i].temperature;
		}
		
		
			while(sort){
		
				sort = false;
				for (int i = 0; i < length-1; i++){
					if(unsortedTemp[i] > unsortedTemp[i+1]){
						float tmp = unsortedTemp[i+1];
						unsortedTemp[i+1] = unsortedTemp[i];
						unsortedTemp[i] = tmp;
					
						String tmpName = unsortedName[i+1];
						unsortedName[i+1] = unsortedName[i];
						unsortedName[i] = tmpName;
					
						int tmpID = unsortedID[i+1];
						unsortedID[i+1] = unsortedID[i];
						unsortedID[i] = tmpID;
					
						sort = true;
					
					}
				}
			}
			
			sortedTemp = unsortedTemp;
			sortedID = unsortedID;
			sortedName = unsortedName;
			
			
		for (int i = 0; i<length; i++){
			
			System.out.println("ID: " + sortedID[i] + " Name: " + sortedName[i] + " Temp: " + sortedTemp[i]);
			
		}
		
		
		
	}
	

}
