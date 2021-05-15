package ro.ase.cts.memento.program;

import ro.ase.cts.memento.clase.ManagerMeci;
import ro.ase.cts.memento.clase.Memento;
import ro.ase.cts.memento.clase.OriginatorMeciJucat;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OriginatorMeciJucat meciJucat= new OriginatorMeciJucat(100,"FCSB","Dinamo",20,100);
	    Memento memento= meciJucat.creareMemento();
	    ManagerMeci managerMeci= new ManagerMeci();
	    managerMeci.adaugaMemento(memento);
	    
	    meciJucat.setNrSpectatori(200);
	    meciJucat.setNumeEchipaGazda("Universitatea Craiva");
	    meciJucat.setNumeEchipaOaspeti("CFR Cluj");
	    managerMeci.adaugaMemento(meciJucat.creareMemento());
	    
	    System.out.println(meciJucat);
	    
	    meciJucat.setMemento(managerMeci.getMemento(0));
	    System.out.println(meciJucat);
	}

}
