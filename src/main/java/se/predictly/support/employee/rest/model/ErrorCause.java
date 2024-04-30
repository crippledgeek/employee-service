package se.predictly.support.employee.rest.model;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class ErrorCause {
    
    private ErrorCode errorCode;
    private String errorMsg;

}
