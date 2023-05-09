package template.clase;

public abstract class MasaRestaurant {
	private int nr;

	public MasaRestaurant(int nr) {
		this.nr = nr;
	}

	public abstract void curataMasa();

	public abstract void aseazaServetele();

	public abstract void aseazaTacamuri();

	public abstract void invitaPersoane();

	public final void ocupaMasa() {
		curataMasa();
		aseazaServetele();
		aseazaTacamuri();
		invitaPersoane();
	}

	public int getNr() {
		return nr;
	}

	public void setNr(int nr) {
		this.nr = nr;
	}

}
