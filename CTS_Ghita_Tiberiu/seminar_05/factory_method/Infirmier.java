package factory_method;

public class Infirmier implements PersonalSpital {
	private String nume;
	private Integer anVechime;

	public Infirmier(String nume, Integer anVechime) {
		super();
		this.nume = nume;
		this.anVechime = anVechime;
	}

	@Override
	public void descriere() {
		System.out.println("Infirmierul " + nume + " are " + anVechime + " ani vechime.");

	}

	public Integer getAnVechime() {
		return anVechime;
	}

	public void setAnVechime(Integer anVechime) {
		this.anVechime = anVechime;
	}

}