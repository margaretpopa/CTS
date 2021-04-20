package ro.ase.cts.state.program;

import ro.ase.cts.state.clase.Liber;
import ro.ase.cts.state.clase.Masa;
import ro.ase.cts.state.clase.Ocupata;
import ro.ase.cts.state.clase.Rezervata;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Masa masa=new Masa(1);
		masa.rezervaMasa("Margueruita");
		masa.rezervaMasa("Maricica");
		masa.ocupaMasa("GIgi");
		masa.elibereazaMasa("Gigi");
		
		Masa masa2= new Masa(2);
		Rezervata rezervata = new Rezervata();
		Ocupata ocupata =new Ocupata();
		Liber libera = new Liber();
		
		libera.modificareStare(masa2);
		rezervata.modificareStare(masa2);
		ocupata.modificareStare(masa2);
		

	}

}
