package com.mycompany.tp1;
public class TP1 {

    public static void main(String[] args) {
        
        //Calcul de moyenne EX 3
        int Note1 = 20;
        int Note2 = 10;
        int Note3 = 2;
        int moyenne = (Note1 + Note2 + Note3)/3;
        
        //Conversion Température EX 4
        int Celcus = 25; 
        int Fahreinheit = (Celcus * 9/5)+32;
        
        //Concaténation EX 5
        String prenom = "Jean Michel";
        String nom = " Souchon";
        //TVA EX 6
        Double Prixhc = 249.35;
        Double TVA = Prixhc * 0.2;
        Double Prixttc = Prixhc + TVA;
        
        //Echange de valeur EX 7
        int a = 5;
        int b = 10;
        int temp = a;
        a = b;
        b = temp;
        
        //Remise EX 8
        Double PrixInit = 50.00;
        Double Remise = PrixInit * 0.5;
        Double PrixRemise = PrixInit - Remise;
        
        
        //AFFICHAGE EXERCICE 1 & 2
        System.out.println("Exercice 1 & 2 Hello World! \n");
        System.out.println("Bonjour java!");
        System.out.println("Bienvenue au cours de programmation!\n");
        
        
        //AFFICHAGE EXERCICE 5
        System.out.println("Exercice 5 Concaténation de chaînes de caractères\n");
        System.out.println(prenom + nom);
        
        
        //AFFICHAGE EXERCICE 3
        System.out.println("\nExercice 3 Calcul de la moyenne\n");
        System.out.println("Moyenne de:" + moyenne + "/20\n");
        
        
        //AFFICHAGE EXERCICE 4
        System.out.println("Exercice 4 Conversion de température\n");
        System.out.println(Celcus + "°C");
        System.out.println("En");
        System.out.println(Fahreinheit + "°F\n");
        
        
        //AFFICHAGE EXERCICE 6
        System.out.println("Exercice 6 Calcul de TVA\n");
        System.out.println("Prix HC = " + Prixhc + "€");
        System.out.println("Prix TTC = " + Prixttc + "€\n");
        
        
        //AFFICHAGE EXERCICE 7
        System.out.println("Exercice 7 Échange de valeurs\n");
        System.out.println("Valeurs de base :");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("\nValeurs après l'échange :");
        System.out.println("a = " + a);
        System.out.println("b = " + b + "\n");
        
        
        //AFFICHAGE EXERCICE 8
        System.out.println("Exercice 8 Calcul de remise\n");
        System.out.println("Prix Sans Remise :" + PrixInit + "€");
        System.out.println("Prix Avec Remise de 50% :" + PrixRemise + "€");
    }
}
