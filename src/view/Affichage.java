package view;

import java.util.Scanner;

import models.Chien;

public class Affichage {
    public static Scanner scanner = new Scanner(System.in);

    public static void affichage(Chien chien) {
        System.out.println("░░░░░░░░░░░░░░░░░░░░");
        System.out.println("░▄▀▄▀▀▀▀▄▀▄░░░░░░░░░");
        System.out.println("░█░░░░░░░░▀▄░░░░░░▄░");
        System.out.println("█░░▀░░▀░░░░░▀▄▄░░█░█");
        System.out.println("█░▄░█▀░▄░░░░░░░▀▀░░█");
        System.out.println("█░░▀▀▀▀░░░░░░░░░░░░█");
        System.out.println("█░░░░░░░░░░░░░░░░░░█");
        System.out.println("█░░░░░░░░░░░░░░░░░░█");
        System.out.println("░█░░▄▄░░▄▄▄▄░░▄▄░░█░");
        System.out.println("░█░▄▀█░▄▀░░█░▄▀█░▄▀░");
        System.out.println("░░▀░░░▀░░░░░▀░░░▀░░░");
        System.out.println("Nom : " + chien.getNom());
        System.out.println("Age : " + chien.getAge() + " ans");
        System.out.println("Nourriture préférer : " + chien.getNourriture());
        affichageNiveau(chien.getNiveau(), chien.getExp(), chien);
    }

    public static void affichageDormir(Chien chien) {
        System.out.println("░░░░░░░░░░░░░░░░░░░░");
        System.out.println("░▄▀▄▀▀▀▀▄▀▄░░░░░░░░░");
        System.out.println("░█░░░░░░░░▀▄░░░░░░▄░");
        System.out.println("█░░▀▀░▀▀░░░░▀▄▄░░█░█");
        System.out.println("█░░░▀▀░░░░░░░░░▀▀░░█");
        System.out.println("█░░▀▀▀▀░░░░░░░░░░░░█");
        System.out.println("█░░░░░░░░░░░░░░░░░░█");
        System.out.println("█░░░░░░░░░░░░░░░░░░█");
        System.out.println("░█░░▄▄░░▄▄▄▄░░▄▄░░█░");
        System.out.println("░█░▄▀█░▄▀░░█░▄▀█░▄▀░");
        System.out.println("░░▀░░░▀░░░░░▀░░░▀░░░");
        System.out.println("Nom : " + chien.getNom());
        System.out.println("Age : " + chien.getAge() + " ans");
        System.out.println("Nourriture préférer : " + chien.getNourriture());
        affichageNiveau(chien.getNiveau(), chien.getExp(), chien);
    }

    public static void affichageNiveau(int niveau, int exp, Chien chien) {
        System.out.print(chien.getNom() + " est niveau " + niveau);
        switch (exp) {
            case 0:
                System.out.println(" [----------]");
                break;
            case 1:
                System.out.println(" [/---------]");
                break;
            case 2:
                System.out.println(" [//--------]");
                break;
            case 3:
                System.out.println(" [///-------]");
                break;
            case 4:
                System.out.println(" [////------]");
                break;
            case 5:
                System.out.println(" [/////-----]");
                break;
            case 6:
                System.out.println(" [//////----]");
                break;
            case 7:
                System.out.println(" [///////---]");
                break;
            case 8:
                System.out.println(" [////////--]");
                break;
            case 9:
                System.out.println(" [/////////-]");
                break;
            case 10:
                System.out.println(" [//////////]");
                break;

            default:
                System.out.println(" [//////////]");
                break;
        }
    }

    public static Chien choix() {
        System.out.println("Veuillez choisir le nom de votre chien : ");
        String nom = scanner.next();
        System.out.println("Veuillez choisir l'âge de votre chien : ");
        int age = scanner.nextInt();
        System.out.println("Veuillez choisir la nourriture de votre chien : ");
        String nourriture = scanner.next();
        System.out.println("Création de votre chien....");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Chien chien = new Chien(nom, age, nourriture);
        return chien;
    }

    public static boolean action(Chien chien, boolean enJeu) {
        System.out.println("Que voulez-vous faire ?");
        System.out.println("1. dormir");
        System.out.println("2. se reveiller");
        System.out.println("3. aboyer");
        System.out.println("4. manger");
        System.out.println("5. acrobatie");
        System.out.println("6. changer de nom");
        System.out.println("7. changer d'âge");
        System.out.println("8. changer de nourriture");
        System.out.println("9. sortir");
        System.out.println("------------------------------------------------");
        int choix = scanner.nextInt();
        int nombre = (int) (Math.random() * (3 - 1 + 1)) + 1;
        switch (choix) {
            case 1:
                chien.dormir();
                break;

            case 2:
                chien.reveiller();
                break;

            case 3:
                chien.aboyer();
                break;

            case 4:
                chien.manger();
                break;

            case 5:
                chien.acrobatie(chien);
                break;

            case 6:
                System.out.println("Quel nom voulez vous donnez ?");
                String nom = scanner.next();
                chien.setNom(nom);
                break;

                case 7:
                    System.out.println("Quel âge voulez vous donner ?");
                    int age = scanner.nextInt();
                    chien.setAge(age);
                    break;

                case 8:
                    System.out.println("Quel nourriture voulez vous donnez ?");
                    String nourriture = scanner.next();
                    chien.setNourriture(nourriture);
                    break;

                case 9:
                    System.out.println("Fermeture du jeu");
                    enJeu = false;
                break;

            default:
                mort();
                break;
        }
        if (chien.getExp() >= 10) {
            chien.setNiveau(1);
            chien.setExp(0);
        }
        if (chien.getDormir()) {
            System.out.println(chien.getNom() + " ne gagnera pas d'exp...");
        } else {
            chien.gainExp(nombre);
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return enJeu;
    }

    public static void doubler(int exp, Chien chien) {
        System.out.println("Vous avez actuellement " + exp + " exp. Voulez vous doubler votre exp ? (2/3 d'échouer)");
        System.out.println("1. oui");
        System.out.println("2. non");
        int nombre = scanner.nextInt();
        switch (nombre) {
            case 1:
                int nombreAleatoire = (int) (Math.random() * (3 - 1 + 1)) + 1;
                if (nombreAleatoire == 1 || nombreAleatoire == 2) {
                    System.out.println("acrobatie échouer...");
                    mort();
                } else {
                    System.out.println("Acrobatie réussi !!");
                    exp = exp * 2;
                    chien.gainExp(exp);
                }
                break;
                

            case 2:
                System.out.println("Très bien !");
                chien.gainExp(exp);
                break;

            default:
                mort();
                break;
        }
    }

    public static void mort() {
        System.out.println("Vous êtes mort...");
        System.exit(0);
    }
}
