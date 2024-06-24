package fr.diginamic.tp_grasps.beans;

import fr.diginamic.tp_grasps.daos.ClientDao;
import fr.diginamic.tp_grasps.daos.TypeReservationDao;

import java.time.LocalDateTime;

import static fr.diginamic.tp_grasps.utils.DateUtils.toDate;

public class ReservationFactory {

    private static final ClientDao clientDao = new ClientDao();

    private static final TypeReservationDao typeReservationDao = new TypeReservationDao();

    public ReservationFactory() {
    }

    /** Méthode qui créée une réservation pour un client à partir des informations transmises
     * @param client client
     * @param dateReservationStr date de la réservation
     * @param type type de réservation
     * @param nbPlaces nombre de places
     * @return Reservation
     */
    public static Reservation getInstance(Client client, String dateReservationStr, TypeReservation type, int nbPlaces) {
        // 2) Conversion de la date de réservation en LocalDateTime
        LocalDateTime dateReservation = toDate(dateReservationStr);

        // 5) Création de la réservation
        Reservation reservation = new Reservation(dateReservation);
        reservation.setNbPlaces(nbPlaces);
        reservation.setClient(client);

        // 7) Calcul du montant total de la réservation qui dépend:
        //    - du nombre de places
        //    - de la réduction qui s'applique si le client est premium ou non
//        reservation.setTotal(calculerMontantTotal(client));
        double total = type.getMontant() * nbPlaces;
        if (client.isPremium()) {
            reservation.setTotal(total*(1-type.getReductionPourcent()/100.0));
        }
        else {
            reservation.setTotal(total);
        }
        return reservation;
    }
}
