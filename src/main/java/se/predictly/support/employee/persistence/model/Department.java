package se.predictly.support.employee.persistence.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "departments")
@Data
public class Department {

    @Id
    @Column(name = "dept_no")
    private String departmentNumber;
    
    @Column(name = "dept_name")
    private String departmentName;
    
}
