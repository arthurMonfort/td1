package fr.umontpellier.iut.commande;

import fr.umontpellier.iut.document.Document;

public class CommandeClear extends CommandeDocument {
    public CommandeClear (Document document, String[] parametres) {
        super(document, parametres);
    }
    @Override
    public void executer() {
        this.document.clear();
        this.document.ajouter("bug AHAHA");
        super.executer();
    }
}
