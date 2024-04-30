package se.predictly.support.employee.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import lombok.extern.slf4j.Slf4j;
import se.predictly.support.employee.service.EmployeeService;
import se.predictly.support.employee.service.model.EmployeeVO;

@RestController
@RequestMapping(path = "/employee")
@Slf4j
public class EmployeeController {
    
    @Autowired
    private EmployeeService employeeService;

    @GetMapping(path = "/{employeeId}")
    public EmployeeVO getEmployee(
            @PathVariable(name = "employeeId") int employeeId,
            @RequestParam(required = false, defaultValue = "false") boolean detail) {
        log.debug("getEmployee({})", employeeId);
        if (detail) {
            return employeeService.getCurrentDetailsOfEmployee(employeeId);
        } else {
            return employeeService.getEmployee(employeeId);
        }
    }
}
