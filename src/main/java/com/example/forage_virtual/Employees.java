package com.example.forage_virtual;

import com.example.forage_virtual.Entity.Employee;

import java.util.ArrayList;
import java.util.List;

public class Employees {
    private List<Employee> employee = new ArrayList<>();
    public List<Employee> getEmployee(){
        return employee;
    }
    public void setEmployee(List<Employee> employee){
        this.employee = employee;
    }
}
