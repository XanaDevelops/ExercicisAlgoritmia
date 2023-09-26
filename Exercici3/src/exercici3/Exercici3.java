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
    /*
    Volem representar diferents 4 tipus de Figura (Cercle,Triangle, Rectangle i Quadrat). Totes les Figures tenen una àrea i un perímetre.

        Heu de generar de manera aleatòria 10000 figures i emmagatzemar-les en una Collection
        Heu de calcular la suma de les àrees i perímetres de totes les figures
        Heu de calcular la suma de les àrees i perímetres de cada tipus de figura
        Heu de calcular l’àrea màxima i mínima de totes les figures i per a cada tipus de figures.
        Heu de poder ordenar les figures per àrees i per perímetre i mostrar les 10 primeres.
        Heu de documentar el codi amb JavaDoc

    Nota: Els resultats s'han de mostrar per la sortida estàndard i heu d'utilitzar el mínim número  de while/for./*
    #esto es una prueba jajajajajajajajajajjajajajajajajajajajajajajajajajajajajajajajajajja
    */
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
