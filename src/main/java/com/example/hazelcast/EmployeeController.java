package com.example.hazelcast;

import com.example.hazelcast.employee.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {
    private static final Logger LOGGER= LoggerFactory.getLogger(EmployeeController.class.getName());

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping(value = "/getAllEmpTeset1")
    public List<Employee> getAllEmployeeController() {
        LOGGER.info(">>getAllEmployeeController()");
        List<Employee> employeeList;
        employeeList = employeeService.getAllEmpService();
        LOGGER.info("<<getAllEmployeeController()");
        return employeeList;
    }

    @GetMapping(value = "/getAllEmpbyid/{id}")
    public Employee getAllEmployeeControllerByID(@PathVariable(value = "id") String id ) {
        LOGGER.info(">>getAllEmployeeControllerByID()");
        Employee employeeList;
        employeeList = employeeService.getEmpByID(id);
        LOGGER.info("<<getAllEmployeeControllerByID()");
        return employeeList;
    }
}
