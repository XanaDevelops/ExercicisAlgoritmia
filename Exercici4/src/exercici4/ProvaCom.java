/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercici4;

import java.util.Comparator;

/**
 *
 * @author trufi
 */
public class ProvaCom implements Comparator<Integer>{

    @Override
     public int compare(Integer f1, Integer f2) {
        return -Integer.compare(f1, f2);
    }
    
    
    
}
