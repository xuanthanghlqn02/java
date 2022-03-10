package com.company.manage.student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentFunction implements Comparable<Student> {

    static Scanner sc = new Scanner(System.in);

    public ArrayList<Student> getAllStudent() {
        ArrayList<Student> list = new ArrayList<>();

        Student s1 = new Student(1, "Thang", 20, "HN", 9.5, "12A2");
        Student s2 = new Student(2, "Hang", 22, "QN", 8.5, "12A4");
        Student s3 = new Student(3, "Giang", 21, "BN", 9.0, "12A6");
        Student s4 = new Student(4, "Manh", 20, "HN", 9.0, "12A2");
        Student s5 = new Student(5, "Binh", 20, "SG", 7.0, "12A6");

        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);

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

    public ArrayList<Student> createStudent(ArrayList<Student> list, Student s) {
//        Scanner sc = new Scanner(System.in);
//        Student s = new Student();
        System.out.println("Enter the info of the student:");

        System.out.print("ID: ");
        int id = Integer.parseInt(sc.nextLine());

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Age: ");
        int age = Integer.parseInt(sc.nextLine());

        System.out.print("Address: ");
        String address = sc.nextLine();

        System.out.print("Point: ");
        double point = Double.parseDouble(sc.nextLine());

        System.out.print("Class: ");
        String classroom = sc.nextLine();

        Student ss = new Student(id, name, age, address, point, classroom);
        list.add(ss);

        return list;
    }

    public ArrayList<Student> updateStudentPoint(ArrayList<Student> list, Student s) {
        System.out.print("Enter the Student ID you want to update point: ");
        int number = Integer.parseInt(sc.nextLine());

        System.out.print("Enter the point you want to change: ");
        double point = Double.parseDouble(sc.nextLine());

        int count = 0;

        for (Student a : list) {
            if (a.getId() == number) {
                a.setPoint(point);
                count++;
            }
        }

        if (count == 0) {
            System.out.println("Do not have this Student ID");
        }

        return list;
    }

    public ArrayList<Student> deleteStudent(ArrayList<Student> list, Student s) {
        System.out.print("Enter the Student ID you want to delete: ");
        int number = Integer.parseInt(sc.nextLine());
        int count = 0;
//        Student a = null;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == number) {
                list.remove(i);
                count++;
            }
        }

//        for (Student x : list) {
//            if (x.getId() == number) {
//                a = x;
//                count++;
//            }
//        }

        if (count == 0) {
            System.out.println("Do not have this Student ID!");
        }

        return list;
    }

    public void searchByClassroom(ArrayList<Student> list, Student s) {
        System.out.print("Enter the classroom you want to search: ");
        String classroom = sc.nextLine();
        int count = 0;
        for (Student x : list) {
            if (x.getClassroom().equalsIgnoreCase(classroom)) {
                System.out.println(x);
                count++;
            }
        }

        if (count == 0) {
            System.out.println("Do not have this classroom!");
        }
    }

    @Override
    public int compareTo(Student o) {
        return 0;
    }
}
