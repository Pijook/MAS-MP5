package com.tlt.employee;

public class Employee {

    private final String name;
    private int workingDays;
    private Double salary;

    public Employee(String name, int workingDays, Double salary) {
        this.name = name;
        this.workingDays = workingDays;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getWorkingDays() {
        return workingDays;
    }

    public void setWorkingDays(final int workingDays) {
        if(workingDays < 0) {
            throw new IllegalArgumentException("Working days cannot be negative");
        }
        this.workingDays = workingDays;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        if(salary >= this.salary * 2) {
            throw new IllegalArgumentException("Salary cannot be more than double of previous salary");
        }
        this.salary = salary;
    }
}
