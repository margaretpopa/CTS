package ro.ase.cts.memento.clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerMeci {

	private List<Memento> listaMeciuriSalvate;

	public ManagerMeci(List<Memento> listaMeciuriSalvate) {
		super();
		this.listaMeciuriSalvate = new ArrayList<>();
	}
	
	
	public ManagerMeci() {
		super();
		this.listaMeciuriSalvate = new ArrayList<>();
	}
	
	public void adaugaMemento(Memento memento)
	{
		listaMeciuriSalvate.add(memento);
	}
	
	public Memento getMemento(int pozitie)
	{
		if(pozitie>=0 && pozitie<listaMeciuriSalvate.size())
		{
			return this.listaMeciuriSalvate.get(pozitie);
		}
		throw new IndexOutOfBoundsException();
	}
	
	public Memento undo()
	{
		return this.listaMeciuriSalvate.get(this.listaMeciuriSalvate.size()-1);
	}
}
