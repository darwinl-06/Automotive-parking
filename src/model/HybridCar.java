package model;

public class HybridCar extends Car {

    private ChargerType chargerType;
    private double batteryLife;
    private double tankCapacity;
    private GasolineType gasolineType;

    public HybridCar(double basePrice, double price, String brand, String model, String cylinder, int mileage,
            String plate, CarType type, int numDoors, boolean isPolarized, ChargerType chargerType, double batteryLife,
            double tankCapacity, GasolineType gasolineType) {

        super(basePrice, price, brand, model, cylinder, mileage, plate, type, numDoors, isPolarized);
        this.chargerType = chargerType;
        this.batteryLife = batteryLife;
        this.tankCapacity = tankCapacity;
        this.gasolineType = gasolineType;
    
    }

    public ChargerType getChargerType() {
        return chargerType;
    }

    public void setChargerType(ChargerType chargerType) {
        this.chargerType = chargerType;
    }

    public double getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(double batteryLife) {
        this.batteryLife = batteryLife;
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
        return ", batteryLife=" + batteryLife + ", chargerType="
                + chargerType + ", gasolineType=" + gasolineType +  ", tankCapacity=" + tankCapacity;
    }

    

    

    
}