package com.company.manage.student;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // show list of students

        Student asd = new Student();
        Student fsf = new Student();
        System.out.println("show list of students");
        StudentFunction list = new StudentFunction();
        ArrayList<Student> listStudent = list.getAllStudent();
        list.show(listStudent);
        System.out.println("\n---------------");
        // add new studen
        System.out.println("add new studen");
        Student s4 = new Student(4,"Tuan",20,"ND",8.0,"12A1");
        list.addStudent(listStudent,s4);
        list.show(listStudent);

    }
}
