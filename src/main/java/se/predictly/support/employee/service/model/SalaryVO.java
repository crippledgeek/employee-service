package se.predictly.support.employee.service.model;

import java.time.LocalDate;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class SalaryVO {
    
    private int salary;
    private LocalDate from;
    private LocalDate to;

}
