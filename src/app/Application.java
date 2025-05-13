package app;

import models.Chien;

public class Application {
    public static void main(String[] args) {
        Chien chien = Affichage.choix();
        System.out.println("------------------------------------------------");
        boolean enJeu = true;
        do {
            if (chien.getDormir()) {
                Affichage.affichageDormir(chien);
            } else {
                Affichage.affichage(chien);
            }
            System.out.println("------------------------------------------------");
            enJeu = Affichage.action(chien, enJeu);
        } while (enJeu);
        System.out.println("Le jeu s'arrête...");

    }
}
