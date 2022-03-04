package Manage_Employee;

import java.util.Scanner;

public class EmployeeMethods {
//    public static Developer getAllDeveloper() {
////        Developer[] dev = new Developer[3];
//        Developer a = new Developer(1, "John", 25, "0912345678",
//                "john@gmail.com", 10000.000, 5.5);
//        Developer b = new Developer(2, "Alex", 25, "0999888777",
//                "alex@gmail.com", 15000.000, 7.0);
//        Developer c = new Developer(3, "Tom", 30, "0666888222",
//                "tom@gmail.com", 20000.000, 7.0);
//        return a;
//    }

//    public static void show(Developer[] dev) {
//        for (Developer x : dev
//        ) {
//            System.out.println(x);
//        }
//    }

    public static double getDevSalary(Developer dev) {
        return dev.getBasicSalary() + (dev.getOverTime() * 5.5);
    }

    public static double getTesterSalary(Tester test) {
        return test.getBasicSalary() + (test.getErrorNumber() * 50);
    }

    public static Developer[] enterInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of employee: ");
        int numberEmployee = sc.nextInt();
        Developer[] employeeList = new Developer[numberEmployee];
        for (int i = 0; i < employeeList.length; i++) {
            System.out.println("Enter the employee ID: ");
            int id = sc.nextInt();
            System.out.println("Enter the employee name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Enter the employee age: ");
            int age = sc.nextInt();
            System.out.println("Enter the employee phone number: ");
            sc.nextLine();
            String phoneNumber = sc.nextLine();
            System.out.println("Enter the employee email address: ");
            String emailAddress = sc.nextLine();
            System.out.println("Enter the employee basic salary: ");
            double basicSalary = sc.nextDouble();
            System.out.println("Enter the employee over time: ");
            double overTime = sc.nextDouble();
            employeeList[i] = new Developer(id, name, age, phoneNumber, emailAddress, basicSalary, overTime);
        }
        return employeeList;
    }

    public static void show(Developer[] dev) {
        for (Developer x : dev) {
            System.out.println(x);
        }
    }
}
