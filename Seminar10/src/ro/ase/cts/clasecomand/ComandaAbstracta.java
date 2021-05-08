package ro.ase.cts.clasecomand;

public abstract class ComandaAbstracta {
	//fac getteri sau le declar protected
	protected ExecutantContBancar contBancar;
	protected float suma;
	
	
	public ComandaAbstracta(ExecutantContBancar contBancar, float suma) {
		super();
		this.contBancar = contBancar;
		this.suma = suma;
	}
	
	public abstract void executa();
	
	
}
