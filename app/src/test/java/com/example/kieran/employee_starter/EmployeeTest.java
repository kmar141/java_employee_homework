package com.example.kieran.employee_starter;


import org.junit.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployeeTest{
    Employee employee;

    @Before
    public void before() {
        employee = new Employee(1, "Kieran", "1337", 13337);

    }

    @Test
    public void testEmployeeName(){
        assertEquals("Kieran", employee.getName());
    }

    @Test
    public void testEmployeeSSN(){
        assertEquals("1337", employee.getSsn());
    }

    @Test
    public void testEmployeeSalary(){
        assertEquals(13337, employee.getSalary(), 0.01);
    }
}
