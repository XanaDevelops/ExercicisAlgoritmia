/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercici3.Figures;

/**
 *
 * @author trufi
 */
public class Rectangle extends Figura {

    private double b;
    private double h;

    public Rectangle(double b, double h) {
        this.b = b;
        this.h = h;
        cArea();
        cPerimetro();
    }

    @Override
    protected void cArea() {
        this.area = this.b * this.h;

    }

    @Override
    protected void cPerimetro() {
        this.perimetro = 2*(b+h);
    }

}
