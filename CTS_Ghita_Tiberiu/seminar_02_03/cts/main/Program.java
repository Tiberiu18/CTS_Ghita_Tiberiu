package cts.main;

import java.io.FileNotFoundException;
import java.util.List;

import cts.clase.Angajat;
import cts.clase.Aplicant;
import cts.clase.readers.ReaderAngajat;

public class Program {

	public static void main(String[] args) {
		ReaderAngajat readerAngajat = new ReaderAngajat();
		List<Aplicant> listaAngajati;
		try {
			listaAngajati = readerAngajat.readAplicanti("seminar_02_03/angajati.txt");
			for (Aplicant angajat:listaAngajati) {
				Angajat.setSumaFinantare(30);
				System.out.println(angajat.toString());
				angajat.afisareFinantare();
				angajat.afisareStatus();
			}		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}