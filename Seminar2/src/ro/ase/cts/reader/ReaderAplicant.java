package ro.ase.cts.reader;

import ro.ase.cts.clase.Aplicant;

import java.io.FileNotFoundException;
import java.util.List;

public abstract class ReaderAplicant {
	private String numeFisier;
   public abstract List<Aplicant> readAplicanti() throws FileNotFoundException;
public ReaderAplicant(String numeFisier) {
	super();
	this.numeFisier = numeFisier;
}
   
   
}
