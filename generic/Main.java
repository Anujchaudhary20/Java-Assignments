package com.generic;

import java.util.HashSet;

class Employee {
    private final int id;
    private final String name;
    private final int salary;
    private final String department;

    public Employee(int id, String name, int salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
    }
}

public class Main {
    public static void main(String[] args) {
        HashSet<Employee> employeeSet = new HashSet<>();

        addEmployee(employeeSet, 1, "John", 30000, "IT");
        addEmployee(employeeSet, 2, "Smith", 40000, "HR");
        addEmployee(employeeSet, 3, "Peter", 50000, "IT");
        addEmployee(employeeSet, 4, "Mary", 60000, "Admin");

        displayEmployees(employeeSet);
    }

    public static void addEmployee(HashSet<Employee> set, int id, String name, int salary, String department) {
        Employee employee = new Employee(id, name, salary, department);
        set.add(employee);
    }

    public static void displayEmployees(HashSet<Employee> set) {
        for (Employee employee : set) {
            employee.displayDetails();
        }
    }
}