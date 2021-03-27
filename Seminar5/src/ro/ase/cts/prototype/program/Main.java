package ro.ase.cts.prototype.program;

import ro.ase.cts.prototype.clase.AbstractPrototype;
import ro.ase.cts.prototype.clase.Bilet;
import ro.ase.cts.prototype.clase.ClientStadion;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      AbstractPrototype abstractPrototype= new ClientStadion("Margaret", 21);
	  AbstractPrototype abstractPrototype1= abstractPrototype.copiaza();
	  
	  ClientStadion clientStadion=(ClientStadion)abstractPrototype.copiaza();
	
	  clientStadion.setDenumire("DenumireSchimbata");
	  System.out.println(abstractPrototype.toString());
	  System.out.println(abstractPrototype1.toString());
	  System.out.println(clientStadion.toString());
	
	  Bilet bilet=new Bilet(1,"echipa1","echipa2","27 mar, 10:00");
	  Bilet bilet1=(Bilet)bilet.copiaza();
	  bilet1.setCod(10);
	  System.out.println(bilet.toString());
	  System.out.println(bilet1.toString());
	 
	
	}

}
