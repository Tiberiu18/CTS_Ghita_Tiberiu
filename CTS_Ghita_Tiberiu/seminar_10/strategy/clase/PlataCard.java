package strategy.clase;

public class PlataCard implements ModPlata {

	@Override
	public void plateste(String numeClient, Double sumaPlata) {
		System.out.println("Clientul :" + numeClient + " realizeaza plata cu Cardul pentru suma de " + sumaPlata);
	}
	
}
