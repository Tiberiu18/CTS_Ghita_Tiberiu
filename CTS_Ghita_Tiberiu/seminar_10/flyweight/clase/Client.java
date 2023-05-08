package flyweight.clase;

public class Client implements IClient {
	private String nume;
	private String nrTelefon;
	private String adresa;

	public Client(String nume, String nrTelefon, String adresa) {
		super();
		this.nume = nume;
		this.nrTelefon = nrTelefon;
		this.adresa = adresa;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getNrTelefon() {
		return nrTelefon;
	}

	public void setNrTelefon(String nrTelefon) {
		this.nrTelefon = nrTelefon;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	@Override
	public void detaliiRezervare(Rezervare detalii) {
		System.out.println("Clientul " + this.nume + " a rezervat " + detalii);
	}

}
