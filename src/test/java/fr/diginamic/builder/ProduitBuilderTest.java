package fr.diginamic.builder;

import fr.diginamic.builder.beans.Produit;
import fr.diginamic.builder.beans.ProduitBuilder;
import org.junit.Assert;
import org.junit.Test;

public class ProduitBuilderTest {

    private static final double DELTA = 0.0000001;

    @Test
    public void test() {
        ProduitBuilder produitBuilder = new ProduitBuilder();
        Produit produit = produitBuilder.
                addNom("nom")
                .addAdditif("additif", 1.0)
                .addCategorie("categorie")
                .addGrade("grade")
                .addIngredient("ingredient", 1.0)
                .addMarque("marque")
                .build();

        Assert.assertEquals("nom", produit.getNom());
        Assert.assertEquals("categorie", produit.getCategorie().getNom());
        Assert.assertEquals("grade", produit.getGrade());
        Assert.assertEquals("marque", produit.getMarque().getNom());
        Assert.assertEquals(1, produit.getIngredients().size());
        Assert.assertEquals("ingredient", produit.getIngredients().iterator().next().getNom());
        Assert.assertEquals(1.0, produit.getIngredients().iterator().next().getQteMilligrammes(), DELTA);
        Assert.assertEquals(1, produit.getAdditifs().size());
        Assert.assertEquals("additif", produit.getAdditifs().iterator().next().getNom());
        Assert.assertEquals(1.0, produit.getAdditifs().iterator().next().getQteMilligrammes(), DELTA);
    }
}
