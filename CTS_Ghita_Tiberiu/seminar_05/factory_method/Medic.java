package factory_method;

public class Medic implements PersonalSpital {
	private String nume;

	public Medic(String nume) {
		super();
		this.nume = nume;
	}

	@Override
	public void descriere() {
		System.out.println("Medicul " + nume);

	}

}