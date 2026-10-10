package com.example.forage_virtual;

import com.example.forage_virtual.Entity.Employee;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class EmployeeTest {

    @Test
    void hasEmptyList(){
        Employees emp = new Employees();
        assertThat(emp.getEmployee()).isEmpty();
    }
    @Test
    void setList(){
        Employees emp  = new Employees();
        List<Employee> e = new ArrayList<>();
        e.add(new Employee("E001","NEW","EMP","NEW@GMAIL.COM","EMPLOYEE"));
        emp.setEmployee(e);
        assertThat(emp.getEmployee()).hasSize(1);
        assertThat(emp.getEmployee().get(0).getEmployeeId()).isEqualTo("E001");
    }
}
