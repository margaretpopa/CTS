package ro.ase.cts.observer.program;

import ro.ase.cts.observer.clase.ClientAbonat;
import ro.ase.cts.observer.clase.Observer;
import ro.ase.cts.observer.clase.ManagerSala;

public class Main {

	public static void main(String[] args) {
		ManagerSala managerSala=new ManagerSala("Sala sport");
		Observer clientAbonat1=new ClientAbonat("Cristina");
		Observer clientAbonat2=new ClientAbonat("Andrei");
		
		managerSala.aboneaza(clientAbonat1);
		managerSala.aboneaza(clientAbonat2);
		managerSala.anuntaMeci("fotbal");
		
		managerSala.dezaboneaza(clientAbonat2);
		managerSala.anuntaMeci("volei");
	}

}
