package se.predictly.support.employee.error;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class ErrorCause {
    
    private ErrorCode errorCode;
    private String errorMsg;

}
