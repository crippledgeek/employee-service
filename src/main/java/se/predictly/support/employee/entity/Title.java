package se.predictly.support.employee.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

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
