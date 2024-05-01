package se.predictly.support.employee.model.internal;

import lombok.Data;
import lombok.experimental.Accessors;

import java.time.LocalDate;

@Data
@Accessors(chain = true)
public class Salary {
    
    private int salary;
    private LocalDate from;
    private LocalDate to;

}
