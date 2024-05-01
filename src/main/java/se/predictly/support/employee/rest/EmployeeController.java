package se.predictly.support.employee.rest;

import org.springframework.web.bind.annotation.*;

import lombok.extern.slf4j.Slf4j;
import se.predictly.support.employee.model.internal.Employee;
import se.predictly.support.employee.service.ExternalEmployeeService;

@RestController
@RequestMapping(path = "/employee")
@Slf4j
public class EmployeeController {

    private final ExternalEmployeeService externalEmployeeService;

    public EmployeeController(ExternalEmployeeService externalEmployeeService) {
        this.externalEmployeeService = externalEmployeeService;
    }

    @GetMapping(path = "/{employeeId}")
    public Employee getEmployee(
            @PathVariable int employeeId,
            @RequestParam(required = false, defaultValue = "false") boolean detail) {
        log.debug("getEmployee({})", employeeId);
        if (detail) {
            return externalEmployeeService.getCurrentDetailsOfEmployee(employeeId);
        } else {
            return externalEmployeeService.getEmployee(employeeId);
        }
    }
}
