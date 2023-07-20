package org.cursjava.Exceptions_Logging;

import org.cursjava.Exceptions_Logging.Exceptions.DateOfBirthValidationException;
import org.cursjava.Exceptions_Logging.Exceptions.GenderVerificationException;
import org.cursjava.Exceptions_Logging.Exceptions.NameVerificationException;
import org.cursjava.Exceptions_Logging.Exceptions.StudentValidationException;

import java.time.LocalDate;


public class Main {
    public static void main(String[] args) throws GenderVerificationException, DateOfBirthValidationException, NameVerificationException, StudentValidationException {
        /**
         * Creating objects of type "LocalDate" that are equals with a specific year, month and day, for students birthday.
         * Made with LocalDate instead String for an easier calculation of student age.
         * **/
        LocalDate dateOfBirth1 = LocalDate.of(2000, 6, 15);
        LocalDate dateOfBirth2 = LocalDate.of(1998, 9, 30);
        LocalDate dateOfBirth3 = LocalDate.of(2002, 3, 10);
        LocalDate dateOfBirth4 = LocalDate.of(1999, 12, 25);
        LocalDate dateOfBirth5 = LocalDate.of(2001, 7, 5);

        /**Creating the students objects.**/
        Student student1 = new Student("Mihai", "Hingan", dateOfBirth1, "m", "1231234567892");
        Student student2 = new Student("Ana", "Popescu", dateOfBirth2, "f", "1232343434343");
        Student student3 = new Student("Ion", "Ionescu", dateOfBirth3, "m", "7891234567890");
        Student student4 = new Student("Elena", "Stan", dateOfBirth4, "f", "1011234567890");
        Student student5 = new Student("Alex", "Gheorghe", dateOfBirth5, "m", "2021234567890");


        StudentRepository studentRepository = new StudentRepository();
        studentRepository.addStudent(student1);
        studentRepository.addStudent(student2);
        studentRepository.addStudent(student3);
        studentRepository.addStudent(student4);
        studentRepository.addStudent(student5);

        System.out.println(studentRepository);


    }
}

