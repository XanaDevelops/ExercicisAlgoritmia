/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercici3.Figures;

/**
 *
 * @author trufi
 */
public class Quadrat extends Figura {

    private double costat;

    public Quadrat(double costat) {
        this.costat = costat;
        cArea();
        cPerimetro();

    }

    @Override
    public void cArea() {
        this.area = Math.pow(this.costat, 2);
    }

    @Override
    public void cPerimetro() {
        this.perimetro = 4 * this.costat;
    }

}
