package se.predictly.support.employee.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

import se.predictly.support.employee.error.ErrorCause;
import se.predictly.support.employee.error.ErrorCode;
import se.predictly.support.employee.exception.EmployeeNotFoundException;

@ControllerAdvice(assignableTypes = {EmployeeController.class})
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public class EmployeeControllerAdvice {
    
    @ExceptionHandler(EmployeeNotFoundException.class)
    public ResponseEntity<?> employeeNotFoundException(EmployeeNotFoundException e) {
        return notFound(ErrorCode.NOT_FOUND, "Employee with id " + e.getEmployeeId() + " wasn't found");
    }

    private ResponseEntity<ErrorCause> notFound(final ErrorCode errorCode, final String errorText) {
        ErrorCause errorCause = new ErrorCause().setErrorCode(errorCode).setErrorMsg(errorText);
        return new ResponseEntity<>(errorCause, HttpStatus.NOT_FOUND);
    }
}
