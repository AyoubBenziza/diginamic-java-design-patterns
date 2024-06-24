package fr.diginamic.builder.beans;

public abstract class Element {
    private String nom;

    private double qteMilligrammes;


    public Element() {
    }

    public Element(String nom, double qteMilligrammes) {
        this.nom = nom;
        this.qteMilligrammes = qteMilligrammes;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setQteMilligrammes(double qteMilligrammes) {
        this.qteMilligrammes = qteMilligrammes;
    }

    public double getQteMilligrammes() {
        return qteMilligrammes;
    }
}
