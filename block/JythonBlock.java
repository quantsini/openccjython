package openccjython.block;

import cpw.mods.fml.common.registry.GameRegistry;
import openccjython.tileentity.JythonTileEntity;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class JythonBlock extends BlockContainer {

	public JythonBlock() {
		super(392, Material.ground);
		this.setHardness(0.5F);
		GameRegistry.registerBlock(this, "jython");
		GameRegistry.registerTileEntity(JythonTileEntity.class, "jython");
		setUnlocalizedName("openccjython.jython");
	}

	@Override
	public TileEntity createNewTileEntity(World world) {
		return new JythonTileEntity();
	}
}
