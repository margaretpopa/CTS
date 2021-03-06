package ro.ase.cts.composite.program;

import ro.ase.cts.composite.clase.ItemSauNodFrunza;
import ro.ase.cts.composite.clase.Sectiune;

public class Main {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sectiune bauturi=new Sectiune("bauturi");
		Sectiune aperitive=new Sectiune("aperitive");
		
		ItemSauNodFrunza cola=new ItemSauNodFrunza("Cola");
		ItemSauNodFrunza fanta=new ItemSauNodFrunza("Fanta");
	
		ItemSauNodFrunza bruschete=new ItemSauNodFrunza("Bruschete");
	
		bauturi.adaugaComponenta(cola);
		bauturi.adaugaComponenta(fanta);
		
		aperitive.adaugaComponenta(bruschete);
		
		Sectiune meniu=new Sectiune("Meniu");
		meniu.adaugaComponenta(bauturi);
		meniu.adaugaComponenta(aperitive);
		
		meniu.afisareDescriere();
	}

}
