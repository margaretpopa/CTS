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

}
