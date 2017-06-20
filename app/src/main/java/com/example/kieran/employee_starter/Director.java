package com.example.kieran.employee_starter;

/**
 * Created by Kieran on 20/06/2017.
 */

public class Director extends Manager {
    public double valueBudget;

    public Director(int empId, String name, String ssn, double salary, String deptName, double valueBudget) {
        super(empId, name, ssn, salary, deptName);
        this.valueBudget = valueBudget;
    }

    public double getValueBudget() { return valueBudget; }

}