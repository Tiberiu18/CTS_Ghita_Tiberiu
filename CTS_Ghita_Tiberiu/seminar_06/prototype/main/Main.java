package prototype.main;

import java.util.HashMap;
import java.util.Map;

import prototype.IReteta;
import prototype.Reteta;

public class Main {
	public static void main(String[] args) {
		Map<String, Double> solutii = new HashMap();
		solutii.put("Sulf", 23.5);
		solutii.put("Magneziu", 33.5);
		IReteta prototype = new Reteta("Reteta A", solutii, 57.0);
		Reteta farmacie = (Reteta) prototype.copy();
		Reteta laborator = (Reteta) prototype.copy();
		farmacie.setNume("Reteta pt farmacie");
		laborator.setNume("Reteta pt laborator");
		System.out.println(farmacie);
		System.out.println(laborator);
	}
}
