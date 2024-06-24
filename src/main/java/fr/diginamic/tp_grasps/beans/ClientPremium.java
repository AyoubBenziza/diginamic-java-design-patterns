package fr.diginamic.tp_grasps.beans;

public class ClientPremium extends Client {

        public ClientPremium(String identifiant) {
            super(identifiant);
        }

        @Override
        public double calculerReduction(double montant, double tauxReduction) {
            return montant * tauxReduction;
        }
}
