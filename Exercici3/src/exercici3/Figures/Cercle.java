/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercici3.Figures;

/**
 *
 * @author trufi
 */
public class Cercle extends Figura {

    private double radio;

    public Cercle(double radio) {
        this.radio = radio;
        cArea();
        cPerimetro();
    }
    
    @Override
    public void cArea() {
        this.area = Math.pow(this.radio, 2) * Math.PI;

    }

    @Override
    public void cPerimetro() {
        this.perimetro = 2 * radio * Math.PI;
    }

}
