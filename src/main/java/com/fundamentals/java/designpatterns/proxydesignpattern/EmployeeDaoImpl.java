package com.fundamentals.java.designpatterns.proxydesignpattern;

public class EmployeeDaoImpl implements EmployeeDao {
    @Override
    public void create(String client, EmployeeDo obj) throws Exception {
        //creates a new row
        System.out.println("New Row Created in Employee Table");
    }

    @Override
    public void delete(String client, int empId) throws Exception {
        //delete a row
        System.out.println("deleted row with empId:" + empId);
    }

    @Override
    public EmployeeDo get(String client, int empId) throws Exception {
        //fetch row
        System.out.println("fetching data from DB");
        return new EmployeeDo();
    }
}
