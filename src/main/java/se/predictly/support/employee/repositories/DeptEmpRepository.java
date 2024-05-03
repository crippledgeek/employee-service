package se.predictly.support.employee.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import se.predictly.support.employee.entity.DeptEmp;
import se.predictly.support.employee.entity.DeptEmpId;
import se.predictly.support.employee.projections.CurrentDeptEmpProjection;

import java.util.List;

@Repository
public interface DeptEmpRepository extends JpaRepository<DeptEmp, DeptEmpId> {
    @Query("SELECT deptEmp.empNo as empNo, MAX(deptEmp.fromDate) as fromDate, MAX(deptEmp.toDate) as toDate " + "FROM DeptEmp deptEmp " + "GROUP BY deptEmp.empNo")
    List<CurrentDeptEmpProjection> findCurrentDeptEmployees();
}