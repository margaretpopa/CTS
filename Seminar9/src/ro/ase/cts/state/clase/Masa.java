package ro.ase.cts.state.clase;

public class Masa {

	private int idMasa;
	private StareMasa stareMasa;
	
	
	
	public Masa(int idMasa) {
		super();
		this.idMasa = idMasa;
		this.stareMasa=new Liber();
	}

	protected void setStareMasa(StareMasa stareMasa) {
		this.stareMasa = stareMasa;
	}

	public StareMasa getStareMasa() {
		return stareMasa;
	}
	
	
	public void rezervaMasa(String numeClient)
	{
		if(this.getStareMasa() instanceof Liber)
		{
			System.out.println(numeClient + " a rezervat masa!");
		this.setStareMasa(new Rezervata());
		}
		else
		{
			System.out.println(" Masa nu poate fi rezervata!");
		}
	}
	
	public void ocupaMasa(String numeClient)
	{
		if(!(this.getStareMasa() instanceof Ocupata))
		{
			System.out.println(numeClient + " a ocupat masa!");
			this.setStareMasa(new Ocupata());
		}
		else
		{
			System.out.println(" Masa nu poate fi ocupata!");
		}
	}
	
	public void elibereazaMasa(String numeClient)
	{
		if(!(this.getStareMasa() instanceof Liber))
		{
			System.out.println(numeClient + " a eliberat masa!");
			this.setStareMasa(new Liber());
		}
		else
		{
			System.out.println(" Masa este deja libera!");
		}
	}
	
}
