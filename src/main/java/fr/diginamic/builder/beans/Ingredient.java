package fr.diginamic.builder.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Ingredient extends Element {
    @Id
    @GeneratedValue
    private Long id;

    public Ingredient() {
    }

    public Ingredient(String nom, double qteMilligrammes) {
        super(nom, qteMilligrammes);
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
