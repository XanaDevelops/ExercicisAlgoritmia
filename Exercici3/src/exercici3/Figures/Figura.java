/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercici3.Figures;

/**
 *
 * @author daniel
 */
public abstract class Figura {
    protected double area;
    protected double perimetro;
    
    public abstract void cArea();
    public abstract void cPerimetro();

    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }
    
}
