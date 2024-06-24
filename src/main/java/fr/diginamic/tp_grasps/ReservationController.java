package fr.diginamic.tp_grasps;

import fr.diginamic.tp_grasps.beans.Reservation;
import fr.diginamic.tp_grasps.factories.ReservationFactory;
import org.springframework.web.bind.annotation.RequestBody;

/** Controlleur qui prend en charge la gestion des réservations client
 * @author RichardBONNAMY
 *
 */
public class ReservationController {

	private ReservationFactory factory;

	public void setReservationFactory(ReservationFactory factory) {
		this.factory = factory;
	}

	public Reservation createReservation(@RequestBody Params params) {
		// 1) Récupération des infos provenant de la classe appelante
		String identifiantClient = params.getIdentifiantClient();
		String dateReservationStr = params.getDateReservation();
		String typeReservation = params.getTypeReservation();
		return factory.createReservation(identifiantClient, dateReservationStr, typeReservation, params.getNbPlaces());
	}
}
