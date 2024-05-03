package se.predictly.support.employee.repositories;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;
import se.predictly.support.employee.entity.Salary;
import se.predictly.support.employee.entity.SalaryId;

import java.util.List;

@Repository
public interface SalaryRepository extends ListCrudRepository<Salary, SalaryId> {
  }