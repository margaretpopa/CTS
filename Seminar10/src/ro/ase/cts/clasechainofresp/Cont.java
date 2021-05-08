package ro.ase.cts.clasechainofresp;

public abstract class Cont {

	private float sold;
	private Cont cont;
	
	public float getSold() {
		return sold;
	}
	public void setSold(float sold) {
		this.sold = sold;
		
	}
	public Cont getCont() {
		return cont;
	}
	public void setCont(Cont cont) {
		this.cont = cont;
	}
	
	public abstract void realizeazaPlata(float suma);
	
	public Cont(float sold) {
		super();
		this.sold = sold;
		this.cont=null; //setez succesorul cu null
	}
	
	
}
