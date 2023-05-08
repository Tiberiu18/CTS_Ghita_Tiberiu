package cor.clase;

public class NotificareManager extends Notificator {

	@Override
	public void notificaClient(Client client, String mesaj) {
		System.out.println("Clientul " + client.getNume() + " nu are date de contact");
	}

}
