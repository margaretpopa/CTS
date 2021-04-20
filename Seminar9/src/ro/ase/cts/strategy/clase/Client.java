package ro.ase.cts.strategy.clase;

public class Client {

	private String nume;
	private IModPlata iModPlata;

	public void setiModPlata(IModPlata iModPlata) {
		this.iModPlata = iModPlata;
	}
	
	public void plateste(int suma)
	{
		System.out.println(nume+ " ");
		iModPlata.plateste(suma);
	}

	public Client(String nume, IModPlata iModPlata) {
		super();
		this.nume = nume;
		this.iModPlata = iModPlata;
	}
	
	
}
