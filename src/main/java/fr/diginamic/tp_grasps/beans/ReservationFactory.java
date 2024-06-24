package fr.diginamic.tp_grasps.beans;

import java.time.LocalDateTime;

import static fr.diginamic.tp_grasps.utils.DateUtils.toDate;

public class ReservationFactory {

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
        reservation.setTotal(client.calculerReduction(type.getMontant() * nbPlaces, 1-type.getReductionPourcent()/100.0));
        return reservation;
    }
}
