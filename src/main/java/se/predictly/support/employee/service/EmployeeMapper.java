package se.predictly.support.employee.service;

import se.predictly.support.employee.persistence.model.Employee;
import se.predictly.support.employee.service.model.EmployeeVO;

public class EmployeeMapper {

    public static EmployeeVO map(Employee from) {
        return new EmployeeVO();
    }
}
