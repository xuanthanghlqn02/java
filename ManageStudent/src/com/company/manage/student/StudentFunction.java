package com.company.manage.student;

import java.util.ArrayList;

public class StudentFunction{

    public ArrayList<Student> getAllStudent() {
        ArrayList<Student> list = new ArrayList<>();
        Student s1 = new Student(1,"Thang",20,"HN",9.5,"12A2");
        Student s2 = new Student(2,"Hang",22,"QN",8.5,"12A4");
        Student s3 = new Student(3,"Giang",21,"BN",9.0,"12A6");
        list.add(s1);
        list.add(s2);
        list.add(s3);
        return list;
    }

    public void show(ArrayList<Student> list) {
        for (Student x : list) {
            System.out.println(x);
        }
    }

    public ArrayList<Student> addStudent(ArrayList<Student> list, Student s) {
        list.add(s);
        return list;
    }
}
