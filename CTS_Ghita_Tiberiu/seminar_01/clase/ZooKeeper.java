package clase;

public class ZooKeeper {
	
	private String name;

	public ZooKeeper(String name) {
		super();
		this.name = name;
	}
	
	public void feedAnimal(Animal animal) {
		animal.eat(name);
	}
	
}
