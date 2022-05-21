package model;

public class Vehicle {

    private double basePrice;
    private double price;
    private String brand;
    private int model;
    private double cylinder;
    private double mileage;
    private String plate;
    private TypeVehicle typeVehicle;

    private Document [] documents;
    

    public Vehicle(double basePrice, double price, String brand, int model, double cylinder, double mileage, String plate, TypeVehicle typeVehicle) {

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

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
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

    public Document getSoat() {
        
        return documents[0];
    }

    public Document getPropertCard() {
        
        return documents[2];
    }

    public Document getTechnicalReview() {
        
        return documents[1];
    }

    @Override
    public String toString() {
        return " Precio base = " + basePrice + " , Marca = " + brand + " , Capacidad de cilindraje = " + cylinder + " , Kilometraje = " + mileage + " , Modelo = " + model + " , Placa = " + plate + " , precio de venta = " + price;
    }

    

    

    

   

}