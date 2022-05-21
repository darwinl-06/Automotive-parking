package model;

public class MotorCycle extends Vehicle implements GasolineConsumption {

    private double gasolineCapacity;
    private MotorCycleType type;
    
    public MotorCycle(double basePrice, double price, String brand, int model, double cylinder, double mileage,
            String plate, double gasolineCapacity, MotorCycleType type,  TypeVehicle typeVehicle) {
                
        super(basePrice, price, brand, model, cylinder, mileage, plate, typeVehicle);
        this.gasolineCapacity = gasolineCapacity;
        this.type = type;
    }

    public double calculateSalePrice() {

        double price= super.getBasePrice() * 1.04;
        if (super.getTypeVehicle() == TypeVehicle.USED) {
            price -= super.getBasePrice()*0.02;
        }
        
        if (super.getSoat() == null ||super.getSoat().getYear() < 2022 ||super.getTechnicalReview() == null ||super.getTechnicalReview().getYear() < 2022 ) {
            price += 500000;            
        }
        return price;
    }

    @Override
    public double gasolineConsumption() {

        double consumption = gasolineCapacity*(super.getCylinder()/150);

        return consumption;
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
        return super.toString() + " , Capacidad del tanque = " + gasolineCapacity + " , Tipo de motocicleta = " + type;
    }

    

    

    

    

    

    
}