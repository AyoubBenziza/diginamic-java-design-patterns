package fr.diginamic.tp_grasps;

import fr.diginamic.tp_grasps.beans.Reservation;
import fr.diginamic.tp_grasps.factories.ReservationFactory;
import org.springframework.web.bind.annotation.RequestBody;

/** Controlleur qui prend en charge la gestion des réservations client
 * @author RichardBONNAMY
 *
 */
public class ReservationController {

	public Reservation creerReservation(@RequestBody Params params) {
		// 1) Récupération des infos provenant de la classe appelante
		String identifiantClient = params.getIdentifiantClient();
		String dateReservationStr = params.getDateReservation();
		String typeReservation = params.getTypeReservation();
		return ReservationFactory.createReservation(identifiantClient, dateReservationStr, typeReservation, params.getNbPlaces());
	}
}
