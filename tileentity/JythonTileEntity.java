package openccjython.tileentity;

import org.python.util.PythonInterpreter;

import dan200.computer.api.IComputerAccess;
import dan200.computer.api.IPeripheral;
import net.minecraft.tileentity.TileEntity;

public class JythonTileEntity extends TileEntity implements IPeripheral {

	@Override
	public String getType() {
		return "jython";
	}

	@Override
	public String[] getMethodNames() {
		String[] method_names = {"derp"};
		return method_names;
	}

	@Override
	public Object[] callMethod(IComputerAccess computer, int method,
			Object[] arguments) throws Exception {
		PythonInterpreter interpreter = new PythonInterpreter();
		
		interpreter.exec("print 'method called: " + method + "'");
		return null;
	}

	@Override
	public boolean canAttachToSide(int side) {
		return true;
	}

	@Override
	public void attach(IComputerAccess computer) {
		
	}

	@Override
	public void detach(IComputerAccess computer) {
		
	}

}
