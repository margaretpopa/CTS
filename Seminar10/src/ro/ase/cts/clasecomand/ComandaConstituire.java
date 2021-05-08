package ro.ase.cts.clasecomand;

public class ComandaConstituire  extends ComandaAbstracta{

	@Override
	public void executa() {
		// TODO Auto-generated method stub
		super.contBancar.constituire(suma);
	}

	public ComandaConstituire(ExecutantContBancar contBancar, float suma) {
		super(contBancar, suma);
		// TODO Auto-generated constructor stub
	}

	
}
