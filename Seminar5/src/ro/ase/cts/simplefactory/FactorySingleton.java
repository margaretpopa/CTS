package ro.ase.cts.simplefactory;

public class FactorySingleton {

	private static FactorySingleton factorySingletonInstance=null;
	
	private FactorySingleton()
	{
		
	}
	
	public static synchronized FactorySingleton getInstance()
	{
		if(factorySingletonInstance==null)
		{
			factorySingletonInstance=new  FactorySingleton();
		}
		return factorySingletonInstance;
	}
	
	public Jucator getJucator(TipJucator tipJucator,String nume, int varsta)
	{
		switch(tipJucator) {
		case PORTAR: return new Portar(nume,varsta);
		case FUNDAS: return new Fundas(nume,varsta);
		case ATACANT:return new Atacant(nume,varsta);
		default: 
			throw new IllegalArgumentException();
		}
	}
}
