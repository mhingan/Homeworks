package org.cursjava.Exceptions_Logging_Homework;

import org.cursjava.Exceptions_Logging_Homework.Exceptions.ValidatingConditionsException;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class Student {
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private Gender gender;
    private  long cnp;
    private static List<Student> studentList;


    public Student(@NotNull String firstName,@NotNull String lastName, String dateOfBirth, Gender gender, long cnp) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.cnp = cnp;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public Gender getGender() {
        return gender;
    }

    public long getCNP() {
        return cnp;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", gender=" + gender +
                ", CNP=" + cnp +
                '}';
    }
}
