package se.predictly.support.employee.entity;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class TitleKey implements Serializable {
    
    /**
     * 
     */
    private static final long serialVersionUID = -9205018124104188145L;
    private int employeeId;
    private String title;
    private Date from;

}
