package factory_method.main;

import java.util.ArrayList;
import java.util.List;

import factory_method.Factory;
import factory_method.FactoryAsistent;
import factory_method.FactoryInfirmier;
import factory_method.FactoryMedic;
import factory_method.Infirmier;
import factory_method.PersonalSpital;

public class Main {

	public static void main(String[] args) {
		Factory factoryMedic = new FactoryMedic();
		Factory factoryAsistent = new FactoryAsistent();
		Factory factoryInfirmier = new FactoryInfirmier();

		List<PersonalSpital> listaPersonal = new ArrayList<>();
		listaPersonal.add(factoryMedic.createPersonal("Vlad"));
		listaPersonal.add(factoryAsistent.createPersonal("Ioana"));
		listaPersonal.add(factoryAsistent.createPersonal("Dan"));
		Infirmier infirmier = (Infirmier) factoryInfirmier.createPersonal("Andreea");
		infirmier.setAnVechime(10);
		listaPersonal.add(infirmier);

		listaPersonal.forEach(p -> p.descriere());

	}

}
