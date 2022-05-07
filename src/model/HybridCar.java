package model;

public class HybridCar extends Car {

    private ChargerType chargerType;
    private double batteryLife;
    private double batteryConsumption;
    private double tankCapacity;
    private GasolineType gasolineType;
    private double oilConsume;

    public HybridCar(double basePrice, double price, String brand, String model, String cylinder, int mileage,
            String plate, CarType type, int numDoors, boolean isPolarized, ChargerType chargerType, double batteryLife,
            double batteryConsumption, double tankCapacity, GasolineType gasolineType, double oilConsume) {

        super(basePrice, price, brand, model, cylinder, mileage, plate, type, numDoors, isPolarized);
        this.chargerType = chargerType;
        this.batteryLife = batteryLife;
        this.batteryConsumption = batteryConsumption;
        this.tankCapacity = tankCapacity;
        this.gasolineType = gasolineType;
        this.oilConsume = oilConsume;
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

    public double getBatteryConsumption() {
        return batteryConsumption;
    }

    public void setBatteryConsumption(double batteryConsumption) {
        this.batteryConsumption = batteryConsumption;
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
        return "batteryConsumption=" + batteryConsumption + ", batteryLife=" + batteryLife + ", chargerType="
                + chargerType + ", gasolineType=" + gasolineType + ", oilConsume=" + oilConsume + ", tankCapacity="
                + tankCapacity;
    }

    

    

    
}