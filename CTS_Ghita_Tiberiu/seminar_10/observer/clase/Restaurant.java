package observer.clase;

import java.util.ArrayList;
import java.util.List;

public class Restaurant implements Subject {

	private String numeRestaurant;
	private List<Observer> clientiAbonati;

	public Restaurant(String nume) {
		this.numeRestaurant = nume;
		this.clientiAbonati = new ArrayList<>();
	}

	@Override
	public void adaugaObserver(Observer observer) {
		this.clientiAbonati.add(observer);
	}

	@Override
	public void stergeObserver(Observer observer) {
		this.clientiAbonati.remove(observer);
	}

	@Override
	public void notificaAbonati(String mesaj) {
		this.clientiAbonati.forEach(ca -> ca.receptioneazaNotificare(mesaj));
	}
	
	public void notificaOfertaPret() {
		this.notificaAbonati(numeRestaurant + " sunt reduceri de pret la shaorma");
	}
	
	public void notificaSchimbareMeniu() {
		this.notificaAbonati(numeRestaurant + " avem produse noi la fructe de mare");
	}

}
