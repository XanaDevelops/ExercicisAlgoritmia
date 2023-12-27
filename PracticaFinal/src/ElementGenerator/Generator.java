/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ElementGenerator;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author danie
 */
public class Generator {

    public static final String csvPath = "Video_Games.csv";

    private CSVReader reader;

    public Generator() throws FileNotFoundException, IOException, CsvValidationException {
        FileReader fReader = new FileReader(csvPath);
        System.out.println(fReader);
        reader = new CSVReader(fReader);

        String[] nextRecord;
        System.out.println(reader);
        // we are going to read data line by line 
        while ((nextRecord = reader.readNext()) != null) {
            for (String cell : nextRecord) {
                System.out.print(cell + "\t");
            }
            System.out.println();
        }
    }
}
