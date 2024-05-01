package se.predictly.support.employee.entity;

import java.util.Date;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "salaries")
@IdClass(SalaryKey.class)
@Data
public class Salary {
    
    @Id
    @Column(name = "emp_no")
    private int employeeId;
    
    @Column(name = "salary")
    private int salary;
    
    @Id
    @Column(name = "from_date")
    private Date from;
    
    @Column(name = "to_date")
    private Date to;

}
