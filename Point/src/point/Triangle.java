/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package point;

/**
 *
 * @author JeanM
 */

class Triangle {
    private Point sommet1;
    private Point sommet2;
    private Point sommet3;

    public Triangle(Point sommet1, Point sommet2, Point sommet3) {
        this.sommet1 = sommet1; // A
        this.sommet2 = sommet2; // B
        this.sommet3 = sommet3; // C
    }
    
    public double getPerimetre() {
        double distance1 = sommet1.distanceTo(sommet2); // AB
        double distance2 = sommet2.distanceTo(sommet3); // BC
        double distance3 = sommet3.distanceTo(sommet1); // AC
        return distance1 + distance2 + distance3; // P = AB + BC + AC
    }

    public double getSurface() {
        // Utiliser la formule de Héron pour calculer la surface
        double demiPerimetre = getPerimetre() / 2; // Dp
        double distance1 = sommet1.distanceTo(sommet2);// A
        double distance2 = sommet2.distanceTo(sommet3);// B
        double distance3 = sommet3.distanceTo(sommet1);// C
        return Math.sqrt(demiPerimetre * (demiPerimetre - distance1) * (demiPerimetre - distance2) * (demiPerimetre - distance3));//S = √Dp ( Dp − A ) ( Dp − B ) ( Dp − C )
    }

    
}

