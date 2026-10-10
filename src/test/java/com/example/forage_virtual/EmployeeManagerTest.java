package com.example.forage_virtual;

import com.example.forage_virtual.Entity.Employee;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class EmployeeManagerTest {
    private final EmployeeManager emp = new EmployeeManager();
    @Test
    void testInitialEmployee(){
        assertThat(emp.getAllEmployees().getEmployee()).hasSize(4);
    }
    @Test
    void uniqueIds(){
        List<String> ids = emp.getAllEmployees().getEmployee().stream().map(Employee::getEmployeeId).toList();
        assertThat(ids).doesNotHaveDuplicates();
    }
}
