package model;

public class Parking {

    private static final int ROW = 10;
    private static final int COLUMN = 5;

    private Vehicle[][] parking;

    public Parking() {

        parking = new Vehicle[ROW][COLUMN];
    }

    public int nullColumn(int row) {

        int ind = 10;
        for (int i = 0; i < parking.length && ind == 10; i++) {
            if (parking[i][row] == null) {
                ind = i;
            }
        }
        return ind;
    }

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

    public String printParking() {


        String out="MAPA PARQUEADERO "+"\n\n";
        
        
          out+="|    2014     |     2013    |    2012     |    2011     |    2010>    | "+ "\n" + "**********************************************************************"+"\n";
        
        for(int i=0;i<parking.length;i++){
            for(int x=0;x<parking[0].length;x++){
        
                if(parking[i][x]==null){
        
                    out+="*   (vacio)  *";
        
                } else 
                    out+="* (ocupado) *";
                }
        
        
        out+="\n"+"**********************************************************************"+"\n";
        
        }
         return out;
        }
    
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

    public double showOcupation() {
        double counter = 0;
        for (int i = 0; i < parking.length; i++) {
            for (int j = 0; j < parking[0].length; j++) {
                if (parking[i][j] != null) {
                    counter++;
                }
            }
        }
        return (counter/(ROW*COLUMN))*100;
    }

}
