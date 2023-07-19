package org.cursjava.test_ExceptionsLogging;

import org.cursjava.test_ExceptionsLogging.Exceptions.ValidatingConditionsException;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws ValidatingConditionsException {
        SchoolCatalog schoolCatalog = new SchoolCatalog();

        Student student2 =new Student("Mihai", "Andrei", "12.07.2023", Gender.MALE, 23456789L);
        Student student3 =new Student("Mihai", "Andrei", "12.07.2023", Gender.MALE, 23456789L);
        List<Student> studentList = new ArrayList<>();
        studentList.add(student2);
        studentList.add(student3);
        studentList.remove(student3);





        System.out.println(studentList);


    }








}
