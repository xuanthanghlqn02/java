package Manage_Employee;

public class Employee {
    int employeeID;
    String employeeName;
    int employeeAge;
    String employeePhoneNumber;
    String employeeEmail;
    double basicSalary;

    public Employee(int employeeID, String employeeName, int employeeAge, String employeePhoneNumber, String employeeEmail, double basicSalary) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.employeeAge = employeeAge;
        this.employeePhoneNumber = employeePhoneNumber;
        this.employeeEmail = employeeEmail;
        this.basicSalary = basicSalary;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeeAge() {
        return employeeAge;
    }

    public void setEmployeeAge(int employeeAge) {
        this.employeeAge = employeeAge;
    }

    public String getEmployeePhoneNumber() {
        return employeePhoneNumber;
    }

    public void setEmployeePhoneNumber(String employeePhoneNumber) {
        this.employeePhoneNumber = employeePhoneNumber;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    @Override
    public String toString() {
        return "ID: " + employeeID + " - " +
                "Name: " + employeeName + " - " +
                "Age: " + employeeAge + " - " +
                "Phone Number: " + employeePhoneNumber + " - " +
                "Email Address: " + employeeEmail + " - " +
                "Basic Salary: " + basicSalary;
    }
}
