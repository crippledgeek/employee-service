package se.predictly.support.employee.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface TitleRepository extends CrudRepository<Title, TitleKey>{

    public List<Title> findByEmployeeIdAndFrom(int employeeId, Date from);
    
}
