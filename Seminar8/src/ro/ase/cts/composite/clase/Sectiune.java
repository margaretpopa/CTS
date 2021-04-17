package ro.ase.cts.composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Sectiune extends ComponentaMeniu{

	
	private List<ComponentaMeniu> componente;
	
	
	
	
	public Sectiune(String nume) {
		super(nume);
		this.componente = new ArrayList<>();
	}

	@Override
	public void afisareDescriere() {
		// TODO Auto-generated method stub
		System.out.println("Sectiune: "+ this.getNume());
		for(ComponentaMeniu componenta:this.componente) {
			componenta.afisareDescriere();
		}
	}

	@Override
	public ComponentaMeniu getComponenta(int pozitia){
		// TODO Auto-generated method stub
		if(pozitia <componente.size() && pozitia>=0)
		{
			return componente.get(pozitia);
		}
		else
		{
			throw new IndexOutOfBoundsException();
		}
	}

	@Override
	public void adaugaComponenta(ComponentaMeniu componenta) {
		// TODO Auto-generated method stub
		componente.add(componenta);
	}

	@Override
	public void stergereComponenta(ComponentaMeniu componenta) {
		// TODO Auto-generated method stub
		componente.remove(componenta);
	}
	

}
