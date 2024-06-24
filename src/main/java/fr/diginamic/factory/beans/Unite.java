package fr.diginamic.factory.beans;

public enum Unite {
    GRAMME("g"), MILLIGRAMME("mg"), MICROGRAMME("µg"), MILLILITRE("ml"), CENTILITRE("cl"), LITRE("l");

    private final String unite;

    Unite(String unite) {
        this.unite = unite;
    }

    public String getUnite() {
        return unite;
    }
}
