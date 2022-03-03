package Manage_Employee;


public class Developer extends Employee{
    double overTime;

    public Developer(int employeeID, String employeeName, int employeeAge, int employeePhoneNumber, String employeeEmail, double basicSalary, double overTime) {
        super(employeeID, employeeName, employeeAge, employeePhoneNumber, employeeEmail, basicSalary);
        this.overTime = overTime;
    }

    public double getOverTime() {
        return overTime;
    }

    public void setOverTime(double overTime) {
        this.overTime = overTime;
    }

    @Override
    public String toString() {
        return "Developer{}";
    }
}
