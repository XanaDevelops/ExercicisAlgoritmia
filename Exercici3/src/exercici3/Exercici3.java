/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici3;

import exercici3.Figures.*;
import java.util.Random;
import java.util.Arrays;

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
       

    }

    public Figura[] cercadorSelectiu(Figura[] figures, String tipus) {
        int x = 0;
        Figura[] temp = new Figura[4];
        while (!(figures[x].getClass().equals(tipus))) {
            temp[0] = figures[x];
            temp[1] = figures[x];
            temp[2] = figures[x];
            temp[3] = figures[x];
            x++;
        }
        for (int i = 1; i < figures.length; i++) {
            if (temp[0].getArea() < figures[i].getArea() && (figures[i].getClass().getSimpleName().equals(tipus))) {
                temp[0] = figures[i];
            } else if (temp[0].getArea() > figures[i].getArea() && (figures[i].getClass().getSimpleName().equals(tipus))) {
                temp[2] = figures[i];
            }
            if (temp[1].getPerimetro() < figures[i].getPerimetro() && (figures[i].getClass().getSimpleName().equals(tipus))) {
                temp[1] = figures[i];
            } else if (temp[0].getPerimetro() > figures[i].getPerimetro() && (figures[i].getClass().getSimpleName().equals(tipus))) {
                temp[3] = figures[i];
            }

        }
        return temp;
    }

    public Figura[] cercador(Figura[] figures) {
        Figura temp[] = new Figura[4];
        temp[0] = figures[0];
        temp[1] = figures[0];
        temp[2] = figures[0];
        temp[3] = figures[0];
        for (int i = 1; i < figures.length; i++) {
            if (temp[0].getArea() < figures[i].getArea()) {
                temp[0] = figures[i];
            } else {
                temp[2] = figures[i];
            }
            if (temp[1].getPerimetro() < figures[i].getPerimetro()) {
                temp[1] = figures[i];

            } else {
                temp[3] = figures[i];
            }

        }
        return temp;
    }

    public double[] sumaPerimetroIArea(int nFigures, Figura[] temp) {
        double[] resultat = new double[2];
        for (int i = 0; i < nFigures; i++) {
            resultat[0] += temp[i].getPerimetro();
            resultat[1] += temp[i].getArea();

        }

        return resultat;

    }

    public double[] sumaSelectiva(int nFigures, Figura[] temp, String selecion) {
        double[] resultat = new double[2];
        for (int i = 0; i < nFigures; i++) {
            if (selecion.equals(temp.getClass().getSimpleName())) {
                resultat[0] += temp[i].getPerimetro();
                resultat[1] += temp[i].getArea();
            }

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
