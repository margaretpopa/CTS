package ro.ase.cts.simplefactory;

public abstract class Jucator {
   private String nume;
   private int varsta;
public Jucator(String nume, int varsta) {
	super();
	this.nume = nume;
	this.varsta = varsta;
}
@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Jucator [nume=");
	builder.append(nume);
	builder.append(", varsta=");
	builder.append(varsta);
	builder.append("]");
	return builder.toString();
}
public void setNume(String nume) {
	this.nume = nume;
}
public void setVarsta(int varsta) {
	this.varsta = varsta;
}
   
   
}
