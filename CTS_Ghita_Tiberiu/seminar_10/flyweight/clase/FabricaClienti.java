package flyweight.clase;

import java.util.HashMap;
import java.util.Map;

public class FabricaClienti {
	private Map<String, IClient> clienti;

	public FabricaClienti() {
		this.clienti = new HashMap<>();
	}

	public IClient getClient(String nume) {
		if (this.clienti.get(nume) != null) {
			return clienti.get(nume);
		} else {
			IClient client = new Client(nume, "undefined", "undefined");
			clienti.put(nume, client);
			return client;
		}
	}

}
