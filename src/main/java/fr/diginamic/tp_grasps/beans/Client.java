package fr.diginamic.tp_grasps.beans;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Client {

	@Id
	private String identifiantClient;
	
	@OneToMany(mappedBy = "client")
	private List<Reservation> reservations = new ArrayList<>();
	
	public Client() {
		
	}

	public Client(String identifiantClient) {
		super();
		this.identifiantClient = identifiantClient;
	}

	/** Getter
	 * @return the identifiantClient
	 */
	public String getIdentifiantClient() {
		return identifiantClient;
	}

	/** Setter
	 * @param identifiantClient the identifiantClient to set
	 */
	public void setIdentifiantClient(String identifiantClient) {
		this.identifiantClient = identifiantClient;
	}

	/** Getter
	 * @return the reservations
	 */
	public List<Reservation> getReservations() {
		return reservations;
	}

	/** Setter
	 * @param reservations the reservations to set
	 */
	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}

	public double calculerReduction(double montant, double reductionPourcent) {
		return montant;
	}
}
