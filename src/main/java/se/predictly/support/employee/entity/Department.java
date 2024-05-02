package se.predictly.support.employee.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "departments", schema = "employees", uniqueConstraints = {@UniqueConstraint(name = "dept_name", columnNames = {"dept_name"})})
public class Department {
    @Id
    @Size(max = 4)
    @Column(name = "dept_no", nullable = false, length = 4)
    private String deptNo;

    @Size(max = 40)
    @NotNull
    @Column(name = "dept_name", nullable = false, length = 40)
    private String deptName;

}