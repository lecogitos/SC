package SC;

import java.util.Map;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.src.ModLoader;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.MinecartRegistry;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@NetworkMod(clientSideRequired = true, serverSideRequired = false)
@Mod(modid = "SC", name = "SC AUTHOR - cogito", version = "0.0.1")

public class SimpleCraft
{
	@Instance("SC")
	public static SimpleCraft instance;
	
	public static Block colorBrickBlock;
	
	public static int colorBrickBlockID;
	
	@PreInit
	public void preInit(FMLPreInitializationEvent event)
	{
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		
		config.load();
		
		colorBrickBlockID = config.getBlock("colorBrickBlockID", 1555).getInt();
		
		config.save();
	}

	@Init
	public void init(FMLInitializationEvent event) 
	{
		colorBrickBlock = (new BlockColorBrick(colorBrickBlockID, 0)).setBlockName("colorBrickBlock");
	
		LanguageRegistry.addName(colorBrickBlock, "ColorBrick");
	
		GameRegistry.registerBlock(colorBrickBlock);
		
	    MinecraftForgeClient.preloadTexture("/SC/terrain.png");
	    
	    MinecraftForgeClient.preloadTexture("/SC/items.png");
	}
	
	@PostInit
	public static void postInit(FMLPostInitializationEvent event)
	{
		
	}
}
