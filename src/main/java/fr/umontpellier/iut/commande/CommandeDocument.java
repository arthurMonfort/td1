package fr.umontpellier.iut.commande;

import fr.umontpellier.iut.document.Document;

public abstract class CommandeDocument implements Commande {

    protected Document document;

    protected String[] parametres;

    public CommandeDocument(Document document, String[] parametres) {
        this.document = document;
        this.parametres = parametres;
    }

    @Override
    public void executer() {
        System.out.println(this.document);
    }
}
