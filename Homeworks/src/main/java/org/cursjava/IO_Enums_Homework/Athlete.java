package org.cursjava.IO_Enums_Homework;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class Athlete {
    /**@athleteNumber - number of an athlete (can be random);
     * @name - name of the athlete;
     * @countryCode - the country code for which the athlete compete;
     * @skiTime - total time at the end of the course (before penalties);
     * @firstShootingRange - first round of shootings - show us how many times the athlete missed;
     * @SecondShootingRange - second round of shootings - show us how many times the athlete missed;
     * @ThirdShootingRange - third round of shootings - show us how many times the athlete missed
     * **/
    private int athleteNumber;
    private String name;
    private String countryCode;
    private double skiTime;
    private String firstShootingRange;
    private String secondShootingRange;
    private String thirdShootingRange;


/**
 * Creating the constructor for Athlete object;
 * **/
    public Athlete(int athleteNumber, String name, String countryCode, double skiTime, String firstShootingRange, String secondShootingRange, String thirdShootingRange) {
        this.athleteNumber = athleteNumber;
        this.name = name;
        this.countryCode = countryCode;
        this.skiTime = skiTime;
        this.firstShootingRange = firstShootingRange;
        this.secondShootingRange = secondShootingRange;
        this.thirdShootingRange = thirdShootingRange;
    }


    /**
     *Auto-generated getters and setters for some of teh above variables;
     * **/
    public int getAthleteNumber() {
        return athleteNumber;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public double getSkiTime() {
        return skiTime;
    }


    /**
     * @countMisses = method that has as a parameter a string called @shootingRange.
     *                  It stores a variable called misses (init. val. 0), using a for loop we are searching for char 'o' and increase the value of @misses;
     * **/
    public int countMisses(@NotNull String shootingRange){
        int misses = 0;
        for(char shot: shootingRange.toCharArray()){
            if(shot == 'o'){
                misses++;
            }
        }
        return misses;
    }

    /**
     * @getPenalty = this method has a var. called penalty with val 0, for each shooting the method is applying a penalty;
     * **/
    private int getPenalty(){
        int penalty = 0;
        penalty += countMisses(firstShootingRange);
        penalty += countMisses(secondShootingRange);
        penalty += countMisses(thirdShootingRange);
        return penalty;
    }

    /**
     * @calculateFinalTime = method that is calculating the total time after the penalties are applied to the athlete time.
     * **/
    public double calculateFinalTime(){
        int penalty = getPenalty();
        return (skiTime+= (penalty * 0.10));
    }

    @Override
    public String toString() {
        return "Athlete{" +
                "athleteNumber=" + athleteNumber +
                ", name='" + name + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", skiTime=" + skiTime +
                ", firstShootingRange='" + firstShootingRange + '\'' +
                ", secondShootingRange='" + secondShootingRange + '\'' +
                ", thirdShootingRange='" + thirdShootingRange + '\'' +
                '}'+"\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Athlete athlete = (Athlete) o;
        return athleteNumber == athlete.athleteNumber && Double.compare(athlete.skiTime, skiTime) == 0 && Objects.equals(name, athlete.name) && Objects.equals(countryCode, athlete.countryCode) && Objects.equals(firstShootingRange, athlete.firstShootingRange) && Objects.equals(secondShootingRange, athlete.secondShootingRange) && Objects.equals(thirdShootingRange, athlete.thirdShootingRange);
    }

    @Override
    public int hashCode() {
        return Objects.hash(athleteNumber, name, countryCode, skiTime, firstShootingRange, secondShootingRange, thirdShootingRange);
    }
}
