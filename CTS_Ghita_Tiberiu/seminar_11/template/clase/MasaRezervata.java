package template.clase;

public class MasaRezervata extends MasaRestaurant {
	private int oraRezervare;

	public MasaRezervata(int nr, int oraRezervare) {
		super(nr);
		this.oraRezervare = oraRezervare;
	}

	@Override
	public void curataMasa() {
		System.out.println(
				"\nChelnerul curata masa " + this.getNr() + " pentru rezervarea de la ora " + this.oraRezervare);
	}

	@Override
	public void aseazaServetele() {
		System.out.println("Chelnerul aseaza servetele pe masa " + this.getNr() + " pentru rezervarea de la ora "
				+ this.oraRezervare);
	}

	@Override
	public void aseazaTacamuri() {
		System.out.println("Chelnerul aseaza tacamuri pe masa " + this.getNr() + " pentru rezervarea de la ora "
				+ this.oraRezervare);
	}

	@Override
	public void invitaPersoane() {
		System.out.println("Va asteptam la masa " + this.getNr() + " pentru rezervarea de la ora " + this.oraRezervare);
	}

}
