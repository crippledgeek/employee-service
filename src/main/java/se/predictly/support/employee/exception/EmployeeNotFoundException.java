package se.predictly.support.employee.exception;

public class EmployeeNotFoundException extends RuntimeException {

    /**
     * 
     */
    private static final long serialVersionUID = 200625138477021534L;
    
    private int employeeId;

    public EmployeeNotFoundException(int employeeId) {
        super();
        this.employeeId = employeeId;
    }

    public int getEmployeeId() {
        return employeeId;
    }
}
