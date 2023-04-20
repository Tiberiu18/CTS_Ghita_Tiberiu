package prototype;

import java.util.HashMap;
import java.util.Map;

public class Reteta implements IReteta {
	private String nume;
	private Map<String, Double> solutii = new HashMap();
	private Double gramaj;

	public Reteta(String nume, Map<String, Double> solutii, Double gramaj) {
		this.nume = nume;
		this.solutii = solutii;
		Double suma = 0.0;
		for (Double g : solutii.values()) {
			suma += g;
		}
		if (suma > gramaj) {
			throw new IllegalArgumentException();
		} else {
			this.gramaj = gramaj;
		}
	}

	private Reteta() {
		this.nume = "undefined";
		this.solutii = null;
		this.gramaj = 0.0;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public void setSolutii(Map<String, Double> solutii) {
		this.solutii = new HashMap();
		for (String key : solutii.keySet()) {
			this.solutii.put(key, solutii.get(key));
		}
	}

	public void setGramaj(Double gramaj) {
		this.gramaj = gramaj;
	}

	@Override
	public IReteta copy() {
		Reteta reteta = new Reteta();
		reteta.setNume(nume);
		reteta.setSolutii(solutii);
		reteta.setGramaj(gramaj);
		return reteta;

	}

	@Override
	public String toString() {
		return "Reteta [nume=" + nume + ", solutii=" + solutii + ", gramaj=" + gramaj + "]";
	}
	
	
}
