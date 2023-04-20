package builder.main;

import builder.Pacient;
import builder.PacientBuilder;

public class Main {
	public static void main(String[] args) {
		PacientBuilder pacientBuilder = new PacientBuilder("Dan");
		Pacient pacient = pacientBuilder.setPapuciDeCamera(true).build();
		System.out.println(pacient);
		
		Pacient pacient2 = pacientBuilder.setMicDejunInclus(true).build();
		System.out.println(pacient2);
		
		Pacient pacient3 = pacientBuilder.setPatRabatabil(true).build();
		System.out.println(pacient3);
	}
}
