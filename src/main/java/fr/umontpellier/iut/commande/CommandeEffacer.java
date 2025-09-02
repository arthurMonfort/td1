package fr.umontpellier.iut.commande;

import fr.umontpellier.iut.document.Document;

public class CommandeEffacer extends CommandeDocument {

    public CommandeEffacer (Document document, String[] parametres) {
        super(document, parametres);
    }
    @Override
    public void executer() {
        if(parametres.length < 3) {
            System.err.println("Format attendu : effacer;debut;fin");
            return;
        }
        int debut = Integer.parseInt(parametres[1]);
        int  fin = Integer.parseInt(parametres[2]);
        this.document.effacer(debut, fin);
        super.executer();
    }
}
