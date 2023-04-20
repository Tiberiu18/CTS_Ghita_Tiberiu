package singleton_registry2;

import java.util.HashMap;
import java.util.Map;

import singleton_registry2.Firma;

public class Registru {
	private static Registru instanta = null;
	private static Map<String, Firma> firme = new HashMap<>();
	
	public static Firma getFirma(String nume) {
		if (!firme.containsKey(nume)) {
			firme.put(nume, new Firma(nume, 0));
		}
		return firme.get(nume);
	}
	
	public static Registru getRegistru() {
		if (instanta == null) {
			instanta = new Registru();
		}
		return instanta;
	}
}
