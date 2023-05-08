package strategy.clase;

public class PlataCash implements ModPlata {

	@Override
	public void plateste(String numeClient, Double sumaPlata) {
		System.out.println("Clientul :" + numeClient + " realizeaza plata Cash pentru suma de " + sumaPlata);
	}

}
