package ro.ase.cts.composite.clase;

public abstract class ComponentaMeniu {

	private String nume;
	
	public abstract void afisareDescriere();
	public abstract ComponentaMeniu getComponenta(int pozitia) throws Exception;
	public abstract void adaugaComponenta(ComponentaMeniu componenta);
    public abstract void stergereComponenta(ComponentaMeniu componenta);
	
    public ComponentaMeniu(String nume) {
		super();
		this.nume = nume;
	}
	public String getNume() {
		return nume;
	}
    
	
}
