package model;

import java.util.ArrayList;

public class Vehicle {

    private double basePrice;
    private double price;
    private String brand;
    private String model;
    private String cylinder;
    private int mileage;
    private String plate;

    private ArrayList<Documents[]> documents;
    

    public Vehicle(double basePrice, double price, String brand, String model, String cylinder, int mileage, String plate) {

        this.basePrice = basePrice;
        this.price = price;
        this.brand = brand;
        this.model = model;
        this.cylinder = cylinder;
        this.mileage = mileage;
        this.plate = plate;

        documents = new ArrayList<Documents[]> ();
  
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCylinder() {
        return cylinder;
    }

    public void setCylinder(String cylinder) {
        this.cylinder = cylinder;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    @Override
    public String toString() {
        return "basePrice=" + basePrice + ", brand=" + brand + ", cylinder=" + cylinder + ", documents="
                + documents + ", mileage=" + mileage + ", model=" + model + ", plate=" + plate + ", price=" + price;
    }

    

    

    

   

}