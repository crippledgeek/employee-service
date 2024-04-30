package se.predictly.support.employee.persistence;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import se.predictly.support.employee.persistence.model.Title;
import se.predictly.support.employee.persistence.model.TitleKey;

@Repository
public interface TitleRepository extends CrudRepository<Title, TitleKey>{

    public List<Title> findByEmployeeIdAndFrom(int employeeId, Date from);
    
}
