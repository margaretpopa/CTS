package ro.ase.cts.program;

import ro.ase.cts.singletone.AsigurareMedicala;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// AsigurareMedicala asigurareMedicala =new AsigurareMedicala(1,"Margaret",110.5f);
// AsigurareMedicala asigurareMedicala2=new AsigurareMedicala(2,"Margaret",112.5f);
     //singletone
		AsigurareMedicala asigurareMedicala =AsigurareMedicala.getInstance();
	    AsigurareMedicala asigurareMedicala2=AsigurareMedicala.getInstance();
	    
	    asigurareMedicala.setId(2);
	    asigurareMedicala2.setContributie(350.4f);
	
	    //
 System.out.println(asigurareMedicala.toString());
 System.out.println(asigurareMedicala2.toString());
 
 
 //lazytone
 ro.ase.cts.singletonlazy.AsigurareMedicala asigurareLazy= ro.ase.cts.singletonlazy.AsigurareMedicala.getInstance(100, "Margaret", 300.5f);
 ro.ase.cts.singletonlazy.AsigurareMedicala asigurareLazy1= ro.ase.cts.singletonlazy.AsigurareMedicala.getInstance(10, "Margarettt", 350.5f);
 
 System.out.println(asigurareLazy.toString());
 System.out.println(asigurareLazy1.toString());
	}

}
