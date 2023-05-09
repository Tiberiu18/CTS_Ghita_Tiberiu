package memento.clase;

import java.util.ArrayList;
import java.util.List;

public class Operator {
	private List<AutobuzMemento> listaMemento = new ArrayList<>();

	public void adaugaMemento(AutobuzMemento autobuzMemento) {
		this.listaMemento.add(autobuzMemento);
	}

	public AutobuzMemento getMemento(int i) {
		return this.listaMemento.get(i);
	}

}
