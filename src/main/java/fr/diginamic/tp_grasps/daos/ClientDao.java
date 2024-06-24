package fr.diginamic.tp_grasps.daos;

import java.util.Optional;
import java.util.stream.Stream;

import fr.diginamic.tp_grasps.beans.Client;
import fr.diginamic.tp_grasps.beans.ClientPremium;

public class ClientDao {

	private static final Client[] clients = {new ClientPremium("1"), new ClientPremium("2"), new Client("3")};
	
	public Client extraireClient(String id) {
		
		Optional<Client> opt = Stream.of(clients).filter(c->c.getIdentifiantClient().equals(id)).findAny();
        return opt.orElse(null);
    }

}
