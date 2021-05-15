package ro.ase.cts.observer.clase;

import java.util.ArrayList;
import java.util.List;

public abstract class ManagerSalaAbstract {
	List<Observer> listaClientiAbonati;

	public ManagerSalaAbstract() {
		super();
		this.listaClientiAbonati = new ArrayList<>();
	}
	
	public void aboneaza(Observer observer) {
		listaClientiAbonati.add(observer);
	}
	
	public void dezaboneaza(Observer observer) {
		listaClientiAbonati.remove(observer);
	}
	
	public void notifica(String mesajAnunt) {
		for(Observer observer : listaClientiAbonati) {
			observer.primesteAnunt(mesajAnunt);
		}
	}
	
}