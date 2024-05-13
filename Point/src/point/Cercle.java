/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package point;

/**
 *
 * @author JeanM
 */
class Cercle {
    private double rayon;
    private Point centre;

    public Cercle(double rayon, Point centre) {
        this.rayon = rayon;
        this.centre = centre;
    }

    public double getPerimetre() {
        return 2 * Math.PI * rayon; // 2 * py * r
    }

    public double getSurface() {
        return Math.PI * rayon * rayon; // py*r²
    }
    
    public double getRayon() {
        return rayon; // r
    }

}

