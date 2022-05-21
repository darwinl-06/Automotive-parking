package model;

public class GasolineCar extends Car implements GasolineConsumption {

    private double tankCapacity;
    private GasolineType gasolineType;

    public GasolineCar(double basePrice, double price, String brand, int model, double cylinder, double mileage,
            String plate, CarType type, int numDoors, boolean isPolarized, double tankCapacity, GasolineType gasolineType,  TypeVehicle typeVehicle) {

        super(basePrice, price, brand, model, cylinder, mileage, plate, type, numDoors, isPolarized, typeVehicle);
        this.tankCapacity = tankCapacity;
        this.gasolineType = gasolineType;
    }

    public double calculateSalePrice() {
        
        double price= super.getBasePrice();
        if (super.getTypeVehicle() == TypeVehicle.USED) {
            price -= super.getBasePrice()*0.10;
        }
        
        if (super.getSoat() == null ||super.getSoat().getYear() < 2022 ||super.getTechnicalReview() == null ||super.getTechnicalReview().getYear() < 2022 ) {
            price += 500000;            
        }
        return price;
    }

    @Override
    public double gasolineConsumption() {

        double consumption = tankCapacity*(super.getCylinder()/150);

        return consumption;
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
        return super.toString() + "\n , Tipo de combustible = " + gasolineType + "\n , Capacidad del tanque = " + tankCapacity + "\n";
    }

    

    

    

}