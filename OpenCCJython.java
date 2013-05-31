package openccjython;

import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import openccjython.block.JythonBlock;

import org.python.util.PythonInterpreter;

@Mod(modid = OpenCCJython.modid, name = "Open CC Jython", version = "0.1", dependencies = "required-after:ComputerCraft;after:CCTurtle;")
@NetworkMod(clientSideRequired = true, serverSideRequired = true)
public class OpenCCJython{
	public static final String modid = "quantsini_openccjython";

	@Init
	public void load(FMLInitializationEvent event) {
		PythonInterpreter interpreter = new PythonInterpreter();
		interpreter.exec("print 'hello world'");
		
		JythonBlock jythonBlock = new JythonBlock();
	}
}