package se.predictly.support.employee.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import se.predictly.support.employee.exception.EmployeeNotFoundException;
import se.predictly.support.employee.mapper.EmployeeMapper;
import se.predictly.support.employee.repositories.EmployeeRepository;

@Service
@Slf4j
public class ExternalEmployeeService implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    public ExternalEmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public se.predictly.support.employee.model.internal.Employee getEmployee(int employeeId) throws EmployeeNotFoundException {
        log.debug("getEmployee({}", employeeId);
        return employeeRepository
                .findById(employeeId)
                .map(EmployeeMapper::map)
                .orElseThrow(() -> new EmployeeNotFoundException(employeeId));
    }
    
    public se.predictly.support.employee.model.internal.Employee getCurrentDetailsOfEmployee(int employeeId) throws EmployeeNotFoundException {
        log.debug("getCurrentDetailsOfEmployee({})", employeeId);
        // TODO Auto-generated method stub
        return null;
    }
    
    public List<se.predictly.support.employee.model.internal.Employee> getEmployeesActiveInDepartment(int departmentId) {
        log.debug("getEmployeesActiveInDepartment({})", departmentId);
        return new ArrayList<>();
    }
    
    public List<se.predictly.support.employee.model.internal.Employee> getEmployeesInDepartmentAtDate(int departmentId, LocalDate date) {
        log.debug("getEmployeesInDepartmentAtDate({}, {})", departmentId, date);
        return new ArrayList<>();
    }
}
