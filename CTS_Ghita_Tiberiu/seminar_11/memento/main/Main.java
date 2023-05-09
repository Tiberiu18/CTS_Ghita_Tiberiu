package memento.main;

import memento.clase.Autobuz;
import memento.clase.AutobuzMemento;
import memento.clase.Operator;

public class Main {

	public static void main(String[] args) {
		Autobuz autobuz = new Autobuz("Ionut", 5.7, "Model A", 2010, 32);
		System.out.println(autobuz);
		
		Operator operator = new Operator();
		operator.adaugaMemento(autobuz.creeareMemento());
		AutobuzMemento autobuzMemento = operator.getMemento(0);
		autobuzMemento.setNumeSofer("Dan");
		autobuzMemento.setConsumMediu(9.2);
		autobuz.restaurareAutobuz(autobuzMemento);
		
		System.out.println(autobuz);
		
	}

}
