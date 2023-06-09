package cts.clase.readers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import cts.clase.Aplicant;
import cts.clase.Student;

public class ReaderStudent extends ReaderAplicant {

	@Override
	public List<Aplicant> readAplicanti(String numeFisier) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File(numeFisier));
		scanner.useDelimiter(",|\n");
		List<Aplicant> studenti = new ArrayList<Aplicant>();
		while (scanner.hasNext()) {
			Student student = new Student();
			super.readAplicant(student, scanner);
			student.setAnStudii(scanner.nextInt());
			student.setFacultate(scanner.next().toString());
			studenti.add(student);
		}
		scanner.close();
		return studenti;
	}
}