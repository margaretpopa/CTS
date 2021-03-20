package ro.ase.cts.exSeminar;


public class Templu {
  private String denumire;
  private int nrSlujitori;
  private float suprafata;
  
  private static Templu templu=null;
  
private Templu(String denumire, int nrSlujitori, float suprafata) {
	super();
	this.denumire = denumire;
	this.nrSlujitori = nrSlujitori;
	this.suprafata = suprafata;
}

public static synchronized Templu getInstance(String denumire,int nrSlujitori,float suprafata)
{
	if(templu==null) {
		templu=new Templu(denumire,nrSlujitori,suprafata);
	}
	return templu;
}


public void setDenumire(String denumire) {
	this.denumire = denumire;
}



public void setNrSlujitori(int nrSlujitori) {
	this.nrSlujitori = nrSlujitori;
}



public void setSuprafata(float suprafata) {
	this.suprafata = suprafata;
}

@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Templu [denumire=");
	builder.append(denumire);
	builder.append(", nrSlujitori=");
	builder.append(nrSlujitori);
	builder.append(", suprafata=");
	builder.append(suprafata);
	builder.append("]");
	return builder.toString();
}

}
