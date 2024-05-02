package se.predictly.support.employee.model.internal;

import lombok.Builder;

import java.time.LocalDate;
import java.util.List;

@Builder
public record Employee(
        int employeeId,
        LocalDate birthDate,
        String firstName,
        String lastName,
        Gender gender,
        LocalDate hireDate,
        List<Salary> salaries
){}