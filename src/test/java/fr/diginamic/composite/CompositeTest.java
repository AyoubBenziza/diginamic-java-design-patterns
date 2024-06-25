package fr.diginamic.composite;

import fr.diginamic.composite.entities.Employe;
import fr.diginamic.composite.entities.Service;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CompositeTest {

    private static final double DELTA = 0.0001;

    @Test
    public void OrganisationTest() {
        Service service1 = new Service("DSIN");
        service1.addElement(new Employe("RASPEY", "Cécile", 10000));
        service1.addElement(new Employe("BECHKAR", "Bilel", 8000));

        Service service2 = new Service("Big Data");
        service2.addElement(new Employe("RANMEY", "JB", 7500));
        service2.addElement(new Employe("DOE", "Jane", 3500));

        Service service3 = new Service("Java Dev");
        service3.addElement(new Employe("GUINEAU", "Kevin", 7500));
        service3.addElement(new Employe("MARTIN", "Paul", 3500));

        service1.addElement(service2);
        service1.addElement(service3);

        assertEquals(40000, service1.calculerSalaire(), DELTA);
        assertEquals(11000, service2.calculerSalaire(), DELTA);
        assertEquals(11000, service3.calculerSalaire(), DELTA);
    }
}
