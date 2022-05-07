package model;

public class MotorCycle extends Vehicle implements GasolineConsumption {

    private double gasolineCapacity;
    private MotorCycleType type;
    
    public MotorCycle(double basePrice, double price, String brand, String model, String cylinder, int mileage,
            String plate, double gasolineCapacity, MotorCycleType type) {
                
        super(basePrice, price, brand, model, cylinder, mileage, plate);
        this.gasolineCapacity = gasolineCapacity;
        this.type = type;
    }

    @Override
    public double gasolineConsumption() {
        
        return 0;
    }

    public double getGasolineCapacity() {
        return gasolineCapacity;
    }

    public void setGasolineCapacity(double gasolineCapacity) {
        this.gasolineCapacity = gasolineCapacity;
    }
    
    public MotorCycleType getType() {
        return type;
    }

    public void setType(MotorCycleType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "gasolineCapacity=" + gasolineCapacity + ", type=" + type;
    }

    

    

    

    

    

    
}