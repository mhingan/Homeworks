package org.cursjava.test_ExceptionsLogging;

import org.cursjava.test_ExceptionsLogging.Exceptions.ValidatingConditionsException;

import java.util.List;

public class SchoolCatalog {
    static List<Student> studentList;


    public static void addStudent(String firstName, String lastName, String dateOfBirth, Gender gender, long CNP) throws ValidatingConditionsException {
        Student student = new Student(firstName, lastName, dateOfBirth, gender, CNP);
        studentList.add(student);

        for(Student student1: studentList){
            if(student1.getCNP() == student.getCNP()){
                throw new ValidatingConditionsException();
            } else {
                studentList.add(student1);
            }
        }

    }
}
