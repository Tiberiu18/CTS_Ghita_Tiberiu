package clase;

public class Papagal extends Animal {
	
	public Papagal(String name, int age) {
		super(name, age);
	}

	@Override
	public void eat(String numeIngrijitor) {
		System.out.println("Papagalul a fost hranit de " + numeIngrijitor + ".");
	}
	
}
