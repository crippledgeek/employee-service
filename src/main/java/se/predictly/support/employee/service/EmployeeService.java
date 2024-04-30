package se.predictly.support.employee.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;
import se.predictly.support.employee.exception.EmployeeNotFoundException;
import se.predictly.support.employee.persistence.EmployeeRepository;
import se.predictly.support.employee.persistence.model.Employee;
import se.predictly.support.employee.service.model.EmployeeVO;

@Component
@Slf4j
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepo;

    public EmployeeVO getEmployee(int employeeId) throws EmployeeNotFoundException {
        log.debug("getEmployee({}", employeeId);
        Optional<Employee> employee = employeeRepo.findById(employeeId);
        if (employee.isPresent()) {
            return EmployeeMapper.map(employee.get());
        }
        return null;
    }
    
    public EmployeeVO getCurrentDetailsOfEmployee(int employeeId) throws EmployeeNotFoundException {
        log.debug("getCurrentDetailsOfEmployee({})", employeeId);
        // TODO Auto-generated method stub
        return null;
    }
    
    public List<EmployeeVO> getEmployeesActiveInDepartment(int departmentId) {
        log.debug("getEmployeesActiveInDepartment({})", departmentId);
        return new ArrayList<>();
    }
    
    public List<EmployeeVO> getEmployeesInDepartmentAtDate(int departmentId, LocalDate date) {
        log.debug("getEmployeesInDepartmentAtDate({}, {})", departmentId, date);
        return new ArrayList<>();
    }
}
