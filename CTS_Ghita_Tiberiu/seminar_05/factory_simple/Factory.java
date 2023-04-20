package factory_simple;

public class Factory {
	public Factory() {

	}

	public PersonalSpital createInstance(TipPersonalSpital tipPersonalSpital, String numePersonal) {
		switch (tipPersonalSpital) {
		case MEDIC:
			return new Medic(numePersonal);
		case ASISTENT:
			return new Asistent(numePersonal);
		case BRANCARDIER:
			return new Brancardier(numePersonal);
		case ANESTEZIST:
			return new Anestezist(numePersonal);
		default:
			return null;
		}

	}
}
