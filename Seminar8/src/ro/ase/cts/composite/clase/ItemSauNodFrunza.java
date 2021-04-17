package ro.ase.cts.composite.clase;

public class ItemSauNodFrunza extends ComponentaMeniu{

	public ItemSauNodFrunza(String nume) {
		super(nume);
		// TODO Auto-generated constructor stub
	}

	@Override 
	public void afisareDescriere() {
		// TODO Auto-generated method stub
		System.out.println("Item" + this.getNume());
	}

	@Override
	public ComponentaMeniu getComponenta(int pozitia) throws Exception {
		throw new Exception("Nu se poate!");
	}

	@Override
	public void adaugaComponenta(ComponentaMeniu componenta) {
		// TODO Auto-generated method stub
		throw new IllegalArgumentException();
	}

	@Override
	public void stergereComponenta(ComponentaMeniu componenta) {
		// TODO Auto-generated method stub
		
		throw new IllegalArgumentException();
	}

	
}
