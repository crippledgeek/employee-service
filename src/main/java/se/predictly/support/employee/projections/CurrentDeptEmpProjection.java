package se.predictly.support.employee.projections;

import java.util.Date;

public interface CurrentDeptEmpProjection {
    Integer getEmpNo();
    String getDeptNo();
    Date getFromDate();
    Date getToDate();
}
