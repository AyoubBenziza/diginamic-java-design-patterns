package fr.diginamic.builder.beans;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Produit {
    @Id
    @GeneratedValue
    private Long id;

    private String nom;

    private String grade;

    @ManyToOne
    private Categorie categorie;

    @ManyToOne
    private Marque marque;

    @ManyToMany
    @JoinTable(name = "produit_ingredient",
            joinColumns = @JoinColumn(name = "produit_id"),
            inverseJoinColumns = @JoinColumn(name = "ingredient_id"))
    private Set<Ingredient> ingredients;

    @ManyToMany
    @JoinTable(name = "produit_allergene",
            joinColumns = @JoinColumn(name = "produit_id"),
            inverseJoinColumns = @JoinColumn(name = "allergene_id"))
    private Set<Allergene> allergenes;

    @ManyToMany
    @JoinTable(name = "produit_additif",
            joinColumns = @JoinColumn(name = "produit_id"),
            inverseJoinColumns = @JoinColumn(name = "additif_id"))
    private Set<Additif> additifs;

    public Produit() {
    }

    public Produit(String nom, String grade, Categorie categorie, Marque marque, Set<Ingredient> ingredients, Set<Allergene> allergenes, Set<Additif> additifs) {
        this.nom = nom;
        this.grade = grade;
        this.categorie = categorie;
        this.marque = marque;
        this.ingredients = ingredients;
        this.allergenes = allergenes;
        this.additifs = additifs;
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

    public String getGrade() {
        return grade;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public Marque getMarque() {
        return marque;
    }

    public Set<Ingredient> getIngredients() {
        return ingredients;
    }

    public Set<Allergene> getAllergenes() {
        return allergenes;
    }

    public Set<Additif> getAdditifs() {
        return additifs;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public void setMarque(Marque marque) {
        this.marque = marque;
    }

    public void setIngredients(Set<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public void setAllergenes(Set<Allergene> allergenes) {
        this.allergenes = allergenes;
    }

    public void setAdditifs(Set<Additif> additifs) {
        this.additifs = additifs;
    }
}
