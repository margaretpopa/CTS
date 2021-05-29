package ro.ase.cts.testing;

import static org.junit.Assert.*;

import org.junit.Test;

import ro.ase.cts.clase.Student;

public class StudentTest {
//in Junit4 si 3, mesajul e pe prima pozitie
//in Junit 5, mesajul e pe a 2-a pozitie
	@Test
	public void testCorectitudineConstructorCuParametru() {
		String  nume="Gigel";
		Student student=new Student(nume);
		assertEquals(nume,student.getNume());
	}
	
	@Test
	public void testInitializareListaInConstructorCuParametru() {
		Student student = new Student("GIgel");
		assertNotNull(student.getNote());
		}
	
	@Test
	public void  testConstructorDefault()
	{
		Student student=new Student();
		assertNotNull("Numele nu a fost initializat",student.getNume());
		assertNotNull("Lista nu a fost initializata",student.getNote());
	}
	
	@Test
	public void testMetodaAdaugataNotaInLista()
	{
		Student student=new Student();
		int nota=10;
		student.adaugaNota(nota);
		assertEquals(nota,student.getNota(0));
		//regula 0,1,n -  ce se intampla cand e goala, cand are un element, cand are mai multe elemente
	}
	
	@Test
	public void testDimensiuneLista()
	{
		Student student=new Student();
		student.adaugaNota(10);
		student.adaugaNota(9);
		assertEquals(2, student.getNote().size());
	}
	//pentru fara note trebuie sa dea 0
	//pntru o singura nota- media este egal cu nota
	
	@Test
	public void testCalculeazaMediaCorecta()
	{
		Student student=new Student();
		student.adaugaNota(10);
		student.adaugaNota(9);
		//nu putem sa folosim assertEquals pentru valori reale
		assertEquals(9.5f,student.calculeazaMedie(),0.1);
		//0.1 - marja de eroare/delta
	}
	
	@Test
	public void testStudentCuRestanta()
	{
		Student student= new Student();
		student.adaugaNota(4);
		assertTrue(student.areRestante());
	}
	
	@Test
	public void testStudentFaraRestanta()
	{
		Student student= new Student();
		student.adaugaNota(10);
		assertFalse(student.areRestante());
	}
	
	@Test
	public void testGetNotaIndexInvalid()
	{
		//verificam ca daca se da indexul gresit, se arunca exceptie
		//varianta din junit3
		Student student=new Student();
		student.adaugaNota(10);
	//1	
		try
		{
			//2
			int nota=student.getNota(-1);
			//3 - nu se ajunge
			fail("NU trebuia sa ajunga aici.Metoda nu arunca exceptii");
		}
		catch(IndexOutOfBoundsException exception)
		{
			//4
		} catch(Exception exception)
		{
			//5- nu se ajunge
			fail("Tipul exceptiei aruncat nu este corect.");
		}
	}
		//6
//var din junit4
		@Test(expected=IndexOutOfBoundsException.class)
		public void testGetNotaIndexInvalidJUnit4() {
			Student student=new Student();
			student.adaugaNota(10);
		int nota=student.getNota(-1);
				
		}

}
