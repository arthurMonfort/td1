package fr.umontpellier.iut.commande.factory;

import fr.umontpellier.iut.commande.Commande;
import fr.umontpellier.iut.commande.CommandeAjouter;
import fr.umontpellier.iut.commande.CommandeMajuscules;
import fr.umontpellier.iut.commande.CommandeRemplacer;
import fr.umontpellier.iut.document.Document;

public class CommandeFactory {

    private static CommandeFactory instance;

    public static CommandeFactory getInstance() {
        if(instance == null) {
            instance = new CommandeFactory();
        }
        return instance;
    }

    private CommandeFactory() {}

    public Commande createCommand(String name, Document document, String[] parameters) {
        switch (name) {
            case "remplacer" : return new CommandeRemplacer(document, parameters);
            case "ajouter" : return new CommandeAjouter(document, parameters);
            case "majuscules" : return new CommandeMajuscules(document, parameters);
            default: return null;
        }
    }

}
