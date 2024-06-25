package fr.diginamic.composite.entities;

import fr.diginamic.composite.interfaces.IElement;

public class Employe implements IElement {

        private final String nom;
        private final String prenom;
        private final double salaire;

        public Employe(String nom, String prenom, double salaire) {
            this.nom = nom;
            this.prenom = prenom;
            this.salaire = salaire;
        }

        @Override
        public double calculerSalaire() {
            return salaire;
        }

        @Override
        public String toString() {
            return "Employe{" +
                    "nom='" + nom + '\'' +
                    ", prenom='" + prenom + '\'' +
                    ", salaire=" + salaire +
                    '}';
        }
}
