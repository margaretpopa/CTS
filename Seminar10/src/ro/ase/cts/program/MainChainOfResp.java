package ro.ase.cts.program;

import ro.ase.cts.clasechainofresp.Cont;
import ro.ase.cts.clasechainofresp.ContCredit;
import ro.ase.cts.clasechainofresp.ContCurent;
import ro.ase.cts.clasechainofresp.ContEconomii;

public class MainChainOfResp {
 
public static void main(String[] args)
{
	Cont contCurent = new ContCurent(200);
	Cont contEconomii=new ContEconomii(500);
	Cont contCredit=new ContCredit(700);
	
	contCurent.setCont(contEconomii);
	contEconomii.setCont(contCredit);
	
	contCurent.realizeazaPlata(150);
	contCurent.realizeazaPlata(60);
	contCurent.realizeazaPlata(490);
	contCurent.realizeazaPlata(250);
	contCurent.realizeazaPlata(300);
	
}
}
