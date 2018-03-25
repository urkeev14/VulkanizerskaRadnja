package gume.radnja;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import gume.AutoGuma;

public class VulkanizerskaRadnjaTest {

	private VulkanizerskaRadnja vRadnja;
	private AutoGuma guma;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		
	}

	@Before
	public void setUp() throws Exception {
		vRadnja = new VulkanizerskaRadnja();

		guma = new AutoGuma();
		guma.setMarkaModel("Michelin");
		guma.setPrecnik(15);
		guma.setVisina(50);
		guma.setSirina(150);

	}

	@After
	public void tearDown() throws Exception {
		vRadnja = null;
		guma = null;
	}

	@Test
	public void testDodajGumu() {

		
		vRadnja.dodajGumu(guma);

		assertTrue(vRadnja.pronadjiGumu("Michelin").getFirst().equals(guma));
		//ispravljena greska u metodi pronadjiGumu

	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testDodajGumuNull() {
		vRadnja.dodajGumu(null);
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testDodajGumuPrecnikVanGranice() {

		guma.setMarkaModel("Michelin");
		guma.setPrecnik(0);
		guma.setVisina(50);
		guma.setSirina(150);

		vRadnja.dodajGumu(guma);
	}
	
	@Test(expected = java.lang.RuntimeException.class)
	public void testDodajGumuPostoji() {
		vRadnja.dodajGumu(guma);
		vRadnja.dodajGumu(guma);
	}
	

	@Test
	public void testPronadjiGumu() {
		
		assertEquals(null, vRadnja.pronadjiGumu(null));

	}

	// NOF - not object of.
	@Test
	public void testPronadjiGumuJednaGuma() {
		
		AutoGuma guma2 = new AutoGuma();
		guma2.setMarkaModel("Trayal");
		guma2.setSirina(156);
		guma2.setPrecnik(20);
		guma2.setVisina(40);
		
		vRadnja.dodajGumu(guma);
		vRadnja.dodajGumu(guma2);
		
		assertTrue(vRadnja.pronadjiGumu("Michelin").getLast().equals(guma));

	}
	
	@Test
	public void testPronadjiGumuViseGuma() {
		
		LinkedList<AutoGuma> pomocnaListaGuma = new LinkedList<>();
		
		AutoGuma guma2 = new AutoGuma();
		AutoGuma guma3 = new AutoGuma();
		
		guma2.setMarkaModel("Michelin");
		guma2.setSirina(156);
		guma2.setPrecnik(20);
		guma2.setVisina(40);
		
		guma3.setMarkaModel("Michelin");
		guma3.setSirina(155);
		guma3.setPrecnik(20);
		guma3.setVisina(40);
		
		vRadnja.dodajGumu(guma);
		vRadnja.dodajGumu(guma2);
		vRadnja.dodajGumu(guma3);
		
		pomocnaListaGuma.add(guma);
		pomocnaListaGuma.add(guma2);
		pomocnaListaGuma.add(guma3);
		
		for (int i = 0; i < pomocnaListaGuma.size(); i++) {
			if(!(vRadnja.pronadjiGumu("Michelin").contains((pomocnaListaGuma.get(i)))))
				fail("U listi se ne nalazi vise guma marke ");
		}
		
		
		
		
	}

}
