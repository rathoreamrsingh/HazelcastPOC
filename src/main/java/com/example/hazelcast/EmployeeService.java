package com.example.hazelcast;

import com.example.hazelcast.employee.Employee;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@CacheConfig(cacheNames = "employees")
public class EmployeeService {
    @Cacheable()
    public List<Employee> getAllEmpService() {
        List<Employee> employeeList = new ArrayList<>();
        employeeList = getEmployeesFromDB();
        return employeeList;
    }

    @Cacheable(value = "employees", key = "#id")
    public Employee getEmpByID(String id) {
        return getEmpByIDFromDB(id);
    }

    private Employee getEmpByIDFromDB(String id) {
        Employee employee = new Employee("1", "testusaer ");
        return  employee;
    }

    private List<Employee> getEmployeesFromDB() {
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
        return employeeList;
    }
}
