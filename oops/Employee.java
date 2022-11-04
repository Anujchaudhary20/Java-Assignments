package com.oops;

public class Employee {
    String name;
    int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public void printSalary() {
        System.out.println("Name : " + name);
        System.out.println("Salary : " + salary);
    }


static class Manager extends Employee {

    int incentive;

    public Manager(String name, int salary, int incentive) {
        super(name, salary);
        this.incentive = incentive;
    }

    @Override
    public void printSalary() {
        super.printSalary();
        System.out.println("Incentive : " + incentive);
    }
}

static class Labour extends Employee {

    int overtime;

    public Labour(String name, int salary, int overtime) {
        super(name, salary);
        this.overtime = overtime;
    }

    @Override
    public void printSalary() {
        super.printSalary();
        System.out.println("Overtime : " + overtime);
    }
}

    public static void main(String[] args) {
        Employee e1 = new Employee("John", 10000);
        Manager m1 = new Manager("Martin", 20000, 1000);
        Labour l1 = new Labour("Mike", 15000, 200);

        e1.printSalary();
        m1.printSalary();
        l1.printSalary();
    }
}