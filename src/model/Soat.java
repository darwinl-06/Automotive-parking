package model;

public class Soat extends Documents {

    private double coverage;

    public Soat(double price, int year, double coverage) {
        super(price, year);
        this.coverage = coverage;
    }

    public double getCoverage() {
        return coverage;
    }

    public void setCoverage(double coverage) {
        this.coverage = coverage;
    }

    @Override
    public String toString() {
        return "coverage=" + coverage;
    }

    

}