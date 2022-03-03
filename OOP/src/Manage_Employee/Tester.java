package Manage_Employee;

public class Tester extends Employee {
    int errorNumber;

    public Tester(int employeeID, String employeeName, int employeeAge, String employeePhoneNumber, String employeeEmail, double basicSalary, int errorNumber) {
        super(employeeID, employeeName, employeeAge, employeePhoneNumber, employeeEmail, basicSalary);
        this.errorNumber = errorNumber;
    }

    public int getErrorNumber() {
        return errorNumber;
    }

    public void setErrorNumber(int errorNumber) {
        this.errorNumber = errorNumber;
    }

    @Override
    public String toString() {
        return "ID: " + employeeID + " - " +
                "Name: " + employeeName + " - " +
                "Age: " + employeeAge + " - " +
                "Phone Number: " + employeePhoneNumber + " - " +
                "Email Address: " + employeeEmail + " - " +
                "Basic Salary: " + basicSalary + " - " +
                "Error Number: " + errorNumber;
    }
}
