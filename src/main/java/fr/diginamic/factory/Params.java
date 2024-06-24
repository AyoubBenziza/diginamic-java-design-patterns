package fr.diginamic.factory;

import fr.diginamic.factory.beans.Type;
import fr.diginamic.factory.beans.Unite;

public class Params {
    private String nom;

    private double valeur;

    private Unite unite;

    private Type type;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getValeur() {
        return valeur;
    }

    public void setValeur(double valeur) {
        this.valeur = valeur;
    }

    public Unite getUnite() {
        return unite;
    }

    public void setUnite(Unite unite) {
        this.unite = unite;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
