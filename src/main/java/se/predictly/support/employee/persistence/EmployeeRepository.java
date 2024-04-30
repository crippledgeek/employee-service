package se.predictly.support.employee.persistence;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import se.predictly.support.employee.persistence.model.Employee;

@Repository
public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Integer> {

}
