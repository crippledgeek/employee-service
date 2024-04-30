package se.predictly.support.employee.persistence.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

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
