package ro.ase.cts.reader;

import ro.ase.cts.clase.Aplicant;

import java.io.FileNotFoundException;
import java.util.List;

public interface ReaderAplicant {
   List<Aplicant> readAplicanti(String file) throws FileNotFoundException;
}
