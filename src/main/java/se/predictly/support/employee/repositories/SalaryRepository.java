package se.predictly.support.employee.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SalaryRepository extends CrudRepository<Salary, SalaryKey> {

    public List<Salary> findByEmployeeId(int employeeId);
    
}
