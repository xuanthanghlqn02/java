package com.company.manage.student;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Student s = new Student();
        StudentFunction list = new StudentFunction();
        ArrayList<Student> listStudent = list.getAllStudent();

        // show list of students
        System.out.println("Show the list of students");
        list.show(listStudent);
        System.out.println("\n---------------");

        // add new studen
//        System.out.println("Add new studen");
//        list.createStudent(listStudent, s);
//        System.out.println("Show new list of students");
//        list.show(listStudent);
//        System.out.println("\n---------------");
//
//        // update the point
//        System.out.println("Update the student point");
//        list.updateStudentPoint(listStudent, s);
//        System.out.println();
//        System.out.println("Show the point of the student after update");
//        list.show(listStudent);
//        System.out.println("\n---------------");

        // delete the student
//        System.out.println("Delete the student");
//        list.deleteStudent(listStudent, s);
//        System.out.println();
//        System.out.println("Show the list of students after delete");
//        list.show(listStudent);
//        System.out.println("\n---------------");

        // search by classroom
        System.out.println("Search by classroom");
        list.searchByClassroom(listStudent, s);
        System.out.println("\n---------------");
    }
}
