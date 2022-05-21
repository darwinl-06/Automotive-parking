package model;

public class Vehicle {

    private double basePrice;
    private double price;
    private String brand;
    private String model;
    private double cylinder;
    private double mileage;
    private String plate;
    private TypeVehicle typeVehicle;

    private Document [] documents;
    

    public Vehicle(double basePrice, double price, String brand, String model, double cylinder, double mileage, String plate, TypeVehicle typeVehicle) {

        this.basePrice = basePrice;
        this.price = price;
        this.brand = brand;
        this.model = model;
        this.cylinder = cylinder;
        this.mileage = mileage;
        this.plate = plate;
        this.typeVehicle = typeVehicle;

        documents = new Document[3];
  
    }

    public boolean addDocument(Soat document) {

        documents[0]= document;
        
        return true;
    }

    public boolean addDocument(TechnicalReview document) {
        
        documents[1]= document;
        
        return true;
    }

    public boolean addDocument(PropertyCard document) {
        
        documents[2]= document;
        
        return true;
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

    public double getCylinder() {
        return cylinder;
    }

    public void setCylinder(double cylinder) {
        this.cylinder = cylinder;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public TypeVehicle getTypeVehicle() {
        return typeVehicle;
    }

    public void setTypeVehicle(TypeVehicle typeVehicle) {
        this.typeVehicle = typeVehicle;
    }

    @Override
    public String toString() {
        return "basePrice=" + basePrice + ", brand=" + brand + ", cylinder=" + cylinder + ", documents="
                + documents + ", mileage=" + mileage + ", model=" + model + ", plate=" + plate + ", price=" + price;
    }

    

    

    

   

}