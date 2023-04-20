package main;

import singleton_registry2.Firma;
import singleton_registry2.Registru;

public class Main {
	public static void main(String[] args) {
//		Rector rector = Rector.getInstanta("Vasile", 2, 40);
//		Rector rector2 = Rector.getInstanta("Ionut", 2, 50);
//		System.out.println(rector);
//		System.out.println(rector2);
		
//		Decan decan = Decan.getInstanta();
//		Decan decan2 = Decan.getInstanta();
//		System.out.println(decan);
//		System.out.println(decan2);
		
//		Firma firma = Firma.getFirma("SC FIRMA SRL");
//		Firma firma2 = Firma.getFirma("SC FIRMA2 SRL");
//		Firma firma3 = Firma.getFirma("SC FIRMA2 SRL");
//		firma.setNumarAngajati(20);
//		firma2.setNumarAngajati(30);
//		firma3.setNumarAngajati(40);
//		System.out.println(firma);
//		System.out.println(firma2);
//		System.out.println(firma3);
		
		Firma firma = Registru.getFirma("SC FIRMA SRL");
		Firma firma2 = Registru.getFirma("SC FIRMA2 SRL");
		Firma firma3 = Registru.getFirma("SC FIRMA2 SRL");
		firma.angajeaza();
		firma2.angajeaza();
		firma3.angajeaza();
		System.out.println(firma);
		System.out.println(firma2);
		System.out.println(firma3);
	}
}