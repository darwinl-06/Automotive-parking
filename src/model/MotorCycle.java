package model;

public class MotorCycle extends Vehicle {

    private double gasolineCapacity;
    private double gasolineConsumption;
    private MotorCycleType type;
    public MotorCycle(double basePrice, double price, String brand, String model, String cylinder, int mileage,
            String plate, double gasolineCapacity, double gasolineConsumption, MotorCycleType type) {
                
        super(basePrice, price, brand, model, cylinder, mileage, plate);
        this.gasolineCapacity = gasolineCapacity;
        this.gasolineConsumption = gasolineConsumption;
        this.type = type;
    }
    
    public double getGasolineCapacity() {
        return gasolineCapacity;
    }
    public void setGasolineCapacity(double gasolineCapacity) {
        this.gasolineCapacity = gasolineCapacity;
    }
    public double getGasolineConsumption() {
        return gasolineConsumption;
    }
    public void setGasolineConsumption(double gasolineConsumption) {
        this.gasolineConsumption = gasolineConsumption;
    }
    public MotorCycleType getType() {
        return type;
    }
    public void setType(MotorCycleType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "gasolineCapacity=" + gasolineCapacity + ", gasolineConsumption=" + gasolineConsumption
                + ", type=" + type;
    }

    

    

    

    

    
}