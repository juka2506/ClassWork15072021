package com.company.Task2;

public class Task2 {

    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Vicky", 34, "J2021", "Java Corp"),
                new Employee("Henry", 59, "T42", "Nano tech"),
                new Employee("Jo", 23, "A16", " Apple")
        };

        Company company = new Company("Zoom", employees);

        float sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum += employees[i].getAge();
        }

        System.out.println("The average age of employees is " + sum / employees.length);

        Employee[] javaEmployees = {
                new Employee("George",  35, "J12", "Microsoft"),
                new Employee("Dana", 29, "H12", "Microsoft"),
                new Employee("Harry", 28, "U23", "Microsoft")
        };
        Employee[] javaScriptEmployees =  {
                new Employee("Nathan", 31, "I91", "Google"),
                new Employee("Jane", 42, "A22", "Google"),
                new Employee("Jordan", 22, "023", "Google")
        };

        Company microsoft = new Company("Microsoft", javaEmployees);
        Company google = new Company("Google", javaScriptEmployees);

        System.out.println("The average age of Microsoft employees age is " + microsoft.getAverage());
        System.out.println("The average age of Google employees age is " + google.getAverage());
        System.out.println(google.getEmployee().getName());
    }
}
