package singleton_registry2;

public class Firma {
	private String nume;
	private Integer numarAngajati;
	
	protected Firma(String nume, Integer numarAngajati) {
		super();
		this.nume = nume;
		this.numarAngajati = numarAngajati;
	}
	
	public String getNume() {
		return nume;
	}
	
	public void setNume(String nume) {
		this.nume = nume;
	}
	
	public Integer getNumarAngajati() {
		return numarAngajati;
	}
	
	public void setNumarAngajati(Integer numarAngajati) {
		this.numarAngajati = numarAngajati;
	}

	@Override
	public String toString() {
		return "Firma [nume=" + nume + ", numarAngajati=" + numarAngajati + "]";
	}
	
	public void angajeaza() {
		this.numarAngajati++;
	}
}
