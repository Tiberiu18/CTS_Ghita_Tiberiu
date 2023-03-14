package cts.clase.readers;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

import cts.clase.Aplicant;

public abstract class ReaderAplicant {
	
	public abstract List<Aplicant> readAplicanti(String numeFisier) throws FileNotFoundException;
		
	public void readAplicant(Aplicant aplicant, Scanner scanner) {		
		aplicant.setNume(scanner.next());
		aplicant.setPrenume(scanner.next());
		aplicant.setVarsta(scanner.nextInt());
		aplicant.setPunctaj(scanner.nextInt());
		int nrProiecte = scanner.nextInt();
		String[] denumiriProiect = new String[5];
		for (int i = 0; i < nrProiecte; i++) {
			denumiriProiect[i] = scanner.next();
		}
		aplicant.setNrProiecte(nrProiecte, denumiriProiect);
	}
}