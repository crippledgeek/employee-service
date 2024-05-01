package se.predictly.support.employee.entity;

import java.util.Date;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "titles")
@IdClass(TitleKey.class)
public class Title {

    @Id
    @Column(name = "emp_no")
    private int employeeId;
    
    @Id
    @Column(name = "title")
    private String title;
    
    @Id
    @Column(name = "from_date")
    private Date from;
    
    @Column(name = "todate")
    private Date to;
    
}
