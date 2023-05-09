package template.clase;

public class MasaLocala extends MasaRestaurant {

	public MasaLocala(int nr) {
		super(nr);
	}

	@Override
	public void curataMasa() {
		System.out.println("\nChelnerul curata masa " + this.getNr() + " pentru persoanele de la usa");
	}

	@Override
	public void aseazaServetele() {
		System.out.println("Chelnerul aseaza servetele pe masa " + this.getNr() + " pentru persoanele de la usa");
	}

	@Override
	public void aseazaTacamuri() {
		System.out.println("Chelnerul aseaza tacamuri pe masa " + this.getNr() + " pentru persoanele de la usa");
	}

	@Override
	public void invitaPersoane() {
		System.out.println("Chelnerul invita persoanele la masa " + this.getNr());
	}

}
