package seminar1;

import clase.Lion;
import clase.WildCat;
import clase.Zoo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Zoo zoo= new Zoo();
       Lion lion1= new Lion("Leo");
       Lion lion2= new Lion("Leona");
       zoo.addAnimal(lion1);
       zoo.addAnimal(lion2);
       zoo.feedAllAnimals();
       
       WildCat cat = new WildCat("pisica");
       WildCat cat1=new WildCat("pisica2","mancare");
       zoo.addAnimal(cat);
       zoo.addAnimal(cat1);
       zoo.feedAllAnimals();
       
	}

}
