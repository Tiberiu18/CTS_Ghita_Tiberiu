package strategy.clase;

public class Client {
	private String nume;
	private ModPlata modPlata;
	
	public Client(String nume) {
		this.nume = nume;
		this.modPlata = new PlataCard();
	}

	public Client(String nume, ModPlata modPlata) {
		this.nume = nume;
		this.modPlata = modPlata;
	}

	public void setModPlata(ModPlata modPlata) {
		this.modPlata = modPlata;
	}

	public void realizeazaPlata(Double sumaPlata) {
		this.modPlata.plateste(nume, sumaPlata);
	}

}
