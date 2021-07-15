package com.company.Task2;

public class Employee extends Person{
    private String companyId;
    private String companyName;

    public Employee(String name, int age, String companyId, String companyName) {
        super(name, age);
        this.companyId = companyId;
        this.companyName = companyName;
    }
}
