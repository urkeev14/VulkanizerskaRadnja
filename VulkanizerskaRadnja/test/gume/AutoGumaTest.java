package gume;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AutoGumaTest {

	AutoGuma guma;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		guma = new AutoGuma();
	}

	@After
	public void tearDown() throws Exception {
		guma = null;
	}

	@Test
	public void testSetMarkaModel() {
		guma.setMarkaModel("Opel Astra");

		assertEquals("Opel Astra", guma.getMarkaModel());
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testSetMarkaModelNull() {
		guma.setMarkaModel(null);
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testSetMarkaModelEmptyString() {
		guma.setMarkaModel("");
	}

	@Test
	public void testSetPrecnik() {
		guma.setPrecnik(15);

		assertEquals(15, guma.getPrecnik());
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testSetPrecnikIspodGranice() {
		guma.setPrecnik(2);
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testSetPrecnikIznadGranice() {
		guma.setPrecnik(23);
	}

	@Test
	public void testSetSirina() {
		guma.setSirina(155);

		assertEquals(155, guma.getSirina());
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testSetSirinaIznadGranice() {
		guma.setSirina(400);
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testSetSirinaIspodGranice() {
		guma.setSirina(100);
	}

	@Test
	public void testSetVisina() {
		guma.setVisina(50);

		assertEquals(50, guma.getVisina());
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testSetVisinaIznadGranice() {
		guma.setVisina(100);
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testSetVisinaIspodGranice() {
		guma.setVisina(1);
	}
	
	@Test
	public void testToString() {
		guma.setMarkaModel("Opel Astra");
		guma.setPrecnik(15);
		guma.setSirina(150);
		guma.setVisina(90);
		assertEquals("AutoGuma [markaModel=Opel Astra, precnik=15, sirina=150, visina=90]", guma.toString());
	}

	@Test
	public void testEqualsObjectTest() {
		//Zasto mi je naziv gume opel astra? Ne znam, al bitna je poenta
		guma.setMarkaModel("Opel Astra");
		guma.setPrecnik(15);
		guma.setSirina(150);
		guma.setVisina(90);

		AutoGuma guma2 = new AutoGuma();
		guma2.setMarkaModel("Opel Astra");
		guma2.setPrecnik(15);
		guma2.setSirina(150);
		guma2.setVisina(90);

		assertTrue(guma.equals(guma2));
	}	
	
	@Test
	public void testEqualsObjectFalse() {
		guma.setMarkaModel("Opel Astra");
		guma.setPrecnik(15);
		guma.setSirina(150);
		guma.setVisina(90);

		AutoGuma guma2 = new AutoGuma();
		guma2.setMarkaModel("Opel Corsa");
		guma2.setPrecnik(15);
		guma2.setSirina(150);
		guma2.setVisina(90);

		assertFalse(guma.equals(guma2));
		
	}

}
