package se.predictly.support.employee.mapper;

import se.predictly.support.employee.entity.Employee;

public class EmployeeMapper {
    private EmployeeMapper() {}
    public static se.predictly.support.employee.model.internal.Employee map(Employee from) {
        return new se.predictly.support.employee.model.internal.Employee();
    }
}
