package builder;

public class PacientBuilder implements Builder {
	private Pacient pacient;

	public PacientBuilder() {
		this.pacient = new Pacient();
	}

	public PacientBuilder(String nume) {
		this.pacient = new Pacient();
		this.pacient.setNume(nume);
	}

	@Override
	public Pacient build() {
		return this.pacient;
	}

	public PacientBuilder setPatRabatabil(Boolean patRabatabil) {
		this.pacient.setPatRabatabil(patRabatabil);
		return this;
	}

	public PacientBuilder setMicDejunInclus(Boolean micDejunInclus) {
		this.pacient.setMicDejunInclus(micDejunInclus);
		return this;
	}

	public PacientBuilder setPapuciDeCamera(Boolean papuciDeCamera) {
		this.pacient.setPapuciDeCamera(papuciDeCamera);
		return this;
	}

}
