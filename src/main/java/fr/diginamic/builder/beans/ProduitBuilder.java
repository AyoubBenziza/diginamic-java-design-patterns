package fr.diginamic.builder.beans;

public class ProduitBuilder {
    private final Produit produit = new Produit();

    public ProduitBuilder(String nom) {
        produit.setNom(nom);
    }

    public ProduitBuilder addGrade(String grade) {
        produit.setGrade(grade);
        return this;
    }

    public ProduitBuilder addCategorie(String categorie) {
        produit.setCategorie(new Categorie(categorie));
        return this;
    }

    public ProduitBuilder addMarque(String marque) {
        produit.setMarque(new Marque(marque));
        return this;
    }

    public ProduitBuilder addIngredient(String nom, double qteMilligrammes) {
        produit.addIngredient(new Ingredient(nom, qteMilligrammes));
        return this;
    }

    public ProduitBuilder addAllergene(String allergene, double qteMilligrammes) {
        produit.addAllergene(new Allergene(allergene, qteMilligrammes));
        return this;
    }

    public ProduitBuilder addAdditif(String additif, double qteMilligrammes) {
        produit.addAdditif(new Additif(additif, qteMilligrammes));
        return this;
    }

    public Produit build() {
        return produit;
    }
}
