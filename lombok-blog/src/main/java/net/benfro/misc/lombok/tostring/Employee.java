package net.benfro.misc.lombok.tostring;

import lombok.ToString;

@ToString(callSuper = true, onlyExplicitlyIncluded = true)
public class Employee extends Person {
    @ToString.Include
    private String empNumber;
    private double salary;

    public Employee(int age, String fullName, String empNumber, double salary) {
        super(age, fullName);
        this.empNumber = empNumber;
        this.salary = salary;
    }
}
