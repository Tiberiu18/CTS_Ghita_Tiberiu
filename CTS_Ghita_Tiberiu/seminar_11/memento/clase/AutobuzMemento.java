package memento.clase;

public class AutobuzMemento {
	private String numeSofer;
	private Double consumMediu;

	public AutobuzMemento(String numeSofer, Double consumMediu) {
		super();
		this.numeSofer = numeSofer;
		this.consumMediu = consumMediu;
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

}
