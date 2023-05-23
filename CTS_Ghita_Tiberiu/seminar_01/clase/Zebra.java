package clase;

public class Zebra extends Animal {
	
	public Zebra(String name, int age) {
		super(name, age);
	}

	@Override
	public void eat(String numeIngrijitor) {
		System.out.println("Zebra " + super.getName() + " are varsta " + super.getAge() + " a fost hranita de " + numeIngrijitor + ".");
	}
	
}
