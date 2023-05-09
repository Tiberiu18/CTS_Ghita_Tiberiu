package memento.clase;

public class Autobuz {
	private String numeSofer;
	private Double consumMediu;
	private String model;
	private int anFabricatie;
	private int nrLocuri;

	public Autobuz(String numeSofer, Double consumMediu, String model, int anFabricatie, int nrLocuri) {
		this.numeSofer = numeSofer;
		this.consumMediu = consumMediu;
		this.model = model;
		this.anFabricatie = anFabricatie;
		this.nrLocuri = nrLocuri;
	}

	public void restaurareAutobuz(AutobuzMemento autobuzMemento) {
		this.numeSofer = autobuzMemento.getNumeSofer();
		this.consumMediu = autobuzMemento.getConsumMediu();
	}

	public AutobuzMemento creeareMemento() {
		return new AutobuzMemento(numeSofer, consumMediu);
	}

	public String getNumeSofer() {
		return numeSofer;
	}

	public void setNumeSofer(String numeSofer) {
		this.numeSofer = numeSofer;
	}

	public Double getConsumMediu() {
		return consumMediu;
	}

	public void setConsumMediu(Double consumMediu) {
		this.consumMediu = consumMediu;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getAnFabricatie() {
		return anFabricatie;
	}

	public void setAnFabricatie(int anFabricatie) {
		this.anFabricatie = anFabricatie;
	}

	public int getNrLocuri() {
		return nrLocuri;
	}

	public void setNrLocuri(int nrLocuri) {
		this.nrLocuri = nrLocuri;
	}

	@Override
	public String toString() {
		return "Autobuz [numeSofer=" + numeSofer + ", consumMediu=" + consumMediu + ", model=" + model
				+ ", anFabricatie=" + anFabricatie + ", nrLocuri=" + nrLocuri + "]";
	}
}
