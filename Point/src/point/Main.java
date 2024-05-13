/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package point;

/**
 *
 * @author JeanM
 */

public class Main {

    
    public static void main(String[] args) {
        
        Point pointTriA = new Point(3, 5);
        Point pointTriB = new Point(7, 2);
        Point pointTriC = new Point(10, 8);
        
        Point pointPolA = new Point(10, 8);
        Point pointPolB = new Point(3, 5);
        Point pointPolC = new Point(7, 2);
        Point pointPolD = new Point(9, 3);
        Point pointPolE = new Point(13, 6);

        
        Point pointA = new Point(3, 5);// création du Point A

        System.out.println("Point A:");//affiche le point A 
        pointA.display();//affiche le point A 

        pointA.translate(4, -3); // utilise la fonction de translatation avec le vecteur

        System.out.println("Point A après translation:");//affiche le point A au nouvelle coordonnée
        pointA.display();//affiche le point A au nouvelle coordonnée

        Point pointB = new Point(3, 5);
        
        System.out.println("Point B:");// création du Point B
        pointB.display();// création du Point A
        

        double distanceAB = pointA.distanceTo(pointB);// Déclaration de la var Distance AB + utilisation de la fonction distance to de A à B

        System.out.println("Distance entre les points A et B : " + distanceAB); // affiche la Distance
        
        
        // figure :
        Triangle triangleABC = new Triangle(pointTriA, pointTriB, pointTriC); // définition des sommet du triangle
        Polygone polygone = new Polygone(new Point[]{pointPolA, pointPolB, pointPolC, pointPolD, pointPolE}); // définition des sommets du polugone
        Cercle cercle = new Cercle(5, new Point(0, 0)); // définition du rayon ainsi que la position du centre

        System.out.println("\nTriangle ABC:");
        System.out.println("Perimetre: " + triangleABC.getPerimetre());
        System.out.println("Surface: " + triangleABC.getSurface());

        System.out.println("\nPolygone:");
        System.out.println("Perimetre: " + polygone.getPerimetre());
        System.out.println("Nombre de sommets: " + polygone.getNombreDeSommets());

        System.out.println("\nCercle:");
        System.out.println("Perimetre: " + cercle.getPerimetre());
        System.out.println("Surface: " + cercle.getSurface());
        System.out.println("Rayon: "+ cercle.getRayon());
    }
}
