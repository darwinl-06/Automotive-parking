package model;

public abstract class Car extends Vehicle {

    private int numDoors;
    private boolean isPolarized;
    private CarType type;

    public Car(double basePrice, double price, String brand, int model, double cylinder, double mileage, String plate, 
    CarType type, int numDoors, boolean isPolarized, TypeVehicle typeVehicle) {
        
        super(basePrice, price, brand, model, cylinder, mileage, plate, typeVehicle);
        this.type = type;
        this.numDoors = numDoors;
        this.isPolarized = isPolarized;
    }

    @Override
    public String toString() {
        return super.toString() + " , Tipo de carro = " + type + " , Polarizado = " + isPolarized + " , Numero de puertas = " + numDoors;
    }

    

}