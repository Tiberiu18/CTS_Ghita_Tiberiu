package cts.clase;

import java.util.Arrays;

public class Angajat extends Aplicant{
	private String ocupatie;
	private int salariu;
	private static int sumaFinantare;
	
	public Angajat() {
		super();	
	}
	
	public Angajat(String nume, String prenume, int varsta, int punctaj, 
			int nrProiecte, String[] denumiriProiect,int salariu,String ocupatie) {
		super(nume,prenume,varsta,punctaj,nrProiecte,denumiriProiect);
		this.salariu = salariu;
		this.ocupatie = ocupatie;
	}
	
	public String getOcupatie() {
		return ocupatie;
	}
	
	public void setOcupatie(String ocupatie) {
		this.ocupatie = ocupatie;
	}
	
	public int getSalariu() {
		return salariu;
	}
	
	public void setSalariu(int salariu) {
		this.salariu = salariu;
	}
	
	public static int getSumaFinantare() {
		return sumaFinantare;
	}
	
	public static void setSumaFinantare(int sumaFinantare) {
		Angajat.sumaFinantare = sumaFinantare;
	}
	
	@Override
	public String toString() {
		return "Angajat: Nume=" + nume + ", Prenume=" + prenume
				+ ", Varsta=" + varsta + ", Punctaj=" + punctaj + ", Nr_proiecte=" + nrProiecte + ", DenumireProiect="
				+ Arrays.toString(denumiriProiect) + "Ocupatie=" + ocupatie + ", salariu=" + salariu;
	}
	
	@Override
	public void afisareFinantare() {
		super.afisareFinantare("Angajatul", sumaFinantare);
	}
}