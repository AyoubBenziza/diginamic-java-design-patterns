package fr.diginamic.factory;

import fr.diginamic.factory.beans.Element;
import fr.diginamic.factory.beans.ElementFactory;
import fr.diginamic.factory.beans.Type;
import fr.diginamic.factory.beans.Unite;

import org.springframework.web.bind.annotation.RequestBody;

public class ElementController {

    public Element creerElement(@RequestBody Params params) {
        String nom = params.getNom();
        double valeur = params.getValeur();
        Unite unite = params.getUnite();
        Type type = params.getType();

        return ElementFactory.getInstance(type,nom, valeur, unite);
    }
}
