package singleton;

public class Rector {
	private String nume;
	private Integer numarMandate;
	private Integer varsta;
	
	private static Rector instanta = null;
	
	private Rector(String nume, Integer numarMandate, Integer varsta) {
		this.nume = nume;
		this.numarMandate = numarMandate;
		this.varsta = varsta;
	}
	
	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public Integer getNumarMandate() {
		return numarMandate;
	}

	public void setNumarMandate(Integer numarMandate) {
		this.numarMandate = numarMandate;
	}

	public Integer getVarsta() {
		return varsta;
	}

	public void setVarsta(Integer varsta) {
		this.varsta = varsta;
	}

	public static Rector getInstanta() {
		return instanta;
	}

	public static void setInstanta(Rector instanta) {
		Rector.instanta = instanta;
	}

	public static synchronized Rector getInstanta(String nume, Integer numarMandate, Integer varsta) {
		if (instanta == null) {
			instanta = new Rector(nume, numarMandate, varsta);
		}
		return instanta;
	}

	@Override
	public String toString() {
		return "Rector [nume=" + nume + ", numarMandate=" + numarMandate + ", varsta=" + varsta + "]";
	}
}