package model;

public class ElectricCar extends Car {

    private ChargerType chargerType;
    private double batteryLife;
    private double batteryConsumption;

    public ElectricCar(double basePrice, double price, String brand, String model, String cylinder, int mileage,
            String plate, CarType type, int numDoors, boolean isPolarized, ChargerType chargerType, double batteryLife, double batteryConsumption) {
        
        super(basePrice, price, brand, model, cylinder, mileage, plate, type, numDoors, isPolarized);
        this.chargerType = chargerType;
        this.batteryLife = batteryLife;
        this.batteryConsumption = batteryConsumption;
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

    @Override
    public String toString() {
        return "batteryConsumption=" + batteryConsumption + ", batteryLife=" + batteryLife
                + ", chargerType=" + chargerType;
    }

    

    


}