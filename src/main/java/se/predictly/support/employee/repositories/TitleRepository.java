package se.predictly.support.employee.repositories;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;
import se.predictly.support.employee.entity.Title;
import se.predictly.support.employee.entity.TitleId;

import java.util.Date;
import java.util.List;

@Repository
public interface TitleRepository extends ListCrudRepository<Title, TitleId> {

}