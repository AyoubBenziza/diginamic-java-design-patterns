package fr.diginamic.composite.entities;

import fr.diginamic.composite.interfaces.IElement;

import java.util.HashSet;
import java.util.Set;

public class Service implements IElement {

    private final String nom;

    private final Set<IElement> elements = new HashSet<>();

    public Service(String nom) {
        this.nom = nom;
    }

    public void addElement(IElement element) {
        elements.add(element);
    }

    @Override
    public double calculerSalaire() {
        double salaireTotal = 0;
        for (IElement element : elements) {
            salaireTotal += element.calculerSalaire();
        }
        return salaireTotal;
    }

    @Override
    public String toString() {
        return "Service{" +
                "nom='" + nom + '\'' +
                ", elements=" + elements +
                ", salaireTotal='" + calculerSalaire() +
                '}';
    }
}
