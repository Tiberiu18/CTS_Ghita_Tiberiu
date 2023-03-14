package cts.clase.readers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import cts.clase.Angajat;
import cts.clase.Aplicant;

public class ReaderAngajat extends ReaderAplicant {

	@Override
	public List<Aplicant> readAplicanti(String numeFisier) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File(numeFisier));
		scanner.useDelimiter(",");
		List<Aplicant> angajati = new ArrayList<Aplicant>();
		while (scanner.hasNext()) {
			Angajat angajat = new Angajat();
			super.readAplicant(angajat, scanner);
			angajat.setSalariu(scanner.nextInt());
			angajat.setOcupatie(scanner.next());
			angajati.add(angajat);
		}
		scanner.close();
		return angajati;
	}
}