package openccjython.peripheral;

import net.minecraft.nbt.NBTTagCompound;
import dan200.computer.api.IComputerAccess;
import dan200.computer.api.IHostedPeripheral;

public class JythonPeripheral implements IHostedPeripheral {

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] getMethodNames() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] callMethod(IComputerAccess computer, int method,
			Object[] arguments) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean canAttachToSide(int side) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void attach(IComputerAccess computer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void detach(IComputerAccess computer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void readFromNBT(NBTTagCompound nbttagcompound) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void writeToNBT(NBTTagCompound nbttagcompound) {
		// TODO Auto-generated method stub
		
	}

}
