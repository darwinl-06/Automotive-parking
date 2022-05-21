package model;

import java.util.ArrayList;

public class Counselor {

    private ArrayList<Vehicle> vehicles;

    public int addVehicle(double basePrice, double price, String brand, String model, double cylinder, double mileage,int optionVehicle, String licensePlate, 
    int numDoors, boolean isPolarized, int optionCar, double tankCapacity, int optionGasoline) {
        
        TypeVehicle vehicleType;
        switch (optionVehicle) {
            case 1:
                vehicleType =  TypeVehicle.NEW;
                break;
            case 2:
                vehicleType =  TypeVehicle.USED;
                break;
            default:
                vehicleType = null;
                break;
        }

        CarType carType;
        switch (optionCar) {
            case 1:
                carType =  CarType.SEDAN;
                break;
            case 2:
                carType =   CarType.PICKUP_TRUCK;
                break;
            default:
                carType = null;
                break;
        }

       GasolineType gasolineType;
        switch (optionGasoline) {
            case 1:
                gasolineType =  GasolineType.EXTRA;
                break;
            case 2:
                gasolineType =  GasolineType.REGULAR;
                break;
            case 3:
                gasolineType =  GasolineType.DIESEL;
                break;
            default:
                gasolineType = null;
                break;
        }

        carType =   CarType.PICKUP_TRUCK;
        gasolineType =  GasolineType.DIESEL;
        vehicleType =  TypeVehicle.USED;

        Vehicle gasolineCar = new GasolineCar(basePrice, price, brand, model,cylinder, mileage, licensePlate, carType, numDoors, isPolarized, tankCapacity, gasolineType, vehicleType);


        vehicles.add(gasolineCar);
       
        return vehicles.indexOf(gasolineCar);
    }
    
    public int addVehicle(double basePrice, double price, String brand, String model, double cylinder, double mileage, int optionVehicle, 
    String licensePlate, int numDoors, boolean isPolarized, int optionCar, int optionCharger, double batteryLife) {
        
        TypeVehicle typeVehicle;
        switch (optionVehicle) {
            case 1:
                typeVehicle =  TypeVehicle.NEW;
                break;
            case 2:
                typeVehicle =  TypeVehicle.USED;
                break;
            default:
                typeVehicle = null;
                break;
        }

        CarType typeCar;
        switch (optionCar) {
            case 1:
                typeCar =  CarType.SEDAN;
                break;
            case 2:
                typeCar =  CarType.PICKUP_TRUCK;
                break;
            default:
                typeCar = null;
                break;
        }

        ChargerType typeCharger;
        switch (optionCharger) {
            case 1:
            typeCharger =  ChargerType.NORMAL;
                break;
            case 2:
            typeCharger =  ChargerType.FAST;
                break;
            default:
                typeCharger = null;
                break;
        }

        typeCharger =  ChargerType.FAST;
        typeCar =  CarType.PICKUP_TRUCK;
        typeVehicle =  TypeVehicle.USED;
        
        Vehicle electricCar = new ElectricCar(basePrice, price, brand, model, cylinder, mileage, licensePlate, typeCar, numDoors, isPolarized, typeCharger, batteryLife, typeVehicle);
        vehicles.add(electricCar);
        
        return vehicles.indexOf(electricCar);
    }

    public int addVehicle(double basePrice, double price, String brand, String model, double cylinder, double mileage, int optionVehicle, String licensePlate, int numDoors, boolean isPolarized, int optionTypeCar, double tankCapacity, double batteryLife, int optionCharger, int optionGasoline){
       
        TypeVehicle vehicleType;
        switch (optionVehicle) {
            case 1:
                vehicleType =  TypeVehicle.NEW;
                break;
            case 2:
                vehicleType =  TypeVehicle.USED;
                break;
            default:
                vehicleType = null;
                break;
        }
        CarType carType;
        switch (optionTypeCar) {
            case 1:
                carType =  CarType.SEDAN;
                break;
            case 2:
                carType =  CarType.PICKUP_TRUCK;
                break;
            default:
                carType = null;
                break;
        }
        ChargerType chargerType;
        switch (optionCharger) {
            case 1:
                chargerType =  ChargerType.NORMAL;
                break;
            case 2:
                chargerType =  ChargerType.FAST;
                break;
            default:
                chargerType = null;
                break;
        }
        GasolineType gasolineType;
        switch (optionGasoline) {
            case 1:
             gasolineType =  GasolineType.EXTRA;
                break;
            case 2:
             gasolineType =  GasolineType.REGULAR;
                break;
            case 3:
             gasolineType =  GasolineType.DIESEL;
                break;
            default:
                gasolineType = null;
                break;
        }

        gasolineType = GasolineType.DIESEL;
        chargerType =  ChargerType.NORMAL;
        carType =  CarType.PICKUP_TRUCK;
        vehicleType =  TypeVehicle.USED;

        Vehicle hybridCar = new HybridCar(basePrice,price, brand, model, cylinder, mileage, licensePlate, carType, numDoors, isPolarized, chargerType, batteryLife, tankCapacity, gasolineType, vehicleType);
        vehicles.add(hybridCar);

        return vehicles.indexOf(hybridCar);
    }
    
    public int addVehicle(double basePrice, double price, String brand, String model, double cylinderCapacity, double mileage, 
    int optionTypeVehicle, String licensePlate, double tankCapacity, int optionTypeMotorcycle) {

        TypeVehicle typeVehicle;
        switch (optionTypeVehicle) {
            case 1:
                typeVehicle =  TypeVehicle.NEW;
                break;
            case 2:
                typeVehicle =  TypeVehicle.USED;
                break;
            default:
                typeVehicle = null;
                break;
        }

        MotorCycleType typeMotorcycle;
        switch (optionTypeMotorcycle) {
            case 1:
                typeMotorcycle = MotorCycleType.STANDARD;
                break;
            case 2:
                typeMotorcycle = MotorCycleType.SPORT;
                break;
            case 3:
                typeMotorcycle = MotorCycleType.SCOOTER;
                    break;
            case 4:
                typeMotorcycle = MotorCycleType.CROSS;
                    break;
            default:
                typeMotorcycle = null;
                break;
        }

        typeMotorcycle = MotorCycleType.CROSS;
        

        Vehicle motorcycle = new MotorCycle(basePrice, price, brand, model, cylinderCapacity, mileage, licensePlate, tankCapacity, typeMotorcycle, typeVehicle );
        vehicles.add(motorcycle);
       
        return vehicles.indexOf(motorcycle);        
    }

    public String calculateSalePrice(int id) {
        String out = "";

        if (id < vehicles.size()) {
            out = "El precio de venta del vehiculo es " + vehicles.get(id).getPrice();
        } else {
           out = "No se encontro el vehiculo que busca"; 
        }
        return out;
    } 

    public void addDocumentSoat(int id, double price, int year, double coverage) {

        Soat soat = new Soat(price, year, coverage);

        vehicles.get(id).addDocument(soat);

          
    }

    public void addDocumentReview(int id, double price, int year, double gasLevels) {

        TechnicalReview technicalReview = new TechnicalReview(price, year,gasLevels );

        vehicles.get(id).addDocument(technicalReview);
        
        
    }

    public void addDocumentCard(int id, double price, int year) {

        PropertyCard propertyCard = new PropertyCard(price, year);

        vehicles.get(id).addDocument(propertyCard);

       
    }


}