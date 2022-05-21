package model;

public class Parking {

    private static final int ROW = 10;
    private static final int COLUMN = 5;

    private Vehicle[][] parking;

    public Parking() {

        parking = new Vehicle[ROW][COLUMN];
    }

    //Method to find a empty collum in parking
    public int nullColumn(int row) {

        int ind = 10;
        for (int i = 0; i < parking.length && ind == 10; i++) {
            if (parking[i][row] == null) {
                ind = i;
            }
        }
        return ind;
    }

    //Method to add a vehicle to the parking
    public void addVehicleToParking(Vehicle vehicle) {
        if (vehicle.getTypeVehicle() == TypeVehicle.USED) {

            if (vehicle.getModel() == 2014) {
                int index = nullColumn(0);
                if (index != 10) {
                    parking[index][0] = vehicle;
                }
            } else if (vehicle.getModel() == 2013) {
                int index = nullColumn(1);
                if (index != 10) {
                    parking[index][1] = vehicle;
                }
            } else if (vehicle.getModel() == 2012) {
                int index = nullColumn(2);
                if (index != 10) {
                    parking[index][2] = vehicle;
                }
            }else if (vehicle.getModel() == 2011) {
                int index = nullColumn(3);
                if (index != 10) {
                    parking[index][3] = vehicle;
                }
            }else if (vehicle.getModel() < 2011) {
                int index = nullColumn(4);
                if (index != 10) {
                    parking[index][4] = vehicle;
                }
            }
        }
    }   

    //Method o print the map of the parking
    public String printParking(){
		String message = "  2014     2013     2012      2011    <2011   \n _______  _______  _______  _______  _______ \n";
		for (int counter=0; counter<10; counter++){
			for (int counter2=0; counter2<4; counter2++){
				for (int counter3=0; counter3<5; counter3++){
					if(parking[counter][counter3]==null){
						if(counter2!=3){
							message += "|       |";
						}
					}
					else if (parking[counter][counter3] instanceof Car){
						switch (counter2){
							case (0):
								message += "|  __   |";
								break;
							case(1):
								message += "|_|  |__|";
								break;
							case(2):
								message += "|-O---O-|";
								break;		
						}
					}
					else if (parking[counter][counter3] instanceof MotorCycle){
						switch (counter2){
							case (0):
								message += "|     _ |";
								break;
							case(1):
								message += "|   _ | |";
								break;
							case(2):
								message += "|  O--O |";
								break;		
						}
					}
					if (counter2==3){
						message += " ------- ";
					}
				}
				message += "\n";
			}
		}
		return message;
	}

    
    //Method to show information of a car by the year
    public String showParkingYear(int option) {
        String out = "";
        boolean flag = false;
        
        switch (option) {
            case 1:
                for (int i = 0; i < nullColumn(0); i++) {
                    out += parking[i][0].toString();
                 }
                flag = true;
                break;
            case 2:
                for (int i = 0; i < nullColumn(1); i++) {
                    out += parking[i][1].toString();
                }
                flag = true;
                break;
            case 3:
                for (int i = 0; i < nullColumn(2); i++) {
                    out += parking[i][2].toString();
                }
                flag = true;
                break;
            case 4:
                for (int i = 0; i < nullColumn(3); i++) {
                    out += parking[i][3].toString();
                }
                flag = true;
                break;
            
            case 5:
                for (int i = 0; i < nullColumn(4); i++) {
                    out += parking[i][4].toString();
                }
                flag = true;
                break;
            }

        if(flag == false) 
            out += "No se encontro un vehiculo con ese año";
    
        return out;
    }   

    //Method to show the newest car in the parking
    public String showNewest() {
        String out = "";
        boolean flag = true;
        for (int j = 0; j < parking[0].length && flag; j++) {
            for (int i = parking.length-1; i >=0 && flag; i--) {
                if (parking[i][j] != null) {
                    out = parking[i][j].toString();
                    flag = false;
                }
            }
        }
        return out;
    }
    
    //Method to show the oldest car in the parking
    public String showOldest() {
        String out = "";
        boolean flag = true;
        for (int j = parking[0].length -1 ; j >=0 && flag; j--) {
            for (int i = parking.length -1; i >= 0 && flag; i--) {
                if (parking[i][j] != null) {
                    out += parking[i][j].toString();
                    flag = false;
                }
            }
        }
        return out;
    }       

    //Method to show the percentage of occupation of the parking
    public double showOccupation() {
        double cont = 0;
        for (int i = 0; i < parking.length; i++) {
            for (int j = 0; j < parking[0].length; j++) {
                if (parking[i][j] != null) {
                    cont++;
                }
            }
        }
        return (cont/(ROW*COLUMN))*100;
    }

}
