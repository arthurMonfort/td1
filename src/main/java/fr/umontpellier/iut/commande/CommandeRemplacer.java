package fr.umontpellier.iut.commande;

import fr.umontpellier.iut.document.Document;

public class CommandeRemplacer extends CommandeDocument{


    public CommandeRemplacer (Document document, String[] parametres) {
        super(document, parametres);
    }
 //fds
    @Override
    public void executer() {
        if(parametres.length < 3) {
            System.err.println("Format attendu :  remplacer;debut;fin;chaine");
            return;
        }
        int debut = Integer.parseInt(parametres[1]);
        int  fin = Integer.parseInt(parametres[2]);
        if(parametres.length==3){
            this.document.remplacer(debut,fin,"");
        }
        else this.document.remplacer(debut,fin,parametres[3]);
        super.executer();
    }
}
