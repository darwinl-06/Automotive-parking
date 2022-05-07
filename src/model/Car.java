package model;

public class Car extends Vehicle {

    private int numDoors;
    private boolean isPolarized;
    private CarType type;

    public Car(double basePrice, double price, String brand, String model, String cylinder, int mileage, String plate, CarType type, int numDoors, boolean isPolarized) {
        
        super(basePrice, price, brand, model, cylinder, mileage, plate);
        this.type = type;
        this.numDoors = numDoors;
        this.isPolarized = isPolarized;
    }

    public CarType getType() {
        return type;
    }

    public void setType(CarType type) {
        this.type = type;
    }

    public int getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    public boolean isPolarized() {
        return isPolarized;
    }
    
    public void setPolarized(boolean isPolarized) {
        this.isPolarized = isPolarized;
    }

    @Override
    public String toString() {
        return "Type=" + type + "polarized=" + isPolarized + ", numDoors=" + numDoors;
    }

    

}