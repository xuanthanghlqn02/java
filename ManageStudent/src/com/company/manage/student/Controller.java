package com.company.manage.student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Controller {
    public static void StudentController() {

        Student s = new Student();
        StudentFunction list = new StudentFunction();
        ArrayList<Student> listStudent = list.getAllStudent();

        // show list of students
        System.out.println("Show the list of students");
        list.show(listStudent);
        System.out.println("\n---------------");

        // add new studen
        System.out.println("Add new studen");
        list.createStudent(listStudent, s);
        System.out.println("Show new list of students");
        list.show(listStudent);
        System.out.println("\n---------------");

        // update the point
        System.out.println("Update the student point");
        list.updateStudentPoint(listStudent, s);
        System.out.println();
        System.out.println("Show the point of the student after update");
        list.show(listStudent);
        System.out.println("\n---------------");

        // delete the student
        System.out.println("Delete the student");
        list.deleteStudent(listStudent, s);
        System.out.println();
        System.out.println("Show the list of students after delete");
        list.show(listStudent);
        System.out.println("\n---------------");

        // search by classroom
        System.out.println("Search by classroom");
        list.searchByClassroom(listStudent, s);
        System.out.println("\n---------------");

        // sort by name, age, point
        System.out.print("Do you want to sort students by name, age and point? (Y/N), Answer: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        while (true) {
            if (str.equalsIgnoreCase("Y")) {
                // sort by name
                System.out.println("Sort by name");
                Collections.sort(listStudent, new Comparator<Student>() {
                    @Override
                    public int compare(Student o1, Student o2) {
                        return o1.getName().compareTo(o2.getName());
                    }
                });
                list.show(listStudent);
                System.out.println("\n---------------");

                // sort by age
                System.out.println("Sort by age");
                Collections.sort(listStudent, new Comparator<Student>() {
                    @Override
                    public int compare(Student o1, Student o2) {
                        return o1.getAge() - o2.getAge();
                    }
                });
                list.show(listStudent);
                System.out.println("\n---------------");

                // sort by point
                System.out.println("Sort by point");
                Collections.sort(listStudent, new Comparator<Student>() {
                    @Override
                    public int compare(Student o1, Student o2) {
                        return Double.compare(o1.getPoint(), o2.getPoint());
                    }
                });
                list.show(listStudent);
                System.out.println("\n---------------");

                break;
            }

            if (str.equalsIgnoreCase("N")) {
                System.out.println("The end!");
            } else {
                System.out.println("Do not have this choice!");
            }
            break;
        }
    }
}
