package singleton_registry;

import java.util.HashMap;
import java.util.Map;

public class Firma {
	private String nume;
	private Integer numarAngajati;
	
	private static Map<String, Firma> firme = new HashMap<>();
	
	private Firma(String nume, Integer numarAngajati) {
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
	
	public static Firma getFirma(String nume) {
		if (!firme.containsKey(nume)) {
			firme.put(nume, new Firma(nume, 0));
		}
		return firme.get(nume);
	}

	@Override
	public String toString() {
		return "Firma [nume=" + nume + ", numarAngajati=" + numarAngajati + "]";
	}
}