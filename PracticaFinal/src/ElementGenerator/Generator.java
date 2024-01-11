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
    public static final String allGames  = "games.dat";
    
    public static void generateAll() throws CsvException, IOException{
        FileReader fReader = new FileReader(csvPath);
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
    
    
    public static ElementMotxilla[] generate(int[] indexes) throws IOException, CsvValidationException{
        ArrayList<ElementMotxilla<VideoGame>> elems = new ArrayList<>();
        //ElementMotxilla<VideoGame>[] elems = new ElementMotxilla[indexes.length];
        FileReader fReader = new FileReader(csvPath);
        try (CSVReader reader = new CSVReader(fReader)) {
            int lastIndex=0;
            System.out.println(indexes.length);
            for (int i = 0; i < indexes.length; i++) {
                reader.skip(indexes[i]-lastIndex);
                lastIndex=indexes[i];
                //System.out.println("i "+i);
                //System.out.println(Arrays.toString(reader.peek()));
                try{
                    elems.add(new VideoGame(reader.peek()).toElementMotxilla());
                    System.out.println(elems.get(i).getElement());
                }catch(IllegalArgumentException ex){
                    System.err.println("ERROR: S'ha intentat convertir a ElementMotxilla un VideoJoc no valid (incomplet)\nAquesta entrada serà ignorada "
                            +lastIndex);
                }
            }
        }
        ElementMotxilla<VideoGame>[] ret = new ElementMotxilla[elems.size()];
        elems.toArray(ret);
        return ret;
    }
    
}
