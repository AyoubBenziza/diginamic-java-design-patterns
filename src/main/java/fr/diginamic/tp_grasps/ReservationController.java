package fr.diginamic.tp_grasps;

import fr.diginamic.tp_grasps.beans.Client;
import fr.diginamic.tp_grasps.beans.Reservation;
import fr.diginamic.tp_grasps.beans.ReservationFactory;
import fr.diginamic.tp_grasps.beans.TypeReservation;
import fr.diginamic.tp_grasps.daos.ClientDao;
import fr.diginamic.tp_grasps.daos.TypeReservationDao;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/** Controlleur qui prend en charge la gestion des réservations client
 * @author RichardBONNAMY
 *
 */
public class ReservationController {

	private final ClientDao clientDao = new ClientDao();

	private final TypeReservationDao typeReservationDao = new TypeReservationDao();

	public Reservation creerReservation(@RequestBody Params params) {
		// 1) Récupération des infos provenant de la classe appelante
		String dateReservationStr = params.getDateReservation();

		// 3) Extraction de la base de données des informations client
		Client client = clientDao.extraireClient(params.getIdentifiantClient());

		// 4) Extraction de la base de données des infos concernant le type de la réservation
		TypeReservation type = typeReservationDao.extraireTypeReservation(params.getTypeReservation());

		Reservation reservation = ReservationFactory.getInstance(client, dateReservationStr, type, params.getNbPlaces());

		// 6) Ajout de la réservation au client
		List<Reservation> reservations = client.getReservations();
		reservations.add(reservation);

        return reservation;
    }
}
