package state.clase;

public class Masa {
	private int nr;
	private Stare stare;

	public Masa(int nr) {
		this.nr = nr;
		this.stare = new StareLibera();
	}

	public int getNr() {
		return nr;
	}

	public void setNr(int nr) {
		this.nr = nr;
	}

	public Stare getStare() {
		return stare;
	}

	protected void setStare(Stare stare) {
		this.stare = stare;
	}

	public void rezervaMasa() {
		Stare stareRezervata = new StareRezervata();
		stareRezervata.schimbareStare(this);
	}

	public void ocupaMasa() {
		Stare stareOcupata = new StareOcupata();
		stareOcupata.schimbareStare(this);
	}

	public void elibereazaMasa() {
		Stare stareLibera = new StareLibera();
		stareLibera.schimbareStare(this);
	}

	public void ridicaRezervare() {
		ocupaMasa();
	}

}
