/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package scanneur;

/**
 *
 * @author JeanM
 */
import java.util.Scanner;

public class LectureUtilisateur {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);// Objet qui permet de faire l'input
        
        
        System.out.print("Entrez votre nom : ");// Demande à l'utilisateur son nom
        String nom = scanner.nextLine(); // Lire le nom entré par l'utilisateur
        
        
        System.out.print("Entrez votre âge : ");// Demande à l'utilisateur son âge
        int age = scanner.nextInt(); // Lire l'âge entré par l'utilisateur
        
        
        System.out.println("Bonjour " + nom + " ! Tu as " + age + " ans.");// Affichage du message avec le nom et l'âge de l'utilisateur
        
        // Fermeture du scanner pour libérer les ressources
        scanner.close();
    }
}

