package se.predictly.support.employee.persistence;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import se.predictly.support.employee.persistence.model.Salary;
import se.predictly.support.employee.persistence.model.SalaryKey;

@Repository
public interface SalaryRepository extends CrudRepository<Salary, SalaryKey> {

    public List<Salary> findByEmployeeId(int employeeId);
    
}
