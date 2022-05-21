package model;

public class ElectricCar extends Car implements BatteryConsumption {

    private ChargerType chargerType;
    private double batteryLife;

    public ElectricCar(double basePrice, double price, String brand, int model, double cylinder, double mileage,
            String plate, CarType type, int numDoors, boolean isPolarized, ChargerType chargerType, double batteryLife, TypeVehicle typeVehicle) {
        
        super(basePrice, price, brand, model, cylinder, mileage, plate, type, numDoors, isPolarized, typeVehicle);
        this.chargerType = chargerType;
        this.batteryLife = batteryLife;
        
    }

    //Method fot calculating the price of sale of the car
    public double calculateSalePrice() {
        
        double price= super.getBasePrice() * 1.20;
        if (super.getTypeVehicle() == TypeVehicle.USED) {
            price -= super.getBasePrice()*0.10;
        }
        
        if (super.getSoat() == null ||super.getSoat().getYear() < 2022 ||super.getTechnicalReview() == null ||super.getTechnicalReview().getYear() < 2022 ) {
            price += 500000;            
        }
        return price;
    }
    
    //Method to calculate battery consumption
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
        return super.toString() + "\n , Duracion de bateria = " + batteryLife + "\n , Tipo de cargador = " + chargerType + "\n, Consumo de bateria = " + batteryConsumption() + "\n";
    }
    


}