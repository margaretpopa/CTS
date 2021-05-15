package ro.ase.cts.observer.clase;

public class ClientAbonat implements Observer {
	
	private String numeClient;
	

	public ClientAbonat(String numeClient) {
		super();
		this.numeClient = numeClient;
	}


	@Override
	public void primesteAnunt(String mesajAnunt) {
		System.out.println(this.numeClient+" ai primit "+mesajAnunt);
	}

}