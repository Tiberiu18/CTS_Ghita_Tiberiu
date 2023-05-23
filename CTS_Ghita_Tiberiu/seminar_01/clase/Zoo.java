package clase;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
	
	private String name;
	private ZooKeeper zooKeeper;
	private List<Animal> listaAnimale;
	
	public Zoo(String name, ZooKeeper zooKeeper) {
		super();
		this.name = name;
		this.zooKeeper = zooKeeper;
		this.listaAnimale = new ArrayList<Animal>();
	}
	
	public void feedAllAnimals() {
		for(int i = 0; i < listaAnimale.size(); i++) {
			zooKeeper.feedAnimal(listaAnimale.get(i));
		}
	}
	
	public void adaugaAnimal(Animal animal) {
		listaAnimale.add(animal);
	}
	
	public void eliminaAnimal(Animal animal) {
		listaAnimale.remove(animal);
	}
	
}
