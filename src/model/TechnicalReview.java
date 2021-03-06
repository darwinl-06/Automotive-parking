package model;

public class TechnicalReview extends Document {

    private double gasLevels;

    public TechnicalReview(double price,int year, double gasLevels ) {
        super(price, year);
        this.gasLevels = gasLevels;
    }

    public double getGasLevels() {
        return gasLevels;
    }

    public void setGasLevels(double gasLevels) {
        this.gasLevels = gasLevels;
    }

    @Override
    public String toString() {
        return super.toString() + "\n , Niveles de gas = " + gasLevels + "\n";
    }

    
}