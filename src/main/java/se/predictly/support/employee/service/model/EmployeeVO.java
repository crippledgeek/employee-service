package se.predictly.support.employee.service.model;

import java.time.LocalDate;
import java.util.List;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class EmployeeVO {
    
    private int employeeId;
    private LocalDate birthDate;
    private String firstName;
    private String lastName;
    private GenderVO gender;
    private LocalDate hireDate;
    
    private List<SalaryVO> salaries;

}
