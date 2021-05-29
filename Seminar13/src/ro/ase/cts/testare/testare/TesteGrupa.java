package ro.ase.cts.testare.testare;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import ro.ase.cts.testare.clase.Grupa;

public class TesteGrupa {

	//BICEP
	//B-BOUNDARY
	//I-INVERSE RELATIONSHIP - fa test aplicand reguli de inverse -> plec de la rezultatul obtinut si ajung la inputul dat (metoda care aduna 2 nr)
	//C - cross-check : testam rezultatul obtinut prin intermediul altei metode
	//E - error condition : testam cum se comporta metoda in conditiile de eroare
	//P - performance : testam cat timp dureaza 
	
	//C - componence : daca inputul dat respecta formatul corespunzator
	//O- ordine : daca lista este in ordine sau nu (testele de ordering se aplica in general pe metode care lucreaza cu colectii)
	//R - range : interval - o data ce am stabilit intervalul, testam cu valori din interiorul intervalului dar si cu valorile limita ale acestui interval
	//R - reference : referinte externe, lucrurile obiectele metodele folosite in cadrul metodei, dar fac parte din alta clasa/framework
	//E - existence : verificam existenta cuiva: verificam daca s-a alocat sspatiu pentru  lista,daca exista
	//C - cardinary :
	//T - time : asemanator cu performance - testam timpul in care rezolva problema metoda + verificam daca metodele se apeleaza in ordine corecta
	
	@Test
	public void testConstructorRight() {
		Grupa grupa= new Grupa(1085);		
		assertEquals(1085,grupa.getNrGrupa());
	}
	
	@Test
	public void testBoundaryLimitaInferioara() {
		Grupa grupa= new Grupa(1000);
	   assertEquals(1000, grupa.getNrGrupa());		
	}
	
	
	@Test
	public void testBoundaryLimitaSuperioara() {
		Grupa grupa= new Grupa(1100);
	   assertEquals(1100, grupa.getNrGrupa());		
	}

	@Test(expected=IllegalArgumentException.class)
	public void testErrorLimitaInferioara()
	{		
			Grupa grupa= new Grupa(700);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testErrorLimitaSuperioara()
	{		
			Grupa grupa= new Grupa(1200);
	}
	
	@Test(timeout=500)
	public void testarePerformanta()
	{
		Grupa grupa= new Grupa(1085);
	}
	
	@Test
	public void testExistance()
	{
		Grupa grupa= new Grupa(1085);
		assertNotNull(grupa.getStudenti());
	}
	
	
}