package gume.radnja;

import java.util.LinkedList;

import gume.AutoGuma;
/**
 * Klasa koja predstavlja Vulkanizersku radnju sa listom guma.
 * @author Uros Veljkovic
 * 
 */
public class VulkanizerskaRadnja {

	/**
	 * Lista guma u vulkanizerskoj radnji
	 */
	private LinkedList<AutoGuma> gume = new LinkedList<AutoGuma>();

	/**
	 * Metoda za dodavanje nove gume u listu guma
	 * @param objekat tipa AutoGuma
	 */
	public void dodajGumu(AutoGuma a) {
		if (a == null)
			throw new NullPointerException("Guma ne sme biti null");
		if (gume.contains(a))
			throw new RuntimeException("Guma vec postoji");
		gume.addFirst(a);
	}

	/**
	 * Metoda koja na osnovu ulaznog parametra (String markaModel) pronalazi gumu u listi
	 * @param String markaModel
	 * @return
	 */
	public LinkedList<AutoGuma> pronadjiGumu(String markaModel) {
		if (markaModel == null)
			return null;
		LinkedList<AutoGuma> novaLista = new LinkedList<AutoGuma>();
		for (int i = 0; i < gume.size(); i++)
			if (gume.get(i).equals(markaModel))
				novaLista.add(gume.get(i));
		return novaLista;
	}

}
