package cts.clase;

import java.util.Arrays;

public class Student extends Aplicant {
	protected String facultate;
	protected int anStudii;
	private static int sumaFinantare;
	
	public Student() {
		super();	
	}
	
	public Student(String nume, String prenume, int varsta, int punctaj, 
			int nr_proiecte, String[] denumireProiect, String facultate, int an_studii) {
		super(nume,prenume,varsta,punctaj,nr_proiecte,denumireProiect);
		this.facultate = facultate;
		this.anStudii = an_studii;
	}
	
	public String getFacultate() {
		return facultate;
	}
	
	public void setFacultate(String facultate) {
		this.facultate = facultate;
	}
	
	public int getAnStudii() {
		return anStudii;
	}
	
	public void setAnStudii(int anStudii) {
		this.anStudii = anStudii;
	}
	
	public static int getSumaFinantare() {
		return sumaFinantare;
	}
	
	public static void setSumaFinantare(int sumaFinantare) {
		Student.sumaFinantare = sumaFinantare;
	}

	@Override
	public String toString() {
		return "Student: Nume=" + nume + ", Prenume=" + prenume + ", Varsta=" 
				+ varsta + ", Punctaj=" + punctaj + ", Nr_proiecte=" + nrProiecte +  ", DenumireProiect=" 
				+ Arrays.toString(denumiriProiect) + "Facultate=" + facultate + ", An_studii=" + anStudii;
	}
	
	@Override
	public void afisareFinantare() {
		super.afisareFinantare("Studentul", sumaFinantare);		
	}	
}