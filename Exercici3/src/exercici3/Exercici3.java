/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici3;

import exercici3.Figures.*;
import java.util.Random;

/**
 *
 * @author danie
 */
public class Exercici3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Exercici3 ex = new Exercici3();
        Figura[] temp = ex.creadorDeFigures(3);
        for (int i = 0; i < 3; i++) {
            System.out.print(temp[i].getClass().getSimpleName() + ", ");

        }

    }

    public double[] sumaPerimetroIArea(int nFigures,Figura[] temp) {
        double[] resultat = new double[2]; 
       for (int i = 0; i < nFigures; i++) {
            resultat[0]+=temp[i].getPerimetro();
            resultat[1]+=temp[i].getArea();

        }
     
        return resultat;

    }
    public double[] sumaSelectiva(int nFigures,Figura[] temp,String selecion){
       double[] resultat = new double[2]; 
       for (int i = 0; i < nFigures; i++) {
           if(selecion.equals(temp.getClass().getSimpleName())){
            resultat[0]+=temp[i].getPerimetro();
            resultat[1]+=temp[i].getArea();}

        }  

        return resultat;
    }

    public Figura[] creadorDeFigures(int nFigures) {
        Figura[] temp = new Figura[nFigures];
        Random ale = new Random();
        int opcio;
        for (int i = 0; i < nFigures; i++) {
            opcio = ale.nextInt(4);
            switch (opcio) {
                case 0:
                    temp[i] = new Cercle(ale.nextDouble());
                    break;
                case 1:
                    temp[i] = new Triangulo(ale.nextDouble());
                    break;
                case 2:
                    temp[i] = new Quadrat(ale.nextDouble());
                    break;
                case 3:
                    temp[i] = new Rectangulo(ale.nextDouble(), ale.nextDouble());
                    break;

            }
        }

        return temp;
    }

}
