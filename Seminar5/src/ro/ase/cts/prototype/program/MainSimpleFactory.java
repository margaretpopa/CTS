package ro.ase.cts.prototype.program;


import ro.ase.cts.simplefactory.FactorySingleton;
import ro.ase.cts.simplefactory.Jucator;
import ro.ase.cts.simplefactory.TipJucator;

public class MainSimpleFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		FactorySingleton factorySingleton= FactorySingleton.getInstance();
		//Factory factory= new Factory();
		Jucator portar=factorySingleton.getJucator(TipJucator.PORTAR,"Cristian", 27);
		Jucator fundas=factorySingleton.getJucator(TipJucator.FUNDAS,"Maria", 28);
		System.out.println(portar.toString());
		System.out.println(fundas.toString());
		
	
	}

}
