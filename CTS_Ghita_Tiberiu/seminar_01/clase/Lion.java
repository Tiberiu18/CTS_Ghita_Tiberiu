package clase;

public class Lion extends Animal {
	
	public Lion(String name, int age) {
		super(name, age);
	}

	@Override
	public void eat(String numeIngrijitor) {
		System.out.println("Leul " + super.getName() + " cu varsta " + super.getAge() + " a fost hranit de " + numeIngrijitor + ".");
	}
}
