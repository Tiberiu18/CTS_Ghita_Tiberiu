package factory_simple.main;

import java.util.ArrayList;
import java.util.List;

import factory_simple.Asistent;
import factory_simple.Factory;
import factory_simple.PersonalSpital;
import factory_simple.TipPersonalSpital;

public class Main {

	public static void main(String[] args) {
		Factory factory = new Factory();
		PersonalSpital asistent = factory.createInstance(TipPersonalSpital.ASISTENT, "Ionut");
		PersonalSpital medic = factory.createInstance(TipPersonalSpital.MEDIC, "Diana");
		PersonalSpital brancardier = factory.createInstance(TipPersonalSpital.BRANCARDIER , "Vlad");
		
//		asistent.descriere();
//		medic.descriere();
//		brancardier.descriere();
		
		List<PersonalSpital> listaPersonal = new ArrayList<>();
		listaPersonal.add(asistent);
		listaPersonal.add(medic);
		listaPersonal.add(brancardier);
		listaPersonal.add(factory.createInstance(TipPersonalSpital.MEDIC, "Dan"));
		listaPersonal.add(factory.createInstance(TipPersonalSpital.BRANCARDIER , "Radu"));
		listaPersonal.add(factory.createInstance(TipPersonalSpital.ASISTENT , "Anca"));
		listaPersonal.add(factory.createInstance(TipPersonalSpital.ASISTENT , "Antonia"));
		listaPersonal.add(factory.createInstance(TipPersonalSpital.ANESTEZIST, "Ian"));
		
		listaPersonal.forEach(p -> p.descriere());
		
	}

}
