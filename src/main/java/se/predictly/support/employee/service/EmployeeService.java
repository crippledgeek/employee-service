package se.predictly.support.employee.service;

import se.predictly.support.employee.exception.EmployeeNotFoundException;
import se.predictly.support.employee.model.internal.Employee;

import java.time.LocalDate;
import java.util.List;

public interface EmployeeService {
    Employee getEmployee(int employeeId) throws EmployeeNotFoundException;
    Employee getCurrentDetailsOfEmployee(int employeeId) throws EmployeeNotFoundException;
    List<Employee> getEmployeesActiveInDepartment(int departmentId);
    List<Employee> getEmployeesInDepartmentAtDate(int departmentId, LocalDate date);

    }
