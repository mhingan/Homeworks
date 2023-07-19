package org.cursjava.Exceptions_Logging;

import org.cursjava.Exceptions_Logging.Exceptions.DateOfBirthValidationException;

public class Student {
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String gender; //male/female || m\f || M\F
    private String ID;

    public Student(String firstName, String lastName, String dateOfBirth, String gender, String ID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.ID = ID;
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

    public String getGender() {
        return gender;
    }

    public String getID() {
        return ID;
    }

    public void calculateAge(String dateOfBirth) {
        try {
            if (dateOfBirth.isEmpty() || dateOfBirth.trim().isEmpty()) {
                throw new DateOfBirthValidationException("Date of birth cannot be empty!");
            } else if (dateOfBirth.matches("[a-z]")) {
                throw new DateOfBirthValidationException("Only numbers are allowed in this field!");
            } else if (dateOfBirth.length() != 10) {
                throw new DateOfBirthValidationException("Date of birth should have this format: 12.03.2002 -> 12=day; 03=month;2002=year");
            }

        } catch (DateOfBirthValidationException e) {
            throw new RuntimeException(e);
        }
    }
}
