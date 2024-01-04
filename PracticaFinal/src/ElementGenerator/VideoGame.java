/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ElementGenerator;

import backtracking.ElementMotxilla;
import java.io.Serializable;

/**
 *
 * @author danie
 */
public class VideoGame implements Serializable {

    //index,Name,Platform,Year_of_Release,Genre,Publisher,NA_Sales,EU_Sales,
    //JP_Sales,Other_Sales,Global_Sales,Critic_Score,Critic_Count,User_Score
    //User_Count,Developer,Rating
    private final int index, yearRelease, critScore, critCount, userScore, userCount;
    private final double salesNA, salesEU, salesJP, salesOT, salesGlobal;
    private final String name, platform, genre, publisher, dev, rating;

    public VideoGame(String[] args) {
        this.index = parseInt(args[0]);
        this.name = args[1];
        this.platform = args[2];
        this.yearRelease = parseInt(args[3]);
        this.genre = args[4];
        this.publisher = args[5];
        this.salesNA = parseDouble(args[6]);
        this.salesEU = parseDouble(args[7]);
        this.salesJP = parseDouble(args[8]);
        this.salesOT = parseDouble(args[9]);
        this.salesGlobal = parseDouble(args[10]);
        this.critScore = parseInt(args[11]);
        this.critCount = parseInt(args[12]);
        this.userScore = parseInt(args[13]);
        this.userCount = parseInt(args[14]);
        this.dev = args[15];
        this.rating = args[16];
    }

    public VideoGame(int index, String name, String platform, int yearRelease, String genre, 
            String publisher, double salesNA, double salesEU, double salesJP, double salesOT,
            double salesGlobal, int critScore, int critCount, int userScore, int userCount,
            String dev, String rating) {
        this.index = index;
        this.name = name;
        this.platform = platform;
        this.yearRelease = yearRelease;
        this.genre = genre;
        this.publisher = publisher;
        this.salesNA = salesNA;
        this.salesEU = salesEU;
        this.salesJP = salesJP;
        this.salesOT = salesOT;
        this.salesGlobal = salesGlobal;
        this.critScore = critScore;
        this.critCount = critCount;
        this.userScore = userScore;
        this.userCount = userCount;
        this.dev = dev;
        this.rating = rating;
    }

    private int parseInt(String i) {
        int aux = -1;
        try {
            aux = (int) Double.parseDouble(i);
        } catch (NumberFormatException ex) {
            aux = -1;
        }
        return aux;
    }

    private double parseDouble(String d) {
        double aux = -1;
        try {
            aux = Double.parseDouble(d);
        } catch (NumberFormatException ex) {
            aux = -1;
        }
        return aux;
    }
    
    public ElementMotxilla<VideoGame> toElementMotxilla(){
        return new ElementMotxilla<VideoGame>(this, this.critScore, this.userScore, this.salesGlobal);
    }

    public int getIndex() {
        return index;
    }

    public int getYearRelease() {
        return yearRelease;
    }

    public int getCritScore() {
        return critScore;
    }

    public int getCritCount() {
        return critCount;
    }

    public int getUserScore() {
        return userScore;
    }

    public int getUserCount() {
        return userCount;
    }

    public double getSalesNA() {
        return salesNA;
    }

    public double getSalesEU() {
        return salesEU;
    }

    public double getSalesJP() {
        return salesJP;
    }

    public double getSalesOT() {
        return salesOT;
    }

    public double getSalesGlobal() {
        return salesGlobal;
    }

    public String getName() {
        return name;
    }

    public String getPlatform() {
        return platform;
    }

    public String getGenre() {
        return genre;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getDev() {
        return dev;
    }

    public String getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "VideoGame{"+ "name= "+name+", critScore= "+critScore+", userScore= "+userScore+", globalSales= "+salesGlobal+ '}';
    }

}
