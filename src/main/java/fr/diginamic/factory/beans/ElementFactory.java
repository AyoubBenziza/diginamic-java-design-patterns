package fr.diginamic.factory.beans;

public class ElementFactory {
    public static Element getInstance(Type type,String nom, double valeur, Unite unite) {
        if (type == null){
            return null;
        }
        Element element;
        switch (type) {
            case ALLERGENE:
                element = new Allergene(nom, valeur, unite);
                break;
            case INGREDIENT:
                element = new Ingredient(nom, valeur, unite);
                break;
            case ADDITIF:
                element = new Additif(nom, valeur, unite);
                break;
            default:
                throw new IllegalArgumentException("Type d'élément inconnu");
        }
        return element;
    }
}
