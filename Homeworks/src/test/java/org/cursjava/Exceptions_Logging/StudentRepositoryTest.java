package org.cursjava.Exceptions_Logging;


import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;


public class StudentRepositoryTest {
    LocalDate mockDateOfBirth1 = LocalDate.of(2000, 6, 15);
    LocalDate mockDateOfBirth2 = LocalDate.of(1998, 9, 30);
    LocalDate mockDateOfBirth3 = LocalDate.of(2002, 3, 10);
    LocalDate mockDateOfBirth4 = LocalDate.of(1999, 12, 25);
    LocalDate mockDateOfBirth5 = LocalDate.of(2001, 7, 5);

    /**
     * Creating the students objects.
     **/
    Student mock_student1 = new Student("Mihai", "Hingan", mockDateOfBirth1, "m", "1231234567892");
    Student mock_student2 = new Student("Ana", "Popescu", mockDateOfBirth2, "f", "1232343434343");
    Student mock_student3 = new Student("Ion", "Ionescu", mockDateOfBirth3, "m", "7891234567890");
    Student mock_student4 = new Student("Elena", "Stan", mockDateOfBirth4, "f", "1011234567890");
    Student mock_student5 = new Student("Alex", "Gheorghe", mockDateOfBirth5, "m", "2021234567890");
    Student mock_student6 = new Student("Alex", "Gheorghe", mockDateOfBirth5, "m", "2021234567893");


    @Test
    public void test_addStudent_success() {
        List<Student> studentList = new ArrayList<>();
        studentList.add(mock_student1);
        studentList.add(mock_student2);
        studentList.add(mock_student3);
        studentList.add(mock_student4);
        studentList.add(mock_student5);

        int listSize = studentList.size();

        assertEquals(5, listSize);
        System.out.println("Test1: Students added to list: -> success.");
    }

    @Test
    public void test_deleteStudent_success() {
        List<Student> studentList = new ArrayList<>();
        studentList.add(mock_student1);
        studentList.add(mock_student2);
        studentList.add(mock_student3);
        studentList.add(mock_student4);
        studentList.add(mock_student5);


        //remove a student
        studentList.remove(mock_student1);

        int listSizeAfterRemoveAStudent = studentList.size();
        assertEquals(4, listSizeAfterRemoveAStudent);
        System.out.println("Test2: Students removed from list: -> success.");

    }


    @Test
    public void test_validateStudent_nameEmpty() {
        Student student = new Student("", "", mockDateOfBirth1, "male", "1234567891234");
        assertEquals("", student.getFirstName());
        System.out.println("Test3: Student name is empty: -> success.");

    }



    @Test
    public void test_validateStudent_id_length_is_13() {
        assertEquals(13, mock_student6.getID().length());
        System.out.println("Test4: Student ID length is 13: -> success.");
    }

}