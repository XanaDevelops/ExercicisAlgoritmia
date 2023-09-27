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

        Heu de generar de manera aleatòria 10000 figures i emmagatzemar-les en una Collection       OK
        Heu de calcular la suma de les àrees i perímetres de totes les figures                      OK
        Heu de calcular la suma de les àrees i perímetres de cada tipus de figura                   OK
        Heu de calcular l’àrea màxima i mínima de totes les figures i per a cada tipus de figures.  OK
        Heu de poder ordenar les figures per àrees i per perímetre i mostrar les 10 primeres.       OK

    Nota: Els resultats s'han de mostrar per la sortida estàndard i heu d'utilitzar el mínim número  de while/for./*
     */
    private static final int N = 10000, MAXD = 1000;
    private static final int CE = 0, TR = 1, QU = 2, RE = 3;
    
    private double[] sumAreaTipus = new double[4];
    private double[] sumPeriTipus = new double[4];
    
    private double[] minAreaTipus = new double[4];
    private double[] maxAreaTipus = new double[4];
    private double[] minPeriTipus = new double[4];
    private double[] maxPeriTipus = new double[4];

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Exercici3();
    }

    public Exercici3() {
        Figura[] figures = new Figura[N];

        double sumArea = 0, sumPeri = 0;
        
        Arrays.fill(minAreaTipus, Double.MAX_VALUE);
        Arrays.fill(minPeriTipus, Double.MAX_VALUE);
        Arrays.fill(maxAreaTipus, 0);
        Arrays.fill(maxPeriTipus, 0);

        for (int i = 0; i < N; i++) {
            Figura nFigura = this.getRandFigura();
            figures[i] = nFigura;
            sumArea += nFigura.getArea();
            sumPeri += nFigura.getPerimetro();

            if (nFigura instanceof Cercle) {
                this.calculateMinMaxSum(nFigura, CE);

            }
            if (nFigura instanceof Triangle) {
                this.calculateMinMaxSum(nFigura, TR);
            }
            if (nFigura instanceof Quadrat) {
                this.calculateMinMaxSum(nFigura, QU);
            }
            if (nFigura instanceof Rectangle) {
                this.calculateMinMaxSum(nFigura, RE);
            }
        }

        //impresió de resultats
        
        System.out.println("Suma total arees: " + sumArea);
        System.out.println("Suma total perímetre: " + sumPeri);

        System.out.println();

        System.out.println("Suma àrea per figures:");
        System.out.println("\tCercle               Triangle            Quadrat           Rectangle");
        System.out.println("\t" + Arrays.toString(sumAreaTipus));

        System.out.println("Suma perímetre per figures:");
        System.out.println("\tCercle               Triangle            Quadrat           Rectangle");
        System.out.println("\t" + Arrays.toString(sumPeriTipus));
        
        System.out.println("Àrea mínima per figures:");
        System.out.println("\tCercle               Triangle            Quadrat           Rectangle");
        System.out.println("\t" + Arrays.toString(minAreaTipus));
        
        System.out.println("Perímetre mínim per figures:");
        System.out.println("\tCercle               Triangle            Quadrat           Rectangle");
        System.out.println("\t" + Arrays.toString(minPeriTipus));
        
        System.out.println("Àrea màxima per figures:");
        System.out.println("\tCercle               Triangle            Quadrat           Rectangle");
        System.out.println("\t" + Arrays.toString(maxAreaTipus));
        
        System.out.println("Perímetre màxim per figures:");
        System.out.println("\tCercle               Triangle            Quadrat           Rectangle");
        System.out.println("\t" + Arrays.toString(maxPeriTipus));

        System.out.println();

        Arrays.sort(figures, new ComparadorArea());

        System.out.println("Area Mínima: " + figures[N - 1].getArea());
        System.out.println("Area Maxima: " + figures[0].getArea());
        System.out.println("10 Primeres figures per Àrea:");
        System.out.println(Arrays.toString(Arrays.copyOfRange(figures, 0, 10)).replace(',', '\n'));

        System.out.println();

        Arrays.sort(figures, new ComparadorPerimetro());
        System.out.println("Perímetre Mínim: " + figures[N - 1].getPerimetro());
        System.out.println("Perímetre Màxim: " + figures[0].getPerimetro());
        System.out.println("10 Primeres figures per Perímetre:");
        System.out.println(Arrays.toString(Arrays.copyOfRange(figures, 0, 10)).replace(',', '\n'));

    }

    /**
     * Calcula les sumes, minims y maxims per figura
     * @param fig
     * @param FI 
     */
    private void calculateMinMaxSum(Figura fig, int FI) {
        sumAreaTipus[FI] += fig.getArea();
        sumPeriTipus[FI] += fig.getPerimetro();
        
        if (fig.getArea() > maxAreaTipus[FI]) {
            maxAreaTipus[FI] = fig.getArea();
        }
        if (fig.getArea() < minAreaTipus[FI]) {
            minAreaTipus[FI] = fig.getArea();
        }
        if (fig.getPerimetro() > maxPeriTipus[FI]) {
            maxPeriTipus[FI] = fig.getPerimetro();
        }
        if (fig.getPerimetro() < minPeriTipus[FI]) {
            minPeriTipus[FI] = fig.getPerimetro();
        }
    }

    /**
     * @return Figura Random
     */
    private Figura getRandFigura() {
        Figura fig = null;
        Random rand = new Random();
        switch (rand.nextInt(4)) {
            case 0:
                fig = new Cercle(rand.nextDouble(MAXD));
                break;
            case 1:
                fig = new Triangle(rand.nextDouble(MAXD));
                break;
            case 2:
                fig = new Quadrat(rand.nextDouble(MAXD));
                break;
            case 3:
                fig = new Rectangle(rand.nextDouble(MAXD), rand.nextDouble(MAXD));
                break;

        }
        return fig;
    }
}
