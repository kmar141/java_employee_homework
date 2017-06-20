package com.example.kieran.employee_starter;

/**
 * Created by Kieran on 20/06/2017.
 */

public class Manager extends Employee {
    public String deptName;

    public Manager(int empId, String name, String ssn, double salary, String deptName) {
        super(empId, name, ssn, salary);
        this.deptName = deptName;
    }

    public String getdeptName() {
        return deptName;
    }
}