package ui;

import java.util.Scanner;


public class Main {
	
	private Scanner sc;
	
	
	public Main() {

		sc= new Scanner(System.in);
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
			
			break;
		case 2:
			
			break;
	
		case 3:
			
			break;

		case 4:
			
			break;

        case 5:
			
			break;

        case 6:
			
			break;
		
		default:
			System.out.println("Opción no válida");
		
		}
	}

}


