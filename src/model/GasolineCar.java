package model;

public class GasolineCar extends Car {

    private double tankCapacity;
    private GasolineType gasolineType;
    private double oilConsume;

    public GasolineCar(double basePrice, double price, String brand, String model, String cylinder, int mileage,
            String plate, CarType type, int numDoors, boolean isPolarized, double tankCapacity, GasolineType gasolineType, double oilConsume) {

        super(basePrice, price, brand, model, cylinder, mileage, plate, type, numDoors, isPolarized);
        this.tankCapacity = tankCapacity;
        this.gasolineType = gasolineType;
        this.oilConsume = oilConsume;
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

    public double getOilConsume() {
        return oilConsume;
    }

    public void setOilConsume(double oilConsume) {
        this.oilConsume = oilConsume;
    }

    @Override
    public String toString() {
        return "gasolineType=" + gasolineType + ", oilConsume=" + oilConsume + ", tankCapacity=" + tankCapacity;
    }

    

    

}