package fr.diginamic.factory;

import fr.diginamic.factory.beans.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class ElementControllerTest {

    private static final double DELTA = 0.0000001;

    @Test
    public void testCreerElement() {
        // Given
        Params params = new Params();
        params.setNom("Sucre");
        params.setValeur(100);
        params.setUnite(Unite.GRAMME);
        params.setType(Type.INGREDIENT);

        // When
        ElementController controller = new ElementController();
        Element element = controller.creerElement(params);

        // Then
        assertEquals("Sucre", element.getNom());
        assertEquals(100, element.getValeur(), DELTA);
        assertEquals(Unite.GRAMME, element.getUnite());
        assertEquals(Ingredient.class, element.getClass());
    }

    @Test
    public void testCreerElement2() {
        // Given
        Params params = new Params();
        params.setNom("E121");
        params.setValeur(10.00001);
        params.setUnite(Unite.MILLIGRAMME);
        params.setType(Type.ADDITIF);

        // When
        ElementController controller = new ElementController();
        Element element = controller.creerElement(params);

        // Then
        assertEquals("E121", element.getNom());
        assertEquals(10.00001, element.getValeur(), DELTA);
        assertEquals(Unite.MILLIGRAMME, element.getUnite());
        assertEquals(Additif.class, element.getClass());
    }

    @Test
    public void testCreerElement3() {
        // Given
        Params params = new Params();
        params.setNom("Allergene01");
        params.setValeur(2.05);
        params.setUnite(Unite.MICROGRAMME);
        params.setType(Type.ADDITIF);

        // When
        ElementController controller = new ElementController();
        Element element = controller.creerElement(params);

        // Then
        assertEquals("Allergene01", element.getNom());
        assertEquals(2.05, element.getValeur(), DELTA);
        assertEquals(Unite.MICROGRAMME, element.getUnite());
        assertEquals(Additif.class, element.getClass());
    }

    @Test
    public void testCreerElementNull() {
        // Given
        Params params = new Params();
        params.setNom("Allergene01");
        params.setValeur(2.05);
        params.setUnite(Unite.MICROGRAMME);
        params.setType(null);

        // When
        ElementController controller = new ElementController();
        Element element = controller.creerElement(params);

        // Then
        assertNull(element);
    }
}
