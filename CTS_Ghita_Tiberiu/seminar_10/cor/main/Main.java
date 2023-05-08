package cor.main;

import cor.clase.Client;
import cor.clase.NotificareMail;
import cor.clase.NotificareManager;
import cor.clase.NotificareTelefon;
import cor.clase.Notificator;

public class Main {

	public static void main(String[] args) {
		Notificator notificatorTelefon = new NotificareTelefon();
		Notificator notificatorMail = new NotificareMail();
		Notificator notificatorManager = new NotificareManager();

		notificatorTelefon.setSuccesor(notificatorMail);
		notificatorMail.setSuccesor(notificatorManager);

		Client client1 = new Client("Ana","1234", "mailana@gmail.com");
		Client client2 = new Client("Dan", null, "maildan@gmail.com");
		Client client3 = new Client("Andreea", "5678", null);
		Client client4 = new Client("Ionut", null, null);
		
		notificatorTelefon.notificaClient(client1, "mesaj 1");
		notificatorTelefon.notificaClient(client2, "mesaj 2");
		notificatorTelefon.notificaClient(client3, "mesaj 3");
		notificatorTelefon.notificaClient(client4, "mesaj 4");

	}

}
