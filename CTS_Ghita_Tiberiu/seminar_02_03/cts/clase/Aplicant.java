package cts.clase;

public abstract class Aplicant{
	protected String nume;
	protected String prenume;
	protected int varsta;
	protected int punctaj;
	protected int nrProiecte;
	protected String[] denumiriProiect;
	protected static int pragAcceptare = 80;
	
	public Aplicant() {
		super();
	}
	
	public Aplicant(String nume, String prenume, int varsta, int punctaj, int nrProiecte, String[] denumiriProiect) {
		super();
		this.nume = nume;
		this.prenume = prenume;
		this.varsta = varsta;
		this.punctaj = punctaj;
		this.nrProiecte = nrProiecte;
		this.denumiriProiect = denumiriProiect;
	}
	
	public String getNume() {
		return nume;
	}
	
	public void setNume(String nume) {
		this.nume = nume;
	}
	
	public String getPrenume() {
		return prenume;
	}
	
	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}
	
	public int getVarsta() {
		return varsta;
	}
	
	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}
	
	public int getPunctaj() {
		return punctaj;
	}
	
	public void setPunctaj(int punctaj) {
		this.punctaj = punctaj;
	}
	
	public int getNrProiecte() {
		return nrProiecte;
	}
	
	public void setNrProiecte(int nrProiecte, String[] denumiriProiect) {
		this.nrProiecte = nrProiecte;
		this.denumiriProiect = new String[this.nrProiecte];
		for (int i = 0; i < this.nrProiecte; i++) {
			this.denumiriProiect[i] = denumiriProiect[i];
		}
	}
	
	public static int getPragAcceptare() {
		return pragAcceptare;
	}
	
	public static void setPragAcceptare(int pragAcceptare) {
		Aplicant.pragAcceptare = pragAcceptare;
	}
	
	public void afisareStatus() {
		System.out.println("Aplicantul " + nume + " " + prenume + 
				(punctaj > pragAcceptare ? "" : " nu") + 
				" a fost acceptat");	
	}
		
	public abstract void afisareFinantare();
	
	protected void afisareFinantare(String tipAplicant, int sumaFinantare) {
		System.out.println(tipAplicant + " "+getNume()+" "+getPrenume()+" primeste"+sumaFinantare+" Euro/zi in proiect.");
	}
}