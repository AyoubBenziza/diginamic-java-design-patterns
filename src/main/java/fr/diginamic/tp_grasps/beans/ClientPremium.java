package fr.diginamic.tp_grasps.beans;

public class ClientPremium extends Client {

        private double tauxReduction;

        public ClientPremium(String identifiant, double tauxReduction) {
            super(identifiant, true);
            this.tauxReduction = tauxReduction;
        }

        public double getTauxReduction() {
            return tauxReduction;
        }

        public void setTauxReduction(double tauxReduction) {
            this.tauxReduction = tauxReduction;
        }

        public double calculerReduction(double montant) {
            return montant * tauxReduction;
        }
}
