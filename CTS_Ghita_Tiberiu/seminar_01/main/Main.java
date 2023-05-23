package main;

import clase.Lion;
import clase.Papagal;
import clase.Zebra;
import clase.Zoo;
import clase.ZooKeeper;

public class Main {

	public static void main(String[] args) {
		ZooKeeper zooKeeper = new ZooKeeper("Ana");
		Zoo zoo = new Zoo("Zoo", zooKeeper);
		
		zoo.adaugaAnimal(new Lion("Simba", 3));
		zoo.adaugaAnimal(new Zebra("Vergi", 5));
		zoo.feedAllAnimals();
		
		System.out.println("----------------------------------");
		
		zoo.adaugaAnimal(new Lion("Mustafa", 4));
		zoo.feedAllAnimals();
		
		System.out.println("----------------------------------");
		
		zoo.adaugaAnimal(new Papagal("Paco", 2));
		zoo.feedAllAnimals();
	}

}
