package models;

import view.Affichage;

public class Chien {
    private String nom;
    private int age;
    private String nourriture;
    private boolean dormir = false;
    private int niveau = 1;
    private int exp;

    public Chien(String nom, int age, String nourriture) {
        this.nom = nom;
        this.age = age;
        this.nourriture = nourriture;
    }

    public void dormir() {
        if (dormir) {
            System.out.println(this.nom + " ne peut pas effectuer cette action");
        } else {
            System.out.println(this.nom + " s'endort");
            this.dormir = true;
        }

    }

    public void reveiller() {
        if (dormir) {
            System.out.println(this.nom + " se réveille");
            this.dormir = false;
        } else {
            System.out.println(this.nom + " ne peut pas effectuer cette action");
        }
    }

    public void aboyer() {
        if (dormir) {
            System.out.println(this.nom + " ne peut pas effectuer cette action");
        } else {
            System.out.println(this.nom + " aboie");
        }

    }

    public void manger() {
        if (dormir) {
            System.out.println(this.nom + " ne peut pas effectuer cette action");
        } else {
            System.out.println(this.nom + " mange un/une " + nourriture);
        }

    }

    public void acrobatie(Chien chien) {
        if (dormir) {
            System.out.println(this.nom + " ne peut pas effectuer cette action");
        } else {
            System.out.println(this.nom + " fait une acrobatie (1/2 d'échouer)");
            int nombre = (int) (Math.random() * (2 - 1 + 1)) + 1;
            System.out.println("Tirage des dés...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Résultat : " + nombre);
            if (nombre == 1) {
                System.out.println("acrobatie réussis");
                int nombreAleatoire = (int) (Math.random() * (20 - 10 + 1)) + 10;
                Affichage.doubler(nombreAleatoire, chien);
            } else {
                System.out.println("acrobatie rater...");
                Affichage.mort();
            }
        }

    }

    public String getNom() {
        return this.nom;
    }

    public int getAge() {
        return this.age;
    }

    public String getNourriture() {
        return this.nourriture;
    }

    public boolean getDormir() {
        return this.dormir;
    }

    public int getNiveau() {
        return this.niveau;
    }

    public int getExp() {
        return this.exp;
    }

    public void setNom(String nom) {
        this.nom = nom;
        System.out.println("Le nom " + nom + " a été correctement changer");
    }

    public void setAge(int age) {
        this.age = age;
        System.out.println("L'âge " + age + " a été correctement changer");
    }

    public void setNiveau(int niveau) {
        this.niveau = this.niveau + niveau;
        System.out.println("Le niveau de " + this.nom + " a augmenter de " + niveau + " !!");
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public void setNourriture(String nourriture) {
        this.nourriture = nourriture;
        System.out.println("La nourriture " + nourriture + " a été correctement changer");
    }

    public void gainExp(int exp) {
        System.out.println(this.nom + " a reçu " + exp + " d'exp !!");
        exp = this.exp + exp;
        if (exp > 9 && exp < 20) {
            setNiveau(1);
        } else if (exp >= 20 && exp < 30) {
            setNiveau(2);
        } else if (exp >= 30 && exp < 40) {
            setNiveau(3);
        } else if (exp >= 40 && exp < 50) {
            setNiveau(4);
        }
        this.exp = exp;
    }
}
