/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ElementGenerator;

import backtracking.ElementMotxilla;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import org.apache.commons.lang3.ObjectUtils;
import com.opencsv.exceptions.CsvValidationException;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author danie
 */
public class Generator {

    public static final String csvPath = "Video_Games.csv";
    
    
    public static final String
            allGames  = "games.dat";
    
    
    private FileReader fReader;

    public Generator() throws FileNotFoundException, IOException, CsvValidationException {
        fReader = new FileReader(csvPath);
    }
    
    public void generateAll() throws CsvException, IOException{
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new BufferedOutputStream(new FileOutputStream(allGames))); CSVReader reader = new CSVReader(fReader)) {
            List<String[]> games = reader.readAll();
            for(String[] data:games){
                //System.out.println(Arrays.toString(data));
                if(data[0].compareTo("index")==0){ //skipear cabecera
                    continue;
                }
                VideoGame vg = new VideoGame(data);
                System.out.println(vg);
                oos.writeObject(vg);
            }
        }
    }
    
    
    public ElementMotxilla[] generate(int[] indexes) throws IOException, CsvValidationException{
        ElementMotxilla<VideoGame>[] elems = new ElementMotxilla[indexes.length];
        try (CSVReader reader = new CSVReader(fReader)) {
            int lastIndex=0;
            System.out.println(elems.length);
            for (int i = 0; i < elems.length; i++) {
                reader.skip(indexes[i]-lastIndex);
                lastIndex=indexes[i];
                elems[i] = new VideoGame(reader.peek()).toElementMotxilla();
                System.out.println(i+" "+elems[i].getElement());
            }
        }
        return elems;
    }
    
}
