package ro.ase.cts.strategy.program;

import ro.ase.cts.strategy.clase.Client;
import ro.ase.cts.strategy.clase.PlataCard;
import ro.ase.cts.strategy.clase.PlataCash;

public class Main {
	
 public static void main(String[] args)
 {
	 Client client = new Client("Margaret",new PlataCard());
	 client.plateste(20);
	 client.setiModPlata(new PlataCash());
	 client.plateste(5);
 }
}
