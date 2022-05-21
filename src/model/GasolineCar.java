package model;

public class GasolineCar extends Car implements GasolineConsumption {

    private double tankCapacity;
    private GasolineType gasolineType;

    public GasolineCar(double basePrice, double price, String brand, String model, double cylinder, double mileage,
            String plate, CarType type, int numDoors, boolean isPolarized, double tankCapacity, GasolineType gasolineType,  TypeVehicle typeVehicle) {

        super(basePrice, price, brand, model, cylinder, mileage, plate, type, numDoors, isPolarized, typeVehicle);
        this.tankCapacity = tankCapacity;
        this.gasolineType = gasolineType;
    }

    @Override
    public double gasolineConsumption() {

        return 0;
    }
    
    public double getTankCapacity() {
        return tankCapacity;
    }

    public void setTankCapacity(double tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    public GasolineType getGasolineType() {
        return gasolineType;
    }

    public void setGasolineType(GasolineType gasolineType) {
        this.gasolineType = gasolineType;
    }

    @Override
    public String toString() {
        return "gasolineType=" + gasolineType + ", tankCapacity=" + tankCapacity;
    }

    

    

    

}