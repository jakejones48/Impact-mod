package impact;

import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;

import net.minecraft.block.Block;
import net.minecraft.block.StepSound;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.src.ModLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.world.ChunkEvent;
import impact.block.ImpactBlockFurnace;
import impact.lib.Reference;
import impact.world.biome.TimeChecker;
import impact.world.storage.DataInitHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.ReflectionHelper;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class Impact {

	
	@PreInit
	public void preInit(FMLPreInitializationEvent event){
	
		
	}
	
	@Init
	public void init(FMLInitializationEvent event){
		MinecraftForge.EVENT_BUS.register(new DataInitHandler());
		MinecraftForge.EVENT_BUS.register(new TimeChecker());
		GameRegistry.registerPlayerTracker(new ImpactPlayerTracker());
		
		final StepSound soundStoneFootstep = new StepSound("stone", 1.0F, 1.0F);
		int i = Block.furnaceIdle.blockID;
		Block.blocksList[i] = null;
		Block impactFurnaceIdle = (new ImpactBlockFurnace(i, false)).setHardness(3.5F).setStepSound(soundStoneFootstep).setUnlocalizedName("furnace").setCreativeTab(CreativeTabs.tabDecorations);
		//ReflectionHelper.setPrivateValue(Block.class, null, ImpactBlockFurnace, "furnace");
		i = Block.furnaceBurning.blockID;
		Block.blocksList[i] = null;
		Block impactFurnaceBurning = (new ImpactBlockFurnace(i, true)).setHardness(3.5F).setStepSound(soundStoneFootstep).setUnlocalizedName("furnace").setCreativeTab(CreativeTabs.tabDecorations);
		
		
	}
	@PostInit
	public void postInit(FMLPostInitializationEvent event){
		
		System.out.println("Impact loaded :)");
		
	}
	
	
	}
