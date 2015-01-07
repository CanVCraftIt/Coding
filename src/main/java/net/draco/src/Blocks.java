package mod.draco_animus.main;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;

public class Draco_Animus_ModBlocks {
	
	public static Block charredGround;
 	public static Block scorchedCobblestone;	
	
	public static void init() {
			
		Charred_Ground = new Draco_Animus_ModForgeBlocks(Material.grass).setHardness(1.0F).setResistance(3.0F).setBlockName("charredGround").setCreativeTab(OthersDraco_Animus.TabDraco_Animus);
		Scorched_Cobblestone = new Draco_Animus_ModForgeBlocks(Material.rock).setHardness(5.0F).setResistance(3.0F).setBlockName("scorchedCobblestone").setCreativeTab(OthersDraco_Animus.TabDraco_Animus);
				
		GameRegistry.registerBlock(charredGround, "charredGround");
		GameRegistry.registerBlock(scorchedCobblestone, "scorchedCobblestone");
	}
}
