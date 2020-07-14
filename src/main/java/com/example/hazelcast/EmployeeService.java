package com.example.hazelcast;

import com.example.hazelcast.employee.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@CacheConfig(cacheNames = "employees")
public class EmployeeService {
    private static final Logger LOGGER= LoggerFactory.getLogger(EmployeeService.class.getName());

    @Cacheable()
    public List<Employee> getAllEmpService() {
        LOGGER.info(">>getAllEmpService()");
        List<Employee> employeeList = new ArrayList<>();
        employeeList = getEmployeesFromDB();
        LOGGER.info("<<getAllEmpService()");
        return employeeList;
    }

    @Cacheable(value = "employees", key = "#id")
    public Employee getEmpByID(String id) {
        LOGGER.info(">>getEmpByID()");
        Employee empByIDFromDB = getEmpByIDFromDB(id);
        LOGGER.info("<<getEmpByID()");
        return empByIDFromDB;
    }

    private Employee getEmpByIDFromDB(String id) {
        LOGGER.info(">>getEmpByIDFromDB()");
        Employee employee = new Employee("1", "testusaer ");
        LOGGER.info("<<getEmpByIDFromDB()");
        return  employee;
    }

    private List<Employee> getEmployeesFromDB() {
        LOGGER.info(">>getEmployeesFromDB()");
        List<Employee> employeeList = new ArrayList<>();
        for(int i =0; i <10; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Employee employee = new Employee("" + i, "testusaer " + i);
            employeeList.add(employee);

        }
        LOGGER.info("<<getEmployeesFromDB()");
        return employeeList;
    }
}
