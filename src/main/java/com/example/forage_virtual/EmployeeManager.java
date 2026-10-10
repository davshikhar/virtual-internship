package com.example.forage_virtual;

import com.example.forage_virtual.Entity.Employee;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
public class EmployeeManager {
    private final Employees employees = new Employees();
    public EmployeeManager(){
        employees.getEmployee().add(new Employee("E001","Ram","Yadav","ram@gmail.com","employee"));
        employees.getEmployee().add(new Employee("E002","Rajiv","Baliyan","rajiv@gmail.com","employee"));
        employees.getEmployee().add(new Employee("E003","Roshan","Kashyap","roshan@gmail.com","employee"));
        employees.getEmployee().add(new Employee("E004","Rahul","Tripathi","rahul@gmail.com","employee"));
    }
    public Employees getAllEmployees(){
        return employees;
    }
}
