package model;

import java.util.ArrayList;

public class Document {

    private double price;
    private int year;

    private ArrayList<int[][]> image;

    public Document(double price, int year) {

        this.price = price;
        this.year = year;

        image = new ArrayList<int[][]>() ;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "price=" + price + " year=" + year + " image=" + image ;
    }
    
    
    

    
    
}