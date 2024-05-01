package se.predictly.support.employee.entity;

import java.time.LocalDate;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "employees")
public class Employee {
    
    @Id
    @Column(name = "emp_no")
    private int employeeId;

    @Column(name = "birth_date")
    private LocalDate birthDate;
    
    @Column(name = "first_name")
    private String firstName;
    
    @Column(name = "last_name")
    private String lastName;
    
    @Column(name = "gender")
    private String gender;

    @Column(name = "hire_date")
    private LocalDate hireDate;
}
