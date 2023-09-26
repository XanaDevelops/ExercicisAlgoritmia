/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici3;

import exercici3.Figures.*;
import java.util.Random;
import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author danie
 */
class CompareArea implements Comparator<Figura> {

    @Override
    public int compare(Figura f1, Figura f2) {
        if(f1.getArea()<f2.getArea()){
            return -1;
        }else if(f1.getArea()>f2.getArea()){
            return 1;
        }
        return 0;
    }

}

class ComparePerimetre implements Comparator<Figura> {

    @Override
    public int compare(Figura f1, Figura f2) {
        if(f1.getPerimetro()<f2.getPerimetro()){
            return -1;
        }else if(f1.getPerimetro()>f2.getPerimetro()){
            return 1;
        }
        return 0;
    }

}

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
    private static final int N = 10000;
    private static final int CE = 0, TR = 1, QU = 2, RE = 3;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Exercici3();
    }

    public Exercici3() {
        Figura[] figures = new Figura[N];
        Figura[][] figuresTipus = new Figura[4][N];
        int iC, iT, iQ, iR;
        iC = iT = iQ = iR = 0;
        double sumArea = 0, sumPeri = 0;
        double[] sumAreaTipus = new double[4];
        double[] sumPeriTipus = new double[4];
        
        for (int i = 0; i < N; i++) {
            Figura nFigura = this.getRandFigura();
            figures[i] = nFigura;
            sumArea += nFigura.getArea();
            sumPeri += nFigura.getPerimetro();
            
            if (nFigura instanceof Cercle) {                    //esto podia ser un metodo
                figuresTipus[CE][iC++] = nFigura;
                sumAreaTipus[CE] += nFigura.getArea();
                sumPeriTipus[CE] += nFigura.getPerimetro();
            }
            if (nFigura instanceof Triangle) {
                figuresTipus[TR][iT++] = nFigura;
                sumAreaTipus[TR] += nFigura.getArea();
                sumPeriTipus[TR] += nFigura.getPerimetro();
            }
            if (nFigura instanceof Quadrat) {
                figuresTipus[QU][iQ++] = nFigura;
                sumAreaTipus[QU] += nFigura.getArea();
                sumPeriTipus[QU] += nFigura.getPerimetro();
            }
            if (nFigura instanceof Rectangle) {
                figuresTipus[RE][iR++] = nFigura;
                sumAreaTipus[RE] += nFigura.getArea();
                sumPeriTipus[RE] += nFigura.getPerimetro();
            }
        }

        System.out.println("sumaA: " + sumArea + " sumaP: " + sumPeri);
        System.out.println("Suma Cercle Triangle Quadrat Rectangle"); //provisional
        for (int i = 0; i < 4; i++) {
            System.out.println("\t" + sumAreaTipus[i]);
            System.out.println("\t" + sumPeriTipus[i]);
        }

        Arrays.sort(figures, new CompareArea());
        System.out.println("Area:" +figures[0]+" "+figures[N-1]); //implementar toString()
        Arrays.sort(figures, new ComparePerimetre());
        System.out.println("Perimetre:" +figures[0]+" "+figures[N-1]); //implementar toString()
        
        //for con las figuras con lo mismo
        
    }

    private Figura getRandFigura() {
        Figura fig = null;
        Random rand = new Random();
        switch (rand.nextInt(4)) {
            case 0:
                fig = new Cercle(rand.nextDouble());
                break;
            case 1:
                fig = new Triangle(rand.nextDouble());
                break;
            case 2:
                fig = new Quadrat(rand.nextDouble());
                break;
            case 3:
                fig = new Rectangle(rand.nextDouble(), rand.nextDouble());
                break;

        }
        return fig;
    }

    public Figura[] cercadorSelectiu(Figura[] figures, Class tipus) {
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
            if (temp[0].getArea() < figures[i].getArea() && (tipus.isInstance(figures[i]))) {
                temp[0] = figures[i];
            } else if (temp[0].getArea() > figures[i].getArea() && (tipus.isInstance(figures[i]))) {
                temp[2] = figures[i];
            }
            if (temp[1].getPerimetro() < figures[i].getPerimetro() && (tipus.isInstance(figures[i]))) {
                temp[1] = figures[i];
            } else if (temp[0].getPerimetro() > figures[i].getPerimetro() && (tipus.isInstance(figures[i]))) {
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

    public double[] sumaSelectiva(int nFigures, Figura[] temp, Class clase) {
        double[] resultat = new double[2];

        for (int i = 0; i < nFigures; i++) {
            if (clase.isInstance(temp[i])) {
                resultat[0] += temp[i].getPerimetro();
                resultat[1] += temp[i].getArea();
            }
        }

        return resultat;
    }

    public Figura[] creadorDeFigures(int nFigures) {
        Figura[] temp = new Figura[nFigures];
        Random rand = new Random();

        for (int i = 0; i < nFigures; i++) {
            switch (rand.nextInt(4)) {
                case 0:
                    temp[i] = new Cercle(rand.nextDouble());
                    break;
                case 1:
                    temp[i] = new Triangle(rand.nextDouble());
                    break;
                case 2:
                    temp[i] = new Quadrat(rand.nextDouble());
                    break;
                case 3:
                    temp[i] = new Rectangle(rand.nextDouble(), rand.nextDouble());
                    break;

            }
        }

        return temp;
    }

}
