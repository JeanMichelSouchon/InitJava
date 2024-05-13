/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package point;

/**
 *
 * @author JeanM
 */
import java.lang.Math;

class Point {
    private double x;
    private double y;

    public Point(double x, double y) { // Construit l'instance
        this.x = x;// le this permet d'identifier le x de cette class
        this.y = y;// le this permet d'identifier le x de cette class
    }

    public void translate(double dx, double dy) { // Function translater
        this.x += dx; // le dx est déclaré dans le main
        this.y += dy;// le dy est déclaré dans le main
    }

    public double distanceTo(Point other) {// function pour calculer la distance entre deux point
        double dx = this.x - other.x; // le this precise la variable de cette classe et le other utilise une autre variable d'une autre classe
        double dy = this.y - other.y;// le this precise la variable de cette classe et le other utilise une autre variable d'une autre classe
        return Math.sqrt(dx * dx + dy * dy); // racine carré de (x1*x2)+(y1*y2)
    }

    public void display() {//affichage
        System.out.println("(" + this.x + ", " + this.y + ")");
    }
}



