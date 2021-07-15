package com.company.Task2;

public class Company {

    private Employee[] employees;
    private String companyName;

    public Company(String companyName, Employee[] employees) {
        this.employees = employees;
        this.companyName = companyName;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public float getAverage() {
        float sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum += employees[i].getAge();
        }
        return sum / employees.length;
    }

    //get random employee
    public Employee getEmployee() {
       int random = (int) (Math.random() * 10);
       if (random >= employees.length) {
           return getEmployee();
       }
        else return employees[random];
    }


}
