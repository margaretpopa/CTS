package ro.ase.cts.clasecomand;

public class ComandaDepunere extends ComandaAbstracta{

	@Override
	public void executa() {
		// TODO Auto-generated method stub
		super.contBancar.depunere(super.suma);
	}

	public ComandaDepunere(ExecutantContBancar contBancar, float suma) {
		super(contBancar, suma);
		// TODO Auto-generated constructor stub
	}

	
}
