package com.pluralsight;

public class Employee {
    private String employeeId;
    private String name;
    private String department;
    private double payRate;
    private int hoursWorked;
    private int overtimeHours;
    private int regularHours;
    private double overtimePay;

    public Employee(String employeeId, String name, String department, double payRate, int hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public int getOvertimeHours(){
        if((getHoursWorked()-40) > 0){
            overtimeHours = getHoursWorked()-40;
        } else{
            overtimeHours = 0;
        }
        return overtimeHours;
    }

    public int getRegularHours(){
        if((getHoursWorked()-40) > 0){
            regularHours = 40;
        } else {
            regularHours = getHoursWorked();
        }
        return regularHours;
    }

    public double getTotalPay() {
        return (getRegularHours() * getPayRate()) + (getOvertimeHours() * 1.5 * getPayRate());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId='" + employeeId + '\'' +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", payRate=" + payRate +
                ", hoursWorked=" + hoursWorked +
                ", overtimeHours=" + overtimeHours +
                ", regularHours=" + regularHours +
                ", overtimePay=" + overtimePay +
                '}';
    }
}


