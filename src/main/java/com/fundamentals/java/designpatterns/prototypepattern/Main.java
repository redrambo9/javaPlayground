package com.fundamentals.java.designpatterns.prototypepattern;

public class Main {

    public static void main(String[] args) {
        Employee employee = new Employee("XYZ", "DEPT");
        //creating clone of this obj
        //this way of cloning has two problems
        // 1. cannot set private members
        // 2. client has to know the whole employee structure and its members to clone
        Employee employeeClone = new Employee();
        employeeClone.name = employee.name;
        //employeeClone.dept = employee.dept;
        // To solve this problem prototype pattern is used.
        PrototypeEmployee prototypeEmployee = new PrototypeEmployee("ABC", "NEWDEPT");
        PrototypeEmployee prototypeEmployeeClone = (PrototypeEmployee) prototypeEmployee.getClone();
    }
}
