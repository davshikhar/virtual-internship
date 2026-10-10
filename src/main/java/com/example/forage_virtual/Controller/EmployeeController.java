package com.example.forage_virtual.Controller;

import com.example.forage_virtual.EmployeeManager;
import com.example.forage_virtual.Employees;
import com.example.forage_virtual.Entity.Employee;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    private final EmployeeManager employeeManager;
    public EmployeeController(EmployeeManager employeeManager){
        this.employeeManager = employeeManager;
    }

    @GetMapping
    public ResponseEntity<?> getAllEmployee(){
        return ResponseEntity.status(200).body(employeeManager.getAllEmployees());
    }

    @PostMapping
    public ResponseEntity<?> addEmployee(@RequestBody Employee emp){
        Employees allEmployees = employeeManager.getAllEmployees();
        List<Employee> employee = allEmployees.getEmployee();
        employee.add(emp);
        return ResponseEntity.status(200).body(employee);
    }
}
