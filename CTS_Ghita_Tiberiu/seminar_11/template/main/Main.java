package template.main;

import template.clase.MasaLocala;
import template.clase.MasaRezervata;

public class Main {

	public static void main(String[] args) {
		MasaLocala masaLocala = new MasaLocala(7);
		masaLocala.ocupaMasa();

		MasaRezervata masaRezervata = new MasaRezervata(9, 16);
		masaRezervata.ocupaMasa();
	}

}
