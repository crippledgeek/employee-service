package se.predictly.support.employee.mapper;

import se.predictly.support.employee.entity.Employee;

public class EmployeeMapper {
    private EmployeeMapper() {
    }

    public static se.predictly.support.employee.model.internal.Employee map(Employee from) {
        return se.predictly.support.employee.model.internal.Employee
                .builder()
                .employeeId(from.getId())
                .birthDate(from.getBirthDate())
                .firstName(from.getFirstName())
                .lastName(from.getLastName())
                .gender(GenderMapper.map(from.getGender()))
                .hireDate(from.getHireDate())
                .build();
    }
}
