package fr.diginamic.tp_grasps.factories;

import fr.diginamic.tp_grasps.beans.Client;
import fr.diginamic.tp_grasps.beans.Reservation;
import fr.diginamic.tp_grasps.beans.TypeReservation;
import fr.diginamic.tp_grasps.daos.ClientDao;
import fr.diginamic.tp_grasps.daos.TypeReservationDao;

import java.time.LocalDateTime;
import java.util.List;

import static fr.diginamic.tp_grasps.utils.DateUtils.toDate;

public class ReservationFactory {

    private static final ClientDao clientDao = new ClientDao();

    private static final TypeReservationDao typeReservationDao = new TypeReservationDao();

    public ReservationFactory() {
    }

    /** Méthode qui créée une réservation pour un client à partir des informations transmises
     * @param identifiantClient identifiant du client
     * @param dateReservationStr date de la réservation
     * @param typeReservation type de la réservation
     * @param nbPlaces nombre de places
     * @return Reservation
     */
    public static Reservation createReservation(String identifiantClient, String dateReservationStr, String typeReservation, int nbPlaces) {
        // 2) Conversion de la date de réservation en LocalDateTime
        LocalDateTime dateReservation = toDate(dateReservationStr);

        // 3) Extraction de la base de données des informations client
        Client client = clientDao.extraireClient(identifiantClient);

        // 4) Extraction de la base de données des infos concernant le type de la réservation
        TypeReservation type = typeReservationDao.extraireTypeReservation(typeReservation);

        // 5) Création de la réservation
        Reservation reservation = new Reservation(dateReservation);
        reservation.setNbPlaces(nbPlaces);
        reservation.setClient(client);

        // 6) Ajout de la réservation au client
        List<Reservation> reservations = client.getReservations();
        reservations.add(reservation);

        // 7) Calcul du montant total de la réservation qui dépend:
        //    - du nombre de places
        //    - de la réduction qui s'applique si le client est premium ou non
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
