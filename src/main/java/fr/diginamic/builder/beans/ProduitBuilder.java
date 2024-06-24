package fr.diginamic.builder.beans;

import java.util.HashSet;
import java.util.Set;

public class ProduitBuilder {
    private String nom;
    private String grade;
    private Categorie categorie;
    private Marque marque;
    private final Set<Ingredient> ingredients = new HashSet<>();
    private final Set<Allergene> allergenes = new HashSet<>();
    private final Set<Additif> additifs = new HashSet<>();

    public ProduitBuilder addNom(String nom) {
        this.nom = nom;
        return this;
    }

    public ProduitBuilder addGrade(String grade) {
        this.grade = grade;
        return this;
    }

    public ProduitBuilder addCategorie(String categorie) {
        this.categorie = new Categorie(categorie);
        return this;
    }

    public ProduitBuilder addMarque(String marque) {
        this.marque = new Marque(marque);
        return this;
    }

    public ProduitBuilder addIngredient(String nom, double qteMilligrammes) {
        this.ingredients.add(new Ingredient(nom, qteMilligrammes));
        return this;
    }

    public ProduitBuilder addAllergene(String allergene, double qteMilligrammes) {
        this.allergenes.add(new Allergene(allergene,qteMilligrammes));
        return this;
    }

    public ProduitBuilder addAdditif(String additif, double qteMilligrammes) {
        this.additifs.add(new Additif(additif, qteMilligrammes));
        return this;
    }

    public Produit build() {
        return new Produit(nom, grade, categorie, marque, ingredients, allergenes, additifs);
    }
}
