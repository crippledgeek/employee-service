package se.predictly.support.employee.mapper;

public class EmployeeMapper {
    private EmployeeMapper() {
    }

    public static se.predictly.support.employee.model.internal.Employee map(Employee from) {
        return se.predictly.support.employee.model.internal.Employee
                .builder()
                .employeeId(from.getEmployeeId())
                .birthDate(from.getBirthDate())
                .firstName(from.getFirstName())
                .lastName(from.getLastName())
                .gender(GenderMapper.map(from.getGender()))
                .build();
    }
}
