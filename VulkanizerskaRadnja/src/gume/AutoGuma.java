package gume;

/**
 * Lista objekata klase AutoGuma predstavljace sve vrste guma u jednoj
 * vulkanizerskoj radnji.
 * 
 * @author user
 * @version 0.1
 */
public class AutoGuma {

	/**
	 * Model i marka konkretne gume.
	 */
	private String markaModel = null;
	/**
	 * Precnik gume u centimetrima
	 */
	private int precnik = 0;
	/**
	 * Sirina gume u centimetrima.
	 */
	private int sirina = 0;
	/**
	 * Visina gume u centimetrima
	 */
	private int visina = 0;

	
	/**
	 * Vraca vrednost atributa markaModel.
	 * @return naziv marke i modela gume u vidu String-a.
	 */
	public String getMarkaModel() {
		return markaModel;
	}

	/**
	 * Postavlja novu vrednost atributa markaModel.
	 * @param atribut markaModel koji predstavlja marku i model gume.
	 * @throws java.lang.RuntimeException.class ako je vrednost parametra null ili prazan String.
	 */
	public void setMarkaModel(String markaModel) {
		if (markaModel == null || markaModel.length() < 3)
			throw new RuntimeException("Morate uneti marku i model");
		this.markaModel = markaModel;
	}
	
	/**
	 * Vraca vrednost atributa precnik.
	 * @return precnik gume kao celobrojnu vrednost.
	 */
	public int getPrecnik() {
		return precnik;
	}

	/**
	 * Postavlja vrednost atributa precnik.
	 * @param precnik gume kao celobrojna vrednost.
	 * @throws java.lang.RuntimeException.class ako je uneti parametar manji od 13 ili veci od 22
	 */
	public void setPrecnik(int precnik) {
		if (precnik < 13 && precnik > 22)
			throw new RuntimeException("Precnik van opsega");
		this.precnik = precnik;
	}

	/**
	 * Vraca vrednost atributa sirina
	 * @return vrednost atributa sirina kao celobrojnu vrednost
	 */
	public int getSirina() {
		return sirina;
	}

	/**
	 * Postavlja vrednost atributa sirina.
	 * @param sirina gume kao celobrojna vrednost.
	 * @throws java.lang.RuntimeException.class ako je uneti parametar manji od 135 ili veci od 355
	 */
	public void setSirina(int sirina) {
		if (sirina < 135 && sirina > 355)
			throw new RuntimeException("Sirina van opsega");
		this.sirina = sirina;
	}

	/**
	 * Vraca vrednost atributa visna.
	 * @return visina gume kao celobrojna vrednost.
	 */
	public int getVisina() {
		return visina;
	}
	
	/**
	 * Postavlja vrednost atributa visina.
	 * @param visina gume kao celobrojna vrednost.
	 * @throws java.lang.RuntimeException.class ako je uneti parametar manji od 25 ili veci od 95
	 */
	public void setVisina(int visina) {
		if (visina < 25 || visina > 95)
			throw new RuntimeException("Visina van opsega");
		this.visina = visina;
	}

	/**
	 * Vraca informacije o konkretnoj gumi u vidu String-a.
	 * @return informacije o konkretnoj gumi u vidu String-a.
	 */
	@Override
	public String toString() {
		return "AutoGuma [markaModel=" + markaModel + ", precnik=" + precnik + ", sirina=" + sirina + ", visina="
				+ visina + "]";
	}

	/**
	 * Proverava da li je konkretan objekat isti kao objekat zadat u parametru.
	 * @param objekat tipa guma
	 * @return true ako su objekti jednaki, u suprotnom false
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AutoGuma other = (AutoGuma) obj;
		if (markaModel == null) {
			if (other.markaModel != null)
				return false;
		} else if (!markaModel.equals(other.markaModel))
			return false;
		if (precnik != other.precnik)
			return false;
		if (sirina != other.sirina)
			return false;
		if (visina != other.visina)
			return false;
		return true;
	}

}
