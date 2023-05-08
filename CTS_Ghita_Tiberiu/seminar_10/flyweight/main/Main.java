package flyweight.main;

import flyweight.clase.FabricaClienti;
import flyweight.clase.IClient;
import flyweight.clase.Rezervare;

public class Main {

	public static void main(String[] args) {
		FabricaClienti fabrica = new FabricaClienti();
		
		Rezervare rezervare1 = new Rezervare(1, 1, 2, 16);
		Rezervare rezervare2 = new Rezervare(2, 2, 4, 18);
		Rezervare rezervare3 = new Rezervare(3, 3, 6, 20);
		Rezervare rezervare4 = new Rezervare(4, 4, 8, 22);
		
		IClient client1 = fabrica.getClient("Ionut");
		client1.detaliiRezervare(rezervare1);
		fabrica.getClient("Ionut").detaliiRezervare(rezervare2);
		
		IClient client2 = fabrica.getClient("Diana");
		client2.detaliiRezervare(rezervare3);
		fabrica.getClient("Diana").detaliiRezervare(rezervare4);
	}

}
