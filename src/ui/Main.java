package ui;

import java.util.Scanner;
import model.Counselor;


public class Main {
	
	private Scanner sc;
	private Counselor cs;
	
	
	public Main() {

		sc= new Scanner(System.in);
		cs= new Counselor();
	}

	public static void main(String [] args) {
		
		System.out.println("Iniciando la aplicación");
		
		Main ppal= new Main();
		
		int option=0;
		
		do{
			option= ppal.showMenu();
			ppal.executeOperation(option);
			
		}while (option!=0);
		
	}
	
	public int showMenu() {
		int option=0;

		System.out.println(
				"Seleccione una opción para empezar\n" +
				"(1) Para registrar un vehiculo\n" +
				"(2) Para calcular el precio de venta de un vehiculo\n"+
				"(3) Para generar informe con todos los datos de los vehiculos  \n"+
				"(4) Para buscar los documentos de un vehiculo\n" +  
                "(5) Para generar el mapa del parqueadero\n" +  
                "(6) Para generar un informe de la ocupacion del parqueadero\n" +  
				"(0) Para salir"
				);
		option= sc.nextInt();
		sc.nextLine();
		return option;
	}
	
	public void executeOperation(int operation) {
		
		switch(operation) {
		case 0:
			System.out.println("Gracias por usar el sistema!");
			break;
		case 1:
			registerVehicle();
			break;
		case 2:
			calculatePrice();
			break;
		case 3:
			showReports();
			break;
		case 4:
			showDocuments();
			break;

        case 5:
			showParking();
			break;
        case 6:
			showReportsParking();
			break;
		
		default:
			System.out.println("Opción no válida");
		
		}
	}

	public void registerVehicle() {

        System.out.println("Ingrese el precio base del vehiculo ");
        double basePrice = sc.nextDouble();

		System.out.println("Ingrese el precio de venta del vehiculo ");
        double price = sc.nextDouble();

        System.out.println("Ingrese la marca del vehiculo ");
        String brand = sc.next();

        System.out.println("ingrese el modelo del vehiculo ");
        int model = sc.nextInt();

        System.out.println("Ingrese la capacidad del cilindro ");
        double cylinder = sc.nextDouble();
    
        System.out.println("Ingrese el kilometraje del vehiculo ");
        double mileage = sc.nextDouble();
   
        System.out.println("Ingrese el tipo de vehiculo 1. Nuevo 2. Usado ");
        int optionVehicle = sc.nextInt();

		String licensePlate = " ";

        if (optionVehicle == 2) {

            System.out.println("Ingrese la placa del vehiculo ");
            licensePlate = sc.next();
			
        }

		System.out.println("Que vehiculo desea registrar? 1. Carro a gasolina 2. Carro electrico  3. Carro hibrido 4. Motocicleta");
        int option = sc.nextInt();

		if(option ==4) {
 
			System.out.println("Ingrese la capacidad del tanque");
			double tankCapacity = sc.nextDouble();

			System.out.println("Ingrese el tipo de motocicleta 1) Standard 2) Sport 3) Scooter 4) Cross");
			int optionMotorcycle = sc.nextInt();
				
			int id = cs.addVehicle(basePrice, price, brand,model, cylinder, mileage, optionVehicle, licensePlate, tankCapacity, optionMotorcycle);

			if (optionVehicle == 2) { 

				regisSoat(id);
				regisReview(id);
				regisCard(id);

			} else if (optionVehicle == 1) {

				cs.addDocumentSoat(id,0,2022,0);
				cs.addDocumentReview(id, 0, 2022, 0);
				cs.addDocumentCard(id, 0, 2022);
				

			}
		} else if (option == 1 || option == 2 || option == 3 ) {
  
            System.out.println("Ingrese el numero de puertas del vehiculo ");
            int numDoors = sc.nextInt();
     
            System.out.println("Ingrese el tipo de ventanas que tiene el vehiculo 1. Polarizado 2. No polarizado");
            int optionWindows = sc.nextInt();
        
            boolean isPolarized;

            if (optionWindows == 1) {
                isPolarized = true;
            } else {
                isPolarized = false;
            }

            System.out.println("Ingrese el tipo de vehiculo 1. Sedan 2. Camioneta");
            int optionCar = sc.nextInt();

			if(option == 1) {

				System.out.println("Ingrese la capacidad del tanque ");
                double tankCapacity = sc.nextDouble();
            
                System.out.println("Ingrese el tipo de gasolina del vehiculo 1. Extra 2. Regular 3. Diesel");
                int optionGasoline = sc.nextInt();

				int id = cs.addVehicle(basePrice, price, brand, model, cylinder, mileage, optionVehicle, licensePlate, numDoors, isPolarized, optionCar, tankCapacity, optionGasoline);
                
				if (optionVehicle == 2) { 

					regisSoat(id);
					regisReview(id);
					regisCard(id);

				} else if (optionVehicle == 1) {

					cs.addDocumentSoat(id,0,2022,0);
					cs.addDocumentReview(id, 0, 2022, 0);
					cs.addDocumentCard(id, 0, 2022);

				}

            } else if(option == 2 || option == 3) {
			
				System.out.println("Ingrese la duracion de la bateria ");
                double batteryLife = sc.nextDouble();

                System.out.println("Ingrese el tipo de cargador que tiene el vehiculo 1. Normal 2. Rapido ");
                int optionCharger = sc.nextInt();
                
                if (option == 2) {

					int id = cs.addVehicle( basePrice, price, brand, model, cylinder, mileage,  optionVehicle, licensePlate, numDoors, isPolarized, optionCar, optionCharger, batteryLife);
                    
					if (optionVehicle == 2) { 

						regisSoat(id);
						regisReview(id);
						regisCard(id);

                    } else if (optionVehicle == 1) {

						cs.addDocumentSoat(id,0,2022,0);
						cs.addDocumentReview(id, 0, 2022, 0);
						cs.addDocumentCard(id, 0, 2022);
						

                    }
                    
                    
                } else if (option == 3) {
                    System.out.println("ingrese la capacidad del tanque");
                    double tankCapacity = sc.nextDouble();
                    
                    System.out.println("Ingrese el tipo de gasolina del vehiculo 1. Extra 2. Regular 3. Diesel");
                    int optionGasoline = sc.nextInt();

					int id = cs.addVehicle(basePrice,  price,  brand,  model, cylinder, mileage, optionVehicle, licensePlate, numDoors, isPolarized, optionCar, tankCapacity, batteryLife, optionCharger, optionGasoline);

					if (optionVehicle == 2) { 

						regisSoat(id);
						regisReview(id);
						regisCard(id);

                    } else if (optionVehicle == 1) {

						cs.addDocumentSoat(id,0,2022,0);
						cs.addDocumentReview(id, 0, 2022, 0);
						cs.addDocumentCard(id, 0, 2022);
						

                    }
                    
                } 
			}

		}	
	}

	public void regisSoat(int id) {
        System.out.println("Ingrese el precio del SOAT");
		double price =sc.nextDouble();

		System.out.println("Ingrese el año de vencimiento del documento");
		int year=sc.nextInt();

		System.out.println("Ingrese el monto de cobertura por accidentes");
		double cover=sc.nextDouble();
        
        cs.addDocumentSoat(id,price, year, cover );
    }

    public void regisReview(int id) {
		System.out.println("Ingrese el precio de la revision tecnico mecanica");
		double price =sc.nextDouble();

		System.out.println("Ingrese el año de vencimiento del documento");
		int year=sc.nextInt();

        System.out.println("Ingrese los niveles de gas del vehiculo");
		double gasLevels = sc.nextDouble();;
        
        cs.addDocumentReview(id, price, year, gasLevels);
    }

    public void regisCard(int id) {

        System.out.println("Ingrese el precio dela tarjeta de propiedad");
		double price =sc.nextDouble();

		System.out.println("Ingrese el año de vencimiento del documento");
		int year=sc.nextInt();
     
        cs.addDocumentCard(id, price,year);
    }
    

	public void calculatePrice() {

		System.out.println("Ingrese el id del vehiculo del que quiere saber el precio de venta");
		int id = sc.nextInt();

		System.out.println(cs.calculateSalePrice(id));
	}
	

	public void showReports() { 
    
        System.out.println("Como quiere generar el informe 1. Tipo de vehiculo 2. Tipo de combusible 3. Carro nuevo o usado");
        int option = sc.nextInt();
    
        switch (option) {
            case 1:
                System.out.println("De que tipo de vehiculo quiere generar el informe 1. Carro a gasolina 2. Carro electrico 3. Carro hibrido" + "4. Motocicleta");
                int option1 = sc.nextInt();

                System.out.println(cs.showReportsTypeVehicle(option1));
                break;
            case 2:
                System.out.println("De que tipo de combustible quiere generar el informe 1. Extra 2. Regular 3. Diesel");
                int option2 = sc.nextInt();
    
                System.out.println(cs.showReportsTypeFuel(option2));
                break;
            case 3:  
                System.out.println("De que tipo de vehiculo quiere generar el informe 1.Nuevo 2.Usado");
				int option3 = sc.nextInt();
   
                System.out.println(cs.showReportsUse(option3));  
                break;
        }
    }

	public void showDocuments() {
        System.out.println("Ingrese el id del vehiculo del cual quiere ver sus documentos");
        int id = sc.nextInt();
       
        System.out.println(cs.showDocuments(id));
        
    }

	public void showParking() {

		System.out.println(cs.showMapParking());

	}

	public void showReportsParking() { 
    
        System.out.println("Como quiere generar el informe 1. Dado un rango de años 2. Vehículo más antiguo y más nuevo. 3. Porcentaje de ocupación del parqueadero");
        int option = sc.nextInt();
    
        switch (option) {
            case 1:
                System.out.println("Ingrese que año quiere buscar 1. 2014 2. 2013 3. 2012 4. 2011 5. 2011>");
                int option1 = sc.nextInt();

                System.out.println(cs.showReportsParkingYears(option1));
                break;
            case 2:
                System.out.println("Que vehiculo quiere buscar 1. Mas nuevo 2. Mas viejo");
                int option2 = sc.nextInt();

				System.out.println(cs.showReportsParkingUse(option2));
    
                break;
            case 3:  
                System.out.println(cs.showPercentageOcupation());
                break;
        }
    }

}


