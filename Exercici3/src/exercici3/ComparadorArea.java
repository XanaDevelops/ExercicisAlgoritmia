/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercici3;

import exercici3.Figures.Figura;
import java.util.Comparator;

/**
 *
 * @author trufi
 */
public class ComparadorArea implements Comparator<Figura>{
    @Override
    public int compare(Figura f1, Figura f2) {
        return Double.compare(f1.getArea(), f2.getArea());
    }
    
}
