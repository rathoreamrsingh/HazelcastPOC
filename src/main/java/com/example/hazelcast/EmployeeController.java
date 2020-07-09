package com.example.hazelcast;

import com.example.hazelcast.employee.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping(value = "/getAllEmpTeset1")
    public List<Employee> getAllEmployeeController() {
        List<Employee> employeeList;
        employeeList = employeeService.getAllEmpService();
        return employeeList;
    }

    @GetMapping(value = "/getAllEmpbyid/{id}")
    public Employee getAllEmployeeControllerByID(@PathVariable(value = "id") String id ) {
        Employee employeeList;
        employeeList = employeeService.getEmpByID(id);
        return employeeList;
    }
}
