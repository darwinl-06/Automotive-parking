package model;

public class ElectricCar extends Car implements BatteryConsumption {

    private ChargerType chargerType;
    private double batteryLife;

    public ElectricCar(double basePrice, double price, String brand, String model, String cylinder, int mileage,
            String plate, CarType type, int numDoors, boolean isPolarized, ChargerType chargerType, double batteryLife) {
        
        super(basePrice, price, brand, model, cylinder, mileage, plate, type, numDoors, isPolarized);
        this.chargerType = chargerType;
        this.batteryLife = batteryLife;
        
    }

    @Override
    public double batteryConsumption() {
     
        return 0;
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

    @Override
    public String toString() {
        return ", batteryLife=" + batteryLife + ", chargerType=" + chargerType;
    }


}