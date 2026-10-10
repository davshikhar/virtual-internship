package com.example.forage_virtual;

import com.example.forage_virtual.Controller.EmployeeController;
import com.example.forage_virtual.Entity.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(EmployeeController.class)
@Import(SecurityConfig.class)
public class ControllerTest {

    @Autowired
    private MockMvc mvc;

    @MockitoBean
    private EmployeeManager emp;

    @Test
    void getEmployeeReturn()throws Exception{
        Employees e = new Employees();
        e.setEmployee(List.of(new Employee("E001","AR","Y","Y@GMAIL.COM","EMPLOYEE")));
        when(emp.getAllEmployees()).thenReturn(e);
        mvc.perform(get("/employees"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.employee[0].employeeId").value("E001"))
                .andExpect(jsonPath("$.employee[0].first_name").value("AR"));
    }
}
