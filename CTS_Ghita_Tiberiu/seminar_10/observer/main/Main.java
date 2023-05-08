package observer.main;

import observer.clase.ClientRestaurant;
import observer.clase.Observer;
import observer.clase.Restaurant;
import observer.clase.Subject;

public class Main {

	public static void main(String[] args) {
		Restaurant restaurant = new Restaurant("Bonita");
		
		Observer client1 = new ClientRestaurant("Dan");
		Observer client2 = new ClientRestaurant("Ionut");
		Observer client3 = new ClientRestaurant("Andreea");
		
		restaurant.adaugaObserver(client1);
		restaurant.adaugaObserver(client2);
		
		restaurant.notificaOfertaPret();
		
		restaurant.stergeObserver(client2);
		restaurant.adaugaObserver(client3);
		
		restaurant.notificaSchimbareMeniu();
	}

}
