package org.cursjava.Exceptions_Logging;

import org.cursjava.Exceptions_Logging.Exceptions.DateOfBirthValidationException;
import org.cursjava.Exceptions_Logging.Exceptions.GenderVerificationException;
import org.cursjava.Exceptions_Logging.Exceptions.NameVerificationException;
import org.cursjava.Exceptions_Logging.Exceptions.StudentValidationException;

import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;


public class StudentRepository {
    //Creating an empty list of students;
    private static final List<Student> students = new ArrayList<>();


    /**
     * Configure the Logger in order to store all the info/warnings into a file called: logs.txt
     **/
    private static Logger logger = Logger.getLogger(StudentRepository.class.getName());

    static {
        try {
            /*Configure the Logger to use FileHandler in order to write in log.txt**/
            Handler fileHandler = new FileHandler("src/main/resources/logs.txt");
            logger.addHandler(fileHandler);
            /*Setting the logger to store all the messages/info/warnings...etc..**/
            logger.setLevel(Level.ALL);
        } catch (IOException e) {
            System.err.println("FileHandler for Logger can't be configured.");
        }
    }

    /**
     * @addStudent = method which allows us to add a student to our list;
     **/
    public Student addStudent(Student student) throws GenderVerificationException, NameVerificationException, DateOfBirthValidationException, StudentValidationException {
        validateStudent(student);
        students.add(student);
        return student;
    }

    /**
     * @deleteStudent = method which allows us to delete a student from the list by ID;
     * -> has as entry parameter a string
     **/
    public void deleteStudent(String id) throws StudentValidationException {
        if (id == null || id.isEmpty()) {
            logger.severe("ID can't be empty/null.");
            throw new StudentValidationException("ID is null.");
        }

        for (Student student : students) {
            if (student.getID().equals(id)) {
                students.remove(id);
            } else {
                logger.severe("Student with this ID does not exist.");
                throw new StudentValidationException("Student with id: " + id + " does not exist.");
            }
        }
    }

    /**
     * @returnStudentsWithAge = method which return a list of all students that has a specific age;
     * entry parameter: int age;
     **/
    public List<Student> returnStudentsWithAge(int age) throws StudentValidationException {
        if (age < 0) {
            logger.severe("Age is a negative number.");
            throw new StudentValidationException("Age can't be a negative number.");
        }

        List<Student> filtredList = new ArrayList<>();
        for (Student student : students) {
            int calculatedAge = calculateAge(student.getDateOfBirth());
            if (calculatedAge == age) {
                filtredList.add(student);
            }
            System.out.println(filtredList);
        }
        return filtredList;

    }


    static int currentYear = LocalDate.now().getYear();

    /**
     * @validateStudent - method that is used to check if a student is eligible to be added in list;
     * - contains multiple if statements which check for age, name, genderID;
     **/
    public static void validateStudent(Student student) throws NameVerificationException, GenderVerificationException, DateOfBirthValidationException, StudentValidationException {
        logger.info("Student validation: STARTING.");
        if (student.getFirstName().isEmpty() || student.getLastName().isEmpty()) {
            logger.severe("First name  and/or last name is empty.");
            throw new NameVerificationException("First name or last name is empty!");
        }
        if (student.getFirstName().matches("[0-9]") || student.getLastName().matches("[0-9]")) {
            logger.severe("First and/or last name fields contains only numbers.");
            throw new NameVerificationException("First and Last name fields can't contain numbers.");
        }
        if (!student.getGender().equalsIgnoreCase("male") && !student.getGender().equalsIgnoreCase("female") && !student.getGender().equalsIgnoreCase("m") && !student.getGender().equalsIgnoreCase("f")) {
            logger.severe("Gender is incorrect.");
            throw new GenderVerificationException("Gender is incorrect.");
        }
        int calculatedAge = calculateAge(student.getDateOfBirth());
        if (calculatedAge < 18 || calculatedAge > currentYear - 1900) {
            logger.severe("Date of birth invalid.");
            throw new DateOfBirthValidationException("Invalid date of birth. Age should be between 18 and : " + (currentYear - 1900));
        }
        if (student.getID().length() != 13) {
            logger.severe("ID is longer / shorter than 13.");
            throw new StudentValidationException("ID (CNP) can contain only 13 digits.");
        }

        for (Student student1 : students) {
            if (student1.getID().equals(student.getID())) {
                logger.severe("Student with this ID already exists.");
                throw new StudentValidationException("Student with ID: " + student.getID() + " already exists.");
            }
        }
        logger.info("Student validation: ENDING.");


    }


    /**
     * Creating a method @calculateAge which has as entry parameter a LocalDate. Using the LocalDate.now(), calculates the age of the student;
     **/
    public static int calculateAge(LocalDate dateOfBirth) {
        //Creating a local variable of type: LocalDate and initialize it with today's date;
        LocalDate currentDate = LocalDate.now();
        //Returning the period of time between current year and the year from dateOfBirth() -> dateOfBirth() is declared in constructor;
        //In main() from Main.class -> we will have to create a new variable of type "LocalDate", initialize it with the wanted birthdate, assign it to a person in constructor;
        return Period.between(dateOfBirth, currentDate).getYears();
    }

    @Override
    public String toString() {
        return "StudentRepository{" + "students=" + students + '}';
    }
}
