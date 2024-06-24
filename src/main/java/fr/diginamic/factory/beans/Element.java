package fr.diginamic.factory.beans;

import javax.lang.model.element.TypeElement;
import javax.persistence.*;

@Entity
public abstract class Element {
    @Id
    @GeneratedValue
    private Long id;

    private String nom;

    private double valeur;

    @Enumerated(EnumType.STRING)
    private Unite unite;

    protected Element() {
    }

    protected Element(String nom, double valeur, Unite unite) {
        super();
        this.nom = nom;
        this.valeur = valeur;
        this.unite = unite;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

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
}
