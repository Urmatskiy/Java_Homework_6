package Homework_6;

public class Employee {
    
    int age;
    String firstName;
    String secondName;
    double salary;

    public Employee(int age, String firstName, String secondName, double salary) {
        this.age = age;
        this.firstName = firstName;
        this.secondName = secondName;
        this.salary = salary;
    }

    public Employee(int age, String firstName, String secondName) {
        this.age = age;
        this.firstName = firstName;
        this.secondName = secondName;
        this.salary = 50.0;
    }


}
