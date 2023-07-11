package org.cursjava.IO_Enums_Homework;

public class BiathlonResult {
    private double skiTimeResult;
    private double firstShootingRange;
    private double secondShootingRange;
    private double thirdShootingRange;

    public BiathlonResult(double skiTimeResult, double firstShootingRange, double secondShootingRange, double thirdShootingRange){
        this.skiTimeResult = skiTimeResult;
        this.firstShootingRange = firstShootingRange;
        this.secondShootingRange = secondShootingRange;
        this.thirdShootingRange = thirdShootingRange;
    }

    public double getSkiTimeResult() {
        return skiTimeResult;
    }

    public void setSkiTimeResult(double skiTimeResult) {
        this.skiTimeResult = skiTimeResult;
    }

    public double getFirstShootingRange() {
        return firstShootingRange;
    }

    public void setFirstShootingRange(double firstShootingRange) {
        this.firstShootingRange = firstShootingRange;
    }

    public double getSecondShootingRange() {
        return secondShootingRange;
    }

    public void setSecondShootingRange(double secondShootingRange) {
        this.secondShootingRange = secondShootingRange;
    }

    public double getThirdShootingRange() {
        return thirdShootingRange;
    }

    public void setThirdShootingRange(double thirdShootingRange) {
        this.thirdShootingRange = thirdShootingRange;
    }

    @Override
    public String toString() {
        return "BiathlonResult{" +
                "\nskiTimeResult=" + skiTimeResult +
                ", \nfirstShootingRange=" + firstShootingRange +
                ", \nsecondShootingRange=" + secondShootingRange +
                ", \nthirdShootingRange=" + thirdShootingRange +
                '}';
    }
}
