package model;

public class HybridCar extends Car implements GasolineConsumption, BatteryConsumption  {

    private ChargerType chargerType;
    private double batteryLife;
    private double tankCapacity;
    private GasolineType gasolineType;

    public HybridCar(double basePrice, double price, String brand, int model, double cylinder, double mileage,
            String plate, CarType type, int numDoors, boolean isPolarized, ChargerType chargerType, double batteryLife,
            double tankCapacity, GasolineType gasolineType,  TypeVehicle typeVehicle) {

        super(basePrice, price, brand, model, cylinder, mileage, plate, type, numDoors, isPolarized, typeVehicle);
        this.chargerType = chargerType;
        this.batteryLife = batteryLife;
        this.tankCapacity = tankCapacity;
        this.gasolineType = gasolineType;
    
    }

    public double calculateSalePrice() {

        double price= super.getBasePrice() * 1.15;
        if (super.getTypeVehicle() == TypeVehicle.USED) {
            price -= super.getBasePrice()*0.10;
        }
        
        if (super.getSoat() == null ||super.getSoat().getYear() < 2022 ||super.getTechnicalReview() == null ||super.getTechnicalReview().getYear() < 2022 ) {
            price += 500000;            
        }
        return price;
    }

    @Override
    public double batteryConsumption() {

        double batteryConsumption = 0;

        if (chargerType== ChargerType.NORMAL) {
             batteryConsumption = (batteryLife+7) * (super.getCylinder()/200);
        } else if (chargerType == ChargerType.FAST) {
            batteryConsumption = batteryLife * (super.getCylinder()/200); 
        }
        return batteryConsumption;
    }


     @Override
    public double gasolineConsumption() {

        double consumption = tankCapacity *(super.getCylinder()/180);

        return consumption;

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
        return super.toString() + "\n , Duracion de bateria = " + batteryLife + "\n , Tipo de cargador = "
                + chargerType + "\n , Tipo de combustible = " + gasolineType +  "\n , Capacidad del tanque = " + tankCapacity + "\n";
    }

    

    

    
}