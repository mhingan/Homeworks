package org.cursjava.IO_Enums_Homework;

public class Athlete {
    private String name;
    private String countryCode;

    private BiathlonResult biathlonResults;

    public Athlete(String name, String countryCode, BiathlonResult biathlonResults){
        this.name = name;
        this.countryCode = countryCode;
        this.biathlonResults = biathlonResults;
    }

    public String getName() {
        return name;
    }


    public String getCountryCode() {
        return countryCode;
    }

    public BiathlonResult getBiathlonResults() {
        return biathlonResults ;
    }

    @Override
    public String toString() {
        return "Athlete{" +
                "\nname='" + name + '\'' +
                ", \ncountryCode='" + countryCode + '\'' +
                ", \nbiathlonResults=" + biathlonResults +
                '}';
    }
}
