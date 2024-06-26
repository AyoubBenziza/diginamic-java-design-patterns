package fr.diginamic.builder.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Allergene extends Element{
    @Id
    @GeneratedValue
    private Long id;

    public Allergene() {
    }

    public Allergene(String nom, double qteMilligrammes) {
        super(nom, qteMilligrammes);
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
