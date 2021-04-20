package ro.ase.cts.proxy;

public class ProxyRezervare implements OperatorRezervari{

	private OperatorRezervare operatorRezervare;
	private int numarMinimPersoane;
	
	@Override
	public void rezerva(int nrPers) {
		// TODO Auto-generated method stub
		if(nrPers > numarMinimPersoane)
		{
			operatorRezervare.rezerva(nrPers);
		}
		else
		{
			System.out.println("Numarul de persoane este prea mic!");
		}
	}

	public ProxyRezervare(OperatorRezervare operatorRezervare, int numarMinimPersoane) {
		super();
		this.operatorRezervare = operatorRezervare;
		this.numarMinimPersoane = numarMinimPersoane;
	}

	
}
