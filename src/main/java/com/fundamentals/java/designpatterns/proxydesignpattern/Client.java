package com.fundamentals.java.designpatterns.proxydesignpattern;

public class Client {
    public static void main(String[] args) {
        try {
            EmployeeDao employeeDao = new EmployeeDaoProxy();
            employeeDao.create("USER", new EmployeeDo());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
