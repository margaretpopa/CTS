package ro.ase.cts.proxy;

public class OperatorRezervare implements OperatorRezervari{

	private String numeRestaurant;

	public OperatorRezervare(String numeRestaurant) {
		super();
		this.numeRestaurant = numeRestaurant;
	}

	@Override
	public void rezerva(int nrPers) {
		// TODO Auto-generated method stub
		System.out.println("A fost realizata rezervarea la "+numeRestaurant +" pentru un numar de "+ nrPers + "persoane !");
	}
	
	
}
