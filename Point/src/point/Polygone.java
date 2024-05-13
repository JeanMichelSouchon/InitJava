/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package point;

/**
 *
 * @author JeanM
 */
class Polygone {
    private Point[] sommets;

    public Polygone(Point[] sommets) { // le nombre de sommet n'est pas fixe , on peut ajouter autant de sommets voulu
        this.sommets = sommets;
    }

    public double getPerimetre() {
        double perimetre = 0;
        for (int i = 0; i < sommets.length - 1; i++) { // tant que i est < du nombre de sommet , on boucle 
            perimetre += sommets[i].distanceTo(sommets[i + 1]); // additionne la distance de chaque point existant
        }
        perimetre += sommets[sommets.length - 1].distanceTo(sommets[0]);// permet de faire le retour au point de départ ( première coordonnée donnée)
        return perimetre; // retourne le résultat
    }

    public int getNombreDeSommets() {
        return sommets.length; // retourne le nombre de sommets
    }

}

