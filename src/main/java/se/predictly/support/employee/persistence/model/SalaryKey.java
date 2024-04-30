package se.predictly.support.employee.persistence.model;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class SalaryKey implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = -1336312071071711074L;
    private int employeeId;
    private Date from;
    
}
