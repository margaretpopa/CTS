package ro.ase.cts.clasecomand;

public class ComandaRetragere extends ComandaAbstracta{

	@Override
	public void executa() {
		// TODO Auto-generated method stub
		super.contBancar.retragere(super.suma);
	}

	public ComandaRetragere(ExecutantContBancar contBancar, float suma) {
		super(contBancar, suma);
		// TODO Auto-generated constructor stub
	}

	
}
