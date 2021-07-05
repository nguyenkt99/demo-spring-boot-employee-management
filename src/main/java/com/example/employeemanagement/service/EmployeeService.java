package com.example.employeemanagement.service;

import com.example.employeemanagement.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public Employee add(Employee employee);
    public List<Employee> getEmployees();
    public Employee getEmployee(Long id);
    public Employee updateEmployee(Employee employee);
    public void delete(Long id);
}
