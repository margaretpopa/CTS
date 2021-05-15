package ro.ase.cts.template.clase;

public class SpectatorVIP extends SpectatorAbstract{

	private String nume;
	private String loja;
	
	
	
	public SpectatorVIP(String nume, String loja) {
		super();
		this.nume = nume;
		this.loja = loja;
	}

	@Override
	public void asezareCoada() {
		// TODO Auto-generated method stub
		System.out.println(this.nume+"intra direct pe intrarea VIP");
	}

	@Override
	public void prezintaBilet() {
		// TODO Auto-generated method stub
		System.out.println(this.nume+"prezinta biletul VIP");
	}

	@Override
	public void realizeazaControlCorporal() {
		// TODO Auto-generated method stub
		System.out.println(this.nume+" este controlat corporal");
	}

	@Override
	public void ocupaLoc() {
		// TODO Auto-generated method stub
		System.out.println(this.nume+"ocupa loc in "+ this.loja);
	}

	
	
}
